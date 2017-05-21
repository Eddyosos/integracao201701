package com.github.Eddyosos.integracao20171.esus.cds.atividadecoletiva;

import br.gov.saude.esus.cds.transport.generated.thrift.atividadecoletiva.ParticipanteRowItemThrift;
import org.apache.thrift.TException;

public class ParticipanteRowItem {
    ParticipanteRowItemThrift participanteRowItemThrift = new ParticipanteRowItemThrift();
    
    protected ParticipanteRowItem(ParticipanteRowItemThrift participanteRowItemThrift){
        this.participanteRowItemThrift = participanteRowItemThrift;
    }

    public ParticipanteRowItemThrift deepCopy() {
        return participanteRowItemThrift.deepCopy();
    }

    public String getCns() {
        return participanteRowItemThrift.getCns();
    }

    public void setCns(String cns) {
        participanteRowItemThrift.setCns(cns);
    }

    public void unsetCns() {
        participanteRowItemThrift.unsetCns();
    }

    public boolean isSetCns() {
        return participanteRowItemThrift.isSetCns();
    }

    public void setCnsIsSet(boolean value) {
        participanteRowItemThrift.setCnsIsSet(value);
    }

    public long getDataNascimento() {
        return participanteRowItemThrift.getDataNascimento();
    }

    public void setDataNascimento(long dataNascimento) {
        participanteRowItemThrift.setDataNascimento(dataNascimento);
    }

    public void unsetDataNascimento() {
        participanteRowItemThrift.unsetDataNascimento();
    }

    public boolean isSetDataNascimento() {
        return participanteRowItemThrift.isSetDataNascimento();
    }

    public void setDataNascimentoIsSet(boolean value) {
        participanteRowItemThrift.setDataNascimentoIsSet(value);
    }

    public boolean isAvaliacaoAlterada() {
        return participanteRowItemThrift.isAvaliacaoAlterada();
    }

    public void setAvaliacaoAlterada(boolean avaliacaoAlterada) {
        participanteRowItemThrift.setAvaliacaoAlterada(avaliacaoAlterada);
    }

    public void unsetAvaliacaoAlterada() {
        participanteRowItemThrift.unsetAvaliacaoAlterada();
    }

    public boolean isSetAvaliacaoAlterada() {
        return participanteRowItemThrift.isSetAvaliacaoAlterada();
    }

    public void setAvaliacaoAlteradaIsSet(boolean value) {
        participanteRowItemThrift.setAvaliacaoAlteradaIsSet(value);
    }

    public double getPeso() {
        return participanteRowItemThrift.getPeso();
    }

    public void setPeso(double peso) {
        participanteRowItemThrift.setPeso(peso);
    }

    public void unsetPeso() {
        participanteRowItemThrift.unsetPeso();
    }

    public boolean isSetPeso() {
        return participanteRowItemThrift.isSetPeso();
    }

    public void setPesoIsSet(boolean value) {
        participanteRowItemThrift.setPesoIsSet(value);
    }

    public double getAltura() {
        return participanteRowItemThrift.getAltura();
    }

    public void setAltura(double altura) {
        participanteRowItemThrift.setAltura(altura);
    }

    public void unsetAltura() {
        participanteRowItemThrift.unsetAltura();
    }

    public boolean isSetAltura() {
        return participanteRowItemThrift.isSetAltura();
    }

    public void setAlturaIsSet(boolean value) {
        participanteRowItemThrift.setAlturaIsSet(value);
    }

    public boolean isCessouHabitoFumar() {
        return participanteRowItemThrift.isCessouHabitoFumar();
    }

    public void setCessouHabitoFumar(boolean cessouHabitoFumar) {
        participanteRowItemThrift.setCessouHabitoFumar(cessouHabitoFumar);
    }

    public void unsetCessouHabitoFumar() {
        participanteRowItemThrift.unsetCessouHabitoFumar();
    }

    public boolean isSetCessouHabitoFumar() {
        return participanteRowItemThrift.isSetCessouHabitoFumar();
    }

    public void setCessouHabitoFumarIsSet(boolean value) {
        participanteRowItemThrift.setCessouHabitoFumarIsSet(value);
    }

    public boolean isAbandonouGrupo() {
        return participanteRowItemThrift.isAbandonouGrupo();
    }

    public void setAbandonouGrupo(boolean abandonouGrupo) {
        participanteRowItemThrift.setAbandonouGrupo(abandonouGrupo);
    }

    public void unsetAbandonouGrupo() {
        participanteRowItemThrift.unsetAbandonouGrupo();
    }

    public boolean isSetAbandonouGrupo() {
        return participanteRowItemThrift.isSetAbandonouGrupo();
    }

    public void setAbandonouGrupoIsSet(boolean value) {
        participanteRowItemThrift.setAbandonouGrupoIsSet(value);
    }

    @Override
    public boolean equals(Object that) {
        return participanteRowItemThrift.equals(that);
    }

    public boolean equals(ParticipanteRowItem that) {
        return participanteRowItemThrift.equals(that.getInstance());
    }

    @Override
    public int hashCode() {
        return participanteRowItemThrift.hashCode();
    }

    public int compareTo(ParticipanteRowItem other) {
        return participanteRowItemThrift.compareTo(other.getInstance());
    }

    @Override
    public String toString() {
        return participanteRowItemThrift.toString();
    }

    public void validate() throws TException {
        participanteRowItemThrift.validate();
    }
    
    ParticipanteRowItemThrift getInstance(){
        return participanteRowItemThrift;
    }
    
}

