package com.github.Eddyosos.integracao20171.esus.cds.common;

import br.gov.saude.esus.cds.transport.generated.thrift.common.UnicaLotacaoHeaderThrift;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;

public class UnicaLotacaoHeader {
    private UnicaLotacaoHeaderThrift instance;

    public UnicaLotacaoHeader() {
        instance = new UnicaLotacaoHeaderThrift();
    }

    //Devia ser protected
    public UnicaLotacaoHeader(UnicaLotacaoHeaderThrift instance) {
        this.instance = instance;
    }

    //Devia ser protected
    public UnicaLotacaoHeaderThrift getInstance() {
        return instance;
    }

    public void clear() {
        instance.clear();
    }

    public String getProfissionalCNS() {
        return instance.getProfissionalCNS();
    }

    public void setProfissionalCNS(String profissionalCNS) {
        instance.setProfissionalCNS(profissionalCNS);
    }

    public void unsetProfissionalCNS() {
        instance.unsetProfissionalCNS();
    }

    public boolean isSetProfissionalCNS() {
        return instance.isSetProfissionalCNS();
    }

    public void setProfissionalCNSIsSet(boolean value) {
        instance.setProfissionalCNSIsSet(value);
    }

    public String getCboCodigo_2002() {
        return instance.getCboCodigo_2002();
    }

    public void setCboCodigo_2002(String cboCodigo_2002) {
        instance.setCboCodigo_2002(cboCodigo_2002);
    }

    public void unsetCboCodigo_2002() {
        instance.unsetCboCodigo_2002();
    }

    public boolean isSetCboCodigo_2002() {
        return instance.isSetCboCodigo_2002();
    }

    public void setCboCodigo_2002IsSet(boolean value) {
        instance.setCboCodigo_2002IsSet(value);
    }

    public String getCnes() {
        return instance.getCnes();
    }

    public void setCnes(String cnes) {
        instance.setCnes(cnes);
    }

    public void unsetCnes() {
        instance.unsetCnes();
    }

    public boolean isSetCnes() {
        return instance.isSetCnes();
    }

    public void setCnesIsSet(boolean value) {
        instance.setCnesIsSet(value);
    }

    public String getIne() {
        return instance.getIne();
    }

    public void setIne(String ine) {
        instance.setIne(ine);
    }

    public void unsetIne() {
        instance.unsetIne();
    }

    public boolean isSetIne() {
        return instance.isSetIne();
    }

    public void setIneIsSet(boolean value) {
        instance.setIneIsSet(value);
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


    public boolean equals(Object that) {
        return instance.equals(that);
    }

    public boolean equals(UnicaLotacaoHeader that) {
        return instance.equals(that.instance);
    }

    public int hashCode() {
        return instance.hashCode();
    }

    public int compareTo(UnicaLotacaoHeader other) {
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

