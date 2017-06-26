package com.github.Eddyosos.integracao20171.esus.cds.consumoalimentar;

import br.gov.saude.esus.cds.transport.generated.thrift.consumoalimentar.PerguntaQuestionarioCriancasMenoresSeisMesesThrift;
import com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.consumoalimentar.IPerguntaQuestionarioCriancasMenoresSeisMeses;

public class PerguntaQuestionarioCriancasMenoresSeisMeses implements IPerguntaQuestionarioCriancasMenoresSeisMeses {
    
    /**
     * Instance para encapsulamento do Thrifit
     */
    PerguntaQuestionarioCriancasMenoresSeisMesesThrift instance;
    
    public PerguntaQuestionarioCriancasMenoresSeisMeses(){
        instance = new PerguntaQuestionarioCriancasMenoresSeisMesesThrift();
    }

    /**
     * Instance para encapsulamento do Thrifit
     * @param t 
     */
    public PerguntaQuestionarioCriancasMenoresSeisMeses(PerguntaQuestionarioCriancasMenoresSeisMesesThrift t) {
        this.instance = t;
    }
    /**
     * Instance para encapsulamento do Thrifit
     * @return instance
     */ 
          
    /**
     * Identificador da pergunta referente ao questionário para cidadãos menores de seis meses
     * @return instance
     */
    @Override
    public PerguntaQuestionarioCriancasMenoresSeisMesesThrift getInstance(){
        return instance;
    }
    
    /**
     * Identificador da pergunta referente ao questionário para cidadãos menores de seis meses
     * 
     */
    @Override
    public void getPergunta(){
        instance.getPergunta();
    }


    @Override
    public void unsetPergunta() {
        instance.unsetPergunta();
    }

    /**
     * Identificador da pergunta referente ao questionário para cidadãos menores de seis meses
     * @return questionário para cidadãos menores de seis meses
     * caso a dataNascimento seja menos que 6 meses anterior à DataAtendimento
     */
    @Override
    public boolean isSetPergunta() {
        return instance.isSetPergunta();
    }

    @Override
    public void setPerguntaIsSet(boolean value) {
        instance.setPerguntaIsSet(value);
    }

    @Override
    public void unsetRespostaUnicaEscolha() {
        instance.unsetRespostaUnicaEscolha();
    }

    /**
     * Resposta referente à pergunta
     * @return Resposta referente à pergunta
     * Caso a dataNascimento seja menos que 6 meses anterior à DataAtendimento
     */
    @Override
    public boolean isSetRespostaUnicaEscolha() {
        return instance.isSetRespostaUnicaEscolha();
    }

    /**
     * Resposta referente à pergunta
     * @param value 
     */
    @Override
    public void setRespostaUnicaEscolhaIsSet(boolean value) {
        instance.setRespostaUnicaEscolhaIsSet(value);
    }

    /**
     * Metodo validade cria os metodos que fazem as validações
     * Chama todos os metodos que fazem validações
     * @return Todos os metodos de validação 
     * PerguntaQuestionarioCriancasMenoresSeisMeses e respostaUnicaEscolha
     */
    @Override
    public boolean validades(){
        return validaPergunta() &&
                validaRespostaUnicaEscolha();
    }
    
    /**
     * Valida questionário para cidadãos menores de seis meses
     * @return questionário para cidadãos menores de seis meses
     * É condicinal
     */
    @Override
    public boolean validaPergunta(){
        return instance.isSetPergunta();
    }
    
    /**
     * Valida Resposta referente à pergunta
     * @return Resposta referente à pergunta
     * Também pode ser Condicional de acordo com dataNascimento
     */
    @Override
    public boolean validaRespostaUnicaEscolha(){
        return instance.isSetRespostaUnicaEscolha();
    }    
}