package com.github.Eddyosos.integracao20171.esus.cds.cadastroindividual;

import br.gov.saude.esus.cds.transport.generated.thrift.cadastroindividual.InformacoesSocioDemograficasThrift;
import java.util.List;

public class InformacoesSocioDemograficas {

    private InformacoesSocioDemograficasThrift instance;
    
    public InformacoesSocioDemograficas() {
        instance = new InformacoesSocioDemograficasThrift();
    }
    
    protected InformacoesSocioDemograficas(InformacoesSocioDemograficasThrift informacoesSocioDemograficasThrift){
        this.instance = informacoesSocioDemograficasThrift;
    }

    /**
     * Valida a instancia da classe
     * @return true se válido
     *          false se inválido
     */
    public boolean validates(){
        return validateDeficienciasCidadao() &&
                validateOcupacaoCodigoCbo2002() &&
                validaOrientacaoSexualCidadao() &&
                validaPovoComunidadeTradicional();
    }
    
    /**
     * Valida DeficienciasCidadao.
     * Para ser válido deve:
     * 1- Requerido preenchimento de pelo menos um item se o campo statusTemAlgumaDeficiencia = true.
     * 2- Não deve ser preenchido se o campo statusTemAlgumaDeficiencia = false.
     * @return true se válido
     *          false se inválido
     */
    public boolean validateDeficienciasCidadao(){
        if(!instance.isSetStatusTemAlgumaDeficiencia()) return true;
        if(instance.isStatusTemAlgumaDeficiencia())
            return instance.isSetDeficienciasCidadao() &&
                instance.getDeficienciasCidadaoSize() > 0 &&
                instance.getDeficienciasCidadaoSize() <= 5;
        else return !instance.isSetDeficienciasCidadao();
    }
    
    /**
     * Código das deficiências que o cidadão possui.
     * @return 
     */
    public List<Long> getDeficienciasCidadao() {
        return instance.getDeficienciasCidadao();
    }

    /**
     * Código das deficiências que o cidadão possui.
     * @param deficienciasCidadao 
     */
    public void setDeficienciasCidadao(List<Long> deficienciasCidadao) {
        instance.setDeficienciasCidadao(deficienciasCidadao);
    }

    //Não á validações para grau
    
    /**
     * Código do curso mais elevado que o cidadão frequenta ou frequentou.
     * @return 
     */
    public long getGrauInstrucaoCidadao() {
        return instance.getGrauInstrucaoCidadao();
    }

    /**
     * Código do curso mais elevado que o cidadão frequenta ou frequentou.
     * @param grauInstrucaoCidadao 
     */
    public void setGrauInstrucaoCidadao(long grauInstrucaoCidadao) {
        instance.setGrauInstrucaoCidadao(grauInstrucaoCidadao);
    }

    //Não á validações para MotivoSaidaCidadao
    
    /**
     * Código do motivo da saída do cidadão do cadastro.
     * @return 
     */
    public long getMotivoSaidaCidadao() {
        return instance.getMotivoSaidaCidadao();
    }

    /**
     * Código do motivo da saída do cidadão do cadastro.
     * @param motivoSaidaCidadao 
     */
    public void setMotivoSaidaCidadao(long motivoSaidaCidadao) {
        instance.setMotivoSaidaCidadao(motivoSaidaCidadao);
    }

    /**
     * Valida OcupacaoCodigoCbo2002.
     * Para ser válido, caso inserido, deve atender ao regex: \A\d{6}\z
     * @return True se válido
     *          False se inválido
     */
    public boolean validateOcupacaoCodigoCbo2002(){
        return !instance.isSetOcupacaoCodigoCbo2002() || 
                instance.getOcupacaoCodigoCbo2002().matches("\\A\\d{6}\\z");
    }
    
    /**
     * Código do CBO que representa a ocupaçao do cidadão.
     * @return 
     */
    public String getOcupacaoCodigoCbo2002() {
        return instance.getOcupacaoCodigoCbo2002();
    }

    /**
     * Código do CBO que representa a ocupaçao do cidadão.
     * @param ocupacaoCodigoCbo2002 
     */
    public void setOcupacaoCodigoCbo2002(String ocupacaoCodigoCbo2002) {
        instance.setOcupacaoCodigoCbo2002(ocupacaoCodigoCbo2002);
    }

    /**
     * Valida OrientacaoSexualCidadao.
     * Para ser válido, não pode ser preenchido se o campo 
     * statusDesejaInformarOrientacaoSexual = false.
     * @return true se válido
     *          false se inválido
     */
    public boolean validaOrientacaoSexualCidadao(){
        return !instance.isSetOrientacaoSexualCidadao() ||
                !instance.isSetStatusDesejaInformarOrientacaoSexual() ||
                instance.isStatusDesejaInformarOrientacaoSexual();
    }
    
    /**
     * Código da orientação sexual informada pelo cidadão.
     * @return 
     */
    public long getOrientacaoSexualCidadao() {
        return instance.getOrientacaoSexualCidadao();
    }

    /**
     * Código da orientação sexual informada pelo cidadão.
     * @param orientacaoSexualCidadao 
     */
    public void setOrientacaoSexualCidadao(long orientacaoSexualCidadao) {
        instance.setOrientacaoSexualCidadao(orientacaoSexualCidadao);
    }

    /**
     * Valida PovoComunidadeTradicional
     * 
     * @return true se válido
     *          false se inválido
     */
    public boolean validaPovoComunidadeTradicional(){
        return !instance.isSetPovoComunidadeTradicional() ||
                (instance.isStatusMembroPovoComunidadeTradicional() && 
                instance.getPovoComunidadeTradicional().length() <= 100);
    }
    
    /**
     * Nome da comunidade tradicional que o cidadão frequenta.
     * @return 
     */
    public String getPovoComunidadeTradicional() {
        return instance.getPovoComunidadeTradicional();
    }

    /**
     * Nome da comunidade tradicional que o cidadão frequenta.
     * @param povoComunidadeTradicional 
     */
    public void setPovoComunidadeTradicional(String povoComunidadeTradicional) {
        instance.setPovoComunidadeTradicional(povoComunidadeTradicional);
    }

    //Não á validações para relacaoParentescoCidadao
    
    /**
     * Código da relação de parentesco com o responsável familiar.
     * @return 
     */
    public long getRelacaoParentescoCidadao() {
        return instance.getRelacaoParentescoCidadao();
    }

    /**
     * Código da relação de parentesco com o responsável familiar.
     * @param relacaoParentescoCidadao 
     */
    public void setRelacaoParentescoCidadao(long relacaoParentescoCidadao) {
        instance.setRelacaoParentescoCidadao(relacaoParentescoCidadao);
    }

    /**
     * Código do responsável por crianças de até 9 anos.
     * @return 
     */
    public long getResponsavelPorCrianca() {
        return instance.getResponsavelPorCrianca();
    }

    /**
     * Código do responsável por crianças de até 9 anos.
     * @param responsavelPorCrianca 
     */
    public void setResponsavelPorCrianca(long responsavelPorCrianca) {
        instance.setResponsavelPorCrianca(responsavelPorCrianca);
    }

    /**
     * Código da situação do cidadão no mercado de trabalho.
     * @return 
     */
    public long getSituacaoMercadoTrabalhoCidadao() {
        return instance.getSituacaoMercadoTrabalhoCidadao();
    }

    /**
     * Código da situação do cidadão no mercado de trabalho.
     * @param situacaoMercadoTrabalhoCidadao 
     */
    public void setSituacaoMercadoTrabalhoCidadao(long situacaoMercadoTrabalhoCidadao) {
        instance.setSituacaoMercadoTrabalhoCidadao(situacaoMercadoTrabalhoCidadao);
    }

    /**
     * Marcador que indica se o cidadão deseja informar sua orientação sexual.
     * @return 
     */
    public boolean isStatusDesejaInformarOrientacaoSexual() {
        return instance.isStatusDesejaInformarOrientacaoSexual();
    }

    /**
     * Marcador que indica se o cidadão deseja informar sua orientação sexual.
     * @param statusDesejaInformarOrientacaoSexual 
     */
    public void setStatusDesejaInformarOrientacaoSexual(boolean statusDesejaInformarOrientacaoSexual) {
        instance.setStatusDesejaInformarOrientacaoSexual(statusDesejaInformarOrientacaoSexual);
    }

    /**
     * Marcador que indica se o cidadão frequenta cuidador tradicional.
     * @return 
     */
    public boolean isStatusFrequentaBenzedeira() {
        return instance.isStatusFrequentaBenzedeira();
    }

    /**
     * Marcador que indica se o cidadão frequenta cuidador tradicional.
     * @param statusFrequentaBenzedeira 
     */
    public void setStatusFrequentaBenzedeira(boolean statusFrequentaBenzedeira) {
        instance.setStatusFrequentaBenzedeira(statusFrequentaBenzedeira);
    }

    /**
     * Marcador que indica se o cidadão frequenta escola ou creche.
     * @return 
     */
    public boolean isStatusFrequentaEscola() {
        return instance.isStatusFrequentaEscola();
    }

    /**
     * Marcador que indica se o cidadão frequenta escola ou creche.
     * @param statusFrequentaEscola 
     */
    public void setStatusFrequentaEscola(boolean statusFrequentaEscola) {
        instance.setStatusFrequentaEscola(statusFrequentaEscola);
    }

    /**
     * Marcador que indica se o cidadão é membro de um povo ou comunidade tradicional.
     * @return 
     */
    public boolean isStatusMembroPovoComunidadeTradicional() {
        return instance.isStatusMembroPovoComunidadeTradicional();
    }

    /**
     * Marcador que indica se o cidadão é membro de um povo ou comunidade tradicional.
     * @param statusMembroPovoComunidadeTradicional 
     */
    public void setStatusMembroPovoComunidadeTradicional(boolean statusMembroPovoComunidadeTradicional) {
        instance.setStatusMembroPovoComunidadeTradicional(statusMembroPovoComunidadeTradicional);
    }

    /**
     * Marcador que indica se o cidadão participa de algum grupo comunitário.
     * @return 
     */
    public boolean isStatusParticipaGrupoComunitario() {
        return instance.isStatusParticipaGrupoComunitario();
    }

    /**
     * Marcador que indica se o cidadão participa de algum grupo comunitário.
     * @param statusParticipaGrupoComunitario 
     */
    public void setStatusParticipaGrupoComunitario(boolean statusParticipaGrupoComunitario) {
        instance.setStatusParticipaGrupoComunitario(statusParticipaGrupoComunitario);
    }

    /**
     * Marcador que indica se o cidadão possui plano de saúde privado.
     * @return 
     */
    public boolean isStatusPossuiPlanoSaudePrivado() {
        return instance.isStatusPossuiPlanoSaudePrivado();
    }

    /**
     * Marcador que indica se o cidadão possui plano de saúde privado.
     * @param statusPossuiPlanoSaudePrivado 
     */
    public void setStatusPossuiPlanoSaudePrivado(boolean statusPossuiPlanoSaudePrivado) {
        instance.setStatusPossuiPlanoSaudePrivado(statusPossuiPlanoSaudePrivado);
    }

    /**
     * Marcador que indica se cidadão tem alguma dificiência.
     * @return 
     */
    public boolean isStatusTemAlgumaDeficiencia() {
        return instance.isStatusTemAlgumaDeficiencia();
    }

    /**
     * Marcador que indica se cidadão tem alguma dificiência.
     * @param statusTemAlgumaDeficiencia 
     */
    public void setStatusTemAlgumaDeficiencia(boolean statusTemAlgumaDeficiencia) {
        instance.setStatusTemAlgumaDeficiencia(statusTemAlgumaDeficiencia);
    }

    public InformacoesSocioDemograficasThrift getIntence(){
        return instance;
    }
}

