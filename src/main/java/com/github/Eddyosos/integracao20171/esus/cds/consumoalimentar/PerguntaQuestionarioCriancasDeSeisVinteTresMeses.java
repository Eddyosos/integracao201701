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
}

