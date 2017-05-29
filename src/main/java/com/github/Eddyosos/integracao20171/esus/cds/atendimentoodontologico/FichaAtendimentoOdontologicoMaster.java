package com.github.Eddyosos.integracao20171.esus.cds.atendimentoodontologico;

import br.gov.saude.esus.cds.transport.generated.thrift.atendimentoodontologico.FichaAtendimentoOdontologicoChildThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.atendimentoodontologico.FichaAtendimentoOdontologicoMasterThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.common.VariasLotacoesHeaderThrift;
import com.github.Eddyosos.integracao20171.esus.cds.common.VariasLotacoesHeader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;

public class FichaAtendimentoOdontologicoMaster {
    FichaAtendimentoOdontologicoMasterThrift fichaAtendimentoOdontologicoMasterThrift = new FichaAtendimentoOdontologicoMasterThrift();
    
    protected FichaAtendimentoOdontologicoMaster(FichaAtendimentoOdontologicoMasterThrift fichaAtendimentoOdontologicoMasterThrift){
        this.fichaAtendimentoOdontologicoMasterThrift = fichaAtendimentoOdontologicoMasterThrift;
    }

    public FichaAtendimentoOdontologicoMaster deepCopy() {
        return new FichaAtendimentoOdontologicoMaster(fichaAtendimentoOdontologicoMasterThrift.deepCopy());
    }

    public void clear() {
        fichaAtendimentoOdontologicoMasterThrift.clear();
    }

    public String getUuidFicha() {
        return fichaAtendimentoOdontologicoMasterThrift.getUuidFicha();
    }

    public void setUuidFicha(String uuidFicha) {
        fichaAtendimentoOdontologicoMasterThrift.setUuidFicha(uuidFicha);
    }

    public void unsetUuidFicha() {
        fichaAtendimentoOdontologicoMasterThrift.unsetUuidFicha();
    }

    public boolean isSetUuidFicha() {
        return fichaAtendimentoOdontologicoMasterThrift.isSetUuidFicha();
    }

    public void setUuidFichaIsSet(boolean value) {
        fichaAtendimentoOdontologicoMasterThrift.setUuidFichaIsSet(value);
    }

    public VariasLotacoesHeader getHeaderTransport() {
        return new VariasLotacoesHeader(fichaAtendimentoOdontologicoMasterThrift.getHeaderTransport());
    }

    public void setHeaderTransport(VariasLotacoesHeader headerTransport) {
        fichaAtendimentoOdontologicoMasterThrift.setHeaderTransport(headerTransport.getInstance());
    }

    public void unsetHeaderTransport() {
        fichaAtendimentoOdontologicoMasterThrift.unsetHeaderTransport();
    }

    public boolean isSetHeaderTransport() {
        return fichaAtendimentoOdontologicoMasterThrift.isSetHeaderTransport();
    }

    public void setHeaderTransportIsSet(boolean value) {
        fichaAtendimentoOdontologicoMasterThrift.setHeaderTransportIsSet(value);
    }

    public int getAtendimentosOdontologicosSize() {
        return fichaAtendimentoOdontologicoMasterThrift.getAtendimentosOdontologicosSize();
    }

    public Iterator<FichaAtendimentoOdontologicoChild> getAtendimentosOdontologicosIterator() {
        List<FichaAtendimentoOdontologicoChild> listaFichaAtendimentoOdontologicoChild = new LinkedList<>();
        
        fichaAtendimentoOdontologicoMasterThrift.getAtendimentosOdontologicosIterator().forEachRemaining((elemento) -> {
            listaFichaAtendimentoOdontologicoChild.add(new FichaAtendimentoOdontologicoChild(elemento));
        });
        
        return listaFichaAtendimentoOdontologicoChild.iterator();
    }

    public void addToAtendimentosOdontologicos(FichaAtendimentoOdontologicoChild elem) {
        fichaAtendimentoOdontologicoMasterThrift.addToAtendimentosOdontologicos(elem.getInstance());
    }

    public List<FichaAtendimentoOdontologicoChild> getAtendimentosOdontologicos() {
        List<FichaAtendimentoOdontologicoChild> listaFichaAtendimentoOdontologicoChild = new LinkedList<>();
        
        fichaAtendimentoOdontologicoMasterThrift.getAtendimentosOdontologicos().forEach((elemento) -> {
            listaFichaAtendimentoOdontologicoChild.add(new FichaAtendimentoOdontologicoChild(elemento));
        });
        
        return listaFichaAtendimentoOdontologicoChild;
    }

    public void setAtendimentosOdontologicos(List<FichaAtendimentoOdontologicoChild> atendimentosOdontologicos) {
        List<FichaAtendimentoOdontologicoChildThrift> listaFichaAtendimentoOdontologicoChildThrift = new LinkedList<>();
        
        atendimentosOdontologicos.forEach((elemento) -> {
            listaFichaAtendimentoOdontologicoChildThrift.add(elemento.getInstance());
        });
        
        fichaAtendimentoOdontologicoMasterThrift.setAtendimentosOdontologicos(listaFichaAtendimentoOdontologicoChildThrift);
    }

    public void unsetAtendimentosOdontologicos() {
        fichaAtendimentoOdontologicoMasterThrift.unsetAtendimentosOdontologicos();
    }

    public boolean isSetAtendimentosOdontologicos() {
        return fichaAtendimentoOdontologicoMasterThrift.isSetAtendimentosOdontologicos();
    }

    public void setAtendimentosOdontologicosIsSet(boolean value) {
        fichaAtendimentoOdontologicoMasterThrift.setAtendimentosOdontologicosIsSet(value);
    }

    public int getTpCdsOrigem() {
        return fichaAtendimentoOdontologicoMasterThrift.getTpCdsOrigem();
    }

    public void setTpCdsOrigem(int tpCdsOrigem) {
        fichaAtendimentoOdontologicoMasterThrift.setTpCdsOrigem(tpCdsOrigem);
    }

    public void unsetTpCdsOrigem() {
        fichaAtendimentoOdontologicoMasterThrift.unsetTpCdsOrigem();
    }

    public boolean isSetTpCdsOrigem() {
        return fichaAtendimentoOdontologicoMasterThrift.isSetTpCdsOrigem();
    }

    public void setTpCdsOrigemIsSet(boolean value) {
        fichaAtendimentoOdontologicoMasterThrift.setTpCdsOrigemIsSet(value);
    }

    @Override
    public boolean equals(Object that) {
        return fichaAtendimentoOdontologicoMasterThrift.equals(that);
    }

    public boolean equals(FichaAtendimentoOdontologicoMaster that) {
        return fichaAtendimentoOdontologicoMasterThrift.equals(that.getInstance());
    }

    @Override
    public int hashCode() {
        return fichaAtendimentoOdontologicoMasterThrift.hashCode();
    }

    public int compareTo(FichaAtendimentoOdontologicoMaster other) {
        return fichaAtendimentoOdontologicoMasterThrift.compareTo(other.getInstance());
    }

    @Override
    public String toString() {
        return fichaAtendimentoOdontologicoMasterThrift.toString();
    }

    public void validate() throws TException {
        fichaAtendimentoOdontologicoMasterThrift.validate();
    }

    protected FichaAtendimentoOdontologicoMasterThrift getInstance(){
        return fichaAtendimentoOdontologicoMasterThrift;
    }
    
    
}

