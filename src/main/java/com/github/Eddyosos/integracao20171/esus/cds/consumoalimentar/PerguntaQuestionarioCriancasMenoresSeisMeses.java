package com.github.Eddyosos.integracao20171.esus.cds.consumoalimentar;

import br.gov.saude.esus.cds.transport.generated.thrift.consumoalimentar.PerguntaCriancasMenoresSeisMesesEnumThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.consumoalimentar.PerguntaQuestionarioCriancasMenoresSeisMesesThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.consumoalimentar.RespostaUnicaEscolhaEnumThrift;

public class PerguntaQuestionarioCriancasMenoresSeisMeses {
    PerguntaQuestionarioCriancasMenoresSeisMesesThrift instance = new PerguntaQuestionarioCriancasMenoresSeisMesesThrift();

    protected PerguntaQuestionarioCriancasMenoresSeisMeses(PerguntaQuestionarioCriancasMenoresSeisMesesThrift t) {
        this.instance = t;
    }
    
    protected PerguntaQuestionarioCriancasMenoresSeisMesesThrift getInstance(){
        return instance;
    }

    public PerguntaQuestionarioCriancasMenoresSeisMeses deepCopy() {
        return new PerguntaQuestionarioCriancasMenoresSeisMeses(instance.deepCopy());
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

    public int compareTo(PerguntaQuestionarioCriancasMenoresSeisMeses other) {
        return instance.compareTo(other.instance);
    }

    public boolean equals(PerguntaQuestionarioCriancasMenoresSeisMeses that) {
        return instance.equals(that.instance);
    }           
}

