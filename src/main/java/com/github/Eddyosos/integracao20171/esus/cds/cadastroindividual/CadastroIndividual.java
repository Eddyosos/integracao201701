package com.github.Eddyosos.integracao20171.esus.cds.cadastroindividual;

import br.gov.saude.esus.cds.transport.generated.thrift.cadastroindividual.CadastroIndividualThrift;
import com.github.Eddyosos.integracao20171.esus.cds.common.HeaderCdsCadastro;
import org.apache.thrift.TException;

public class CadastroIndividual {
    private CadastroIndividualThrift cadastroIndividualThrift = new CadastroIndividualThrift();

    public CondicoesDeSaude getCondicoesDeSaude() {
        return new CondicoesDeSaude(cadastroIndividualThrift.getCondicoesDeSaude());
    }

    public void setCondicoesDeSaude(CondicoesDeSaude condicoesDeSaude) {
        cadastroIndividualThrift.setCondicoesDeSaude(condicoesDeSaude.getInstance());
    }

    public void unsetCondicoesDeSaude() {
        cadastroIndividualThrift.unsetCondicoesDeSaude();
    }

    public boolean isSetCondicoesDeSaude() {
        return cadastroIndividualThrift.isSetCondicoesDeSaude();
    }

    public void setCondicoesDeSaudeIsSet(boolean value) {
        cadastroIndividualThrift.setCondicoesDeSaudeIsSet(value);
    }

    public HeaderCdsCadastro getDadosGerais() {
        return new HeaderCdsCadastro(cadastroIndividualThrift.getDadosGerais());
    }

    public void setDadosGerais(HeaderCdsCadastro dadosGerais) {
        cadastroIndividualThrift.setDadosGerais(dadosGerais.getInstance());
    }

    public void unsetDadosGerais() {
        cadastroIndividualThrift.unsetDadosGerais();
    }

    public boolean isSetDadosGerais() {
        return cadastroIndividualThrift.isSetDadosGerais();
    }

    public void setDadosGeraisIsSet(boolean value) {
        cadastroIndividualThrift.setDadosGeraisIsSet(value);
    }

    public EmSituacaoDeRua getEmSituacaoDeRua() {
        return new EmSituacaoDeRua(cadastroIndividualThrift.getEmSituacaoDeRua());
    }

    public void setEmSituacaoDeRua(EmSituacaoDeRua emSituacaoDeRua) {
        cadastroIndividualThrift.setEmSituacaoDeRua(emSituacaoDeRua.getInstance());
    }

    public void unsetEmSituacaoDeRua() {
        cadastroIndividualThrift.unsetEmSituacaoDeRua();
    }

    public boolean isSetEmSituacaoDeRua() {
        return cadastroIndividualThrift.isSetEmSituacaoDeRua();
    }

    public void setEmSituacaoDeRuaIsSet(boolean value) {
        cadastroIndividualThrift.setEmSituacaoDeRuaIsSet(value);
    }

    public boolean isFichaAtualizada() {
        return cadastroIndividualThrift.isFichaAtualizada();
    }

    public void setFichaAtualizada(boolean fichaAtualizada) {
        cadastroIndividualThrift.setFichaAtualizada(fichaAtualizada);
    }

    public void unsetFichaAtualizada() {
        cadastroIndividualThrift.unsetFichaAtualizada();
    }

    public boolean isSetFichaAtualizada() {
        return cadastroIndividualThrift.isSetFichaAtualizada();
    }

    public void setFichaAtualizadaIsSet(boolean value) {
        cadastroIndividualThrift.setFichaAtualizadaIsSet(value);
    }

    public IdentificacaoUsuarioCidadao getIdentificacaoUsuarioCidadao() {
        return new IdentificacaoUsuarioCidadao(cadastroIndividualThrift.getIdentificacaoUsuarioCidadao());
    }

    public void setIdentificacaoUsuarioCidadao(IdentificacaoUsuarioCidadao identificacaoUsuarioCidadao) {
        cadastroIndividualThrift.setIdentificacaoUsuarioCidadao(identificacaoUsuarioCidadao.getInstance());
    }

    public void unsetIdentificacaoUsuarioCidadao() {
        cadastroIndividualThrift.unsetIdentificacaoUsuarioCidadao();
    }

    public boolean isSetIdentificacaoUsuarioCidadao() {
        return cadastroIndividualThrift.isSetIdentificacaoUsuarioCidadao();
    }

    public void setIdentificacaoUsuarioCidadaoIsSet(boolean value) {
        cadastroIndividualThrift.setIdentificacaoUsuarioCidadaoIsSet(value);
    }

    public InformacoesSocioDemograficas getInformacoesSocioDemograficas() {
        return new InformacoesSocioDemograficas(cadastroIndividualThrift.getInformacoesSocioDemograficas());
    }

    public void setInformacoesSocioDemograficas(InformacoesSocioDemograficas informacoesSocioDemograficas) {
        cadastroIndividualThrift.setInformacoesSocioDemograficas(informacoesSocioDemograficas.getIntence());
    }

    public void unsetInformacoesSocioDemograficas() {
        cadastroIndividualThrift.unsetInformacoesSocioDemograficas();
    }

    public boolean isSetInformacoesSocioDemograficas() {
        return cadastroIndividualThrift.isSetInformacoesSocioDemograficas();
    }

    public void setInformacoesSocioDemograficasIsSet(boolean value) {
        cadastroIndividualThrift.setInformacoesSocioDemograficasIsSet(value);
    }

    public boolean isStatusTermoRecusaCadastroIndividualAtencaoBasica() {
        return cadastroIndividualThrift.isStatusTermoRecusaCadastroIndividualAtencaoBasica();
    }

    public void setStatusTermoRecusaCadastroIndividualAtencaoBasica(boolean statusTermoRecusaCadastroIndividualAtencaoBasica) {
        cadastroIndividualThrift.setStatusTermoRecusaCadastroIndividualAtencaoBasica(statusTermoRecusaCadastroIndividualAtencaoBasica);
    }

    public void unsetStatusTermoRecusaCadastroIndividualAtencaoBasica() {
        cadastroIndividualThrift.unsetStatusTermoRecusaCadastroIndividualAtencaoBasica();
    }

    public boolean isSetStatusTermoRecusaCadastroIndividualAtencaoBasica() {
        return cadastroIndividualThrift.isSetStatusTermoRecusaCadastroIndividualAtencaoBasica();
    }

    public void setStatusTermoRecusaCadastroIndividualAtencaoBasicaIsSet(boolean value) {
        cadastroIndividualThrift.setStatusTermoRecusaCadastroIndividualAtencaoBasicaIsSet(value);
    }

    public void setTpCdsOrigem(int tpCdsOrigem) {
        cadastroIndividualThrift.setTpCdsOrigem(tpCdsOrigem);
    }

    public void unsetTpCdsOrigem() {
        cadastroIndividualThrift.unsetTpCdsOrigem();
    }

    public boolean isSetTpCdsOrigem() {
        return cadastroIndividualThrift.isSetTpCdsOrigem();
    }

    public void setTpCdsOrigemIsSet(boolean value) {
        cadastroIndividualThrift.setTpCdsOrigemIsSet(value);
    }

    public String getUuid() {
        return cadastroIndividualThrift.getUuid();
    }

    public void setUuid(String uuid) {
        cadastroIndividualThrift.setUuid(uuid);
    }

    public void unsetUuid() {
        cadastroIndividualThrift.unsetUuid();
    }

    public boolean isSetUuid() {
        return cadastroIndividualThrift.isSetUuid();
    }

    public void setUuidIsSet(boolean value) {
        cadastroIndividualThrift.setUuidIsSet(value);
    }

    public String getUuidFichaOriginadora() {
        return cadastroIndividualThrift.getUuidFichaOriginadora();
    }

    public void setUuidFichaOriginadora(String uuidFichaOriginadora) {
        cadastroIndividualThrift.setUuidFichaOriginadora(uuidFichaOriginadora);
    }

    public void unsetUuidFichaOriginadora() {
        cadastroIndividualThrift.unsetUuidFichaOriginadora();
    }

    public boolean isSetUuidFichaOriginadora() {
        return cadastroIndividualThrift.isSetUuidFichaOriginadora();
    }

    public void setUuidFichaOriginadoraIsSet(boolean value) {
        cadastroIndividualThrift.setUuidFichaOriginadoraIsSet(value);
    }

    public String getUuidCidadao() {
        return cadastroIndividualThrift.getUuidCidadao();
    }

    public void setUuidCidadao(String uuidCidadao) {
        cadastroIndividualThrift.setUuidCidadao(uuidCidadao);
    }

    public void unsetUuidCidadao() {
        cadastroIndividualThrift.unsetUuidCidadao();
    }

    public boolean isSetUuidCidadao() {
        return cadastroIndividualThrift.isSetUuidCidadao();
    }

    public void setUuidCidadaoIsSet(boolean value) {
        cadastroIndividualThrift.setUuidCidadaoIsSet(value);
    }

    public void validate() throws TException {
        cadastroIndividualThrift.validate();
    }
}

