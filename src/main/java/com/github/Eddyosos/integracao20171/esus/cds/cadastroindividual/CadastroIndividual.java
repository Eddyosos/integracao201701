package com.github.Eddyosos.integracao20171.esus.cds.cadastroindividual;

import br.gov.saude.esus.cds.transport.generated.thrift.cadastroindividual.CadastroIndividualThrift;
import com.github.Eddyosos.integracao20171.esus.cds.common.HeaderCdsCadastro;
import org.apache.thrift.TException;

public class CadastroIndividual {
    private CadastroIndividualThrift instance = new CadastroIndividualThrift();

    public CondicoesDeSaude getCondicoesDeSaude() {
        return new CondicoesDeSaude(instance.getCondicoesDeSaude());
    }

    public void setCondicoesDeSaude(CondicoesDeSaude condicoesDeSaude) {
        instance.setCondicoesDeSaude(condicoesDeSaude.getInstance());
    }

    public void unsetCondicoesDeSaude() {
        instance.unsetCondicoesDeSaude();
    }

    public boolean isSetCondicoesDeSaude() {
        return instance.isSetCondicoesDeSaude();
    }

    public void setCondicoesDeSaudeIsSet(boolean value) {
        instance.setCondicoesDeSaudeIsSet(value);
    }

    public HeaderCdsCadastro getDadosGerais() {
        return new HeaderCdsCadastro(instance.getDadosGerais());
    }

    public void setDadosGerais(HeaderCdsCadastro dadosGerais) {
        instance.setDadosGerais(dadosGerais.getInstance());
    }

    public void unsetDadosGerais() {
        instance.unsetDadosGerais();
    }

    public boolean isSetDadosGerais() {
        return instance.isSetDadosGerais();
    }

    public void setDadosGeraisIsSet(boolean value) {
        instance.setDadosGeraisIsSet(value);
    }

    public EmSituacaoDeRua getEmSituacaoDeRua() {
        return new EmSituacaoDeRua(instance.getEmSituacaoDeRua());
    }

    public void setEmSituacaoDeRua(EmSituacaoDeRua emSituacaoDeRua) {
        instance.setEmSituacaoDeRua(emSituacaoDeRua.getInstance());
    }

    public void unsetEmSituacaoDeRua() {
        instance.unsetEmSituacaoDeRua();
    }

    public boolean isSetEmSituacaoDeRua() {
        return instance.isSetEmSituacaoDeRua();
    }

    public void setEmSituacaoDeRuaIsSet(boolean value) {
        instance.setEmSituacaoDeRuaIsSet(value);
    }

    public boolean isFichaAtualizada() {
        return instance.isFichaAtualizada();
    }

    public void setFichaAtualizada(boolean fichaAtualizada) {
        instance.setFichaAtualizada(fichaAtualizada);
    }

    public void unsetFichaAtualizada() {
        instance.unsetFichaAtualizada();
    }

    public boolean isSetFichaAtualizada() {
        return instance.isSetFichaAtualizada();
    }

    public void setFichaAtualizadaIsSet(boolean value) {
        instance.setFichaAtualizadaIsSet(value);
    }

    public IdentificacaoUsuarioCidadao getIdentificacaoUsuarioCidadao() {
        return new IdentificacaoUsuarioCidadao(instance.getIdentificacaoUsuarioCidadao());
    }

    public void setIdentificacaoUsuarioCidadao(IdentificacaoUsuarioCidadao identificacaoUsuarioCidadao) {
        instance.setIdentificacaoUsuarioCidadao(identificacaoUsuarioCidadao.getInstance());
    }

    public void unsetIdentificacaoUsuarioCidadao() {
        instance.unsetIdentificacaoUsuarioCidadao();
    }

    public boolean isSetIdentificacaoUsuarioCidadao() {
        return instance.isSetIdentificacaoUsuarioCidadao();
    }

    public void setIdentificacaoUsuarioCidadaoIsSet(boolean value) {
        instance.setIdentificacaoUsuarioCidadaoIsSet(value);
    }

    public InformacoesSocioDemograficas getInformacoesSocioDemograficas() {
        return new InformacoesSocioDemograficas(instance.getInformacoesSocioDemograficas());
    }

    public void setInformacoesSocioDemograficas(InformacoesSocioDemograficas informacoesSocioDemograficas) {
        instance.setInformacoesSocioDemograficas(informacoesSocioDemograficas.getIntence());
    }

    public void unsetInformacoesSocioDemograficas() {
        instance.unsetInformacoesSocioDemograficas();
    }

    public boolean isSetInformacoesSocioDemograficas() {
        return instance.isSetInformacoesSocioDemograficas();
    }

    public void setInformacoesSocioDemograficasIsSet(boolean value) {
        instance.setInformacoesSocioDemograficasIsSet(value);
    }

    public boolean isStatusTermoRecusaCadastroIndividualAtencaoBasica() {
        return instance.isStatusTermoRecusaCadastroIndividualAtencaoBasica();
    }

    public void setStatusTermoRecusaCadastroIndividualAtencaoBasica(boolean statusTermoRecusaCadastroIndividualAtencaoBasica) {
        instance.setStatusTermoRecusaCadastroIndividualAtencaoBasica(statusTermoRecusaCadastroIndividualAtencaoBasica);
    }

    public void unsetStatusTermoRecusaCadastroIndividualAtencaoBasica() {
        instance.unsetStatusTermoRecusaCadastroIndividualAtencaoBasica();
    }

    public boolean isSetStatusTermoRecusaCadastroIndividualAtencaoBasica() {
        return instance.isSetStatusTermoRecusaCadastroIndividualAtencaoBasica();
    }

    public void setStatusTermoRecusaCadastroIndividualAtencaoBasicaIsSet(boolean value) {
        instance.setStatusTermoRecusaCadastroIndividualAtencaoBasicaIsSet(value);
    }

    public void setTpCdsOrigem(int tpCdsOrigem) {
        instance.setTpCdsOrigem(tpCdsOrigem);
    }

    public void unsetTpCdsOrigem() {
        instance.unsetTpCdsOrigem();
    }

    public boolean isSetTpCdsOrigem() {
        return instance.isSetTpCdsOrigem();
    }

    public void setTpCdsOrigemIsSet(boolean value) {
        instance.setTpCdsOrigemIsSet(value);
    }

    public String getUuid() {
        return instance.getUuid();
    }

    public void setUuid(String uuid) {
        instance.setUuid(uuid);
    }

    public void unsetUuid() {
        instance.unsetUuid();
    }

    public boolean isSetUuid() {
        return instance.isSetUuid();
    }

    public void setUuidIsSet(boolean value) {
        instance.setUuidIsSet(value);
    }

    public String getUuidFichaOriginadora() {
        return instance.getUuidFichaOriginadora();
    }

    public void setUuidFichaOriginadora(String uuidFichaOriginadora) {
        instance.setUuidFichaOriginadora(uuidFichaOriginadora);
    }

    public void unsetUuidFichaOriginadora() {
        instance.unsetUuidFichaOriginadora();
    }

    public boolean isSetUuidFichaOriginadora() {
        return instance.isSetUuidFichaOriginadora();
    }

    public void setUuidFichaOriginadoraIsSet(boolean value) {
        instance.setUuidFichaOriginadoraIsSet(value);
    }

    public String getUuidCidadao() {
        return instance.getUuidCidadao();
    }

    public void setUuidCidadao(String uuidCidadao) {
        instance.setUuidCidadao(uuidCidadao);
    }

    public void unsetUuidCidadao() {
        instance.unsetUuidCidadao();
    }

    public boolean isSetUuidCidadao() {
        return instance.isSetUuidCidadao();
    }

    public void setUuidCidadaoIsSet(boolean value) {
        instance.setUuidCidadaoIsSet(value);
    }

    public boolean validate() {
        return false;
    }
    
    /**
     * Valida o campo condições de saúde.
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateCondicoesDeSaude() {
    	if (instance.isStatusTermoRecusaCadastroIndividualAtencaoBasica() && instance.isSetCondicoesDeSaude())
    		return false;
    	return true; //TODO
    }
    
    /**
     * Valida o campo emSituacaoDeRua
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateEmSituacaoDeRua() {
    	if (instance.isStatusTermoRecusaCadastroIndividualAtencaoBasica() && instance.isSetEmSituacaoDeRua())
    		return false;
    	return true; //TODO
    }
    
    /**
     * Valida se a ficha foi atualizada
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateFichaAtualizada() {
    	return instance.isSetFichaAtualizada();
    }
    
    /**
     * Valida o campo indentificacaoUsuarioCidadao
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateIndetificacaoUsuarioCidadao() {
    	if (!instance.isStatusTermoRecusaCadastroIndividualAtencaoBasica() && instance.isSetIdentificacaoUsuarioCidadao())
    		return false;
    	return true; //TODO
    }
    
    /**
     * Valida o campo informacoesSocioDemografica
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateInformacoesSocioDemografica() {
    	if (instance.isStatusTermoRecusaCadastroIndividualAtencaoBasica() && instance.isSetInformacoesSocioDemograficas())
    		return false;
    	return true; //TODO
    }
    
    /**
     * Valida o status do termo
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateStatusTermoRecusaCadastroIndividualAtencaoBasica() {
    	return true;
    }
    
    /**
     * Valida o tipo de origem do cadastro de registro
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateTpCdsOrigem() {
    	return instance.isSetTpCdsOrigem();
    }
    
    /**
     * Valida o uuid
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateUuid() {
    	return instance.isSetUuid() && instance.getUuid().length() >= 36 && instance.getUuid().length() <= 44;
    }
    
    /**
     * Valida o uuid da ficha originadora
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateUuidFichaOriginadora() {
    	return instance.isSetUuidFichaOriginadora() && instance.getUuidFichaOriginadora().length() >= 36 && instance.getUuidFichaOriginadora().length() <= 44;
    }
    
    /**
     * Valida o saidaCidadaoCadastro
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateSaidaCidadaoCadastro() {
    	return true; //TODO Nao encontrei a SaidaCidadaoCadastro
    }
    
    /**
     * Valida o header
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateHeaderTransport() {
    	return true; //TODO Não encontrei nem a headerTransport nem a UnicaLotacaoHeader
    }
}

