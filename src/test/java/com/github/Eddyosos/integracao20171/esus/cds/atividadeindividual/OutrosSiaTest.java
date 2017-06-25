/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.Eddyosos.integracao20171.esus.cds.atividadeindividual;

import java.util.LinkedList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author eddyosos
 */
public class OutrosSiaTest {

    private OutrosSia obj;
    
    @Before
    public void setup(){
        obj = new OutrosSia();
    }
    
    /**
     * Valida CodigoExame
     */
    @Test
    public void testCodigoExame() {
        assertFalse(obj.validateCodigoExame());
        obj.setCodigoExame("0101010010");
        assertTrue(obj.validateCodigoExame());
    }
    
    /**
     * Valida SolicitadoAvaliado
     */
    @Test
    public void testSolicitadoAvaliado(){
        assertFalse(obj.validateSolicitadoAvaliado());
        obj.setSolicitadoAvaliado(new LinkedList());
        assertTrue(obj.validateSolicitadoAvaliado());
    }
    
}
