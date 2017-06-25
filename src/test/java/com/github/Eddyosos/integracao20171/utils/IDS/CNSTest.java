/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.Eddyosos.integracao20171.utils.IDS;

import com.github.Eddyosos.integracao20171.utils.IDS.CNS;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eddyosos
 */
public class CNSTest {
    
 /**
     * Valida ProfissionalCNS para casos positivos
     */
    @Test
    public void testValidProfissionalCNS(){
        assertTrue(CNS.validateCNS("951012110430003"));
        assertTrue(CNS.validateCNS("282651133700006"));
    }
    
    /**
     * Valida ProfissionalCNS para casos negativos
     */
    @Test
    public void testInvalidProfissionalCNS(){
       assertFalse(CNS.validateCNS("123456789012345"));
    }
    
    
}
