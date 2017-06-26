/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.Eddyosos.integracao20171.esus.cds.atividadeindividual;

import java.util.LinkedList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eddyosos
 */
public class ProblemaCondicaoAvaliacaoAITest {
    
    private ProblemaCondicaoAvaliacaoAI obj;
    
    @Before
    public void setUp() {
        obj = new ProblemaCondicaoAvaliacaoAI();
    }

    /**
     * Valida Ciaps
     */
    @Test
    public void testCiaps() {
        assertFalse(obj.validateCiaps());
        LinkedList<String> input = new LinkedList<>();
        obj.setCiaps(input);
        assertTrue(obj.validateCiaps());
        input.add("a");
        input.add("a");
        assertFalse(obj.validateCiaps());
    }
    
    /**
     * Valida OutroCiap1
     */
    @Test
    public void testOutroCiap1(){
        assertFalse(obj.validateOutroCiap1());
        obj.setOutroCiap1("a");
        assertTrue(obj.validateOutroCiap1());
        obj.setOutroCiap2("a");
        assertFalse(obj.validateOutroCiap1());
    }
    
    /**
     * Valida OutroCiap2
     */
    @Test
    public void testOutroCiap2(){
        assertFalse(obj.validateOutroCiap2());
        obj.setOutroCiap2("a");
        assertTrue(obj.validateOutroCiap2());
        obj.setOutroCiap1("a");
        assertFalse(obj.validateOutroCiap2());
    }
    
    /**
     * Valida Cid10
     */
    @Test
    public void testCid10(){
        assertFalse(obj.validateCid10());
        obj.setCid10("a");
        assertTrue(obj.validateCid10());
    }
    
}
