package com.github.Eddyosos.integracao20171.esus.cds.consumoalimentar;

import br.gov.saude.esus.cds.transport.generated.thrift.consumoalimentar.PerguntaCriancasDeSeisVinteTresMesesEnumThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.consumoalimentar.PerguntaQuestionarioCriancasDeSeisVinteTresMesesThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.consumoalimentar.RespostaUnicaEscolhaEnumThrift;

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

    public boolean equals(PerguntaQuestionarioCriancasDeSeisVinteTresMeses that) {
        return instance.equals(that.instance);
    }

    public int compareTo(PerguntaQuestionarioCriancasDeSeisVinteTresMeses other) {
        return instance.compareTo(other.instance);
    }  
}

