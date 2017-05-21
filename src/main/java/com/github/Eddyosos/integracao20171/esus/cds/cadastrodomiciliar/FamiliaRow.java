package com.github.Eddyosos.integracao20171.esus.cds.cadastrodomiciliar;

import br.gov.saude.esus.cds.transport.generated.thrift.cadastrodomiciliar.FamiliaRowThrift;
import org.apache.thrift.TException;

public class FamiliaRow {
    private FamiliaRowThrift familiaRowThrift = new FamiliaRowThrift();
    
    protected FamiliaRow(FamiliaRowThrift familiaRowThrift){
        this.familiaRowThrift = familiaRowThrift;
    }

    public long getDataNascimentoResponsavel() {
        return familiaRowThrift.getDataNascimentoResponsavel();
    }

    public void setDataNascimentoResponsavel(long dataNascimentoResponsavel) {
        familiaRowThrift.setDataNascimentoResponsavel(dataNascimentoResponsavel);
    }

    public void unsetDataNascimentoResponsavel() {
        familiaRowThrift.unsetDataNascimentoResponsavel();
    }

    public boolean isSetDataNascimentoResponsavel() {
        return familiaRowThrift.isSetDataNascimentoResponsavel();
    }

    public void setDataNascimentoResponsavelIsSet(boolean value) {
        familiaRowThrift.setDataNascimentoResponsavelIsSet(value);
    }

    public String getNumeroCnsResponsavel() {
        return familiaRowThrift.getNumeroCnsResponsavel();
    }

    public void setNumeroCnsResponsavel(String numeroCnsResponsavel) {
        familiaRowThrift.setNumeroCnsResponsavel(numeroCnsResponsavel);
    }

    public void unsetNumeroCnsResponsavel() {
        familiaRowThrift.unsetNumeroCnsResponsavel();
    }

    public boolean isSetNumeroCnsResponsavel() {
        return familiaRowThrift.isSetNumeroCnsResponsavel();
    }

    public void setNumeroCnsResponsavelIsSet(boolean value) {
        familiaRowThrift.setNumeroCnsResponsavelIsSet(value);
    }

    public int getNumeroMembrosFamilia() {
        return familiaRowThrift.getNumeroMembrosFamilia();
    }

    public void setNumeroMembrosFamilia(int numeroMembrosFamilia) {
        familiaRowThrift.setNumeroMembrosFamilia(numeroMembrosFamilia);
    }

    public void unsetNumeroMembrosFamilia() {
        familiaRowThrift.unsetNumeroMembrosFamilia();
    }

    public boolean isSetNumeroMembrosFamilia() {
        return familiaRowThrift.isSetNumeroMembrosFamilia();
    }

    public void setNumeroMembrosFamiliaIsSet(boolean value) {
        familiaRowThrift.setNumeroMembrosFamiliaIsSet(value);
    }

    public String getNumeroProntuario() {
        return familiaRowThrift.getNumeroProntuario();
    }

    public void setNumeroProntuario(String numeroProntuario) {
        familiaRowThrift.setNumeroProntuario(numeroProntuario);
    }

    public void unsetNumeroProntuario() {
        familiaRowThrift.unsetNumeroProntuario();
    }

    public boolean isSetNumeroProntuario() {
        return familiaRowThrift.isSetNumeroProntuario();
    }

    public void setNumeroProntuarioIsSet(boolean value) {
        familiaRowThrift.setNumeroProntuarioIsSet(value);
    }

    public long getRendaFamiliar() {
        return familiaRowThrift.getRendaFamiliar();
    }

    public void setRendaFamiliar(long rendaFamiliar) {
        familiaRowThrift.setRendaFamiliar(rendaFamiliar);
    }

    public void unsetRendaFamiliar() {
        familiaRowThrift.unsetRendaFamiliar();
    }

    public boolean isSetRendaFamiliar() {
        return familiaRowThrift.isSetRendaFamiliar();
    }

    public void setRendaFamiliarIsSet(boolean value) {
        familiaRowThrift.setRendaFamiliarIsSet(value);
    }

    public long getResideDesde() {
        return familiaRowThrift.getResideDesde();
    }

    public void setResideDesde(long resideDesde) {
        familiaRowThrift.setResideDesde(resideDesde);
    }

    public void unsetResideDesde() {
        familiaRowThrift.unsetResideDesde();
    }

    public boolean isSetResideDesde() {
        return familiaRowThrift.isSetResideDesde();
    }

    public void setResideDesdeIsSet(boolean value) {
        familiaRowThrift.setResideDesdeIsSet(value);
    }

    public boolean isStMudanca() {
        return familiaRowThrift.isStMudanca();
    }

    public void setStMudanca(boolean stMudanca) {
        familiaRowThrift.setStMudanca(stMudanca);
    }

    public void unsetStMudanca() {
        familiaRowThrift.unsetStMudanca();
    }

    public boolean isSetStMudanca() {
        return familiaRowThrift.isSetStMudanca();
    }

    public void setStMudancaIsSet(boolean value) {
        familiaRowThrift.setStMudancaIsSet(value);
    }

    public int compareTo(FamiliaRowThrift other) {
        return familiaRowThrift.compareTo(other);
    }

    public void validate() throws TException {
        familiaRowThrift.validate();
    }
    
    protected FamiliaRowThrift getInstance(){
        return familiaRowThrift;
    }
    
    
}

