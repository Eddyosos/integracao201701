package com.github.Eddyosos.integracao20171.esus.cds.atividadecoletiva;

import br.gov.saude.esus.cds.transport.generated.thrift.atividadecoletiva.FichaAtividadeColetivaThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.atividadecoletiva.ParticipanteRowItemThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.atividadecoletiva.ProfissionalCboRowItemThrift;
import java.time.Instant;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FichaAtividadeColetiva {

    FichaAtividadeColetivaThrift instance = new FichaAtividadeColetivaThrift();

    protected FichaAtividadeColetiva(FichaAtividadeColetivaThrift fichaAtividadeColetiva) {
        this.instance = fichaAtividadeColetiva;
    }

    public String getUuidFicha() {
        return instance.getUuidFicha();
    }

    public void setUuidFicha(String uuidFicha) {
        instance.setUuidFicha(uuidFicha);
    }

    public long getDtAtividadeColetiva() {
        return instance.getDtAtividadeColetiva();
    }

    public void setDtAtividadeColetiva(long dtAtividadeColetiva) {
        instance.setDtAtividadeColetiva(dtAtividadeColetiva);
    }

    public int getNumParticipantesProgramados() {
        return instance.getNumParticipantesProgramados();
    }

    public void setNumParticipantesProgramados(int numParticipantesProgramados) {
        instance.setNumParticipantesProgramados(numParticipantesProgramados);
    }

    public String getLocalAtividade() {
        return instance.getLocalAtividade();
    }

    public void setLocalAtividade(String localAtividade) {
        instance.setLocalAtividade(localAtividade);
    }

    public long getHoraInicio() {
        return instance.getHoraInicio();
    }

    public void setHoraInicio(long horaInicio) {
        instance.setHoraInicio(horaInicio);
    }

    public long getHoraFim() {
        return instance.getHoraFim();
    }

    public void setHoraFim(long horaFim) {
        instance.setHoraFim(horaFim);
    }

    public long getInep() {
        return instance.getInep();
    }

    public void setInep(long inep) {
        instance.setInep(inep);
    }

    public String getResponsavelCns() {
        return instance.getResponsavelCns();
    }

    public void setResponsavelCns(String responsavelCns) {
        instance.setResponsavelCns(responsavelCns);
    }

    public String getResponsavelCnesUnidade() {
        return instance.getResponsavelCnesUnidade();
    }

    public void setResponsavelCnesUnidade(String responsavelCnesUnidade) {
        instance.setResponsavelCnesUnidade(responsavelCnesUnidade);
    }

    public String getResponsavelNumIne() {
        return instance.getResponsavelNumIne();
    }

    public void setResponsavelNumIne(String responsavelNumIne) {
        instance.setResponsavelNumIne(responsavelNumIne);
    }

    public int getNumParticipantes() {
        return instance.getNumParticipantes();
    }

    public void setNumParticipantes(int numParticipantes) {
        instance.setNumParticipantes(numParticipantes);
    }

    public int getNumAvaliacoesAlteradas() {
        return instance.getNumAvaliacoesAlteradas();
    }

    public void setNumAvaliacoesAlteradas(int numAvaliacoesAlteradas) {
        instance.setNumAvaliacoesAlteradas(numAvaliacoesAlteradas);
    }

    public int getProfissionaisSize() {
        return instance.getProfissionaisSize();
    }

    public Iterator<ProfissionalCboRowItem> getProfissionaisIterator() {
        List<ProfissionalCboRowItem> listaProfissionalCboRowItem = new LinkedList<>();

        instance.getProfissionaisIterator().forEachRemaining((elemento) -> {
            listaProfissionalCboRowItem.add(new ProfissionalCboRowItem(elemento));
        });

        return listaProfissionalCboRowItem.iterator();
    }

    public void addToProfissionais(ProfissionalCboRowItem elem) {
        instance.addToProfissionais(elem.getInstance());
    }

    public List<ProfissionalCboRowItem> getProfissionais() {
        List<ProfissionalCboRowItem> listaProfissionalCboRowItem = new LinkedList<>();

        instance.getProfissionais().forEach((elemento) -> {
            listaProfissionalCboRowItem.add(new ProfissionalCboRowItem(elemento));
        });

        return listaProfissionalCboRowItem;
    }

    public void setProfissionais(List<ProfissionalCboRowItem> profissionais) {
        List<ProfissionalCboRowItemThrift> listaProfissionalCboRowItemThrift = new LinkedList<>();

        profissionais.forEach((elemento) -> {
            listaProfissionalCboRowItemThrift.add(elemento.getInstance());
        });

        instance.setProfissionais(listaProfissionalCboRowItemThrift);
    }

    public long getAtividadeTipo() {
        return instance.getAtividadeTipo();
    }

    public void setAtividadeTipo(long atividadeTipo) {
        instance.setAtividadeTipo(atividadeTipo);
    }

    public int getTemasParaReuniaoSize() {
        return instance.getTemasParaReuniaoSize();
    }

    public Iterator<Long> getTemasParaReuniaoIterator() {
        return instance.getTemasParaReuniaoIterator();
    }

    public void addToTemasParaReuniao(long elem) {
        instance.addToTemasParaReuniao(elem);
    }

    public List<Long> getTemasParaReuniao() {
        return instance.getTemasParaReuniao();
    }

    public void setTemasParaReuniao(List<Long> temasParaReuniao) {
        instance.setTemasParaReuniao(temasParaReuniao);
    }

    public int getPublicoAlvoSize() {
        return instance.getPublicoAlvoSize();
    }

    public Iterator<Long> getPublicoAlvoIterator() {
        return instance.getPublicoAlvoIterator();
    }

    public void addToPublicoAlvo(long elem) {
        instance.addToPublicoAlvo(elem);
    }

    public List<Long> getPublicoAlvo() {
        return instance.getPublicoAlvo();
    }

    public void setPublicoAlvo(List<Long> publicoAlvo) {
        instance.setPublicoAlvo(publicoAlvo);
    }

    public int getPraticasTemasParaSaudeSize() {
        return instance.getPraticasTemasParaSaudeSize();
    }

    public Iterator<Long> getPraticasTemasParaSaudeIterator() {
        return instance.getPraticasTemasParaSaudeIterator();
    }

    public void addToPraticasTemasParaSaude(long elem) {
        instance.addToPraticasTemasParaSaude(elem);
    }

    public List<Long> getPraticasTemasParaSaude() {
        return instance.getPraticasTemasParaSaude();
    }

    public void setPraticasTemasParaSaude(List<Long> praticasTemasParaSaude) {
        instance.setPraticasTemasParaSaude(praticasTemasParaSaude);
    }

    public int getParticipantesSize() {
        return instance.getParticipantesSize();
    }

    public Iterator<ParticipanteRowItem> getParticipantesIterator() {
        List<ParticipanteRowItem> listaParticipanteRowItem = new LinkedList<>();

        instance.getParticipantesIterator().forEachRemaining((elemento) -> {
            listaParticipanteRowItem.add(new ParticipanteRowItem(elemento));
        });

        return listaParticipanteRowItem.iterator();
    }

    public void addToParticipantes(ParticipanteRowItem elem) {
        instance.addToParticipantes(elem.getInstance());
    }

    public List<ParticipanteRowItem> getParticipantes() {
        List<ParticipanteRowItem> listaParticipanteRowItem = new LinkedList<>();

        instance.getParticipantes().forEach((elemento) -> {
            listaParticipanteRowItem.add(new ParticipanteRowItem(elemento));
        });

        return listaParticipanteRowItem;
    }

    public void setParticipantes(List<ParticipanteRowItem> participantes) {
        List<ParticipanteRowItemThrift> listaParticipanteRowItemThrift = new LinkedList<>();
        participantes.forEach((elemento) -> {
            listaParticipanteRowItemThrift.add(elemento.getInstance());
        });
        instance.setParticipantes(listaParticipanteRowItemThrift);
    }

    public int getTbCdsOrigem() {
        return instance.getTbCdsOrigem();
    }

    public void setTbCdsOrigem(int tbCdsOrigem) {
        instance.setTbCdsOrigem(tbCdsOrigem);
    }

    public String getCodigoIbgeMunicipio() {
        return instance.getCodigoIbgeMunicipio();
    }

    public void setCodigoIbgeMunicipio(String codigoIbgeMunicipio) {
        instance.setCodigoIbgeMunicipio(codigoIbgeMunicipio);
    }

    protected FichaAtividadeColetivaThrift getInstance() {
        return instance;
    }

    /**
     * Valida o field uuidFicha
     *
     * @return True caso o valor esteja setado e o seu tamanho seja maior que 36
     * e menor que 44. False caso o valor esteja setado e seu tamanho for menor
     * que 36 e maior que 44.False caso nenhum valor esteja setado
     */
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
    public boolean validaDtAtividadeColetiva() {

        if (!instance.isSetDtAtividadeColetiva()) {
            return false;
        } else {
            long dataAtividadeColetiva = instance.getDtAtividadeColetiva();
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
    public boolean validaNumParticipantesProgramados() {
        if (instance.isSetNumParticipantesProgramados()) {
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
    public boolean validaLocalAtividade() {
        if (instance.isSetLocalAtividade()) {
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
    public boolean validaHoraFim() {
        if (instance.isSetHoraFim()) {
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
    public boolean validaResponsavelCns() {

        String cns = getInstance().getResponsavelCns();
        if (getInstance().isSetResponsavelCns()) {
            if (cns.charAt(0) == '1' || cns.charAt(0) == '2') {

                if (cns.trim().length() != 15) {
                    return (false);
                }

                float soma;
                float resto, dv;
                String pis = "";
                String resultado = "";
                pis = cns.substring(0, 11);

                soma = ((Integer.parseInt(pis.substring(0, 1))) * 15)
                        + ((Integer.valueOf(pis.substring(1, 2)).intValue()) * 14)
                        + ((Integer.valueOf(pis.substring(2, 3)).intValue()) * 13)
                        + ((Integer.valueOf(pis.substring(3, 4)).intValue()) * 12)
                        + ((Integer.valueOf(pis.substring(4, 5)).intValue()) * 11)
                        + ((Integer.valueOf(pis.substring(5, 6)).intValue()) * 10)
                        + ((Integer.valueOf(pis.substring(6, 7)).intValue()) * 9)
                        + ((Integer.valueOf(pis.substring(7, 8)).intValue()) * 8)
                        + ((Integer.valueOf(pis.substring(8, 9)).intValue()) * 7)
                        + ((Integer.valueOf(pis.substring(9, 10)).intValue()) * 6)
                        + ((Integer.valueOf(pis.substring(10, 11)).intValue()) * 5);

                resto = soma % 11;
                dv = 11 - resto;

                if (dv == 11) {
                    dv = 0;
                }

                if (dv == 10) {
                    soma = ((Integer.valueOf(pis.substring(0, 1)).intValue()) * 15)
                            + ((Integer.valueOf(pis.substring(1, 2)).intValue()) * 14)
                            + ((Integer.valueOf(pis.substring(2, 3)).intValue()) * 13)
                            + ((Integer.valueOf(pis.substring(3, 4)).intValue()) * 12)
                            + ((Integer.valueOf(pis.substring(4, 5)).intValue()) * 11)
                            + ((Integer.valueOf(pis.substring(5, 6)).intValue()) * 10)
                            + ((Integer.valueOf(pis.substring(6, 7)).intValue()) * 9)
                            + ((Integer.valueOf(pis.substring(7, 8)).intValue()) * 8)
                            + ((Integer.valueOf(pis.substring(8, 9)).intValue()) * 7)
                            + ((Integer.valueOf(pis.substring(9, 10)).intValue()) * 6)
                            + ((Integer.valueOf(pis.substring(10, 11)).intValue()) * 5) + 2;

                    resto = soma % 11;
                    dv = 11 - resto;
                    resultado = pis + "001" + String.valueOf((int) dv);
                } else {
                    resultado = pis + "000" + String.valueOf((int) dv);
                }

                if (!cns.equals(resultado)) {
                    return (false);
                } else {
                    return (true);
                }
            } else if (cns.charAt(0) == '7' || cns.charAt(0) == '8' || cns.charAt(0) == '9') {
                if (cns.trim().length() != 15) {
                    return (false);
                }

                float dv;
                float resto, soma;

                soma = ((Integer.valueOf(cns.substring(0, 1)).intValue()) * 15)
                        + ((Integer.valueOf(cns.substring(1, 2)).intValue()) * 14)
                        + ((Integer.valueOf(cns.substring(2, 3)).intValue()) * 13)
                        + ((Integer.valueOf(cns.substring(3, 4)).intValue()) * 12)
                        + ((Integer.valueOf(cns.substring(4, 5)).intValue()) * 11)
                        + ((Integer.valueOf(cns.substring(5, 6)).intValue()) * 10)
                        + ((Integer.valueOf(cns.substring(6, 7)).intValue()) * 9)
                        + ((Integer.valueOf(cns.substring(7, 8)).intValue()) * 8)
                        + ((Integer.valueOf(cns.substring(8, 9)).intValue()) * 7)
                        + ((Integer.valueOf(cns.substring(9, 10)).intValue()) * 6)
                        + ((Integer.valueOf(cns.substring(10, 11)).intValue()) * 5)
                        + ((Integer.valueOf(cns.substring(11, 12)).intValue()) * 4)
                        + ((Integer.valueOf(cns.substring(12, 13)).intValue()) * 3)
                        + ((Integer.valueOf(cns.substring(13, 14)).intValue()) * 2)
                        + ((Integer.valueOf(cns.substring(14, 15)).intValue()) * 1);

                resto = soma % 11;

                if (resto != 0) {
                    return (false);
                } else {
                    return (true);
                }
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    /**
     * Valida o field ResponsavelCnesUnidade
     *
     * @return True caso o valor esteja setado e seu tamanho seja de 7
     * caracteres. False caso o valor esteja setado e seja diferente de 7
     * caracteres. False caso o valor nao esteja setado.
     */
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
    public boolean validaCodigoIbgeMunicipio() {
        String var = instance.getCodigoIbgeMunicipio();
        return var != null
                && var.matches("\\A\\d{7}\\z");
    }

    /**
     * Valida todos os fields
     *
     * @return True caso todos estejam validos False caso algum deles esteja
     * invalido.
     */
    public boolean validates() {
        return this.validaAtividadeTipo() && this.validaDtAtividadeColetiva() && this.validaHoraFim() && this.validaInep() && this.validaLocalAtividade()
                && this.validaNumAvaliacoesAlteradas() && this.validaNumParticipantes() && this.validaNumParticipantesProgramados() && this.validaPraticasTemasParaSaude()
                && this.validaProfssionais() && this.validaPublicoAlvo() && this.validaResponsavelCnesUnidade() && this.validaResponsavelCns() && this.validaResponsavelNumIne()
                && this.validaTemasParaReuniao() && this.validaUuidFicha() && this.validaCodigoIbgeMunicipio() && this.validaParticipantes();
    }

}
