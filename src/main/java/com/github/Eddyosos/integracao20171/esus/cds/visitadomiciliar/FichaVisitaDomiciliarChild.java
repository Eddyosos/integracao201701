package com.github.Eddyosos.integracao20171.esus.cds.visitadomiciliar;

import br.gov.saude.esus.cds.transport.generated.thrift.visitadomiciliar.FichaVisitaDomiciliarChildThrift;
import java.util.Iterator;
import java.util.List;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;

public class FichaVisitaDomiciliarChild {

    FichaVisitaDomiciliarChildThrift thrift = new FichaVisitaDomiciliarChildThrift();

    protected FichaVisitaDomiciliarChild(FichaVisitaDomiciliarChildThrift thrift) {
        this.thrift = thrift;
    }

    public FichaVisitaDomiciliarChild deepCopy() {
        return new FichaVisitaDomiciliarChild(thrift.deepCopy());
    }

    public void clear() {
        thrift.clear();
    }

    public long getTurno() {
        return thrift.getTurno();
    }

    public void setTurno(long turno) {
        thrift.setTurno(turno);
    }

    public void unsetTurno() {
        thrift.unsetTurno();
    }

    public boolean isSetTurno() {
        return thrift.isSetTurno();
    }

    public void setTurnoIsSet(boolean value) {
        thrift.setTurnoIsSet(value);
    }

    public String getNumProntuario() {
        return thrift.getNumProntuario();
    }

    public void setNumProntuario(String numProntuario) {
        thrift.setNumProntuario(numProntuario);
    }

    public void unsetNumProntuario() {
        thrift.unsetNumProntuario();
    }

    public boolean isSetNumProntuario() {
        return thrift.isSetNumProntuario();
    }

    public void setNumProntuarioIsSet(boolean value) {
        thrift.setNumProntuarioIsSet(value);
    }

    public String getNumCartaoSus() {
        return thrift.getNumCartaoSus();
    }

    public void setNumCartaoSus(String numCartaoSus) {
        thrift.setNumCartaoSus(numCartaoSus);
    }

    public void unsetNumCartaoSus() {
        thrift.unsetNumCartaoSus();
    }

    public boolean isSetNumCartaoSus() {
        return thrift.isSetNumCartaoSus();
    }

    public void setNumCartaoSusIsSet(boolean value) {
        thrift.setNumCartaoSusIsSet(value);
    }

    public long getDtNascimento() {
        return thrift.getDtNascimento();
    }

    public void setDtNascimento(long dtNascimento) {
        thrift.setDtNascimento(dtNascimento);
    }

    public void unsetDtNascimento() {
        thrift.unsetDtNascimento();
    }

    public boolean isSetDtNascimento() {
        return thrift.isSetDtNascimento();
    }

    public void setDtNascimentoIsSet(boolean value) {
        thrift.setDtNascimentoIsSet(value);
    }

    public long getSexo() {
        return thrift.getSexo();
    }

    public void setSexo(long sexo) {
        thrift.setSexo(sexo);
    }

    public void unsetSexo() {
        thrift.unsetSexo();
    }

    public boolean isSetSexo() {
        return thrift.isSetSexo();
    }

    public void setSexoIsSet(boolean value) {
        thrift.setSexoIsSet(value);
    }

    public boolean isStatusVisitaCompartilhadaOutroProfissional() {
        return thrift.isStatusVisitaCompartilhadaOutroProfissional();
    }

    public void setStatusVisitaCompartilhadaOutroProfissional(boolean statusVisitaCompartilhadaOutroProfissional) {
        thrift.setStatusVisitaCompartilhadaOutroProfissional(statusVisitaCompartilhadaOutroProfissional);
    }

    public void unsetStatusVisitaCompartilhadaOutroProfissional() {
        thrift.unsetStatusVisitaCompartilhadaOutroProfissional();
    }

    public boolean isSetStatusVisitaCompartilhadaOutroProfissional() {
        return thrift.isSetStatusVisitaCompartilhadaOutroProfissional();
    }

    public void setStatusVisitaCompartilhadaOutroProfissionalIsSet(boolean value) {
        thrift.setStatusVisitaCompartilhadaOutroProfissionalIsSet(value);
    }

    public int getMotivosVisitaSize() {
        return thrift.getMotivosVisitaSize();
    }

    public Iterator<Long> getMotivosVisitaIterator() {
        return thrift.getMotivosVisitaIterator();
    }

    public void addToMotivosVisita(long elem) {
        thrift.addToMotivosVisita(elem);
    }

    public List<Long> getMotivosVisita() {
        return thrift.getMotivosVisita();
    }

    public void setMotivosVisita(List<Long> motivosVisita) {
        thrift.setMotivosVisita(motivosVisita);
    }

    public void unsetMotivosVisita() {
        thrift.unsetMotivosVisita();
    }

    public boolean isSetMotivosVisita() {
        return thrift.isSetMotivosVisita();
    }

    public void setMotivosVisitaIsSet(boolean value) {
        thrift.setMotivosVisitaIsSet(value);
    }

    public long getDesfecho() {
        return thrift.getDesfecho();
    }

    public void setDesfecho(long desfecho) {
        thrift.setDesfecho(desfecho);
    }

    public void unsetDesfecho() {
        thrift.unsetDesfecho();
    }

    public boolean isSetDesfecho() {
        return thrift.isSetDesfecho();
    }

    public void setDesfechoIsSet(boolean value) {
        thrift.setDesfechoIsSet(value);
    }

    public boolean equals(Object that) {
        return thrift.equals(that);
    }

    public boolean equals(FichaVisitaDomiciliarChildThrift that) {
        return thrift.equals(that);
    }

    public int hashCode() {
        return thrift.hashCode();
    }

    public int compareTo(FichaVisitaDomiciliarChildThrift other) {
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

    protected FichaVisitaDomiciliarChildThrift getInstance() {
        return thrift;
    }

}
