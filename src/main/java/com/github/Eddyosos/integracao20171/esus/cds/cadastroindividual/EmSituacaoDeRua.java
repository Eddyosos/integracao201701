package com.github.Eddyosos.integracao20171.esus.cds.cadastroindividual;

import br.gov.saude.esus.cds.transport.generated.thrift.cadastroindividual.EmSituacaoDeRuaThrift;
import java.util.Iterator;
import java.util.List;
import org.apache.thrift.TException;

public class EmSituacaoDeRua {
    private EmSituacaoDeRuaThrift emSituacaoDeRuaTrift = new EmSituacaoDeRuaThrift();
    
    protected EmSituacaoDeRua(EmSituacaoDeRuaThrift emSituacaoDeRua){
        this.emSituacaoDeRuaTrift = emSituacaoDeRua;
    }

    public String getGrauParentescoFamiliarFrequentado() {
        return emSituacaoDeRuaTrift.getGrauParentescoFamiliarFrequentado();
    }

    public void setGrauParentescoFamiliarFrequentado(String grauParentescoFamiliarFrequentado) {
        emSituacaoDeRuaTrift.setGrauParentescoFamiliarFrequentado(grauParentescoFamiliarFrequentado);
    }

    public void unsetGrauParentescoFamiliarFrequentado() {
        emSituacaoDeRuaTrift.unsetGrauParentescoFamiliarFrequentado();
    }

    public boolean isSetGrauParentescoFamiliarFrequentado() {
        return emSituacaoDeRuaTrift.isSetGrauParentescoFamiliarFrequentado();
    }

    public void setGrauParentescoFamiliarFrequentadoIsSet(boolean value) {
        emSituacaoDeRuaTrift.setGrauParentescoFamiliarFrequentadoIsSet(value);
    }

    public int getHigienePessoalSituacaoRuaSize() {
        return emSituacaoDeRuaTrift.getHigienePessoalSituacaoRuaSize();
    }

    public Iterator<Long> getHigienePessoalSituacaoRuaIterator() {
        return emSituacaoDeRuaTrift.getHigienePessoalSituacaoRuaIterator();
    }

    public void addToHigienePessoalSituacaoRua(long elem) {
        emSituacaoDeRuaTrift.addToHigienePessoalSituacaoRua(elem);
    }

    public List<Long> getHigienePessoalSituacaoRua() {
        return emSituacaoDeRuaTrift.getHigienePessoalSituacaoRua();
    }

    public void setHigienePessoalSituacaoRua(List<Long> higienePessoalSituacaoRua) {
        emSituacaoDeRuaTrift.setHigienePessoalSituacaoRua(higienePessoalSituacaoRua);
    }

    public void unsetHigienePessoalSituacaoRua() {
        emSituacaoDeRuaTrift.unsetHigienePessoalSituacaoRua();
    }

    public boolean isSetHigienePessoalSituacaoRua() {
        return emSituacaoDeRuaTrift.isSetHigienePessoalSituacaoRua();
    }

    public void setHigienePessoalSituacaoRuaIsSet(boolean value) {
        emSituacaoDeRuaTrift.setHigienePessoalSituacaoRuaIsSet(value);
    }

    public int getOrigemAlimentoSituacaoRuaSize() {
        return emSituacaoDeRuaTrift.getOrigemAlimentoSituacaoRuaSize();
    }

    public Iterator<Long> getOrigemAlimentoSituacaoRuaIterator() {
        return emSituacaoDeRuaTrift.getOrigemAlimentoSituacaoRuaIterator();
    }

    public void addToOrigemAlimentoSituacaoRua(long elem) {
        emSituacaoDeRuaTrift.addToOrigemAlimentoSituacaoRua(elem);
    }

    public List<Long> getOrigemAlimentoSituacaoRua() {
        return emSituacaoDeRuaTrift.getOrigemAlimentoSituacaoRua();
    }

    public void setOrigemAlimentoSituacaoRua(List<Long> origemAlimentoSituacaoRua) {
        emSituacaoDeRuaTrift.setOrigemAlimentoSituacaoRua(origemAlimentoSituacaoRua);
    }

    public void unsetOrigemAlimentoSituacaoRua() {
        emSituacaoDeRuaTrift.unsetOrigemAlimentoSituacaoRua();
    }

    public boolean isSetOrigemAlimentoSituacaoRua() {
        return emSituacaoDeRuaTrift.isSetOrigemAlimentoSituacaoRua();
    }

    public void setOrigemAlimentoSituacaoRuaIsSet(boolean value) {
        emSituacaoDeRuaTrift.setOrigemAlimentoSituacaoRuaIsSet(value);
    }

    public String getOutraInstituicaoQueAcompanha() {
        return emSituacaoDeRuaTrift.getOutraInstituicaoQueAcompanha();
    }

    public void setOutraInstituicaoQueAcompanha(String outraInstituicaoQueAcompanha) {
        emSituacaoDeRuaTrift.setOutraInstituicaoQueAcompanha(outraInstituicaoQueAcompanha);
    }

    public void unsetOutraInstituicaoQueAcompanha() {
        emSituacaoDeRuaTrift.unsetOutraInstituicaoQueAcompanha();
    }

    public boolean isSetOutraInstituicaoQueAcompanha() {
        return emSituacaoDeRuaTrift.isSetOutraInstituicaoQueAcompanha();
    }

    public void setOutraInstituicaoQueAcompanhaIsSet(boolean value) {
        emSituacaoDeRuaTrift.setOutraInstituicaoQueAcompanhaIsSet(value);
    }

    public long getQuantidadeAlimentacoesAoDiaSituacaoRua() {
        return emSituacaoDeRuaTrift.getQuantidadeAlimentacoesAoDiaSituacaoRua();
    }

    public void setQuantidadeAlimentacoesAoDiaSituacaoRua(long quantidadeAlimentacoesAoDiaSituacaoRua) {
        emSituacaoDeRuaTrift.setQuantidadeAlimentacoesAoDiaSituacaoRua(quantidadeAlimentacoesAoDiaSituacaoRua);
    }

    public void unsetQuantidadeAlimentacoesAoDiaSituacaoRua() {
        emSituacaoDeRuaTrift.unsetQuantidadeAlimentacoesAoDiaSituacaoRua();
    }

    public boolean isSetQuantidadeAlimentacoesAoDiaSituacaoRua() {
        return emSituacaoDeRuaTrift.isSetQuantidadeAlimentacoesAoDiaSituacaoRua();
    }

    public void setQuantidadeAlimentacoesAoDiaSituacaoRuaIsSet(boolean value) {
        emSituacaoDeRuaTrift.setQuantidadeAlimentacoesAoDiaSituacaoRuaIsSet(value);
    }

    public boolean isStatusAcompanhadoPorOutraInstituicao() {
        return emSituacaoDeRuaTrift.isStatusAcompanhadoPorOutraInstituicao();
    }

    public void setStatusAcompanhadoPorOutraInstituicao(boolean statusAcompanhadoPorOutraInstituicao) {
        emSituacaoDeRuaTrift.setStatusAcompanhadoPorOutraInstituicao(statusAcompanhadoPorOutraInstituicao);
    }

    public void unsetStatusAcompanhadoPorOutraInstituicao() {
        emSituacaoDeRuaTrift.unsetStatusAcompanhadoPorOutraInstituicao();
    }

    public boolean isSetStatusAcompanhadoPorOutraInstituicao() {
        return emSituacaoDeRuaTrift.isSetStatusAcompanhadoPorOutraInstituicao();
    }

    public void setStatusAcompanhadoPorOutraInstituicaoIsSet(boolean value) {
        emSituacaoDeRuaTrift.setStatusAcompanhadoPorOutraInstituicaoIsSet(value);
    }

    public boolean isStatusPossuiReferenciaFamiliar() {
        return emSituacaoDeRuaTrift.isStatusPossuiReferenciaFamiliar();
    }

    public void setStatusPossuiReferenciaFamiliar(boolean statusPossuiReferenciaFamiliar) {
        emSituacaoDeRuaTrift.setStatusPossuiReferenciaFamiliar(statusPossuiReferenciaFamiliar);
    }

    public void unsetStatusPossuiReferenciaFamiliar() {
        emSituacaoDeRuaTrift.unsetStatusPossuiReferenciaFamiliar();
    }

    public boolean isSetStatusPossuiReferenciaFamiliar() {
        return emSituacaoDeRuaTrift.isSetStatusPossuiReferenciaFamiliar();
    }

    public void setStatusPossuiReferenciaFamiliarIsSet(boolean value) {
        emSituacaoDeRuaTrift.setStatusPossuiReferenciaFamiliarIsSet(value);
    }

    public boolean isStatusRecebeBeneficio() {
        return emSituacaoDeRuaTrift.isStatusRecebeBeneficio();
    }

    public void setStatusRecebeBeneficio(boolean statusRecebeBeneficio) {
        emSituacaoDeRuaTrift.setStatusRecebeBeneficio(statusRecebeBeneficio);
    }

    public void unsetStatusRecebeBeneficio() {
        emSituacaoDeRuaTrift.unsetStatusRecebeBeneficio();
    }

    public boolean isSetStatusRecebeBeneficio() {
        return emSituacaoDeRuaTrift.isSetStatusRecebeBeneficio();
    }

    public void setStatusRecebeBeneficioIsSet(boolean value) {
        emSituacaoDeRuaTrift.setStatusRecebeBeneficioIsSet(value);
    }

    public boolean isStatusSituacaoRua() {
        return emSituacaoDeRuaTrift.isStatusSituacaoRua();
    }

    public void setStatusSituacaoRua(boolean statusSituacaoRua) {
        emSituacaoDeRuaTrift.setStatusSituacaoRua(statusSituacaoRua);
    }

    public void unsetStatusSituacaoRua() {
        emSituacaoDeRuaTrift.unsetStatusSituacaoRua();
    }

    public boolean isSetStatusSituacaoRua() {
        return emSituacaoDeRuaTrift.isSetStatusSituacaoRua();
    }

    public void setStatusSituacaoRuaIsSet(boolean value) {
        emSituacaoDeRuaTrift.setStatusSituacaoRuaIsSet(value);
    }

    public boolean isStatusTemAcessoHigienePessoalSituacaoRua() {
        return emSituacaoDeRuaTrift.isStatusTemAcessoHigienePessoalSituacaoRua();
    }

    public void setStatusTemAcessoHigienePessoalSituacaoRua(boolean statusTemAcessoHigienePessoalSituacaoRua) {
        emSituacaoDeRuaTrift.setStatusTemAcessoHigienePessoalSituacaoRua(statusTemAcessoHigienePessoalSituacaoRua);
    }

    public void unsetStatusTemAcessoHigienePessoalSituacaoRua() {
        emSituacaoDeRuaTrift.unsetStatusTemAcessoHigienePessoalSituacaoRua();
    }

    public boolean isSetStatusTemAcessoHigienePessoalSituacaoRua() {
        return emSituacaoDeRuaTrift.isSetStatusTemAcessoHigienePessoalSituacaoRua();
    }

    public void setStatusTemAcessoHigienePessoalSituacaoRuaIsSet(boolean value) {
        emSituacaoDeRuaTrift.setStatusTemAcessoHigienePessoalSituacaoRuaIsSet(value);
    }

    public boolean isStatusVisitaFamiliarFrequentemente() {
        return emSituacaoDeRuaTrift.isStatusVisitaFamiliarFrequentemente();
    }

    public void setStatusVisitaFamiliarFrequentemente(boolean statusVisitaFamiliarFrequentemente) {
        emSituacaoDeRuaTrift.setStatusVisitaFamiliarFrequentemente(statusVisitaFamiliarFrequentemente);
    }

    public void unsetStatusVisitaFamiliarFrequentemente() {
        emSituacaoDeRuaTrift.unsetStatusVisitaFamiliarFrequentemente();
    }

    public boolean isSetStatusVisitaFamiliarFrequentemente() {
        return emSituacaoDeRuaTrift.isSetStatusVisitaFamiliarFrequentemente();
    }

    public void setStatusVisitaFamiliarFrequentementeIsSet(boolean value) {
        emSituacaoDeRuaTrift.setStatusVisitaFamiliarFrequentementeIsSet(value);
    }

    public long getTempoSituacaoRua() {
        return emSituacaoDeRuaTrift.getTempoSituacaoRua();
    }

    public void setTempoSituacaoRua(long tempoSituacaoRua) {
        emSituacaoDeRuaTrift.setTempoSituacaoRua(tempoSituacaoRua);
    }

    public void unsetTempoSituacaoRua() {
        emSituacaoDeRuaTrift.unsetTempoSituacaoRua();
    }

    public boolean isSetTempoSituacaoRua() {
        return emSituacaoDeRuaTrift.isSetTempoSituacaoRua();
    }

    public void setTempoSituacaoRuaIsSet(boolean value) {
        emSituacaoDeRuaTrift.setTempoSituacaoRuaIsSet(value);
    }

    public int compareTo(EmSituacaoDeRua other) {
        return emSituacaoDeRuaTrift.compareTo(other.getInstance());
    }

    public void validate() throws TException {
        emSituacaoDeRuaTrift.validate();
    }
    
    protected EmSituacaoDeRuaThrift getInstance(){
        return emSituacaoDeRuaTrift;
    }
}

