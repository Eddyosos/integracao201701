package com.github.Eddyosos.integracao20171.esus.cds.common;

import org.junit.Test;
import static org.junit.Assert.*;

public class EnderecoLocalPermanenciaTest {
    /**
     * Valida bairro para entradas positivas
     */
    @Test
    public void testValidBairro(){
        EnderecoLocalPermanencia obj = new EnderecoLocalPermanencia();
        obj.setBairro("a");
        assertTrue(obj.validateBairro());
        String bairro = "";
        while(bairro.length() < 256) bairro += "a";
        obj.setBairro(bairro);
        assertTrue(obj.validateBairro());
    }
    
    /**
     * Valida bairro para entradas negativas
     */
    @Test
    public void testInvalidBairro(){
        EnderecoLocalPermanencia obj = new EnderecoLocalPermanencia();
        obj.setBairro(null);
        assertFalse(obj.validateBairro());
        obj.setBairro("");
        assertFalse(obj.validateBairro());
        String bairro = "";
        while(bairro.length() < 257) bairro += "a";
        obj.setBairro(bairro);
        assertFalse(obj.validateBairro());
    }
    
    /**
     * Valida CEP para entradas positivas
     */
    @Test
    public void testValidCEP(){
        EnderecoLocalPermanencia obj = new EnderecoLocalPermanencia();
        obj.setCep("12345678");
        assertTrue(obj.validateCEP());
    }
    
    /**
     * Valida CEP para entradas negativas
     */
    @Test
    public void testInvalidCEP(){
        EnderecoLocalPermanencia obj = new EnderecoLocalPermanencia();
        obj.setCep(null);
        assertFalse(obj.validateCEP());
        obj.setCep("a12345678");
        assertFalse(obj.validateCEP());
        obj.setCep("1234567");
        assertFalse(obj.validateCEP());
        obj.setCep("123456789");
        assertFalse(obj.validateCEP());
        obj.setCep("123.456-78");
        assertFalse(obj.validateCEP());
    }
    
    /**
     * Valida Código IBGE para entradas positivas
     */
    @Test
    public void testValidCodigoIBGE(){
        EnderecoLocalPermanencia obj = new EnderecoLocalPermanencia();
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
        EnderecoLocalPermanencia obj = new EnderecoLocalPermanencia();
        assertFalse(obj.validateCodigoIbgeMunicipio());
        obj.setCodigoIbgeMunicipio("12345678");
        assertFalse(obj.validateCodigoIbgeMunicipio());
        obj.setCodigoIbgeMunicipio("123456");
        assertFalse(obj.validateCodigoIbgeMunicipio());
    }
    
    /**
     * Valida complemento para entradas positivas
     */
    @Test
    public void testValidComplemento(){
        EnderecoLocalPermanencia obj = new EnderecoLocalPermanencia();
        assertTrue(obj.validateComplemento());
        obj.setComplemento(null);
        assertTrue(obj.validateComplemento());
        obj.setComplemento("Random :D");
        assertTrue(obj.validateComplemento());
    }
    
    /**
     * Valida complemento para entradas negativas
     */
    @Test
    public void testInvalidComplemento(){
        EnderecoLocalPermanencia obj = new EnderecoLocalPermanencia();
        obj.setComplemento("");
        assertFalse(obj.validateComplemento());
        String entrada = "";
        while(entrada.length() < 300) entrada += "a";
        obj.setComplemento(entrada);
        assertFalse(obj.validateComplemento());
    }
    
    /**
     * Valida logradouro para entradas positivas
     */
    @Test
    public void testValidNomeLogradouro(){
        EnderecoLocalPermanencia obj = new EnderecoLocalPermanencia();
        obj.setNomeLogradouro("Olá");
        assertTrue(obj.validateNomeLogradouro());
        obj.setNomeLogradouro("Random :D");
        assertTrue(obj.validateNomeLogradouro());
    }
    
    /**
     * Valida logradouro para entradas negativas
     */
    @Test
    public void testInvalidNomeLogradouro(){
        EnderecoLocalPermanencia obj = new EnderecoLocalPermanencia();
        assertFalse(obj.validateNomeLogradouro());
        obj.setNomeLogradouro(null);
        assertFalse(obj.validateNomeLogradouro());
        obj.setNomeLogradouro("");
        assertFalse(obj.validateNomeLogradouro());
        String entrada = "";
        while(entrada.length() < 300) entrada += "a";
        obj.setNomeLogradouro(entrada);
        assertFalse(obj.validateNomeLogradouro());
    }
    
    /**
     * Valida numero para entradas positivas
     */
    @Test
    public void testValidNumero(){
        EnderecoLocalPermanencia obj = new EnderecoLocalPermanencia();
        obj.setNumero("1");
        assertTrue(obj.validateNumero());
        obj.setNumero("0123456789");
        assertTrue(obj.validateNumero());
    }
    
    /**
     * Valida numero para entradas negativas
     */
    @Test
    public void testInvalidNumero(){
        EnderecoLocalPermanencia obj = new EnderecoLocalPermanencia();
        assertFalse(obj.validateNumero());
        obj.setNumero(null);
        assertFalse(obj.validateNumero());
        obj.setNumero("");
        assertFalse(obj.validateNumero());
        obj.setNumero("5as4db6");
        assertFalse(obj.validateNumero());
        obj.setNumero("12345678910");
        assertFalse(obj.validateNumero());
    }
    
    
    /**
     * Valida NumeroDneUf para entradas positivas
     */
    @Test
    public void testValidNumeroDneUf(){
        EnderecoLocalPermanencia obj = new EnderecoLocalPermanencia();
        obj.setNumeroDneUf("12");
        assertTrue(obj.validateNumeroDneUf());
        obj.setNumeroDneUf("01");
        assertTrue(obj.validateNumeroDneUf());
    }
    
    /**
     * Valida NumeroDneUf para entradas negativas
     */
    @Test
    public void testInvalidNumeroDneUf(){
        EnderecoLocalPermanencia obj = new EnderecoLocalPermanencia();
        assertFalse(obj.validateNumeroDneUf());
        obj.setNumeroDneUf(null);
        assertFalse(obj.validateNumeroDneUf());
        obj.setNumeroDneUf("");
        assertFalse(obj.validateNumeroDneUf());
        obj.setNumeroDneUf("5a");
        assertFalse(obj.validateNumeroDneUf());
        obj.setNumeroDneUf("123");
        assertFalse(obj.validateNumeroDneUf());
    }
    
    /**
     * Valida TelReferencial para entradas positivas
     */
    @Test
    public void testValidTelReferencial(){
        EnderecoLocalPermanencia obj = new EnderecoLocalPermanencia();
        assertTrue(obj.validateTelReferencial());
        obj.setTelReferencial(null);
        assertTrue(obj.validateTelReferencial());
        obj.setTelReferencial("01234567891");
        assertTrue(obj.validateTelReferencial());
        obj.setTelReferencial("0123456789");
        assertTrue(obj.validateTelReferencial());
    }
    
    /**
     * Valida TelReferencial para entradas negativas
     */
    @Test
    public void testInvalidTelReferencial(){
        EnderecoLocalPermanencia obj = new EnderecoLocalPermanencia();
        obj.setTelReferencial("");
        assertFalse(obj.validateTelReferencial());
        obj.setTelReferencial("5a");
        assertFalse(obj.validateTelReferencial());
        obj.setTelReferencial("123");
        assertFalse(obj.validateTelReferencial());
    }
    
    /**
     * Valida TelResidencial para entradas positivas
     */
    @Test
    public void testValidTelResidencial(){
        EnderecoLocalPermanencia obj = new EnderecoLocalPermanencia();
        assertTrue(obj.validateTelResidencial());
        obj.setTelResidencial(null);
        assertTrue(obj.validateTelResidencial());
        obj.setTelResidencial("01234567891");
        assertTrue(obj.validateTelResidencial());
        obj.setTelResidencial("0123456789");
        assertTrue(obj.validateTelResidencial());
    }
    
    /**
     * Valida TelResidencial para entradas negativas
     */
    @Test
    public void testInvalidTelResidencial(){
        EnderecoLocalPermanencia obj = new EnderecoLocalPermanencia();
        obj.setTelResidencial("");
        assertFalse(obj.validateTelResidencial());
        obj.setTelResidencial("5a");
        assertFalse(obj.validateTelResidencial());
        obj.setTelResidencial("123");
        assertFalse(obj.validateTelResidencial());
    }
    
      /**
     * Valida TipoLogradouroNumeroDne para entradas positivas
     */
    @Test
    public void testValidTipoLogradouroNumeroDne(){
        EnderecoLocalPermanencia obj = new EnderecoLocalPermanencia();
        obj.setTipoLogradouroNumeroDne("001");
        obj.setNumeroDneUf("12");
        assertTrue(obj.validateTipoLogradouroNumeroDne());
        obj.setTipoLogradouroNumeroDne("123");
        assertTrue(obj.validateTipoLogradouroNumeroDne());
    }
    
    /**
     * Valida TipoLogradouroNumeroDne para entradas negativas
     */
    @Test
    public void testInvalidTipoLogradouroNumeroDne(){
        EnderecoLocalPermanencia obj = new EnderecoLocalPermanencia();
        assertFalse(obj.validateTipoLogradouroNumeroDne());
        obj.setTipoLogradouroNumeroDne(null);
        obj.setNumeroDneUf("12");
        assertFalse(obj.validateTipoLogradouroNumeroDne());
        obj.setTipoLogradouroNumeroDne("");
        assertFalse(obj.validateTipoLogradouroNumeroDne());
        obj.setTipoLogradouroNumeroDne("5a");
        assertFalse(obj.validateTipoLogradouroNumeroDne());
    }
    
}
