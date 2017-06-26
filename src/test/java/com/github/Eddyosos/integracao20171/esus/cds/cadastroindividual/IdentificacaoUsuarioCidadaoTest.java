/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.Eddyosos.integracao20171.esus.cds.cadastroindividual;

import br.gov.saude.esus.cds.transport.generated.thrift.cadastroindividual.IdentificacaoUsuarioCidadaoThrift;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vinil
 */
public class IdentificacaoUsuarioCidadaoTest {

    IdentificacaoUsuarioCidadao instance = new IdentificacaoUsuarioCidadao(new IdentificacaoUsuarioCidadaoThrift());

    public IdentificacaoUsuarioCidadaoTest() {
    }

    /**
     * Testa ValidaNomeSocialCidadao
     */
    @Test
    public void testValidaNomeSocialCidadao() {
        instance.setNomeSocialCidadao("Vinicius Carvalho Lopes");
        assertTrue(instance.validaNomeSocialCidadao());

        instance.setNomeSocialCidadao("Lorem ipsum dolor sit amet, quisque odio in, lobortis commodo in magnam et tellus, sed placerat, id volutpat fusce nunc in nec, praesent metus integer aliquet amet adipiscing sem. In sodales mauris, donec ac, nulla aut sed adipiscing. Montes felis, nunc ut a suspendisse aliquet accumsan, et wisi. Aenean urna. Ac mauris integer nisl, pellentesque id libero accumsan, etiam libero sed convallis orci, lobortis purus ridiculus sed. Justo sapien ut maecenas corrupti pellentesque, dolor est, risus libero qui. Lacus ac curabitur condimentum, nascetur vitae velit eget, nascetur quis, interdum tincidunt scelerisque libero at urna. Carvalho Lopes");
        assertFalse(instance.validaNomeSocialCidadao());
    }

    /**
     * Valida Código IBGE para entradas positivas
     */
    @Test
    public void testValidCodigoIBGE() {
        instance.setNacionalidadeCidadao(1);
        instance.setCodigoIbgeMunicipioNascimento("4120655");
        assertTrue(instance.validaCodigoIbgeMunicipioNascimento());
        instance.setCodigoIbgeMunicipioNascimento("1234567");
        assertTrue(instance.validaCodigoIbgeMunicipioNascimento());
    }

    /**
     * Valida Código IBGE para entradas negativas
     */
    @Test
    public void testInvalidCodigoIBGE() {
        instance.setNacionalidadeCidadao(1);
        instance.setCodigoIbgeMunicipioNascimento("12345678");
        assertFalse(instance.validaCodigoIbgeMunicipioNascimento());
        instance.setCodigoIbgeMunicipioNascimento("123456");
        assertFalse(instance.validaCodigoIbgeMunicipioNascimento());
    }

    /**
     * Teste ValidanomeCidadao
     */
    @Test
    public void testValidaEmailCidadao() {
        instance.setEmailCidadao("vini@gmail.com");
        assertTrue(instance.ValidaEmailCidadao());

        instance.setEmailCidadao("vinigmailcom");
        assertFalse(instance.ValidaEmailCidadao());
    }

    /**
     * Teste validaNacionalidadeCidadao
     */
    @Test
    public void testValidaNacionalidadeCidadao() {
        instance.setNacionalidadeCidadao(1);
        assertTrue(instance.ValidaNaciondalidaCidade());

        instance.setNacionalidadeCidadao(4);
        assertFalse(instance.ValidaNaciondalidaCidade());
    }

    /**
     * Teste validaNomeMaeCidadao
     */
    @Test
    public void testValidaNomeMaeCidade() {
        instance.setDesconheceNomeMae(false);
        instance.setNomeMaeCidadao("elenice");

        assertTrue(instance.validaNomeMaeCidadao());

        instance.setDesconheceNomeMae(true);
        instance.setNomeMaeCidadao("elenice");

        assertFalse(instance.validaNomeMaeCidadao());

    }

    /**
     * Teste de validaNumeroCartaoSus
     */
    @Test
    public void testValidaNumeroCartaoSus() {
        assertFalse(instance.validaNumeroCartaoSus());
    }

    /**
     * Teste de validaNumeroCartaoSusResponsavel
     */
    @Test
    public void testValidaNumeroCartaoSusResponsavel() {
        instance.setStatusEhResponsavel(true);
        assertFalse(instance.validaNumeroCartaoSusResponsavel());
    }

    /**
     * Teste de validaNumeroCelularCidadao
     */
    @Test
    public void testNumeroCelularCidadao() {
        instance.setNumeroCelularCidadao("1234567890");
        assertTrue(instance.validaNumeroCelularCidadao());

        instance.setNumeroCelularCidadao("12b4c6789a");
        assertFalse(instance.validaNumeroCelularCidadao());
    }

    /**
     * Teste de validaNumeroNisPisPasep
     */
    @Test
    public void testNumeroNisPisPasep() {
        instance.setNumeroNisPisPasep("12345678901");
        assertTrue(instance.validaNumeroNisPisPasep());

        instance.setNumeroNisPisPasep("123456789012");
        assertFalse(instance.validaNumeroNisPisPasep());
    }

    @Test
    /**
     * Test of validaPaisNascimento
     */
    public void testPaisNascimento() {
        instance.setNacionalidadeCidadao(2);
        instance.setPaisNascimento(5);

        assertTrue(instance.validaPaisNacimento());

        instance.setNacionalidadeCidadao(1);
        instance.setPaisNascimento(5);

        assertFalse(instance.validaPaisNacimento());
    }

    /**
     * Teste de validaRacaCorCidadao
     */
    @Test

    public void testValidaRacaCorCidadao() {
        assertFalse(instance.validaRacaCorCidadao());

        instance.setRacaCorCidadao(4);
        assertTrue(instance.validaRacaCorCidadao());
    }

    /**
     * Teste de testValidaSexoCidadao
     */
    @Test

    public void testValidaSexoCidadao() {
        assertFalse(instance.validaSexoCidadao());

        instance.setRacaCorCidadao(1);
        assertTrue(instance.validaSexoCidadao());
    }

}
