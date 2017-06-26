/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.Eddyosos.integracao20171.esus.cds.visitadomiciliar;

import br.gov.saude.esus.cds.transport.generated.thrift.visitadomiciliar.FichaVisitaDomiciliarChildThrift;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vinic
 */
public class FichaVisitaDomiciliarChildTest {

    FichaVisitaDomiciliarChild instance = new FichaVisitaDomiciliarChild(new FichaVisitaDomiciliarChildThrift());

    /**
     * Test of validaTurno method, of class FichaVisitaDomiciliarChild.
     */
    @Test
    public void testValidaTurno() {

        instance.setTurno(1);
        boolean result = instance.validaTurno();
        assertTrue(result);

        instance.setTurno(2);
        result = instance.validaTurno();
        assertTrue(result);

        instance.setTurno(3);
        result = instance.validaTurno();
        assertTrue(result);

        instance.setTurno(4);
        result = instance.validaTurno();
        assertFalse(result);
    }

    /**
     * Test of validaNumProntuario, of FichaVisitaDomiciliarChild.
     *
     */
    @Test
    public void testValidaNumProntuario() {

        instance.setNumProntuario("abcdqwert123412345123123123123");
        boolean result = instance.validaNumProntuario();
        assertTrue(result);

        //Mais que 30 caracteres
        instance.setNumProntuario("abcdqwert1234123451231231231523");
        result = instance.validaNumProntuario();
        assertFalse(result);

        //Caracter especial
        instance.setNumProntuario("abcdqwert12341234512312312312/");
        result = instance.validaNumProntuario();
        assertFalse(result);

    }

    /**
     * Test of validaNumCartaoSus, of FichaVisitaDomiciliarchild
     *
     */
    @Test
    public void testValidaNumCartaoSus() {

        instance.setNumCartaoSus("1234567891111111");
        boolean result = instance.validaNumCartaoSus();
        assertFalse(result);

    }

    /**
     * Test of validaSexo, of FichaVisitaDomiciliarchild
     *
     */
    @Test
    public void testValidaSexo() {

        instance.setSexo(1);
        boolean result = instance.validaSexo();
        assertTrue(result);

        instance.setSexo(0);
        result = instance.validaSexo();
        assertTrue(result);

        instance.setSexo(2);
        result = instance.validaSexo();
        assertFalse(result);

    }

    /**
     * Test of validaStatusVisitaCompartilhada, of FichaVisitaDomiciliarchild
     *
     */
    @Test
    public void testValidaStatusVisitaCompartilhada() {

        instance.setStatusVisitaCompartilhadaOutroProfissional(true);
        boolean result = instance.validaStatusVisitaCompartilhada();
        assertTrue(result);

        instance.setStatusVisitaCompartilhadaOutroProfissional(false);
        result = instance.validaStatusVisitaCompartilhada();
        assertTrue(result);

    }

    /**
     * Test of validaMotivosVisita, of FichaVisitaDomiciliarchild
     *
     */
    @Test
    public void testValidaMotivosVisita() {
        List<Long> lista = new <Long> ArrayList();
        long[] longs = new long[3];
        longs[0] = 1;
        longs[1] = 20;
        longs[2] = 33;

        lista.add(longs[0]);
        lista.add(longs[1]);
        lista.add(longs[2]);

        boolean result = instance.validaMotivosVisita();
        instance.setMotivosVisita(lista);

        assertTrue(result);

        longs[2] = 34;
        lista.add(longs[2]);
        instance.setMotivosVisita(lista);

        result = instance.validaMotivosVisita();

        assertFalse(result);

    }

    /**
     * Test of validaDesfecho, of FichaVisitaDomiciliarchild
     *
     */
    @Test
    public void testValidaDesfecho() {

        instance.setDesfecho(1);
        boolean result = instance.validaDesfecho();

        assertTrue(result);

        instance.setDesfecho(2);
        result = instance.validaDesfecho();

        assertTrue(result);

        instance.setDesfecho(3);
        result = instance.validaDesfecho();

        assertTrue(result);

        instance.setDesfecho(4);
        result = instance.validaDesfecho();

        assertFalse(result);

    }

}
