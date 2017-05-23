package com.github.Eddyosos.integracao20171.esus.cds.visitadomiciliar;

import br.gov.saude.esus.cds.transport.generated.thrift.common.UnicaLotacaoHeaderThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.visitadomiciliar.FichaVisitaDomiciliarChildThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.visitadomiciliar.FichaVisitaDomiciliarMasterThrift;
import com.github.Eddyosos.integracao20171.esus.cds.common.UnicaLotacaoHeader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;

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

    public boolean equals(Object that) {
        return instance.equals(that);
    }

    public boolean equals(FichaVisitaDomiciliarMaster that) {
        return instance.equals(that.getInstance());
    }

    public int hashCode() {
        return instance.hashCode();
    }

    public int compareTo(FichaVisitaDomiciliarMaster other) {
        return instance.compareTo(other.getInstance());
    }

    public void read(TProtocol iprot) throws TException {
        instance.read(iprot);
    }

    public void write(TProtocol oprot) throws TException {
        instance.write(oprot);
    }

    public String toString() {
        return instance.toString();
    }

    public void validate() throws TException {
        instance.validate();
    }
    
    protected FichaVisitaDomiciliarMasterThrift getInstance(){
        return instance;
    }

}
