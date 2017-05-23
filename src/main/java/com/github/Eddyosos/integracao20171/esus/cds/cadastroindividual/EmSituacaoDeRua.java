package com.github.Eddyosos.integracao20171.esus.cds.cadastroindividual;

import br.gov.saude.esus.cds.transport.generated.thrift.cadastroindividual.EmSituacaoDeRuaThrift;
import java.util.Iterator;
import java.util.List;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;

public class EmSituacaoDeRua {
    private EmSituacaoDeRuaThrift emSituacaoDeRuaThrift = new EmSituacaoDeRuaThrift();
    
    protected EmSituacaoDeRua(EmSituacaoDeRuaThrift emSituacaoDeRua){
        this.emSituacaoDeRuaThrift = emSituacaoDeRua;
    }

    public EmSituacaoDeRua deepCopy() {
        return new EmSituacaoDeRua(emSituacaoDeRuaThrift.deepCopy());
    }

    public void clear() {
        emSituacaoDeRuaThrift.clear();
    }

    public String getGrauParentescoFamiliarFrequentado() {
        return emSituacaoDeRuaThrift.getGrauParentescoFamiliarFrequentado();
    }

    public void setGrauParentescoFamiliarFrequentado(String grauParentescoFamiliarFrequentado) {
        emSituacaoDeRuaThrift.setGrauParentescoFamiliarFrequentado(grauParentescoFamiliarFrequentado);
    }

    public void unsetGrauParentescoFamiliarFrequentado() {
        emSituacaoDeRuaThrift.unsetGrauParentescoFamiliarFrequentado();
    }

    public boolean isSetGrauParentescoFamiliarFrequentado() {
        return emSituacaoDeRuaThrift.isSetGrauParentescoFamiliarFrequentado();
    }

    public void setGrauParentescoFamiliarFrequentadoIsSet(boolean value) {
        emSituacaoDeRuaThrift.setGrauParentescoFamiliarFrequentadoIsSet(value);
    }

    public int getHigienePessoalSituacaoRuaSize() {
        return emSituacaoDeRuaThrift.getHigienePessoalSituacaoRuaSize();
    }

    public Iterator<Long> getHigienePessoalSituacaoRuaIterator() {
        return emSituacaoDeRuaThrift.getHigienePessoalSituacaoRuaIterator();
    }

    public void addToHigienePessoalSituacaoRua(long elem) {
        emSituacaoDeRuaThrift.addToHigienePessoalSituacaoRua(elem);
    }

    public List<Long> getHigienePessoalSituacaoRua() {
        return emSituacaoDeRuaThrift.getHigienePessoalSituacaoRua();
    }

    public void setHigienePessoalSituacaoRua(List<Long> higienePessoalSituacaoRua) {
        emSituacaoDeRuaThrift.setHigienePessoalSituacaoRua(higienePessoalSituacaoRua);
    }

    public void unsetHigienePessoalSituacaoRua() {
        emSituacaoDeRuaThrift.unsetHigienePessoalSituacaoRua();
    }

    public boolean isSetHigienePessoalSituacaoRua() {
        return emSituacaoDeRuaThrift.isSetHigienePessoalSituacaoRua();
    }

    public void setHigienePessoalSituacaoRuaIsSet(boolean value) {
        emSituacaoDeRuaThrift.setHigienePessoalSituacaoRuaIsSet(value);
    }

    public int getOrigemAlimentoSituacaoRuaSize() {
        return emSituacaoDeRuaThrift.getOrigemAlimentoSituacaoRuaSize();
    }

    public Iterator<Long> getOrigemAlimentoSituacaoRuaIterator() {
        return emSituacaoDeRuaThrift.getOrigemAlimentoSituacaoRuaIterator();
    }

    public void addToOrigemAlimentoSituacaoRua(long elem) {
        emSituacaoDeRuaThrift.addToOrigemAlimentoSituacaoRua(elem);
    }

    public List<Long> getOrigemAlimentoSituacaoRua() {
        return emSituacaoDeRuaThrift.getOrigemAlimentoSituacaoRua();
    }

    public void setOrigemAlimentoSituacaoRua(List<Long> origemAlimentoSituacaoRua) {
        emSituacaoDeRuaThrift.setOrigemAlimentoSituacaoRua(origemAlimentoSituacaoRua);
    }

    public void unsetOrigemAlimentoSituacaoRua() {
        emSituacaoDeRuaThrift.unsetOrigemAlimentoSituacaoRua();
    }

    public boolean isSetOrigemAlimentoSituacaoRua() {
        return emSituacaoDeRuaThrift.isSetOrigemAlimentoSituacaoRua();
    }

    public void setOrigemAlimentoSituacaoRuaIsSet(boolean value) {
        emSituacaoDeRuaThrift.setOrigemAlimentoSituacaoRuaIsSet(value);
    }

    public String getOutraInstituicaoQueAcompanha() {
        return emSituacaoDeRuaThrift.getOutraInstituicaoQueAcompanha();
    }

    public void setOutraInstituicaoQueAcompanha(String outraInstituicaoQueAcompanha) {
        emSituacaoDeRuaThrift.setOutraInstituicaoQueAcompanha(outraInstituicaoQueAcompanha);
    }

    public void unsetOutraInstituicaoQueAcompanha() {
        emSituacaoDeRuaThrift.unsetOutraInstituicaoQueAcompanha();
    }

    public boolean isSetOutraInstituicaoQueAcompanha() {
        return emSituacaoDeRuaThrift.isSetOutraInstituicaoQueAcompanha();
    }

    public void setOutraInstituicaoQueAcompanhaIsSet(boolean value) {
        emSituacaoDeRuaThrift.setOutraInstituicaoQueAcompanhaIsSet(value);
    }

    public long getQuantidadeAlimentacoesAoDiaSituacaoRua() {
        return emSituacaoDeRuaThrift.getQuantidadeAlimentacoesAoDiaSituacaoRua();
    }

    public void setQuantidadeAlimentacoesAoDiaSituacaoRua(long quantidadeAlimentacoesAoDiaSituacaoRua) {
        emSituacaoDeRuaThrift.setQuantidadeAlimentacoesAoDiaSituacaoRua(quantidadeAlimentacoesAoDiaSituacaoRua);
    }

    public void unsetQuantidadeAlimentacoesAoDiaSituacaoRua() {
        emSituacaoDeRuaThrift.unsetQuantidadeAlimentacoesAoDiaSituacaoRua();
    }

    public boolean isSetQuantidadeAlimentacoesAoDiaSituacaoRua() {
        return emSituacaoDeRuaThrift.isSetQuantidadeAlimentacoesAoDiaSituacaoRua();
    }

    public void setQuantidadeAlimentacoesAoDiaSituacaoRuaIsSet(boolean value) {
        emSituacaoDeRuaThrift.setQuantidadeAlimentacoesAoDiaSituacaoRuaIsSet(value);
    }

    public boolean isStatusAcompanhadoPorOutraInstituicao() {
        return emSituacaoDeRuaThrift.isStatusAcompanhadoPorOutraInstituicao();
    }

    public void setStatusAcompanhadoPorOutraInstituicao(boolean statusAcompanhadoPorOutraInstituicao) {
        emSituacaoDeRuaThrift.setStatusAcompanhadoPorOutraInstituicao(statusAcompanhadoPorOutraInstituicao);
    }

    public void unsetStatusAcompanhadoPorOutraInstituicao() {
        emSituacaoDeRuaThrift.unsetStatusAcompanhadoPorOutraInstituicao();
    }

    public boolean isSetStatusAcompanhadoPorOutraInstituicao() {
        return emSituacaoDeRuaThrift.isSetStatusAcompanhadoPorOutraInstituicao();
    }

    public void setStatusAcompanhadoPorOutraInstituicaoIsSet(boolean value) {
        emSituacaoDeRuaThrift.setStatusAcompanhadoPorOutraInstituicaoIsSet(value);
    }

    public boolean isStatusPossuiReferenciaFamiliar() {
        return emSituacaoDeRuaThrift.isStatusPossuiReferenciaFamiliar();
    }

    public void setStatusPossuiReferenciaFamiliar(boolean statusPossuiReferenciaFamiliar) {
        emSituacaoDeRuaThrift.setStatusPossuiReferenciaFamiliar(statusPossuiReferenciaFamiliar);
    }

    public void unsetStatusPossuiReferenciaFamiliar() {
        emSituacaoDeRuaThrift.unsetStatusPossuiReferenciaFamiliar();
    }

    public boolean isSetStatusPossuiReferenciaFamiliar() {
        return emSituacaoDeRuaThrift.isSetStatusPossuiReferenciaFamiliar();
    }

    public void setStatusPossuiReferenciaFamiliarIsSet(boolean value) {
        emSituacaoDeRuaThrift.setStatusPossuiReferenciaFamiliarIsSet(value);
    }

    public boolean isStatusRecebeBeneficio() {
        return emSituacaoDeRuaThrift.isStatusRecebeBeneficio();
    }

    public void setStatusRecebeBeneficio(boolean statusRecebeBeneficio) {
        emSituacaoDeRuaThrift.setStatusRecebeBeneficio(statusRecebeBeneficio);
    }

    public void unsetStatusRecebeBeneficio() {
        emSituacaoDeRuaThrift.unsetStatusRecebeBeneficio();
    }

    public boolean isSetStatusRecebeBeneficio() {
        return emSituacaoDeRuaThrift.isSetStatusRecebeBeneficio();
    }

    public void setStatusRecebeBeneficioIsSet(boolean value) {
        emSituacaoDeRuaThrift.setStatusRecebeBeneficioIsSet(value);
    }

    public boolean isStatusSituacaoRua() {
        return emSituacaoDeRuaThrift.isStatusSituacaoRua();
    }

    public void setStatusSituacaoRua(boolean statusSituacaoRua) {
        emSituacaoDeRuaThrift.setStatusSituacaoRua(statusSituacaoRua);
    }

    public void unsetStatusSituacaoRua() {
        emSituacaoDeRuaThrift.unsetStatusSituacaoRua();
    }

    public boolean isSetStatusSituacaoRua() {
        return emSituacaoDeRuaThrift.isSetStatusSituacaoRua();
    }

    public void setStatusSituacaoRuaIsSet(boolean value) {
        emSituacaoDeRuaThrift.setStatusSituacaoRuaIsSet(value);
    }

    public boolean isStatusTemAcessoHigienePessoalSituacaoRua() {
        return emSituacaoDeRuaThrift.isStatusTemAcessoHigienePessoalSituacaoRua();
    }

    public void setStatusTemAcessoHigienePessoalSituacaoRua(boolean statusTemAcessoHigienePessoalSituacaoRua) {
        emSituacaoDeRuaThrift.setStatusTemAcessoHigienePessoalSituacaoRua(statusTemAcessoHigienePessoalSituacaoRua);
    }

    public void unsetStatusTemAcessoHigienePessoalSituacaoRua() {
        emSituacaoDeRuaThrift.unsetStatusTemAcessoHigienePessoalSituacaoRua();
    }

    public boolean isSetStatusTemAcessoHigienePessoalSituacaoRua() {
        return emSituacaoDeRuaThrift.isSetStatusTemAcessoHigienePessoalSituacaoRua();
    }

    public void setStatusTemAcessoHigienePessoalSituacaoRuaIsSet(boolean value) {
        emSituacaoDeRuaThrift.setStatusTemAcessoHigienePessoalSituacaoRuaIsSet(value);
    }

    public boolean isStatusVisitaFamiliarFrequentemente() {
        return emSituacaoDeRuaThrift.isStatusVisitaFamiliarFrequentemente();
    }

    public void setStatusVisitaFamiliarFrequentemente(boolean statusVisitaFamiliarFrequentemente) {
        emSituacaoDeRuaThrift.setStatusVisitaFamiliarFrequentemente(statusVisitaFamiliarFrequentemente);
    }

    public void unsetStatusVisitaFamiliarFrequentemente() {
        emSituacaoDeRuaThrift.unsetStatusVisitaFamiliarFrequentemente();
    }

    public boolean isSetStatusVisitaFamiliarFrequentemente() {
        return emSituacaoDeRuaThrift.isSetStatusVisitaFamiliarFrequentemente();
    }

    public void setStatusVisitaFamiliarFrequentementeIsSet(boolean value) {
        emSituacaoDeRuaThrift.setStatusVisitaFamiliarFrequentementeIsSet(value);
    }

    public long getTempoSituacaoRua() {
        return emSituacaoDeRuaThrift.getTempoSituacaoRua();
    }

    public void setTempoSituacaoRua(long tempoSituacaoRua) {
        emSituacaoDeRuaThrift.setTempoSituacaoRua(tempoSituacaoRua);
    }

    public void unsetTempoSituacaoRua() {
        emSituacaoDeRuaThrift.unsetTempoSituacaoRua();
    }

    public boolean isSetTempoSituacaoRua() {
        return emSituacaoDeRuaThrift.isSetTempoSituacaoRua();
    }

    public void setTempoSituacaoRuaIsSet(boolean value) {
        emSituacaoDeRuaThrift.setTempoSituacaoRuaIsSet(value);
    }

    @Override
    public boolean equals(Object that) {
        return emSituacaoDeRuaThrift.equals(that);
    }

    public boolean equals(EmSituacaoDeRua that) {
        return emSituacaoDeRuaThrift.equals(that.getInstance());
    }

    @Override
    public int hashCode() {
        return emSituacaoDeRuaThrift.hashCode();
    }

    public int compareTo(EmSituacaoDeRua other) {
        return emSituacaoDeRuaThrift.compareTo(other.getInstance());
    }

    @Override
    public String toString() {
        return emSituacaoDeRuaThrift.toString();
    }

    public void validate() throws TException {
        emSituacaoDeRuaThrift.validate();
    }


    protected EmSituacaoDeRuaThrift getInstance(){
        return emSituacaoDeRuaThrift;
    }
}

