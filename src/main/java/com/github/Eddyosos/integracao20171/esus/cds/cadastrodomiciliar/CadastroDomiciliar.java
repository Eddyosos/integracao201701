package com.github.Eddyosos.integracao20171.esus.cds.cadastrodomiciliar;

import br.gov.saude.esus.cds.transport.generated.thrift.cadastrodomiciliar.CadastroDomiciliarThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.cadastrodomiciliar.FamiliaRowThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.common.EnderecoLocalPermanenciaThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.common.HeaderCdsCadastroThrift;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.thrift.TException;

public class CadastroDomiciliar {
    private CadastroDomiciliarThrift cadastroDomiciliarThrift = new CadastroDomiciliarThrift();

    public int getAnimaisNoDomicilioSize() {
        return cadastroDomiciliarThrift.getAnimaisNoDomicilioSize();
    }

    public Iterator<Long> getAnimaisNoDomicilioIterator() {
        return cadastroDomiciliarThrift.getAnimaisNoDomicilioIterator();
    }

    public void addToAnimaisNoDomicilio(long elem) {
        cadastroDomiciliarThrift.addToAnimaisNoDomicilio(elem);
    }

    public List<Long> getAnimaisNoDomicilio() {
        return cadastroDomiciliarThrift.getAnimaisNoDomicilio();
    }

    public void setAnimaisNoDomicilio(List<Long> animaisNoDomicilio) {
        cadastroDomiciliarThrift.setAnimaisNoDomicilio(animaisNoDomicilio);
    }

    public void unsetAnimaisNoDomicilio() {
        cadastroDomiciliarThrift.unsetAnimaisNoDomicilio();
    }

    public boolean isSetAnimaisNoDomicilio() {
        return cadastroDomiciliarThrift.isSetAnimaisNoDomicilio();
    }

    public void setAnimaisNoDomicilioIsSet(boolean value) {
        cadastroDomiciliarThrift.setAnimaisNoDomicilioIsSet(value);
    }

    public CondicaoMoradia getCondicaoMoradia() {
        return new CondicaoMoradia(cadastroDomiciliarThrift.getCondicaoMoradia());
    }

    public void setCondicaoMoradia(CondicaoMoradia condicaoMoradia) {
        cadastroDomiciliarThrift.setCondicaoMoradia(condicaoMoradia.getInstence());
    }

    public void unsetCondicaoMoradia() {
        cadastroDomiciliarThrift.unsetCondicaoMoradia();
    }

    public boolean isSetCondicaoMoradia() {
        return cadastroDomiciliarThrift.isSetCondicaoMoradia();
    }

    public void setCondicaoMoradiaIsSet(boolean value) {
        cadastroDomiciliarThrift.setCondicaoMoradiaIsSet(value);
    }

    public HeaderCdsCadastroThrift getDadosGerais() {
        return cadastroDomiciliarThrift.getDadosGerais();
    }

    public void setDadosGerais(HeaderCdsCadastroThrift dadosGerais) {
        cadastroDomiciliarThrift.setDadosGerais(dadosGerais);
    }

    public void unsetDadosGerais() {
        cadastroDomiciliarThrift.unsetDadosGerais();
    }

    public boolean isSetDadosGerais() {
        return cadastroDomiciliarThrift.isSetDadosGerais();
    }

    public void setDadosGeraisIsSet(boolean value) {
        cadastroDomiciliarThrift.setDadosGeraisIsSet(value);
    }

    public EnderecoLocalPermanenciaThrift getEnderecoLocalPermanencia() {
        return cadastroDomiciliarThrift.getEnderecoLocalPermanencia();
    }

    public void setEnderecoLocalPermanencia(EnderecoLocalPermanenciaThrift enderecoLocalPermanencia) {
        cadastroDomiciliarThrift.setEnderecoLocalPermanencia(enderecoLocalPermanencia);
    }

    public void unsetEnderecoLocalPermanencia() {
        cadastroDomiciliarThrift.unsetEnderecoLocalPermanencia();
    }

    public boolean isSetEnderecoLocalPermanencia() {
        return cadastroDomiciliarThrift.isSetEnderecoLocalPermanencia();
    }

    public void setEnderecoLocalPermanenciaIsSet(boolean value) {
        cadastroDomiciliarThrift.setEnderecoLocalPermanenciaIsSet(value);
    }

    public int getFamiliasSize() {
        return cadastroDomiciliarThrift.getFamiliasSize();
    }

    public Iterator<FamiliaRow> getFamiliasIterator() {
        List<FamiliaRow> list = new LinkedList<>();
        cadastroDomiciliarThrift.getFamiliasIterator().forEachRemaining((t) -> {
            list.add(new FamiliaRow(t));
        });
        return list.iterator();
    }

    public void addToFamilias(FamiliaRow elem) {
        cadastroDomiciliarThrift.addToFamilias(elem.getInstance());
    }

    public List<FamiliaRow> getFamilias() {
        List<FamiliaRow> lista = new LinkedList<>();
        cadastroDomiciliarThrift.getFamilias().forEach((t) -> {
            lista.add(new FamiliaRow(t));
        });
        return lista;
    }

    public void setFamilias(List<FamiliaRow> familias) {
        List<FamiliaRowThrift> listaFamilias = new LinkedList<>();
        familias.forEach((t) -> {
            listaFamilias.add(t.getInstance());
        });
        cadastroDomiciliarThrift.setFamilias(listaFamilias);
    }

    public void unsetFamilias() {
        cadastroDomiciliarThrift.unsetFamilias();
    }

    public boolean isSetFamilias() {
        return cadastroDomiciliarThrift.isSetFamilias();
    }

    public void setFamiliasIsSet(boolean value) {
        cadastroDomiciliarThrift.setFamiliasIsSet(value);
    }

    public boolean isFichaAtualizada() {
        return cadastroDomiciliarThrift.isFichaAtualizada();
    }

    public void setFichaAtualizada(boolean fichaAtualizada) {
        cadastroDomiciliarThrift.setFichaAtualizada(fichaAtualizada);
    }

    public void unsetFichaAtualizada() {
        cadastroDomiciliarThrift.unsetFichaAtualizada();
    }

    public boolean isSetFichaAtualizada() {
        return cadastroDomiciliarThrift.isSetFichaAtualizada();
    }

    public void setFichaAtualizadaIsSet(boolean value) {
        cadastroDomiciliarThrift.setFichaAtualizadaIsSet(value);
    }

    public String getQuantosAnimaisNoDomicilio() {
        return cadastroDomiciliarThrift.getQuantosAnimaisNoDomicilio();
    }

    public void setQuantosAnimaisNoDomicilio(String quantosAnimaisNoDomicilio) {
        cadastroDomiciliarThrift.setQuantosAnimaisNoDomicilio(quantosAnimaisNoDomicilio);
    }

    public void unsetQuantosAnimaisNoDomicilio() {
        cadastroDomiciliarThrift.unsetQuantosAnimaisNoDomicilio();
    }

    public boolean isSetQuantosAnimaisNoDomicilio() {
        return cadastroDomiciliarThrift.isSetQuantosAnimaisNoDomicilio();
    }

    public void setQuantosAnimaisNoDomicilioIsSet(boolean value) {
        cadastroDomiciliarThrift.setQuantosAnimaisNoDomicilioIsSet(value);
    }

    public boolean isStAnimaisNoDomicilio() {
        return cadastroDomiciliarThrift.isStAnimaisNoDomicilio();
    }

    public void setStAnimaisNoDomicilio(boolean stAnimaisNoDomicilio) {
        cadastroDomiciliarThrift.setStAnimaisNoDomicilio(stAnimaisNoDomicilio);
    }

    public void unsetStAnimaisNoDomicilio() {
        cadastroDomiciliarThrift.unsetStAnimaisNoDomicilio();
    }

    public boolean isSetStAnimaisNoDomicilio() {
        return cadastroDomiciliarThrift.isSetStAnimaisNoDomicilio();
    }

    public void setStAnimaisNoDomicilioIsSet(boolean value) {
        cadastroDomiciliarThrift.setStAnimaisNoDomicilioIsSet(value);
    }

    public boolean isStatusTermoRecusaCadastroDomiciliarAtencaoBasica() {
        return cadastroDomiciliarThrift.isStatusTermoRecusaCadastroDomiciliarAtencaoBasica();
    }

    public void setStatusTermoRecusaCadastroDomiciliarAtencaoBasica(boolean statusTermoRecusaCadastroDomiciliarAtencaoBasica) {
        cadastroDomiciliarThrift.setStatusTermoRecusaCadastroDomiciliarAtencaoBasica(statusTermoRecusaCadastroDomiciliarAtencaoBasica);
    }

    public void unsetStatusTermoRecusaCadastroDomiciliarAtencaoBasica() {
        cadastroDomiciliarThrift.unsetStatusTermoRecusaCadastroDomiciliarAtencaoBasica();
    }

    public boolean isSetStatusTermoRecusaCadastroDomiciliarAtencaoBasica() {
        return cadastroDomiciliarThrift.isSetStatusTermoRecusaCadastroDomiciliarAtencaoBasica();
    }

    public void setStatusTermoRecusaCadastroDomiciliarAtencaoBasicaIsSet(boolean value) {
        cadastroDomiciliarThrift.setStatusTermoRecusaCadastroDomiciliarAtencaoBasicaIsSet(value);
    }

    public int getTpCdsOrigem() {
        return cadastroDomiciliarThrift.getTpCdsOrigem();
    }

    public void setTpCdsOrigem(int tpCdsOrigem) {
        cadastroDomiciliarThrift.setTpCdsOrigem(tpCdsOrigem);
    }

    public void unsetTpCdsOrigem() {
        cadastroDomiciliarThrift.unsetTpCdsOrigem();
    }

    public boolean isSetTpCdsOrigem() {
        return cadastroDomiciliarThrift.isSetTpCdsOrigem();
    }

    public void setTpCdsOrigemIsSet(boolean value) {
        cadastroDomiciliarThrift.setTpCdsOrigemIsSet(value);
    }

    public String getUuid() {
        return cadastroDomiciliarThrift.getUuid();
    }

    public void setUuid(String uuid) {
        cadastroDomiciliarThrift.setUuid(uuid);
    }

    public void unsetUuid() {
        cadastroDomiciliarThrift.unsetUuid();
    }

    public boolean isSetUuid() {
        return cadastroDomiciliarThrift.isSetUuid();
    }

    public void setUuidIsSet(boolean value) {
        cadastroDomiciliarThrift.setUuidIsSet(value);
    }

    public String getUuidFichaOriginadora() {
        return cadastroDomiciliarThrift.getUuidFichaOriginadora();
    }

    public void setUuidFichaOriginadora(String uuidFichaOriginadora) {
        cadastroDomiciliarThrift.setUuidFichaOriginadora(uuidFichaOriginadora);
    }

    public void unsetUuidFichaOriginadora() {
        cadastroDomiciliarThrift.unsetUuidFichaOriginadora();
    }

    public boolean isSetUuidFichaOriginadora() {
        return cadastroDomiciliarThrift.isSetUuidFichaOriginadora();
    }

    public void setUuidFichaOriginadoraIsSet(boolean value) {
        cadastroDomiciliarThrift.setUuidFichaOriginadoraIsSet(value);
    }

    public void setFieldValue(CadastroDomiciliarThrift._Fields field, Object value) {
        cadastroDomiciliarThrift.setFieldValue(field, value);
    }

    public boolean isSet(CadastroDomiciliarThrift._Fields field) {
        return cadastroDomiciliarThrift.isSet(field);
    }

    public int compareTo(CadastroDomiciliarThrift other) {
        return cadastroDomiciliarThrift.compareTo(other);
    }

    public void validate() throws TException {
        cadastroDomiciliarThrift.validate();
    }
    
    
}

