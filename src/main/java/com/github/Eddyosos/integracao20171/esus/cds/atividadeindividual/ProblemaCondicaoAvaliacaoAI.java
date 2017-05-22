package com.github.Eddyosos.integracao20171.esus.cds.atividadeindividual;

import br.gov.saude.esus.cds.transport.generated.thrift.atividadeindividual.ProblemaCondicaoAvaliacaoAIThrift;

public class ProblemaCondicaoAvaliacaoAI {
    private ProblemaCondicaoAvaliacaoAIThrift instance;

    public ProblemaCondicaoAvaliacaoAI() {
        instance = new ProblemaCondicaoAvaliacaoAIThrift();
    }

    ProblemaCondicaoAvaliacaoAI(ProblemaCondicaoAvaliacaoAIThrift instance) {
        this.instance = instance;
    }
    
    ProblemaCondicaoAvaliacaoAIThrift getInstance(){
        return instance;
    }
    
}

