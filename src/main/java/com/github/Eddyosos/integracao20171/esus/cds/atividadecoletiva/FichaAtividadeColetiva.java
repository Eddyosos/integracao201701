package com.github.Eddyosos.integracao20171.esus.cds.atividadecoletiva;

import br.gov.saude.esus.cds.transport.generated.thrift.atividadecoletiva.FichaAtividadeColetivaThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.atividadecoletiva.ParticipanteRowItemThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.atividadecoletiva.ProfissionalCboRowItemThrift;
import com.github.Eddyosos.integracao20171.compactor.SerializadorThrift;
import com.github.Eddyosos.integracao20171.esus.transport.DadoTransporte;
import com.github.Eddyosos.integracao20171.utils.IDS.CNS;
import com.github.eddyosos.e_sus_ab_factory.cds.atividadecoletiva.IFichaAtividadeColetiva;
import com.github.eddyosos.e_sus_ab_factory.cds.atividadecoletiva.IParticipanteRowItem;
import com.github.eddyosos.e_sus_ab_factory.cds.atividadecoletiva.IProfissionalCboRowItem;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Instant;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FichaAtividadeColetiva implements IFichaAtividadeColetiva {

    private FichaAtividadeColetivaThrift instancia = new FichaAtividadeColetivaThrift();
    private long TIPO_DADO_SERIALIZADO_FICHA_PROCEDIMENTO = 6;
    private final static String EXTENSAO_EXPORT = ".esus13";
    private DadoTransporte dadoTransporteThrift;

    public FichaAtividadeColetiva(FichaAtividadeColetivaThrift fichaAtividadeColetiva) {
        this.instancia = fichaAtividadeColetiva;
    }

    /**
     * Devolve um uuidFicha
     *
     * @return uuidFicha String
     */
    @Override
    public String getUuidFicha() {
        return instancia.getUuidFicha();
    }

    /**
     * Altera o valor de uuidFicha
     *
     * @param uuidFicha String
     */
    @Override
    public void setUuidFicha(String uuidFicha) {
        instancia.setUuidFicha(uuidFicha);
    }

    /**
     * Devolve um dtAtividadeColetiva
     *
     * @return dtAtividadeColetiva long
     */
    @Override
    public long getDtAtividadeColetiva() {
        return instancia.getDtAtividadeColetiva();
    }

    /**
     * Altera o valor de dtAtividadeColetiva
     *
     * @param dtAtividadeColetiva long
     */
    @Override
    public void setDtAtividadeColetiva(long dtAtividadeColetiva) {
        instancia.setDtAtividadeColetiva(dtAtividadeColetiva);
    }

    /**
     * Devolve um numParticipantesProgramados
     *
     * @return numParticipantesProgramados int
     */

    @Override
    public int getNumParticipantesProgramados() {
        return instancia.getNumParticipantesProgramados();
    }

    /**
     * Altera o valor de NumParticipantesProgramados
     *
     * @param numParticipantesProgramados int
     */

    @Override
    public void setNumParticipantesProgramados(int numParticipantesProgramados) {
        instancia.setNumParticipantesProgramados(numParticipantesProgramados);
    }

    /**
     * Devolve um LocalAtividade
     *
     * @return LocalAtividade String
     */

    @Override
    public String getLocalAtividade() {
        return instancia.getLocalAtividade();
    }

    /**
     * Altera o valor de LocalAtividade
     *
     * @param localAtividade String
     */

    @Override
    public void setLocalAtividade(String localAtividade) {
        instancia.setLocalAtividade(localAtividade);
    }

    /**
     * Devolve um HoraInicio
     *
     * @return HoraInicio long
     */

    @Override
    public long getHoraInicio() {
        return instancia.getHoraInicio();
    }

    /**
     * Altera o valor de HoraInicio
     *
     * @param horaInicio long
     */

    @Override
    public void setHoraInicio(long horaInicio) {
        instancia.setHoraInicio(horaInicio);
    }

    /**
     * Devolve um HoraFim
     *
     * @return HoraFim long
     */

    @Override
    public long getHoraFim() {
        return instancia.getHoraFim();
    }

    /**
     * Altera o valor de HoraFim
     *
     * @param horaFim long
     */
    @Override
    public void setHoraFim(long horaFim) {
        instancia.setHoraFim(horaFim);
    }

    /**
     * Devolve um Inep
     *
     * @return Inep long
     */

    @Override
    public long getInep() {
        return instancia.getInep();
    }

    /**
     * Altera o valor de Inep
     *
     * @param inep long
     */
    @Override
    public void setInep(long inep) {
        instancia.setInep(inep);
    }

    /**
     * Devolve um responsavelCns
     *
     * @return responsavelCns String
     */
    @Override
    public String getResponsavelCns() {
        return instancia.getResponsavelCns();
    }

    /**
     * Altera o valor de responsavelCns
     *
     * @param responsavelCns String
     */

    @Override
    public void setResponsavelCns(String responsavelCns) {
        instancia.setResponsavelCns(responsavelCns);
    }

    /**
     * Devolve um responsavelCnesUnidade
     *
     * @return responsavelCnesUnidade String
     */

    @Override
    public String getResponsavelCnesUnidade() {
        return instancia.getResponsavelCnesUnidade();
    }

    /**
     * Altera o valor de responsavelCnesUnidade
     *
     * @param responsavelCnesUnidade String
     */

    @Override
    public void setResponsavelCnesUnidade(String responsavelCnesUnidade) {
        instancia.setResponsavelCnesUnidade(responsavelCnesUnidade);
    }

    /**
     * Devolve um responsavelNumIne
     *
     * @return responsavelNumIne String
     */

    @Override
    public String getResponsavelNumIne() {
        return instancia.getResponsavelNumIne();
    }

    /**
     * Altera o valor de responsavelNumIne
     *
     * @param responsavelNumIne String
     */

    @Override
    public void setResponsavelNumIne(String responsavelNumIne) {
        instancia.setResponsavelNumIne(responsavelNumIne);
    }

    /**
     * Devolve um numParticipantes
     *
     * @return numParticipantes int
     */

    @Override
    public int getNumParticipantes() {
        return instancia.getNumParticipantes();
    }

    /**
     * Altera o valor de numParticipantes
     *
     * @param numParticipantes int
     */

    @Override
    public void setNumParticipantes(int numParticipantes) {
        instancia.setNumParticipantes(numParticipantes);
    }

    /**
     * Devolve um numAvaliacoesAlteradas
     *
     * @return numAvaliacoesAlteradas int
     */

    @Override
    public int getNumAvaliacoesAlteradas() {
        return instancia.getNumAvaliacoesAlteradas();
    }

    /**
     * Altera o valor de numAvaliacoesAlteradas
     *
     * @param numAvaliacoesAlteradas int
     */

    @Override
    public void setNumAvaliacoesAlteradas(int numAvaliacoesAlteradas) {
        instancia.setNumAvaliacoesAlteradas(numAvaliacoesAlteradas);
    }

    /**
     * Devolve o tamanho de profssionais
     *
     * @return profssionaisSize int
     */

    @Override
    public int getProfissionaisSize() {
        return instancia.getProfissionaisSize();
    }

    /**
     * Devolve o iterator de profissionais
     *
     * @return listaProffsionalCboRowItem.iterator Iterator
     */

    @Override
    public Iterator<IProfissionalCboRowItem> getProfissionaisIterator() {
        List<IProfissionalCboRowItem> listaProfissionalCboRowItem = new LinkedList<>();

        instancia.getProfissionaisIterator().forEachRemaining((elemento) -> {
            listaProfissionalCboRowItem.add(new ProfissionalCboRowItem(elemento));
        });

        return listaProfissionalCboRowItem.iterator();
    }

    /**
     * Adiciona um elemento à lista profissionais
     *
     * @param elem
     */

    @Override
    public void addToProfissionais(IProfissionalCboRowItem elem) {
        instancia.addToProfissionais(elem.getInstance());
    }

    /**
     * Devolve uma lista de profisionais
     *
     * @return ListaProfssionalCboRowItem list
     */

    @Override
    public List<IProfissionalCboRowItem> getProfissionais() {
        List<IProfissionalCboRowItem> listaProfissionalCboRowItem = new LinkedList<>();

        instancia.getProfissionais().forEach((elemento) -> {
            listaProfissionalCboRowItem.add(new ProfissionalCboRowItem(elemento));
        });

        return listaProfissionalCboRowItem;
    }

    /**
     * Altera o valor da lista profssionais
     *
     * @param profissionais List
     */

    @Override
    public void setProfissionais(List<IProfissionalCboRowItem> profissionais) {
        List<ProfissionalCboRowItemThrift> listaProfissionalCboRowItemThrift = new LinkedList<>();

        profissionais.forEach((elemento) -> {
            listaProfissionalCboRowItemThrift.add(elemento.getInstance());
        });

        instancia.setProfissionais(listaProfissionalCboRowItemThrift);
    }

    /**
     * Devolve um AtividadeTipo
     *
     * @return AtividadeTipo long
     */

    @Override
    public long getAtividadeTipo() {
        return instancia.getAtividadeTipo();
    }

    /**
     * Altera o valor de atividadeTipo
     *
     * @param atividadeTipo String
     */

    @Override
    public void setAtividadeTipo(long atividadeTipo) {
        instancia.setAtividadeTipo(atividadeTipo);
    }

    /**
     * Devolve um tamanho para temasParaReuniao
     *
     * @return temasParaReuniaoSize int
     */

    @Override
    public int getTemasParaReuniaoSize() {
        return instancia.getTemasParaReuniaoSize();
    }

    /**
     * Devolve um iterator para TemasParaReuniao
     *
     * @return temasParaReuniaoIterator
     */

    @Override
    public Iterator<Long> getTemasParaReuniaoIterator() {
        return instancia.getTemasParaReuniaoIterator();
    }

    /**
     * Adiciona elementos para temasParaReuniao
     *
     * @param elem long
     */

    @Override
    public void addToTemasParaReuniao(long elem) {
        instancia.addToTemasParaReuniao(elem);
    }

    /**
     * Devolve uma lista de temasParaReuniao
     *
     * @return temasParaReuniao list
     */

    @Override
    public List<Long> getTemasParaReuniao() {
        return instancia.getTemasParaReuniao();
    }

    /**
     * Altera o valor da lista de temasParaReuniao
     *
     * @param temasParaReuniao list
     */

    @Override
    public void setTemasParaReuniao(List<Long> temasParaReuniao) {
        instancia.setTemasParaReuniao(temasParaReuniao);
    }

    /**
     * Devolve o tamanho de publicoAlvoS
     *
     * @return publicoAlvoSize int
     */

    @Override
    public int getPublicoAlvoSize() {
        return instancia.getPublicoAlvoSize();
    }

    /**
     *devolve um iterator para publicoAlvo
     * @return publicoAlvoIterator
     */
    @Override
    public Iterator<Long> getPublicoAlvoIterator() {
        return instancia.getPublicoAlvoIterator();
    }
    /**
     * Adiciona um elemento à lista publicoAlvo
     * @param elem long
     */

    @Override
    public void addToPublicoAlvo(long elem) {
        instancia.addToPublicoAlvo(elem);
    }
    /**
     * Retor uma lista publicoAlvo
     * @return publicoAlvo list
     */

    @Override
    public List<Long> getPublicoAlvo() {
        return instancia.getPublicoAlvo();
    }
    /**
     * Altera o valor da lista publicoAlvo
     * @param publicoAlvo List
     */

    @Override
    public void setPublicoAlvo(List<Long> publicoAlvo) {
        instancia.setPublicoAlvo(publicoAlvo);
    }
    /**
     * devolve o tamanho de praticaTemasParaSaude
     * @return praticaTemasParaSaudeSize
     */

    @Override
    public int getPraticasTemasParaSaudeSize() {
        return instancia.getPraticasTemasParaSaudeSize();
    }
    /**
     * Devolve um praticasTemasParaSaude iterator
     * @return praticasTemasParaSaudeIterator Iterator
     */
    @Override
    public Iterator<Long> getPraticasTemasParaSaudeIterator() {
        return instancia.getPraticasTemasParaSaudeIterator();
    }
    /**
     * adiciona um elemento à lista praticasTemasParaSaude
     * @param elem long
     */

    @Override
    public void addToPraticasTemasParaSaude(long elem) {
        instancia.addToPraticasTemasParaSaude(elem);
    }
    /**
     * retorna uma lista de praticasTemasParaSaude
     * @return praticasTemasParaSaude List
     */

    @Override
    public List<Long> getPraticasTemasParaSaude() {
        return instancia.getPraticasTemasParaSaude();
    }
    /**
     * Altera o valor da lista de praticasTemasParaSaude
     * @param praticasTemasParaSaude List
     */

    @Override
    public void setPraticasTemasParaSaude(List<Long> praticasTemasParaSaude) {
        instancia.setPraticasTemasParaSaude(praticasTemasParaSaude);
    }
    /**
     * retorna o tamanho de participantes
     * @return participantesSize
     */

    @Override
    public int getParticipantesSize() {
        return instancia.getParticipantesSize();
    }
    /**
     * Devolve o participantes iterator
     * @return participantesIterator
     */

    @Override
    public Iterator<IParticipanteRowItem> getParticipantesIterator() {
        List<IParticipanteRowItem> listaParticipanteRowItem = new LinkedList<>();

        instancia.getParticipantesIterator().forEachRemaining((elemento) -> {
            listaParticipanteRowItem.add(new ParticipanteRowItem(elemento));
        });

        return listaParticipanteRowItem.iterator();
    }
    /**
     * adiciona elementos à lista de participantes
     * @param elem ParticipanteRowItem
     */

    @Override
    public void addToParticipantes(IParticipanteRowItem elem) {
        instancia.addToParticipantes(elem.getInstance());
    }
    /**
     * devolve uma lista de participantes
     * @return participantes List
     */

    @Override
    public List<IParticipanteRowItem> getParticipantes() {
        List<IParticipanteRowItem> listaParticipanteRowItem = new LinkedList<>();

        instancia.getParticipantes().forEach((elemento) -> {
            listaParticipanteRowItem.add(new ParticipanteRowItem(elemento));
        });

        return listaParticipanteRowItem;
    }
    /**
     * Altera o valor da lista de participantes
     * @param participantes List
     */

    @Override
    public void setParticipantes(List<IParticipanteRowItem> participantes) {
        List<ParticipanteRowItemThrift> listaParticipanteRowItemThrift = new LinkedList<>();
        participantes.forEach((elemento) -> {
            listaParticipanteRowItemThrift.add(elemento.getInstance());
        });
        instancia.setParticipantes(listaParticipanteRowItemThrift);
    }
    /**
     * Devolve um tbCdsOrigem
     * @return tbCdsOrigem int
     */

    @Override
    public int getTbCdsOrigem() {
        return instancia.getTbCdsOrigem();
    }
    /**
     * Altera o valor de tbCdsOrigem
     * @param tbCdsOrigem int
     */

    @Override
    public void setTbCdsOrigem(int tbCdsOrigem) {
        instancia.setTbCdsOrigem(tbCdsOrigem);
    }
    /**
     * Devolve o valor de codigoIbgeMunicio
     * @return codigoIbgeMunicio Strng
     */

    @Override
    public String getCodigoIbgeMunicipio() {
        return instancia.getCodigoIbgeMunicipio();
    }
    /**
     * Altera o valor de codigoIbgeMunicio
     * @param codigoIbgeMunicipio String
     */

    @Override
    public void setCodigoIbgeMunicipio(String codigoIbgeMunicipio) {
        instancia.setCodigoIbgeMunicipio(codigoIbgeMunicipio);
    }
    /**
     * Devolve uma instancia de FichaAtividadeColetivaThrift
     * @return 
     */

    protected FichaAtividadeColetivaThrift getInstance() {
        return instancia;
    }

    /**
     * Valida o field uuidFicha
     *
     * @return True caso o valor esteja setado e o seu tamanho seja maior que 36
     * e menor que 44. False caso o valor esteja setado e seu tamanho for menor
     * que 36 e maior que 44.False caso nenhum valor esteja setado
     */
    @Override
    public boolean validaUuidFicha() {
        if (getInstance().isSetUuidFicha()) {
            return getInstance().getUuidFicha().length() >= 36 && getInstance().getUuidFicha().length() <= 44;
        } else {
            return false;
        }
    }

    /**
     * Valida DataAtiviadeColetiva
     *
     * @return False caso o valor nao esteja setado. False caso o valor esteja
     * setado e seja maior que a dataAtual. True caso o valor esteja setado e
     * seja menor ou igual que dataAtual
     */
    @Override
    public boolean validaDtAtividadeColetiva() {

        if (!instancia.isSetDtAtividadeColetiva()) {
            return false;
        } else {
            long dataAtividadeColetiva = instancia.getDtAtividadeColetiva();
            long dataAtual = Instant.now().getEpochSecond();
            return dataAtividadeColetiva <= dataAtual;
        }
    }

    /**
     * Valida o field numParticipantesProgramados
     *
     * @return True caso o valor esteja setado e esteja entre os intervalos 0 -
     * 999. True caso o valor nao esteja setado false case o valor esteja setado
     * e fora do intervalo 0 - 999
     */
    @Override
    public boolean validaNumParticipantesProgramados() {
        if (instancia.isSetNumParticipantesProgramados()) {
            return getInstance().getNumParticipantesProgramados() >= 0 && getInstance().getNumParticipantesProgramados() <= 999;
        } else {
            return true;
        }
    }

    /**
     * Valida o field localAtividade
     *
     * @return True caso o valor esteja setado e a string seja de tamanho de até
     * 250 caractéres. True caso nenhum valor seja setado. False caso a string
     * seja maior que 250 caractéres
     */
    @Override
    public boolean validaLocalAtividade() {
        if (instancia.isSetLocalAtividade()) {
            return getInstance().getLocalAtividade().length() >= 0 && getInstance().getLocalAtividade().length() <= 250;
        } else {
            return true;
        }
    }

    /**
     * Valida o field horaFim
     *
     * @return True caso o valor esteja setado e seja maior que o valor do field
     * horaInicio. True caso o valor nao esteja setado. False caso o valor
     * esteja setado e seja menor ou igual ao valor do field horaInicio
     */
    @Override
    public boolean validaHoraFim() {
        if (instancia.isSetHoraFim()) {
            return getInstance().getHoraFim() > getInstance().getHoraInicio();
        } else {
            return true;
        }
    }

    /**
     * Valida o field INEP
     *
     * @return True caso o valor esteja setado e seja menor que 100000000. True
     * caso o valor nao esteja setado. False caso o valor esteja setado e seja
     * igual ou maior que 100000000
     */
    @Override
    public boolean validaInep() {
        if (getInstance().isSetInep()) {
            return getInstance().getInep() < 100000000;
        } else {
            return true;
        }
    }

    /**
     * Valida o field responsavelCns
     *
     * @return False - Caso o Field não esteja setado. True - caso o numero
     * inicial seja 1 ou 2 ou 7 ou 8 ou 9 e atenda aos padrões do cartao SUS
     * False - caso o número esteja setado e nao atenda aos padrões do cartão
     * SUS.
     */
    @Override
    public boolean validaResponsavelCns() {

        String cns = getInstance().getResponsavelCns();
        return CNS.validateCNS(cns);

    }

    /**
     * Valida o field ResponsavelCnesUnidade
     *
     * @return True caso o valor esteja setado e seu tamanho seja de 7
     * caracteres. False caso o valor esteja setado e seja diferente de 7
     * caracteres. False caso o valor nao esteja setado.
     */
    @Override
    public boolean validaResponsavelCnesUnidade() {
        if (getInstance().isSetResponsavelCnesUnidade()) {
            return getInstance().getResponsavelCnesUnidade().length() == 7;
        } else {
            return false;
        }
    }

    /**
     * Valida o field ResponsavelNumIne
     *
     * @return True caso o valor esteja setado e seu tamanho seja de 10
     * caracteres. False caso o valor esteja setado e seja diferente de 10
     * caracteres. True caso o valor nao esteja setado.
     */
    @Override
    public boolean validaResponsavelNumIne() {
        if (getInstance().isSetResponsavelNumIne()) {
            return getInstance().getResponsavelNumIne().length() == 10;
        } else {
            return true;
        }
    }

    /**
     * Valida o field numParticipantess
     *
     * @return True caso o valor esteja setado e esteja entre os intervalos 0 -
     * 999. True caso o valor nao esteja setado. False case o valor esteja
     * setado e fora do intervalo 0 - 999
     */
    @Override
    public boolean validaNumParticipantes() {
        if (getInstance().isSetNumParticipantes()) {
            return getInstance().getNumParticipantes() >= 0 && getInstance().getNumParticipantes() <= 999;
        } else {
            return true;
        }
    }

    /**
     * Valida o field NumAvaliacoesAlteradas
     *
     * @return True caso o valor esteja setado e esteja entre os intervalos 0 -
     * 999. True caso o valor nao esteja setado. False case o valor esteja
     * setado e fora do intervalo 0 - 999
     */
    @Override
    public boolean validaNumAvaliacoesAlteradas() {
        if (getInstance().isSetNumAvaliacoesAlteradas()) {
            return getInstance().getNumAvaliacoesAlteradas() >= 0 && getInstance().getNumAvaliacoesAlteradas() <= 999;
        } else {
            return true;
        }
    }

    /**
     * valida o field Profissionais
     *
     * @return True caso o valor esteja setado e esteja entre os valores 1 - 99
     * False caso o valor esteja setado e esteja fora dos valores 1 - 99. False
     * caso o valor nao esteja setado
     */
    @Override
    public boolean validaProfssionais() {
        if (getInstance().isSetProfissionais()) {
            return getInstance().getProfissionais().size() >= 1 && getInstance().getProfissionais().size() <= 99;
        } else {
            return false;
        }

    }

    /**
     * valida o field atividadeTipo
     *
     * @return True caso o valor esteja setado e esteja entre os valor de 1 a 7
     * False caso o valor esteja setado e esteja fora os valores de 1 a 7. False
     * caso o valor nao esteja setado
     */
    @Override
    public boolean validaAtividadeTipo() {
        if (getInstance().isSetAtividadeTipo()) {
            return getInstance().getAtividadeTipo() >= 1 && getInstance().getAtividadeTipo() <= 7;
        } else {
            return false;
        }
    }

    /**
     * Valida o field TemasParaReuniao
     *
     * @return True caso o valor de AtividadeTipo seja de 1 a 3 e o valor de
     * temaParaReuniao esteja setado e seja de 1 a 7. True caso o valor de
     * atividadeTipo seja diferente de 1 a 3 e o valor de temaParaReuniao nao
     * esteja setado. False caso o valor de AtividadeTipo seja de 1 a 3 e o
     * valor de temaParaReuniao esteja setado e seja diferente de 1 a 7. False
     * caso o valor de atividadeTipo seja diferente de 1 a 3 e o valor de
     * temaParaReuniao esteja setado
     */
    @Override
    public boolean validaTemasParaReuniao() {
        if (getInstance().getAtividadeTipo() >= 1 && getInstance().getAtividadeTipo() <= 3) {
            if (getInstance().isSetTemasParaReuniao()) {
                for (int i = 0; i < getInstance().getTemasParaReuniaoSize(); i++) {
                    if (getInstance().getTemasParaReuniao().get(i) < 1 || getInstance().getTemasParaReuniao().get(i) > 7) {
                        return false;
                    }
                }
                return true;
            } else {
                return false;
            }
        } else {
            return !getInstance().isSetTemasParaReuniao();
        }
    }

    /**
     * Valida o field ValidaPublicoAlvo
     *
     * @return True caso o valor de AtividadeTipo seja de 4 a 7 e o valor de
     * validaPublicoAlvo esteja setado e seja de 1 a 18. True caso o valor de
     * atividadeTipo seja diferente de 4 a 7 e o valor de validaPublicoAlvo nao
     * esteja setado. False caso o valor de AtividadeTipo seja de 4 a 7 e o
     * valor de validaPublicoAlvo esteja setado e seja diferente de 1 a 18.
     * False caso o valor de atividadeTipo seja diferente de 4 a 7 e o valor de
     * validaPublicoAlvo esteja setado
     */
    @Override
    public boolean validaPublicoAlvo() {
        if (getInstance().getAtividadeTipo() >= 4 && getInstance().getAtividadeTipo() <= 7) {
            if (getInstance().isSetPublicoAlvo()) {
                for (int i = 0; i < getInstance().getPublicoAlvoSize(); i++) {
                    if (getInstance().getPublicoAlvo().get(i) < 1 || getInstance().getPublicoAlvo().get(i) > 18) {
                        return false;
                    }
                }
                return true;
            } else {
                return false;
            }
        } else {
            return !getInstance().isSetPublicoAlvo();
        }

    }

    /**
     * Valida o field validaPraticasTemasParaSaude
     *
     * @return True caso o valor de AtividadeTipo seja de 4 a 7 e o valor de
     * PraticasTemasParaSaude esteja setado e seja de 1 a 28. True caso o valor
     * de atividadeTipo seja diferente de 4 a 7 e o valor de
     * PraticasTemasParaSaude nao esteja setado. False caso o valor de
     * AtividadeTipo seja de 4 a 7 e o valor de PraticasTemasParaSaude esteja
     * setado e seja diferente de 1 a 28. False caso o valor de atividadeTipo
     * seja diferente de 4 a 7 e o valor de PraticasTemasParaSaude esteja setado
     */
    @Override
    public boolean validaPraticasTemasParaSaude() {
        if (getInstance().getAtividadeTipo() >= 4 && getInstance().getAtividadeTipo() <= 7) {
            if (getInstance().isSetPraticasTemasParaSaude()) {
                for (int i = 0; i < getInstance().getPraticasTemasParaSaudeSize(); i++) {
                    if (getInstance().getPraticasTemasParaSaude().get(i) < 1 || getInstance().getPraticasTemasParaSaude().get(i) > 28) {
                        return false;
                    }
                }
                return true;
            } else {
                return false;
            }
        } else {
            return !getInstance().isSetPraticasTemasParaSaude();
        }

    }

    /**
     * Valida o valor do fiel Participantes
     *
     * @return True caso o valor esteja setado e esteja os valores de 0 a 33.
     * True caso o valor nao esteja setado. False caso o valor esteja setado e
     * esteja fora dos valores de 0 a 33.
     */
    @Override
    public boolean validaParticipantes() {
        if (getInstance().isSetParticipantes()) {
            return getInstance().getParticipantes().size() >= 0 && getInstance().getParticipantes().size() <= 33;
        } else {
            return false;
        }

    }

    /**
     * Valida Código IBGE do município. Para ser válido, a propriedade deve ter
     * sido atribuida préviamente e deve obedecer ao seguinte regex: "\A\d{7}\z"
     *
     * @return true se válido false se inválido
     */
    @Override
    public boolean validaCodigoIbgeMunicipio() {
        String var = instancia.getCodigoIbgeMunicipio();
        return var != null
                && var.matches("\\A\\d{7}\\z");
    }

    /**
     * Valida todos os fields
     *
     * @return True caso todos estejam validos False caso algum deles esteja
     * invalido.
     */
    @Override
    public boolean validates() {
        return this.validaAtividadeTipo() && 
                this.validaDtAtividadeColetiva() && 
                this.validaHoraFim() && this.validaInep() && 
                this.validaLocalAtividade() && 
                this.validaNumAvaliacoesAlteradas() && 
                this.validaNumParticipantes() && 
                this.validaNumParticipantesProgramados() && 
                this.validaPraticasTemasParaSaude() && 
                this.validaProfssionais() && 
                this.validaPublicoAlvo() && 
                this.validaResponsavelCnesUnidade() && 
                this.validaResponsavelCns() && 
                this.validaResponsavelNumIne() && 
                this.validaTemasParaReuniao() && 
                this.validaUuidFicha() && 
                this.validaCodigoIbgeMunicipio() && 
                this.validaParticipantes();
    }
    public void setDadoTransporte(DadoTransporte originadora){
        this.dadoTransporteThrift = originadora;
    }
    public DadoTransporte getDadoTransporte(){
        return this.dadoTransporteThrift;
    }

    public void zipGenerate(){
        if(!this.validates() && this.dadoTransporteThrift != null){
            return;
        }

        byte[] fichaSerializada = SerializadorThrift.serializar(this.instancia);
        dadoTransporteThrift.setTipoDadoSerializado(TIPO_DADO_SERIALIZADO_FICHA_PROCEDIMENTO);
        dadoTransporteThrift.setDadoSerializado(fichaSerializada);

        try {
            File zipFile = new File(System.getProperty("user.home") + "/fichaProcedimento.zip");
            ZipOutputStream outputStream = new ZipOutputStream(new FileOutputStream(zipFile));
            String entryName = dadoTransporteThrift.getUuidDadoSerializado() + EXTENSAO_EXPORT;
            outputStream.putNextEntry(new ZipEntry(entryName));
            byte[] dadoTransporteSerializado = SerializadorThrift.serializar(dadoTransporteThrift.getInstance());
            outputStream.write(dadoTransporteSerializado);

            outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

}
