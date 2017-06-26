package com.github.Eddyosos.integracao20171.esus.cds.cadastroindividual;

import br.gov.saude.esus.cds.transport.generated.thrift.cadastroindividual.CadastroIndividualThrift;
import com.github.Eddyosos.integracao20171.compactor.SerializadorThrift;
import com.github.Eddyosos.integracao20171.esus.cds.common.HeaderCdsCadastro;
import com.github.Eddyosos.integracao20171.esus.transport.DadoTransporte;
import com.github.eddyosos.e_sus_ab_factory.cds.cadastroindividual.ICadastroIndividual;
import com.github.eddyosos.e_sus_ab_factory.cds.cadastroindividual.ICondicoesDeSaude;
import com.github.eddyosos.e_sus_ab_factory.cds.cadastroindividual.IEmSituacaoDeRua;
import com.github.eddyosos.e_sus_ab_factory.cds.cadastroindividual.IIdentificacaoUsuarioCidadao;
import com.github.eddyosos.e_sus_ab_factory.cds.cadastroindividual.IInformacoesSocioDemograficas;
import com.github.eddyosos.e_sus_ab_factory.cds.common.IHeaderCdsCadastro;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CadastroIndividual implements ICadastroIndividual {
    private CadastroIndividualThrift instancia;
    private long TIPO_DADO_SERIALIZADO_FICHA_PROCEDIMENTO = 2;
    private final static String EXTENSAO_EXPORT = ".esus13";
    private DadoTransporte dadoTransporteThrift;
    
    public CadastroIndividual(){
        instancia = new CadastroIndividualThrift();
    }

    /**
     * Formulário referente as condições de saúde do cidadão.
     * @return 
     */
    @Override
    public ICondicoesDeSaude getCondicoesDeSaude() {
        return new CondicoesDeSaude(instancia.getCondicoesDeSaude());
    }

    /**
     * Formulário referente as condições de saúde do cidadão.
     * @param condicoesDeSaude 
     */
    @Override
    public void setCondicoesDeSaude(ICondicoesDeSaude condicoesDeSaude) {
        instancia.setCondicoesDeSaude(condicoesDeSaude.getInstance());
    }

    /**
     * Dados referentes ao profissional e a data do cadastro.
     * @return 
     */
    @Override
    public IHeaderCdsCadastro getDadosGerais() {
        return new HeaderCdsCadastro(instancia.getDadosGerais());
    }

    /**
     * Dados referentes ao profissional e a data do cadastro.
     * @param dadosGerais 
     */
    @Override
    public void setDadosGerais(IHeaderCdsCadastro dadosGerais) {
        instancia.setDadosGerais(dadosGerais.getInstance());
    }

    /**
     * Formulário referente a informações de situação de rua (se o cidadão se encontrar nessa situação).
     * @return 
     */
    @Override
    public IEmSituacaoDeRua getEmSituacaoDeRua() {
        return new EmSituacaoDeRua(instancia.getEmSituacaoDeRua());
    }

    /**
     * Formulário referente a informações de situação de rua (se o cidadão se encontrar nessa situação).
     * @param emSituacaoDeRua 
     */
    @Override
    public void setEmSituacaoDeRua(IEmSituacaoDeRua emSituacaoDeRua) {
        instancia.setEmSituacaoDeRua(emSituacaoDeRua.getInstance());
    }

    /**
     * Marcador que indica se a ficha é uma atualização.
     * @return 
     */
    @Override
    public boolean isFichaAtualizada() {
        return instancia.isFichaAtualizada();
    }

    /**
     * Marcador que indica se a ficha é uma atualização.
     * @param fichaAtualizada 
     */
    @Override
    public void setFichaAtualizada(boolean fichaAtualizada) {
        instancia.setFichaAtualizada(fichaAtualizada);
    }

    /**
     * Dados que identificam o cidadão.
     * @return 
     */
    @Override
    public IIdentificacaoUsuarioCidadao getIdentificacaoUsuarioCidadao() {
        return new IdentificacaoUsuarioCidadao(instancia.getIdentificacaoUsuarioCidadao());
    }

    /**
     * Dados que identificam o cidadão.
     * @param identificacaoUsuarioCidadao 
     */
    @Override
    public void setIdentificacaoUsuarioCidadao(IIdentificacaoUsuarioCidadao identificacaoUsuarioCidadao) {
        instancia.setIdentificacaoUsuarioCidadao(identificacaoUsuarioCidadao.getInstance());
    }
    
    /**
     * Informações sócio-demográficas fornecidas pelo cidadão.
     * @return 
     */
    @Override
    public IInformacoesSocioDemograficas getInformacoesSocioDemograficas() {
        return new InformacoesSocioDemograficas(instancia.getInformacoesSocioDemograficas());
    }

    /**
     * Informações sócio-demográficas fornecidas pelo cidadão.
     * @param informacoesSocioDemograficas 
     */
    @Override
    public void setInformacoesSocioDemograficas(IInformacoesSocioDemograficas informacoesSocioDemograficas) {
        instancia.setInformacoesSocioDemograficas(informacoesSocioDemograficas.getIntence());
    }

    /**
     * Marcador que indica se o termo de recusa foi assinalado.
     * @return 
     */
    @Override
    public boolean isStatusTermoRecusaCadastroIndividualAtencaoBasica() {
        return instancia.isStatusTermoRecusaCadastroIndividualAtencaoBasica();
    }
    
    /**
     * Marcador que indica se o termo de recusa foi assinalado.
     * @param statusTermoRecusaCadastroIndividualAtencaoBasica 
     */
    @Override
    public void setStatusTermoRecusaCadastroIndividualAtencaoBasica(boolean statusTermoRecusaCadastroIndividualAtencaoBasica) {
        instancia.setStatusTermoRecusaCadastroIndividualAtencaoBasica(statusTermoRecusaCadastroIndividualAtencaoBasica);
    }

    /**
     * Tipo de origem dos dados do registro.
     * @param tpCdsOrigem 
     */
    @Override
    public void setTpCdsOrigem(int tpCdsOrigem) {
        instancia.setTpCdsOrigem(tpCdsOrigem);
    }

    /**
     * Tipo de origem dos dados do registro.
     */
    @Override
    public void unsetTpCdsOrigem() {
        instancia.unsetTpCdsOrigem();
    }

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @return 
     */
    @Override
    public String getUuid() {
        return instancia.getUuid();
    }

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @param uuid 
     */
    @Override
    public void setUuid(String uuid) {
        instancia.setUuid(uuid);
    }

    /**
     * Código UUID para identificar a ficha que deu origem ao cadastro do registro.
     * @return 
     */
    @Override
    public String getUuidFichaOriginadora() {
        return instancia.getUuidFichaOriginadora();
    }

    /**
     * Código UUID para identificar a ficha que deu origem ao cadastro do registro.
     * @param uuidFichaOriginadora 
     */
    @Override
    public void setUuidFichaOriginadora(String uuidFichaOriginadora) {
        instancia.setUuidFichaOriginadora(uuidFichaOriginadora);
    }

    @Override
    public String getUuidCidadao() {
        return instancia.getUuidCidadao();
    }

    @Override
    public void setUuidCidadao(String uuidCidadao) {
        instancia.setUuidCidadao(uuidCidadao);
    }

    /**
     * Valida a instancia
     * @return true se válido
     *          false se inválido
     */
    @Override
    public boolean validate() {
        return validateCondicoesDeSaude() &&
                validateDadosGerais() &&
                validateEmSituacaoDeRua() &&
                validateFichaAtualizada() &&
                validateIndetificacaoUsuarioCidadao() &&
                validateInformacoesSocioDemografica() &&
                validateTpCdsOrigem() && 
                validateUuid() &&
                validateUuidFichaOriginadora();
    }
    
    /**
     * Valida o campo condições de saúde.
     * Para ser válido deve, caso inserido:
     * 1- Regras: Não deve ser preenchido se o campo statusTermoRecusaCadastroIndividualAtencaoBasica = true.
     * @return true se for válido
     * @return false se for inválido
     */
    @Override
    public boolean validateCondicoesDeSaude() {
    	return !instancia.isSetCondicoesDeSaude() || 
               !instancia.isSetStatusTermoRecusaCadastroIndividualAtencaoBasica() ||
               !instancia.isStatusTermoRecusaCadastroIndividualAtencaoBasica();
    }
    
    /**
     * Valida DadosGerais
     * Para ser válido deve ter sido inserido préviamente
     * @return true se válido
     *          false se inválido
     */
    @Override
    public boolean validateDadosGerais(){
        return instancia.isSetDadosGerais();
    }
    
    /**
     * Valida o campo emSituacaoDeRua
     * @return true se for válido
     * @return false se for inválido
     */
    @Override
    public boolean validateEmSituacaoDeRua() {
        return !instancia.isSetEmSituacaoDeRua() ||
                !instancia.isSetStatusTermoRecusaCadastroIndividualAtencaoBasica() ||
                !instancia.isStatusTermoRecusaCadastroIndividualAtencaoBasica();
    }
    
    /**
     * Valida se a ficha foi atualizada
     * @return true se for válido
     * @return false se for inválido
     */
    @Override
    public boolean validateFichaAtualizada() {
    	return instancia.isSetFichaAtualizada();
    }
    
    /**
     * Valida o campo indentificacaoUsuarioCidadao
     * @return true se for válido
     *          false se for inválido
     */
    @Override
    public boolean validateIndetificacaoUsuarioCidadao() {
        return !instancia.isSetIdentificacaoUsuarioCidadao() ||
                !instancia.isSetStatusTermoRecusaCadastroIndividualAtencaoBasica() ||
                !instancia.isStatusTermoRecusaCadastroIndividualAtencaoBasica();
    }
    
    /**
     * Valida o campo informacoesSocioDemografica
     * @return true se for válido
     * @return false se for inválido
     */
    @Override
    public boolean validateInformacoesSocioDemografica() {
        return !instancia.isSetInformacoesSocioDemograficas() ||
                !instancia.isSetStatusTermoRecusaCadastroIndividualAtencaoBasica() ||
                !instancia.isStatusTermoRecusaCadastroIndividualAtencaoBasica();
    }
    
    //Não á validações para o statusTermoRecusaCadastroIndividualAtencaoBasica
    
    /**
     * Valida o tipo de origem do cadastro de registro
     * @return true se for válido
     * @return false se for inválido
     */
    @Override
    public boolean validateTpCdsOrigem() {
    	return instancia.isSetTpCdsOrigem();
    }
    
    /**
     * Valida o uuid
     * @return true se for válido
     * @return false se for inválido
     */
    @Override
    public boolean validateUuid(){
        return !instancia.isSetUuid() || 
                validateUuid(instancia.getUuid());
    }
    
    @Override
    public boolean validateUuid(String var) {
        if(var.length() < 36 || var.length() > 44) return false;
        try{
            UUID.fromString(var.substring(0,36));
        } catch (Exception ex) {
            return false;
        }
        return true;
    }
    
    /**
     * Valida o uuid da ficha originadora
     * @return true se for válido
     * @return false se for inválido
     */
    @Override
    public boolean validateUuidFichaOriginadora() {
    	return instancia.isSetUuidFichaOriginadora() && 
                validateUuid(instancia.getUuidFichaOriginadora());
    }
    
    /**
     * Valida o saidaCidadaoCadastro
     * @return true se for válido
     * @return false se for inválido
     */
    @Override
    public boolean validateSaidaCidadaoCadastro() {
    	return true; //TODO Nao encontrei a SaidaCidadaoCadastro
    }
    
    /**
     * Valida o header
     * @return true se for válido
     * @return false se for inválido
     */
    @Override
    public boolean validateHeaderTransport() {
    	return true; //TODO Não encontrei nem a headerTransport nem a UnicaLotacaoHeader
    }
    
    /**
     * necessário para gerar o zip
     * @param dadoTransporteThrift 
     */
    public void setDadoTransporte(DadoTransporte dadoTransporteThrift){
        this.dadoTransporteThrift = dadoTransporteThrift;
    }
    public DadoTransporte getDadoTransporte(){
        return this.dadoTransporteThrift;
    }

    /**
     * Gera o arquivo zip
     */
    public void zipGenerate(){
        if(!this.validate() && this.dadoTransporteThrift != null){
            return;
        }

        byte[] fichaSerializada = SerializadorThrift.serializar(this.instancia);
        dadoTransporteThrift.setTipoDadoSerializado(TIPO_DADO_SERIALIZADO_FICHA_PROCEDIMENTO);
        dadoTransporteThrift.setDadoSerializado(fichaSerializada);

        try {
            File zipFile = new File(System.getProperty("user.home") + "/fichaCadastroIndividual.zip");
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

