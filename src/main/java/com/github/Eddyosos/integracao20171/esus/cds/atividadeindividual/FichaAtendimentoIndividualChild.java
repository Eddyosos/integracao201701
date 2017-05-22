package com.github.Eddyosos.integracao20171.esus.cds.atividadeindividual;

import br.gov.saude.esus.cds.transport.generated.thrift.atividadeindividual.FichaAtendimentoIndividualChildThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.atividadeindividual.OutrosSiaThrift;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;

public class FichaAtendimentoIndividualChild {
    private final FichaAtendimentoIndividualChildThrift instance;

    public FichaAtendimentoIndividualChild() {
        instance = new FichaAtendimentoIndividualChildThrift();
    }

    public String getNumeroProntuario() {
        return instance.getNumeroProntuario();
    }

    public void setNumeroProntuario(String numeroProntuario) {
        instance.setNumeroProntuario(numeroProntuario);
    }

    public void unsetNumeroProntuario() {
        instance.unsetNumeroProntuario();
    }

    public boolean isSetNumeroProntuario() {
        return instance.isSetNumeroProntuario();
    }

    public void setNumeroProntuarioIsSet(boolean value) {
        instance.setNumeroProntuarioIsSet(value);
    }

    public String getCns() {
        return instance.getCns();
    }

    public void setCns(String cns) {
        instance.setCns(cns);
    }

    public void unsetCns() {
        instance.unsetCns();
    }

    public boolean isSetCns() {
        return instance.isSetCns();
    }

    public void setCnsIsSet(boolean value) {
        instance.setCnsIsSet(value);
    }

    public long getDataNascimento() {
        return instance.getDataNascimento();
    }

    public void setDataNascimento(long dataNascimento) {
        instance.setDataNascimento(dataNascimento);
    }

    public void unsetDataNascimento() {
        instance.unsetDataNascimento();
    }

    public boolean isSetDataNascimento() {
        return instance.isSetDataNascimento();
    }

    public void setDataNascimentoIsSet(boolean value) {
        instance.setDataNascimentoIsSet(value);
    }

    public long getLocalDeAtendimento() {
        return instance.getLocalDeAtendimento();
    }

    public void setLocalDeAtendimento(long localDeAtendimento) {
        instance.setLocalDeAtendimento(localDeAtendimento);
    }

    public void unsetLocalDeAtendimento() {
        instance.unsetLocalDeAtendimento();
    }

    public boolean isSetLocalDeAtendimento() {
        return instance.isSetLocalDeAtendimento();
    }

    public void setLocalDeAtendimentoIsSet(boolean value) {
        instance.setLocalDeAtendimentoIsSet(value);
    }

    public long getSexo() {
        return instance.getSexo();
    }

    public void setSexo(long sexo) {
        instance.setSexo(sexo);
    }

    public void unsetSexo() {
        instance.unsetSexo();
    }

    public boolean isSetSexo() {
        return instance.isSetSexo();
    }

    public void setSexoIsSet(boolean value) {
        instance.setSexoIsSet(value);
    }

    public long getTurno() {
        return instance.getTurno();
    }

    public void setTurno(long turno) {
        instance.setTurno(turno);
    }

    public void unsetTurno() {
        instance.unsetTurno();
    }

    public boolean isSetTurno() {
        return instance.isSetTurno();
    }

    public void setTurnoIsSet(boolean value) {
        instance.setTurnoIsSet(value);
    }

    public long getTipoAtendimento() {
        return instance.getTipoAtendimento();
    }

    public void setTipoAtendimento(long tipoAtendimento) {
        instance.setTipoAtendimento(tipoAtendimento);
    }

    public void unsetTipoAtendimento() {
        instance.unsetTipoAtendimento();
    }

    public boolean isSetTipoAtendimento() {
        return instance.isSetTipoAtendimento();
    }

    public void setTipoAtendimentoIsSet(boolean value) {
        instance.setTipoAtendimentoIsSet(value);
    }

    public double getPesoAcompanhamentoNutricional() {
        return instance.getPesoAcompanhamentoNutricional();
    }

    public void setPesoAcompanhamentoNutricional(double pesoAcompanhamentoNutricional) {
        instance.setPesoAcompanhamentoNutricional(pesoAcompanhamentoNutricional);
    }

    public void unsetPesoAcompanhamentoNutricional() {
        instance.unsetPesoAcompanhamentoNutricional();
    }

    public boolean isSetPesoAcompanhamentoNutricional() {
        return instance.isSetPesoAcompanhamentoNutricional();
    }

    public void setPesoAcompanhamentoNutricionalIsSet(boolean value) {
        instance.setPesoAcompanhamentoNutricionalIsSet(value);
    }

    public double getAlturaAcompanhamentoNutricional() {
        return instance.getAlturaAcompanhamentoNutricional();
    }

    public void setAlturaAcompanhamentoNutricional(double alturaAcompanhamentoNutricional) {
        instance.setAlturaAcompanhamentoNutricional(alturaAcompanhamentoNutricional);
    }

    public void unsetAlturaAcompanhamentoNutricional() {
        instance.unsetAlturaAcompanhamentoNutricional();
    }

    public boolean isSetAlturaAcompanhamentoNutricional() {
        return instance.isSetAlturaAcompanhamentoNutricional();
    }

    public void setAlturaAcompanhamentoNutricionalIsSet(boolean value) {
        instance.setAlturaAcompanhamentoNutricionalIsSet(value);
    }

    public long getAleitamentoMaterno() {
        return instance.getAleitamentoMaterno();
    }

    public void setAleitamentoMaterno(long aleitamentoMaterno) {
        instance.setAleitamentoMaterno(aleitamentoMaterno);
    }

    public void unsetAleitamentoMaterno() {
        instance.unsetAleitamentoMaterno();
    }

    public boolean isSetAleitamentoMaterno() {
        return instance.isSetAleitamentoMaterno();
    }

    public void setAleitamentoMaternoIsSet(boolean value) {
        instance.setAleitamentoMaternoIsSet(value);
    }

    public long getDumDaGestante() {
        return instance.getDumDaGestante();
    }

    public void setDumDaGestante(long dumDaGestante) {
        instance.setDumDaGestante(dumDaGestante);
    }

    public void unsetDumDaGestante() {
        instance.unsetDumDaGestante();
    }

    public boolean isSetDumDaGestante() {
        return instance.isSetDumDaGestante();
    }

    public void setDumDaGestanteIsSet(boolean value) {
        instance.setDumDaGestanteIsSet(value);
    }

    public int getIdadeGestacional() {
        return instance.getIdadeGestacional();
    }

    public void setIdadeGestacional(int idadeGestacional) {
        instance.setIdadeGestacional(idadeGestacional);
    }

    public void unsetIdadeGestacional() {
        instance.unsetIdadeGestacional();
    }

    public boolean isSetIdadeGestacional() {
        return instance.isSetIdadeGestacional();
    }

    public void setIdadeGestacionalIsSet(boolean value) {
        instance.setIdadeGestacionalIsSet(value);
    }

    public long getAtencaoDomiciliarModalidade() {
        return instance.getAtencaoDomiciliarModalidade();
    }

    public void setAtencaoDomiciliarModalidade(long atencaoDomiciliarModalidade) {
        instance.setAtencaoDomiciliarModalidade(atencaoDomiciliarModalidade);
    }

    public void unsetAtencaoDomiciliarModalidade() {
        instance.unsetAtencaoDomiciliarModalidade();
    }

    public boolean isSetAtencaoDomiciliarModalidade() {
        return instance.isSetAtencaoDomiciliarModalidade();
    }

    public void setAtencaoDomiciliarModalidadeIsSet(boolean value) {
        instance.setAtencaoDomiciliarModalidadeIsSet(value);
    }

    public ProblemaCondicaoAvaliacaoAI getProblemaCondicaoAvaliada() {
        return new ProblemaCondicaoAvaliacaoAI(instance.getProblemaCondicaoAvaliada());
    }

    public void setProblemaCondicaoAvaliada(ProblemaCondicaoAvaliacaoAI problemaCondicaoAvaliada) {
        instance.setProblemaCondicaoAvaliada(problemaCondicaoAvaliada.getInstance());
    }

    public void unsetProblemaCondicaoAvaliada() {
        instance.unsetProblemaCondicaoAvaliada();
    }

    public boolean isSetProblemaCondicaoAvaliada() {
        return instance.isSetProblemaCondicaoAvaliada();
    }

    public void setProblemaCondicaoAvaliadaIsSet(boolean value) {
        instance.setProblemaCondicaoAvaliadaIsSet(value);
    }

    public int getExamesSolicitadosSize() {
        return instance.getExamesSolicitadosSize();
    }

    public Iterator<String> getExamesSolicitadosIterator() {
        return instance.getExamesSolicitadosIterator();
    }

    public void addToExamesSolicitados(String elem) {
        instance.addToExamesSolicitados(elem);
    }

    public List<String> getExamesSolicitados() {
        return instance.getExamesSolicitados();
    }

    public void setExamesSolicitados(List<String> examesSolicitados) {
        instance.setExamesSolicitados(examesSolicitados);
    }

    public void unsetExamesSolicitados() {
        instance.unsetExamesSolicitados();
    }

    public boolean isSetExamesSolicitados() {
        return instance.isSetExamesSolicitados();
    }

    public void setExamesSolicitadosIsSet(boolean value) {
        instance.setExamesSolicitadosIsSet(value);
    }

    public int getExamesAvaliadosSize() {
        return instance.getExamesAvaliadosSize();
    }

    public Iterator<String> getExamesAvaliadosIterator() {
        return instance.getExamesAvaliadosIterator();
    }

    public void addToExamesAvaliados(String elem) {
        instance.addToExamesAvaliados(elem);
    }

    public List<String> getExamesAvaliados() {
        return instance.getExamesAvaliados();
    }

    public void setExamesAvaliados(List<String> examesAvaliados) {
        instance.setExamesAvaliados(examesAvaliados);
    }

    public void unsetExamesAvaliados() {
        instance.unsetExamesAvaliados();
    }

    public boolean isSetExamesAvaliados() {
        return instance.isSetExamesAvaliados();
    }

    public void setExamesAvaliadosIsSet(boolean value) {
        instance.setExamesAvaliadosIsSet(value);
    }

    public int getOutrosSiaSize() {
        return instance.getOutrosSiaSize();
    }

    public Iterator<OutrosSia> getOutrosSiaIterator() {
        List<OutrosSia> list = new LinkedList<>();
        instance.getOutrosSiaIterator().forEachRemaining(action);
        
        return list.iterator();
    }

    public void addToOutrosSia(OutrosSiaThrift elem) {
        instance.addToOutrosSia(elem);
    }

    public List<OutrosSiaThrift> getOutrosSia() {
        return instance.getOutrosSia();
    }

    public void setOutrosSia(List<OutrosSiaThrift> outrosSia) {
        instance.setOutrosSia(outrosSia);
    }

    public void unsetOutrosSia() {
        instance.unsetOutrosSia();
    }

    public boolean isSetOutrosSia() {
        return instance.isSetOutrosSia();
    }

    public void setOutrosSiaIsSet(boolean value) {
        instance.setOutrosSiaIsSet(value);
    }

    public boolean isVacinaEmDia() {
        return instance.isVacinaEmDia();
    }

    public void setVacinaEmDia(boolean vacinaEmDia) {
        instance.setVacinaEmDia(vacinaEmDia);
    }

    public void unsetVacinaEmDia() {
        instance.unsetVacinaEmDia();
    }

    public boolean isSetVacinaEmDia() {
        return instance.isSetVacinaEmDia();
    }

    public void setVacinaEmDiaIsSet(boolean value) {
        instance.setVacinaEmDiaIsSet(value);
    }

    public long getPic() {
        return instance.getPic();
    }

    public void setPic(long pic) {
        instance.setPic(pic);
    }

    public void unsetPic() {
        instance.unsetPic();
    }

    public boolean isSetPic() {
        return instance.isSetPic();
    }

    public void setPicIsSet(boolean value) {
        instance.setPicIsSet(value);
    }

    public boolean isFicouEmObservacao() {
        return instance.isFicouEmObservacao();
    }

    public void setFicouEmObservacao(boolean ficouEmObservacao) {
        instance.setFicouEmObservacao(ficouEmObservacao);
    }

    public void unsetFicouEmObservacao() {
        instance.unsetFicouEmObservacao();
    }

    public boolean isSetFicouEmObservacao() {
        return instance.isSetFicouEmObservacao();
    }

    public void setFicouEmObservacaoIsSet(boolean value) {
        instance.setFicouEmObservacaoIsSet(value);
    }

    public int getNasfsSize() {
        return instance.getNasfsSize();
    }

    public Iterator<Long> getNasfsIterator() {
        return instance.getNasfsIterator();
    }

    public void addToNasfs(long elem) {
        instance.addToNasfs(elem);
    }

    public List<Long> getNasfs() {
        return instance.getNasfs();
    }

    public void setNasfs(List<Long> nasfs) {
        instance.setNasfs(nasfs);
    }

    public void unsetNasfs() {
        instance.unsetNasfs();
    }

    public boolean isSetNasfs() {
        return instance.isSetNasfs();
    }

    public void setNasfsIsSet(boolean value) {
        instance.setNasfsIsSet(value);
    }

    public int getCondutasSize() {
        return instance.getCondutasSize();
    }

    public Iterator<Long> getCondutasIterator() {
        return instance.getCondutasIterator();
    }

    public void addToCondutas(long elem) {
        instance.addToCondutas(elem);
    }

    public List<Long> getCondutas() {
        return instance.getCondutas();
    }

    public void setCondutas(List<Long> condutas) {
        instance.setCondutas(condutas);
    }

    public void unsetCondutas() {
        instance.unsetCondutas();
    }

    public boolean isSetCondutas() {
        return instance.isSetCondutas();
    }

    public void setCondutasIsSet(boolean value) {
        instance.setCondutasIsSet(value);
    }

    public boolean isStGravidezPlanejada() {
        return instance.isStGravidezPlanejada();
    }

    public void setStGravidezPlanejada(boolean stGravidezPlanejada) {
        instance.setStGravidezPlanejada(stGravidezPlanejada);
    }

    public void unsetStGravidezPlanejada() {
        instance.unsetStGravidezPlanejada();
    }

    public boolean isSetStGravidezPlanejada() {
        return instance.isSetStGravidezPlanejada();
    }

    public void setStGravidezPlanejadaIsSet(boolean value) {
        instance.setStGravidezPlanejadaIsSet(value);
    }

    public int getNuGestasPrevias() {
        return instance.getNuGestasPrevias();
    }

    public void setNuGestasPrevias(int nuGestasPrevias) {
        instance.setNuGestasPrevias(nuGestasPrevias);
    }

    public void unsetNuGestasPrevias() {
        instance.unsetNuGestasPrevias();
    }

    public boolean isSetNuGestasPrevias() {
        return instance.isSetNuGestasPrevias();
    }

    public void setNuGestasPreviasIsSet(boolean value) {
        instance.setNuGestasPreviasIsSet(value);
    }

    public int getNuPartos() {
        return instance.getNuPartos();
    }

    public void setNuPartos(int nuPartos) {
        instance.setNuPartos(nuPartos);
    }

    public void unsetNuPartos() {
        instance.unsetNuPartos();
    }

    public boolean isSetNuPartos() {
        return instance.isSetNuPartos();
    }

    public void setNuPartosIsSet(boolean value) {
        instance.setNuPartosIsSet(value);
    }

    public void setFieldValue(FichaAtendimentoIndividualChildThrift._Fields field, Object value) {
        instance.setFieldValue(field, value);
    }

    public Object getFieldValue(FichaAtendimentoIndividualChildThrift._Fields field) {
        return instance.getFieldValue(field);
    }

    public boolean isSet(FichaAtendimentoIndividualChildThrift._Fields field) {
        return instance.isSet(field);
    }

    public boolean equals(Object that) {
        return instance.equals(that);
    }

    public boolean equals(FichaAtendimentoIndividualChildThrift that) {
        return instance.equals(that);
    }

    public int hashCode() {
        return instance.hashCode();
    }

    public int compareTo(FichaAtendimentoIndividualChildThrift other) {
        return instance.compareTo(other);
    }

    public FichaAtendimentoIndividualChildThrift._Fields fieldForId(int fieldId) {
        return instance.fieldForId(fieldId);
    }

    public void read(TProtocol iprot) throws TException {
        instance.read(iprot);
    }

    public void write(TProtocol oprot) throws TException {
        instance.write(oprot);
    }

    public String toString() {
        return instance.toString();
    }

    public void validate() throws TException {
        instance.validate();
    }
}

