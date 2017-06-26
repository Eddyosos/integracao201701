package com.github.Eddyosos.integracao20171.esus.cds.atividadeindividual;

import br.gov.saude.esus.cds.transport.generated.thrift.atividadeindividual.FichaAtendimentoIndividualChildThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.atividadeindividual.FichaAtendimentoIndividualMasterThrift;
import com.github.Eddyosos.integracao20171.compactor.SerializadorThrift;
import com.github.Eddyosos.integracao20171.esus.cds.common.VariasLotacoesHeader;
import com.github.Eddyosos.integracao20171.esus.transport.DadoTransporte;
import com.github.eddyosos.e_sus_ab_factory.cds.atividadeindividual.IFichaAtendimentoIndividualChild;
import com.github.eddyosos.e_sus_ab_factory.cds.atividadeindividual.IFichaAtendimentoIndividualMaster;
import com.github.eddyosos.e_sus_ab_factory.cds.common.IVariasLotacoesHeader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FichaAtendimentoIndividualMaster implements IFichaAtendimentoIndividualMaster {
    private final FichaAtendimentoIndividualMasterThrift instancia;
    private long TIPO_DADO_SERIALIZADO_FICHA_PROCEDIMENTO = 4;
    private final static String EXTENSAO_EXPORT = ".esus13";
    private DadoTransporte dadoTransporteThrift;

    public FichaAtendimentoIndividualMaster() {
        instancia = new FichaAtendimentoIndividualMasterThrift();
    }

    @Override
    public void clear() {
        instancia.clear();
    }

    /**
     * Valida a instancia
     * @return true se válida
     *          false se inválida
     */
    @Override
    public boolean validates(){
        return validateHeaderTransport() && 
                validateAtendimentosIndividuais() &&
                validateUuidFicha() &&
                validateTpCdsOrigem();
        
    }
    
    /**
     * Valida HeaderTransport.
     * Para ser válida deve ter sido inserido préviamente.
     * @return true se válido
     *          false se inválido
     */
    @Override
    public boolean validateHeaderTransport(){
        return instancia.isSetHeaderTransport();
    }
    
    /**
     * Profissionais que realizaram o atendimento
     * @return 
     */
    @Override
    public IVariasLotacoesHeader getHeaderTransport() {
        return new VariasLotacoesHeader(instancia.getHeaderTransport());
    }

    /**
     * Profissionais que realizaram o atendimento
     * @param headerTransport 
     */
    @Override
    public void setHeaderTransport(IVariasLotacoesHeader headerTransport) {
        instancia.setHeaderTransport(headerTransport.getInstance());
    }

    /**
     * Valida AtendimentosIndividuais.
     * Para ser válido deve:
     * 1- Ter sido préviamente inserido
     * 2- Ter entre 1 e 13 atendimentos
     * @return true se válido
     *          false se inválido
     */
    @Override
    public boolean validateAtendimentosIndividuais(){
        int var = instancia.getAtendimentosIndividuaisSize();
        return instancia.isSetAtendimentosIndividuais() &&
                var >= 1 && var <= 13;
    }
    
    /**
     * Registro individualizado dos atendimentos.
     * @return 
     */
    @Override
    public List<IFichaAtendimentoIndividualChild> getAtendimentosIndividuais() {
        List<IFichaAtendimentoIndividualChild> list = new ArrayList<>();
        instancia.getAtendimentosIndividuaisIterator().forEachRemaining((t) -> {
            list.add(new FichaAtendimentoIndividualChild(t));
        });
        
        return list;
    }

    /**
     * Registro individualizado dos atendimentos.
     * @param atendimentosIndividuais 
     */
    @Override
    public void setAtendimentosIndividuais(List<IFichaAtendimentoIndividualChild> atendimentosIndividuais) {
        List<FichaAtendimentoIndividualChildThrift> list = new LinkedList<>();
        atendimentosIndividuais.iterator().forEachRemaining((t) -> {
            list.add(t.getInstance());
        });
        instancia.setAtendimentosIndividuais(list);
    }

    /**
     * Valida UuidFicha.
     * Para ser válido deve:
     * 1- Ter sido préviamente inserido
     * 2- Ter tamanho entre 36 e 44 (inclusivo)
     * @return true se válido
     *          false se inválido
     */
    @Override
    public boolean validateUuidFicha(){
        final String var = instancia.getUuidFicha();
        if(!instancia.isSetUuidFicha() || 
                var.length() < 36 || 
                var.length() > 44) 
            return false;
        try {
            UUID.fromString(var.substring(0, 36));
        } catch(Exception ex){
            return false;
        }
        return true;
    }
    
    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @return 
     */
    @Override
    public String getUuidFicha() {
        return instancia.getUuidFicha();
    }

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @param uuidFicha 
     */
    @Override
    public void setUuidFicha(String uuidFicha) {
        instancia.setUuidFicha(uuidFicha);
    }

    /**
     * Valida TpCdsOrigem.
     * Para ser valido deve ter sido inserido préviamente
     * @return true se válido
     *          false se inválido
     */
    @Override
    public boolean validateTpCdsOrigem(){
        return instancia.isSetTpCdsOrigem();
    }
    
    /**
     * Tipo de origem dos dados do registro.
     * @return 
     */
    @Override
    public int getTpCdsOrigem() {
        return instancia.getTpCdsOrigem();
    }

    /**
     * Tipo de origem dos dados do registro.
     * @param tpCdsOrigem 
     */
    @Override
    public void setTpCdsOrigem(int tpCdsOrigem) {
        instancia.setTpCdsOrigem(tpCdsOrigem);
    }
    public void setDadoTransporte(DadoTransporte originadora){
        this.dadoTransporteThrift = originadora;
    }
    public DadoTransporte getDadoTransporte(){
        return this.dadoTransporteThrift;
    }

    public void zipGenerate(){
        if(!this.validates() && this.dadoTransporteThrift != null){
            return;
        }

        byte[] fichaSerializada = SerializadorThrift.serializar(this.instancia);
        dadoTransporteThrift.setTipoDadoSerializado(TIPO_DADO_SERIALIZADO_FICHA_PROCEDIMENTO);
        dadoTransporteThrift.setDadoSerializado(fichaSerializada);

        try {
            File zipFile = new File(System.getProperty("user.home") + "/fichaProcedimento.zip");
            ZipOutputStream outputStream = new ZipOutputStream(new FileOutputStream(zipFile));
            String entryName = dadoTransporteThrift.getUuidDadoSerializado() + EXTENSAO_EXPORT;
            outputStream.putNextEntry(new ZipEntry(entryName));
            byte[] dadoTransporteSerializado = SerializadorThrift.serializar(dadoTransporteThrift.getInstance());
            outputStream.write(dadoTransporteSerializado);

            outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}

