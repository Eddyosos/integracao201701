package com.github.Eddyosos.integracao20171.esus.cidadao;

import br.gov.saude.esus.thrift.definition.cidadao.EnderecoTransportThrift;
import com.github.eddyosos.e_sus_ab_factory.cidadao.IEnderecoTransport;

public class EnderecoTransport implements IEnderecoTransport {

    EnderecoTransportThrift instancia;

    public EnderecoTransport(){
        instancia = new EnderecoTransportThrift();
    }

    public EnderecoTransport(EnderecoTransportThrift instancia) {
        this.instancia = instancia;

    }

    @Override
    public void clear() {
        instancia.clear();
    }

    @Override
    public String getBairroNome() {
        return instancia.getBairroNome();
    }

    @Override
    public void setBairroNome(String bairroNome) {
        instancia.setBairroNome(bairroNome);
    }

    @Override
    public void unsetBairroNome() {
        instancia.unsetBairroNome();
    }

    @Override
    public boolean isSetBairroNome() {
        return instancia.isSetBairroNome();
    }

    @Override
    public void setBairroNomeIsSet(boolean value) {
        instancia.setBairroNomeIsSet(value);
    }

    @Override
    public String getBairroDne() {
        return instancia.getBairroDne();
    }

    @Override
    public void setBairroDne(String bairroDne) {
        instancia.setBairroDne(bairroDne);
    }

    @Override
    public void unsetBairroDne() {
        instancia.unsetBairroDne();
    }

    @Override
    public boolean isSetBairroDne() {
        return instancia.isSetBairroDne();
    }

    @Override
    public void setBairroDneIsSet(boolean value) {
        instancia.setBairroDneIsSet(value);
    }

    @Override
    public String getLocalidadeCep() {
        return instancia.getLocalidadeCep();
    }

    @Override
    public void setLocalidadeCep(String localidadeCep) {
        instancia.setLocalidadeCep(localidadeCep);
    }

    @Override
    public void unsetLocalidadeCep() {
        instancia.unsetLocalidadeCep();
    }

    @Override
    public boolean isSetLocalidadeCep() {
        return instancia.isSetLocalidadeCep();
    }

    @Override
    public void setLocalidadeCepIsSet(boolean value) {
        instancia.setLocalidadeCepIsSet(value);
    }

    @Override
    public String getLocalidadeDne() {
        return instancia.getLocalidadeDne();
    }

    @Override
    public void setLocalidadeDne(String localidadeDne) {
        instancia.setLocalidadeDne(localidadeDne);
    }

    @Override
    public void unsetLocalidadeDne() {
        instancia.unsetLocalidadeDne();
    }

    @Override
    public boolean isSetLocalidadeDne() {
        return instancia.isSetLocalidadeDne();
    }

    @Override
    public void setLocalidadeDneIsSet(boolean value) {
        instancia.setLocalidadeDneIsSet(value);
    }

    @Override
    public String getLocalidadeIbge() {
        return instancia.getLocalidadeIbge();
    }

    @Override
    public void setLocalidadeIbge(String localidadeIbge) {
        instancia.setLocalidadeIbge(localidadeIbge);
    }

    @Override
    public void unsetLocalidadeIbge() {
        instancia.unsetLocalidadeIbge();
    }

    @Override
    public boolean isSetLocalidadeIbge() {
        return instancia.isSetLocalidadeIbge();
    }

    @Override
    public void setLocalidadeIbgeIsSet(boolean value) {
        instancia.setLocalidadeIbgeIsSet(value);
    }

    @Override
    public String getComplemento() {
        return instancia.getComplemento();
    }

    @Override
    public void setComplemento(String complemento) {
        instancia.setComplemento(complemento);
    }

    @Override
    public void unsetComplemento() {
        instancia.unsetComplemento();
    }

    @Override
    public boolean isSetComplemento() {
        return instancia.isSetComplemento();
    }

    @Override
    public void setComplementoIsSet(boolean value) {
        instancia.setComplementoIsSet(value);
    }

    @Override
    public String getLogradouro() {
        return instancia.getLogradouro();
    }

    @Override
    public void setLogradouro(String logradouro) {
        instancia.setLogradouro(logradouro);
    }

    @Override
    public void unsetLogradouro() {
        instancia.unsetLogradouro();
    }

    @Override
    public boolean isSetLogradouro() {
        return instancia.isSetLogradouro();
    }

    @Override
    public void setLogradouroIsSet(boolean value) {
        instancia.setLogradouroIsSet(value);
    }

    @Override
    public String getLogradouroDne() {
        return instancia.getLogradouroDne();
    }

    @Override
    public void setLogradouroDne(String logradouroDne) {
        instancia.setLogradouroDne(logradouroDne);
    }

    @Override
    public void unsetLogradouroDne() {
        instancia.unsetLogradouroDne();
    }

    @Override
    public boolean isSetLogradouroDne() {
        return instancia.isSetLogradouroDne();
    }

    @Override
    public void setLogradouroDneIsSet(boolean value) {
        instancia.setLogradouroDneIsSet(value);
    }

    @Override
    public String getNumero() {
        return instancia.getNumero();
    }

    @Override
    public void setNumero(String numero) {
        instancia.setNumero(numero);
    }

    @Override
    public void unsetNumero() {
        instancia.unsetNumero();
    }

    @Override
    public boolean isSetNumero() {
        return instancia.isSetNumero();
    }

    @Override
    public void setNumeroIsSet(boolean value) {
        instancia.setNumeroIsSet(value);
    }

    @Override
    public String getPontoReferencia() {
        return instancia.getPontoReferencia();
    }

    @Override
    public void setPontoReferencia(String pontoReferencia) {
        instancia.setPontoReferencia(pontoReferencia);
    }

    @Override
    public void unsetPontoReferencia() {
        instancia.unsetPontoReferencia();
    }

    @Override
    public boolean isSetPontoReferencia() {
        return instancia.isSetPontoReferencia();
    }

    @Override
    public void setPontoReferenciaIsSet(boolean value) {
        instancia.setPontoReferenciaIsSet(value);
    }

    @Override
    public boolean isSemNumero() {
        return instancia.isSemNumero();
    }

    @Override
    public void setSemNumero(boolean semNumero) {
        instancia.setSemNumero(semNumero);
    }

    @Override
    public void unsetSemNumero() {
        instancia.unsetSemNumero();
    }

    @Override
    public boolean isSetSemNumero() {
        return instancia.isSetSemNumero();
    }

    @Override
    public void setSemNumeroIsSet(boolean value) {
        instancia.setSemNumeroIsSet(value);
    }

    @Override
    public String getUfSigla() {
        return instancia.getUfSigla();
    }

    @Override
    public void setUfSigla(String ufSigla) {
        instancia.setUfSigla(ufSigla);
    }

    @Override
    public void unsetUfSigla() {
        instancia.unsetUfSigla();
    }

    @Override
    public boolean isSetUfSigla() {
        return instancia.isSetUfSigla();
    }

    @Override
    public void setUfSiglaIsSet(boolean value) {
        instancia.setUfSiglaIsSet(value);
    }

    @Override
    public String getArea() {
        return instancia.getArea();
    }

    @Override
    public void setArea(String area) {
        instancia.setArea(area);
    }

    @Override
    public void unsetArea() {
        instancia.unsetArea();
    }

    @Override
    public boolean isSetArea() {
        return instancia.isSetArea();
    }

    @Override
    public void setAreaIsSet(boolean value) {
        instancia.setAreaIsSet(value);
    }

    @Override
    public String getMicroArea() {
        return instancia.getMicroArea();
    }

    @Override
    public void setMicroArea(String microArea) {
        instancia.setMicroArea(microArea);
    }

    @Override
    public void unsetMicroArea() {
        instancia.unsetMicroArea();
    }

    @Override
    public boolean isSetMicroArea() {
        return instancia.isSetMicroArea();
    }

    @Override
    public void setMicroAreaIsSet(boolean value) {
        instancia.setMicroAreaIsSet(value);
    }

    @Override
    public EnderecoTransportThrift getInstance() {
        return instancia;
    }

}
