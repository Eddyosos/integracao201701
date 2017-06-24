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
public class HeaderCdsCadastroTest {
    
    /**
     * Valida cnesUnidadeSaude para casos positivos
     */
    @Test
    public void testValidCnesUnidadeSaude(){
        HeaderCdsCadastro obj = new HeaderCdsCadastro();
        obj.setCnesUnidadeSaude("1234567");
        assertTrue(obj.validateCnesUnidadeSaude());
    }
    
    /**
     * Valida cnesUnidadeSaude para casos negativos
     */
    @Test
    public void testInvalidCnesUnidadeSaude(){
        HeaderCdsCadastro obj = new HeaderCdsCadastro();
        assertFalse(obj.validateCnesUnidadeSaude());
        obj.setCnesUnidadeSaude("123456");
        assertFalse(obj.validateCnesUnidadeSaude());
    }
    
    /**
     * Valida cnsProfissional para casos positivos
     */
    @Test
    public void testValidCnsProfissional(){
        HeaderCdsCadastro obj = new HeaderCdsCadastro();
        obj.setCnsProfissional("951012110430003");
        assertTrue(obj.validateCnsProfissional());
        obj.setCnsProfissional("282651133700006");
        assertTrue(obj.validateCnsProfissional());
    }
    
    /**
     * Valida cnsProfissional para casos negativos
     */
    @Test
    public void testInvalidCnsProfissional(){
        HeaderCdsCadastro obj = new HeaderCdsCadastro();
        assertFalse(obj.validateCnsProfissional());
        obj.setCnsProfissional("123456789012345");
        assertFalse(obj.validateCnsProfissional());
    }
    
    /**
     * Valida Código IBGE para entradas positivas
     */
    @Test
    public void testValidCodigoIBGE(){
        HeaderCdsCadastro obj = new HeaderCdsCadastro();
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
        HeaderCdsCadastro obj = new HeaderCdsCadastro();
        assertFalse(obj.validateCodigoIbgeMunicipio());
        obj.setCodigoIbgeMunicipio("12345678");
        assertFalse(obj.validateCodigoIbgeMunicipio());
        obj.setCodigoIbgeMunicipio("123456");
        assertFalse(obj.validateCodigoIbgeMunicipio());
    }
    
    /**
     * Valida DataAtendimento para entradas positivas
     */
    @Test
    public void testValidDataAtendimento(){
        HeaderCdsCadastro obj = new HeaderCdsCadastro();
        obj.setDataAtendimento(123456);
        assertTrue(obj.validateDataAtendimento());
    }
    
    /**
     * Valida DataAtendimento para entradas negativas
     */
    @Test
    public void testInvalidDataAtendimento(){
        HeaderCdsCadastro obj = new HeaderCdsCadastro();
        assertFalse(obj.validateDataAtendimento());
    }
    
    /**
     * Valida IneEquipe para entradas positivas
     */
    @Test
    public void testValidIneEquipe(){
        HeaderCdsCadastro obj = new HeaderCdsCadastro();
        assertTrue(obj.validateIneEquipe());
        obj.setIneEquipe("1234567890");
        assertTrue(obj.validateIneEquipe());

    }
    
    /**
     * Valida IneEquipe para entradas negativas
     */
    @Test
    public void testInvalidIneEquipe(){
        HeaderCdsCadastro obj = new HeaderCdsCadastro();
        obj.setIneEquipe("12345678");
        assertFalse(obj.validateIneEquipe());
    }
    
    /**
     * Valida Microarea para entradas positivas
     */
    @Test
    public void testValidMicroarea(){
        HeaderCdsCadastro obj = new HeaderCdsCadastro();
        assertTrue(obj.validateMicroarea());
        obj.setMicroarea(1);
        assertTrue(obj.validateMicroarea());

    }
    
    /**
     * Valida Microarea para entradas negativas
     */
    @Test
    public void testInvalidMicroarea(){
        HeaderCdsCadastro obj = new HeaderCdsCadastro();
        obj.setMicroarea(125);
        assertFalse(obj.validateMicroarea());
    }
}
