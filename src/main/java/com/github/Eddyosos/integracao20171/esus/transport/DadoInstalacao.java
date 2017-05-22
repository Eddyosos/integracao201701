package com.github.Eddyosos.integracao20171.esus.transport;

import br.gov.saude.esus.transport.common.generated.thrift.DadoInstalacaoThrift;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;

public class DadoInstalacao {
    private DadoInstalacaoThrift instance;

    DadoInstalacaoThrift getInstance() {
        return instance;
    }

    public DadoInstalacao() {
        instance = new DadoInstalacaoThrift();
    }

    DadoInstalacao(DadoInstalacaoThrift instance) {
        this.instance = instance;
    }

    public void clear() {
        instance.clear();
    }

    public String getContraChave() {
        return instance.getContraChave();
    }

    public void setContraChave(String contraChave) {
        instance.setContraChave(contraChave);
    }

    public void unsetContraChave() {
        instance.unsetContraChave();
    }

    public boolean isSetContraChave() {
        return instance.isSetContraChave();
    }

    public void setContraChaveIsSet(boolean value) {
        instance.setContraChaveIsSet(value);
    }

    public String getUuidInstalacao() {
        return instance.getUuidInstalacao();
    }

    public void setUuidInstalacao(String uuidInstalacao) {
        instance.setUuidInstalacao(uuidInstalacao);
    }

    public void unsetUuidInstalacao() {
        instance.unsetUuidInstalacao();
    }

    public boolean isSetUuidInstalacao() {
        return instance.isSetUuidInstalacao();
    }

    public void setUuidInstalacaoIsSet(boolean value) {
        instance.setUuidInstalacaoIsSet(value);
    }

    public String getCpfOuCnpj() {
        return instance.getCpfOuCnpj();
    }

    public void setCpfOuCnpj(String cpfOuCnpj) {
        instance.setCpfOuCnpj(cpfOuCnpj);
    }

    public void unsetCpfOuCnpj() {
        instance.unsetCpfOuCnpj();
    }

    public boolean isSetCpfOuCnpj() {
        return instance.isSetCpfOuCnpj();
    }

    public void setCpfOuCnpjIsSet(boolean value) {
        instance.setCpfOuCnpjIsSet(value);
    }

    public String getNomeOuRazaoSocial() {
        return instance.getNomeOuRazaoSocial();
    }

    public void setNomeOuRazaoSocial(String nomeOuRazaoSocial) {
        instance.setNomeOuRazaoSocial(nomeOuRazaoSocial);
    }

    public void unsetNomeOuRazaoSocial() {
        instance.unsetNomeOuRazaoSocial();
    }

    public boolean isSetNomeOuRazaoSocial() {
        return instance.isSetNomeOuRazaoSocial();
    }

    public void setNomeOuRazaoSocialIsSet(boolean value) {
        instance.setNomeOuRazaoSocialIsSet(value);
    }

    public String getFone() {
        return instance.getFone();
    }

    public void setFone(String fone) {
        instance.setFone(fone);
    }

    public void unsetFone() {
        instance.unsetFone();
    }

    public boolean isSetFone() {
        return instance.isSetFone();
    }

    public void setFoneIsSet(boolean value) {
        instance.setFoneIsSet(value);
    }

    public String getEmail() {
        return instance.getEmail();
    }

    public void setEmail(String email) {
        instance.setEmail(email);
    }

    public void unsetEmail() {
        instance.unsetEmail();
    }

    public boolean isSetEmail() {
        return instance.isSetEmail();
    }

    public void setEmailIsSet(boolean value) {
        instance.setEmailIsSet(value);
    }

    public boolean equals(Object that) {
        return instance.equals(that);
    }

    public boolean equals(DadoInstalacao that) {
        return instance.equals(that.instance);
    }

    public int hashCode() {
        return instance.hashCode();
    }

    public int compareTo(DadoInstalacao other) {
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

