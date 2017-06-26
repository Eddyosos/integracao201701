/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.Eddyosos.integracao20171.esus.cds.cadastroindividual;

import java.util.LinkedList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eddyosos
 */
public class InformacoesSocioDemograficasTest {
    
    InformacoesSocioDemograficas obj;
    
    public InformacoesSocioDemograficasTest() {
    }
    
    @Before
    public void setUp() {
        obj = new InformacoesSocioDemograficas();
    }

    /**
     * Valida DeficienciasCidadao
     */
    @Test
    public void testDeficienciasCidadao() {
        assertTrue(obj.validateDeficienciasCidadao());
        obj.setStatusTemAlgumaDeficiencia(true);
        assertFalse(obj.validateDeficienciasCidadao());
        LinkedList<Long> input = new LinkedList<>();
        input.add(Long.MIN_VALUE);
        obj.setDeficienciasCidadao(input);
        assertTrue(obj.validateDeficienciasCidadao());
    }
    
    /**
     * Valida OcupacaoCodigoCbo2002
     */
    @Test
    public void testOcupacaoCodigoCbo2002(){
        assertTrue(obj.validateOcupacaoCodigoCbo2002());
        obj.setOcupacaoCodigoCbo2002("a");
        assertFalse(obj.validateOcupacaoCodigoCbo2002());
        obj.setOcupacaoCodigoCbo2002("123456");
        assertTrue(obj.validateOcupacaoCodigoCbo2002());
    }

    /**
     * Valida OrientacaoSexualCidadao
     */
    @Test
    public void testOrientacaoSexualCidadao(){
        assertTrue(obj.validaOrientacaoSexualCidadao());
        obj.setStatusDesejaInformarOrientacaoSexual(false);
        obj.setOrientacaoSexualCidadao(0);
        assertFalse(obj.validaOrientacaoSexualCidadao());
        obj.setStatusDesejaInformarOrientacaoSexual(true);
        assertTrue(obj.validaOrientacaoSexualCidadao());
    }
    
    /**
     * Valida PovoComunidadeTradicional
     */
    @Test
    public void testPovoComunidadeTradicional(){
        assertTrue(obj.validaPovoComunidadeTradicional());
        obj.setStatusMembroPovoComunidadeTradicional(false);
        obj.setPovoComunidadeTradicional("Alibaba");
        assertFalse(obj.validaPovoComunidadeTradicional());
        obj.setStatusMembroPovoComunidadeTradicional(true);
        assertTrue(obj.validaPovoComunidadeTradicional());
    }
}
