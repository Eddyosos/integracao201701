package com.github.Eddyosos.integracao20171.esus.cds.cadastroindividual;

import br.gov.saude.esus.cds.transport.generated.thrift.cadastroindividual.InformacoesSocioDemograficasThrift;
import java.util.Iterator;
import java.util.List;
import org.apache.thrift.TException;

public class InformacoesSocioDemograficas {
    private InformacoesSocioDemograficasThrift informacoesSocioDemograficasThrift = new InformacoesSocioDemograficasThrift();
    
    protected InformacoesSocioDemograficas(InformacoesSocioDemograficasThrift informacoesSocioDemograficasThrift){
        this.informacoesSocioDemograficasThrift = informacoesSocioDemograficasThrift;
    }

    public int getDeficienciasCidadaoSize() {
        return informacoesSocioDemograficasThrift.getDeficienciasCidadaoSize();
    }

    public Iterator<Long> getDeficienciasCidadaoIterator() {
        return informacoesSocioDemograficasThrift.getDeficienciasCidadaoIterator();
    }

    public void addToDeficienciasCidadao(long elem) {
        informacoesSocioDemograficasThrift.addToDeficienciasCidadao(elem);
    }

    public List<Long> getDeficienciasCidadao() {
        return informacoesSocioDemograficasThrift.getDeficienciasCidadao();
    }

    public void setDeficienciasCidadao(List<Long> deficienciasCidadao) {
        informacoesSocioDemograficasThrift.setDeficienciasCidadao(deficienciasCidadao);
    }

    public void unsetDeficienciasCidadao() {
        informacoesSocioDemograficasThrift.unsetDeficienciasCidadao();
    }

    public boolean isSetDeficienciasCidadao() {
        return informacoesSocioDemograficasThrift.isSetDeficienciasCidadao();
    }

    public void setDeficienciasCidadaoIsSet(boolean value) {
        informacoesSocioDemograficasThrift.setDeficienciasCidadaoIsSet(value);
    }

    public long getGrauInstrucaoCidadao() {
        return informacoesSocioDemograficasThrift.getGrauInstrucaoCidadao();
    }

    public void setGrauInstrucaoCidadao(long grauInstrucaoCidadao) {
        informacoesSocioDemograficasThrift.setGrauInstrucaoCidadao(grauInstrucaoCidadao);
    }

    public void unsetGrauInstrucaoCidadao() {
        informacoesSocioDemograficasThrift.unsetGrauInstrucaoCidadao();
    }

    public boolean isSetGrauInstrucaoCidadao() {
        return informacoesSocioDemograficasThrift.isSetGrauInstrucaoCidadao();
    }

    public void setGrauInstrucaoCidadaoIsSet(boolean value) {
        informacoesSocioDemograficasThrift.setGrauInstrucaoCidadaoIsSet(value);
    }

    public long getMotivoSaidaCidadao() {
        return informacoesSocioDemograficasThrift.getMotivoSaidaCidadao();
    }

    public void setMotivoSaidaCidadao(long motivoSaidaCidadao) {
        informacoesSocioDemograficasThrift.setMotivoSaidaCidadao(motivoSaidaCidadao);
    }

    public void unsetMotivoSaidaCidadao() {
        informacoesSocioDemograficasThrift.unsetMotivoSaidaCidadao();
    }

    public boolean isSetMotivoSaidaCidadao() {
        return informacoesSocioDemograficasThrift.isSetMotivoSaidaCidadao();
    }

    public void setMotivoSaidaCidadaoIsSet(boolean value) {
        informacoesSocioDemograficasThrift.setMotivoSaidaCidadaoIsSet(value);
    }

    public String getOcupacaoCodigoCbo2002() {
        return informacoesSocioDemograficasThrift.getOcupacaoCodigoCbo2002();
    }

    public void setOcupacaoCodigoCbo2002(String ocupacaoCodigoCbo2002) {
        informacoesSocioDemograficasThrift.setOcupacaoCodigoCbo2002(ocupacaoCodigoCbo2002);
    }

    public void unsetOcupacaoCodigoCbo2002() {
        informacoesSocioDemograficasThrift.unsetOcupacaoCodigoCbo2002();
    }

    public boolean isSetOcupacaoCodigoCbo2002() {
        return informacoesSocioDemograficasThrift.isSetOcupacaoCodigoCbo2002();
    }

    public void setOcupacaoCodigoCbo2002IsSet(boolean value) {
        informacoesSocioDemograficasThrift.setOcupacaoCodigoCbo2002IsSet(value);
    }

    public long getOrientacaoSexualCidadao() {
        return informacoesSocioDemograficasThrift.getOrientacaoSexualCidadao();
    }

    public void setOrientacaoSexualCidadao(long orientacaoSexualCidadao) {
        informacoesSocioDemograficasThrift.setOrientacaoSexualCidadao(orientacaoSexualCidadao);
    }

    public void unsetOrientacaoSexualCidadao() {
        informacoesSocioDemograficasThrift.unsetOrientacaoSexualCidadao();
    }

    public boolean isSetOrientacaoSexualCidadao() {
        return informacoesSocioDemograficasThrift.isSetOrientacaoSexualCidadao();
    }

    public void setOrientacaoSexualCidadaoIsSet(boolean value) {
        informacoesSocioDemograficasThrift.setOrientacaoSexualCidadaoIsSet(value);
    }

    public String getPovoComunidadeTradicional() {
        return informacoesSocioDemograficasThrift.getPovoComunidadeTradicional();
    }

    public void setPovoComunidadeTradicional(String povoComunidadeTradicional) {
        informacoesSocioDemograficasThrift.setPovoComunidadeTradicional(povoComunidadeTradicional);
    }

    public void unsetPovoComunidadeTradicional() {
        informacoesSocioDemograficasThrift.unsetPovoComunidadeTradicional();
    }

    public boolean isSetPovoComunidadeTradicional() {
        return informacoesSocioDemograficasThrift.isSetPovoComunidadeTradicional();
    }

    public void setPovoComunidadeTradicionalIsSet(boolean value) {
        informacoesSocioDemograficasThrift.setPovoComunidadeTradicionalIsSet(value);
    }

    public long getRelacaoParentescoCidadao() {
        return informacoesSocioDemograficasThrift.getRelacaoParentescoCidadao();
    }

    public void setRelacaoParentescoCidadao(long relacaoParentescoCidadao) {
        informacoesSocioDemograficasThrift.setRelacaoParentescoCidadao(relacaoParentescoCidadao);
    }

    public void unsetRelacaoParentescoCidadao() {
        informacoesSocioDemograficasThrift.unsetRelacaoParentescoCidadao();
    }

    public boolean isSetRelacaoParentescoCidadao() {
        return informacoesSocioDemograficasThrift.isSetRelacaoParentescoCidadao();
    }

    public void setRelacaoParentescoCidadaoIsSet(boolean value) {
        informacoesSocioDemograficasThrift.setRelacaoParentescoCidadaoIsSet(value);
    }

    public long getResponsavelPorCrianca() {
        return informacoesSocioDemograficasThrift.getResponsavelPorCrianca();
    }

    public void setResponsavelPorCrianca(long responsavelPorCrianca) {
        informacoesSocioDemograficasThrift.setResponsavelPorCrianca(responsavelPorCrianca);
    }

    public void unsetResponsavelPorCrianca() {
        informacoesSocioDemograficasThrift.unsetResponsavelPorCrianca();
    }

    public boolean isSetResponsavelPorCrianca() {
        return informacoesSocioDemograficasThrift.isSetResponsavelPorCrianca();
    }

    public void setResponsavelPorCriancaIsSet(boolean value) {
        informacoesSocioDemograficasThrift.setResponsavelPorCriancaIsSet(value);
    }

    public long getSituacaoMercadoTrabalhoCidadao() {
        return informacoesSocioDemograficasThrift.getSituacaoMercadoTrabalhoCidadao();
    }

    public void setSituacaoMercadoTrabalhoCidadao(long situacaoMercadoTrabalhoCidadao) {
        informacoesSocioDemograficasThrift.setSituacaoMercadoTrabalhoCidadao(situacaoMercadoTrabalhoCidadao);
    }

    public void unsetSituacaoMercadoTrabalhoCidadao() {
        informacoesSocioDemograficasThrift.unsetSituacaoMercadoTrabalhoCidadao();
    }

    public boolean isSetSituacaoMercadoTrabalhoCidadao() {
        return informacoesSocioDemograficasThrift.isSetSituacaoMercadoTrabalhoCidadao();
    }

    public void setSituacaoMercadoTrabalhoCidadaoIsSet(boolean value) {
        informacoesSocioDemograficasThrift.setSituacaoMercadoTrabalhoCidadaoIsSet(value);
    }

    public boolean isStatusDesejaInformarOrientacaoSexual() {
        return informacoesSocioDemograficasThrift.isStatusDesejaInformarOrientacaoSexual();
    }

    public void setStatusDesejaInformarOrientacaoSexual(boolean statusDesejaInformarOrientacaoSexual) {
        informacoesSocioDemograficasThrift.setStatusDesejaInformarOrientacaoSexual(statusDesejaInformarOrientacaoSexual);
    }

    public void unsetStatusDesejaInformarOrientacaoSexual() {
        informacoesSocioDemograficasThrift.unsetStatusDesejaInformarOrientacaoSexual();
    }

    public boolean isSetStatusDesejaInformarOrientacaoSexual() {
        return informacoesSocioDemograficasThrift.isSetStatusDesejaInformarOrientacaoSexual();
    }

    public void setStatusDesejaInformarOrientacaoSexualIsSet(boolean value) {
        informacoesSocioDemograficasThrift.setStatusDesejaInformarOrientacaoSexualIsSet(value);
    }

    public boolean isStatusFrequentaBenzedeira() {
        return informacoesSocioDemograficasThrift.isStatusFrequentaBenzedeira();
    }

    public void setStatusFrequentaBenzedeira(boolean statusFrequentaBenzedeira) {
        informacoesSocioDemograficasThrift.setStatusFrequentaBenzedeira(statusFrequentaBenzedeira);
    }

    public void unsetStatusFrequentaBenzedeira() {
        informacoesSocioDemograficasThrift.unsetStatusFrequentaBenzedeira();
    }

    public boolean isSetStatusFrequentaBenzedeira() {
        return informacoesSocioDemograficasThrift.isSetStatusFrequentaBenzedeira();
    }

    public void setStatusFrequentaBenzedeiraIsSet(boolean value) {
        informacoesSocioDemograficasThrift.setStatusFrequentaBenzedeiraIsSet(value);
    }

    public boolean isStatusFrequentaEscola() {
        return informacoesSocioDemograficasThrift.isStatusFrequentaEscola();
    }

    public void setStatusFrequentaEscola(boolean statusFrequentaEscola) {
        informacoesSocioDemograficasThrift.setStatusFrequentaEscola(statusFrequentaEscola);
    }

    public void unsetStatusFrequentaEscola() {
        informacoesSocioDemograficasThrift.unsetStatusFrequentaEscola();
    }

    public boolean isSetStatusFrequentaEscola() {
        return informacoesSocioDemograficasThrift.isSetStatusFrequentaEscola();
    }

    public void setStatusFrequentaEscolaIsSet(boolean value) {
        informacoesSocioDemograficasThrift.setStatusFrequentaEscolaIsSet(value);
    }

    public boolean isStatusMembroPovoComunidadeTradicional() {
        return informacoesSocioDemograficasThrift.isStatusMembroPovoComunidadeTradicional();
    }

    public void setStatusMembroPovoComunidadeTradicional(boolean statusMembroPovoComunidadeTradicional) {
        informacoesSocioDemograficasThrift.setStatusMembroPovoComunidadeTradicional(statusMembroPovoComunidadeTradicional);
    }

    public void unsetStatusMembroPovoComunidadeTradicional() {
        informacoesSocioDemograficasThrift.unsetStatusMembroPovoComunidadeTradicional();
    }

    public boolean isSetStatusMembroPovoComunidadeTradicional() {
        return informacoesSocioDemograficasThrift.isSetStatusMembroPovoComunidadeTradicional();
    }

    public void setStatusMembroPovoComunidadeTradicionalIsSet(boolean value) {
        informacoesSocioDemograficasThrift.setStatusMembroPovoComunidadeTradicionalIsSet(value);
    }

    public boolean isStatusParticipaGrupoComunitario() {
        return informacoesSocioDemograficasThrift.isStatusParticipaGrupoComunitario();
    }

    public void setStatusParticipaGrupoComunitario(boolean statusParticipaGrupoComunitario) {
        informacoesSocioDemograficasThrift.setStatusParticipaGrupoComunitario(statusParticipaGrupoComunitario);
    }

    public void unsetStatusParticipaGrupoComunitario() {
        informacoesSocioDemograficasThrift.unsetStatusParticipaGrupoComunitario();
    }

    public boolean isSetStatusParticipaGrupoComunitario() {
        return informacoesSocioDemograficasThrift.isSetStatusParticipaGrupoComunitario();
    }

    public void setStatusParticipaGrupoComunitarioIsSet(boolean value) {
        informacoesSocioDemograficasThrift.setStatusParticipaGrupoComunitarioIsSet(value);
    }

    public boolean isStatusPossuiPlanoSaudePrivado() {
        return informacoesSocioDemograficasThrift.isStatusPossuiPlanoSaudePrivado();
    }

    public void setStatusPossuiPlanoSaudePrivado(boolean statusPossuiPlanoSaudePrivado) {
        informacoesSocioDemograficasThrift.setStatusPossuiPlanoSaudePrivado(statusPossuiPlanoSaudePrivado);
    }

    public void unsetStatusPossuiPlanoSaudePrivado() {
        informacoesSocioDemograficasThrift.unsetStatusPossuiPlanoSaudePrivado();
    }

    public boolean isSetStatusPossuiPlanoSaudePrivado() {
        return informacoesSocioDemograficasThrift.isSetStatusPossuiPlanoSaudePrivado();
    }

    public void setStatusPossuiPlanoSaudePrivadoIsSet(boolean value) {
        informacoesSocioDemograficasThrift.setStatusPossuiPlanoSaudePrivadoIsSet(value);
    }

    public boolean isStatusTemAlgumaDeficiencia() {
        return informacoesSocioDemograficasThrift.isStatusTemAlgumaDeficiencia();
    }

    public void setStatusTemAlgumaDeficiencia(boolean statusTemAlgumaDeficiencia) {
        informacoesSocioDemograficasThrift.setStatusTemAlgumaDeficiencia(statusTemAlgumaDeficiencia);
    }

    public void unsetStatusTemAlgumaDeficiencia() {
        informacoesSocioDemograficasThrift.unsetStatusTemAlgumaDeficiencia();
    }

    public boolean isSetStatusTemAlgumaDeficiencia() {
        return informacoesSocioDemograficasThrift.isSetStatusTemAlgumaDeficiencia();
    }

    public void setStatusTemAlgumaDeficienciaIsSet(boolean value) {
        informacoesSocioDemograficasThrift.setStatusTemAlgumaDeficienciaIsSet(value);
    }

    public int compareTo(InformacoesSocioDemograficas other) {
        return informacoesSocioDemograficasThrift.compareTo(other.getIntence());
    }

    public void validate() throws TException {
        informacoesSocioDemograficasThrift.validate();
    }
    
    protected InformacoesSocioDemograficasThrift getIntence(){
        return informacoesSocioDemograficasThrift;
    }
}

