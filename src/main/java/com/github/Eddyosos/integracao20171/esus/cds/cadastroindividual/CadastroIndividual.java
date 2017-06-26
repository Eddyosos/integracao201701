package com.github.Eddyosos.integracao20171.esus.cds.cadastroindividual;

import br.gov.saude.esus.cds.transport.generated.thrift.cadastroindividual.CadastroIndividualThrift;
import com.github.Eddyosos.integracao20171.esus.cds.common.HeaderCdsCadastro;
import java.util.UUID;

public class CadastroIndividual {
    private CadastroIndividualThrift instance;
    
    public CadastroIndividual(){
        instance = new CadastroIndividualThrift();
    }

    /**
     * Formulário referente as condições de saúde do cidadão.
     * @return 
     */
    public CondicoesDeSaude getCondicoesDeSaude() {
        return new CondicoesDeSaude(instance.getCondicoesDeSaude());
    }

    /**
     * Formulário referente as condições de saúde do cidadão.
     * @param condicoesDeSaude 
     */
    public void setCondicoesDeSaude(CondicoesDeSaude condicoesDeSaude) {
        instance.setCondicoesDeSaude(condicoesDeSaude.getInstance());
    }

    /**
     * Dados referentes ao profissional e a data do cadastro.
     * @return 
     */
    public HeaderCdsCadastro getDadosGerais() {
        return new HeaderCdsCadastro(instance.getDadosGerais());
    }

    /**
     * Dados referentes ao profissional e a data do cadastro.
     * @param dadosGerais 
     */
    public void setDadosGerais(HeaderCdsCadastro dadosGerais) {
        instance.setDadosGerais(dadosGerais.getInstance());
    }

    /**
     * Formulário referente a informações de situação de rua (se o cidadão se encontrar nessa situação).
     * @return 
     */
    public EmSituacaoDeRua getEmSituacaoDeRua() {
        return new EmSituacaoDeRua(instance.getEmSituacaoDeRua());
    }

    /**
     * Formulário referente a informações de situação de rua (se o cidadão se encontrar nessa situação).
     * @param emSituacaoDeRua 
     */
    public void setEmSituacaoDeRua(EmSituacaoDeRua emSituacaoDeRua) {
        instance.setEmSituacaoDeRua(emSituacaoDeRua.getInstance());
    }

    /**
     * Marcador que indica se a ficha é uma atualização.
     * @return 
     */
    public boolean isFichaAtualizada() {
        return instance.isFichaAtualizada();
    }

    /**
     * Marcador que indica se a ficha é uma atualização.
     * @param fichaAtualizada 
     */
    public void setFichaAtualizada(boolean fichaAtualizada) {
        instance.setFichaAtualizada(fichaAtualizada);
    }

    /**
     * Dados que identificam o cidadão.
     * @return 
     */
    public IdentificacaoUsuarioCidadao getIdentificacaoUsuarioCidadao() {
        return new IdentificacaoUsuarioCidadao(instance.getIdentificacaoUsuarioCidadao());
    }

    /**
     * Dados que identificam o cidadão.
     * @param identificacaoUsuarioCidadao 
     */
    public void setIdentificacaoUsuarioCidadao(IdentificacaoUsuarioCidadao identificacaoUsuarioCidadao) {
        instance.setIdentificacaoUsuarioCidadao(identificacaoUsuarioCidadao.getInstance());
    }
    
    /**
     * Informações sócio-demográficas fornecidas pelo cidadão.
     * @return 
     */
    public InformacoesSocioDemograficas getInformacoesSocioDemograficas() {
        return new InformacoesSocioDemograficas(instance.getInformacoesSocioDemograficas());
    }

    /**
     * Informações sócio-demográficas fornecidas pelo cidadão.
     * @param informacoesSocioDemograficas 
     */
    public void setInformacoesSocioDemograficas(InformacoesSocioDemograficas informacoesSocioDemograficas) {
        instance.setInformacoesSocioDemograficas(informacoesSocioDemograficas.getIntence());
    }

    /**
     * Marcador que indica se o termo de recusa foi assinalado.
     * @return 
     */
    public boolean isStatusTermoRecusaCadastroIndividualAtencaoBasica() {
        return instance.isStatusTermoRecusaCadastroIndividualAtencaoBasica();
    }
    
    /**
     * Marcador que indica se o termo de recusa foi assinalado.
     * @param statusTermoRecusaCadastroIndividualAtencaoBasica 
     */
    public void setStatusTermoRecusaCadastroIndividualAtencaoBasica(boolean statusTermoRecusaCadastroIndividualAtencaoBasica) {
        instance.setStatusTermoRecusaCadastroIndividualAtencaoBasica(statusTermoRecusaCadastroIndividualAtencaoBasica);
    }

    /**
     * Tipo de origem dos dados do registro.
     * @param tpCdsOrigem 
     */
    public void setTpCdsOrigem(int tpCdsOrigem) {
        instance.setTpCdsOrigem(tpCdsOrigem);
    }

    /**
     * Tipo de origem dos dados do registro.
     */
    public void unsetTpCdsOrigem() {
        instance.unsetTpCdsOrigem();
    }

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @return 
     */
    public String getUuid() {
        return instance.getUuid();
    }

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @param uuid 
     */
    public void setUuid(String uuid) {
        instance.setUuid(uuid);
    }

    /**
     * Código UUID para identificar a ficha que deu origem ao cadastro do registro.
     * @return 
     */
    public String getUuidFichaOriginadora() {
        return instance.getUuidFichaOriginadora();
    }

    /**
     * Código UUID para identificar a ficha que deu origem ao cadastro do registro.
     * @param uuidFichaOriginadora 
     */
    public void setUuidFichaOriginadora(String uuidFichaOriginadora) {
        instance.setUuidFichaOriginadora(uuidFichaOriginadora);
    }

    public String getUuidCidadao() {
        return instance.getUuidCidadao();
    }

    public void setUuidCidadao(String uuidCidadao) {
        instance.setUuidCidadao(uuidCidadao);
    }

    /**
     * Valida a instancia
     * @return true se válido
     *          false se inválido
     */
    public boolean validate() {
        return validateCondicoesDeSaude() &&
                validateDadosGerais() &&
                validateEmSituacaoDeRua() &&
                validateFichaAtualizada() &&
                validateIndetificacaoUsuarioCidadao() &&
                validateInformacoesSocioDemografica() &&
                validateTpCdsOrigem() && 
                validateUuid() &&
                validateUuidFichaOriginadora();
    }
    
    /**
     * Valida o campo condições de saúde.
     * Para ser válido deve, caso inserido:
     * 1- Regras: Não deve ser preenchido se o campo statusTermoRecusaCadastroIndividualAtencaoBasica = true.
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateCondicoesDeSaude() {
    	return !instance.isSetCondicoesDeSaude() || 
               !instance.isSetStatusTermoRecusaCadastroIndividualAtencaoBasica() ||
               !instance.isStatusTermoRecusaCadastroIndividualAtencaoBasica();
    }
    
    /**
     * Valida DadosGerais
     * Para ser válido deve ter sido inserido préviamente
     * @return true se válido
     *          false se inválido
     */
    public boolean validateDadosGerais(){
        return instance.isSetDadosGerais();
    }
    
    /**
     * Valida o campo emSituacaoDeRua
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateEmSituacaoDeRua() {
        return !instance.isSetEmSituacaoDeRua() ||
                !instance.isSetStatusTermoRecusaCadastroIndividualAtencaoBasica() ||
                !instance.isStatusTermoRecusaCadastroIndividualAtencaoBasica();
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
     *          false se for inválido
     */
    public boolean validateIndetificacaoUsuarioCidadao() {
        return !instance.isSetIdentificacaoUsuarioCidadao() ||
                !instance.isSetStatusTermoRecusaCadastroIndividualAtencaoBasica() ||
                !instance.isStatusTermoRecusaCadastroIndividualAtencaoBasica();
    }
    
    /**
     * Valida o campo informacoesSocioDemografica
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateInformacoesSocioDemografica() {
        return !instance.isSetInformacoesSocioDemograficas() ||
                !instance.isSetStatusTermoRecusaCadastroIndividualAtencaoBasica() ||
                !instance.isStatusTermoRecusaCadastroIndividualAtencaoBasica();
    }
    
    //Não á validações para o statusTermoRecusaCadastroIndividualAtencaoBasica
    
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
    public boolean validateUuid(){
        return !instance.isSetUuid() || 
                validateUuid(instance.getUuid());
    }
    
    public boolean validateUuid(String var) {
        if(var.length() < 36 || var.length() > 44) return false;
        try{
            UUID.fromString(var.substring(0,36));
        } catch (Exception ex) {
            return false;
        }
        return true;
    }
    
    /**
     * Valida o uuid da ficha originadora
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateUuidFichaOriginadora() {
    	return instance.isSetUuidFichaOriginadora() && 
                validateUuid(instance.getUuidFichaOriginadora());
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

