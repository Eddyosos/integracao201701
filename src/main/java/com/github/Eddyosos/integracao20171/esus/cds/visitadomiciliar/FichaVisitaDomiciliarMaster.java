package com.github.Eddyosos.integracao20171.esus.cds.visitadomiciliar;

import br.gov.saude.esus.cds.transport.generated.thrift.visitadomiciliar.FichaVisitaDomiciliarChildThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.visitadomiciliar.FichaVisitaDomiciliarMasterThrift;
import com.github.Eddyosos.integracao20171.compactor.SerializadorThrift;
import com.github.Eddyosos.integracao20171.esus.cds.common.UnicaLotacaoHeader;
import com.github.Eddyosos.integracao20171.esus.transport.DadoTransporte;
import com.github.eddyosos.e_sus_ab_factory.cds.common.IUnicaLotacaoHeader;
import com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.visitadomiciliar.IFichaVisitaDomiciliarChild;
import com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.visitadomiciliar.IFichaVisitaDomiciliarMaster;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FichaVisitaDomiciliarMaster implements IFichaVisitaDomiciliarMaster {

    private FichaVisitaDomiciliarMasterThrift instancia;
    private long TIPO_DADO_SERIALIZADO_FICHA_PROCEDIMENTO = 8;
    private final static String EXTENSAO_EXPORT = ".esus13";
    private DadoTransporte dadoTransporteThrift;  
    
    public FichaVisitaDomiciliarMaster(){
        instancia = new FichaVisitaDomiciliarMasterThrift();
    }

    public FichaVisitaDomiciliarMaster(FichaVisitaDomiciliarMasterThrift thrift) {
        this.instancia = thrift;
    }
    
    /**
     * Retorna o numero UUID
     * @return uuid String
     */
    @Override
    public String getUuidFicha() {
        return instancia.getUuidFicha();
    }
    
    /**
     * Muda o valor do numero de UUID
     * @param uuidFicha String
     */
    @Override
    public void setUuidFicha(String uuidFicha) {
        instancia.setUuidFicha(uuidFicha);
    }

    /**
     * Apaga o valor do field uuidFicha
     */
    @Override
    public void unsetUuidFicha() {
        instancia.unsetUuidFicha();
    }

    /**
     * Verifica se o field uuidFicha está setado
     * @return true caso o valor esteja setado
     * false caso não esteja setado
     */
    @Override
    public boolean isSetUuidFicha() {
        return instancia.isSetUuidFicha();
    }

    /**
     * Altera o valor do isSet do field uuidFicha
     * @param value boolean 
     */
    @Override
    public void setUuidFichaIsSet(boolean value) {
        instancia.setUuidFichaIsSet(value);
    }

    /**
     * Retorna o numero do tpCdsOrigem
     * @return tpCdsOrigem int
     */
    @Override
    public int getTpCdsOrigem() {
        return instancia.getTpCdsOrigem();
    }
   
    /**
     * Muda o valor do numero de tpCdsOrigem
     * @param tpCdsOrigem String
     */
    @Override
    public void setTpCdsOrigem(int tpCdsOrigem) {
        instancia.setTpCdsOrigem(tpCdsOrigem);
    }

    /**
     * Apaga o valor do field tpCdsOrigem
     */
    @Override
    public void unsetTpCdsOrigem() {
        instancia.unsetTpCdsOrigem();
    }
    
    /**
     * Verifica se o field tpCdsOrigem está setado
     * @return true caso o valor esteja setado
     * false caso não esteja setado
     */
    @Override
    public boolean isSetTpCdsOrigem() {
        return instancia.isSetTpCdsOrigem();
    }

    /**
     * Altera o valor do isSet do field tpCdsOrigem
     * @param value boolean 
     */
    @Override
    public void setTpCdsOrigemIsSet(boolean value) {
        instancia.setTpCdsOrigemIsSet(value);
    }

    /**
     * Retorna o uma instancia de UnicaLotacaoHeader
     * @return UnicaLotacaoHeader UnicaLotacaoHeader
     */
    @Override
    public IUnicaLotacaoHeader getHeaderTransport() {
        return new UnicaLotacaoHeader(instancia.getHeaderTransport());
    }

    /**
     * Muda o valor de HeaderTransport
     * @param headerTransport UnicaLotacaoHeader
     */
    @Override
    public void setHeaderTransport(IUnicaLotacaoHeader headerTransport) {
        instancia.setHeaderTransport(headerTransport.getInstance());
    }

    /**
     * Apaga o valor de HeaderTransport
     */
    @Override
    public void unsetHeaderTransport() {
        instancia.unsetHeaderTransport();
    }

    /**
     * Verifica se HeaderTransport está setado
     * @return true caso o valor esteja setado
     * false caso não esteja setado
     */
    @Override
    public boolean isSetHeaderTransport() {
        return instancia.isSetHeaderTransport();
    }

    /**
     * Altera o valor do isSet do field HeaderTransport
     * @param value boolean 
     */
    @Override
    public void setHeaderTransportIsSet(boolean value) {
        instancia.setHeaderTransportIsSet(value);
    }

    /**
     * Retorna o tamanho de visitasDomiciliares
     * @return visitasDomiciliaresSize int
     */
    @Override
    public int getVisitasDomiciliaresSize() {
        return instancia.getVisitasDomiciliaresSize();
    }

    /**
     * Devolve o iterator de visitas domiciliares
     * @return ficha.iterator Iterator
     */
    @Override
    public Iterator<IFichaVisitaDomiciliarChild> getVisitasDomiciliaresIterator() {
        List<IFichaVisitaDomiciliarChild> ficha = new LinkedList();

        instancia.getVisitasDomiciliaresIterator().forEachRemaining((t) -> {
            ficha.add(new FichaVisitaDomiciliarChild(t));

        });

        return ficha.iterator();
    }

    /**
     * Adiciona um elemento a lista visitaDomiciliares
     * @param elem FichaVisitaDomiciliarChild
     */
    @Override
    public void addToVisitasDomiciliares(IFichaVisitaDomiciliarChild elem) {
        instancia.addToVisitasDomiciliares(elem.getInstance());
    }

    @Override
    public List<IFichaVisitaDomiciliarChild> getVisitasDomiciliares() {
        List<IFichaVisitaDomiciliarChild> ficha = new LinkedList();


        instancia.getVisitasDomiciliares().forEach((t) -> {
            ficha.add(new FichaVisitaDomiciliarChild(t));
        });
        
        return ficha;
    }

    /**
     * Muda o valor da lista visitadomiciliares
     * @param visitasDomiciliares List
     */
    @Override
    public void setVisitasDomiciliares(List<IFichaVisitaDomiciliarChild> visitasDomiciliares) {
        List<FichaVisitaDomiciliarChildThrift> ficha = new LinkedList();
        
        visitasDomiciliares.forEach((t) -> {
            ficha.add(t.getInstance());
        });
        
        instancia.setVisitasDomiciliares(ficha);
    }

    /**
     * Apaga a lista de visitasDomiciliares
     */
    @Override
    public void unsetVisitasDomiciliares() {
        instancia.unsetVisitasDomiciliares();
    }

    /**
     * Verifica se o field visitasDomiciliares está setado
     * @return true caso o valor esteja setado
     * false caso não esteja setado
     */
    @Override
    public boolean isSetVisitasDomiciliares() {
        return instancia.isSetVisitasDomiciliares();
    }

    /**
     * Altera o valor do isSet do field visitasDomiciliares
     * @param value boolean 
     */
    @Override
    public void setVisitasDomiciliaresIsSet(boolean value) {
        instancia.setVisitasDomiciliaresIsSet(value);
    }

    @Override
    public FichaVisitaDomiciliarMasterThrift getInstance(){
        return instancia;
    }
    
    /**
     * Valida o field uuidFicha
     * @return true caso o valor esteja setado e o seu tamanho seja maior que 36 e menor que 44. 
     * false caso o valor esteja setado e seu tamanho for menor que 36 e maior que 44
     * false caso nenhum valor esteja setado
     */
    @Override
    public boolean validaUuidFicha(){
        if(getInstance().isSetUuidFicha()){
            return getInstance().getUuidFicha().length()>=36 && getInstance().getUuidFicha().length()<=44;
        }
        else return false;
    }
    
    /**
     * Valida se o HeaderTransport está setado
     * @return true caso o valor esteja setado
     * false caso o valor nao esteja setado
     */
    @Override
    public boolean validaHeaderTransport(){
        return getInstance().isSetHeaderTransport();
    }
    
    /**
     * valida o field Visitas_Domiciliares
     * @return true caso o valor esteja setado e seja igual ou maior que 1 e menor que 23
     * false caso o valor esteja setado e seja menor que um ou maior que 23
     * false case o valor não esteja setado
     */
    @Override
    public boolean validaVisitasDomiciliares(){
        if(getInstance().isSetVisitasDomiciliares()){
            return getInstance().getVisitasDomiciliares().size()>=1 && getInstance().getVisitasDomiciliares().size()<=23;
        }
        return false;
    }
    
    /**
     * Valida todos os Fields
     * @return true caso todos os fieds estejam nos padrões aceitos
     * false, caso um atributo nao esteja nos padrões aceitos
     */
    @Override
    public boolean validates(){
        return validaVisitasDomiciliares() && validaHeaderTransport() && validaUuidFicha();
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
