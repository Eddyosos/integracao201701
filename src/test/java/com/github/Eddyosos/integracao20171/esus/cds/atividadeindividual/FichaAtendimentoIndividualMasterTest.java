/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.Eddyosos.integracao20171.esus.cds.atividadeindividual;

import com.github.Eddyosos.integracao20171.esus.cds.common.VariasLotacoesHeader;
import com.github.eddyosos.e_sus_ab_factory.cds.atividadeindividual.IFichaAtendimentoIndividualChild;
import java.util.LinkedList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author eddyosos
 */
public class FichaAtendimentoIndividualMasterTest {
    
    private FichaAtendimentoIndividualMaster obj;
    
    @Before
    public void setup(){
        obj = new FichaAtendimentoIndividualMaster();
    }
    
    /**
     * Valida HeaderTransport
     */
    @Test
    public void testHeaderTransport() {
        assertFalse(obj.validateHeaderTransport());
        obj.setHeaderTransport(new VariasLotacoesHeader());
        assertTrue(obj.validateHeaderTransport());
    }
    
    /**
     * Valida AtendimentosIndividuais
     */
    @Test
    public void testAtendimentosIndividuais(){
        assertFalse(obj.validateAtendimentosIndividuais());
        List<IFichaAtendimentoIndividualChild> input = new LinkedList();
        obj.setAtendimentosIndividuais(input);
        assertFalse(obj.validateAtendimentosIndividuais());
        input.add(new FichaAtendimentoIndividualChild());
        obj.setAtendimentosIndividuais(input);
        assertTrue(obj.validateAtendimentosIndividuais());
    }
    
    /**
     * Valida UuidFicha
     */
    @Test
    public void testUuidFicha(){
        assertFalse(obj.validateUuidFicha());
        obj.setUuidFicha("123e4567-e89b-12d3-a456-426655440000");
        assertTrue(obj.validateUuidFicha());
    }
    
    /**
     * Valida TpCdsOrigem
     */
    @Test
    public void testTpCdsOrigem(){
        assertFalse(obj.validateTpCdsOrigem());
        obj.setTpCdsOrigem(1);
        assertTrue(obj.validateTpCdsOrigem());
    }
}
