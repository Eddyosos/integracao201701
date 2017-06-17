package com.github.Eddyosos.integracao20171.esus.cds.consumoalimentar;

import br.gov.saude.esus.cds.transport.generated.thrift.consumoalimentar.PerguntaQuestionarioCriancasComMaisDoisAnosThrift;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PerguntaQuestionarioCriancasComMaisDoisAnos {
    private PerguntaQuestionarioCriancasComMaisDoisAnosThrift instance = new PerguntaQuestionarioCriancasComMaisDoisAnosThrift();
    //private PerguntaQuestionarioCriancasComMaisDoisAnosThrift instance; 

    PerguntaQuestionarioCriancasComMaisDoisAnosThrift getInstance() {
        return instance;
    }
    
    protected PerguntaQuestionarioCriancasComMaisDoisAnos(PerguntaQuestionarioCriancasComMaisDoisAnosThrift t){
        this.instance = t;
    }

    public PerguntaQuestionarioCriancasComMaisDoisAnos deepCopy() {
        return new PerguntaQuestionarioCriancasComMaisDoisAnos(instance.deepCopy());
    }

    public void unsetPergunta() {
        instance.unsetPergunta();
    }

    public boolean isSetPergunta() {
        return instance.isSetPergunta();
    }

    public void setPerguntaIsSet(boolean value) {
        instance.setPerguntaIsSet(value);
    }

    public void unsetRespostaUnicaEscolha() {
        instance.unsetRespostaUnicaEscolha();
    }

    public boolean isSetRespostaUnicaEscolha() {
        return instance.isSetRespostaUnicaEscolha();
    }

    public void setRespostaUnicaEscolhaIsSet(boolean value) {
        instance.setRespostaUnicaEscolhaIsSet(value);
    }

    public int getRespostaMultiplaEscolhaSize() {
        return instance.getRespostaMultiplaEscolhaSize();
    }

    public Iterator<RespostaMultiplaEscolhaEnum> getRespostaMultiplaEscolhaIterator() {
        List<RespostaMultiplaEscolhaEnum> listaRespostaMultipla = new LinkedList<>();
        instance.getRespostaMultiplaEscolhaIterator().forEachRemaining((t)->{
            
            //Não há solução para Enum? não tem como instanciar 
            //listaRespostaMultipla.add(new RespostaMultiplaEscolhaEnum(t));
            
        });
        return listaRespostaMultipla.iterator();
    }

    public void unsetRespostaMultiplaEscolha() {
        instance.unsetRespostaMultiplaEscolha();
    }

    public boolean isSetRespostaMultiplaEscolha() {
        return instance.isSetRespostaMultiplaEscolha();
    }

    public void setRespostaMultiplaEscolhaIsSet(boolean value) {
        instance.setRespostaMultiplaEscolhaIsSet(value);
    }

    public boolean equals(PerguntaQuestionarioCriancasComMaisDoisAnos that) {
        return instance.equals(that.instance);
    }

    public int compareTo(PerguntaQuestionarioCriancasComMaisDoisAnos other) {
        return instance.compareTo(other.instance);
    }

     /**
     * Metodo validade cria os metodos que fazem as validações
     * Chama todos os metodos que fazem falidações
     * @return Todos os metodos de validação
     */
    public boolean validades(){
        return false;  
    }

}

