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
public class UnicaLotacaoHeaderTest {

    /**
     * Valida ProfissionalCNS para casos positivos
     */
    @Test
    public void testValidProfissionalCNS(){
        UnicaLotacaoHeader obj = new UnicaLotacaoHeader();
        obj.setProfissionalCNS("951012110430003");
        assertTrue(obj.validateProfissionalCNS());
        obj.setProfissionalCNS("282651133700006");
        assertTrue(obj.validateProfissionalCNS());
    }
    
    /**
     * Valida ProfissionalCNS para casos negativos
     */
    @Test
    public void testInvalidProfissionalCNS(){
        UnicaLotacaoHeader obj = new UnicaLotacaoHeader();
        assertFalse(obj.validateProfissionalCNS());
        obj.setProfissionalCNS("123456789012345");
        assertFalse(obj.validateProfissionalCNS());
    }
    
    /**
     * Valida CboCodigo_2002 para casos positivos
     */
    @Test
    public void testValidCboCodigo_2002(){
        UnicaLotacaoHeader obj = new UnicaLotacaoHeader();
        obj.setCboCodigo_2002("123456");
        assertTrue(obj.validateCboCodigo_2002());
    }
    
    /**
     * Valida CboCodigo_2002 para casos negativos
     */
    @Test
    public void testInvalidCboCodigo_2002(){
        UnicaLotacaoHeader obj = new UnicaLotacaoHeader();
        assertFalse(obj.validateCboCodigo_2002());
        obj.setCboCodigo_2002("0123");
        assertFalse(obj.validateCboCodigo_2002());
    }
    
    /**
     * Valida Cnes para casos positivos
     */
    @Test
    public void testValidCnes(){
        UnicaLotacaoHeader obj = new UnicaLotacaoHeader();
        obj.setCnes("1234567");
        assertTrue(obj.validateCnes());
    }
    
    /**
     * Valida cnesUnidadeSaude para casos negativos
     */
    @Test
    public void testInvalidCnes(){
        UnicaLotacaoHeader obj = new UnicaLotacaoHeader();
        assertFalse(obj.validateCnes());
        obj.setCnes("123456");
        assertFalse(obj.validateCnes());
    }
    
    /**
     * Valida Ine para entradas positivas
     */
    @Test
    public void testValidIne(){
        UnicaLotacaoHeader obj = new UnicaLotacaoHeader();
        assertTrue(obj.validateIne());
        obj.setIne("1234567890");
        assertTrue(obj.validateIne());

    }
    
    /**
     * Valida Ine para entradas negativas
     */
    @Test
    public void testInvalidIne(){
        UnicaLotacaoHeader obj = new UnicaLotacaoHeader();
        obj.setIne("12345678");
        assertFalse(obj.validateIne());
    }
    
    /**
     * Valida DataAtendimento para entradas positivas
     */
    @Test
    public void testValidDataAtendimento(){
        UnicaLotacaoHeader obj = new UnicaLotacaoHeader();
        obj.setDataAtendimento(123456);
        assertTrue(obj.validateDataAtendimento());
    }
    
    /**
     * Valida DataAtendimento para entradas negativas
     */
    @Test
    public void testInvalidDataAtendimento(){
        UnicaLotacaoHeader obj = new UnicaLotacaoHeader();
        assertFalse(obj.validateDataAtendimento());
    }
    
    /**
     * Valida Código IBGE para entradas positivas
     */
    @Test
    public void testValidCodigoIBGE(){
        UnicaLotacaoHeader obj = new UnicaLotacaoHeader();
        obj.setCodigoIbgeMunicipio("4120655");
        assertTrue(obj.validateCodigoIbgeMunicipio());
        obj.setCodigoIbgeMunicipio("1234567");
        assertTrue(obj.validateCodigoIbgeMunicipio());
    }
    
    /**
     * Valida Código IBGE para entradas negativas
     */
    @Test
    public void testInvalidCodigoIBGE(){
        UnicaLotacaoHeader obj = new UnicaLotacaoHeader();
        assertFalse(obj.validateCodigoIbgeMunicipio());
        obj.setCodigoIbgeMunicipio("12345678");
        assertFalse(obj.validateCodigoIbgeMunicipio());
        obj.setCodigoIbgeMunicipio("123456");
        assertFalse(obj.validateCodigoIbgeMunicipio());
    }
    
}
