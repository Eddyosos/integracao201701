package com.github.Eddyosos.integracao20171.esus.cds.atividadecoletiva;

import br.gov.saude.esus.cds.transport.generated.thrift.atividadecoletiva.ProfissionalCboRowItemThrift;
import org.apache.thrift.TException;

public class ProfissionalCboRowItem {
    ProfissionalCboRowItemThrift profissionalCboRowItemThrift = new ProfissionalCboRowItemThrift();
    
    protected ProfissionalCboRowItem(ProfissionalCboRowItemThrift profissionalCboRowItemThrift){
        this.profissionalCboRowItemThrift = profissionalCboRowItemThrift;
    }

    public ProfissionalCboRowItemThrift deepCopy() {
        return profissionalCboRowItemThrift.deepCopy();
    }

    public void clear() {
        profissionalCboRowItemThrift.clear();
    }

    public String getCns() {
        return profissionalCboRowItemThrift.getCns();
    }

    public void setCns(String cns) {
        profissionalCboRowItemThrift.setCns(cns);
    }

    public void unsetCns() {
        profissionalCboRowItemThrift.unsetCns();
    }

    public boolean isSetCns() {
        return profissionalCboRowItemThrift.isSetCns();
    }

    public void setCnsIsSet(boolean value) {
        profissionalCboRowItemThrift.setCnsIsSet(value);
    }

    public String getCodigoCbo2002() {
        return profissionalCboRowItemThrift.getCodigoCbo2002();
    }

    public void setCodigoCbo2002(String codigoCbo2002) {
        profissionalCboRowItemThrift.setCodigoCbo2002(codigoCbo2002);
    }

    public void unsetCodigoCbo2002() {
        profissionalCboRowItemThrift.unsetCodigoCbo2002();
    }

    public boolean isSetCodigoCbo2002() {
        return profissionalCboRowItemThrift.isSetCodigoCbo2002();
    }

    public void setCodigoCbo2002IsSet(boolean value) {
        profissionalCboRowItemThrift.setCodigoCbo2002IsSet(value);
    }

    public boolean equals(Object that) {
        return profissionalCboRowItemThrift.equals(that);
    }

    public boolean equals(ProfissionalCboRowItem that) {
        return profissionalCboRowItemThrift.equals(that.getInstance());
    }

    public int hashCode() {
        return profissionalCboRowItemThrift.hashCode();
    }

    public int compareTo(ProfissionalCboRowItem other) {
        return profissionalCboRowItemThrift.compareTo(other.getInstance());
    }

    public String toString() {
        return profissionalCboRowItemThrift.toString();
    }

    public void validate() throws TException {
        profissionalCboRowItemThrift.validate();
    }
    
    protected ProfissionalCboRowItemThrift getInstance(){
        return profissionalCboRowItemThrift;
    }
    
    
    
}

