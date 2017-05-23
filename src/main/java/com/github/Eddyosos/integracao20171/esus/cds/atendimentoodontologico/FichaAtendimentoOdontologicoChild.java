package com.github.Eddyosos.integracao20171.esus.cds.atendimentoodontologico;

import br.gov.saude.esus.cds.transport.generated.thrift.atendimentoodontologico.FichaAtendimentoOdontologicoChildThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.atendimentoodontologico.ProcedimentoQuantidadeThrift;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;


public class FichaAtendimentoOdontologicoChild {
    FichaAtendimentoOdontologicoChildThrift fichaAtendimentoOdontologicoChildThrift = new FichaAtendimentoOdontologicoChildThrift();
    
    protected FichaAtendimentoOdontologicoChild(FichaAtendimentoOdontologicoChildThrift fichaAtendimentoOdontologicoChildThrift){
        this.fichaAtendimentoOdontologicoChildThrift = fichaAtendimentoOdontologicoChildThrift;
    }

    public FichaAtendimentoOdontologicoChild deepCopy() {
        return new FichaAtendimentoOdontologicoChild(fichaAtendimentoOdontologicoChildThrift.deepCopy());
    }

    public void clear() {
        fichaAtendimentoOdontologicoChildThrift.clear();
    }

    public long getDtNascimento() {
        return fichaAtendimentoOdontologicoChildThrift.getDtNascimento();
    }

    public void setDtNascimento(long dtNascimento) {
        fichaAtendimentoOdontologicoChildThrift.setDtNascimento(dtNascimento);
    }

    public void unsetDtNascimento() {
        fichaAtendimentoOdontologicoChildThrift.unsetDtNascimento();
    }

    public boolean isSetDtNascimento() {
        return fichaAtendimentoOdontologicoChildThrift.isSetDtNascimento();
    }

    public void setDtNascimentoIsSet(boolean value) {
        fichaAtendimentoOdontologicoChildThrift.setDtNascimentoIsSet(value);
    }

    public String getNumCartaoSus() {
        return fichaAtendimentoOdontologicoChildThrift.getNumCartaoSus();
    }

    public void setNumCartaoSus(String numCartaoSus) {
        fichaAtendimentoOdontologicoChildThrift.setNumCartaoSus(numCartaoSus);
    }

    public void unsetNumCartaoSus() {
        fichaAtendimentoOdontologicoChildThrift.unsetNumCartaoSus();
    }

    public boolean isSetNumCartaoSus() {
        return fichaAtendimentoOdontologicoChildThrift.isSetNumCartaoSus();
    }

    public void setNumCartaoSusIsSet(boolean value) {
        fichaAtendimentoOdontologicoChildThrift.setNumCartaoSusIsSet(value);
    }

    public String getNumProntuario() {
        return fichaAtendimentoOdontologicoChildThrift.getNumProntuario();
    }

    public void setNumProntuario(String numProntuario) {
        fichaAtendimentoOdontologicoChildThrift.setNumProntuario(numProntuario);
    }

    public void unsetNumProntuario() {
        fichaAtendimentoOdontologicoChildThrift.unsetNumProntuario();
    }

    public boolean isSetNumProntuario() {
        return fichaAtendimentoOdontologicoChildThrift.isSetNumProntuario();
    }

    public void setNumProntuarioIsSet(boolean value) {
        fichaAtendimentoOdontologicoChildThrift.setNumProntuarioIsSet(value);
    }

    public boolean isGestante() {
        return fichaAtendimentoOdontologicoChildThrift.isGestante();
    }

    public void setGestante(boolean gestante) {
        fichaAtendimentoOdontologicoChildThrift.setGestante(gestante);
    }

    public void unsetGestante() {
        fichaAtendimentoOdontologicoChildThrift.unsetGestante();
    }

    public boolean isSetGestante() {
        return fichaAtendimentoOdontologicoChildThrift.isSetGestante();
    }

    public void setGestanteIsSet(boolean value) {
        fichaAtendimentoOdontologicoChildThrift.setGestanteIsSet(value);
    }

    public boolean isNecessidadesEspeciais() {
        return fichaAtendimentoOdontologicoChildThrift.isNecessidadesEspeciais();
    }

    public void setNecessidadesEspeciais(boolean necessidadesEspeciais) {
        fichaAtendimentoOdontologicoChildThrift.setNecessidadesEspeciais(necessidadesEspeciais);
    }

    public void unsetNecessidadesEspeciais() {
        fichaAtendimentoOdontologicoChildThrift.unsetNecessidadesEspeciais();
    }

    public boolean isSetNecessidadesEspeciais() {
        return fichaAtendimentoOdontologicoChildThrift.isSetNecessidadesEspeciais();
    }

    public void setNecessidadesEspeciaisIsSet(boolean value) {
        fichaAtendimentoOdontologicoChildThrift.setNecessidadesEspeciaisIsSet(value);
    }

    public long getLocalAtendimento() {
        return fichaAtendimentoOdontologicoChildThrift.getLocalAtendimento();
    }

    public void setLocalAtendimento(long localAtendimento) {
        fichaAtendimentoOdontologicoChildThrift.setLocalAtendimento(localAtendimento);
    }

    public void unsetLocalAtendimento() {
        fichaAtendimentoOdontologicoChildThrift.unsetLocalAtendimento();
    }

    public boolean isSetLocalAtendimento() {
        return fichaAtendimentoOdontologicoChildThrift.isSetLocalAtendimento();
    }

    public void setLocalAtendimentoIsSet(boolean value) {
        fichaAtendimentoOdontologicoChildThrift.setLocalAtendimentoIsSet(value);
    }

    public long getTipoAtendimento() {
        return fichaAtendimentoOdontologicoChildThrift.getTipoAtendimento();
    }

    public void setTipoAtendimento(long tipoAtendimento) {
        fichaAtendimentoOdontologicoChildThrift.setTipoAtendimento(tipoAtendimento);
    }

    public void unsetTipoAtendimento() {
        fichaAtendimentoOdontologicoChildThrift.unsetTipoAtendimento();
    }

    public boolean isSetTipoAtendimento() {
        return fichaAtendimentoOdontologicoChildThrift.isSetTipoAtendimento();
    }

    public void setTipoAtendimentoIsSet(boolean value) {
        fichaAtendimentoOdontologicoChildThrift.setTipoAtendimentoIsSet(value);
    }

    public int getTiposEncamOdontoSize() {
        return fichaAtendimentoOdontologicoChildThrift.getTiposEncamOdontoSize();
    }

    public Iterator<Long> getTiposEncamOdontoIterator() {
        return fichaAtendimentoOdontologicoChildThrift.getTiposEncamOdontoIterator();
    }

    public void addToTiposEncamOdonto(long elem) {
        fichaAtendimentoOdontologicoChildThrift.addToTiposEncamOdonto(elem);
    }

    public List<Long> getTiposEncamOdonto() {
        return fichaAtendimentoOdontologicoChildThrift.getTiposEncamOdonto();
    }

    public void setTiposEncamOdonto(List<Long> tiposEncamOdonto) {
        fichaAtendimentoOdontologicoChildThrift.setTiposEncamOdonto(tiposEncamOdonto);
    }

    public void unsetTiposEncamOdonto() {
        fichaAtendimentoOdontologicoChildThrift.unsetTiposEncamOdonto();
    }

    public boolean isSetTiposEncamOdonto() {
        return fichaAtendimentoOdontologicoChildThrift.isSetTiposEncamOdonto();
    }

    public void setTiposEncamOdontoIsSet(boolean value) {
        fichaAtendimentoOdontologicoChildThrift.setTiposEncamOdontoIsSet(value);
    }

    public int getTiposFornecimOdontoSize() {
        return fichaAtendimentoOdontologicoChildThrift.getTiposFornecimOdontoSize();
    }

    public Iterator<Long> getTiposFornecimOdontoIterator() {
        return fichaAtendimentoOdontologicoChildThrift.getTiposFornecimOdontoIterator();
    }

    public void addToTiposFornecimOdonto(long elem) {
        fichaAtendimentoOdontologicoChildThrift.addToTiposFornecimOdonto(elem);
    }

    public List<Long> getTiposFornecimOdonto() {
        return fichaAtendimentoOdontologicoChildThrift.getTiposFornecimOdonto();
    }

    public void setTiposFornecimOdonto(List<Long> tiposFornecimOdonto) {
        fichaAtendimentoOdontologicoChildThrift.setTiposFornecimOdonto(tiposFornecimOdonto);
    }

    public void unsetTiposFornecimOdonto() {
        fichaAtendimentoOdontologicoChildThrift.unsetTiposFornecimOdonto();
    }

    public boolean isSetTiposFornecimOdonto() {
        return fichaAtendimentoOdontologicoChildThrift.isSetTiposFornecimOdonto();
    }

    public void setTiposFornecimOdontoIsSet(boolean value) {
        fichaAtendimentoOdontologicoChildThrift.setTiposFornecimOdontoIsSet(value);
    }

    public int getTiposVigilanciaSaudeBucalSize() {
        return fichaAtendimentoOdontologicoChildThrift.getTiposVigilanciaSaudeBucalSize();
    }

    public Iterator<Long> getTiposVigilanciaSaudeBucalIterator() {
        return fichaAtendimentoOdontologicoChildThrift.getTiposVigilanciaSaudeBucalIterator();
    }

    public void addToTiposVigilanciaSaudeBucal(long elem) {
        fichaAtendimentoOdontologicoChildThrift.addToTiposVigilanciaSaudeBucal(elem);
    }

    public List<Long> getTiposVigilanciaSaudeBucal() {
        return fichaAtendimentoOdontologicoChildThrift.getTiposVigilanciaSaudeBucal();
    }

    public void setTiposVigilanciaSaudeBucal(List<Long> tiposVigilanciaSaudeBucal) {
        fichaAtendimentoOdontologicoChildThrift.setTiposVigilanciaSaudeBucal(tiposVigilanciaSaudeBucal);
    }

    public void unsetTiposVigilanciaSaudeBucal() {
        fichaAtendimentoOdontologicoChildThrift.unsetTiposVigilanciaSaudeBucal();
    }

    public boolean isSetTiposVigilanciaSaudeBucal() {
        return fichaAtendimentoOdontologicoChildThrift.isSetTiposVigilanciaSaudeBucal();
    }

    public void setTiposVigilanciaSaudeBucalIsSet(boolean value) {
        fichaAtendimentoOdontologicoChildThrift.setTiposVigilanciaSaudeBucalIsSet(value);
    }

    public int getTiposConsultaOdontoSize() {
        return fichaAtendimentoOdontologicoChildThrift.getTiposConsultaOdontoSize();
    }

    public Iterator<Long> getTiposConsultaOdontoIterator() {
        return fichaAtendimentoOdontologicoChildThrift.getTiposConsultaOdontoIterator();
    }

    public void addToTiposConsultaOdonto(long elem) {
        fichaAtendimentoOdontologicoChildThrift.addToTiposConsultaOdonto(elem);
    }

    public List<Long> getTiposConsultaOdonto() {
        return fichaAtendimentoOdontologicoChildThrift.getTiposConsultaOdonto();
    }

    public void setTiposConsultaOdonto(List<Long> tiposConsultaOdonto) {
        fichaAtendimentoOdontologicoChildThrift.setTiposConsultaOdonto(tiposConsultaOdonto);
    }

    public void unsetTiposConsultaOdonto() {
        fichaAtendimentoOdontologicoChildThrift.unsetTiposConsultaOdonto();
    }

    public boolean isSetTiposConsultaOdonto() {
        return fichaAtendimentoOdontologicoChildThrift.isSetTiposConsultaOdonto();
    }

    public void setTiposConsultaOdontoIsSet(boolean value) {
        fichaAtendimentoOdontologicoChildThrift.setTiposConsultaOdontoIsSet(value);
    }

    public int getProcedimentosRealizadosSize() {
        return fichaAtendimentoOdontologicoChildThrift.getProcedimentosRealizadosSize();
    }

    public Iterator<ProcedimentoQuantidade> getProcedimentosRealizadosIterator() {
        List<ProcedimentoQuantidade> listaProcedimentoQuantidade = new LinkedList<>();
        
        fichaAtendimentoOdontologicoChildThrift.getProcedimentosRealizadosIterator().forEachRemaining((elemento) -> {
            listaProcedimentoQuantidade.add(new ProcedimentoQuantidade(elemento));
        });
        
        return listaProcedimentoQuantidade.iterator();
    }

    public void addToProcedimentosRealizados(ProcedimentoQuantidade elem) {
        fichaAtendimentoOdontologicoChildThrift.addToProcedimentosRealizados(elem.getInstance());
    }

    public List<ProcedimentoQuantidade> getProcedimentosRealizados() {
        List<ProcedimentoQuantidade> listaProcedimentoQuantidade = new LinkedList<>();
        
        fichaAtendimentoOdontologicoChildThrift.getProcedimentosRealizados().forEach((elemento) -> {
            listaProcedimentoQuantidade.add(new ProcedimentoQuantidade(elemento));
        });
        
        return listaProcedimentoQuantidade;
    }

    public void setProcedimentosRealizados(List<ProcedimentoQuantidade> procedimentosRealizados) {
        List<ProcedimentoQuantidadeThrift> listaProcedimentoQuantidadeThrift = new LinkedList<>();
        
        procedimentosRealizados.forEach((elemento) -> {
            listaProcedimentoQuantidadeThrift.add(elemento.getInstance());
        });
        
        fichaAtendimentoOdontologicoChildThrift.setProcedimentosRealizados(listaProcedimentoQuantidadeThrift);
    }

    public void unsetProcedimentosRealizados() {
        fichaAtendimentoOdontologicoChildThrift.unsetProcedimentosRealizados();
    }

    public boolean isSetProcedimentosRealizados() {
        return fichaAtendimentoOdontologicoChildThrift.isSetProcedimentosRealizados();
    }

    public void setProcedimentosRealizadosIsSet(boolean value) {
        fichaAtendimentoOdontologicoChildThrift.setProcedimentosRealizadosIsSet(value);
    }

    public int getOutrosSiaProcedimentosSize() {
        return fichaAtendimentoOdontologicoChildThrift.getOutrosSiaProcedimentosSize();
    }

    public Iterator<ProcedimentoQuantidade> getOutrosSiaProcedimentosIterator() {
        List<ProcedimentoQuantidade> listaProcedimentoQuantidade = new LinkedList<>();
        
        fichaAtendimentoOdontologicoChildThrift.getOutrosSiaProcedimentosIterator().forEachRemaining((elemento) -> {
            listaProcedimentoQuantidade.add(new ProcedimentoQuantidade(elemento));
        });
        
        return listaProcedimentoQuantidade.iterator();
    }

    public void addToOutrosSiaProcedimentos(ProcedimentoQuantidade elem) {
        fichaAtendimentoOdontologicoChildThrift.addToOutrosSiaProcedimentos(elem.getInstance());
    }

    public List<ProcedimentoQuantidade> getOutrosSiaProcedimentos() {
         List<ProcedimentoQuantidade> listaProcedimentoQuantidade = new LinkedList<>();
        
        fichaAtendimentoOdontologicoChildThrift.getOutrosSiaProcedimentos().forEach((elemento) -> {
            listaProcedimentoQuantidade.add(new ProcedimentoQuantidade(elemento));
        });
        
        return listaProcedimentoQuantidade;
    }

    public void setOutrosSiaProcedimentos(List<ProcedimentoQuantidade> outrosSiaProcedimentos) {
        List<ProcedimentoQuantidadeThrift> listaProcedimentoQuantidadeThrift = new LinkedList<>();
        
        outrosSiaProcedimentos.forEach((elemento) -> {
            listaProcedimentoQuantidadeThrift.add(elemento.getInstance());
        });
                
        fichaAtendimentoOdontologicoChildThrift.setOutrosSiaProcedimentos(listaProcedimentoQuantidadeThrift);
    }

    public void unsetOutrosSiaProcedimentos() {
        fichaAtendimentoOdontologicoChildThrift.unsetOutrosSiaProcedimentos();
    }

    public boolean isSetOutrosSiaProcedimentos() {
        return fichaAtendimentoOdontologicoChildThrift.isSetOutrosSiaProcedimentos();
    }

    public void setOutrosSiaProcedimentosIsSet(boolean value) {
        fichaAtendimentoOdontologicoChildThrift.setOutrosSiaProcedimentosIsSet(value);
    }

    public long getSexo() {
        return fichaAtendimentoOdontologicoChildThrift.getSexo();
    }

    public void setSexo(long sexo) {
        fichaAtendimentoOdontologicoChildThrift.setSexo(sexo);
    }

    public void unsetSexo() {
        fichaAtendimentoOdontologicoChildThrift.unsetSexo();
    }

    public boolean isSetSexo() {
        return fichaAtendimentoOdontologicoChildThrift.isSetSexo();
    }

    public void setSexoIsSet(boolean value) {
        fichaAtendimentoOdontologicoChildThrift.setSexoIsSet(value);
    }

    public long getTurno() {
        return fichaAtendimentoOdontologicoChildThrift.getTurno();
    }

    public void setTurno(long turno) {
        fichaAtendimentoOdontologicoChildThrift.setTurno(turno);
    }

    public void unsetTurno() {
        fichaAtendimentoOdontologicoChildThrift.unsetTurno();
    }

    public boolean isSetTurno() {
        return fichaAtendimentoOdontologicoChildThrift.isSetTurno();
    }

    public void setTurnoIsSet(boolean value) {
        fichaAtendimentoOdontologicoChildThrift.setTurnoIsSet(value);
    }

    @Override
    public boolean equals(Object that) {
        return fichaAtendimentoOdontologicoChildThrift.equals(that);
    }

    public boolean equals(FichaAtendimentoOdontologicoChild that) {
        return fichaAtendimentoOdontologicoChildThrift.equals(that.getInstance());
    }

    public int hashCode() {
        return fichaAtendimentoOdontologicoChildThrift.hashCode();
    }

    public int compareTo(FichaAtendimentoOdontologicoChild other) {
        return fichaAtendimentoOdontologicoChildThrift.compareTo(other.getInstance());
    }

    @Override
    public String toString() {
        return fichaAtendimentoOdontologicoChildThrift.toString();
    }

    public void validate() throws TException {
        fichaAtendimentoOdontologicoChildThrift.validate();
    }

    protected FichaAtendimentoOdontologicoChildThrift getInstance(){
        return fichaAtendimentoOdontologicoChildThrift;
    }
    
}

