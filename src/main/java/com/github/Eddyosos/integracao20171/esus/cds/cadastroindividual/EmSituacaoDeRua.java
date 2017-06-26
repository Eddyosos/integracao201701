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
        return validateGrauParentescoFamiliarFrequentado() &&
                validateHigienePessoalSituacaoRua() &&
                validateOrigemAlimentoSituacaoRua() &&
                validateOutraInstituicaoQueAcompanha() &&
                validateQuantidadeAlimentacoesAoDiaSituacaoRua() &&
                validateStatusAcompanhadoPorOutraInstituicao() &&
                validateStatusPossuiReferenciaFamiliar() &&
                validateStatusSituacaoRua() &&
                validateStatusVisitaFamiliarFrequentemente() &&
                validateTempoSituacaoRua();
    }
    
    /**
     * Valida GrauParentescoFamiliarFrequentado.
     * Para ser válido, caso inserido, deve:
     * 1- Não pode ser preechido se o campo statusSituacaoRua = false.
     * 2- Não pode ser preenchido se o campo statusVisitaFamiliarFrequentemente = false.
     * @return true se válido
     *          false se inválido
     */
    public boolean validateGrauParentescoFamiliarFrequentado(){
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
    
    /**
     * Valida OrigemAlimentoSituacaoRua.
     * Para ser válida, caso inserida, deve:
     * 1- Não pode ser preechido se o campo statusSituacaoRua = false.
     * 2- Máximo 5
     * 
     * @return true se válido
     *          false se inválido
     */
    public boolean validateOrigemAlimentoSituacaoRua(){
        if(instance.isSetOrigemAlimentoSituacaoRua()){
            if(! instance.isStatusSituacaoRua()) return false;
            
            for(long origem : instance.getOrigemAlimentoSituacaoRua()){
                if(origem < 37l || origem > 41l){
                    return false;
                }
            }
        }
                
        return true;    
    }

    /**
     * A quantidade de origens da alimentação do cidadão em situação de rua.
     * 
     * @return Quantidade de origens da alimentação do cidadão em situação de rua.
     */
    public int getOrigemAlimentoSituacaoRuaSize() {
        return instance.getOrigemAlimentoSituacaoRuaSize();
    }

    /**
     * Origens da alimentação do cidadão em situação de rua.
     * 
     * @return Código da origem da alimentação do cidadão em situação de rua.
     */
    public Iterator<Long> getOrigemAlimentoSituacaoRuaIterator() {
        return instance.getOrigemAlimentoSituacaoRuaIterator();
    }

    /**
     * Adiciona uma origem da alimentação do cidadão em situação de rua.
     * 
     * Máximo: 5
     * Regras: Não pode ser preechido se o campo statusSituacaoRua = false.
     * 
     * @param elem Código da origem da alimentação do cidadão em situação de rua
     */
    public void addToOrigemAlimentoSituacaoRua(long elem) {
        instance.addToOrigemAlimentoSituacaoRua(elem);
    }

    /**
     * Origens da alimentação do cidadão em situação de rua.
     * 
     * @return Código da origem da alimentação do cidadão em situação de rua.
     */
    public List<Long> getOrigemAlimentoSituacaoRua() {
        return instance.getOrigemAlimentoSituacaoRua();
    }
    /**
     * Define as origens da alimentação do cidadão em situação de rua.
     * 
     * Máximo: 5
     * Regras: Não pode ser preechido se o campo statusSituacaoRua = false.
     * 
     * @param origemAlimentoSituacaoRua Código da origem da alimentação do cidadão em situação de rua
     */
    public void setOrigemAlimentoSituacaoRua(List<Long> origemAlimentoSituacaoRua) {
        instance.setOrigemAlimentoSituacaoRua(origemAlimentoSituacaoRua);
    }

    /**
     * Remove a origem da alimentação do cidadão em situação de rua.
     */
    public void unsetOrigemAlimentoSituacaoRua() {
        instance.unsetOrigemAlimentoSituacaoRua();
    }

    /**
     * Verifica se a origem da alimentação do cidadão em situação de rua foi declarada.
     * @return True caso tenha sido declarada, caso contrario False.
     */
    public boolean isSetOrigemAlimentoSituacaoRua() {
        return instance.isSetOrigemAlimentoSituacaoRua();
    }

    /**
     * Declara que a origem da alimentação do cidadão em situação de rua foi inserida.
     * 
     * @param value True para declarar que foi inserida, caso contrario False.
     */
    public void setOrigemAlimentoSituacaoRuaIsSet(boolean value) {
        instance.setOrigemAlimentoSituacaoRuaIsSet(value);
    }

    /**
     * Valida OutraInstituicaoQueAcompanha.
     * Para ser válida, caso inserida, deve:
     * 1- Não pode ser preechido se o campo statusSituacaoRua = false.
     * 2- Não pode ser preenchido se o campo statusAcompanhadoPorOutraInstituição = false.
     * 3- Tamanho máximo 100.
     * 
     * @return true se válido
     *          false se inválido
     */
    public boolean validateOutraInstituicaoQueAcompanha(){
        if(instance.isSetOutraInstituicaoQueAcompanha()){
            if(! instance.isStatusSituacaoRua() || ! instance.isStatusAcompanhadoPorOutraInstituicao()) return false;
            
            return instance.getOutraInstituicaoQueAcompanha().length() <= 100;
        }
                
        return true;    
    }
    
    /**
     * Nome de outra instituição que acompanha o cidadão.
     * 
     * @return Nome de outra instituição que acompanha o cidadão.
     */
    public String getOutraInstituicaoQueAcompanha() {
        return instance.getOutraInstituicaoQueAcompanha();
    }

    /**
     * Define o nome de outra instituição que acompanha o cidadão.
     * 
     * Tamanho máximo: 100
     * 
     * Regra: Não pode ser preechido se o campo statusSituacaoRua = false.
     * Regra: Não pode ser preenchido se o campo statusAcompanhadoPorOutraInstituição = false.
     * 
     * @param outraInstituicaoQueAcompanha Nome de outra instituição que acompanha o cidadão.
     */
    public void setOutraInstituicaoQueAcompanha(String outraInstituicaoQueAcompanha) {
        instance.setOutraInstituicaoQueAcompanha(outraInstituicaoQueAcompanha);
    }

    /**
     * Remove o nome de outra instituição que acompanha o cidadão.
     */
    public void unsetOutraInstituicaoQueAcompanha() {
        instance.unsetOutraInstituicaoQueAcompanha();
    }

    /**
     * Verifica se o nome de outra instituição que acompanha o cidadão foi declarado.
     * 
     * @return True caso tenha sido declarada, caso contrario False.
     */
    public boolean isSetOutraInstituicaoQueAcompanha() {
        return instance.isSetOutraInstituicaoQueAcompanha();
    }

    /**
     * Declara que o nome de outra instituição que acompanha o cidadão foi inserido.
     * 
     * @param value True para declarar que foi inserido, caso contrario False.
     */
    public void setOutraInstituicaoQueAcompanhaIsSet(boolean value) {
        instance.setOutraInstituicaoQueAcompanhaIsSet(value);
    }

    /**
     * Valida QuantidadeAlimentacoesAoDiaSituacaoRua.
     * Para ser válida, caso inserida, deve:
     * 1- Não pode ser preechido se o campo statusSituacaoRua = false.
     * 
     * @return true se válido
     *          false se inválido
     */
    public boolean validateQuantidadeAlimentacoesAoDiaSituacaoRua(){
        if(instance.isSetQuantidadeAlimentacoesAoDiaSituacaoRua()){
            if(! instance.isStatusSituacaoRua() ) return false;
        }
                
        return true;    
    }
    
    /**
     * Quantidade de vezes que o cidadão se alimenta por dia.
     * @return Código da quantidade de vezes que o cidadão se alimenta por dia.
     */
    public long getQuantidadeAlimentacoesAoDiaSituacaoRua() {
        return instance.getQuantidadeAlimentacoesAoDiaSituacaoRua();
    }

    /**
     * Define a quantidade de vezes que o cidadão se alimenta por dia.
     * 
     * Regras: Não pode ser preechido se o campo statusSituacaoRua = false.
     * 
     * @param quantidadeAlimentacoesAoDiaSituacaoRua Código da quantidade de vezes que o cidadão se alimenta por dia.
     */
    public void setQuantidadeAlimentacoesAoDiaSituacaoRua(long quantidadeAlimentacoesAoDiaSituacaoRua) {
        instance.setQuantidadeAlimentacoesAoDiaSituacaoRua(quantidadeAlimentacoesAoDiaSituacaoRua);
    }

    /**
     * Remove a quantidade de vezes que o cidadão se alimenta por dia.
     */
    public void unsetQuantidadeAlimentacoesAoDiaSituacaoRua() {
        instance.unsetQuantidadeAlimentacoesAoDiaSituacaoRua();
    }

    /**
     * Verifica se a quantidade de vezes que o cidadão se alimenta por dia foi declarada.
     * 
     * @return True caso tenha sido declarada, caso contrario False.
     */
    public boolean isSetQuantidadeAlimentacoesAoDiaSituacaoRua() {
        return instance.isSetQuantidadeAlimentacoesAoDiaSituacaoRua();
    }

    /**
     * Declara que a quantidade de vezes que o cidadão se alimenta por dia foi inserida
     * 
     * @param value True para declarar que foi inserida, caso contrario False.
     */
    public void setQuantidadeAlimentacoesAoDiaSituacaoRuaIsSet(boolean value) {
        instance.setQuantidadeAlimentacoesAoDiaSituacaoRuaIsSet(value);
    }

    /**
     * Valida StatusAcompanhadoPorOutraInstituicao.
     * Para ser válida, caso inserida, deve:
     * 1- Não pode ser preechido se o campo statusSituacaoRua = false.
     * 
     * @return true se válido
     *          false se inválido
     */
    public boolean validateStatusAcompanhadoPorOutraInstituicao(){
        if(instance.isSetStatusAcompanhadoPorOutraInstituicao()){
            if(! instance.isStatusSituacaoRua() ) return false;
        }
                
        return true;    
    }
    
    /**
     * Verifica se o cidadão é acompanhado por outra instituição.
     * 
     * @return True caso seja acompanhado por outra instituição, caso contrario False.
     */
    public boolean isStatusAcompanhadoPorOutraInstituicao() {
        return instance.isStatusAcompanhadoPorOutraInstituicao();
    }

    /**
     * Declara que a informação que informa se o cidadão é ou não acompanhado por outra instituição foi inserida.
     * 
     * @param statusAcompanhadoPorOutraInstituicao True para declarar que foi inserido, caso contrario False.
     */
    public void setStatusAcompanhadoPorOutraInstituicao(boolean statusAcompanhadoPorOutraInstituicao) {
        instance.setStatusAcompanhadoPorOutraInstituicao(statusAcompanhadoPorOutraInstituicao);
    }

    /**
     * Remove a a informação que informa se o cidadão é ou não acompanhado por outra instituição.
     */
    public void unsetStatusAcompanhadoPorOutraInstituicao() {
        instance.unsetStatusAcompanhadoPorOutraInstituicao();
    }

    /**
     * Verifica se foi declarada a informação que informa se o cidadão é ou não acompanhado por outra instituição.
     * 
     * @return True caso tenha sido inserida, caso contrario False.
     */
    public boolean isSetStatusAcompanhadoPorOutraInstituicao() {
        return instance.isSetStatusAcompanhadoPorOutraInstituicao();
    }

    /**
     * Declara que a informação que informa se o cidadão é ou não acompanhado por outra instituição foi inserida.
     * 
     * @param value True para declarar que foi inserido, caso contrario False.
     */
    public void setStatusAcompanhadoPorOutraInstituicaoIsSet(boolean value) {
        instance.setStatusAcompanhadoPorOutraInstituicaoIsSet(value);
    }

    /**
     * Valida StatusPossuiReferenciaFamiliar.
     * Para ser válida, caso inserida, deve:
     * 1- Não pode ser preechido se o campo statusSituacaoRua = false.
     * 
     * @return true se válido
     *          false se inválido
     */
    public boolean validateStatusPossuiReferenciaFamiliar(){
        if(instance.isSetStatusPossuiReferenciaFamiliar()){
            if(! instance.isStatusSituacaoRua() ) return false;
        }
                
        return true;    
    }
    
    /**
     * Indica se o cidadão possuiu alguma referência familiar.
     * 
     * @return True caso possua alguma referencia, caso contrario False.
     */
    public boolean isStatusPossuiReferenciaFamiliar() {
        return instance.isStatusPossuiReferenciaFamiliar();
    }

    /**
     * Define se o cidadão possuiu alguma referência familiar.
     * 
     * Regra: Não pode ser preechido se o campo statusSituacaoRua = false.
     * 
     * @param statusPossuiReferenciaFamiliar True para indicar que possui referencia, False caso contrario.
     */
    public void setStatusPossuiReferenciaFamiliar(boolean statusPossuiReferenciaFamiliar) {
        instance.setStatusPossuiReferenciaFamiliar(statusPossuiReferenciaFamiliar);
    }

    /**
     * Remove o marcador que indica se o cidadão possuiu alguma referência familiar.
     */
    public void unsetStatusPossuiReferenciaFamiliar() {
        instance.unsetStatusPossuiReferenciaFamiliar();
    }

    /**
     * Verifica se o marcador que indica se o cidadão possuiu alguma referência familiar foi declarado.
     * 
     * @return True caso tenha sido declarado, caso contraio false.
     */
    public boolean isSetStatusPossuiReferenciaFamiliar() {
        return instance.isSetStatusPossuiReferenciaFamiliar();
    }

    /**
     * Declara que o marcador que indica se o cidadão possuiu alguma referência familiar foi inserido.
     * 
     * @param value True para declarar que foi inserido, false caso contrario.
     */
    public void setStatusPossuiReferenciaFamiliarIsSet(boolean value) {
        instance.setStatusPossuiReferenciaFamiliarIsSet(value);
    }

    /**
     * Valida StatusRecebeBeneficio.
     * Para ser válida, caso inserida, deve:
     * 1- Não pode ser preechido se o campo statusSituacaoRua = false.
     * 
     * @return true se válido
     *          false se inválido
     */
    public boolean validateStatusRecebeBeneficio(){
        if(instance.isSetStatusRecebeBeneficio()){
            if(! instance.isStatusSituacaoRua() ) return false;
        }
                
        return true;    
    }
    
    /**
     * Indica se o cidadão recebe algum benefício.
     * 
     * @return True se o cidadão receber algum benefício, false caso não.
     */
    public boolean isStatusRecebeBeneficio() {
        return instance.isStatusRecebeBeneficio();
    }

    /**
     * Define se o cidadão recebe algum benefício.
     * 
     * Regra: Não pode ser preechido se o campo statusSituacaoRua = false.
     * 
     * @param statusRecebeBeneficio True para indicar que recebe algum benefício, false para indicar que não.
     */
    public void setStatusRecebeBeneficio(boolean statusRecebeBeneficio) {
        instance.setStatusRecebeBeneficio(statusRecebeBeneficio);
    }
    
    /**
     * Remove o marcador que indica se o cidadão recebe algum benefício.
     */
    public void unsetStatusRecebeBeneficio() {
        instance.unsetStatusRecebeBeneficio();
    }

    /**
     * Verifica se o marcador que indica se o cidadão recebe algum benefício foi declarado.
     * 
     * @return True caso tenha sido declarado, caso contrario False.
     */
    public boolean isSetStatusRecebeBeneficio() {
        return instance.isSetStatusRecebeBeneficio();
    }

    /**
     * Declara que o marcador que indica se o cidadão recebe algum benefício foi inserido.
     * 
     * @param value True para indicar que foi inserido, false caso contrario.
     */
    public void setStatusRecebeBeneficioIsSet(boolean value) {
        instance.setStatusRecebeBeneficioIsSet(value);
    }

    /**
     * Valida StatusSituacaoRua.
     * Para ser válida,  deve:
     * 1- Presença obrigatória.
     * 
     * @return true se válido
     *          false se inválido
     */
    public boolean validateStatusSituacaoRua(){

           return instance.isSetStatusSituacaoRua();
 
    }
    /**
     * Indica se o cidadão está em situação de rua.
     * 
     * @return True caso o cidadão esteja em situação de rua, caso contrario false.
     */
    public boolean isStatusSituacaoRua() {
        return instance.isStatusSituacaoRua();
    }

    /**
     * Define se o cidadão está em situação de rua.
     * 
     * Presença obrigatória.
     * 
     * @param statusSituacaoRua True para indicar que o cidadão está em situação de rua, caso contrario false.
     */
    public void setStatusSituacaoRua(boolean statusSituacaoRua) {
        instance.setStatusSituacaoRua(statusSituacaoRua);
    }

    /**
     * Remove o marcador que indica se o cidadão está em situação de rua.
     */
    public void unsetStatusSituacaoRua() {
        instance.unsetStatusSituacaoRua();
    }

    /**
     * Verifica se o marcador que indica se o cidadão está em situação de rua foi declarado.
     * 
     * @return True caso tenha sido declarado, false caso contrario.
     */
    public boolean isSetStatusSituacaoRua() {
        return instance.isSetStatusSituacaoRua();
    }

    /**
     * Declara que o marcador que indica se o cidadão está em situação de rua foi inserido.
     * 
     * @param value True para informar que foi inserido, false caso contrario.
     */
    public void setStatusSituacaoRuaIsSet(boolean value) {
        instance.setStatusSituacaoRuaIsSet(value);
    }
    
    /**
     * Valida StatusTemAcessoHigienePessoalSituacaoRua.
     * Para ser válida, caso inserida, deve:
     * 1- Não pode ser preechido se o campo statusSituacaoRua = false.
     * 
     * @return true se válido
     *          false se inválido
     */
    public boolean validateStatusTemAcessoHigienePessoalSituacaoRua(){
        if(instance.isSetStatusTemAcessoHigienePessoalSituacaoRua()){
            if(! instance.isStatusSituacaoRua() ) return false;
        }
                
        return true;    
    }

    /**
     * Indica se o cidadão tem acesso a higiene pessoal.
     * @return True caso tenha acesso, caso contrario false.
     */
    public boolean isStatusTemAcessoHigienePessoalSituacaoRua() {
        return instance.isStatusTemAcessoHigienePessoalSituacaoRua();
    }

    /**
     * Define se o cidadão tem acesso a higiene pessoal.
     * 
     * Regra: Não pode ser preechido se o campo statusSituacaoRua = false.
     * 
     * @param statusTemAcessoHigienePessoalSituacaoRua True para declarar que tem acesso, false caso contrario.
     */
    public void setStatusTemAcessoHigienePessoalSituacaoRua(boolean statusTemAcessoHigienePessoalSituacaoRua) {
        instance.setStatusTemAcessoHigienePessoalSituacaoRua(statusTemAcessoHigienePessoalSituacaoRua);
    }

    /**
     * Remove o marcador que indica se o cidadão tem acesso a higiene pessoal.
     */
    public void unsetStatusTemAcessoHigienePessoalSituacaoRua() {
        instance.unsetStatusTemAcessoHigienePessoalSituacaoRua();
    }

    /**
     * Verifica se o marcador que indica se o cidadão tem acesso a higiene pessoal foi inserido.
     * 
     * @return True caso tenha sido inserido, caso contrario false.
     */
    public boolean isSetStatusTemAcessoHigienePessoalSituacaoRua() {
        return instance.isSetStatusTemAcessoHigienePessoalSituacaoRua();
    }

    /**
     * Declara que o marcador que indica se o cidadão tem acesso a higiene pessoal foi inserido.
     * 
     * @param value True para declarar que foi inserido, caso contrario false.
     */
    public void setStatusTemAcessoHigienePessoalSituacaoRuaIsSet(boolean value) {
        instance.setStatusTemAcessoHigienePessoalSituacaoRuaIsSet(value);
    }

    /**
     * Valida StatusVisitaFamiliarFrequentemente.
     * Para ser válida, caso inserida, deve:
     * 1- Não pode ser preechido se o campo statusSituacaoRua = false.
     * 
     * @return true se válido
     *          false se inválido
     */
    public boolean validateStatusVisitaFamiliarFrequentemente(){
        if(instance.isSetStatusVisitaFamiliarFrequentemente()){
            if(! instance.isStatusSituacaoRua() ) return false;
        }
                
        return true;    
    }

    
    /**
     * Indica se o cidadão visita algum familiar frequentemente.
     * 
     * @return True caso visite, caso contrario false.
     */
    public boolean isStatusVisitaFamiliarFrequentemente() {
        return instance.isStatusVisitaFamiliarFrequentemente();
    }

    /**
     * Define se o cidadão visita algum familiar frequentemente.
     * 
     * Regras: Não pode ser preechido se o campo statusSituacaoRua = false.
     * 
     * @param statusVisitaFamiliarFrequentemente True caso visite, caso contrario false.
     */
    public void setStatusVisitaFamiliarFrequentemente(boolean statusVisitaFamiliarFrequentemente) {
        instance.setStatusVisitaFamiliarFrequentemente(statusVisitaFamiliarFrequentemente);
    }

    /**
     * Remove o marcador que indica se o cidadão visita algum familiar frequentemente.
     */
    public void unsetStatusVisitaFamiliarFrequentemente() {
        instance.unsetStatusVisitaFamiliarFrequentemente();
    }

    /**
     * Verifica se o marcador que indica se o cidadão visita algum familiar frequentemente foi declarado.
     * 
     * @return True caso tenha sido declarado, caso contrario false.
     */
    public boolean isSetStatusVisitaFamiliarFrequentemente() {
        return instance.isSetStatusVisitaFamiliarFrequentemente();
    }

    /**
     * Declara que o marcador que indica se o cidadão visita algum familiar frequentemente foi inserido.
     * 
     * @param value True para declarar que foi inserido, caso contrario false.
     */
    public void setStatusVisitaFamiliarFrequentementeIsSet(boolean value) {
        instance.setStatusVisitaFamiliarFrequentementeIsSet(value);
    }

     /**
     * Valida TempoSituacaoRua.
     * Para ser válida, caso inserida, deve:
     * 1- Não pode ser preechido se o campo statusSituacaoRua = false.
     * 
     * @return true se válido
     *          false se inválido
     */
    public boolean validateTempoSituacaoRua(){
        if(instance.isSetTempoSituacaoRua()){
            if(! instance.isStatusSituacaoRua() ) return false;
            
            return instance.getTempoSituacaoRua() >= 17l && instance.getTempoSituacaoRua() <= 20l;
        }
                
        return true;    
    }
    
    /**
     * Tempo que o cidadão está em situação de rua
     * 
     * @return Código do tempo que o cidadão está em situação de rua.
     */
    public long getTempoSituacaoRua() {
        return instance.getTempoSituacaoRua();
    }

    /**
     * Define o tempo que o cidadão está em situação de rua.
     * 
     * Regras: Não pode ser preechido se o campo statusSituacaoRua = false.
     * 
     * @param tempoSituacaoRua Código do tempo que o cidadão está em situação de rua.
     */
    public void setTempoSituacaoRua(long tempoSituacaoRua) {
        instance.setTempoSituacaoRua(tempoSituacaoRua);
    }

    /**
     * Remove o tempo que o cidadão está em situação de rua.
     */
    public void unsetTempoSituacaoRua() {
        instance.unsetTempoSituacaoRua();
    }

    /**
     * Verifica se o tempo que o cidadão está em situação de rua foi declarado.
     * 
     * @return True caso tenha sido declarado, caso contrario false.
     */
    public boolean isSetTempoSituacaoRua() {
        return instance.isSetTempoSituacaoRua();
    }

    /**
     * Declara que o tempo que o cidadão está em situação de rua foi inserido.
     * 
     * @param value True para declarar que foi inserido, caso contrario false.
     */
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

    /**
     * Instância thrift da classe.
     * @return Instância thrift da classe.
     */
    protected EmSituacaoDeRuaThrift getInstance(){
        return instance;
    }
}

