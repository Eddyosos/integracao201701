/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.Eddyosos.integracao20171.esus.cds.common;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eddyosos
 */
public class VariasLotacoesHeaderTest {

    /**
     * Valida LotacaoForm para entradas positivas
     */
    @Test
    public void testValidLotacaoForm(){
        VariasLotacoesHeader obj = new VariasLotacoesHeader();
        obj.setLotacaoForm(new UnicaLotacaoHeader());
        assertTrue(obj.validateLotacaoForm());
    }
    
    /**
     * Valida LotacaoForm para entradas negativas
     */
    @Test
    public void testInvalidLotacaoForm(){
        VariasLotacoesHeader obj = new VariasLotacoesHeader();
        assertFalse(obj.validateLotacaoForm());
    }
    
    /**
     * Valida ProfissionalCNS para casos positivos
     */
    @Test
    public void testValidProfissionalCNS(){
        VariasLotacoesHeader obj = new VariasLotacoesHeader();
        assertTrue(obj.validateProfissionalCNS("951012110430003"));
        obj.setProfissionalCNS2("");
        assertTrue(obj.validateProfissionalCNS("282651133700006"));
    }
    
    /**
     * Valida ProfissionalCNS para casos negativos
     */
    @Test
    public void testInvalidProfissionalCNS(){
        VariasLotacoesHeader obj = new VariasLotacoesHeader();
        assertFalse(obj.validateProfissionalCNS(null));
        assertFalse(obj.validateProfissionalCNS("123456789012345"));
    }
    
    /**
     * Valida CboCodigo_2002 para casos positivos
     */
    @Test
    public void testValidCboCodigo_2002(){
        VariasLotacoesHeader obj = new VariasLotacoesHeader();
        assertTrue(obj.validateCboCodigo_2002("123456"));
    }
    
    /**
     * Valida CboCodigo_2002 para casos negativos
     */
    @Test
    public void testInvalidCboCodigo_2002(){
        VariasLotacoesHeader obj = new VariasLotacoesHeader();
        assertFalse(obj.validateCboCodigo_2002(null));
        assertFalse(obj.validateCboCodigo_2002("0123"));
    }
    
}
