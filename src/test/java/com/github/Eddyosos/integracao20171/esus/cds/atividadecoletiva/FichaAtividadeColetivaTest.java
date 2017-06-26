/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.Eddyosos.integracao20171.esus.cds.atividadecoletiva;

import br.gov.saude.esus.cds.transport.generated.thrift.atividadecoletiva.FichaAtividadeColetivaThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.atividadecoletiva.ParticipanteRowItemThrift;
import com.github.Eddyosos.integracao20171.esus.cds.common.EnderecoLocalPermanencia;
import com.github.eddyosos.e_sus_ab_factory.cds.atividadecoletiva.IParticipanteRowItem;
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
public class FichaAtividadeColetivaTest {

    FichaAtividadeColetiva instance = new FichaAtividadeColetiva(new FichaAtividadeColetivaThrift());

    public FichaAtividadeColetivaTest() {
    }

    /**
     * Test of validaUuidFicha method, of class FichaAtividadeColetiva.
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
     * Test of validaDtAtividadeColetiva, FichaAtividadeColetiva
     */
    @Test
    public void testValidaDtAtividadeColetiva() {
        assertFalse(instance.validaDtAtividadeColetiva());

    }

    /**
     * Test of validaNumParticipantesProgramados, FichaAtividadeColetiva
     */
    @Test
    public void testValidaNumParticipantesProgramados() {
        int t1 = 999;
        int t2 = 1000;

        instance.setNumParticipantesProgramados(t1);
        assertTrue(instance.validaNumParticipantesProgramados());

        instance.setNumParticipantesProgramados(t2);
        assertFalse(instance.validaNumParticipantesProgramados());

    }

    /**
     * Test of validaLocalAtividade, FichaAtividadeColetiva
     */
    @Test
    public void testValidaLocalAtividade() {
        String text1 = "Texto que serve de texte numero 1";
        String text2 = "Lorem ipsum dolor sit amet, massa sed a turpis. Duis accusantium a ac lectus at cursus. Ligula volutpat velit eget orci a lectus. Velit sit luctus pellentesque id, fringilla mattis mattis lobortis, nec in. Maecenas posuere nullam nullam est. Varius at ipsum. Litora mattis tellus eros, dui dignissim felis eros dictum eros arcu, tortor condimentum, mauris mauris enim consequat. Ligula aliquam consectetuer senectus eget, morbi suscipit, fermentum culpa sagittis orci, lacus convallis massa dui suscipit. Sodales non tincidunt et aliquet ipsum in. Adipiscing laoreet consectetuer, at pharetra curabitur quisque. Placerat amet vestibulum felis felis, sit commodo urna ut per nulla vulputate, torquent eu nunc. Ante diam tortor, elementum ut, dapibus non odio iaculis.";

        instance.setLocalAtividade(text1);
        assertTrue(instance.validaLocalAtividade());

        instance.setLocalAtividade(text2);
        assertFalse(instance.validaLocalAtividade());
    }

    /**
     * Test of validaHoraFim, FichaAtividadeColetiva
     */
    @Test
    public void testValidaHoraFim() {
        instance.setHoraInicio(2);
        instance.setHoraFim(3);

        assertTrue(instance.validaHoraFim());

        instance.setHoraInicio(3);
        instance.setHoraFim(2);

        assertFalse(instance.validaHoraFim());
    }

    /**
     * Test of validaHoraFim, FichaAtividadeColetiva
     */
    @Test
    public void testValidaInep() {
        instance.setInep(100000000);
        assertFalse(instance.validaInep());
    }

    /**
     * Test of validaResponsavelCns, FichaAtividadeColetiva
     */
    @Test
    public void testValidaResponsavelCns() {
        assertFalse(instance.validaResponsavelCns());
    }

    /**
     * Test of validaResponsavelCnesUnidade, FichaAtividadeColetiva
     */
    @Test
    public void testValidaResponsavelCnesUnidade() {
        instance.setResponsavelCnesUnidade("1234567");
        assertTrue(instance.validaResponsavelCnesUnidade());

        instance.setResponsavelCnesUnidade("12345678");
        assertFalse(instance.validaResponsavelCnesUnidade());
    }

    /**
     * Test of validaResponsavelNumIne, FichaAtividadeColetiva
     */
    @Test
    public void testValidaResponsavelNumIne() {
        instance.setResponsavelNumIne("1234567890");
        assertTrue(instance.validaResponsavelNumIne());

        instance.setResponsavelNumIne("12345678901");
        assertFalse(instance.validaResponsavelNumIne());
    }

    /**
     * Test of validaNumParticipantes, FichaAtividadeColetiva
     */
    @Test
    public void testValidaNumParticipantes() {
        int t1 = 999;
        int t2 = 1000;

        instance.setNumParticipantes(t1);
        assertTrue(instance.validaNumParticipantes());

        instance.setNumParticipantes(t2);
        assertFalse(instance.validaNumParticipantes());

    }

    /**
     * Test of NumAvaliacoesAlteradas, FichaAtividadeColetiva
     */
    @Test
    public void testValidaNumAvaliacoesAlteradas() {
        int t1 = 999;
        int t2 = 1000;

        instance.setNumAvaliacoesAlteradas(t1);
        assertTrue(instance.validaNumAvaliacoesAlteradas());

        instance.setNumAvaliacoesAlteradas(t2);
        assertFalse(instance.validaNumAvaliacoesAlteradas());

    }

    /**
     * Test of validaProfssionais, FichaAtividadeColetiva
     */
    @Test
    public void testValidaProfssionais() {
        assertFalse(instance.validaProfssionais());
    }

    /**
     * Test of validaAtividadeTipo, FichaAtividadeColetiva
     */
    @Test
    public void testValidaAtividadeTipo() {
        instance.setAtividadeTipo(2);
        assertTrue(instance.validaAtividadeTipo());

        instance.setAtividadeTipo(8);
        assertFalse(instance.validaAtividadeTipo());

    }

    /**
     * Test of temasParaReuniao, FichaAtividadeColetiva
     */
    @Test
    public void testTemasParaReuniao() {
        instance.setAtividadeTipo(3);
        assertFalse(instance.validaTemasParaReuniao());

        instance.setAtividadeTipo(4);
        assertTrue(instance.validaTemasParaReuniao());
    }

    /**
     * Test of ValidaPublicoAlvo, FichaAtividadeColetiva
     */
    @Test
    public void testValidaPublicoAlvo() {
        instance.setAtividadeTipo(4);
        assertFalse(instance.validaPublicoAlvo());

        instance.setAtividadeTipo(3);
        assertTrue(instance.validaPublicoAlvo());
    }

    /**
     * Test of ValidaPraticasTemasParaSaude, FichaAtividadeColetiva
     */
    @Test
    public void testValidaPraticasTemasParaSaude() {
        instance.setAtividadeTipo(4);
        assertFalse(instance.validaPraticasTemasParaSaude());

        instance.setAtividadeTipo(3);
        assertTrue(instance.validaPraticasTemasParaSaude());
    }

    /**
     * Valida Código IBGE para entradas positivas
     */
    @Test
    public void testValidCodigoIBGE() {
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
    public void testInvalidCodigoIBGE() {
        EnderecoLocalPermanencia obj = new EnderecoLocalPermanencia();
        assertFalse(obj.validateCodigoIbgeMunicipio());
        obj.setCodigoIbgeMunicipio("12345678");
        assertFalse(obj.validateCodigoIbgeMunicipio());
        obj.setCodigoIbgeMunicipio("123456");
        assertFalse(obj.validateCodigoIbgeMunicipio());
    }

    /**
     * Test of ValidaParticipantes, FichaAtividadeColetiva
     */
    @Test
    public void testValidaParticipantes() {
        List<IParticipanteRowItem> lista = new ArrayList();

        for (int i = 0; i < 33; i++) {
            lista.add(new ParticipanteRowItem(new ParticipanteRowItemThrift()));
        }
        instance.setParticipantes(lista);
        assertTrue(instance.validaParticipantes());

        for (int i = 0; i < 34; i++) {
            lista.add(new ParticipanteRowItem(new ParticipanteRowItemThrift()));
        }
        instance.setParticipantes(lista);
        assertFalse(instance.validaParticipantes());

    }

}
