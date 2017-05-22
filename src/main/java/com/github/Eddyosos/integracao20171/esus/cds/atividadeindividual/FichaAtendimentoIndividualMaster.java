package com.github.Eddyosos.integracao20171.esus.cds.atividadeindividual;

import br.gov.saude.esus.cds.transport.generated.thrift.atividadeindividual.FichaAtendimentoIndividualChildThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.atividadeindividual.FichaAtendimentoIndividualMasterThrift;
import com.github.Eddyosos.integracao20171.esus.cds.common.VariasLotacoesHeader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;

public class FichaAtendimentoIndividualMaster {
    private final FichaAtendimentoIndividualMasterThrift instance;

    public FichaAtendimentoIndividualMaster() {
        instance = new FichaAtendimentoIndividualMasterThrift();
    }

    public void clear() {
        instance.clear();
    }

    public VariasLotacoesHeader getHeaderTransport() {
        return new VariasLotacoesHeader(instance.getHeaderTransport());
    }

    public void setHeaderTransport(VariasLotacoesHeader headerTransport) {
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

    public int getAtendimentosIndividuaisSize() {
        return instance.getAtendimentosIndividuaisSize();
    }

    public Iterator<FichaAtendimentoIndividualChild> getAtendimentosIndividuaisIterator() {
        List<FichaAtendimentoIndividualChild> list = new ArrayList<>();
        instance.getAtendimentosIndividuaisIterator().forEachRemaining((t) -> {
            list.add(new FichaAtendimentoIndividualChild(t));
        });
        
        return list.iterator();
    }

    public void addToAtendimentosIndividuais(FichaAtendimentoIndividualChild elem) {
        instance.addToAtendimentosIndividuais(elem.getInstance());
    }

    public List<FichaAtendimentoIndividualChild> getAtendimentosIndividuais() {
        List<FichaAtendimentoIndividualChild> list = new ArrayList<>();
        instance.getAtendimentosIndividuaisIterator().forEachRemaining((t) -> {
            list.add(new FichaAtendimentoIndividualChild(t));
        });
        
        return list;
    }

    public void setAtendimentosIndividuais(List<FichaAtendimentoIndividualChild> atendimentosIndividuais) {
        List<FichaAtendimentoIndividualChildThrift> list = new LinkedList<>();
        atendimentosIndividuais.iterator().forEachRemaining((t) -> {
            list.add(t.getInstance());
        });
        instance.setAtendimentosIndividuais(list);
    }

    public void unsetAtendimentosIndividuais() {
        instance.unsetAtendimentosIndividuais();
    }

    public boolean isSetAtendimentosIndividuais() {
        return instance.isSetAtendimentosIndividuais();
    }

    public void setAtendimentosIndividuaisIsSet(boolean value) {
        instance.setAtendimentosIndividuaisIsSet(value);
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

    
    public boolean equals(Object that) {
        return instance.equals(that);
    }

    public boolean equals(FichaAtendimentoIndividualMaster that) {
        return instance.equals(that.instance);
    }

    public int hashCode() {
        return instance.hashCode();
    }

    public int compareTo(FichaAtendimentoIndividualMaster other) {
        return instance.compareTo(other.instance);
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
}

