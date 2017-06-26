/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.Eddyosos.integracao20171.esus.cds.cadastroindividual;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eddyosos
 */
public class EmSituacaoDeRuaTest {
    
    private EmSituacaoDeRua obj;
    
    public EmSituacaoDeRuaTest() {
    }
    
    @Before
    public void setUp() {
        obj = new EmSituacaoDeRua();
    }

    /**
     * Valida GrauParentescoFamiliarFrequentado
     */
    @Test
    public void testGrauParentescoFamiliarFrequentado() {
        assertTrue(obj.validateGrauParentescoFamiliarFrequentado());
        obj.setGrauParentescoFamiliarFrequentado("a");
        assertTrue(obj.validateGrauParentescoFamiliarFrequentado());
        obj.setStatusVisitaFamiliarFrequentemente(false);
        assertFalse(obj.validateGrauParentescoFamiliarFrequentado());
    }
    
}
