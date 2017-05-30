package com.github.Eddyosos.integracao20171.esus.cidadao;

import br.gov.saude.esus.thrift.definition.cidadao.EnderecoTransportThrift;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;

public class EnderecoTransport {

    EnderecoTransportThrift instancia = new EnderecoTransportThrift();

    public EnderecoTransport(EnderecoTransportThrift instancia) {
        this.instancia = instancia;

    }

    public EnderecoTransport deepCopy() {
        return new EnderecoTransport(instancia.deepCopy());
    }

    public void clear() {
        instancia.clear();
    }

    public String getBairroNome() {
        return instancia.getBairroNome();
    }

    public void setBairroNome(String bairroNome) {
        instancia.setBairroNome(bairroNome);
    }

    public void unsetBairroNome() {
        instancia.unsetBairroNome();
    }

    public boolean isSetBairroNome() {
        return instancia.isSetBairroNome();
    }

    public void setBairroNomeIsSet(boolean value) {
        instancia.setBairroNomeIsSet(value);
    }

    public String getBairroDne() {
        return instancia.getBairroDne();
    }

    public void setBairroDne(String bairroDne) {
        instancia.setBairroDne(bairroDne);
    }

    public void unsetBairroDne() {
        instancia.unsetBairroDne();
    }

    public boolean isSetBairroDne() {
        return instancia.isSetBairroDne();
    }

    public void setBairroDneIsSet(boolean value) {
        instancia.setBairroDneIsSet(value);
    }

    public String getLocalidadeCep() {
        return instancia.getLocalidadeCep();
    }

    public void setLocalidadeCep(String localidadeCep) {
        instancia.setLocalidadeCep(localidadeCep);
    }

    public void unsetLocalidadeCep() {
        instancia.unsetLocalidadeCep();
    }

    public boolean isSetLocalidadeCep() {
        return instancia.isSetLocalidadeCep();
    }

    public void setLocalidadeCepIsSet(boolean value) {
        instancia.setLocalidadeCepIsSet(value);
    }

    public String getLocalidadeDne() {
        return instancia.getLocalidadeDne();
    }

    public void setLocalidadeDne(String localidadeDne) {
        instancia.setLocalidadeDne(localidadeDne);
    }

    public void unsetLocalidadeDne() {
        instancia.unsetLocalidadeDne();
    }

    public boolean isSetLocalidadeDne() {
        return instancia.isSetLocalidadeDne();
    }

    public void setLocalidadeDneIsSet(boolean value) {
        instancia.setLocalidadeDneIsSet(value);
    }

    public String getLocalidadeIbge() {
        return instancia.getLocalidadeIbge();
    }

    public void setLocalidadeIbge(String localidadeIbge) {
        instancia.setLocalidadeIbge(localidadeIbge);
    }

    public void unsetLocalidadeIbge() {
        instancia.unsetLocalidadeIbge();
    }

    public boolean isSetLocalidadeIbge() {
        return instancia.isSetLocalidadeIbge();
    }

    public void setLocalidadeIbgeIsSet(boolean value) {
        instancia.setLocalidadeIbgeIsSet(value);
    }

    public String getComplemento() {
        return instancia.getComplemento();
    }

    public void setComplemento(String complemento) {
        instancia.setComplemento(complemento);
    }

    public void unsetComplemento() {
        instancia.unsetComplemento();
    }

    public boolean isSetComplemento() {
        return instancia.isSetComplemento();
    }

    public void setComplementoIsSet(boolean value) {
        instancia.setComplementoIsSet(value);
    }

    public String getLogradouro() {
        return instancia.getLogradouro();
    }

    public void setLogradouro(String logradouro) {
        instancia.setLogradouro(logradouro);
    }

    public void unsetLogradouro() {
        instancia.unsetLogradouro();
    }

    public boolean isSetLogradouro() {
        return instancia.isSetLogradouro();
    }

    public void setLogradouroIsSet(boolean value) {
        instancia.setLogradouroIsSet(value);
    }

    public String getLogradouroDne() {
        return instancia.getLogradouroDne();
    }

    public void setLogradouroDne(String logradouroDne) {
        instancia.setLogradouroDne(logradouroDne);
    }

    public void unsetLogradouroDne() {
        instancia.unsetLogradouroDne();
    }

    public boolean isSetLogradouroDne() {
        return instancia.isSetLogradouroDne();
    }

    public void setLogradouroDneIsSet(boolean value) {
        instancia.setLogradouroDneIsSet(value);
    }

    public String getNumero() {
        return instancia.getNumero();
    }

    public void setNumero(String numero) {
        instancia.setNumero(numero);
    }

    public void unsetNumero() {
        instancia.unsetNumero();
    }

    public boolean isSetNumero() {
        return instancia.isSetNumero();
    }

    public void setNumeroIsSet(boolean value) {
        instancia.setNumeroIsSet(value);
    }

    public String getPontoReferencia() {
        return instancia.getPontoReferencia();
    }

    public void setPontoReferencia(String pontoReferencia) {
        instancia.setPontoReferencia(pontoReferencia);
    }

    public void unsetPontoReferencia() {
        instancia.unsetPontoReferencia();
    }

    public boolean isSetPontoReferencia() {
        return instancia.isSetPontoReferencia();
    }

    public void setPontoReferenciaIsSet(boolean value) {
        instancia.setPontoReferenciaIsSet(value);
    }

    public boolean isSemNumero() {
        return instancia.isSemNumero();
    }

    public void setSemNumero(boolean semNumero) {
        instancia.setSemNumero(semNumero);
    }

    public void unsetSemNumero() {
        instancia.unsetSemNumero();
    }

    public boolean isSetSemNumero() {
        return instancia.isSetSemNumero();
    }

    public void setSemNumeroIsSet(boolean value) {
        instancia.setSemNumeroIsSet(value);
    }

    public String getUfSigla() {
        return instancia.getUfSigla();
    }

    public void setUfSigla(String ufSigla) {
        instancia.setUfSigla(ufSigla);
    }

    public void unsetUfSigla() {
        instancia.unsetUfSigla();
    }

    public boolean isSetUfSigla() {
        return instancia.isSetUfSigla();
    }

    public void setUfSiglaIsSet(boolean value) {
        instancia.setUfSiglaIsSet(value);
    }

    public String getArea() {
        return instancia.getArea();
    }

    public void setArea(String area) {
        instancia.setArea(area);
    }

    public void unsetArea() {
        instancia.unsetArea();
    }

    public boolean isSetArea() {
        return instancia.isSetArea();
    }

    public void setAreaIsSet(boolean value) {
        instancia.setAreaIsSet(value);
    }

    public String getMicroArea() {
        return instancia.getMicroArea();
    }

    public void setMicroArea(String microArea) {
        instancia.setMicroArea(microArea);
    }

    public void unsetMicroArea() {
        instancia.unsetMicroArea();
    }

    public boolean isSetMicroArea() {
        return instancia.isSetMicroArea();
    }

    public void setMicroAreaIsSet(boolean value) {
        instancia.setMicroAreaIsSet(value);
    }

    @Override
    public boolean equals(Object that) {
        return instancia.equals(that);
    }

    public boolean equals(EnderecoTransport that) {
        return instancia.equals(that.getInstance());
    }

    @Override
    public int hashCode() {
        return instancia.hashCode();
    }

    public int compareTo(EnderecoTransport other) {
        return instancia.compareTo(other.getInstance());
    }

    public void read(TProtocol iprot) throws TException {
        instancia.read(iprot);
    }

    public void write(TProtocol oprot) throws TException {
        instancia.write(oprot);
    }

    public String toString() {
        return instancia.toString();
    }

    public void validate() throws TException {
        instancia.validate();
    }

    protected EnderecoTransportThrift getInstance() {
        return instancia;
    }

}
