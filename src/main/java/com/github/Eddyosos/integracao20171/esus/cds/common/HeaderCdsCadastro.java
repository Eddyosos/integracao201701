package com.github.Eddyosos.integracao20171.esus.cds.common;

import br.gov.saude.esus.cds.transport.generated.thrift.common.HeaderCdsCadastroThrift;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;

public class HeaderCdsCadastro {
    private HeaderCdsCadastroThrift instance;

    
    public HeaderCdsCadastro() {
        instance = new HeaderCdsCadastroThrift();
    }

    //Devia ser protected
    public HeaderCdsCadastro(HeaderCdsCadastroThrift instance) {
        this.instance = instance;
    }
    
    //Devia ser protected
    public HeaderCdsCadastroThrift getInstance() {
        return instance;
    }

    public void clear() {
        instance.clear();
    }

    public String getCnesUnidadeSaude() {
        return instance.getCnesUnidadeSaude();
    }

    public void setCnesUnidadeSaude(String cnesUnidadeSaude) {
        instance.setCnesUnidadeSaude(cnesUnidadeSaude);
    }

    public void unsetCnesUnidadeSaude() {
        instance.unsetCnesUnidadeSaude();
    }

    public boolean isSetCnesUnidadeSaude() {
        return instance.isSetCnesUnidadeSaude();
    }

    public void setCnesUnidadeSaudeIsSet(boolean value) {
        instance.setCnesUnidadeSaudeIsSet(value);
    }

    public String getCnsProfissional() {
        return instance.getCnsProfissional();
    }

    public void setCnsProfissional(String cnsProfissional) {
        instance.setCnsProfissional(cnsProfissional);
    }

    public void unsetCnsProfissional() {
        instance.unsetCnsProfissional();
    }

    public boolean isSetCnsProfissional() {
        return instance.isSetCnsProfissional();
    }

    public void setCnsProfissionalIsSet(boolean value) {
        instance.setCnsProfissionalIsSet(value);
    }

    public String getCodigoIbgeMunicipio() {
        return instance.getCodigoIbgeMunicipio();
    }

    public void setCodigoIbgeMunicipio(String codigoIbgeMunicipio) {
        instance.setCodigoIbgeMunicipio(codigoIbgeMunicipio);
    }

    public void unsetCodigoIbgeMunicipio() {
        instance.unsetCodigoIbgeMunicipio();
    }

    public boolean isSetCodigoIbgeMunicipio() {
        return instance.isSetCodigoIbgeMunicipio();
    }

    public void setCodigoIbgeMunicipioIsSet(boolean value) {
        instance.setCodigoIbgeMunicipioIsSet(value);
    }

    public long getDataAtendimento() {
        return instance.getDataAtendimento();
    }

    public void setDataAtendimento(long dataAtendimento) {
        instance.setDataAtendimento(dataAtendimento);
    }

    public void unsetDataAtendimento() {
        instance.unsetDataAtendimento();
    }

    public boolean isSetDataAtendimento() {
        return instance.isSetDataAtendimento();
    }

    public void setDataAtendimentoIsSet(boolean value) {
        instance.setDataAtendimentoIsSet(value);
    }

    public String getIneEquipe() {
        return instance.getIneEquipe();
    }

    public void setIneEquipe(String ineEquipe) {
        instance.setIneEquipe(ineEquipe);
    }

    public void unsetIneEquipe() {
        instance.unsetIneEquipe();
    }

    public boolean isSetIneEquipe() {
        return instance.isSetIneEquipe();
    }

    public void setIneEquipeIsSet(boolean value) {
        instance.setIneEquipeIsSet(value);
    }

    public long getMicroarea() {
        return instance.getMicroarea();
    }

    public void setMicroarea(long microarea) {
        instance.setMicroarea(microarea);
    }

    public void unsetMicroarea() {
        instance.unsetMicroarea();
    }

    public boolean isSetMicroarea() {
        return instance.isSetMicroarea();
    }

    public void setMicroareaIsSet(boolean value) {
        instance.setMicroareaIsSet(value);
    }

    public boolean equals(Object that) {
        return instance.equals(that);
    }

    public boolean equals(HeaderCdsCadastro that) {
        return instance.equals(that.instance);
    }

    public int hashCode() {
        return instance.hashCode();
    }

    public int compareTo(HeaderCdsCadastro other) {
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

