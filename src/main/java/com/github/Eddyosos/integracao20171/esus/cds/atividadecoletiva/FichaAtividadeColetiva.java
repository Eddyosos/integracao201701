package com.github.Eddyosos.integracao20171.esus.cds.atividadecoletiva;

import br.gov.saude.esus.cds.transport.generated.thrift.atividadecoletiva.FichaAtividadeColetivaThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.atividadecoletiva.ParticipanteRowItemThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.atividadecoletiva.ProfissionalCboRowItemThrift;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.thrift.TException;

public class FichaAtividadeColetiva {
    FichaAtividadeColetivaThrift fichaAtividadeColetivaThrift = new FichaAtividadeColetivaThrift();

    public FichaAtividadeColetivaThrift deepCopy() {
        return fichaAtividadeColetivaThrift.deepCopy();
    }

    public String getUuidFicha() {
        return fichaAtividadeColetivaThrift.getUuidFicha();
    }

    public void setUuidFicha(String uuidFicha) {
        fichaAtividadeColetivaThrift.setUuidFicha(uuidFicha);
    }

    public void unsetUuidFicha() {
        fichaAtividadeColetivaThrift.unsetUuidFicha();
    }

    public boolean isSetUuidFicha() {
        return fichaAtividadeColetivaThrift.isSetUuidFicha();
    }

    public void setUuidFichaIsSet(boolean value) {
        fichaAtividadeColetivaThrift.setUuidFichaIsSet(value);
    }

    public long getDtAtividadeColetiva() {
        return fichaAtividadeColetivaThrift.getDtAtividadeColetiva();
    }

    public void setDtAtividadeColetiva(long dtAtividadeColetiva) {
        fichaAtividadeColetivaThrift.setDtAtividadeColetiva(dtAtividadeColetiva);
    }

    public void unsetDtAtividadeColetiva() {
        fichaAtividadeColetivaThrift.unsetDtAtividadeColetiva();
    }

    public boolean isSetDtAtividadeColetiva() {
        return fichaAtividadeColetivaThrift.isSetDtAtividadeColetiva();
    }

    public void setDtAtividadeColetivaIsSet(boolean value) {
        fichaAtividadeColetivaThrift.setDtAtividadeColetivaIsSet(value);
    }

    public int getNumParticipantesProgramados() {
        return fichaAtividadeColetivaThrift.getNumParticipantesProgramados();
    }

    public void setNumParticipantesProgramados(int numParticipantesProgramados) {
        fichaAtividadeColetivaThrift.setNumParticipantesProgramados(numParticipantesProgramados);
    }

    public void unsetNumParticipantesProgramados() {
        fichaAtividadeColetivaThrift.unsetNumParticipantesProgramados();
    }

    public boolean isSetNumParticipantesProgramados() {
        return fichaAtividadeColetivaThrift.isSetNumParticipantesProgramados();
    }

    public void setNumParticipantesProgramadosIsSet(boolean value) {
        fichaAtividadeColetivaThrift.setNumParticipantesProgramadosIsSet(value);
    }

    public String getLocalAtividade() {
        return fichaAtividadeColetivaThrift.getLocalAtividade();
    }

    public void setLocalAtividade(String localAtividade) {
        fichaAtividadeColetivaThrift.setLocalAtividade(localAtividade);
    }

    public void unsetLocalAtividade() {
        fichaAtividadeColetivaThrift.unsetLocalAtividade();
    }

    public boolean isSetLocalAtividade() {
        return fichaAtividadeColetivaThrift.isSetLocalAtividade();
    }

    public void setLocalAtividadeIsSet(boolean value) {
        fichaAtividadeColetivaThrift.setLocalAtividadeIsSet(value);
    }

    public long getHoraInicio() {
        return fichaAtividadeColetivaThrift.getHoraInicio();
    }

    public void setHoraInicio(long horaInicio) {
        fichaAtividadeColetivaThrift.setHoraInicio(horaInicio);
    }

    public void unsetHoraInicio() {
        fichaAtividadeColetivaThrift.unsetHoraInicio();
    }

    public boolean isSetHoraInicio() {
        return fichaAtividadeColetivaThrift.isSetHoraInicio();
    }

    public void setHoraInicioIsSet(boolean value) {
        fichaAtividadeColetivaThrift.setHoraInicioIsSet(value);
    }

    public long getHoraFim() {
        return fichaAtividadeColetivaThrift.getHoraFim();
    }

    public void setHoraFim(long horaFim) {
        fichaAtividadeColetivaThrift.setHoraFim(horaFim);
    }

    public void unsetHoraFim() {
        fichaAtividadeColetivaThrift.unsetHoraFim();
    }

    public boolean isSetHoraFim() {
        return fichaAtividadeColetivaThrift.isSetHoraFim();
    }

    public void setHoraFimIsSet(boolean value) {
        fichaAtividadeColetivaThrift.setHoraFimIsSet(value);
    }

    public long getInep() {
        return fichaAtividadeColetivaThrift.getInep();
    }

    public void setInep(long inep) {
        fichaAtividadeColetivaThrift.setInep(inep);
    }

    public void unsetInep() {
        fichaAtividadeColetivaThrift.unsetInep();
    }

    public boolean isSetInep() {
        return fichaAtividadeColetivaThrift.isSetInep();
    }

    public void setInepIsSet(boolean value) {
        fichaAtividadeColetivaThrift.setInepIsSet(value);
    }

    public String getResponsavelCns() {
        return fichaAtividadeColetivaThrift.getResponsavelCns();
    }

    public void setResponsavelCns(String responsavelCns) {
        fichaAtividadeColetivaThrift.setResponsavelCns(responsavelCns);
    }

    public void unsetResponsavelCns() {
        fichaAtividadeColetivaThrift.unsetResponsavelCns();
    }

    public boolean isSetResponsavelCns() {
        return fichaAtividadeColetivaThrift.isSetResponsavelCns();
    }

    public void setResponsavelCnsIsSet(boolean value) {
        fichaAtividadeColetivaThrift.setResponsavelCnsIsSet(value);
    }

    public String getResponsavelCnesUnidade() {
        return fichaAtividadeColetivaThrift.getResponsavelCnesUnidade();
    }

    public void setResponsavelCnesUnidade(String responsavelCnesUnidade) {
        fichaAtividadeColetivaThrift.setResponsavelCnesUnidade(responsavelCnesUnidade);
    }

    public void unsetResponsavelCnesUnidade() {
        fichaAtividadeColetivaThrift.unsetResponsavelCnesUnidade();
    }

    public boolean isSetResponsavelCnesUnidade() {
        return fichaAtividadeColetivaThrift.isSetResponsavelCnesUnidade();
    }

    public void setResponsavelCnesUnidadeIsSet(boolean value) {
        fichaAtividadeColetivaThrift.setResponsavelCnesUnidadeIsSet(value);
    }

    public String getResponsavelNumIne() {
        return fichaAtividadeColetivaThrift.getResponsavelNumIne();
    }

    public void setResponsavelNumIne(String responsavelNumIne) {
        fichaAtividadeColetivaThrift.setResponsavelNumIne(responsavelNumIne);
    }

    public void unsetResponsavelNumIne() {
        fichaAtividadeColetivaThrift.unsetResponsavelNumIne();
    }

    public boolean isSetResponsavelNumIne() {
        return fichaAtividadeColetivaThrift.isSetResponsavelNumIne();
    }

    public void setResponsavelNumIneIsSet(boolean value) {
        fichaAtividadeColetivaThrift.setResponsavelNumIneIsSet(value);
    }

    public int getNumParticipantes() {
        return fichaAtividadeColetivaThrift.getNumParticipantes();
    }

    public void setNumParticipantes(int numParticipantes) {
        fichaAtividadeColetivaThrift.setNumParticipantes(numParticipantes);
    }

    public void unsetNumParticipantes() {
        fichaAtividadeColetivaThrift.unsetNumParticipantes();
    }

    public boolean isSetNumParticipantes() {
        return fichaAtividadeColetivaThrift.isSetNumParticipantes();
    }

    public void setNumParticipantesIsSet(boolean value) {
        fichaAtividadeColetivaThrift.setNumParticipantesIsSet(value);
    }

    public int getNumAvaliacoesAlteradas() {
        return fichaAtividadeColetivaThrift.getNumAvaliacoesAlteradas();
    }

    public void setNumAvaliacoesAlteradas(int numAvaliacoesAlteradas) {
        fichaAtividadeColetivaThrift.setNumAvaliacoesAlteradas(numAvaliacoesAlteradas);
    }

    public void unsetNumAvaliacoesAlteradas() {
        fichaAtividadeColetivaThrift.unsetNumAvaliacoesAlteradas();
    }

    public boolean isSetNumAvaliacoesAlteradas() {
        return fichaAtividadeColetivaThrift.isSetNumAvaliacoesAlteradas();
    }

    public void setNumAvaliacoesAlteradasIsSet(boolean value) {
        fichaAtividadeColetivaThrift.setNumAvaliacoesAlteradasIsSet(value);
    }

    public int getProfissionaisSize() {
        return fichaAtividadeColetivaThrift.getProfissionaisSize();
    }

    public Iterator<ProfissionalCboRowItem> getProfissionaisIterator() {
        
        List<ProfissionalCboRowItem> listaProfissionalCboRowItem = new LinkedList<>();
        fichaAtividadeColetivaThrift.getProfissionaisIterator().forEachRemaining((t) -> {
            listaProfissionalCboRowItem.add(new ProfissionalCboRowItem(t));
        });
        return listaProfissionalCboRowItem.iterator();
    }

    public void addToProfissionais(ProfissionalCboRowItemThrift elem) {
        fichaAtividadeColetivaThrift.addToProfissionais(elem);
    }

    public List<ProfissionalCboRowItem> getProfissionais() {
        
        List<ProfissionalCboRowItem> listaProfissionalCboRowItem = new LinkedList<>();
        fichaAtividadeColetivaThrift.getProfissionais().forEach((t) -> {
            listaProfissionalCboRowItem.add(new ProfissionalCboRowItem(t));
        });
        return listaProfissionalCboRowItem;
    }

    public void setProfissionais(List<ProfissionalCboRowItem> profissionais) {
        
        List<ProfissionalCboRowItemThrift> listaProfissionalCboRowItem = new LinkedList<>();
        profissionais.forEach((t) -> {
            listaProfissionalCboRowItem.add(t.getInstance());
        });
        
        fichaAtividadeColetivaThrift.setProfissionais(listaProfissionalCboRowItem);
    }

    public void unsetProfissionais() {
        fichaAtividadeColetivaThrift.unsetProfissionais();
    }

    public boolean isSetProfissionais() {
        return fichaAtividadeColetivaThrift.isSetProfissionais();
    }

    public void setProfissionaisIsSet(boolean value) {
        fichaAtividadeColetivaThrift.setProfissionaisIsSet(value);
    }

    public long getAtividadeTipo() {
        return fichaAtividadeColetivaThrift.getAtividadeTipo();
    }

    public void setAtividadeTipo(long atividadeTipo) {
        fichaAtividadeColetivaThrift.setAtividadeTipo(atividadeTipo);
    }

    public void unsetAtividadeTipo() {
        fichaAtividadeColetivaThrift.unsetAtividadeTipo();
    }

    public boolean isSetAtividadeTipo() {
        return fichaAtividadeColetivaThrift.isSetAtividadeTipo();
    }

    public void setAtividadeTipoIsSet(boolean value) {
        fichaAtividadeColetivaThrift.setAtividadeTipoIsSet(value);
    }

    public int getTemasParaReuniaoSize() {
        return fichaAtividadeColetivaThrift.getTemasParaReuniaoSize();
    }

    public Iterator<Long> getTemasParaReuniaoIterator() {
        return fichaAtividadeColetivaThrift.getTemasParaReuniaoIterator();
    }

    public void addToTemasParaReuniao(long elem) {
        fichaAtividadeColetivaThrift.addToTemasParaReuniao(elem);
    }

    public List<Long> getTemasParaReuniao() {
        return fichaAtividadeColetivaThrift.getTemasParaReuniao();
    }

    public void setTemasParaReuniao(List<Long> temasParaReuniao) {
        fichaAtividadeColetivaThrift.setTemasParaReuniao(temasParaReuniao);
    }

    public void unsetTemasParaReuniao() {
        fichaAtividadeColetivaThrift.unsetTemasParaReuniao();
    }

    public boolean isSetTemasParaReuniao() {
        return fichaAtividadeColetivaThrift.isSetTemasParaReuniao();
    }

    public void setTemasParaReuniaoIsSet(boolean value) {
        fichaAtividadeColetivaThrift.setTemasParaReuniaoIsSet(value);
    }

    public int getPublicoAlvoSize() {
        return fichaAtividadeColetivaThrift.getPublicoAlvoSize();
    }

    public Iterator<Long> getPublicoAlvoIterator() {
        return fichaAtividadeColetivaThrift.getPublicoAlvoIterator();
    }

    public void addToPublicoAlvo(long elem) {
        fichaAtividadeColetivaThrift.addToPublicoAlvo(elem);
    }

    public List<Long> getPublicoAlvo() {
        return fichaAtividadeColetivaThrift.getPublicoAlvo();
    }

    public void setPublicoAlvo(List<Long> publicoAlvo) {
        fichaAtividadeColetivaThrift.setPublicoAlvo(publicoAlvo);
    }

    public void unsetPublicoAlvo() {
        fichaAtividadeColetivaThrift.unsetPublicoAlvo();
    }

    public boolean isSetPublicoAlvo() {
        return fichaAtividadeColetivaThrift.isSetPublicoAlvo();
    }

    public void setPublicoAlvoIsSet(boolean value) {
        fichaAtividadeColetivaThrift.setPublicoAlvoIsSet(value);
    }

    public int getPraticasTemasParaSaudeSize() {
        return fichaAtividadeColetivaThrift.getPraticasTemasParaSaudeSize();
    }

    public Iterator<Long> getPraticasTemasParaSaudeIterator() {
        return fichaAtividadeColetivaThrift.getPraticasTemasParaSaudeIterator();
    }

    public void addToPraticasTemasParaSaude(long elem) {
        fichaAtividadeColetivaThrift.addToPraticasTemasParaSaude(elem);
    }

    public List<Long> getPraticasTemasParaSaude() {
        return fichaAtividadeColetivaThrift.getPraticasTemasParaSaude();
    }

    public void setPraticasTemasParaSaude(List<Long> praticasTemasParaSaude) {
        fichaAtividadeColetivaThrift.setPraticasTemasParaSaude(praticasTemasParaSaude);
    }

    public void unsetPraticasTemasParaSaude() {
        fichaAtividadeColetivaThrift.unsetPraticasTemasParaSaude();
    }

    public boolean isSetPraticasTemasParaSaude() {
        return fichaAtividadeColetivaThrift.isSetPraticasTemasParaSaude();
    }

    public void setPraticasTemasParaSaudeIsSet(boolean value) {
        fichaAtividadeColetivaThrift.setPraticasTemasParaSaudeIsSet(value);
    }

    public int getParticipantesSize() {
        return fichaAtividadeColetivaThrift.getParticipantesSize();
    }

    public Iterator<ParticipanteRowItem> getParticipantesIterator() {
        
        List<ParticipanteRowItem> listaParticipantes = new LinkedList<>();
        
        fichaAtividadeColetivaThrift.getParticipantesIterator().forEachRemaining((t) -> {
            listaParticipantes.add(new ParticipanteRowItem(t));
        });
        return listaParticipantes.iterator();
    }

    public void addToParticipantes(ParticipanteRowItem elem) {
        fichaAtividadeColetivaThrift.addToParticipantes(elem.getInstance());
    }

    public List<ParticipanteRowItem> getParticipantes() {
         List<ParticipanteRowItem> listaParticipantes = new LinkedList<>();
        
        fichaAtividadeColetivaThrift.getParticipantes().forEach((t) -> {
            listaParticipantes.add(new ParticipanteRowItem(t));
        });
        
        return listaParticipantes;
    }

    public void setParticipantes(List<ParticipanteRowItem> participantes) {
        
        List<ParticipanteRowItemThrift> listaParticipantes = new LinkedList<>();
        
        participantes.forEach((t) -> {
            listaParticipantes.add(t.getInstance());
        });
        
        
        fichaAtividadeColetivaThrift.setParticipantes(listaParticipantes);
    }

    public void unsetParticipantes() {
        fichaAtividadeColetivaThrift.unsetParticipantes();
    }

    public boolean isSetParticipantes() {
        return fichaAtividadeColetivaThrift.isSetParticipantes();
    }

    public void setParticipantesIsSet(boolean value) {
        fichaAtividadeColetivaThrift.setParticipantesIsSet(value);
    }

    public int getTbCdsOrigem() {
        return fichaAtividadeColetivaThrift.getTbCdsOrigem();
    }

    public void setTbCdsOrigem(int tbCdsOrigem) {
        fichaAtividadeColetivaThrift.setTbCdsOrigem(tbCdsOrigem);
    }

    public void unsetTbCdsOrigem() {
        fichaAtividadeColetivaThrift.unsetTbCdsOrigem();
    }

    public boolean isSetTbCdsOrigem() {
        return fichaAtividadeColetivaThrift.isSetTbCdsOrigem();
    }

    public void setTbCdsOrigemIsSet(boolean value) {
        fichaAtividadeColetivaThrift.setTbCdsOrigemIsSet(value);
    }

    public String getCodigoIbgeMunicipio() {
        return fichaAtividadeColetivaThrift.getCodigoIbgeMunicipio();
    }

    public void setCodigoIbgeMunicipio(String codigoIbgeMunicipio) {
        fichaAtividadeColetivaThrift.setCodigoIbgeMunicipio(codigoIbgeMunicipio);
    }

    public void unsetCodigoIbgeMunicipio() {
        fichaAtividadeColetivaThrift.unsetCodigoIbgeMunicipio();
    }

    public boolean isSetCodigoIbgeMunicipio() {
        return fichaAtividadeColetivaThrift.isSetCodigoIbgeMunicipio();
    }

    public void setCodigoIbgeMunicipioIsSet(boolean value) {
        fichaAtividadeColetivaThrift.setCodigoIbgeMunicipioIsSet(value);
    }

    @Override
    public boolean equals(Object that) {
        return fichaAtividadeColetivaThrift.equals(that);
    }

    public boolean equals(FichaAtividadeColetiva that) {
        return fichaAtividadeColetivaThrift.equals(that.getInstance());
    }

    @Override
    public int hashCode() {
        return fichaAtividadeColetivaThrift.hashCode();
    }

    public int compareTo(FichaAtividadeColetiva other) {
        return fichaAtividadeColetivaThrift.compareTo(other.getInstance());
    }

    @Override
    public String toString() {
        return fichaAtividadeColetivaThrift.toString();
    }

    public void validate() throws TException {
        fichaAtividadeColetivaThrift.validate();
    }
    
    protected FichaAtividadeColetivaThrift getInstance(){
        return fichaAtividadeColetivaThrift;
    }
    
    
}

