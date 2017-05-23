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

    FichaVisitaDomiciliarMasterThrift thrift = new FichaVisitaDomiciliarMasterThrift();

    public FichaVisitaDomiciliarMaster(FichaVisitaDomiciliarMasterThrift thrift) {
        this.thrift = thrift;
    }

    public FichaVisitaDomiciliarMaster deepCopy() {
        return new FichaVisitaDomiciliarMaster(thrift.deepCopy());
    }

    public void clear() {
        thrift.clear();
    }

    public String getUuidFicha() {
        return thrift.getUuidFicha();
    }

    public void setUuidFicha(String uuidFicha) {
        thrift.setUuidFicha(uuidFicha);
    }

    public void unsetUuidFicha() {
        thrift.unsetUuidFicha();
    }

    public boolean isSetUuidFicha() {
        return thrift.isSetUuidFicha();
    }

    public void setUuidFichaIsSet(boolean value) {
        thrift.setUuidFichaIsSet(value);
    }

    public int getTpCdsOrigem() {
        return thrift.getTpCdsOrigem();
    }

    public void setTpCdsOrigem(int tpCdsOrigem) {
        thrift.setTpCdsOrigem(tpCdsOrigem);
    }

    public void unsetTpCdsOrigem() {
        thrift.unsetTpCdsOrigem();
    }

    public boolean isSetTpCdsOrigem() {
        return thrift.isSetTpCdsOrigem();
    }

    public void setTpCdsOrigemIsSet(boolean value) {
        thrift.setTpCdsOrigemIsSet(value);
    }

    public UnicaLotacaoHeader getHeaderTransport() {
        return new UnicaLotacaoHeader(thrift.getHeaderTransport());
    }

    public void setHeaderTransport(UnicaLotacaoHeaderThrift headerTransport) {
        thrift.setHeaderTransport(headerTransport);
    }

    public void unsetHeaderTransport() {
        thrift.unsetHeaderTransport();
    }

    public boolean isSetHeaderTransport() {
        return thrift.isSetHeaderTransport();
    }

    public void setHeaderTransportIsSet(boolean value) {
        thrift.setHeaderTransportIsSet(value);
    }

    public int getVisitasDomiciliaresSize() {
        return thrift.getVisitasDomiciliaresSize();
    }

    public Iterator<FichaVisitaDomiciliarChild> getVisitasDomiciliaresIterator() {
        List<FichaVisitaDomiciliarChild> ficha = new LinkedList();

        thrift.getVisitasDomiciliaresIterator().forEachRemaining((t) -> {
            ficha.add(new FichaVisitaDomiciliarChild(t));

        });

        return ficha.iterator();
    }

    public void addToVisitasDomiciliares(FichaVisitaDomiciliarChildThrift elem) {
        thrift.addToVisitasDomiciliares(elem);
    }

    public List<FichaVisitaDomiciliarChild> getVisitasDomiciliares() {
        List<FichaVisitaDomiciliarChild> ficha = new LinkedList();


        thrift.getVisitasDomiciliares().forEach((t) -> {
            ficha.add(new FichaVisitaDomiciliarChild(t));
        });
        
        return ficha;
    }

    public void setVisitasDomiciliares(List<FichaVisitaDomiciliarChildThrift> visitasDomiciliares) {
        thrift.setVisitasDomiciliares(visitasDomiciliares);
    }

    public void unsetVisitasDomiciliares() {
        thrift.unsetVisitasDomiciliares();
    }

    public boolean isSetVisitasDomiciliares() {
        return thrift.isSetVisitasDomiciliares();
    }

    public void setVisitasDomiciliaresIsSet(boolean value) {
        thrift.setVisitasDomiciliaresIsSet(value);
    }

    public boolean equals(Object that) {
        return thrift.equals(that);
    }

    public boolean equals(FichaVisitaDomiciliarMasterThrift that) {
        return thrift.equals(that);
    }

    public int hashCode() {
        return thrift.hashCode();
    }

    public int compareTo(FichaVisitaDomiciliarMasterThrift other) {
        return thrift.compareTo(other);
    }

    public void read(TProtocol iprot) throws TException {
        thrift.read(iprot);
    }

    public void write(TProtocol oprot) throws TException {
        thrift.write(oprot);
    }

    public String toString() {
        return thrift.toString();
    }

    public void validate() throws TException {
        thrift.validate();
    }
    
    protected FichaVisitaDomiciliarMasterThrift getInstance(){
        return thrift;
    }

}
