package com.github.Eddyosos.integracao20171.esus.cds.atividadeindividual;

import br.gov.saude.esus.cds.transport.generated.thrift.atividadeindividual.ProblemaCondicaoAvaliacaoAIThrift;
import java.util.HashSet;
import java.util.List;

public class ProblemaCondicaoAvaliacaoAI {
    private ProblemaCondicaoAvaliacaoAIThrift instance;

    public ProblemaCondicaoAvaliacaoAI() {
        instance = new ProblemaCondicaoAvaliacaoAIThrift();
    }

    public ProblemaCondicaoAvaliacaoAI(ProblemaCondicaoAvaliacaoAIThrift instance) {
        this.instance = instance;
    }
    
    public ProblemaCondicaoAvaliacaoAIThrift getInstance(){
        return instance;
    }

    /**
     * Valida a instancia
     * @return true se válido
     *          false se inválido
     */
    public boolean validates(){
        return validateCiaps() &&
                validateOutroCiap1() &&
                validateOutroCiap2() &&
                validateCid10();
    }
    
    /**
     * Valida Ciaps.
     * Para ser válido deve:
     * 1- Não deve conter dois "Problemas / Condições" iguais.
     * 2- É Requerido o preenchimento de pelo menos um dos itens de #1 a #4
     * 3- Ter entre 0 e 22 itens
     * @return
     */
    public boolean validateCiaps(){
        if(instance.isSetCiaps()) {
            final int var = instance.getCiapsSize();
            return var < 23 &&
                (new HashSet<>(instance.getCiaps())).size() == var;
        }
        return valida1a4();
    }
    
    /**
     * Atalho para item 2 do validateCiaps que é repetido varias vezes
     * @return 
     */
    private boolean valida1a4(){
        return instance.isSetCiaps() ||
                instance.isSetOutroCiap1() ||
                instance.isSetOutroCiap2() ||
                instance.isSetCid10();
    }
    
    /**
     * Código dos CIAPs apresentados na lista.
     * @return 
     */
    public List<String> getCiaps() {
        return instance.getCiaps();
    }

    /**
     * Código dos CIAPs apresentados na lista.
     * @param ciaps 
     */
    public void setCiaps(List<String> ciaps) {
        instance.setCiaps(ciaps);
    }

    /**
     * Valida OutroCiap1.
     * Para ser válido, deve:
     * 1- Não pode ser igual a outroCiap2.
     * 2- É Requerido o preenchimento de pelo menos um dos itens de #1 a #4.
     * @return true se válido
     *          false se inválido
     */
    public boolean validateOutroCiap1(){
        if(instance.isSetOutroCiap1()) 
            return !instance.getOutroCiap1().equals(instance.getOutroCiap2());
        return valida1a4();
    }
    
    /**
     * Código do CIAP1 registrado no antedimento.
     * @return 
     */
    public String getOutroCiap1() {
        return instance.getOutroCiap1();
    }

    /**
     * Código do CIAP1 registrado no antedimento.
     * @param outroCiap1 
     */
    public void setOutroCiap1(String outroCiap1) {
        instance.setOutroCiap1(outroCiap1);
    }

    /**
     * Valida OutroCiap2.
     * Para ser válido, deve:
     * 1- Não pode ser igual a outroCiap1.
     * 2- É Requerido o preenchimento de pelo menos um dos itens de #1 a #4.
     * @return true se válido
     *          false se inválido
     */
    public boolean validateOutroCiap2(){
        if(instance.isSetOutroCiap2()) 
            return !instance.getOutroCiap2().equals(instance.getOutroCiap1());
        return valida1a4();
    }
    
    /**
     * Código do CIAP2 registrado no antedimento.
     * @return 
     */
    public String getOutroCiap2() {
        return instance.getOutroCiap2();
    }

    /**
     * Código do CIAP2 registrado no antedimento.
     * @param outroCiap2 
     */
    public void setOutroCiap2(String outroCiap2) {
        instance.setOutroCiap2(outroCiap2);
    }

    /**
     * Valida Cid10.
     * Para ser válido deve:
     * 1- É Requerido o preenchimento de pelo menos um dos itens de #1 a #4.
     * @return true se válido
     *          false se inválido
     */
    public boolean validateCid10(){
        return valida1a4();
    }
    
    /**
     * Código do CID10 registrado no atendimento.
     * @return 
     */
    public String getCid10() {
        return instance.getCid10();
    }

    /**
     * Código do CID10 registrado no atendimento.
     * @param cid10 
     */
    public void setCid10(String cid10) {
        instance.setCid10(cid10);
    }
}

