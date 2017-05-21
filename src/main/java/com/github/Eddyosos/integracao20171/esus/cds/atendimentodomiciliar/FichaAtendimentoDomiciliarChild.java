package com.github.Eddyosos.integracao20171.esus.cds.atendimentodomiciliar;

import br.gov.saude.esus.cds.transport.generated.thrift.atendimentodomiciliar.FichaAtendimentoDomiciliarChildThrift;
import java.util.Iterator;
import java.util.List;
import org.apache.thrift.TException;


public class FichaAtendimentoDomiciliarChild {
    FichaAtendimentoDomiciliarChildThrift fichaAtendimentoDomiciliarChildThrift = new FichaAtendimentoDomiciliarChildThrift();
    
    protected FichaAtendimentoDomiciliarChild(FichaAtendimentoDomiciliarChildThrift fichaAtendimentoDomiciliarChildThrift){
        this.fichaAtendimentoDomiciliarChildThrift = fichaAtendimentoDomiciliarChildThrift;
    }

    public FichaAtendimentoDomiciliarChild deepCopy() {
        return new FichaAtendimentoDomiciliarChild(fichaAtendimentoDomiciliarChildThrift.deepCopy());
    }

    public long getTurno() {
        return fichaAtendimentoDomiciliarChildThrift.getTurno();
    }

    public void setTurno(long turno) {
        fichaAtendimentoDomiciliarChildThrift.setTurno(turno);
    }

    public void unsetTurno() {
        fichaAtendimentoDomiciliarChildThrift.unsetTurno();
    }

    public boolean isSetTurno() {
        return fichaAtendimentoDomiciliarChildThrift.isSetTurno();
    }

    public void setTurnoIsSet(boolean value) {
        fichaAtendimentoDomiciliarChildThrift.setTurnoIsSet(value);
    }

    public String getCns() {
        return fichaAtendimentoDomiciliarChildThrift.getCns();
    }

    public void setCns(String cns) {
        fichaAtendimentoDomiciliarChildThrift.setCns(cns);
    }

    public void unsetCns() {
        fichaAtendimentoDomiciliarChildThrift.unsetCns();
    }

    public boolean isSetCns() {
        return fichaAtendimentoDomiciliarChildThrift.isSetCns();
    }

    public void setCnsIsSet(boolean value) {
        fichaAtendimentoDomiciliarChildThrift.setCnsIsSet(value);
    }

    public long getDataNascimento() {
        return fichaAtendimentoDomiciliarChildThrift.getDataNascimento();
    }

    public void setDataNascimento(long dataNascimento) {
        fichaAtendimentoDomiciliarChildThrift.setDataNascimento(dataNascimento);
    }

    public void unsetDataNascimento() {
        fichaAtendimentoDomiciliarChildThrift.unsetDataNascimento();
    }

    public boolean isSetDataNascimento() {
        return fichaAtendimentoDomiciliarChildThrift.isSetDataNascimento();
    }

    public void setDataNascimentoIsSet(boolean value) {
        fichaAtendimentoDomiciliarChildThrift.setDataNascimentoIsSet(value);
    }

    public long getSexo() {
        return fichaAtendimentoDomiciliarChildThrift.getSexo();
    }

    public void setSexo(long sexo) {
        fichaAtendimentoDomiciliarChildThrift.setSexo(sexo);
    }

    public void unsetSexo() {
        fichaAtendimentoDomiciliarChildThrift.unsetSexo();
    }

    public boolean isSetSexo() {
        return fichaAtendimentoDomiciliarChildThrift.isSetSexo();
    }

    public void setSexoIsSet(boolean value) {
        fichaAtendimentoDomiciliarChildThrift.setSexoIsSet(value);
    }

    public long getLocalAtendimento() {
        return fichaAtendimentoDomiciliarChildThrift.getLocalAtendimento();
    }

    public void setLocalAtendimento(long localAtendimento) {
        fichaAtendimentoDomiciliarChildThrift.setLocalAtendimento(localAtendimento);
    }

    public void unsetLocalAtendimento() {
        fichaAtendimentoDomiciliarChildThrift.unsetLocalAtendimento();
    }

    public boolean isSetLocalAtendimento() {
        return fichaAtendimentoDomiciliarChildThrift.isSetLocalAtendimento();
    }

    public void setLocalAtendimentoIsSet(boolean value) {
        fichaAtendimentoDomiciliarChildThrift.setLocalAtendimentoIsSet(value);
    }

    public long getAtencaoDomiciliarModalidade() {
        return fichaAtendimentoDomiciliarChildThrift.getAtencaoDomiciliarModalidade();
    }

    public void setAtencaoDomiciliarModalidade(long atencaoDomiciliarModalidade) {
        fichaAtendimentoDomiciliarChildThrift.setAtencaoDomiciliarModalidade(atencaoDomiciliarModalidade);
    }

    public void unsetAtencaoDomiciliarModalidade() {
        fichaAtendimentoDomiciliarChildThrift.unsetAtencaoDomiciliarModalidade();
    }

    public boolean isSetAtencaoDomiciliarModalidade() {
        return fichaAtendimentoDomiciliarChildThrift.isSetAtencaoDomiciliarModalidade();
    }

    public void setAtencaoDomiciliarModalidadeIsSet(boolean value) {
        fichaAtendimentoDomiciliarChildThrift.setAtencaoDomiciliarModalidadeIsSet(value);
    }

    public long getTipoAtendimento() {
        return fichaAtendimentoDomiciliarChildThrift.getTipoAtendimento();
    }

    public void setTipoAtendimento(long tipoAtendimento) {
        fichaAtendimentoDomiciliarChildThrift.setTipoAtendimento(tipoAtendimento);
    }

    public void unsetTipoAtendimento() {
        fichaAtendimentoDomiciliarChildThrift.unsetTipoAtendimento();
    }

    public boolean isSetTipoAtendimento() {
        return fichaAtendimentoDomiciliarChildThrift.isSetTipoAtendimento();
    }

    public void setTipoAtendimentoIsSet(boolean value) {
        fichaAtendimentoDomiciliarChildThrift.setTipoAtendimentoIsSet(value);
    }

    public int getSituacoesPresentesSize() {
        return fichaAtendimentoDomiciliarChildThrift.getSituacoesPresentesSize();
    }

    public Iterator<Long> getSituacoesPresentesIterator() {
        return fichaAtendimentoDomiciliarChildThrift.getSituacoesPresentesIterator();
    }

    public void addToSituacoesPresentes(long elem) {
        fichaAtendimentoDomiciliarChildThrift.addToSituacoesPresentes(elem);
    }

    public List<Long> getSituacoesPresentes() {
        return fichaAtendimentoDomiciliarChildThrift.getSituacoesPresentes();
    }

    public void setSituacoesPresentes(List<Long> situacoesPresentes) {
        fichaAtendimentoDomiciliarChildThrift.setSituacoesPresentes(situacoesPresentes);
    }

    public void unsetSituacoesPresentes() {
        fichaAtendimentoDomiciliarChildThrift.unsetSituacoesPresentes();
    }

    public boolean isSetSituacoesPresentes() {
        return fichaAtendimentoDomiciliarChildThrift.isSetSituacoesPresentes();
    }

    public void setSituacoesPresentesIsSet(boolean value) {
        fichaAtendimentoDomiciliarChildThrift.setSituacoesPresentesIsSet(value);
    }

    public String getCid() {
        return fichaAtendimentoDomiciliarChildThrift.getCid();
    }

    public void setCid(String cid) {
        fichaAtendimentoDomiciliarChildThrift.setCid(cid);
    }

    public void unsetCid() {
        fichaAtendimentoDomiciliarChildThrift.unsetCid();
    }

    public boolean isSetCid() {
        return fichaAtendimentoDomiciliarChildThrift.isSetCid();
    }

    public void setCidIsSet(boolean value) {
        fichaAtendimentoDomiciliarChildThrift.setCidIsSet(value);
    }

    public String getCiap() {
        return fichaAtendimentoDomiciliarChildThrift.getCiap();
    }

    public void setCiap(String ciap) {
        fichaAtendimentoDomiciliarChildThrift.setCiap(ciap);
    }

    public void unsetCiap() {
        fichaAtendimentoDomiciliarChildThrift.unsetCiap();
    }

    public boolean isSetCiap() {
        return fichaAtendimentoDomiciliarChildThrift.isSetCiap();
    }

    public void setCiapIsSet(boolean value) {
        fichaAtendimentoDomiciliarChildThrift.setCiapIsSet(value);
    }

    public int getProcedimentosSize() {
        return fichaAtendimentoDomiciliarChildThrift.getProcedimentosSize();
    }

    public Iterator<String> getProcedimentosIterator() {
        return fichaAtendimentoDomiciliarChildThrift.getProcedimentosIterator();
    }

    public void addToProcedimentos(String elem) {
        fichaAtendimentoDomiciliarChildThrift.addToProcedimentos(elem);
    }

    public List<String> getProcedimentos() {
        return fichaAtendimentoDomiciliarChildThrift.getProcedimentos();
    }

    public void setProcedimentos(List<String> procedimentos) {
        fichaAtendimentoDomiciliarChildThrift.setProcedimentos(procedimentos);
    }

    public void unsetProcedimentos() {
        fichaAtendimentoDomiciliarChildThrift.unsetProcedimentos();
    }

    public boolean isSetProcedimentos() {
        return fichaAtendimentoDomiciliarChildThrift.isSetProcedimentos();
    }

    public void setProcedimentosIsSet(boolean value) {
        fichaAtendimentoDomiciliarChildThrift.setProcedimentosIsSet(value);
    }

    public int getOutrosProcedimentosSize() {
        return fichaAtendimentoDomiciliarChildThrift.getOutrosProcedimentosSize();
    }

    public Iterator<String> getOutrosProcedimentosIterator() {
        return fichaAtendimentoDomiciliarChildThrift.getOutrosProcedimentosIterator();
    }

    public void addToOutrosProcedimentos(String elem) {
        fichaAtendimentoDomiciliarChildThrift.addToOutrosProcedimentos(elem);
    }

    public List<String> getOutrosProcedimentos() {
        return fichaAtendimentoDomiciliarChildThrift.getOutrosProcedimentos();
    }

    public void setOutrosProcedimentos(List<String> outrosProcedimentos) {
        fichaAtendimentoDomiciliarChildThrift.setOutrosProcedimentos(outrosProcedimentos);
    }

    public void unsetOutrosProcedimentos() {
        fichaAtendimentoDomiciliarChildThrift.unsetOutrosProcedimentos();
    }

    public boolean isSetOutrosProcedimentos() {
        return fichaAtendimentoDomiciliarChildThrift.isSetOutrosProcedimentos();
    }

    public void setOutrosProcedimentosIsSet(boolean value) {
        fichaAtendimentoDomiciliarChildThrift.setOutrosProcedimentosIsSet(value);
    }

    public long getCondutaDesfecho() {
        return fichaAtendimentoDomiciliarChildThrift.getCondutaDesfecho();
    }

    public void setCondutaDesfecho(long condutaDesfecho) {
        fichaAtendimentoDomiciliarChildThrift.setCondutaDesfecho(condutaDesfecho);
    }

    public void unsetCondutaDesfecho() {
        fichaAtendimentoDomiciliarChildThrift.unsetCondutaDesfecho();
    }

    public boolean isSetCondutaDesfecho() {
        return fichaAtendimentoDomiciliarChildThrift.isSetCondutaDesfecho();
    }

    public void setCondutaDesfechoIsSet(boolean value) {
        fichaAtendimentoDomiciliarChildThrift.setCondutaDesfechoIsSet(value);
    }

    public boolean isStatusInicioAcompanhamentoPosObito() {
        return fichaAtendimentoDomiciliarChildThrift.isStatusInicioAcompanhamentoPosObito();
    }

    public void setStatusInicioAcompanhamentoPosObito(boolean statusInicioAcompanhamentoPosObito) {
        fichaAtendimentoDomiciliarChildThrift.setStatusInicioAcompanhamentoPosObito(statusInicioAcompanhamentoPosObito);
    }

    public void unsetStatusInicioAcompanhamentoPosObito() {
        fichaAtendimentoDomiciliarChildThrift.unsetStatusInicioAcompanhamentoPosObito();
    }

    public boolean isSetStatusInicioAcompanhamentoPosObito() {
        return fichaAtendimentoDomiciliarChildThrift.isSetStatusInicioAcompanhamentoPosObito();
    }

    public void setStatusInicioAcompanhamentoPosObitoIsSet(boolean value) {
        fichaAtendimentoDomiciliarChildThrift.setStatusInicioAcompanhamentoPosObitoIsSet(value);
    }

    @Override
    public boolean equals(Object that) {
        return fichaAtendimentoDomiciliarChildThrift.equals(that);
    }

    public boolean equals(FichaAtendimentoDomiciliarChild that) {
        return fichaAtendimentoDomiciliarChildThrift.equals(that.getInstance());
    }

    @Override
    public int hashCode() {
        return fichaAtendimentoDomiciliarChildThrift.hashCode();
    }

    public int compareTo(FichaAtendimentoDomiciliarChild other) {
        return fichaAtendimentoDomiciliarChildThrift.compareTo(other.getInstance());
    }

    @Override
    public String toString() {
        return fichaAtendimentoDomiciliarChildThrift.toString();
    }

    public void validate() throws TException {
        fichaAtendimentoDomiciliarChildThrift.validate();
    }
    
    protected FichaAtendimentoDomiciliarChildThrift getInstance(){
        return fichaAtendimentoDomiciliarChildThrift;
    }

}

