/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.Eddyosos.integracao20171.esus.cds.atividadecoletiva;

import br.gov.saude.esus.cds.transport.generated.thrift.atividadecoletiva.ParticipanteRowItemThrift;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author vinic
 */
public class ParticipanteRowItemTest {

    ParticipanteRowItem instance = new ParticipanteRowItem(new ParticipanteRowItemThrift());

    public ParticipanteRowItemTest() {
    }

    /**
     * Test of Cns, ParticipanteRowItem
     */
    @Test
    public void testValidaResponsavelCns() {
        assertFalse(instance.validaCns());
    }

    /**
     * Test of validaAvaliacaoAlterada, ParticipanteRowItem
     */
    @Test
    public void testValidaAvaliacaoAlterada() {
        instance.setAvaliacaoAlterada(true);
        assertTrue(instance.validaAvaliacaoAlterada());

        instance.setAvaliacaoAlterada(false);
        assertTrue(instance.validaAvaliacaoAlterada());

    }

    /**
     * Valida Peso
     */
    @Test
    public void testPesoAcompanhamentoNutricional() {
        assertTrue(instance.validaPeso());
        instance.setPeso(30.511);
        assertTrue(instance.validaPeso());
        instance.setPeso(30.5151);
        assertFalse(instance.validaPeso());
        instance.setPeso(0.1);
        assertFalse(instance.validaPeso());
    }

    /**
     * Valida Altura
     */
    @Test
    public void testAlturaAcompanhamentoNutricional() {
        assertTrue(instance.validateAltura());
        instance.setAltura(100.1);
        assertTrue(instance.validateAltura());
        instance.setAltura(20.16);
        assertTrue(instance.validateAltura());
        instance.setAltura(30.505);
        assertFalse(instance.validateAltura());
        instance.setAltura(0.1);
        assertFalse(instance.validateAltura());
    }

}
