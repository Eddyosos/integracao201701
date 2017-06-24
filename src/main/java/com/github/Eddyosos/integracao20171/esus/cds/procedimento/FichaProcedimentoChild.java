package com.github.Eddyosos.integracao20171.esus.cds.procedimento;

import br.gov.saude.esus.cds.transport.generated.thrift.procedimento.FichaProcedimentoChildThrift;
import java.util.Iterator;
import java.util.List;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;

public class FichaProcedimentoChild {
    private FichaProcedimentoChildThrift fichaProcedimentoChildThrift = new FichaProcedimentoChildThrift();

    protected FichaProcedimentoChild(FichaProcedimentoChildThrift fichaProcedimentoChildThrift) {
        this.fichaProcedimentoChildThrift = fichaProcedimentoChildThrift;
    }
    
    public FichaProcedimentoChildThrift getInstance(){
        return this.fichaProcedimentoChildThrift;
    }

    public void clear() {
        fichaProcedimentoChildThrift.clear();
    }

    public String getNumProntuario() {
        return fichaProcedimentoChildThrift.getNumProntuario();
    }

    public void setNumProntuario(String numProntuario) {
        fichaProcedimentoChildThrift.setNumProntuario(numProntuario);
    }

    public void unsetNumProntuario() {
        fichaProcedimentoChildThrift.unsetNumProntuario();
    }

    public boolean isSetNumProntuario() {
        return fichaProcedimentoChildThrift.isSetNumProntuario();
    }

    public void setNumProntuarioIsSet(boolean value) {
        fichaProcedimentoChildThrift.setNumProntuarioIsSet(value);
    }

    public String getNumCartaoSus() {
        return fichaProcedimentoChildThrift.getNumCartaoSus();
    }

    public void setNumCartaoSus(String numCartaoSus) {
        fichaProcedimentoChildThrift.setNumCartaoSus(numCartaoSus);
    }

    public void unsetNumCartaoSus() {
        fichaProcedimentoChildThrift.unsetNumCartaoSus();
    }

    public boolean isSetNumCartaoSus() {
        return fichaProcedimentoChildThrift.isSetNumCartaoSus();
    }

    public void setNumCartaoSusIsSet(boolean value) {
        fichaProcedimentoChildThrift.setNumCartaoSusIsSet(value);
    }

    public long getDtNascimento() {
        return fichaProcedimentoChildThrift.getDtNascimento();
    }

    public void setDtNascimento(long dtNascimento) {
        fichaProcedimentoChildThrift.setDtNascimento(dtNascimento);
    }

    public void unsetDtNascimento() {
        fichaProcedimentoChildThrift.unsetDtNascimento();
    }

    public boolean isSetDtNascimento() {
        return fichaProcedimentoChildThrift.isSetDtNascimento();
    }

    public void setDtNascimentoIsSet(boolean value) {
        fichaProcedimentoChildThrift.setDtNascimentoIsSet(value);
    }

    public long getSexo() {
        return fichaProcedimentoChildThrift.getSexo();
    }

    public void setSexo(long sexo) {
        fichaProcedimentoChildThrift.setSexo(sexo);
    }

    public void unsetSexo() {
        fichaProcedimentoChildThrift.unsetSexo();
    }

    public boolean isSetSexo() {
        return fichaProcedimentoChildThrift.isSetSexo();
    }

    public void setSexoIsSet(boolean value) {
        fichaProcedimentoChildThrift.setSexoIsSet(value);
    }

    public long getLocalAtendimento() {
        return fichaProcedimentoChildThrift.getLocalAtendimento();
    }

    public void setLocalAtendimento(long localAtendimento) {
        fichaProcedimentoChildThrift.setLocalAtendimento(localAtendimento);
    }

    public void unsetLocalAtendimento() {
        fichaProcedimentoChildThrift.unsetLocalAtendimento();
    }

    public boolean isSetLocalAtendimento() {
        return fichaProcedimentoChildThrift.isSetLocalAtendimento();
    }

    public void setLocalAtendimentoIsSet(boolean value) {
        fichaProcedimentoChildThrift.setLocalAtendimentoIsSet(value);
    }

    public long getTurno() {
        return fichaProcedimentoChildThrift.getTurno();
    }

    public void setTurno(long turno) {
        fichaProcedimentoChildThrift.setTurno(turno);
    }

    public void unsetTurno() {
        fichaProcedimentoChildThrift.unsetTurno();
    }

    public boolean isSetTurno() {
        return fichaProcedimentoChildThrift.isSetTurno();
    }

    public void setTurnoIsSet(boolean value) {
        fichaProcedimentoChildThrift.setTurnoIsSet(value);
    }

    public boolean isStatusEscutaInicialOrientacao() {
        return fichaProcedimentoChildThrift.isStatusEscutaInicialOrientacao();
    }

    public void setStatusEscutaInicialOrientacao(boolean statusEscutaInicialOrientacao) {
        fichaProcedimentoChildThrift.setStatusEscutaInicialOrientacao(statusEscutaInicialOrientacao);
    }

    public void unsetStatusEscutaInicialOrientacao() {
        fichaProcedimentoChildThrift.unsetStatusEscutaInicialOrientacao();
    }

    public boolean isSetStatusEscutaInicialOrientacao() {
        return fichaProcedimentoChildThrift.isSetStatusEscutaInicialOrientacao();
    }

    public void setStatusEscutaInicialOrientacaoIsSet(boolean value) {
        fichaProcedimentoChildThrift.setStatusEscutaInicialOrientacaoIsSet(value);
    }

    public int getProcedimentosSize() {
        return fichaProcedimentoChildThrift.getProcedimentosSize();
    }

    public Iterator<String> getProcedimentosIterator() {
        return fichaProcedimentoChildThrift.getProcedimentosIterator();
    }

    public void addToProcedimentos(String elem) {
        fichaProcedimentoChildThrift.addToProcedimentos(elem);
    }

    public List<String> getProcedimentos() {
        return fichaProcedimentoChildThrift.getProcedimentos();
    }

    public void setProcedimentos(List<String> procedimentos) {
        fichaProcedimentoChildThrift.setProcedimentos(procedimentos);
    }

    public void unsetProcedimentos() {
        fichaProcedimentoChildThrift.unsetProcedimentos();
    }

    public boolean isSetProcedimentos() {
        return fichaProcedimentoChildThrift.isSetProcedimentos();
    }

    public void setProcedimentosIsSet(boolean value) {
        fichaProcedimentoChildThrift.setProcedimentosIsSet(value);
    }

    public int getOutrosSiaProcedimentosSize() {
        return fichaProcedimentoChildThrift.getOutrosSiaProcedimentosSize();
    }

    public Iterator<String> getOutrosSiaProcedimentosIterator() {
        return fichaProcedimentoChildThrift.getOutrosSiaProcedimentosIterator();
    }

    public void addToOutrosSiaProcedimentos(String elem) {
        fichaProcedimentoChildThrift.addToOutrosSiaProcedimentos(elem);
    }

    public List<String> getOutrosSiaProcedimentos() {
        return fichaProcedimentoChildThrift.getOutrosSiaProcedimentos();
    }

    public void setOutrosSiaProcedimentos(List<String> outrosSiaProcedimentos) {
        fichaProcedimentoChildThrift.setOutrosSiaProcedimentos(outrosSiaProcedimentos);
    }

    public void unsetOutrosSiaProcedimentos() {
        fichaProcedimentoChildThrift.unsetOutrosSiaProcedimentos();
    }

    public boolean isSetOutrosSiaProcedimentos() {
        return fichaProcedimentoChildThrift.isSetOutrosSiaProcedimentos();
    }

    public void setOutrosSiaProcedimentosIsSet(boolean value) {
        fichaProcedimentoChildThrift.setOutrosSiaProcedimentosIsSet(value);
    }


    public boolean equals(Object that) {
        return fichaProcedimentoChildThrift.equals(that);
    }

    public boolean equals(FichaProcedimentoChild that) {
        return fichaProcedimentoChildThrift.equals(that.getInstance());
    }

    public int hashCode() {
        return fichaProcedimentoChildThrift.hashCode();
    }

    public int compareTo(FichaProcedimentoChild other) {
        return fichaProcedimentoChildThrift.compareTo(other.getInstance());
    }

    public void read(TProtocol iprot) throws TException {
        fichaProcedimentoChildThrift.read(iprot);
    }

    public void write(TProtocol oprot) throws TException {
        fichaProcedimentoChildThrift.write(oprot);
    }

    public String toString() {
        return fichaProcedimentoChildThrift.toString();
    }

    public void validate() throws TException {
        fichaProcedimentoChildThrift.validate();
    }
}

