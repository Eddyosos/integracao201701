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
public class FichaAtendimentoIndividualChildTest {

    private FichaAtendimentoIndividualChild obj;
    
    @Before
    public void setup(){
        obj = new FichaAtendimentoIndividualChild();
    }
    
    /**
     * Valida NumeroProntuario
     */
    @Test
    public void testNumeroProntuario() {
        assertTrue(obj.validateNumeroProntuario());
        obj.setNumeroProntuario("1235sdarrE");
        assertTrue(obj.validateNumeroProntuario());
        obj.setNumeroProntuario("]e[1");
        assertFalse(obj.validateNumeroProntuario());
    }
    
    /**
     * Valida CNS
     * @see com.github.Eddyosos.intregracao20171.utils.IDS.CNS
     */
    @Test
    public void testCns(){
        assertFalse(obj.validateCns());
    }
    
    /**
     * Valida DataNascimento
     */
    @Test
    public void testDataNascimento(){
        assertFalse(obj.validateDataNascimento());
    }
    
    /**
     * Valida LocalDeAtendimento
     */
    @Test
    public void testLocalDeAtendimento(){
        assertFalse(obj.validateLocalDeAtendimento());
        obj.setLocalDeAtendimento(1);
        assertTrue(obj.validateLocalDeAtendimento());
        obj.setLocalDeAtendimento(15);
        assertFalse(obj.validateLocalDeAtendimento());
    }
    
    /**
     * Valida Sexo
     */
    @Test
    public void testSexo(){
        assertFalse(obj.validateSexo());
        obj.setSexo(1);
        assertTrue(obj.validateSexo());
    }
    
    /**
     * Valida Turno
     */
    @Test
    public void testTurno(){
        assertTrue(obj.validateTurno());
        obj.setTurno(1);
        assertTrue(obj.validateTurno());
        obj.setTurno(300);
        assertFalse(obj.validateTurno());
    }
    
    /**
     * Valida TipoAtendimento
     */
    @Test
    public void testTipoAtendimento(){
        assertFalse(obj.validateTipoAtendimento());
        obj.setTipoAtendimento(1);
        assertTrue(obj.validateTipoAtendimento());
        obj.setTipoAtendimento(100);
        assertFalse(obj.validateTipoAtendimento());
    }
    
    /**
     * Valida PesoAcompanhamentoNutricional
     */
    @Test
    public void testPesoAcompanhamentoNutricional(){
        assertTrue(obj.validatePesoAcompanhamentoNutricional());
        obj.setPesoAcompanhamentoNutricional(30.50);
        assertTrue(obj.validatePesoAcompanhamentoNutricional());
        obj.setPesoAcompanhamentoNutricional(30.5050);
        assertFalse(obj.validatePesoAcompanhamentoNutricional());
        obj.setPesoAcompanhamentoNutricional(0.1);
        assertFalse(obj.validatePesoAcompanhamentoNutricional());
    }
    
    /**
     * Valida AlturaAcompanhamentoNutricional
     */
    @Test
    public void testAlturaAcompanhamentoNutricional(){
        assertTrue(obj.validateAlturaAcompanhamentoNutricional());
        obj.setAlturaAcompanhamentoNutricional(30.50);
        assertTrue(obj.validateAlturaAcompanhamentoNutricional());
        obj.setAlturaAcompanhamentoNutricional(30.5050);
        assertFalse(obj.validateAlturaAcompanhamentoNutricional());
        obj.setAlturaAcompanhamentoNutricional(0.1);
        assertFalse(obj.validateAlturaAcompanhamentoNutricional());
    }
    
    /**
     * Valida AleitamentoMaterno
     */
    @Test
    public void testAleitamentoMaterno(){
        assertTrue(obj.validateAleitamentoMaterno());
        obj.setAleitamentoMaterno(1);
        assertTrue(obj.validateAleitamentoMaterno());
        obj.setAleitamentoMaterno(10);
        assertFalse(obj.validateAleitamentoMaterno());
    }
    
    /**
     * Valida DumDaGestante
     */
    @Test
    public void testDumDaGestante(){
        assertTrue(obj.validateDumDaGestante());
        obj.setSexo(1);
        obj.setDataNascimento(500);
        obj.setDumDaGestante(5000);
        assertTrue(obj.validateDumDaGestante());
        obj.setSexo(0);
        assertFalse(obj.validateDumDaGestante());
    }
    
    /**
     * Valida IdadeGestacional
     */
    @Test
    public void testIdadeGestacional(){
        assertTrue(obj.validateIdadeGestacional());
        obj.setSexo(1);
        obj.setIdadeGestacional(12);
        assertTrue(obj.validateIdadeGestacional());
        obj.setSexo(0);
        assertFalse(obj.validateIdadeGestacional());
    }
    
    /**
     * Valida AtencaoDomiciliarModalidade
     */
    @Test
    public void testAtencaoDomiciliarModalidade(){
        assertTrue(obj.validateAtencaoDomiciliarModalidade());
        obj.setAtencaoDomiciliarModalidade(2);
        assertTrue(obj.validateAtencaoDomiciliarModalidade());
        obj.setAtencaoDomiciliarModalidade(0);
        assertFalse(obj.validateAtencaoDomiciliarModalidade());
    }
    
    /**
     * Valida ProblemaCondicaoAvaliada
     */
    @Test
    public void testProblemaCondicaoAvaliada() {
        assertFalse(obj.validateProblemaCondicaoAvaliada());
        obj.setProblemaCondicaoAvaliada(new ProblemaCondicaoAvaliacaoAI());
        assertTrue(obj.validateProblemaCondicaoAvaliada());
    }
    
    /**
     * Valida ExamesSolicitados
     */
    @Test
    public void testExamesSolicitados(){
        assertTrue(obj.validateExamesSolicitados());
        List<String> inputs = new LinkedList<>();
        obj.setExamesSolicitados(inputs);
        assertTrue(obj.validateExamesSolicitados());
        inputs.add("AMIGO");
        obj.setExamesSolicitados(inputs);
        assertTrue(obj.validateExamesSolicitados());
        inputs.add("AMIGO");
        obj.setExamesSolicitados(inputs);
        assertFalse(obj.validateExamesSolicitados());
    }
    
    /**
     * Valida ExamesAvaliados
     */
    @Test
    public void testExamesAvaliados(){
        assertTrue(obj.validateExamesAvaliados());
        List<String> inputs = new LinkedList<>();
        obj.setExamesAvaliados(inputs);
        assertTrue(obj.validateExamesAvaliados());
        inputs.add("AMIGO");
        obj.setExamesAvaliados(inputs);
        assertTrue(obj.validateExamesAvaliados());
        inputs.add("AMIGO");
        obj.setExamesAvaliados(inputs);
        assertFalse(obj.validateExamesAvaliados());
    }
    
    /**
     * Valida OutrosSia
     */
    @Test
    public void testOutrosSia(){
        assertTrue(obj.validateOutrosSia());
        List<OutrosSia> input = new LinkedList<>();
        obj.setOutrosSia(input);
        assertTrue(obj.validateOutrosSia());
        input.add(new OutrosSia());
        input.add(new OutrosSia());
        input.add(new OutrosSia());
        input.add(new OutrosSia());
        obj.setOutrosSia(input);
        assertFalse(obj.validateOutrosSia());
    }
    
    /**
     * Valida Pic
     */
    @Test 
    public void testPic(){
        assertTrue(obj.validatePic());
        obj.setPic(0);
        assertFalse(obj.validatePic());
        obj.setPic(1);
        assertTrue(obj.validatePic());
    }
    
    /**
     * Valida Nasfs
     */
    @Test
    public void testNasfs(){
        assertTrue(obj.validateNasfs());
        List<Long> input = new LinkedList<>();
        obj.setNasfs(input);
        assertTrue(obj.validateNasfs());
        input.add(Long.MIN_VALUE);
        input.add(Long.MIN_VALUE);
        input.add(Long.MIN_VALUE);
        input.add(Long.MIN_VALUE);
        obj.setNasfs(input);
        assertFalse(obj.validateNasfs());
    }
    
    /**
     * Valida Condutas
     */
    @Test
    public void testCondutas(){
        assertFalse(obj.validateCondutas());
        List<Long> input = new LinkedList<>();
        obj.setCondutas(input);
        assertFalse(obj.validateCondutas());
        input.add(1L);
        input.add(2L);
        input.add(3L);
        input.add(4L);
        obj.setCondutas(input);
        assertTrue(obj.validateCondutas());
    }
    
    /**
     * Valida StGravidezPlanejada
     */
    @Test
    public void testStGravidezPlanejada(){
        assertTrue(obj.validateStGravidezPlanejada());
        obj.setSexo(0);
        obj.setStGravidezPlanejada(true);
        assertFalse(obj.validateStGravidezPlanejada());
    }
    
    /**
     * Valida NuGestasPrevias
     */
    @Test
    public void testNuGestasPrevias(){
        assertTrue(obj.validateNuGestasPrevias());
        obj.setSexo(0);
        obj.setNuGestasPrevias(1);
        assertFalse(obj.validateNuGestasPrevias());
    }
    
    /**
     * Valida NuPartos
     */
    @Test
    public void testNuPartos(){
        assertTrue(obj.validateNuPartos());
        obj.setSexo(0);
        obj.setNuPartos(1);
        assertFalse(obj.validateNuPartos());
    }
}
