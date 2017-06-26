package com.github.Eddyosos.integracao20171.esus.cds.procedimento;

import br.gov.saude.esus.cds.transport.generated.thrift.procedimento.FichaProcedimentoChildThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.procedimento.FichaProcedimentoMasterThrift;
import com.github.Eddyosos.integracao20171.compactor.SerializadorThrift;
import com.github.Eddyosos.integracao20171.esus.cds.common.UnicaLotacaoHeader;
import com.github.Eddyosos.integracao20171.esus.transport.DadoTransporte;
import com.github.eddyosos.e_sus_ab_factory.cds.common.IUnicaLotacaoHeader;
import com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.procedimento.IFichaProcedimentoChild;
import com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.procedimento.IFichaProcedimentoMaster;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FichaProcedimentoMaster implements IFichaProcedimentoMaster  {
    
    private FichaProcedimentoMasterThrift instancia;
    private long TIPO_DADO_SERIALIZADO_FICHA_PROCEDIMENTO = 7;
    private final static String EXTENSAO_EXPORT = ".esus13";
    private DadoTransporte dadoTransporteThrift;  
    
    public FichaProcedimentoMaster(){
        instancia = new FichaProcedimentoMasterThrift();
    }

    @Override
    public FichaProcedimentoMasterThrift getInstance(){
        return this.instancia;
    }

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    @Override
    public String getUuidFicha() {
        return instancia.getUuidFicha();
    }

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    @Override
    public void setUuidFicha(String uuidFicha) {
        instancia.setUuidFicha(uuidFicha);
    }

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    @Override
    public void unsetUuidFicha() {
        instancia.unsetUuidFicha();
    }

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    @Override
    public boolean isSetUuidFicha() {
        return instancia.isSetUuidFicha();
    }

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    @Override
    public void setUuidFichaIsSet(boolean value) {
        instancia.setUuidFichaIsSet(value);
    }

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    @Override
    public int getTpCdsOrigem() {
        return instancia.getTpCdsOrigem();
    }

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    @Override
    public void setTpCdsOrigem(int tpCdsOrigem) {
        instancia.setTpCdsOrigem(tpCdsOrigem);
    }

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    @Override
    public void unsetTpCdsOrigem() {
        instancia.unsetTpCdsOrigem();
    }

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    @Override
    public boolean isSetTpCdsOrigem() {
        return instancia.isSetTpCdsOrigem();
    }

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    @Override
    public void setTpCdsOrigemIsSet(boolean value) {
        instancia.setTpCdsOrigemIsSet(value);
    }

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    @Override
    public IUnicaLotacaoHeader getHeaderTransport() {
        return new UnicaLotacaoHeader(instancia.getHeaderTransport());
    }

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    @Override
    public void setHeaderTransport(IUnicaLotacaoHeader headerTransport) {
        instancia.setHeaderTransport(headerTransport.getInstance());
    }

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    @Override
    public void unsetHeaderTransport() {
        instancia.unsetHeaderTransport();
    }

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    @Override
    public boolean isSetHeaderTransport() {
        return instancia.isSetHeaderTransport();
    }

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    @Override
    public void setHeaderTransportIsSet(boolean value) {
        instancia.setHeaderTransportIsSet(value);
    }

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    @Override
    public int getAtendProcedimentosSize() {
        return instancia.getAtendProcedimentosSize();
    }

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    @Override
    public Iterator<IFichaProcedimentoChild> getAtendProcedimentosIterator() {
        List<IFichaProcedimentoChild> list = new LinkedList<>();
        instancia.getAtendProcedimentosIterator().forEachRemaining((item) -> {
            list.add(new FichaProcedimentoChild(item));
        });
        
        return list.iterator();
    }

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    @Override
    public void addToAtendProcedimentos(IFichaProcedimentoChild elem) {
        instancia.addToAtendProcedimentos(elem.getInstance());
    }

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    @Override
    public List<IFichaProcedimentoChild> getAtendProcedimentos() {
        List<IFichaProcedimentoChild> list = new LinkedList<>();
        for(FichaProcedimentoChildThrift element : instancia.getAtendProcedimentos()){
            list.add(new FichaProcedimentoChild(element));
        }
        
        return list;
    }

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    @Override
    public void setAtendProcedimentos(List<IFichaProcedimentoChild> atendProcedimentos) {
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
    @Override
    public boolean isSetAtendProcedimentos() {
        return instancia.isSetAtendProcedimentos();
    }

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    @Override
    public void setAtendProcedimentosIsSet(boolean value) {
        instancia.setAtendProcedimentosIsSet(value);
    }

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    @Override
    public long getNumTotalAfericaoPa() {
        return instancia.getNumTotalAfericaoPa();
    }

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    @Override
    public void setNumTotalAfericaoPa(long numTotalAfericaoPa) {
        instancia.setNumTotalAfericaoPa(numTotalAfericaoPa);
    }

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    @Override
    public boolean isSetNumTotalAfericaoPa() {
        return instancia.isSetNumTotalAfericaoPa();
    }

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    @Override
    public void setNumTotalAfericaoPaIsSet(boolean value) {
        instancia.setNumTotalAfericaoPaIsSet(value);
    }

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    @Override
    public long getNumTotalGlicemiaCapilar() {
        return instancia.getNumTotalGlicemiaCapilar();
    }

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    @Override
    public void setNumTotalGlicemiaCapilar(long numTotalGlicemiaCapilar) {
        instancia.setNumTotalGlicemiaCapilar(numTotalGlicemiaCapilar);
    }

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    @Override
    public boolean isSetNumTotalGlicemiaCapilar() {
        return instancia.isSetNumTotalGlicemiaCapilar();
    }

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    @Override
    public void setNumTotalGlicemiaCapilarIsSet(boolean value) {
        instancia.setNumTotalGlicemiaCapilarIsSet(value);
    }

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    @Override
    public long getNumTotalAfericaoTemperatura() {
        return instancia.getNumTotalAfericaoTemperatura();
    }

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    @Override
    public void setNumTotalAfericaoTemperatura(long numTotalAfericaoTemperatura) {
        instancia.setNumTotalAfericaoTemperatura(numTotalAfericaoTemperatura);
    }

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    @Override
    public boolean isSetNumTotalAfericaoTemperatura() {
        return instancia.isSetNumTotalAfericaoTemperatura();
    }

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    @Override
    public void setNumTotalAfericaoTemperaturaIsSet(boolean value) {
        instancia.setNumTotalAfericaoTemperaturaIsSet(value);
    }

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    @Override
    public long getNumTotalMedicaoAltura() {
        return instancia.getNumTotalMedicaoAltura();
    }

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    @Override
    public void setNumTotalMedicaoAltura(long numTotalMedicaoAltura) {
        instancia.setNumTotalMedicaoAltura(numTotalMedicaoAltura);
    }

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    @Override
    public boolean isSetNumTotalMedicaoAltura() {
        return instancia.isSetNumTotalMedicaoAltura();
    }

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    @Override
    public void setNumTotalMedicaoAlturaIsSet(boolean value) {
        instancia.setNumTotalMedicaoAlturaIsSet(value);
    }

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    @Override
    public long getNumTotalCurativoSimples() {
        return instancia.getNumTotalCurativoSimples();
    }

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    @Override
    public void setNumTotalCurativoSimples(long numTotalCurativoSimples) {
        instancia.setNumTotalCurativoSimples(numTotalCurativoSimples);
    }

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    @Override
    public boolean isSetNumTotalCurativoSimples() {
        return instancia.isSetNumTotalCurativoSimples();
    }

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    @Override
    public void setNumTotalCurativoSimplesIsSet(boolean value) {
        instancia.setNumTotalCurativoSimplesIsSet(value);
    }

    /**
     * Retorna o valor do atributo
     * @return o valor do atributo
     */
    @Override
    public long getNumTotalMedicaoPeso() {
        return instancia.getNumTotalMedicaoPeso();
    }

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    @Override
    public void setNumTotalMedicaoPeso(long numTotalMedicaoPeso) {
        instancia.setNumTotalMedicaoPeso(numTotalMedicaoPeso);
    }
    
    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    @Override
    public boolean isSetNumTotalMedicaoPeso() {
        return instancia.isSetNumTotalMedicaoPeso();
    }

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    @Override
    public void setNumTotalMedicaoPesoIsSet(boolean value) {
        instancia.setNumTotalMedicaoPesoIsSet(value);
    }

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    @Override
    public long getNumTotalColetaMaterialParaExameLaboratorial() {
        return instancia.getNumTotalColetaMaterialParaExameLaboratorial();
    }

    /**
     * Atribui o valor do atributo
     * @param o valor do atributo
     */
    @Override
    public void setNumTotalColetaMaterialParaExameLaboratorial(long numTotalColetaMaterialParaExameLaboratorial) {
        instancia.setNumTotalColetaMaterialParaExameLaboratorial(numTotalColetaMaterialParaExameLaboratorial);
    }

    /**
     * Verfica se o atributo foi atribuido
     * @return true se tiver setado, false caso nao esteja
     */
    @Override
    public boolean isSetNumTotalColetaMaterialParaExameLaboratorial() {
        return instancia.isSetNumTotalColetaMaterialParaExameLaboratorial();
    }

    /**
     * Marca que o atributo foi setado
     * @param se esta setado ou nao
     */
    @Override
    public void setNumTotalColetaMaterialParaExameLaboratorialIsSet(boolean value) {
        instancia.setNumTotalColetaMaterialParaExameLaboratorialIsSet(value);
    }
    
    /**
     * Valida todos os campos.
     * @return True caso valido, false caso esteja inconsistente
     */
    @Override
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
    @Override
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
    @Override
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
    @Override
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
    @Override
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
    @Override
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
    @Override
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
    @Override
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
    @Override
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
    @Override
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
    @Override
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
    @Override
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
    @Override
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
