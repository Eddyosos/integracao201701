package com.github.Eddyosos.integracao20171.esus.cds.procedimento;

import br.gov.saude.esus.cds.transport.generated.thrift.procedimento.FichaProcedimentoChildThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.procedimento.FichaProcedimentoMasterThrift;
import br.gov.saude.esus.transport.common.api.configuracaodestino.VersaoThrift;
import br.gov.saude.esus.transport.common.generated.thrift.DadoInstalacaoThrift;
import br.gov.saude.esus.transport.common.generated.thrift.DadoTransporteThrift;
import com.github.Eddyosos.integracao20171.compactor.SerializadorThrift;
import com.github.Eddyosos.integracao20171.esus.cds.common.UnicaLotacaoHeader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FichaProcedimentoMaster  {
    private FichaProcedimentoMasterThrift instancia = new FichaProcedimentoMasterThrift();
    private DadoInstalacaoThrift originadora = new DadoInstalacaoThrift();
    private DadoInstalacaoThrift remetente = new DadoInstalacaoThrift();
    private long TIPO_DADO_SERIALIZADO_FICHA_PROCEDIMENTO = 7;
    private final String EXTENSAO_EXPORT = ".esus";

    public FichaProcedimentoMasterThrift getInstance(){
        return this.instancia;
    }

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    public String getUuidFicha() {
        return instancia.getUuidFicha();
    }

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    public void setUuidFicha(String uuidFicha) {
        instancia.setUuidFicha(uuidFicha);
    }

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    public void unsetUuidFicha() {
        instancia.unsetUuidFicha();
    }

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    public boolean isSetUuidFicha() {
        return instancia.isSetUuidFicha();
    }

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    public void setUuidFichaIsSet(boolean value) {
        instancia.setUuidFichaIsSet(value);
    }

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    public int getTpCdsOrigem() {
        return instancia.getTpCdsOrigem();
    }

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    public void setTpCdsOrigem(int tpCdsOrigem) {
        instancia.setTpCdsOrigem(tpCdsOrigem);
    }

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    public void unsetTpCdsOrigem() {
        instancia.unsetTpCdsOrigem();
    }

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    public boolean isSetTpCdsOrigem() {
        return instancia.isSetTpCdsOrigem();
    }

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    public void setTpCdsOrigemIsSet(boolean value) {
        instancia.setTpCdsOrigemIsSet(value);
    }

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    public UnicaLotacaoHeader getHeaderTransport() {
        return new UnicaLotacaoHeader(instancia.getHeaderTransport());
    }

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    public void setHeaderTransport(UnicaLotacaoHeader headerTransport) {
        instancia.setHeaderTransport(headerTransport.getInstance());
    }

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    public void unsetHeaderTransport() {
        instancia.unsetHeaderTransport();
    }

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    public boolean isSetHeaderTransport() {
        return instancia.isSetHeaderTransport();
    }

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    public void setHeaderTransportIsSet(boolean value) {
        instancia.setHeaderTransportIsSet(value);
    }

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    public int getAtendProcedimentosSize() {
        return instancia.getAtendProcedimentosSize();
    }

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    public Iterator<FichaProcedimentoChild> getAtendProcedimentosIterator() {
        List<FichaProcedimentoChild> list = new LinkedList<>();
        instancia.getAtendProcedimentosIterator().forEachRemaining((item) -> {
            list.add(new FichaProcedimentoChild(item));
        });
        
        return list.iterator();
    }

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    public void addToAtendProcedimentos(FichaProcedimentoChild elem) {
        instancia.addToAtendProcedimentos(elem.getInstance());
    }

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    public List<FichaProcedimentoChild> getAtendProcedimentos() {
        List<FichaProcedimentoChild> list = new LinkedList<>();
        for(FichaProcedimentoChildThrift element : instancia.getAtendProcedimentos()){
            list.add(new FichaProcedimentoChild(element));
        }
        
        return list;
    }

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    public void setAtendProcedimentos(List<FichaProcedimentoChild> atendProcedimentos) {
        List<FichaProcedimentoChildThrift> list = new LinkedList<>();
        atendProcedimentos.forEach((elem) -> {
            list.add(elem.getInstance());
        });
        
        instancia.setAtendProcedimentos(list);
    }

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    public boolean isSetAtendProcedimentos() {
        return instancia.isSetAtendProcedimentos();
    }

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    public void setAtendProcedimentosIsSet(boolean value) {
        instancia.setAtendProcedimentosIsSet(value);
    }

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    public long getNumTotalAfericaoPa() {
        return instancia.getNumTotalAfericaoPa();
    }

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    public void setNumTotalAfericaoPa(long numTotalAfericaoPa) {
        instancia.setNumTotalAfericaoPa(numTotalAfericaoPa);
    }

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    public boolean isSetNumTotalAfericaoPa() {
        return instancia.isSetNumTotalAfericaoPa();
    }

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    public void setNumTotalAfericaoPaIsSet(boolean value) {
        instancia.setNumTotalAfericaoPaIsSet(value);
    }

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    public long getNumTotalGlicemiaCapilar() {
        return instancia.getNumTotalGlicemiaCapilar();
    }

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    public void setNumTotalGlicemiaCapilar(long numTotalGlicemiaCapilar) {
        instancia.setNumTotalGlicemiaCapilar(numTotalGlicemiaCapilar);
    }

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    public boolean isSetNumTotalGlicemiaCapilar() {
        return instancia.isSetNumTotalGlicemiaCapilar();
    }

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    public void setNumTotalGlicemiaCapilarIsSet(boolean value) {
        instancia.setNumTotalGlicemiaCapilarIsSet(value);
    }

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    public long getNumTotalAfericaoTemperatura() {
        return instancia.getNumTotalAfericaoTemperatura();
    }

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    public void setNumTotalAfericaoTemperatura(long numTotalAfericaoTemperatura) {
        instancia.setNumTotalAfericaoTemperatura(numTotalAfericaoTemperatura);
    }

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    public boolean isSetNumTotalAfericaoTemperatura() {
        return instancia.isSetNumTotalAfericaoTemperatura();
    }

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    public void setNumTotalAfericaoTemperaturaIsSet(boolean value) {
        instancia.setNumTotalAfericaoTemperaturaIsSet(value);
    }

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    public long getNumTotalMedicaoAltura() {
        return instancia.getNumTotalMedicaoAltura();
    }

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    public void setNumTotalMedicaoAltura(long numTotalMedicaoAltura) {
        instancia.setNumTotalMedicaoAltura(numTotalMedicaoAltura);
    }

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    public boolean isSetNumTotalMedicaoAltura() {
        return instancia.isSetNumTotalMedicaoAltura();
    }

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    public void setNumTotalMedicaoAlturaIsSet(boolean value) {
        instancia.setNumTotalMedicaoAlturaIsSet(value);
    }

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    public long getNumTotalCurativoSimples() {
        return instancia.getNumTotalCurativoSimples();
    }

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    public void setNumTotalCurativoSimples(long numTotalCurativoSimples) {
        instancia.setNumTotalCurativoSimples(numTotalCurativoSimples);
    }

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    public boolean isSetNumTotalCurativoSimples() {
        return instancia.isSetNumTotalCurativoSimples();
    }

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    public void setNumTotalCurativoSimplesIsSet(boolean value) {
        instancia.setNumTotalCurativoSimplesIsSet(value);
    }

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    public long getNumTotalMedicaoPeso() {
        return instancia.getNumTotalMedicaoPeso();
    }

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    public void setNumTotalMedicaoPeso(long numTotalMedicaoPeso) {
        instancia.setNumTotalMedicaoPeso(numTotalMedicaoPeso);
    }
    
    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    public boolean isSetNumTotalMedicaoPeso() {
        return instancia.isSetNumTotalMedicaoPeso();
    }

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    public void setNumTotalMedicaoPesoIsSet(boolean value) {
        instancia.setNumTotalMedicaoPesoIsSet(value);
    }

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    public long getNumTotalColetaMaterialParaExameLaboratorial() {
        return instancia.getNumTotalColetaMaterialParaExameLaboratorial();
    }

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    public void setNumTotalColetaMaterialParaExameLaboratorial(long numTotalColetaMaterialParaExameLaboratorial) {
        instancia.setNumTotalColetaMaterialParaExameLaboratorial(numTotalColetaMaterialParaExameLaboratorial);
    }

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    public boolean isSetNumTotalColetaMaterialParaExameLaboratorial() {
        return instancia.isSetNumTotalColetaMaterialParaExameLaboratorial();
    }

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    public void setNumTotalColetaMaterialParaExameLaboratorialIsSet(boolean value) {
        instancia.setNumTotalColetaMaterialParaExameLaboratorialIsSet(value);
    }
    
    public void zipGenerate(){
        if(!this.validate()){
            return;
        }
        
        DadoTransporteThrift dadoTransporteThrift = this.getDadoTransporte(this.instancia);
        byte[] fichaSerializada = SerializadorThrift.serializar(this.instancia);
        dadoTransporteThrift.setTipoDadoSerializado(TIPO_DADO_SERIALIZADO_FICHA_PROCEDIMENTO);
	dadoTransporteThrift.setDadoSerializado(fichaSerializada);
        
        VersaoThrift versaoThrift = new VersaoThrift(2, 0, 0);
	dadoTransporteThrift.setVersao(versaoThrift);
        
        try {
            File zipFile = new File(System.getProperty("user.home") + "/fichaProcedimento.zip");
            ZipOutputStream outputStream = new ZipOutputStream(new FileOutputStream(zipFile));
            String entryName = dadoTransporteThrift.getUuidDadoSerializado() + EXTENSAO_EXPORT;
            outputStream.putNextEntry(new ZipEntry(entryName));
            byte[] dadoTransporteSerializado = SerializadorThrift.serializar(dadoTransporteThrift);
            outputStream.write(dadoTransporteSerializado);

            outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
    
    private DadoTransporteThrift getDadoTransporte(FichaProcedimentoMasterThrift ficha) {
        DadoTransporteThrift dadoTransporteThrift = new DadoTransporteThrift();

        dadoTransporteThrift.setUuidDadoSerializado(ficha.getUuidFicha());
        dadoTransporteThrift.setIneDadoSerializado(ficha.getHeaderTransport().getIne());
        dadoTransporteThrift.setCodIbge(ficha.getHeaderTransport().getCodigoIbgeMunicipio());
        dadoTransporteThrift.setCnesDadoSerializado(ficha.getHeaderTransport().getCnes());
        dadoTransporteThrift.setOriginadora(this.originadora);
        dadoTransporteThrift.setRemetente(this.remetente);
        dadoTransporteThrift.setNumLote(0l);

        return dadoTransporteThrift;
    }
    
    /**
     * Valida todos os campos.
     * @return True caso valido, false caso esteja inconsistente
     */
    public boolean validate(){
        return this.validateGroup()             &&
               this.validateUuidFicha()         &&
               this.validateTpCdsOrigem()       &&
               this.validateHeaderTransport()   &&
               this.validateGroup();
    }
    
    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * Obrigatório!
     * Regras: É recomendado concatenar o CNES na frente do UUID, de modo que os
     * 7 digitos (CNES) + 1 de hífen somados aos 36 (32 caracteres + 4 hífen) do
     * UUID são a limitação de 44 bytes do campo.
     * @return True caso valido, false caso esteja inconsistente
     */
    public boolean validateUuidFicha(){
        if(!this.instancia.isSetUuidFicha()){
            return false;
        }
        
        if(this.instancia.getUuidFicha() == null){
            return false;
        }
        
        if(this.instancia.getUuidFicha().length() < 36 || this.getUuidFicha().length() > 44){
            return false;
        }
    
        return true;
    }
    
    /**
     * Tipo de origem dos dados do registro.
     * Obrigatório!
     * Regras: Utilizar valor 3 (sistemas terceiros).
     * @return True caso valido, false caso esteja inconsistente
     */
    public boolean validateTpCdsOrigem(){
        if(!this.instancia.isSetTpCdsOrigem()){
            return false;
        }
        
        if(this.instancia.getTpCdsOrigem() != 3){
            return false;
        }
    
        return true;
    }
    
    /**
     * Profissional que realizou os procedimentos.
     * Obrigatório!
     * Regras: Utilizar valor 3 (sistemas terceiros).
     * @return True caso valido, false caso esteja inconsistente
     */
    public boolean validateHeaderTransport(){
        if(!instancia.isSetHeaderTransport()){
            return false;
        }
        
        if(instancia.getHeaderTransport() != null){
            return false;
        }
        
        if(!new UnicaLotacaoHeader(instancia.getHeaderTransport()).validates()){
            return false;
        }
        
        return true;
    }
    
    /**
     * Registro dos procedimentos realizados.
     * Regras: Utilizar valor 3 (sistemas terceiros).
     * @return True caso valido, false caso esteja inconsistente
     */
    public boolean validateAtendProcedimentos(){
        if(!this.instancia.isSetAtendProcedimentos()){
            return false;
        }
        
        if(this.instancia.getAtendProcedimentos() == null){
            return false;
        }
        
        if(this.instancia.getAtendProcedimentos().size() < 1 || this.instancia.getAtendProcedimentos().size() > 23){
            return false;
        }
    
        return true;
    }
    
    /**
     * Quantidade de aferições de pressão realizadas.
     * @return True caso valido, false caso esteja inconsistente
     */
    public boolean validateNumTotalAfericaoPa(){
        if(!this.instancia.isSetNumTotalAfericaoPa()){
            return false;
        }
        
        if(this.instancia.getNumTotalAfericaoPa() < 0 || this.instancia.getNumTotalAfericaoPa() > 3){
            return false;
        }
    
        return true;
    }
    
    /**
     * Quantidade de aferições de glicemia capilar.
     * @return True caso valido, false caso esteja inconsistente
     */
    public boolean validateNumTotalGlicemiaCapilar(){
        if(!this.instancia.isSetNumTotalGlicemiaCapilar()){
            return false;
        }
        
        if(this.instancia.getNumTotalGlicemiaCapilar() < 0 || this.instancia.getNumTotalGlicemiaCapilar() > 3){
            return false;
        }
    
        return true;
    }
    
    /**
     * Quantidade de aferições de glicemia capilar.
     * @return True caso valido, false caso esteja inconsistente
     */
    public boolean validateNumTotalAfericaoTemperatura(){
        if(!this.instancia.isSetNumTotalAfericaoTemperatura()){
            return false;
        }
        
        if(this.instancia.getNumTotalAfericaoTemperatura() < 0 || this.instancia.getNumTotalAfericaoTemperatura() > 3){
            return false;
        }
    
        return true;
    }
    
    /**
     * Quantidade de aferições de altura.
     * @return True caso valido, false caso esteja inconsistente
     */
    public boolean validateNumTotalMedicaoAltura(){
        if(!this.instancia.isSetNumTotalMedicaoAltura()){
            return false;
        }
        
        if(this.instancia.getNumTotalMedicaoAltura() < 0 || this.instancia.getNumTotalMedicaoAltura() > 3){
            return false;
        }
    
        return true;
    }
    
    /**
     * Quantidade de curativos simples realizados.
     * @return True caso valido, false caso esteja inconsistente
     */
    public boolean validateNumTotalCurativoSimples(){
        if(!this.instancia.isSetNumTotalCurativoSimples()){
            return false;
        }
        
        if(this.instancia.getNumTotalCurativoSimples() < 0 || this.instancia.getNumTotalCurativoSimples() > 3){
            return false;
        }
    
        return true;
    }
    
    /**
     * Quantidade de aferições de peso.
     * @return True caso valido, false caso esteja inconsistente
     */
    public boolean validateNumTotalMedicaoPeso(){
        if(!this.instancia.isSetNumTotalMedicaoPeso()){
            return false;
        }
        
        if(this.instancia.getNumTotalMedicaoPeso() < 0 || this.instancia.getNumTotalMedicaoPeso() > 3){
            return false;
        }
    
        return true;
    }
    
    /**
     * Quantidade de aferições de peso.
     * @return True caso valido, false caso esteja inconsistente
     */
    public boolean validateNumTotalColetaMaterialParaExameLaboratorial(){
        if(!this.instancia.isSetNumTotalColetaMaterialParaExameLaboratorial()){
            return false;
        }
        
        if(this.instancia.getNumTotalColetaMaterialParaExameLaboratorial() < 0 || this.instancia.getNumTotalColetaMaterialParaExameLaboratorial() > 3){
            return false;
        }
    
        return true;
    }
    
    /**
     * Valida os campos com preenchimento condicional.
     * @return True caso ao menos um dos campos esteja válido, false caso todos estejam inválidos
     */
    public boolean validateGroup(){
        return this.validateAtendProcedimentos()            || 
               this.validateNumTotalMedicaoPeso()           ||
               this.validateNumTotalCurativoSimples()       ||
               this.validateNumTotalMedicaoPeso()           ||
               this.validateNumTotalCurativoSimples()       ||
               this.validateNumTotalMedicaoAltura()         ||
               this.validateNumTotalAfericaoTemperatura()   ||
               this.validateNumTotalGlicemiaCapilar()       ||
               this.validateNumTotalAfericaoPa()            ||
               this.validateAtendProcedimentos();
    }
}
