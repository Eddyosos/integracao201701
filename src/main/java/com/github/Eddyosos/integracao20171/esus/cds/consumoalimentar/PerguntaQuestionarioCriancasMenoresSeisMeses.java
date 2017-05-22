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
    

}

