package com.github.Eddyosos.integracao20171.esus.cds.atividadeindividual;

import br.gov.saude.esus.cds.transport.generated.thrift.atividadeindividual.FichaAtendimentoIndividualChildThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.atividadeindividual.FichaAtendimentoIndividualMasterThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.common.VariasLotacoesHeaderThrift;
import java.util.Iterator;
import java.util.List;
import org.apache.thrift.TException;

public class FichaAtendimentoIndividualMaster {
    
    private FichaAtendimentoIndividualMasterThrift instance;
    
    public FichaAtendimentoIndividualMaster() {
        instance = new FichaAtendimentoIndividualMasterThrift();
    }

    public VariasLotacoesHeaderThrift getHeaderTransport() {
        return instance.getHeaderTransport();
    }

    public void setHeaderTransport(VariasLotacoesHeaderThrift headerTransport) {
        instance.setHeaderTransport(headerTransport);
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

    public Iterator<FichaAtendimentoIndividualChildThrift> getAtendimentosIndividuaisIterator() {
        return instance.getAtendimentosIndividuaisIterator();
    }

    public void addToAtendimentosIndividuais(FichaAtendimentoIndividualChildThrift elem) {
        instance.addToAtendimentosIndividuais(elem);
    }

    public List<FichaAtendimentoIndividualChildThrift> getAtendimentosIndividuais() {
        return instance.getAtendimentosIndividuais();
    }

    public void setAtendimentosIndividuais(List<FichaAtendimentoIndividualChildThrift> atendimentosIndividuais) {
        instance.setAtendimentosIndividuais(atendimentosIndividuais);
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

    public void validate() throws TException {
        instance.validate();
    }

}

