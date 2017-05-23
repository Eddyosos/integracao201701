package com.github.Eddyosos.integracao20171.esus.cds.visitadomiciliar;

import br.gov.saude.esus.cds.transport.generated.thrift.visitadomiciliar.FichaVisitaDomiciliarChildThrift;
import java.util.Iterator;
import java.util.List;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;

public class FichaVisitaDomiciliarChild {

    FichaVisitaDomiciliarChildThrift instance = new FichaVisitaDomiciliarChildThrift();

    protected FichaVisitaDomiciliarChild(FichaVisitaDomiciliarChildThrift thrift) {
        this.instance = thrift;
    }

    public FichaVisitaDomiciliarChild deepCopy() {
        return new FichaVisitaDomiciliarChild(instance.deepCopy());
    }

    public void clear() {
        instance.clear();
    }

    public long getTurno() {
        return instance.getTurno();
    }

    public void setTurno(long turno) {
        instance.setTurno(turno);
    }

    public void unsetTurno() {
        instance.unsetTurno();
    }

    public boolean isSetTurno() {
        return instance.isSetTurno();
    }

    public void setTurnoIsSet(boolean value) {
        instance.setTurnoIsSet(value);
    }

    public String getNumProntuario() {
        return instance.getNumProntuario();
    }

    public void setNumProntuario(String numProntuario) {
        instance.setNumProntuario(numProntuario);
    }

    public void unsetNumProntuario() {
        instance.unsetNumProntuario();
    }

    public boolean isSetNumProntuario() {
        return instance.isSetNumProntuario();
    }

    public void setNumProntuarioIsSet(boolean value) {
        instance.setNumProntuarioIsSet(value);
    }

    public String getNumCartaoSus() {
        return instance.getNumCartaoSus();
    }

    public void setNumCartaoSus(String numCartaoSus) {
        instance.setNumCartaoSus(numCartaoSus);
    }

    public void unsetNumCartaoSus() {
        instance.unsetNumCartaoSus();
    }

    public boolean isSetNumCartaoSus() {
        return instance.isSetNumCartaoSus();
    }

    public void setNumCartaoSusIsSet(boolean value) {
        instance.setNumCartaoSusIsSet(value);
    }

    public long getDtNascimento() {
        return instance.getDtNascimento();
    }

    public void setDtNascimento(long dtNascimento) {
        instance.setDtNascimento(dtNascimento);
    }

    public void unsetDtNascimento() {
        instance.unsetDtNascimento();
    }

    public boolean isSetDtNascimento() {
        return instance.isSetDtNascimento();
    }

    public void setDtNascimentoIsSet(boolean value) {
        instance.setDtNascimentoIsSet(value);
    }

    public long getSexo() {
        return instance.getSexo();
    }

    public void setSexo(long sexo) {
        instance.setSexo(sexo);
    }

    public void unsetSexo() {
        instance.unsetSexo();
    }

    public boolean isSetSexo() {
        return instance.isSetSexo();
    }

    public void setSexoIsSet(boolean value) {
        instance.setSexoIsSet(value);
    }

    public boolean isStatusVisitaCompartilhadaOutroProfissional() {
        return instance.isStatusVisitaCompartilhadaOutroProfissional();
    }

    public void setStatusVisitaCompartilhadaOutroProfissional(boolean statusVisitaCompartilhadaOutroProfissional) {
        instance.setStatusVisitaCompartilhadaOutroProfissional(statusVisitaCompartilhadaOutroProfissional);
    }

    public void unsetStatusVisitaCompartilhadaOutroProfissional() {
        instance.unsetStatusVisitaCompartilhadaOutroProfissional();
    }

    public boolean isSetStatusVisitaCompartilhadaOutroProfissional() {
        return instance.isSetStatusVisitaCompartilhadaOutroProfissional();
    }

    public void setStatusVisitaCompartilhadaOutroProfissionalIsSet(boolean value) {
        instance.setStatusVisitaCompartilhadaOutroProfissionalIsSet(value);
    }

    public int getMotivosVisitaSize() {
        return instance.getMotivosVisitaSize();
    }

    public Iterator<Long> getMotivosVisitaIterator() {
        return instance.getMotivosVisitaIterator();
    }

    public void addToMotivosVisita(long elem) {
        instance.addToMotivosVisita(elem);
    }

    public List<Long> getMotivosVisita() {
        return instance.getMotivosVisita();
    }

    public void setMotivosVisita(List<Long> motivosVisita) {
        instance.setMotivosVisita(motivosVisita);
    }

    public void unsetMotivosVisita() {
        instance.unsetMotivosVisita();
    }

    public boolean isSetMotivosVisita() {
        return instance.isSetMotivosVisita();
    }

    public void setMotivosVisitaIsSet(boolean value) {
        instance.setMotivosVisitaIsSet(value);
    }

    public long getDesfecho() {
        return instance.getDesfecho();
    }

    public void setDesfecho(long desfecho) {
        instance.setDesfecho(desfecho);
    }

    public void unsetDesfecho() {
        instance.unsetDesfecho();
    }

    public boolean isSetDesfecho() {
        return instance.isSetDesfecho();
    }

    public void setDesfechoIsSet(boolean value) {
        instance.setDesfechoIsSet(value);
    }

    public boolean equals(Object that) {
        return instance.equals(that);
    }

    public boolean equals(FichaVisitaDomiciliarChild that) {
        return instance.equals(that.getInstance());
    }

    public int hashCode() {
        return instance.hashCode();
    }

    public int compareTo(FichaVisitaDomiciliarChild other) {
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

    protected FichaVisitaDomiciliarChildThrift getInstance() {
        return instance;
    }

}
