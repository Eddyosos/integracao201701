package com.github.Eddyosos.integracao20171.esus.cds.atendimentoodontologico;

import br.gov.saude.esus.cds.transport.generated.thrift.atendimentoodontologico.ProcedimentoQuantidadeThrift;
import org.apache.thrift.TException;

public class ProcedimentoQuantidade {
    ProcedimentoQuantidadeThrift procedimentoQuantidadeThrift = new ProcedimentoQuantidadeThrift();
    
    protected ProcedimentoQuantidade(ProcedimentoQuantidadeThrift t){
        this.procedimentoQuantidadeThrift = t;
    }

    public ProcedimentoQuantidade deepCopy() {
        return new ProcedimentoQuantidade(procedimentoQuantidadeThrift.deepCopy());
    }

    public void clear() {
        procedimentoQuantidadeThrift.clear();
    }

    public String getCoMsProcedimento() {
        return procedimentoQuantidadeThrift.getCoMsProcedimento();
    }

    public void setCoMsProcedimento(String coMsProcedimento) {
        procedimentoQuantidadeThrift.setCoMsProcedimento(coMsProcedimento);
    }

    public void unsetCoMsProcedimento() {
        procedimentoQuantidadeThrift.unsetCoMsProcedimento();
    }

    public boolean isSetCoMsProcedimento() {
        return procedimentoQuantidadeThrift.isSetCoMsProcedimento();
    }

    public void setCoMsProcedimentoIsSet(boolean value) {
        procedimentoQuantidadeThrift.setCoMsProcedimentoIsSet(value);
    }

    public int getQuantidade() {
        return procedimentoQuantidadeThrift.getQuantidade();
    }

    public void setQuantidade(int quantidade) {
        procedimentoQuantidadeThrift.setQuantidade(quantidade);
    }

    public void unsetQuantidade() {
        procedimentoQuantidadeThrift.unsetQuantidade();
    }

    public boolean isSetQuantidade() {
        return procedimentoQuantidadeThrift.isSetQuantidade();
    }

    public void setQuantidadeIsSet(boolean value) {
        procedimentoQuantidadeThrift.setQuantidadeIsSet(value);
    }

    @Override
    public boolean equals(Object that) {
        return procedimentoQuantidadeThrift.equals(that);
    }

    public boolean equals(ProcedimentoQuantidade that) {
        return procedimentoQuantidadeThrift.equals(that.getInstance());
    }

    @Override
    public int hashCode() {
        return procedimentoQuantidadeThrift.hashCode();
    }

    public int compareTo(ProcedimentoQuantidade other) {
        return procedimentoQuantidadeThrift.compareTo(other.getInstance());
    }

    @Override
    public String toString() {
        return procedimentoQuantidadeThrift.toString();
    }

    public void validate() throws TException {
        procedimentoQuantidadeThrift.validate();
    }

    protected ProcedimentoQuantidadeThrift getInstance(){
        return procedimentoQuantidadeThrift;
    }
    
}

