/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.Eddyosos.integracao20171.esus.cds.visitadomiciliar;

import br.gov.saude.esus.cds.transport.generated.thrift.visitadomiciliar.FichaVisitaDomiciliarChildThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.visitadomiciliar.FichaVisitaDomiciliarMasterThrift;
import com.github.Eddyosos.integracao20171.esus.cds.common.UnicaLotacaoHeader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vinic
 */
public class FichaVisitaDomiciliarMasterTest {

    FichaVisitaDomiciliarMaster instance = new FichaVisitaDomiciliarMaster(new FichaVisitaDomiciliarMasterThrift());

    public FichaVisitaDomiciliarMasterTest() {
    }

    /**
     * Test of validaUuidFicha method, of class FichaVisitaDomiciliarMaster.
     */
    @Test
    public void testValidaUuidFicha() {

        instance.setUuidFicha("a12341234123123123412312312312312313");
        boolean result = instance.validaUuidFicha();
        assertTrue(result);

        //Mais de 44 caracteres
        instance.setUuidFicha("a12341234123123123412312312312312313789444444");
        result = instance.validaUuidFicha();

        assertFalse(result);
    }

    /**
     * Test of validaVisitasDomiciliares method, of class FichaVisitaDomiciliarMaster
     */
    @Test
    public void testvalidaVisitasDomiciliares() {
        List<FichaVisitaDomiciliarChild> lista = new <FichaVisitaDomiciliarChild> ArrayList();

        for (int i = 0; i < 23; i++) {
            lista.add(new FichaVisitaDomiciliarChild(new FichaVisitaDomiciliarChildThrift()));
        }
        instance.setVisitasDomiciliares(lista);
        boolean result = instance.validaVisitasDomiciliares();
        assertTrue(result);

        for (int i = 0; i < 24; i++) {
            lista.add(new FichaVisitaDomiciliarChild(new FichaVisitaDomiciliarChildThrift()));
        }

        instance.setVisitasDomiciliares(lista);
        result = instance.validaVisitasDomiciliares();
        
        assertFalse(result);
    }

}
