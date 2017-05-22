package com.github.Eddyosos.integracao20171.esus.cds.atividadeindividual;

import br.gov.saude.esus.cds.transport.generated.thrift.atividadeindividual.OutrosSiaThrift;
import java.util.Iterator;
import java.util.List;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;

public class OutrosSia {

    private final OutrosSiaThrift instance;

    public OutrosSia() {
        instance = new OutrosSiaThrift();
    }
    
    OutrosSia(OutrosSiaThrift thrift) {
        instance = thrift;
    }

    OutrosSiaThrift getInstance() {
        return instance;
    }

    public OutrosSiaThrift deepCopy() {
        return instance.deepCopy();
    }

    public void clear() {
        instance.clear();
    }

    public String getCodigoExame() {
        return instance.getCodigoExame();
    }

    public void setCodigoExame(String codigoExame) {
        instance.setCodigoExame(codigoExame);
    }

    public void unsetCodigoExame() {
        instance.unsetCodigoExame();
    }

    public boolean isSetCodigoExame() {
        return instance.isSetCodigoExame();
    }

    public void setCodigoExameIsSet(boolean value) {
        instance.setCodigoExameIsSet(value);
    }

    public int getSolicitadoAvaliadoSize() {
        return instance.getSolicitadoAvaliadoSize();
    }

    public Iterator<String> getSolicitadoAvaliadoIterator() {
        return instance.getSolicitadoAvaliadoIterator();
    }

    public void addToSolicitadoAvaliado(String elem) {
        instance.addToSolicitadoAvaliado(elem);
    }

    public List<String> getSolicitadoAvaliado() {
        return instance.getSolicitadoAvaliado();
    }

    public void setSolicitadoAvaliado(List<String> solicitadoAvaliado) {
        instance.setSolicitadoAvaliado(solicitadoAvaliado);
    }

    public void unsetSolicitadoAvaliado() {
        instance.unsetSolicitadoAvaliado();
    }

    public boolean isSetSolicitadoAvaliado() {
        return instance.isSetSolicitadoAvaliado();
    }

    public void setSolicitadoAvaliadoIsSet(boolean value) {
        instance.setSolicitadoAvaliadoIsSet(value);
    }

    public boolean equals(Object that) {
        return instance.equals(that);
    }

    public boolean equals(OutrosSia that) {
        return instance.equals(that.instance);
    }

    public int hashCode() {
        return instance.hashCode();
    }

    public int compareTo(OutrosSia other) {
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

