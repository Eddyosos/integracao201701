package com.github.Eddyosos.integracao20171.esus.cds.visitadomiciliar;

import br.gov.saude.esus.cds.transport.generated.thrift.visitadomiciliar.FichaVisitaDomiciliarChildThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.visitadomiciliar.FichaVisitaDomiciliarMasterThrift;
import com.github.Eddyosos.integracao20171.esus.cds.common.UnicaLotacaoHeader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FichaVisitaDomiciliarMaster {

    FichaVisitaDomiciliarMasterThrift instance = new FichaVisitaDomiciliarMasterThrift();

    public FichaVisitaDomiciliarMaster(FichaVisitaDomiciliarMasterThrift thrift) {
        this.instance = thrift;
    }
    /**
     * Retorna o numero UUID
     * @return uuid String
     */
    public String getUuidFicha() {
        return instance.getUuidFicha();
    }
    /**
     * Muda o valor do numero de UUID
     * @param uuidFicha String
     */

    public void setUuidFicha(String uuidFicha) {
        instance.setUuidFicha(uuidFicha);
    }
    /**
     * Apaga o valor do field uuidFicha
     */

    public void unsetUuidFicha() {
        instance.unsetUuidFicha();
    }
    /**
     * Verifica se o field uuidFicha está setado
     * @return true caso o valor esteja setado
     * false caso não esteja setado
     */

    public boolean isSetUuidFicha() {
        return instance.isSetUuidFicha();
    }
    /**
     * Altera o valor do isSet do field uuidFicha
     * @param value boolean 
     */

    public void setUuidFichaIsSet(boolean value) {
        instance.setUuidFichaIsSet(value);
    }
    /**
     * Retorna o numero do tpCdsOrigem
     * @return tpCdsOrigem int
     */

    public int getTpCdsOrigem() {
        return instance.getTpCdsOrigem();
    }
    
    /**
     * Muda o valor do numero de tpCdsOrigem
     * @param tpCdsOrigem String
     */

    public void setTpCdsOrigem(int tpCdsOrigem) {
        instance.setTpCdsOrigem(tpCdsOrigem);
    }
    /**
     * Apaga o valor do field tpCdsOrigem
     */

    public void unsetTpCdsOrigem() {
        instance.unsetTpCdsOrigem();
    }
    /**
     * Verifica se o field tpCdsOrigem está setado
     * @return true caso o valor esteja setado
     * false caso não esteja setado
     */

    public boolean isSetTpCdsOrigem() {
        return instance.isSetTpCdsOrigem();
    }
    /**
     * Altera o valor do isSet do field tpCdsOrigem
     * @param value boolean 
     */

    public void setTpCdsOrigemIsSet(boolean value) {
        instance.setTpCdsOrigemIsSet(value);
    }
    /**
     * Retorna o uma instancia de UnicaLotacaoHeader
     * @return UnicaLotacaoHeader UnicaLotacaoHeader
     */

    public UnicaLotacaoHeader getHeaderTransport() {
        return new UnicaLotacaoHeader(instance.getHeaderTransport());
    }
    /**
     * Muda o valor de HeaderTransport
     * @param headerTransport UnicaLotacaoHeader
     */

    public void setHeaderTransport(UnicaLotacaoHeader headerTransport) {
        instance.setHeaderTransport(headerTransport.getInstance());
    }
    /**
     * Apaga o valor de HeaderTransport
     */

    public void unsetHeaderTransport() {
        instance.unsetHeaderTransport();
    }
    /**
     * Verifica se HeaderTransport está setado
     * @return true caso o valor esteja setado
     * false caso não esteja setado
     */

    public boolean isSetHeaderTransport() {
        return instance.isSetHeaderTransport();
    }
    /**
     * Altera o valor do isSet do field HeaderTransport
     * @param value boolean 
     */

    public void setHeaderTransportIsSet(boolean value) {
        instance.setHeaderTransportIsSet(value);
    }
     /**
     * Retorna o tamanho de visitasDomiciliares
     * @return visitasDomiciliaresSize int
     */

    public int getVisitasDomiciliaresSize() {
        return instance.getVisitasDomiciliaresSize();
    }
    /**
     * Devolve o iterator de visitas domiciliares
     * @return ficha.iterator Iterator
     */

    public Iterator<FichaVisitaDomiciliarChild> getVisitasDomiciliaresIterator() {
        List<FichaVisitaDomiciliarChild> ficha = new LinkedList();

        instance.getVisitasDomiciliaresIterator().forEachRemaining((t) -> {
            ficha.add(new FichaVisitaDomiciliarChild(t));

        });

        return ficha.iterator();
    }
    /**
     * Adiciona um elemento a lista visitaDomiciliares
     * @param elem FichaVisitaDomiciliarChild
     */

    public void addToVisitasDomiciliares(FichaVisitaDomiciliarChild elem) {
        instance.addToVisitasDomiciliares(elem.getInstance());
    }

    public List<FichaVisitaDomiciliarChild> getVisitasDomiciliares() {
        List<FichaVisitaDomiciliarChild> ficha = new LinkedList();


        instance.getVisitasDomiciliares().forEach((t) -> {
            ficha.add(new FichaVisitaDomiciliarChild(t));
        });
        
        return ficha;
    }
    /**
     * Muda o valor da lista visitadomiciliares
     * @param visitasDomiciliares List
     */

    public void setVisitasDomiciliares(List<FichaVisitaDomiciliarChild> visitasDomiciliares) {
        List<FichaVisitaDomiciliarChildThrift> ficha = new LinkedList();
        
        visitasDomiciliares.forEach((t) -> {
            ficha.add(t.getInstance());
        });
        
        instance.setVisitasDomiciliares(ficha);
    }
    /**
     * Apaga a lista de visitasDomiciliares
     */

    public void unsetVisitasDomiciliares() {
        instance.unsetVisitasDomiciliares();
    }
    /**
     * Verifica se o field visitasDomiciliares está setado
     * @return true caso o valor esteja setado
     * false caso não esteja setado
     */

    public boolean isSetVisitasDomiciliares() {
        return instance.isSetVisitasDomiciliares();
    }
    /**
     * Altera o valor do isSet do field visitasDomiciliares
     * @param value boolean 
     */

    public void setVisitasDomiciliaresIsSet(boolean value) {
        instance.setVisitasDomiciliaresIsSet(value);
    }
    /**
     * Compara se o objeto passado como parado é igual a instance
     * @param that
     * @return true caso sejam iguais
     * false caso sejam diferentes
     */

    @Override
    public boolean equals(Object that) {
        return instance.equals(that);
    }
      /**
     * Compara se o objeto passado como parado é igual a instance
     * @param that
     * @return true caso sejam iguais
     * false caso sejam diferentes
     */

    public boolean equals(FichaVisitaDomiciliarMaster that) {
        return instance.equals(that.getInstance());
    }
    /**
     * Retorna uma instancia de FichaVisitaDomiciliarMaster
     * @return instancia FichaVisitaDomiciliarMaster
     */
    
    protected FichaVisitaDomiciliarMasterThrift getInstance(){
        return instance;
    }
    /**
     * Valida o field uuidFicha
     * @return true caso o valor esteja setado e o seu tamanho seja maior que 36 e menor que 44. 
     * false caso o valor esteja setado e seu tamanho for menor que 36 e maior que 44
     * false caso nenhum valor esteja setado
     */
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
    public boolean validaHeaderTransport(){
        return getInstance().isSetHeaderTransport();
    }
    /**
     * valida o field Visitas_Domiciliares
     * @return true caso o valor esteja setado e seja igual ou maior que 1 e menor que 23
     * false caso o valor esteja setado e seja menor que um ou maior que 23
     * false case o valor não esteja setado
     */
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
    
    public boolean validates(){
        return validaVisitasDomiciliares() && validaHeaderTransport() && validaUuidFicha();
    }
    
    
}
