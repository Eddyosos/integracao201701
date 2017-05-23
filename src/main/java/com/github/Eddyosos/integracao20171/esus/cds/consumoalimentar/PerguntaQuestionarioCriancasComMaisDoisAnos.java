package com.github.Eddyosos.integracao20171.esus.cds.consumoalimentar;

import br.gov.saude.esus.cds.transport.generated.thrift.consumoalimentar.PerguntaQuestionarioCriancasComMaisDoisAnosThrift;


public class PerguntaQuestionarioCriancasComMaisDoisAnos {
    private PerguntaQuestionarioCriancasComMaisDoisAnosThrift instance; 

    PerguntaQuestionarioCriancasComMaisDoisAnosThrift getInstance() {
        return instance;
    }
    
    protected PerguntaQuestionarioCriancasComMaisDoisAnos(PerguntaQuestionarioCriancasComMaisDoisAnosThrift t){
        this.instance = t;
    }

}

