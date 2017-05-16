package com.github.Eddyosos.integracao20171.esus.cds.cadastroindividual;

import br.gov.saude.esus.cds.transport.generated.thrift.cadastroindividual.CadastroIndividualThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.common.HeaderCdsCadastroThrift;
import org.apache.thrift.TException;

public class CadastroIndividual {
    private CadastroIndividualThrift cadastroIndividualTrift = new CadastroIndividualThrift();

    public CondicoesDeSaude getCondicoesDeSaude() {
        return new CondicoesDeSaude(cadastroIndividualTrift.getCondicoesDeSaude());
    }

    public void setCondicoesDeSaude(CondicoesDeSaude condicoesDeSaude) {
        cadastroIndividualTrift.setCondicoesDeSaude(condicoesDeSaude.getInstance());
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

    public EmSituacaoDeRua getEmSituacaoDeRua() {
        return new EmSituacaoDeRua(cadastroIndividualTrift.getEmSituacaoDeRua());
    }

    public void setEmSituacaoDeRua(EmSituacaoDeRua emSituacaoDeRua) {
        cadastroIndividualTrift.setEmSituacaoDeRua(emSituacaoDeRua.getInstance());
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

    public IdentificacaoUsuarioCidadao getIdentificacaoUsuarioCidadao() {
        return new IdentificacaoUsuarioCidadao(cadastroIndividualTrift.getIdentificacaoUsuarioCidadao());
    }

    public void setIdentificacaoUsuarioCidadao(IdentificacaoUsuarioCidadao identificacaoUsuarioCidadao) {
        cadastroIndividualTrift.setIdentificacaoUsuarioCidadao(identificacaoUsuarioCidadao.getInstance());
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

    public InformacoesSocioDemograficas getInformacoesSocioDemograficas() {
        return new InformacoesSocioDemograficas(cadastroIndividualTrift.getInformacoesSocioDemograficas());
    }

    public void setInformacoesSocioDemograficas(InformacoesSocioDemograficas informacoesSocioDemograficas) {
        cadastroIndividualTrift.setInformacoesSocioDemograficas(informacoesSocioDemograficas.getIntence());
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

