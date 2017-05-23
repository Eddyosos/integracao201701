package com.github.Eddyosos.integracao20171.esus.cds.cadastrodomiciliar;

import br.gov.saude.esus.cds.transport.generated.thrift.cadastrodomiciliar.FamiliaRowThrift;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;

public class FamiliaRow {
    private FamiliaRowThrift familiaRow = new FamiliaRowThrift();
    
    protected FamiliaRow(FamiliaRowThrift familiaRowThrift){
        this.familiaRow = familiaRowThrift;
    }

    public FamiliaRow deepCopy() {
        return new FamiliaRow(familiaRow.deepCopy());
    }

    public void clear() {
        familiaRow.clear();
    }

    public long getDataNascimentoResponsavel() {
        return familiaRow.getDataNascimentoResponsavel();
    }

    public void setDataNascimentoResponsavel(long dataNascimentoResponsavel) {
        familiaRow.setDataNascimentoResponsavel(dataNascimentoResponsavel);
    }

    public void unsetDataNascimentoResponsavel() {
        familiaRow.unsetDataNascimentoResponsavel();
    }

    public boolean isSetDataNascimentoResponsavel() {
        return familiaRow.isSetDataNascimentoResponsavel();
    }

    public void setDataNascimentoResponsavelIsSet(boolean value) {
        familiaRow.setDataNascimentoResponsavelIsSet(value);
    }

    public String getNumeroCnsResponsavel() {
        return familiaRow.getNumeroCnsResponsavel();
    }

    public void setNumeroCnsResponsavel(String numeroCnsResponsavel) {
        familiaRow.setNumeroCnsResponsavel(numeroCnsResponsavel);
    }

    public void unsetNumeroCnsResponsavel() {
        familiaRow.unsetNumeroCnsResponsavel();
    }

    public boolean isSetNumeroCnsResponsavel() {
        return familiaRow.isSetNumeroCnsResponsavel();
    }

    public void setNumeroCnsResponsavelIsSet(boolean value) {
        familiaRow.setNumeroCnsResponsavelIsSet(value);
    }

    public int getNumeroMembrosFamilia() {
        return familiaRow.getNumeroMembrosFamilia();
    }

    public void setNumeroMembrosFamilia(int numeroMembrosFamilia) {
        familiaRow.setNumeroMembrosFamilia(numeroMembrosFamilia);
    }

    public void unsetNumeroMembrosFamilia() {
        familiaRow.unsetNumeroMembrosFamilia();
    }

    public boolean isSetNumeroMembrosFamilia() {
        return familiaRow.isSetNumeroMembrosFamilia();
    }

    public void setNumeroMembrosFamiliaIsSet(boolean value) {
        familiaRow.setNumeroMembrosFamiliaIsSet(value);
    }

    public String getNumeroProntuario() {
        return familiaRow.getNumeroProntuario();
    }

    public void setNumeroProntuario(String numeroProntuario) {
        familiaRow.setNumeroProntuario(numeroProntuario);
    }

    public void unsetNumeroProntuario() {
        familiaRow.unsetNumeroProntuario();
    }

    public boolean isSetNumeroProntuario() {
        return familiaRow.isSetNumeroProntuario();
    }

    public void setNumeroProntuarioIsSet(boolean value) {
        familiaRow.setNumeroProntuarioIsSet(value);
    }

    public long getRendaFamiliar() {
        return familiaRow.getRendaFamiliar();
    }

    public void setRendaFamiliar(long rendaFamiliar) {
        familiaRow.setRendaFamiliar(rendaFamiliar);
    }

    public void unsetRendaFamiliar() {
        familiaRow.unsetRendaFamiliar();
    }

    public boolean isSetRendaFamiliar() {
        return familiaRow.isSetRendaFamiliar();
    }

    public void setRendaFamiliarIsSet(boolean value) {
        familiaRow.setRendaFamiliarIsSet(value);
    }

    public long getResideDesde() {
        return familiaRow.getResideDesde();
    }

    public void setResideDesde(long resideDesde) {
        familiaRow.setResideDesde(resideDesde);
    }

    public void unsetResideDesde() {
        familiaRow.unsetResideDesde();
    }

    public boolean isSetResideDesde() {
        return familiaRow.isSetResideDesde();
    }

    public void setResideDesdeIsSet(boolean value) {
        familiaRow.setResideDesdeIsSet(value);
    }

    public boolean isStMudanca() {
        return familiaRow.isStMudanca();
    }

    public void setStMudanca(boolean stMudanca) {
        familiaRow.setStMudanca(stMudanca);
    }

    public void unsetStMudanca() {
        familiaRow.unsetStMudanca();
    }

    public boolean isSetStMudanca() {
        return familiaRow.isSetStMudanca();
    }

    public void setStMudancaIsSet(boolean value) {
        familiaRow.setStMudancaIsSet(value);
    }

    @Override
    public boolean equals(Object that) {
        return familiaRow.equals(that);
    }

    public boolean equals(FamiliaRow that) {
        return familiaRow.equals(that.getInstance());
    }

    @Override
    public int hashCode() {
        return familiaRow.hashCode();
    }

    public int compareTo(FamiliaRow other) {
        return familiaRow.compareTo(other.getInstance());
    }

    @Override
    public String toString() {
        return familiaRow.toString();
    }

    public void validate() throws TException {
        familiaRow.validate();
    }
    
    protected FamiliaRowThrift getInstance(){
        return familiaRow;
    }

}

