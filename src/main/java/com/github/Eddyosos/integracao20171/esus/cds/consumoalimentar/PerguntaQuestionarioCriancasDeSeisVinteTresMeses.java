package com.github.Eddyosos.integracao20171.esus.cds.consumoalimentar;

import br.gov.saude.esus.cds.transport.generated.thrift.consumoalimentar.PerguntaQuestionarioCriancasDeSeisVinteTresMesesThrift;
import com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.consumoalimentar.IPerguntaQuestionarioCriancasDeSeisVinteTresMeses;

public class PerguntaQuestionarioCriancasDeSeisVinteTresMeses implements IPerguntaQuestionarioCriancasDeSeisVinteTresMeses {
    
    /**
     * Instancia para Encapsulamento do Thrifit
     */
    private PerguntaQuestionarioCriancasDeSeisVinteTresMesesThrift instance;
    public PerguntaQuestionarioCriancasDeSeisVinteTresMeses(){
        instance = new PerguntaQuestionarioCriancasDeSeisVinteTresMesesThrift();
    }
    
    @Override
    public PerguntaQuestionarioCriancasDeSeisVinteTresMesesThrift getInstance(){
         return instance;
    }

    public PerguntaQuestionarioCriancasDeSeisVinteTresMeses(PerguntaQuestionarioCriancasDeSeisVinteTresMesesThrift t){
        this.instance = t;
    }

    @Override
    public void unsetPergunta() {
        instance.unsetPergunta();
    }

    /**
     * Identificador da pergunta referente ao questionário para cidadãos menores de seis meses.
     * @return Identificador da pergunta referente ao questionário para cidadãos menores de seis meses.
     * Obrigatório caso a dataNascimento seja menos que 23 meses e mais que 6 meses anterior à DataAtendimento
     */
    @Override
    public boolean isSetPergunta() {
        return instance.isSetPergunta();
    }

    /**
     * Identificador da pergunta referente ao questionário para cidadãos menores de seis meses.
     * @param value 
     * Obrigatório caso a dataNascimento seja menos que 23 meses e mais que 6 meses anterior à DataAtendimento
     */
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
     * Obrigatório caso a dataNascimento seja menos que 24 meses e mais que 6 meses anterior à DataAtendimento
     */
    @Override
    public boolean isSetRespostaUnicaEscolha() {
        return instance.isSetRespostaUnicaEscolha();
    }

    /**
     * Resposta referente à pergunta
     * @param value 
     * Obrigatório caso a dataNascimento seja menos que 24 meses e mais que 6 meses anterior à DataAtendimento
     */
    @Override
    public void setRespostaUnicaEscolhaIsSet(boolean value) {
        instance.setRespostaUnicaEscolhaIsSet(value);
    }

     /**
     * Metodo validade cria os metodos que fazem as validações
     * Chama todos os metodos que fazem validações
     * @return Todos os metodos de validação 
     * Valida validaPergunta() e validaRespostaUnicaEscolha()
     */
    @Override
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
    @Override
    public boolean validaPergunta(){
        return instance.isSetPergunta();  
    }
    
    /**
     * Resposta referente a pergunta ao questionário para cidadãos menores de seis meses
     * @return Resposta referente a pergunta
     * É Condiconal
     * Obrigatório caso a dataNascimento seja menos que 24 meses e mais que 6 meses anterior à DataAtendimento
     */
    @Override
    public boolean validaRespostaUnicaEscolha(){
        return instance.isSetRespostaUnicaEscolha();
    } 
    
}