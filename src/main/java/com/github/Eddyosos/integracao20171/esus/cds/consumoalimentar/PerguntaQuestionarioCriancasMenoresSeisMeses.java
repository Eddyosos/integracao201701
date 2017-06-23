package com.github.Eddyosos.integracao20171.esus.cds.consumoalimentar;

import br.gov.saude.esus.cds.transport.generated.thrift.consumoalimentar.PerguntaQuestionarioCriancasMenoresSeisMesesThrift;

public class PerguntaQuestionarioCriancasMenoresSeisMeses {
    
    PerguntaQuestionarioCriancasMenoresSeisMesesThrift instance = new PerguntaQuestionarioCriancasMenoresSeisMesesThrift();

    protected PerguntaQuestionarioCriancasMenoresSeisMeses(PerguntaQuestionarioCriancasMenoresSeisMesesThrift t) {
        this.instance = t;
    }
    
    protected PerguntaQuestionarioCriancasMenoresSeisMesesThrift getInstance(){
        return instance;
    }
    
    /**
     * Identificador da pergunta referente ao questionário para cidadãos menores de seis meses
     * 
     */
    public void getPergunta(){
        instance.getPergunta();
    }


    public PerguntaQuestionarioCriancasMenoresSeisMeses deepCopy() {
        return new PerguntaQuestionarioCriancasMenoresSeisMeses(instance.deepCopy());
    }

    public void unsetPergunta() {
        instance.unsetPergunta();
    }

    /**
     * Identificador da pergunta referente ao questionário para cidadãos menores de seis meses
     * @return questionário para cidadãos menores de seis meses
     * caso a dataNascimento seja menos que 6 meses anterior à DataAtendimento
     */
    public boolean isSetPergunta() {
        return instance.isSetPergunta();
    }

    public void setPerguntaIsSet(boolean value) {
        instance.setPerguntaIsSet(value);
    }

    public void unsetRespostaUnicaEscolha() {
        instance.unsetRespostaUnicaEscolha();
    }

    /**
     * Resposta referente à pergunta
     * @return Resposta referente à pergunta
     * Caso a dataNascimento seja menos que 6 meses anterior à DataAtendimento
     */
    public boolean isSetRespostaUnicaEscolha() {
        return instance.isSetRespostaUnicaEscolha();
    }

    public void setRespostaUnicaEscolhaIsSet(boolean value) {
        instance.setRespostaUnicaEscolhaIsSet(value);
    }

    public int compareTo(PerguntaQuestionarioCriancasMenoresSeisMeses other) {
        return instance.compareTo(other.instance);
    }

    public boolean equals(PerguntaQuestionarioCriancasMenoresSeisMeses that) {
        return instance.equals(that.instance);
    }   
    
    /**
     * Metodo validade cria os metodos que fazem as validações
     * Chama todos os metodos que fazem validações
     * @return Todos os metodos de validação 
     * PerguntaQuestionarioCriancasMenoresSeisMeses e respostaUnicaEscolha
     */
    public boolean validades(){
        return validaPergunta() &&
                validaRespostaUnicaEscolha();
    }
    
    /**
     * Valida questionário para cidadãos menores de seis meses
     * @return questionário para cidadãos menores de seis meses
     * É condicinal
     */
    public boolean validaPergunta(){
        return instance.isSetPergunta();
    }
    
    /**
     * Valida Resposta referente à pergunta
     * @return Resposta referente à pergunta
     * Também pode ser Condicional de acordo com dataNascimento
     */
    public boolean validaRespostaUnicaEscolha(){
        return instance.isSetRespostaUnicaEscolha();
    }    
}

