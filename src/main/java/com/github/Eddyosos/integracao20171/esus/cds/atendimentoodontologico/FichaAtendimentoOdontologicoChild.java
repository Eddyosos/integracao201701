package com.github.Eddyosos.integracao20171.esus.cds.atendimentoodontologico;

import br.gov.saude.esus.cds.transport.generated.thrift.atendimentoodontologico.FichaAtendimentoOdontologicoChildThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.atendimentoodontologico.ProcedimentoQuantidadeThrift;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.thrift.TException;


public class FichaAtendimentoOdontologicoChild {
    FichaAtendimentoOdontologicoChildThrift test = new FichaAtendimentoOdontologicoChildThrift();
    
    protected FichaAtendimentoOdontologicoChild(FichaAtendimentoOdontologicoChildThrift fichaAtendimentoOdontologicoChildThrift){
        this.test = fichaAtendimentoOdontologicoChildThrift;
    }

    public FichaAtendimentoOdontologicoChild deepCopy() {
        return new FichaAtendimentoOdontologicoChild(test.deepCopy());
    }

    public long getDtNascimento() {
        return test.getDtNascimento();
    }

    public void setDtNascimento(long dtNascimento) {
        test.setDtNascimento(dtNascimento);
    }

    public void unsetDtNascimento() {
        test.unsetDtNascimento();
    }

    public boolean isSetDtNascimento() {
        return test.isSetDtNascimento();
    }

    public void setDtNascimentoIsSet(boolean value) {
        test.setDtNascimentoIsSet(value);
    }

    public String getNumCartaoSus() {
        return test.getNumCartaoSus();
    }

    public void setNumCartaoSus(String numCartaoSus) {
        test.setNumCartaoSus(numCartaoSus);
    }

    public void unsetNumCartaoSus() {
        test.unsetNumCartaoSus();
    }

    public boolean isSetNumCartaoSus() {
        return test.isSetNumCartaoSus();
    }

    public void setNumCartaoSusIsSet(boolean value) {
        test.setNumCartaoSusIsSet(value);
    }

    public String getNumProntuario() {
        return test.getNumProntuario();
    }

    public void setNumProntuario(String numProntuario) {
        test.setNumProntuario(numProntuario);
    }

    public void unsetNumProntuario() {
        test.unsetNumProntuario();
    }

    public boolean isSetNumProntuario() {
        return test.isSetNumProntuario();
    }

    public void setNumProntuarioIsSet(boolean value) {
        test.setNumProntuarioIsSet(value);
    }

    public boolean isGestante() {
        return test.isGestante();
    }

    public void setGestante(boolean gestante) {
        test.setGestante(gestante);
    }

    public void unsetGestante() {
        test.unsetGestante();
    }

    public boolean isSetGestante() {
        return test.isSetGestante();
    }

    public void setGestanteIsSet(boolean value) {
        test.setGestanteIsSet(value);
    }

    public boolean isNecessidadesEspeciais() {
        return test.isNecessidadesEspeciais();
    }

    public void setNecessidadesEspeciais(boolean necessidadesEspeciais) {
        test.setNecessidadesEspeciais(necessidadesEspeciais);
    }

    public void unsetNecessidadesEspeciais() {
        test.unsetNecessidadesEspeciais();
    }

    public boolean isSetNecessidadesEspeciais() {
        return test.isSetNecessidadesEspeciais();
    }

    public void setNecessidadesEspeciaisIsSet(boolean value) {
        test.setNecessidadesEspeciaisIsSet(value);
    }

    public long getLocalAtendimento() {
        return test.getLocalAtendimento();
    }

    public void setLocalAtendimento(long localAtendimento) {
        test.setLocalAtendimento(localAtendimento);
    }

    public void unsetLocalAtendimento() {
        test.unsetLocalAtendimento();
    }

    public boolean isSetLocalAtendimento() {
        return test.isSetLocalAtendimento();
    }

    public void setLocalAtendimentoIsSet(boolean value) {
        test.setLocalAtendimentoIsSet(value);
    }

    public long getTipoAtendimento() {
        return test.getTipoAtendimento();
    }

    public void setTipoAtendimento(long tipoAtendimento) {
        test.setTipoAtendimento(tipoAtendimento);
    }

    public void unsetTipoAtendimento() {
        test.unsetTipoAtendimento();
    }

    public boolean isSetTipoAtendimento() {
        return test.isSetTipoAtendimento();
    }

    public void setTipoAtendimentoIsSet(boolean value) {
        test.setTipoAtendimentoIsSet(value);
    }

    public int getTiposEncamOdontoSize() {
        return test.getTiposEncamOdontoSize();
    }

    public Iterator<Long> getTiposEncamOdontoIterator() {
        return test.getTiposEncamOdontoIterator();
    }

    public void addToTiposEncamOdonto(long elem) {
        test.addToTiposEncamOdonto(elem);
    }

    public List<Long> getTiposEncamOdonto() {
        return test.getTiposEncamOdonto();
    }

    public void setTiposEncamOdonto(List<Long> tiposEncamOdonto) {
        test.setTiposEncamOdonto(tiposEncamOdonto);
    }

    public void unsetTiposEncamOdonto() {
        test.unsetTiposEncamOdonto();
    }

    public boolean isSetTiposEncamOdonto() {
        return test.isSetTiposEncamOdonto();
    }

    public void setTiposEncamOdontoIsSet(boolean value) {
        test.setTiposEncamOdontoIsSet(value);
    }

    public int getTiposFornecimOdontoSize() {
        return test.getTiposFornecimOdontoSize();
    }

    public Iterator<Long> getTiposFornecimOdontoIterator() {
        return test.getTiposFornecimOdontoIterator();
    }

    public void addToTiposFornecimOdonto(long elem) {
        test.addToTiposFornecimOdonto(elem);
    }

    public List<Long> getTiposFornecimOdonto() {
        return test.getTiposFornecimOdonto();
    }

    public void setTiposFornecimOdonto(List<Long> tiposFornecimOdonto) {
        test.setTiposFornecimOdonto(tiposFornecimOdonto);
    }

    public void unsetTiposFornecimOdonto() {
        test.unsetTiposFornecimOdonto();
    }

    public boolean isSetTiposFornecimOdonto() {
        return test.isSetTiposFornecimOdonto();
    }

    public void setTiposFornecimOdontoIsSet(boolean value) {
        test.setTiposFornecimOdontoIsSet(value);
    }

    public int getTiposVigilanciaSaudeBucalSize() {
        return test.getTiposVigilanciaSaudeBucalSize();
    }

    public Iterator<Long> getTiposVigilanciaSaudeBucalIterator() {
        return test.getTiposVigilanciaSaudeBucalIterator();
    }

    public void addToTiposVigilanciaSaudeBucal(long elem) {
        test.addToTiposVigilanciaSaudeBucal(elem);
    }

    public List<Long> getTiposVigilanciaSaudeBucal() {
        return test.getTiposVigilanciaSaudeBucal();
    }

    public void setTiposVigilanciaSaudeBucal(List<Long> tiposVigilanciaSaudeBucal) {
        test.setTiposVigilanciaSaudeBucal(tiposVigilanciaSaudeBucal);
    }

    public void unsetTiposVigilanciaSaudeBucal() {
        test.unsetTiposVigilanciaSaudeBucal();
    }

    public boolean isSetTiposVigilanciaSaudeBucal() {
        return test.isSetTiposVigilanciaSaudeBucal();
    }

    public void setTiposVigilanciaSaudeBucalIsSet(boolean value) {
        test.setTiposVigilanciaSaudeBucalIsSet(value);
    }

    public int getTiposConsultaOdontoSize() {
        return test.getTiposConsultaOdontoSize();
    }

    public Iterator<Long> getTiposConsultaOdontoIterator() {
        return test.getTiposConsultaOdontoIterator();
    }

    public void addToTiposConsultaOdonto(long elem) {
        test.addToTiposConsultaOdonto(elem);
    }

    public List<Long> getTiposConsultaOdonto() {
        return test.getTiposConsultaOdonto();
    }

    public void setTiposConsultaOdonto(List<Long> tiposConsultaOdonto) {
        test.setTiposConsultaOdonto(tiposConsultaOdonto);
    }

    public void unsetTiposConsultaOdonto() {
        test.unsetTiposConsultaOdonto();
    }

    public boolean isSetTiposConsultaOdonto() {
        return test.isSetTiposConsultaOdonto();
    }

    public void setTiposConsultaOdontoIsSet(boolean value) {
        test.setTiposConsultaOdontoIsSet(value);
    }

    public int getProcedimentosRealizadosSize() {
        return test.getProcedimentosRealizadosSize();
    }

    public Iterator<ProcedimentoQuantidade> getProcedimentosRealizadosIterator() {
        
        List<ProcedimentoQuantidade> listaProcedimentoQuantidade = new LinkedList<>();
        
        test.getProcedimentosRealizadosIterator().forEachRemaining((t) -> {
            listaProcedimentoQuantidade.add(new ProcedimentoQuantidade(t));
        });
        
        return listaProcedimentoQuantidade.iterator();
    }

    public void addToProcedimentosRealizados(ProcedimentoQuantidade elem) {
        test.addToProcedimentosRealizados(elem.getInstance());
    }

    public List<ProcedimentoQuantidade> getProcedimentosRealizados() {
        
        List<ProcedimentoQuantidade> listaProcedimentoQuantidade = new LinkedList<>();
        
        test.getProcedimentosRealizados().forEach((t) -> {
            listaProcedimentoQuantidade.add(new ProcedimentoQuantidade(t));
        });
        
        
        return listaProcedimentoQuantidade;
    }

    public void setProcedimentosRealizados(List<ProcedimentoQuantidade> procedimentosRealizados) {
        
        List<ProcedimentoQuantidadeThrift> listaProcedimentoQuantidade = new LinkedList<>();
        
        procedimentosRealizados.forEach((t) -> {
            listaProcedimentoQuantidade.add(t.getInstance());
        });
        
        test.setProcedimentosRealizados(listaProcedimentoQuantidade);
    }

    public void unsetProcedimentosRealizados() {
        test.unsetProcedimentosRealizados();
    }

    public boolean isSetProcedimentosRealizados() {
        return test.isSetProcedimentosRealizados();
    }

    public void setProcedimentosRealizadosIsSet(boolean value) {
        test.setProcedimentosRealizadosIsSet(value);
    }

    public int getOutrosSiaProcedimentosSize() {
        return test.getOutrosSiaProcedimentosSize();
    }

    public Iterator<ProcedimentoQuantidade> getOutrosSiaProcedimentosIterator() {
        
        List<ProcedimentoQuantidade> listaProcedimentoQuantidade = new LinkedList<>();
        
        test.getOutrosSiaProcedimentosIterator().forEachRemaining((t) -> {
            listaProcedimentoQuantidade.add(new ProcedimentoQuantidade(t));
        });
        
        return listaProcedimentoQuantidade.iterator();
    }

    public void addToOutrosSiaProcedimentos(ProcedimentoQuantidade elem) {
        test.addToOutrosSiaProcedimentos(elem.getInstance());
    }

    public List<ProcedimentoQuantidade> getOutrosSiaProcedimentos() {
        
        List<ProcedimentoQuantidade> listaProcedimentoQuantidade = new LinkedList<>();
        
        test.getOutrosSiaProcedimentos().forEach((t) -> {
            listaProcedimentoQuantidade.add(new ProcedimentoQuantidade(t));
        });
        
        return listaProcedimentoQuantidade;
    }

    public void setOutrosSiaProcedimentos(List<ProcedimentoQuantidade> outrosSiaProcedimentos) {
        
        List<ProcedimentoQuantidadeThrift> listaProcedimentoQuantidade = new LinkedList<>();
        
        outrosSiaProcedimentos.forEach((t) -> {
            listaProcedimentoQuantidade.add(t.getInstance());
        });
        
        test.setOutrosSiaProcedimentos(listaProcedimentoQuantidade);
    }

    public void unsetOutrosSiaProcedimentos() {
        test.unsetOutrosSiaProcedimentos();
    }

    public boolean isSetOutrosSiaProcedimentos() {
        return test.isSetOutrosSiaProcedimentos();
    }

    public void setOutrosSiaProcedimentosIsSet(boolean value) {
        test.setOutrosSiaProcedimentosIsSet(value);
    }

    public long getSexo() {
        return test.getSexo();
    }

    public void setSexo(long sexo) {
        test.setSexo(sexo);
    }

    public void unsetSexo() {
        test.unsetSexo();
    }

    public boolean isSetSexo() {
        return test.isSetSexo();
    }

    public void setSexoIsSet(boolean value) {
        test.setSexoIsSet(value);
    }

    public long getTurno() {
        return test.getTurno();
    }

    public void setTurno(long turno) {
        test.setTurno(turno);
    }

    public void unsetTurno() {
        test.unsetTurno();
    }

    public boolean isSetTurno() {
        return test.isSetTurno();
    }

    public void setTurnoIsSet(boolean value) {
        test.setTurnoIsSet(value);
    }

    @Override
    public boolean equals(Object that) {
        return test.equals(that);
    }

    public boolean equals(FichaAtendimentoOdontologicoChild that) {
        return test.equals(that.getInstance());
    }

    @Override
    public int hashCode() {
        return test.hashCode();
    }

    public int compareTo(FichaAtendimentoOdontologicoChild other) {
        return test.compareTo(other.getInstance());
    }

    public String toString() {
        return test.toString();
    }

    public void validate() throws TException {
        test.validate();
    }
    
    protected FichaAtendimentoOdontologicoChildThrift getInstance(){
        return test;
    }
    
}

