package com.github.Eddyosos.integracao20171.esus.cds.common;

import br.gov.saude.esus.cds.transport.generated.thrift.common.UnicaLotacaoHeaderThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.common.VariasLotacoesHeaderThrift;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;

public class VariasLotacoesHeader {
    private final VariasLotacoesHeaderThrift instance;

    public VariasLotacoesHeader() {
        instance = new VariasLotacoesHeaderThrift();
    }

    // Devia ser protected
    public VariasLotacoesHeader(VariasLotacoesHeaderThrift headerTransport) {
        instance = headerTransport;
    }
    // Devia ser protected
    public VariasLotacoesHeaderThrift getInstance() {
        return instance;
    }

    public void clear() {
        instance.clear();
    }

    public UnicaLotacaoHeader getLotacaoForm() {
        return new UnicaLotacaoHeader(instance.getLotacaoForm());
    }

    public void setLotacaoForm(UnicaLotacaoHeader lotacaoForm) {
        instance.setLotacaoForm(lotacaoForm.getInstance());
    }

    public void unsetLotacaoForm() {
        instance.unsetLotacaoForm();
    }

    public boolean isSetLotacaoForm() {
        return instance.isSetLotacaoForm();
    }

    public void setLotacaoFormIsSet(boolean value) {
        instance.setLotacaoFormIsSet(value);
    }

    public String getProfissionalCNS1() {
        return instance.getProfissionalCNS1();
    }

    public void setProfissionalCNS1(String profissionalCNS1) {
        instance.setProfissionalCNS1(profissionalCNS1);
    }

    public void unsetProfissionalCNS1() {
        instance.unsetProfissionalCNS1();
    }

    public boolean isSetProfissionalCNS1() {
        return instance.isSetProfissionalCNS1();
    }

    public void setProfissionalCNS1IsSet(boolean value) {
        instance.setProfissionalCNS1IsSet(value);
    }

    public String getCboCodigo_2002_1() {
        return instance.getCboCodigo_2002_1();
    }

    public void setCboCodigo_2002_1(String cboCodigo_2002_1) {
        instance.setCboCodigo_2002_1(cboCodigo_2002_1);
    }

    public void unsetCboCodigo_2002_1() {
        instance.unsetCboCodigo_2002_1();
    }

    public boolean isSetCboCodigo_2002_1() {
        return instance.isSetCboCodigo_2002_1();
    }

    public void setCboCodigo_2002_1IsSet(boolean value) {
        instance.setCboCodigo_2002_1IsSet(value);
    }

    public String getProfissionalCNS2() {
        return instance.getProfissionalCNS2();
    }

    public void setProfissionalCNS2(String profissionalCNS2) {
        instance.setProfissionalCNS2(profissionalCNS2);
    }

    public void unsetProfissionalCNS2() {
        instance.unsetProfissionalCNS2();
    }

    public boolean isSetProfissionalCNS2() {
        return instance.isSetProfissionalCNS2();
    }

    public void setProfissionalCNS2IsSet(boolean value) {
        instance.setProfissionalCNS2IsSet(value);
    }

    public String getCboCodigo_2002_2() {
        return instance.getCboCodigo_2002_2();
    }

    public void setCboCodigo_2002_2(String cboCodigo_2002_2) {
        instance.setCboCodigo_2002_2(cboCodigo_2002_2);
    }

    public void unsetCboCodigo_2002_2() {
        instance.unsetCboCodigo_2002_2();
    }

    public boolean isSetCboCodigo_2002_2() {
        return instance.isSetCboCodigo_2002_2();
    }

    public void setCboCodigo_2002_2IsSet(boolean value) {
        instance.setCboCodigo_2002_2IsSet(value);
    }

    public boolean equals(Object that) {
        return instance.equals(that);
    }

    public boolean equals(VariasLotacoesHeader that) {
        return instance.equals(that.instance);
    }

    public int hashCode() {
        return instance.hashCode();
    }

    public int compareTo(VariasLotacoesHeader other) {
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

