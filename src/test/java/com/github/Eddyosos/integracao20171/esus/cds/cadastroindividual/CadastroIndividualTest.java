/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.Eddyosos.integracao20171.esus.cds.cadastroindividual;

import com.github.Eddyosos.integracao20171.esus.cds.common.HeaderCdsCadastro;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eddyosos
 */
public class CadastroIndividualTest {
    
    private CadastroIndividual obj; 
    
    @Before
    public void setUp() {
        obj = new CadastroIndividual();
    }

    /**
     * Valida CondicoesDeSaude
     */
    @Test
    public void testCondicoesDeSaude() {
        assertTrue(obj.validateCondicoesDeSaude());
        obj.setCondicoesDeSaude(new CondicoesDeSaude());
        assertTrue(obj.validateCondicoesDeSaude());
        obj.setStatusTermoRecusaCadastroIndividualAtencaoBasica(true);
        assertFalse(obj.validateCondicoesDeSaude());
    }
    
    /**
     * Valida DadosGerais
     */
    @Test
    public void testDadosGerais(){
        assertFalse(obj.validateDadosGerais());
        obj.setDadosGerais(new HeaderCdsCadastro());
        assertTrue(obj.validateDadosGerais());
    }
    
    /**
     * Valida EmSituacaoDeRua
     */
    @Test
    public void testEmSituacaoDeRua(){
        assertTrue(obj.validateEmSituacaoDeRua());
        obj.setEmSituacaoDeRua(new EmSituacaoDeRua());
        assertTrue(obj.validateEmSituacaoDeRua());
        obj.setStatusTermoRecusaCadastroIndividualAtencaoBasica(true);
        assertFalse(obj.validateEmSituacaoDeRua());
    }
    
    /**
     * Valida FichaAtualizada
     */
    @Test
    public void testFichaAtualizada(){
        assertFalse(obj.validateFichaAtualizada());
        obj.setFichaAtualizada(true);
        assertTrue(obj.validateFichaAtualizada());
    }
    
    /**
     * Valida IndetificacaoUsuarioCidadao
     */
    @Test
    public void testIndetificacaoUsuarioCidadao(){
        assertTrue(obj.validateIndetificacaoUsuarioCidadao());
        obj.setIdentificacaoUsuarioCidadao(new IdentificacaoUsuarioCidadao());
        assertTrue(obj.validateIndetificacaoUsuarioCidadao());
        obj.setStatusTermoRecusaCadastroIndividualAtencaoBasica(true);
        assertFalse(obj.validateIndetificacaoUsuarioCidadao());
    }
    
    /**
     * Valida InformacoesSocioDemografica
     */
    @Test
    public void testInformacoesSocioDemografica(){
        assertTrue(obj.validateInformacoesSocioDemografica());
        obj.setInformacoesSocioDemograficas(new InformacoesSocioDemograficas());
        assertTrue(obj.validateInformacoesSocioDemografica());
        obj.setStatusTermoRecusaCadastroIndividualAtencaoBasica(true);
        assertFalse(obj.validateInformacoesSocioDemografica());
    }
    
    /**
     * Valida TpCdsOrigem
     */
    @Test
    public void testTpCdsOrigem(){
        assertFalse(obj.validateTpCdsOrigem());
        obj.setTpCdsOrigem(3);
        assertTrue(obj.validateTpCdsOrigem());
    }
    
    /**
     * ValidaUuid
     */
    @Test
    public void testUuid(){
        assertTrue(obj.validateUuid());
        obj.setUuid("123trf");
        assertFalse(obj.validateUuid());
        obj.setUuid("123e4567-e89b-12d3-a456-426655440000");
        assertTrue(obj.validateUuid());
    }
    
    /**
     * Valida UuidFichaOriginadora
     */
    @Test
    public void testUuidFichaOriginadora(){
        assertFalse(obj.validateUuidFichaOriginadora());
        obj.setUuidFichaOriginadora("123trf");
        assertFalse(obj.validateUuidFichaOriginadora());
        obj.setUuidFichaOriginadora("123e4567-e89b-12d3-a456-426655440000");
        assertTrue(obj.validateUuidFichaOriginadora());
    }
            
}
