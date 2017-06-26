/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.Eddyosos.integracao20171.esus.cds.atividadecoletiva;

import br.gov.saude.esus.cds.transport.generated.thrift.atividadecoletiva.ProfissionalCboRowItemThrift;
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
public class ProfissionalCboRowItemTest {
    
    public ProfissionalCboRowItemTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of deepCopy method, of class ProfissionalCboRowItem.
     */
    @Test
    public void testDeepCopy() {
        System.out.println("deepCopy");
        ProfissionalCboRowItem instance = null;
        ProfissionalCboRowItem expResult = null;
        ProfissionalCboRowItem result = instance.deepCopy();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class ProfissionalCboRowItem.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        ProfissionalCboRowItem instance = null;
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCns method, of class ProfissionalCboRowItem.
     */
    @Test
    public void testGetCns() {
        System.out.println("getCns");
        ProfissionalCboRowItem instance = null;
        String expResult = "";
        String result = instance.getCns();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCns method, of class ProfissionalCboRowItem.
     */
    @Test
    public void testSetCns() {
        System.out.println("setCns");
        String cns = "";
        ProfissionalCboRowItem instance = null;
        instance.setCns(cns);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unsetCns method, of class ProfissionalCboRowItem.
     */
    @Test
    public void testUnsetCns() {
        System.out.println("unsetCns");
        ProfissionalCboRowItem instance = null;
        instance.unsetCns();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSetCns method, of class ProfissionalCboRowItem.
     */
    @Test
    public void testIsSetCns() {
        System.out.println("isSetCns");
        ProfissionalCboRowItem instance = null;
        boolean expResult = false;
        boolean result = instance.isSetCns();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCnsIsSet method, of class ProfissionalCboRowItem.
     */
    @Test
    public void testSetCnsIsSet() {
        System.out.println("setCnsIsSet");
        boolean value = false;
        ProfissionalCboRowItem instance = null;
        instance.setCnsIsSet(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodigoCbo2002 method, of class ProfissionalCboRowItem.
     */
    @Test
    public void testGetCodigoCbo2002() {
        System.out.println("getCodigoCbo2002");
        ProfissionalCboRowItem instance = null;
        String expResult = "";
        String result = instance.getCodigoCbo2002();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigoCbo2002 method, of class ProfissionalCboRowItem.
     */
    @Test
    public void testSetCodigoCbo2002() {
        System.out.println("setCodigoCbo2002");
        String codigoCbo2002 = "";
        ProfissionalCboRowItem instance = null;
        instance.setCodigoCbo2002(codigoCbo2002);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unsetCodigoCbo2002 method, of class ProfissionalCboRowItem.
     */
    @Test
    public void testUnsetCodigoCbo2002() {
        System.out.println("unsetCodigoCbo2002");
        ProfissionalCboRowItem instance = null;
        instance.unsetCodigoCbo2002();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSetCodigoCbo2002 method, of class ProfissionalCboRowItem.
     */
    @Test
    public void testIsSetCodigoCbo2002() {
        System.out.println("isSetCodigoCbo2002");
        ProfissionalCboRowItem instance = null;
        boolean expResult = false;
        boolean result = instance.isSetCodigoCbo2002();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigoCbo2002IsSet method, of class ProfissionalCboRowItem.
     */
    @Test
    public void testSetCodigoCbo2002IsSet() {
        System.out.println("setCodigoCbo2002IsSet");
        boolean value = false;
        ProfissionalCboRowItem instance = null;
        instance.setCodigoCbo2002IsSet(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class ProfissionalCboRowItem.
     */
    @Test
    public void testEquals_Object() {
        System.out.println("equals");
        Object that = null;
        ProfissionalCboRowItem instance = null;
        boolean expResult = false;
        boolean result = instance.equals(that);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class ProfissionalCboRowItem.
     */
    @Test
    public void testEquals_ProfissionalCboRowItem() {
        System.out.println("equals");
        ProfissionalCboRowItem that = null;
        ProfissionalCboRowItem instance = null;
        boolean expResult = false;
        boolean result = instance.equals(that);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class ProfissionalCboRowItem.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        ProfissionalCboRowItem instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class ProfissionalCboRowItem.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        ProfissionalCboRowItem other = null;
        ProfissionalCboRowItem instance = null;
        int expResult = 0;
        int result = instance.compareTo(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ProfissionalCboRowItem.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ProfissionalCboRowItem instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validate method, of class ProfissionalCboRowItem.
     */
    @Test
    public void testValidate() throws Exception {
        System.out.println("validate");
        ProfissionalCboRowItem instance = null;
        instance.validate();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInstance method, of class ProfissionalCboRowItem.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        ProfissionalCboRowItem instance = null;
        ProfissionalCboRowItemThrift expResult = null;
        ProfissionalCboRowItemThrift result = instance.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
