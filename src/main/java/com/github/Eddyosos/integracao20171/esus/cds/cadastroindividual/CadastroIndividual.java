package com.github.Eddyosos.integracao20171.esus.cds.cadastroindividual;

import br.gov.saude.esus.cds.transport.generated.thrift.cadastroindividual.CadastroIndividualThrift;
import com.github.Eddyosos.integracao20171.esus.cds.common.HeaderCdsCadastro;
import com.github.eddyosos.e_sus_ab_factory.cds.cadastroindividual.ICadastroIndividual;
import com.github.eddyosos.e_sus_ab_factory.cds.cadastroindividual.ICondicoesDeSaude;
import com.github.eddyosos.e_sus_ab_factory.cds.cadastroindividual.IEmSituacaoDeRua;
import com.github.eddyosos.e_sus_ab_factory.cds.cadastroindividual.IIdentificacaoUsuarioCidadao;
import com.github.eddyosos.e_sus_ab_factory.cds.cadastroindividual.IInformacoesSocioDemograficas;
import com.github.eddyosos.e_sus_ab_factory.cds.common.IHeaderCdsCadastro;
import java.util.UUID;

public class CadastroIndividual implements ICadastroIndividual {
    private CadastroIndividualThrift instance;
    
    public CadastroIndividual(){
        instance = new CadastroIndividualThrift();
    }

    /**
     * Formulário referente as condições de saúde do cidadão.
     * @return 
     */
    @Override
    public ICondicoesDeSaude getCondicoesDeSaude() {
        return new CondicoesDeSaude(instance.getCondicoesDeSaude());
    }

    /**
     * Formulário referente as condições de saúde do cidadão.
     * @param condicoesDeSaude 
     */
    @Override
    public void setCondicoesDeSaude(ICondicoesDeSaude condicoesDeSaude) {
        instance.setCondicoesDeSaude(condicoesDeSaude.getInstance());
    }

    /**
     * Dados referentes ao profissional e a data do cadastro.
     * @return 
     */
    @Override
    public IHeaderCdsCadastro getDadosGerais() {
        return new HeaderCdsCadastro(instance.getDadosGerais());
    }

    /**
     * Dados referentes ao profissional e a data do cadastro.
     * @param dadosGerais 
     */
    @Override
    public void setDadosGerais(IHeaderCdsCadastro dadosGerais) {
        instance.setDadosGerais(dadosGerais.getInstance());
    }

    /**
     * Formulário referente a informações de situação de rua (se o cidadão se encontrar nessa situação).
     * @return 
     */
    @Override
    public IEmSituacaoDeRua getEmSituacaoDeRua() {
        return new EmSituacaoDeRua(instance.getEmSituacaoDeRua());
    }

    /**
     * Formulário referente a informações de situação de rua (se o cidadão se encontrar nessa situação).
     * @param emSituacaoDeRua 
     */
    @Override
    public void setEmSituacaoDeRua(IEmSituacaoDeRua emSituacaoDeRua) {
        instance.setEmSituacaoDeRua(emSituacaoDeRua.getInstance());
    }

    /**
     * Marcador que indica se a ficha é uma atualização.
     * @return 
     */
    @Override
    public boolean isFichaAtualizada() {
        return instance.isFichaAtualizada();
    }

    /**
     * Marcador que indica se a ficha é uma atualização.
     * @param fichaAtualizada 
     */
    @Override
    public void setFichaAtualizada(boolean fichaAtualizada) {
        instance.setFichaAtualizada(fichaAtualizada);
    }

    /**
     * Dados que identificam o cidadão.
     * @return 
     */
    @Override
    public IIdentificacaoUsuarioCidadao getIdentificacaoUsuarioCidadao() {
        return new IdentificacaoUsuarioCidadao(instance.getIdentificacaoUsuarioCidadao());
    }

    /**
     * Dados que identificam o cidadão.
     * @param identificacaoUsuarioCidadao 
     */
    @Override
    public void setIdentificacaoUsuarioCidadao(IIdentificacaoUsuarioCidadao identificacaoUsuarioCidadao) {
        instance.setIdentificacaoUsuarioCidadao(identificacaoUsuarioCidadao.getInstance());
    }
    
    /**
     * Informações sócio-demográficas fornecidas pelo cidadão.
     * @return 
     */
    @Override
    public IInformacoesSocioDemograficas getInformacoesSocioDemograficas() {
        return new InformacoesSocioDemograficas(instance.getInformacoesSocioDemograficas());
    }

    /**
     * Informações sócio-demográficas fornecidas pelo cidadão.
     * @param informacoesSocioDemograficas 
     */
    @Override
    public void setInformacoesSocioDemograficas(IInformacoesSocioDemograficas informacoesSocioDemograficas) {
        instance.setInformacoesSocioDemograficas(informacoesSocioDemograficas.getIntence());
    }

    /**
     * Marcador que indica se o termo de recusa foi assinalado.
     * @return 
     */
    @Override
    public boolean isStatusTermoRecusaCadastroIndividualAtencaoBasica() {
        return instance.isStatusTermoRecusaCadastroIndividualAtencaoBasica();
    }
    
    /**
     * Marcador que indica se o termo de recusa foi assinalado.
     * @param statusTermoRecusaCadastroIndividualAtencaoBasica 
     */
    @Override
    public void setStatusTermoRecusaCadastroIndividualAtencaoBasica(boolean statusTermoRecusaCadastroIndividualAtencaoBasica) {
        instance.setStatusTermoRecusaCadastroIndividualAtencaoBasica(statusTermoRecusaCadastroIndividualAtencaoBasica);
    }

    /**
     * Tipo de origem dos dados do registro.
     * @param tpCdsOrigem 
     */
    @Override
    public void setTpCdsOrigem(int tpCdsOrigem) {
        instance.setTpCdsOrigem(tpCdsOrigem);
    }

    /**
     * Tipo de origem dos dados do registro.
     */
    @Override
    public void unsetTpCdsOrigem() {
        instance.unsetTpCdsOrigem();
    }

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @return 
     */
    @Override
    public String getUuid() {
        return instance.getUuid();
    }

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @param uuid 
     */
    @Override
    public void setUuid(String uuid) {
        instance.setUuid(uuid);
    }

    /**
     * Código UUID para identificar a ficha que deu origem ao cadastro do registro.
     * @return 
     */
    @Override
    public String getUuidFichaOriginadora() {
        return instance.getUuidFichaOriginadora();
    }

    /**
     * Código UUID para identificar a ficha que deu origem ao cadastro do registro.
     * @param uuidFichaOriginadora 
     */
    @Override
    public void setUuidFichaOriginadora(String uuidFichaOriginadora) {
        instance.setUuidFichaOriginadora(uuidFichaOriginadora);
    }

    @Override
    public String getUuidCidadao() {
        return instance.getUuidCidadao();
    }

    @Override
    public void setUuidCidadao(String uuidCidadao) {
        instance.setUuidCidadao(uuidCidadao);
    }

    /**
     * Valida a instancia
     * @return true se válido
     *          false se inválido
     */
    @Override
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
    @Override
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
    @Override
    public boolean validateDadosGerais(){
        return instance.isSetDadosGerais();
    }
    
    /**
     * Valida o campo emSituacaoDeRua
     * @return true se for válido
     * @return false se for inválido
     */
    @Override
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
    @Override
    public boolean validateFichaAtualizada() {
    	return instance.isSetFichaAtualizada();
    }
    
    /**
     * Valida o campo indentificacaoUsuarioCidadao
     * @return true se for válido
     *          false se for inválido
     */
    @Override
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
    @Override
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
    @Override
    public boolean validateTpCdsOrigem() {
    	return instance.isSetTpCdsOrigem();
    }
    
    /**
     * Valida o uuid
     * @return true se for válido
     * @return false se for inválido
     */
    @Override
    public boolean validateUuid(){
        return !instance.isSetUuid() || 
                validateUuid(instance.getUuid());
    }
    
    @Override
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
    @Override
    public boolean validateUuidFichaOriginadora() {
    	return instance.isSetUuidFichaOriginadora() && 
                validateUuid(instance.getUuidFichaOriginadora());
    }
    
    /**
     * Valida o saidaCidadaoCadastro
     * @return true se for válido
     * @return false se for inválido
     */
    @Override
    public boolean validateSaidaCidadaoCadastro() {
    	return true; //TODO Nao encontrei a SaidaCidadaoCadastro
    }
    
    /**
     * Valida o header
     * @return true se for válido
     * @return false se for inválido
     */
    @Override
    public boolean validateHeaderTransport() {
    	return true; //TODO Não encontrei nem a headerTransport nem a UnicaLotacaoHeader
    }
}

