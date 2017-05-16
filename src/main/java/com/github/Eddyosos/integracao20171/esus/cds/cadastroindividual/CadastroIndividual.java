package com.github.Eddyosos.integracao20171.esus.cds.cadastroindividual;

import br.gov.saude.esus.cds.transport.generated.thrift.cadastroindividual.CadastroIndividualThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.cadastroindividual.CondicoesDeSaudeThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.cadastroindividual.EmSituacaoDeRuaThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.cadastroindividual.IdentificacaoUsuarioCidadaoThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.cadastroindividual.InformacoesSocioDemograficasThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.common.HeaderCdsCadastroThrift;
import org.apache.thrift.TException;

public class CadastroIndividual {
    private CadastroIndividualThrift cadastroIndividualTrift = new CadastroIndividualThrift();

    public CondicoesDeSaudeThrift getCondicoesDeSaude() {
        return cadastroIndividualTrift.getCondicoesDeSaude();
    }

    public void setCondicoesDeSaude(CondicoesDeSaudeThrift condicoesDeSaude) {
        cadastroIndividualTrift.setCondicoesDeSaude(condicoesDeSaude);
    }

    public void unsetCondicoesDeSaude() {
        cadastroIndividualTrift.unsetCondicoesDeSaude();
    }

    public boolean isSetCondicoesDeSaude() {
        return cadastroIndividualTrift.isSetCondicoesDeSaude();
    }

    public void setCondicoesDeSaudeIsSet(boolean value) {
        cadastroIndividualTrift.setCondicoesDeSaudeIsSet(value);
    }

    public HeaderCdsCadastroThrift getDadosGerais() {
        return cadastroIndividualTrift.getDadosGerais();
    }

    public void setDadosGerais(HeaderCdsCadastroThrift dadosGerais) {
        cadastroIndividualTrift.setDadosGerais(dadosGerais);
    }

    public void unsetDadosGerais() {
        cadastroIndividualTrift.unsetDadosGerais();
    }

    public boolean isSetDadosGerais() {
        return cadastroIndividualTrift.isSetDadosGerais();
    }

    public void setDadosGeraisIsSet(boolean value) {
        cadastroIndividualTrift.setDadosGeraisIsSet(value);
    }

    public EmSituacaoDeRuaThrift getEmSituacaoDeRua() {
        return cadastroIndividualTrift.getEmSituacaoDeRua();
    }

    public void setEmSituacaoDeRua(EmSituacaoDeRuaThrift emSituacaoDeRua) {
        cadastroIndividualTrift.setEmSituacaoDeRua(emSituacaoDeRua);
    }

    public void unsetEmSituacaoDeRua() {
        cadastroIndividualTrift.unsetEmSituacaoDeRua();
    }

    public boolean isSetEmSituacaoDeRua() {
        return cadastroIndividualTrift.isSetEmSituacaoDeRua();
    }

    public void setEmSituacaoDeRuaIsSet(boolean value) {
        cadastroIndividualTrift.setEmSituacaoDeRuaIsSet(value);
    }

    public boolean isFichaAtualizada() {
        return cadastroIndividualTrift.isFichaAtualizada();
    }

    public void setFichaAtualizada(boolean fichaAtualizada) {
        cadastroIndividualTrift.setFichaAtualizada(fichaAtualizada);
    }

    public void unsetFichaAtualizada() {
        cadastroIndividualTrift.unsetFichaAtualizada();
    }

    public boolean isSetFichaAtualizada() {
        return cadastroIndividualTrift.isSetFichaAtualizada();
    }

    public void setFichaAtualizadaIsSet(boolean value) {
        cadastroIndividualTrift.setFichaAtualizadaIsSet(value);
    }

    public IdentificacaoUsuarioCidadaoThrift getIdentificacaoUsuarioCidadao() {
        return cadastroIndividualTrift.getIdentificacaoUsuarioCidadao();
    }

    public void setIdentificacaoUsuarioCidadao(IdentificacaoUsuarioCidadaoThrift identificacaoUsuarioCidadao) {
        cadastroIndividualTrift.setIdentificacaoUsuarioCidadao(identificacaoUsuarioCidadao);
    }

    public void unsetIdentificacaoUsuarioCidadao() {
        cadastroIndividualTrift.unsetIdentificacaoUsuarioCidadao();
    }

    public boolean isSetIdentificacaoUsuarioCidadao() {
        return cadastroIndividualTrift.isSetIdentificacaoUsuarioCidadao();
    }

    public void setIdentificacaoUsuarioCidadaoIsSet(boolean value) {
        cadastroIndividualTrift.setIdentificacaoUsuarioCidadaoIsSet(value);
    }

    public InformacoesSocioDemograficasThrift getInformacoesSocioDemograficas() {
        return cadastroIndividualTrift.getInformacoesSocioDemograficas();
    }

    public void setInformacoesSocioDemograficas(InformacoesSocioDemograficasThrift informacoesSocioDemograficas) {
        cadastroIndividualTrift.setInformacoesSocioDemograficas(informacoesSocioDemograficas);
    }

    public void unsetInformacoesSocioDemograficas() {
        cadastroIndividualTrift.unsetInformacoesSocioDemograficas();
    }

    public boolean isSetInformacoesSocioDemograficas() {
        return cadastroIndividualTrift.isSetInformacoesSocioDemograficas();
    }

    public void setInformacoesSocioDemograficasIsSet(boolean value) {
        cadastroIndividualTrift.setInformacoesSocioDemograficasIsSet(value);
    }

    public boolean isStatusTermoRecusaCadastroIndividualAtencaoBasica() {
        return cadastroIndividualTrift.isStatusTermoRecusaCadastroIndividualAtencaoBasica();
    }

    public void setStatusTermoRecusaCadastroIndividualAtencaoBasica(boolean statusTermoRecusaCadastroIndividualAtencaoBasica) {
        cadastroIndividualTrift.setStatusTermoRecusaCadastroIndividualAtencaoBasica(statusTermoRecusaCadastroIndividualAtencaoBasica);
    }

    public void unsetStatusTermoRecusaCadastroIndividualAtencaoBasica() {
        cadastroIndividualTrift.unsetStatusTermoRecusaCadastroIndividualAtencaoBasica();
    }

    public boolean isSetStatusTermoRecusaCadastroIndividualAtencaoBasica() {
        return cadastroIndividualTrift.isSetStatusTermoRecusaCadastroIndividualAtencaoBasica();
    }

    public void setStatusTermoRecusaCadastroIndividualAtencaoBasicaIsSet(boolean value) {
        cadastroIndividualTrift.setStatusTermoRecusaCadastroIndividualAtencaoBasicaIsSet(value);
    }

    public void setTpCdsOrigem(int tpCdsOrigem) {
        cadastroIndividualTrift.setTpCdsOrigem(tpCdsOrigem);
    }

    public void unsetTpCdsOrigem() {
        cadastroIndividualTrift.unsetTpCdsOrigem();
    }

    public boolean isSetTpCdsOrigem() {
        return cadastroIndividualTrift.isSetTpCdsOrigem();
    }

    public void setTpCdsOrigemIsSet(boolean value) {
        cadastroIndividualTrift.setTpCdsOrigemIsSet(value);
    }

    public String getUuid() {
        return cadastroIndividualTrift.getUuid();
    }

    public void setUuid(String uuid) {
        cadastroIndividualTrift.setUuid(uuid);
    }

    public void unsetUuid() {
        cadastroIndividualTrift.unsetUuid();
    }

    public boolean isSetUuid() {
        return cadastroIndividualTrift.isSetUuid();
    }

    public void setUuidIsSet(boolean value) {
        cadastroIndividualTrift.setUuidIsSet(value);
    }

    public String getUuidFichaOriginadora() {
        return cadastroIndividualTrift.getUuidFichaOriginadora();
    }

    public void setUuidFichaOriginadora(String uuidFichaOriginadora) {
        cadastroIndividualTrift.setUuidFichaOriginadora(uuidFichaOriginadora);
    }

    public void unsetUuidFichaOriginadora() {
        cadastroIndividualTrift.unsetUuidFichaOriginadora();
    }

    public boolean isSetUuidFichaOriginadora() {
        return cadastroIndividualTrift.isSetUuidFichaOriginadora();
    }

    public void setUuidFichaOriginadoraIsSet(boolean value) {
        cadastroIndividualTrift.setUuidFichaOriginadoraIsSet(value);
    }

    public String getUuidCidadao() {
        return cadastroIndividualTrift.getUuidCidadao();
    }

    public void setUuidCidadao(String uuidCidadao) {
        cadastroIndividualTrift.setUuidCidadao(uuidCidadao);
    }

    public void unsetUuidCidadao() {
        cadastroIndividualTrift.unsetUuidCidadao();
    }

    public boolean isSetUuidCidadao() {
        return cadastroIndividualTrift.isSetUuidCidadao();
    }

    public void setUuidCidadaoIsSet(boolean value) {
        cadastroIndividualTrift.setUuidCidadaoIsSet(value);
    }

    public void setFieldValue(CadastroIndividualThrift._Fields field, Object value) {
        cadastroIndividualTrift.setFieldValue(field, value);
    }

    public boolean isSet(CadastroIndividualThrift._Fields field) {
        return cadastroIndividualTrift.isSet(field);
    }

    public void validate() throws TException {
        cadastroIndividualTrift.validate();
    }
}

