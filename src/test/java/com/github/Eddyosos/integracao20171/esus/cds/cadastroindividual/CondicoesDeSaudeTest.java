/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.Eddyosos.integracao20171.esus.cds.cadastroindividual;

import java.util.LinkedList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eddyosos
 */
public class CondicoesDeSaudeTest {
    
    private CondicoesDeSaude obj;
    
    public CondicoesDeSaudeTest() {
    }
    
    @Before
    public void setUp() {
        obj = new CondicoesDeSaude();
    }

    /**
     * Valida DescricaoCausaInternacaoEm12Meses
     */
    @Test
    public void testDescricaoCausaInternacaoEm12Meses() {
        assertTrue(obj.validateDescricaoCausaInternacaoEm12Meses());
        obj.setDescricaoCausaInternacaoEm12Meses("a");
        assertTrue(obj.validateDescricaoCausaInternacaoEm12Meses());
        obj.setStatusTeveInternadoEm12Meses(false);
    }
    
    /**
     * Valida DescricaoOutraCondicao1
     */
    @Test
    public void testDescricaoOutraCondicao1(){
        assertTrue(obj.validateDescricaoOutraCondicao1());
        obj.setDescricaoOutraCondicao1("a");
        assertTrue(obj.validateDescricaoOutraCondicao1());
        String in = "";
        while(in.length() <= 100) in+="a";
        obj.setDescricaoOutraCondicao1(in);
        assertFalse(obj.validateDescricaoOutraCondicao1());
    }
    
        /**
     * Valida DescricaoOutraCondicao2
     */
    @Test
    public void testDescricaoOutraCondicao2(){
        assertTrue(obj.validateDescricaoOutraCondicao2());
        obj.setDescricaoOutraCondicao2("a");
        assertTrue(obj.validateDescricaoOutraCondicao2());
        String in = "";
        while(in.length() <= 100) in+="a";
        obj.setDescricaoOutraCondicao2(in);
        assertFalse(obj.validateDescricaoOutraCondicao2());
    }
        
    /**
     * Valida DescricaoOutraCondicao1
     */
    @Test
    public void testDescricaoOutraCondicao3(){
        assertTrue(obj.validateDescricaoOutraCondicao3());
        obj.setDescricaoOutraCondicao1("a");
        assertTrue(obj.validateDescricaoOutraCondicao3());
        String in = "";
        while(in.length() <= 100) in+="a";
        obj.setDescricaoOutraCondicao3(in);
        assertFalse(obj.validateDescricaoOutraCondicao3());
    }
    
    /**
     * Valida DescricaoPlantasMedicinaisUsadas
     */
    @Test
    public void testDescricaoPlantasMedicinaisUsadas(){
        assertTrue(obj.validateDescricaoPlantasMedicinaisUsadas());
        obj.setDescricaoPlantasMedicinaisUsadas("Cannabis");
        assertTrue(obj.validateDescricaoPlantasMedicinaisUsadas());
        obj.setStatusUsaPlantaMedicinais(false);
        assertFalse(obj.validateDescricaoPlantasMedicinaisUsadas());
    }
    
   /**
    * Valida DoencaCardiaca
    */
    @Test
    public void testDoencaCardiaca(){
        assertTrue(obj.validateDoencaCardiaca());
        obj.setStatusTeveDoencaCardiaca(true);
        assertFalse(obj.validateDoencaCardiaca());
        List<Long> input = new LinkedList<>();
        obj.setStatusTeveDoencaCardiaca(true);
        input.add(Long.MIN_VALUE);
        obj.setDoencaCardiaca(input);
        assertTrue(obj.validateDoencaCardiaca());
    }
    
    /**
    * Valida DoencaCardiaca
    */
    @Test
    public void testDoencaRespiratoria(){
        assertTrue(obj.validateDoencaRespiratoria());
        obj.setStatusTemDoencaRespiratoria(true);
        assertFalse(obj.validateDoencaRespiratoria());
        List<Long> input = new LinkedList<>();
        obj.setStatusTemDoencaRespiratoria(true);
        input.add(Long.MIN_VALUE);
        obj.setDoencaRespiratoria(input);
        assertTrue(obj.validateDoencaRespiratoria());
    }
    
    /**
    * Valida DoencaRins
    */
    @Test
    public void testDoencaRins(){
        assertTrue(obj.validateDoencaRins());
        obj.setStatusTemTeveDoencasRins(true);
        assertFalse(obj.validateDoencaRins());
        List<Long> input = new LinkedList<>();
        obj.setStatusTemTeveDoencasRins(true);
        input.add(Long.MIN_VALUE);
        obj.setDoencaRins(input);
        assertTrue(obj.validateDoencaRins());
    }
    
    /**
     * Valida MaternidadeDeReferencia
     */
    @Test
    public void testMaternidadeDeReferencia(){
        assertTrue(obj.ValidaMaternidadeDeReferencia());
        obj.setMaternidadeDeReferencia("alabama");
        assertTrue(obj.ValidaMaternidadeDeReferencia());
        obj.setStatusEhGestante(false);
        assertFalse(obj.ValidaMaternidadeDeReferencia());
    }
}
