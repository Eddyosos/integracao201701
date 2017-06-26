package com.github.Eddyosos.integracao20171.esus.cds.cadastroindividual;

import br.gov.saude.esus.cds.transport.generated.thrift.cadastroindividual.EmSituacaoDeRuaThrift;
import java.util.Iterator;
import java.util.List;
import org.apache.thrift.TException;

public class EmSituacaoDeRua {
    private EmSituacaoDeRuaThrift instance;
    
    public EmSituacaoDeRua(EmSituacaoDeRuaThrift emSituacaoDeRua){
        this.instance = emSituacaoDeRua;
    }

    public EmSituacaoDeRua() {
        this.instance = new EmSituacaoDeRuaThrift();
    }

    public void clear() {
        instance.clear();
    }

    /**
     * Valida a instancia
     * @return true se válido
     *          false se inválido
     */
    public boolean validates(){
        return validaGrauParentescoFamiliarFrequentado();
    }
    
    /**
     * Valida GrauParentescoFamiliarFrequentado.
     * Para ser válido, caso inserido, deve:
     * 1- Não pode ser preechido se o campo statusSituacaoRua = false.
     * 2- Não pode ser preenchido se o campo statusVisitaFamiliarFrequentemente = false.
     * @return true se válido
     *          false se inválido
     */
    public boolean validaGrauParentescoFamiliarFrequentado(){
        return !instance.isSetGrauParentescoFamiliarFrequentado() || (
                instance.getGrauParentescoFamiliarFrequentado().length() <= 100 && (
                !instance.isSetStatusSituacaoRua() || 
                instance.isStatusSituacaoRua()) && (
                !instance.isSetStatusVisitaFamiliarFrequentemente() ||
                instance.isStatusVisitaFamiliarFrequentemente()));
    }
    
    /**
     * Grau de parentesco do familiar que frequenta.
     * @return 
     */
    public String getGrauParentescoFamiliarFrequentado() {
        return instance.getGrauParentescoFamiliarFrequentado();
    }

    /**
     * Grau de parentesco do familiar que frequenta.
     * @param grauParentescoFamiliarFrequentado 
     */
    public void setGrauParentescoFamiliarFrequentado(String grauParentescoFamiliarFrequentado) {
        instance.setGrauParentescoFamiliarFrequentado(grauParentescoFamiliarFrequentado);
    }
    
    /**
     * Valida HigienePessoalSituacaoRua.
     * Para ser válida, caso inserida, deve:
     * 1- Não pode ser preechido se o campo statusSituacaoRua = false.
     * 2- Requerido preenchimento de pelo menos um item se o campo statusTemAcessoHigienePessoalSituacaoRua = true.
     * @return true se válido
     *          false se inválido
     */
    public boolean validateHigienePessoalSituacaoRua(){
        return !instance.isSetHigienePessoalSituacaoRua() || ((
                !instance.isSetStatusSituacaoRua() ||
                instance.isSetStatusTemAcessoHigienePessoalSituacaoRua() ) &&
                !instance.isSetStatusTemAcessoHigienePessoalSituacaoRua() ||
                !instance.isStatusTemAcessoHigienePessoalSituacaoRua() || (
                instance.getHigienePessoalSituacaoRuaSize() > 0 &&
                instance.getHigienePessoalSituacaoRuaSize() <= 4));
                
                
    }
    
    /**
     * Código das condições de higiene que o cidadão tem acesso.
     * @return 
     */
    public List<Long> getHigienePessoalSituacaoRua() {
        return instance.getHigienePessoalSituacaoRua();
    }

    /**
     * Código das condições de higiene que o cidadão tem acesso.
     * @param higienePessoalSituacaoRua 
     */
    public void setHigienePessoalSituacaoRua(List<Long> higienePessoalSituacaoRua) {
        instance.setHigienePessoalSituacaoRua(higienePessoalSituacaoRua);
    }

    public int getOrigemAlimentoSituacaoRuaSize() {
        return instance.getOrigemAlimentoSituacaoRuaSize();
    }

    public Iterator<Long> getOrigemAlimentoSituacaoRuaIterator() {
        return instance.getOrigemAlimentoSituacaoRuaIterator();
    }

    public void addToOrigemAlimentoSituacaoRua(long elem) {
        instance.addToOrigemAlimentoSituacaoRua(elem);
    }

    public List<Long> getOrigemAlimentoSituacaoRua() {
        return instance.getOrigemAlimentoSituacaoRua();
    }

    public void setOrigemAlimentoSituacaoRua(List<Long> origemAlimentoSituacaoRua) {
        instance.setOrigemAlimentoSituacaoRua(origemAlimentoSituacaoRua);
    }

    public void unsetOrigemAlimentoSituacaoRua() {
        instance.unsetOrigemAlimentoSituacaoRua();
    }

    public boolean isSetOrigemAlimentoSituacaoRua() {
        return instance.isSetOrigemAlimentoSituacaoRua();
    }

    public void setOrigemAlimentoSituacaoRuaIsSet(boolean value) {
        instance.setOrigemAlimentoSituacaoRuaIsSet(value);
    }

    public String getOutraInstituicaoQueAcompanha() {
        return instance.getOutraInstituicaoQueAcompanha();
    }

    public void setOutraInstituicaoQueAcompanha(String outraInstituicaoQueAcompanha) {
        instance.setOutraInstituicaoQueAcompanha(outraInstituicaoQueAcompanha);
    }

    public void unsetOutraInstituicaoQueAcompanha() {
        instance.unsetOutraInstituicaoQueAcompanha();
    }

    public boolean isSetOutraInstituicaoQueAcompanha() {
        return instance.isSetOutraInstituicaoQueAcompanha();
    }

    public void setOutraInstituicaoQueAcompanhaIsSet(boolean value) {
        instance.setOutraInstituicaoQueAcompanhaIsSet(value);
    }

    public long getQuantidadeAlimentacoesAoDiaSituacaoRua() {
        return instance.getQuantidadeAlimentacoesAoDiaSituacaoRua();
    }

    public void setQuantidadeAlimentacoesAoDiaSituacaoRua(long quantidadeAlimentacoesAoDiaSituacaoRua) {
        instance.setQuantidadeAlimentacoesAoDiaSituacaoRua(quantidadeAlimentacoesAoDiaSituacaoRua);
    }

    public void unsetQuantidadeAlimentacoesAoDiaSituacaoRua() {
        instance.unsetQuantidadeAlimentacoesAoDiaSituacaoRua();
    }

    public boolean isSetQuantidadeAlimentacoesAoDiaSituacaoRua() {
        return instance.isSetQuantidadeAlimentacoesAoDiaSituacaoRua();
    }

    public void setQuantidadeAlimentacoesAoDiaSituacaoRuaIsSet(boolean value) {
        instance.setQuantidadeAlimentacoesAoDiaSituacaoRuaIsSet(value);
    }

    public boolean isStatusAcompanhadoPorOutraInstituicao() {
        return instance.isStatusAcompanhadoPorOutraInstituicao();
    }

    public void setStatusAcompanhadoPorOutraInstituicao(boolean statusAcompanhadoPorOutraInstituicao) {
        instance.setStatusAcompanhadoPorOutraInstituicao(statusAcompanhadoPorOutraInstituicao);
    }

    public void unsetStatusAcompanhadoPorOutraInstituicao() {
        instance.unsetStatusAcompanhadoPorOutraInstituicao();
    }

    public boolean isSetStatusAcompanhadoPorOutraInstituicao() {
        return instance.isSetStatusAcompanhadoPorOutraInstituicao();
    }

    public void setStatusAcompanhadoPorOutraInstituicaoIsSet(boolean value) {
        instance.setStatusAcompanhadoPorOutraInstituicaoIsSet(value);
    }

    public boolean isStatusPossuiReferenciaFamiliar() {
        return instance.isStatusPossuiReferenciaFamiliar();
    }

    public void setStatusPossuiReferenciaFamiliar(boolean statusPossuiReferenciaFamiliar) {
        instance.setStatusPossuiReferenciaFamiliar(statusPossuiReferenciaFamiliar);
    }

    public void unsetStatusPossuiReferenciaFamiliar() {
        instance.unsetStatusPossuiReferenciaFamiliar();
    }

    public boolean isSetStatusPossuiReferenciaFamiliar() {
        return instance.isSetStatusPossuiReferenciaFamiliar();
    }

    public void setStatusPossuiReferenciaFamiliarIsSet(boolean value) {
        instance.setStatusPossuiReferenciaFamiliarIsSet(value);
    }

    public boolean isStatusRecebeBeneficio() {
        return instance.isStatusRecebeBeneficio();
    }

    public void setStatusRecebeBeneficio(boolean statusRecebeBeneficio) {
        instance.setStatusRecebeBeneficio(statusRecebeBeneficio);
    }

    public void unsetStatusRecebeBeneficio() {
        instance.unsetStatusRecebeBeneficio();
    }

    public boolean isSetStatusRecebeBeneficio() {
        return instance.isSetStatusRecebeBeneficio();
    }

    public void setStatusRecebeBeneficioIsSet(boolean value) {
        instance.setStatusRecebeBeneficioIsSet(value);
    }

    public boolean isStatusSituacaoRua() {
        return instance.isStatusSituacaoRua();
    }

    public void setStatusSituacaoRua(boolean statusSituacaoRua) {
        instance.setStatusSituacaoRua(statusSituacaoRua);
    }

    public void unsetStatusSituacaoRua() {
        instance.unsetStatusSituacaoRua();
    }

    public boolean isSetStatusSituacaoRua() {
        return instance.isSetStatusSituacaoRua();
    }

    public void setStatusSituacaoRuaIsSet(boolean value) {
        instance.setStatusSituacaoRuaIsSet(value);
    }

    public boolean isStatusTemAcessoHigienePessoalSituacaoRua() {
        return instance.isStatusTemAcessoHigienePessoalSituacaoRua();
    }

    public void setStatusTemAcessoHigienePessoalSituacaoRua(boolean statusTemAcessoHigienePessoalSituacaoRua) {
        instance.setStatusTemAcessoHigienePessoalSituacaoRua(statusTemAcessoHigienePessoalSituacaoRua);
    }

    public void unsetStatusTemAcessoHigienePessoalSituacaoRua() {
        instance.unsetStatusTemAcessoHigienePessoalSituacaoRua();
    }

    public boolean isSetStatusTemAcessoHigienePessoalSituacaoRua() {
        return instance.isSetStatusTemAcessoHigienePessoalSituacaoRua();
    }

    public void setStatusTemAcessoHigienePessoalSituacaoRuaIsSet(boolean value) {
        instance.setStatusTemAcessoHigienePessoalSituacaoRuaIsSet(value);
    }

    public boolean isStatusVisitaFamiliarFrequentemente() {
        return instance.isStatusVisitaFamiliarFrequentemente();
    }

    public void setStatusVisitaFamiliarFrequentemente(boolean statusVisitaFamiliarFrequentemente) {
        instance.setStatusVisitaFamiliarFrequentemente(statusVisitaFamiliarFrequentemente);
    }

    public void unsetStatusVisitaFamiliarFrequentemente() {
        instance.unsetStatusVisitaFamiliarFrequentemente();
    }

    public boolean isSetStatusVisitaFamiliarFrequentemente() {
        return instance.isSetStatusVisitaFamiliarFrequentemente();
    }

    public void setStatusVisitaFamiliarFrequentementeIsSet(boolean value) {
        instance.setStatusVisitaFamiliarFrequentementeIsSet(value);
    }

    public long getTempoSituacaoRua() {
        return instance.getTempoSituacaoRua();
    }

    public void setTempoSituacaoRua(long tempoSituacaoRua) {
        instance.setTempoSituacaoRua(tempoSituacaoRua);
    }

    public void unsetTempoSituacaoRua() {
        instance.unsetTempoSituacaoRua();
    }

    public boolean isSetTempoSituacaoRua() {
        return instance.isSetTempoSituacaoRua();
    }

    public void setTempoSituacaoRuaIsSet(boolean value) {
        instance.setTempoSituacaoRuaIsSet(value);
    }

    @Override
    public boolean equals(Object that) {
        return instance.equals(that);
    }

    public boolean equals(EmSituacaoDeRua that) {
        return instance.equals(that.getInstance());
    }

    @Override
    public int hashCode() {
        return instance.hashCode();
    }

    public int compareTo(EmSituacaoDeRua other) {
        return instance.compareTo(other.getInstance());
    }

    @Override
    public String toString() {
        return instance.toString();
    }

    public void validate() throws TException {
        instance.validate();
    }


    protected EmSituacaoDeRuaThrift getInstance(){
        return instance;
    }
}

