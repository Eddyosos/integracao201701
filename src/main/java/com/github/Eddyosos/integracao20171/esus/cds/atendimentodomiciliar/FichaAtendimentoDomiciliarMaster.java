package com.github.Eddyosos.integracao20171.esus.cds.atendimentodomiciliar;

import br.gov.saude.esus.cds.transport.generated.thrift.atendimentodomiciliar.FichaAtendimentoDomiciliarChildThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.atendimentodomiciliar.FichaAtendimentoDomiciliarMasterThrift;
import com.github.Eddyosos.integracao20171.esus.cds.common.UnicaLotacaoHeader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.thrift.TException;

public class FichaAtendimentoDomiciliarMaster {
    FichaAtendimentoDomiciliarMasterThrift fichaAtendimentoDomiciliarMasterThrift = new FichaAtendimentoDomiciliarMasterThrift();
    
    protected FichaAtendimentoDomiciliarMaster(FichaAtendimentoDomiciliarMasterThrift fichaAtendimentoDomiciliarMasterThrift){
        this.fichaAtendimentoDomiciliarMasterThrift = fichaAtendimentoDomiciliarMasterThrift;
    }

    public FichaAtendimentoDomiciliarMaster deepCopy() {
        return new FichaAtendimentoDomiciliarMaster(fichaAtendimentoDomiciliarMasterThrift.deepCopy());
    }

    public String getUuidFicha() {
        return fichaAtendimentoDomiciliarMasterThrift.getUuidFicha();
    }

    public void setUuidFicha(String uuidFicha) {
        fichaAtendimentoDomiciliarMasterThrift.setUuidFicha(uuidFicha);
    }

    public void unsetUuidFicha() {
        fichaAtendimentoDomiciliarMasterThrift.unsetUuidFicha();
    }

    public boolean isSetUuidFicha() {
        return fichaAtendimentoDomiciliarMasterThrift.isSetUuidFicha();
    }

    public void setUuidFichaIsSet(boolean value) {
        fichaAtendimentoDomiciliarMasterThrift.setUuidFichaIsSet(value);
    }

    public int getTpCdsOrigem() {
        return fichaAtendimentoDomiciliarMasterThrift.getTpCdsOrigem();
    }

    public void setTpCdsOrigem(int tpCdsOrigem) {
        fichaAtendimentoDomiciliarMasterThrift.setTpCdsOrigem(tpCdsOrigem);
    }

    public void unsetTpCdsOrigem() {
        fichaAtendimentoDomiciliarMasterThrift.unsetTpCdsOrigem();
    }

    public boolean isSetTpCdsOrigem() {
        return fichaAtendimentoDomiciliarMasterThrift.isSetTpCdsOrigem();
    }

    public void setTpCdsOrigemIsSet(boolean value) {
        fichaAtendimentoDomiciliarMasterThrift.setTpCdsOrigemIsSet(value);
    }

    public UnicaLotacaoHeader getHeaderTransport() {
        return new UnicaLotacaoHeader(fichaAtendimentoDomiciliarMasterThrift.getHeaderTransport());
    }

    public void setHeaderTransport(UnicaLotacaoHeader headerTransport) {
        fichaAtendimentoDomiciliarMasterThrift.setHeaderTransport(headerTransport.getInstance());
    }

    public void unsetHeaderTransport() {
        fichaAtendimentoDomiciliarMasterThrift.unsetHeaderTransport();
    }

    public boolean isSetHeaderTransport() {
        return fichaAtendimentoDomiciliarMasterThrift.isSetHeaderTransport();
    }

    public void setHeaderTransportIsSet(boolean value) {
        fichaAtendimentoDomiciliarMasterThrift.setHeaderTransportIsSet(value);
    }

    public int getAtendimentosDomiciliaresSize() {
        return fichaAtendimentoDomiciliarMasterThrift.getAtendimentosDomiciliaresSize();
    }

    public Iterator<FichaAtendimentoDomiciliarChild> getAtendimentosDomiciliaresIterator() {
        
        List<FichaAtendimentoDomiciliarChild> listaFichaAtendimentoDomiciliarChild = new LinkedList<>();
        
        fichaAtendimentoDomiciliarMasterThrift.getAtendimentosDomiciliaresIterator().forEachRemaining((t) -> {
            listaFichaAtendimentoDomiciliarChild.add(new FichaAtendimentoDomiciliarChild(t));
        });
        
        return listaFichaAtendimentoDomiciliarChild.iterator();
    }

    public void addToAtendimentosDomiciliares(FichaAtendimentoDomiciliarChild elem) {
        fichaAtendimentoDomiciliarMasterThrift.addToAtendimentosDomiciliares(elem.getInstance());
    }

    public List<FichaAtendimentoDomiciliarChild> getAtendimentosDomiciliares() {

        List<FichaAtendimentoDomiciliarChild> listaFichaAtendimentoDomiciliarChild = new LinkedList<>();
        
        fichaAtendimentoDomiciliarMasterThrift.getAtendimentosDomiciliares().forEach((t) -> {
            listaFichaAtendimentoDomiciliarChild.add(new FichaAtendimentoDomiciliarChild(t));
        });
        
        return listaFichaAtendimentoDomiciliarChild;
    }

    public void setAtendimentosDomiciliares(List<FichaAtendimentoDomiciliarChild> atendimentosDomiciliares) {
        
        List<FichaAtendimentoDomiciliarChildThrift> listaFichaAtendimentoDomiciliarChild = new LinkedList<>();
        
        atendimentosDomiciliares.forEach((t) -> {
            listaFichaAtendimentoDomiciliarChild.add(t.getInstance());
        });
        
        fichaAtendimentoDomiciliarMasterThrift.setAtendimentosDomiciliares(listaFichaAtendimentoDomiciliarChild);
    }

    public void unsetAtendimentosDomiciliares() {
        fichaAtendimentoDomiciliarMasterThrift.unsetAtendimentosDomiciliares();
    }

    public boolean isSetAtendimentosDomiciliares() {
        return fichaAtendimentoDomiciliarMasterThrift.isSetAtendimentosDomiciliares();
    }

    public void setAtendimentosDomiciliaresIsSet(boolean value) {
        fichaAtendimentoDomiciliarMasterThrift.setAtendimentosDomiciliaresIsSet(value);
    }

    @Override
    public boolean equals(Object that) {
        return fichaAtendimentoDomiciliarMasterThrift.equals(that);
    }

    public boolean equals(FichaAtendimentoDomiciliarMaster that) {
        return fichaAtendimentoDomiciliarMasterThrift.equals(that.getInstance());
    }

    @Override
    public int hashCode() {
        return fichaAtendimentoDomiciliarMasterThrift.hashCode();
    }

    public int compareTo(FichaAtendimentoDomiciliarMaster other) {
        return fichaAtendimentoDomiciliarMasterThrift.compareTo(other.getInstance());
    }

    @Override
    public String toString() {
        return fichaAtendimentoDomiciliarMasterThrift.toString();
    }

    public void validate() throws TException {
        fichaAtendimentoDomiciliarMasterThrift.validate();
    }

    protected FichaAtendimentoDomiciliarMasterThrift getInstance(){
        return fichaAtendimentoDomiciliarMasterThrift;
    }
}

