package com.github.Eddyosos.integracao20171.esus.transport;

import br.gov.saude.esus.transport.common.api.configuracaodestino.VersaoThrift;
import br.gov.saude.esus.transport.common.generated.thrift.DadoTransporteThrift;
import java.nio.ByteBuffer;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;

public class DadoTransporte {
    private DadoTransporteThrift instance;

    DadoTransporte(DadoTransporteThrift instance) {
        this.instance = instance;
    }

    public DadoTransporte() {
        instance = new DadoTransporteThrift();
    }

    public void clear() {
        instance.clear();
    }

    public String getUuidDadoSerializado() {
        return instance.getUuidDadoSerializado();
    }

    public void setUuidDadoSerializado(String uuidDadoSerializado) {
        instance.setUuidDadoSerializado(uuidDadoSerializado);
    }

    public void unsetUuidDadoSerializado() {
        instance.unsetUuidDadoSerializado();
    }

    public boolean isSetUuidDadoSerializado() {
        return instance.isSetUuidDadoSerializado();
    }

    public void setUuidDadoSerializadoIsSet(boolean value) {
        instance.setUuidDadoSerializadoIsSet(value);
    }

    public long getTipoDadoSerializado() {
        return instance.getTipoDadoSerializado();
    }

    public void setTipoDadoSerializado(long tipoDadoSerializado) {
        instance.setTipoDadoSerializado(tipoDadoSerializado);
    }

    public void unsetTipoDadoSerializado() {
        instance.unsetTipoDadoSerializado();
    }

    public boolean isSetTipoDadoSerializado() {
        return instance.isSetTipoDadoSerializado();
    }

    public void setTipoDadoSerializadoIsSet(boolean value) {
        instance.setTipoDadoSerializadoIsSet(value);
    }

    public String getCnesDadoSerializado() {
        return instance.getCnesDadoSerializado();
    }

    public void setCnesDadoSerializado(String cnesDadoSerializado) {
        instance.setCnesDadoSerializado(cnesDadoSerializado);
    }

    public void unsetCnesDadoSerializado() {
        instance.unsetCnesDadoSerializado();
    }

    public boolean isSetCnesDadoSerializado() {
        return instance.isSetCnesDadoSerializado();
    }

    public void setCnesDadoSerializadoIsSet(boolean value) {
        instance.setCnesDadoSerializadoIsSet(value);
    }

    public String getCodIbge() {
        return instance.getCodIbge();
    }

    public void setCodIbge(String codIbge) {
        instance.setCodIbge(codIbge);
    }

    public void unsetCodIbge() {
        instance.unsetCodIbge();
    }

    public boolean isSetCodIbge() {
        return instance.isSetCodIbge();
    }

    public void setCodIbgeIsSet(boolean value) {
        instance.setCodIbgeIsSet(value);
    }

    public String getIneDadoSerializado() {
        return instance.getIneDadoSerializado();
    }

    public void setIneDadoSerializado(String ineDadoSerializado) {
        instance.setIneDadoSerializado(ineDadoSerializado);
    }

    public void unsetIneDadoSerializado() {
        instance.unsetIneDadoSerializado();
    }

    public boolean isSetIneDadoSerializado() {
        return instance.isSetIneDadoSerializado();
    }

    public void setIneDadoSerializadoIsSet(boolean value) {
        instance.setIneDadoSerializadoIsSet(value);
    }

    public long getNumLote() {
        return instance.getNumLote();
    }

    public void setNumLote(long numLote) {
        instance.setNumLote(numLote);
    }

    public void unsetNumLote() {
        instance.unsetNumLote();
    }

    public boolean isSetNumLote() {
        return instance.isSetNumLote();
    }

    public void setNumLoteIsSet(boolean value) {
        instance.setNumLoteIsSet(value);
    }

    public byte[] getDadoSerializado() {
        return instance.getDadoSerializado();
    }

    public ByteBuffer bufferForDadoSerializado() {
        return instance.bufferForDadoSerializado();
    }

    public void setDadoSerializado(byte[] dadoSerializado) {
        instance.setDadoSerializado(dadoSerializado);
    }

    public void setDadoSerializado(ByteBuffer dadoSerializado) {
        instance.setDadoSerializado(dadoSerializado);
    }

    public void unsetDadoSerializado() {
        instance.unsetDadoSerializado();
    }

    public boolean isSetDadoSerializado() {
        return instance.isSetDadoSerializado();
    }

    public void setDadoSerializadoIsSet(boolean value) {
        instance.setDadoSerializadoIsSet(value);
    }

    public DadoInstalacao getRemetente() {
        return new DadoInstalacao(instance.getRemetente());
    }

    public void setRemetente(DadoInstalacao remetente) {
        instance.setRemetente(remetente.getInstance());
    }

    public void unsetRemetente() {
        instance.unsetRemetente();
    }

    public boolean isSetRemetente() {
        return instance.isSetRemetente();
    }

    public void setRemetenteIsSet(boolean value) {
        instance.setRemetenteIsSet(value);
    }

    public DadoInstalacao getOriginadora() {
        return new DadoInstalacao(instance.getOriginadora());
    }

    public void setOriginadora(DadoInstalacao originadora) {
        instance.setOriginadora(originadora.getInstance());
    }

    public void unsetOriginadora() {
        instance.unsetOriginadora();
    }

    public boolean isSetOriginadora() {
        return instance.isSetOriginadora();
    }

    public void setOriginadoraIsSet(boolean value) {
        instance.setOriginadoraIsSet(value);
    }

    public VersaoThrift getVersao() {
        return instance.getVersao();
    }

    public void setVersao(VersaoThrift versao) {
        instance.setVersao(versao);
    }

    public void unsetVersao() {
        instance.unsetVersao();
    }

    public boolean isSetVersao() {
        return instance.isSetVersao();
    }

    public void setVersaoIsSet(boolean value) {
        instance.setVersaoIsSet(value);
    }

    public boolean equals(Object that) {
        return instance.equals(that);
    }

    public boolean equals(DadoTransporte that) {
        return instance.equals(that.instance);
    }

    public int hashCode() {
        return instance.hashCode();
    }

    public int compareTo(DadoTransporte other) {
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

