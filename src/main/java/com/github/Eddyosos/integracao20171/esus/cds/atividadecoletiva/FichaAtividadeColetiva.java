package com.github.Eddyosos.integracao20171.esus.cds.atividadecoletiva;

import br.gov.saude.esus.cds.transport.generated.thrift.atividadecoletiva.FichaAtividadeColetivaThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.atividadecoletiva.ParticipanteRowItemThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.atividadecoletiva.ProfissionalCboRowItemThrift;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.thrift.TException;

public class FichaAtividadeColetiva {
    FichaAtividadeColetivaThrift fichaAtividadeColetiva = new FichaAtividadeColetivaThrift();

    protected FichaAtividadeColetiva(FichaAtividadeColetivaThrift fichaAtividadeColetiva) {
        this.fichaAtividadeColetiva = fichaAtividadeColetiva;
    }

    public FichaAtividadeColetiva deepCopy() {
        return new FichaAtividadeColetiva(fichaAtividadeColetiva.deepCopy());
    }

    public void clear() {
        fichaAtividadeColetiva.clear();
    }

    public String getUuidFicha() {
        return fichaAtividadeColetiva.getUuidFicha();
    }

    public void setUuidFicha(String uuidFicha) {
        fichaAtividadeColetiva.setUuidFicha(uuidFicha);
    }

    public void unsetUuidFicha() {
        fichaAtividadeColetiva.unsetUuidFicha();
    }

    public boolean isSetUuidFicha() {
        return fichaAtividadeColetiva.isSetUuidFicha();
    }

    public void setUuidFichaIsSet(boolean value) {
        fichaAtividadeColetiva.setUuidFichaIsSet(value);
    }

    public long getDtAtividadeColetiva() {
        return fichaAtividadeColetiva.getDtAtividadeColetiva();
    }

    public void setDtAtividadeColetiva(long dtAtividadeColetiva) {
        fichaAtividadeColetiva.setDtAtividadeColetiva(dtAtividadeColetiva);
    }

    public void unsetDtAtividadeColetiva() {
        fichaAtividadeColetiva.unsetDtAtividadeColetiva();
    }

    public boolean isSetDtAtividadeColetiva() {
        return fichaAtividadeColetiva.isSetDtAtividadeColetiva();
    }

    public void setDtAtividadeColetivaIsSet(boolean value) {
        fichaAtividadeColetiva.setDtAtividadeColetivaIsSet(value);
    }

    public int getNumParticipantesProgramados() {
        return fichaAtividadeColetiva.getNumParticipantesProgramados();
    }

    public void setNumParticipantesProgramados(int numParticipantesProgramados) {
        fichaAtividadeColetiva.setNumParticipantesProgramados(numParticipantesProgramados);
    }

    public void unsetNumParticipantesProgramados() {
        fichaAtividadeColetiva.unsetNumParticipantesProgramados();
    }

    public boolean isSetNumParticipantesProgramados() {
        return fichaAtividadeColetiva.isSetNumParticipantesProgramados();
    }

    public void setNumParticipantesProgramadosIsSet(boolean value) {
        fichaAtividadeColetiva.setNumParticipantesProgramadosIsSet(value);
    }

    public String getLocalAtividade() {
        return fichaAtividadeColetiva.getLocalAtividade();
    }

    public void setLocalAtividade(String localAtividade) {
        fichaAtividadeColetiva.setLocalAtividade(localAtividade);
    }

    public void unsetLocalAtividade() {
        fichaAtividadeColetiva.unsetLocalAtividade();
    }

    public boolean isSetLocalAtividade() {
        return fichaAtividadeColetiva.isSetLocalAtividade();
    }

    public void setLocalAtividadeIsSet(boolean value) {
        fichaAtividadeColetiva.setLocalAtividadeIsSet(value);
    }

    public long getHoraInicio() {
        return fichaAtividadeColetiva.getHoraInicio();
    }

    public void setHoraInicio(long horaInicio) {
        fichaAtividadeColetiva.setHoraInicio(horaInicio);
    }

    public void unsetHoraInicio() {
        fichaAtividadeColetiva.unsetHoraInicio();
    }

    public boolean isSetHoraInicio() {
        return fichaAtividadeColetiva.isSetHoraInicio();
    }

    public void setHoraInicioIsSet(boolean value) {
        fichaAtividadeColetiva.setHoraInicioIsSet(value);
    }

    public long getHoraFim() {
        return fichaAtividadeColetiva.getHoraFim();
    }

    public void setHoraFim(long horaFim) {
        fichaAtividadeColetiva.setHoraFim(horaFim);
    }

    public void unsetHoraFim() {
        fichaAtividadeColetiva.unsetHoraFim();
    }

    public boolean isSetHoraFim() {
        return fichaAtividadeColetiva.isSetHoraFim();
    }

    public void setHoraFimIsSet(boolean value) {
        fichaAtividadeColetiva.setHoraFimIsSet(value);
    }

    public long getInep() {
        return fichaAtividadeColetiva.getInep();
    }

    public void setInep(long inep) {
        fichaAtividadeColetiva.setInep(inep);
    }

    public void unsetInep() {
        fichaAtividadeColetiva.unsetInep();
    }

    public boolean isSetInep() {
        return fichaAtividadeColetiva.isSetInep();
    }

    public void setInepIsSet(boolean value) {
        fichaAtividadeColetiva.setInepIsSet(value);
    }

    public String getResponsavelCns() {
        return fichaAtividadeColetiva.getResponsavelCns();
    }

    public void setResponsavelCns(String responsavelCns) {
        fichaAtividadeColetiva.setResponsavelCns(responsavelCns);
    }

    public void unsetResponsavelCns() {
        fichaAtividadeColetiva.unsetResponsavelCns();
    }

    public boolean isSetResponsavelCns() {
        return fichaAtividadeColetiva.isSetResponsavelCns();
    }

    public void setResponsavelCnsIsSet(boolean value) {
        fichaAtividadeColetiva.setResponsavelCnsIsSet(value);
    }

    public String getResponsavelCnesUnidade() {
        return fichaAtividadeColetiva.getResponsavelCnesUnidade();
    }

    public void setResponsavelCnesUnidade(String responsavelCnesUnidade) {
        fichaAtividadeColetiva.setResponsavelCnesUnidade(responsavelCnesUnidade);
    }

    public void unsetResponsavelCnesUnidade() {
        fichaAtividadeColetiva.unsetResponsavelCnesUnidade();
    }

    public boolean isSetResponsavelCnesUnidade() {
        return fichaAtividadeColetiva.isSetResponsavelCnesUnidade();
    }

    public void setResponsavelCnesUnidadeIsSet(boolean value) {
        fichaAtividadeColetiva.setResponsavelCnesUnidadeIsSet(value);
    }

    public String getResponsavelNumIne() {
        return fichaAtividadeColetiva.getResponsavelNumIne();
    }

    public void setResponsavelNumIne(String responsavelNumIne) {
        fichaAtividadeColetiva.setResponsavelNumIne(responsavelNumIne);
    }

    public void unsetResponsavelNumIne() {
        fichaAtividadeColetiva.unsetResponsavelNumIne();
    }

    public boolean isSetResponsavelNumIne() {
        return fichaAtividadeColetiva.isSetResponsavelNumIne();
    }

    public void setResponsavelNumIneIsSet(boolean value) {
        fichaAtividadeColetiva.setResponsavelNumIneIsSet(value);
    }

    public int getNumParticipantes() {
        return fichaAtividadeColetiva.getNumParticipantes();
    }

    public void setNumParticipantes(int numParticipantes) {
        fichaAtividadeColetiva.setNumParticipantes(numParticipantes);
    }

    public void unsetNumParticipantes() {
        fichaAtividadeColetiva.unsetNumParticipantes();
    }

    public boolean isSetNumParticipantes() {
        return fichaAtividadeColetiva.isSetNumParticipantes();
    }

    public void setNumParticipantesIsSet(boolean value) {
        fichaAtividadeColetiva.setNumParticipantesIsSet(value);
    }

    public int getNumAvaliacoesAlteradas() {
        return fichaAtividadeColetiva.getNumAvaliacoesAlteradas();
    }

    public void setNumAvaliacoesAlteradas(int numAvaliacoesAlteradas) {
        fichaAtividadeColetiva.setNumAvaliacoesAlteradas(numAvaliacoesAlteradas);
    }

    public void unsetNumAvaliacoesAlteradas() {
        fichaAtividadeColetiva.unsetNumAvaliacoesAlteradas();
    }

    public boolean isSetNumAvaliacoesAlteradas() {
        return fichaAtividadeColetiva.isSetNumAvaliacoesAlteradas();
    }

    public void setNumAvaliacoesAlteradasIsSet(boolean value) {
        fichaAtividadeColetiva.setNumAvaliacoesAlteradasIsSet(value);
    }

    public int getProfissionaisSize() {
        return fichaAtividadeColetiva.getProfissionaisSize();
    }

    public Iterator<ProfissionalCboRowItem> getProfissionaisIterator() {
        List<ProfissionalCboRowItem> listaProfissionalCboRowItem = new LinkedList<>();
        
        fichaAtividadeColetiva.getProfissionaisIterator().forEachRemaining((elemento) -> {
            listaProfissionalCboRowItem.add(new ProfissionalCboRowItem(elemento));
        });
        
        return listaProfissionalCboRowItem.iterator();
    }

    public void addToProfissionais(ProfissionalCboRowItem elem) {
        fichaAtividadeColetiva.addToProfissionais(elem.getInstance());
    }

    public List<ProfissionalCboRowItem> getProfissionais() {
        List<ProfissionalCboRowItem> listaProfissionalCboRowItem = new LinkedList<>();
        
        fichaAtividadeColetiva.getProfissionais().forEach((elemento) -> {
            listaProfissionalCboRowItem.add(new ProfissionalCboRowItem(elemento));
        });
        
        
        return listaProfissionalCboRowItem;
    }

    public void setProfissionais(List<ProfissionalCboRowItem> profissionais) {
        List<ProfissionalCboRowItemThrift> listaProfissionalCboRowItemThrift = new LinkedList<>();
        
        profissionais.forEach((elemento) -> {
            listaProfissionalCboRowItemThrift.add(elemento.getInstance());
        });
         
        fichaAtividadeColetiva.setProfissionais(listaProfissionalCboRowItemThrift);
    }

    public void unsetProfissionais() {
        fichaAtividadeColetiva.unsetProfissionais();
    }

    public boolean isSetProfissionais() {
        return fichaAtividadeColetiva.isSetProfissionais();
    }

    public void setProfissionaisIsSet(boolean value) {
        fichaAtividadeColetiva.setProfissionaisIsSet(value);
    }

    public long getAtividadeTipo() {
        return fichaAtividadeColetiva.getAtividadeTipo();
    }

    public void setAtividadeTipo(long atividadeTipo) {
        fichaAtividadeColetiva.setAtividadeTipo(atividadeTipo);
    }

    public void unsetAtividadeTipo() {
        fichaAtividadeColetiva.unsetAtividadeTipo();
    }

    public boolean isSetAtividadeTipo() {
        return fichaAtividadeColetiva.isSetAtividadeTipo();
    }

    public void setAtividadeTipoIsSet(boolean value) {
        fichaAtividadeColetiva.setAtividadeTipoIsSet(value);
    }

    public int getTemasParaReuniaoSize() {
        return fichaAtividadeColetiva.getTemasParaReuniaoSize();
    }

    public Iterator<Long> getTemasParaReuniaoIterator() {
        return fichaAtividadeColetiva.getTemasParaReuniaoIterator();
    }

    public void addToTemasParaReuniao(long elem) {
        fichaAtividadeColetiva.addToTemasParaReuniao(elem);
    }

    public List<Long> getTemasParaReuniao() {
        return fichaAtividadeColetiva.getTemasParaReuniao();
    }

    public void setTemasParaReuniao(List<Long> temasParaReuniao) {
        fichaAtividadeColetiva.setTemasParaReuniao(temasParaReuniao);
    }

    public void unsetTemasParaReuniao() {
        fichaAtividadeColetiva.unsetTemasParaReuniao();
    }

    public boolean isSetTemasParaReuniao() {
        return fichaAtividadeColetiva.isSetTemasParaReuniao();
    }

    public void setTemasParaReuniaoIsSet(boolean value) {
        fichaAtividadeColetiva.setTemasParaReuniaoIsSet(value);
    }

    public int getPublicoAlvoSize() {
        return fichaAtividadeColetiva.getPublicoAlvoSize();
    }

    public Iterator<Long> getPublicoAlvoIterator() {
        return fichaAtividadeColetiva.getPublicoAlvoIterator();
    }

    public void addToPublicoAlvo(long elem) {
        fichaAtividadeColetiva.addToPublicoAlvo(elem);
    }

    public List<Long> getPublicoAlvo() {
        return fichaAtividadeColetiva.getPublicoAlvo();
    }

    public void setPublicoAlvo(List<Long> publicoAlvo) {
        fichaAtividadeColetiva.setPublicoAlvo(publicoAlvo);
    }

    public void unsetPublicoAlvo() {
        fichaAtividadeColetiva.unsetPublicoAlvo();
    }

    public boolean isSetPublicoAlvo() {
        return fichaAtividadeColetiva.isSetPublicoAlvo();
    }

    public void setPublicoAlvoIsSet(boolean value) {
        fichaAtividadeColetiva.setPublicoAlvoIsSet(value);
    }

    public int getPraticasTemasParaSaudeSize() {
        return fichaAtividadeColetiva.getPraticasTemasParaSaudeSize();
    }

    public Iterator<Long> getPraticasTemasParaSaudeIterator() {
        return fichaAtividadeColetiva.getPraticasTemasParaSaudeIterator();
    }

    public void addToPraticasTemasParaSaude(long elem) {
        fichaAtividadeColetiva.addToPraticasTemasParaSaude(elem);
    }

    public List<Long> getPraticasTemasParaSaude() {
        return fichaAtividadeColetiva.getPraticasTemasParaSaude();
    }

    public void setPraticasTemasParaSaude(List<Long> praticasTemasParaSaude) {
        fichaAtividadeColetiva.setPraticasTemasParaSaude(praticasTemasParaSaude);
    }

    public void unsetPraticasTemasParaSaude() {
        fichaAtividadeColetiva.unsetPraticasTemasParaSaude();
    }

    public boolean isSetPraticasTemasParaSaude() {
        return fichaAtividadeColetiva.isSetPraticasTemasParaSaude();
    }

    public void setPraticasTemasParaSaudeIsSet(boolean value) {
        fichaAtividadeColetiva.setPraticasTemasParaSaudeIsSet(value);
    }

    public int getParticipantesSize() {
        return fichaAtividadeColetiva.getParticipantesSize();
    }

    public Iterator<ParticipanteRowItem> getParticipantesIterator() {
        List<ParticipanteRowItem> listaParticipanteRowItem = new LinkedList<>();
        
        fichaAtividadeColetiva.getParticipantesIterator().forEachRemaining((elemento) -> {
            listaParticipanteRowItem.add(new ParticipanteRowItem(elemento));
        });
        
        return listaParticipanteRowItem.iterator();
    }

    public void addToParticipantes(ParticipanteRowItem elem) {
        fichaAtividadeColetiva.addToParticipantes(elem.getInstance());
    }

    public List<ParticipanteRowItem> getParticipantes() {
        List<ParticipanteRowItem> listaParticipanteRowItem = new LinkedList<>();
        
        fichaAtividadeColetiva.getParticipantes().forEach((elemento) -> {
            listaParticipanteRowItem.add(new ParticipanteRowItem(elemento));
        });
        
        return listaParticipanteRowItem;
    }

    public void setParticipantes(List<ParticipanteRowItem> participantes) {
        List<ParticipanteRowItemThrift> listaParticipanteRowItemThrift = new LinkedList<>();
        participantes.forEach((elemento) -> {
            listaParticipanteRowItemThrift.add(elemento.getInstance());
        });
        fichaAtividadeColetiva.setParticipantes(listaParticipanteRowItemThrift);
    }

    public void unsetParticipantes() {
        fichaAtividadeColetiva.unsetParticipantes();
    }

    public boolean isSetParticipantes() {
        return fichaAtividadeColetiva.isSetParticipantes();
    }

    public void setParticipantesIsSet(boolean value) {
        fichaAtividadeColetiva.setParticipantesIsSet(value);
    }

    public int getTbCdsOrigem() {
        return fichaAtividadeColetiva.getTbCdsOrigem();
    }

    public void setTbCdsOrigem(int tbCdsOrigem) {
        fichaAtividadeColetiva.setTbCdsOrigem(tbCdsOrigem);
    }

    public void unsetTbCdsOrigem() {
        fichaAtividadeColetiva.unsetTbCdsOrigem();
    }

    public boolean isSetTbCdsOrigem() {
        return fichaAtividadeColetiva.isSetTbCdsOrigem();
    }

    public void setTbCdsOrigemIsSet(boolean value) {
        fichaAtividadeColetiva.setTbCdsOrigemIsSet(value);
    }

    public String getCodigoIbgeMunicipio() {
        return fichaAtividadeColetiva.getCodigoIbgeMunicipio();
    }

    public void setCodigoIbgeMunicipio(String codigoIbgeMunicipio) {
        fichaAtividadeColetiva.setCodigoIbgeMunicipio(codigoIbgeMunicipio);
    }

    public void unsetCodigoIbgeMunicipio() {
        fichaAtividadeColetiva.unsetCodigoIbgeMunicipio();
    }

    public boolean isSetCodigoIbgeMunicipio() {
        return fichaAtividadeColetiva.isSetCodigoIbgeMunicipio();
    }

    public void setCodigoIbgeMunicipioIsSet(boolean value) {
        fichaAtividadeColetiva.setCodigoIbgeMunicipioIsSet(value);
    }

    @Override
    public boolean equals(Object that) {
        return fichaAtividadeColetiva.equals(that);
    }

    public boolean equals(FichaAtividadeColetiva that) {
        return fichaAtividadeColetiva.equals(that.getInstance());
    }

    public int hashCode() {
        return fichaAtividadeColetiva.hashCode();
    }
    
    public int compareTo(FichaAtividadeColetiva other) {
        return fichaAtividadeColetiva.compareTo(other.getInstance());
    }

    @Override
    public String toString() {
        return fichaAtividadeColetiva.toString();
    }

    public void validate() throws TException {
        fichaAtividadeColetiva.validate();
    }

    protected FichaAtividadeColetivaThrift getInstance(){
        return fichaAtividadeColetiva;
    }
    
    
}

