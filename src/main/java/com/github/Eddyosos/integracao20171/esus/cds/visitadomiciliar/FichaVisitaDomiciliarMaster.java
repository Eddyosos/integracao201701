package com.github.Eddyosos.integracao20171.esus.cds.visitadomiciliar;

import br.gov.saude.esus.cds.transport.generated.thrift.visitadomiciliar.FichaVisitaDomiciliarChildThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.visitadomiciliar.FichaVisitaDomiciliarMasterThrift;
import com.github.Eddyosos.integracao20171.esus.cds.common.UnicaLotacaoHeader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.thrift.TException;
import java.util.UUID;

public class FichaVisitaDomiciliarMaster {

    FichaVisitaDomiciliarMasterThrift instance = new FichaVisitaDomiciliarMasterThrift();

    public FichaVisitaDomiciliarMaster(FichaVisitaDomiciliarMasterThrift thrift) {
        this.instance = thrift;
    }

    public FichaVisitaDomiciliarMaster deepCopy() {
        return new FichaVisitaDomiciliarMaster(instance.deepCopy());
    }

    public void clear() {
        instance.clear();
    }

    public String getUuidFicha() {
        return instance.getUuidFicha();
    }

    public void setUuidFicha(String uuidFicha) {
        instance.setUuidFicha(uuidFicha);
    }

    public void unsetUuidFicha() {
        instance.unsetUuidFicha();
    }

    public boolean isSetUuidFicha() {
        return instance.isSetUuidFicha();
    }

    public void setUuidFichaIsSet(boolean value) {
        instance.setUuidFichaIsSet(value);
    }

    public int getTpCdsOrigem() {
        return instance.getTpCdsOrigem();
    }

    public void setTpCdsOrigem(int tpCdsOrigem) {
        instance.setTpCdsOrigem(tpCdsOrigem);
    }

    public void unsetTpCdsOrigem() {
        instance.unsetTpCdsOrigem();
    }

    public boolean isSetTpCdsOrigem() {
        return instance.isSetTpCdsOrigem();
    }

    public void setTpCdsOrigemIsSet(boolean value) {
        instance.setTpCdsOrigemIsSet(value);
    }

    public UnicaLotacaoHeader getHeaderTransport() {
        return new UnicaLotacaoHeader(instance.getHeaderTransport());
    }

    public void setHeaderTransport(UnicaLotacaoHeader headerTransport) {
        instance.setHeaderTransport(headerTransport.getInstance());
    }

    public void unsetHeaderTransport() {
        instance.unsetHeaderTransport();
    }

    public boolean isSetHeaderTransport() {
        return instance.isSetHeaderTransport();
    }

    public void setHeaderTransportIsSet(boolean value) {
        instance.setHeaderTransportIsSet(value);
    }

    public int getVisitasDomiciliaresSize() {
        return instance.getVisitasDomiciliaresSize();
    }

    public Iterator<FichaVisitaDomiciliarChild> getVisitasDomiciliaresIterator() {
        List<FichaVisitaDomiciliarChild> ficha = new LinkedList();

        instance.getVisitasDomiciliaresIterator().forEachRemaining((t) -> {
            ficha.add(new FichaVisitaDomiciliarChild(t));

        });

        return ficha.iterator();
    }

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

    public void setVisitasDomiciliares(List<FichaVisitaDomiciliarChild> visitasDomiciliares) {
        List<FichaVisitaDomiciliarChildThrift> ficha = new LinkedList();
        
        visitasDomiciliares.forEach((t) -> {
            ficha.add(t.getInstance());
        });
        
        instance.setVisitasDomiciliares(ficha);
    }

    public void unsetVisitasDomiciliares() {
        instance.unsetVisitasDomiciliares();
    }

    public boolean isSetVisitasDomiciliares() {
        return instance.isSetVisitasDomiciliares();
    }

    public void setVisitasDomiciliaresIsSet(boolean value) {
        instance.setVisitasDomiciliaresIsSet(value);
    }

    @Override
    public boolean equals(Object that) {
        return instance.equals(that);
    }

    public boolean equals(FichaVisitaDomiciliarMaster that) {
        return instance.equals(that.getInstance());
    }

    @Override
    public int hashCode() {
        return instance.hashCode();
    }

    public int compareTo(FichaVisitaDomiciliarMaster other) {
        return instance.compareTo(other.getInstance());
    }
    @Override
    public String toString() {
        return instance.toString();
    }

    public void validate() throws TException {
        instance.validate();
    }
    
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
