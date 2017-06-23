package com.github.Eddyosos.integracao20171.esus.cds.consumoalimentar;

import br.gov.saude.esus.cds.transport.generated.thrift.consumoalimentar.PerguntaQuestionarioCriancasDeSeisVinteTresMesesThrift;

public class PerguntaQuestionarioCriancasDeSeisVinteTresMeses {
    
    PerguntaQuestionarioCriancasDeSeisVinteTresMesesThrift instance = new PerguntaQuestionarioCriancasDeSeisVinteTresMesesThrift();
    
    protected PerguntaQuestionarioCriancasDeSeisVinteTresMesesThrift getInstance(){
         return instance;
    }

    protected PerguntaQuestionarioCriancasDeSeisVinteTresMeses(PerguntaQuestionarioCriancasDeSeisVinteTresMesesThrift t){
        this.instance = t;
    }

    public PerguntaQuestionarioCriancasDeSeisVinteTresMeses deepCopy() {
        return new PerguntaQuestionarioCriancasDeSeisVinteTresMeses(instance.deepCopy());
    }

    public void unsetPergunta() {
        instance.unsetPergunta();
    }

    /**
     * Identificador da pergunta referente ao questionário para cidadãos menores de seis meses.
     * @return Identificador da pergunta referente ao questionário para cidadãos menores de seis meses.
     * Obrigatório caso a dataNascimento seja menos que 23 meses e mais que 6 meses anterior à DataAtendimento
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
     * Obrigatório caso a dataNascimento seja menos que 24 meses e mais que 6 meses anterior à DataAtendimento
     */
    public boolean isSetRespostaUnicaEscolha() {
        return instance.isSetRespostaUnicaEscolha();
    }

    public void setRespostaUnicaEscolhaIsSet(boolean value) {
        instance.setRespostaUnicaEscolhaIsSet(value);
    }

    public boolean equals(PerguntaQuestionarioCriancasDeSeisVinteTresMeses that) {
        return instance.equals(that.instance);
    }

    public int compareTo(PerguntaQuestionarioCriancasDeSeisVinteTresMeses other) {
        return instance.compareTo(other.instance);
    } 
    
     /**
     * Metodo validade cria os metodos que fazem as validações
     * Chama todos os metodos que fazem validações
     * @return Todos os metodos de validação 
     * Valida validaPergunta() e validaRespostaUnicaEscolha()
     */
    public boolean validades(){
        return validaPergunta()&&
                validaRespostaUnicaEscolha();
    }
    
    /**
     * Valida pergunta referente ao questionário para cidadãos menores de seis meses
     * @return questionário para cidadãos menores de seis meses
     * É condicional
     * Obrigatório caso a dataNascimento seja menos que 23 meses e mais que 6 meses anterior à DataAtendimento
     */
    public boolean validaPergunta(){
        return instance.isSetPergunta();  
    }
    
    /**
     * Resposta referente a pergunta ao questionário para cidadãos menores de seis meses
     * @return Resposta referente a pergunta
     * É Condiconal
     * Obrigatório caso a dataNascimento seja menos que 24 meses e mais que 6 meses anterior à DataAtendimento
     */
    public boolean validaRespostaUnicaEscolha(){
        return instance.isSetRespostaUnicaEscolha();
    } 
    
}