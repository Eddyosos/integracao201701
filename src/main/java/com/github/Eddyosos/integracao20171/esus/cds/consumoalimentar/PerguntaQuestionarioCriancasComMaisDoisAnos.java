package com.github.Eddyosos.integracao20171.esus.cds.consumoalimentar;

import br.gov.saude.esus.cds.transport.generated.thrift.consumoalimentar.PerguntaQuestionarioCriancasComMaisDoisAnosThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.consumoalimentar.RespostaMultiplaEscolhaEnumThrift;
import com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.consumoalimentar.IPerguntaQuestionarioCriancasComMaisDoisAnos;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class PerguntaQuestionarioCriancasComMaisDoisAnos implements IPerguntaQuestionarioCriancasComMaisDoisAnos {
    
    /**
     * Instancia para encapsulamento do Thrift
     */
    private PerguntaQuestionarioCriancasComMaisDoisAnosThrift instance; 
    
    public PerguntaQuestionarioCriancasComMaisDoisAnos(){
        instance = new PerguntaQuestionarioCriancasComMaisDoisAnosThrift();
    }

    @Override
    public PerguntaQuestionarioCriancasComMaisDoisAnosThrift getInstance() {
        return instance;
    }
    
    public PerguntaQuestionarioCriancasComMaisDoisAnos(PerguntaQuestionarioCriancasComMaisDoisAnosThrift t){
        this.instance = t;
    }

    @Override
    public void unsetPergunta() {
        instance.unsetPergunta();
    }

    /**
     * Pergunta do questionário de cidadãos que tem vinte e quatro meses ou mais.
     * @return questionário de cidadãos que tem vinte e quatro meses ou mais.
     * Obrigatório caso a dataNascimento seja mais que 24 meses anterior à DataAtendimento
     */
    @Override
    public boolean isSetPergunta() {
        return instance.isSetPergunta();
    }

    /**
     * Pergunta do questionário de cidadãos que tem vinte e quatro meses ou mais.
     * @param value 
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
     * Resposta referente a pergunta do registro.
     * @return Resposta referente a pergunta do registro.
     * Obrigatório caso a dataNascimento seja mais que 24 meses anterior à DataAtendimento.
     */
    @Override
    public boolean isSetRespostaUnicaEscolha() {
        return instance.isSetRespostaUnicaEscolha();
    }

    /**
     * Resposta referente a pergunta do registro.
     * @param value 
     * Obrigatório caso a dataNascimento seja mais que 24 meses anterior à DataAtendimento.
     */
    @Override
    public void setRespostaUnicaEscolhaIsSet(boolean value) {
        instance.setRespostaUnicaEscolhaIsSet(value);
    }

    /**
     * Resposta referente à pergunta do registro acima.
     * @return getRespostaMultiplaEscolhaSize
     */
    @Override
    public int getRespostaMultiplaEscolhaSize() {
        return instance.getRespostaMultiplaEscolhaSize();
    }

    /**
     * Resposta referente à pergunta do registro.
     * @return List
     */
    @Override
    public Iterator<RespostaMultiplaEscolhaEnumThrift> getRespostaMultiplaEscolhaIterator() {
        List<RespostaMultiplaEscolhaEnumThrift> listaRespostaMultipla = new LinkedList<>();
        instance.getRespostaMultiplaEscolhaIterator().forEachRemaining((t)->{
            
            //Não há solução para Enum? não tem como instanciar 
            //listaRespostaMultipla.add(new RespostaMultiplaEscolhaEnum(t));
            
        });
        return listaRespostaMultipla.iterator();
    }

    @Override
    public void unsetRespostaMultiplaEscolha() {
        instance.unsetRespostaMultiplaEscolha();
    }

    /**
     * Resposta referente à pergunta do registro acima(RespostaUnicaEscolha).
     * @return Resposta referente à pergunta do registro acima.
     * Deve respeitar as regras das respostas referentes à pergunta
     * Pode ser preenchido somente se a pergunta for 12L.
     */
    @Override
    public boolean isSetRespostaMultiplaEscolha() {
        return instance.isSetRespostaMultiplaEscolha();
    }

    /**
     * Resposta referente à pergunta do registro acima(RespostaUnicaEscolha).
     * @param value 
     */
    @Override
    public void setRespostaMultiplaEscolhaIsSet(boolean value) {
        instance.setRespostaMultiplaEscolhaIsSet(value);
    }

     /**
     * Metodo validade cria os metodos que fazem as validações
     * Chama todos os metodos que fazem validações 
     * @return Todos os metodos de validação
     * Valida validaPergunta(), validaRespostaUnicaEscolha() e validaRespostaMultiplaEscolha()
     */
    @Override
    public boolean validades(){
        return validaPergunta()&&
                validaRespostaUnicaEscolha()&&
                validaRespostaMultiplaEscolha();  
    }

    /**
     * Valida Pergunta do questionário de cidadãos que tem vinte e quatro meses ou mais.
     * @return questionário de cidadãos que tem vinte e quatro meses ou mais
     * É condicional
     * Obrigatório caso a dataNascimento seja mais que 24 meses anterior à DataAtendimento
     */
    @Override
    public boolean validaPergunta(){
        return instance.isSetPergunta();  
    }
    
    /**
     * Valida Resposta referente a pergunta do Registro
     * @return Resposta referente a pergunta do registro
     * É Condiconal
     * Obrigatório caso a dataNascimento seja mais que 24 meses anterior à DataAtendimento.
     */
    @Override
    public boolean validaRespostaUnicaEscolha(){
        return instance.isSetRespostaUnicaEscolha();
    }
    
    /**
     * Valida Resposta referente à pergunta do registro acima
     * @return Resposta referente à pergunta do registro acima
     * É Condicional
     * Deve respeitar as regras das respostas referentes à pergunta .
     * Pode ser preenchido somente se a pergunta for 12L.
     */
    @Override
    public boolean validaRespostaMultiplaEscolha(){
        return instance.isSetRespostaMultiplaEscolha();
    }
    
}