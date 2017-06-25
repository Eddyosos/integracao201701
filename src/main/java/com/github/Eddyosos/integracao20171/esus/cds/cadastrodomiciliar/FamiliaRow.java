package com.github.Eddyosos.integracao20171.esus.cds.cadastrodomiciliar;

import br.gov.saude.esus.cds.transport.generated.thrift.cadastrodomiciliar.FamiliaRowThrift;
import org.apache.thrift.TException;


public class FamiliaRow {
    /**
     * Encapsulamento do Thrift
     */
    private FamiliaRowThrift familiaRow = new FamiliaRowThrift();
    
    /**
     * Encapsulamento do Thrift
     * @param familiaRowThrift 
     */
    protected FamiliaRow(FamiliaRowThrift familiaRowThrift){
        this.familiaRow = familiaRowThrift;
    }

    public FamiliaRow deepCopy() {
        return new FamiliaRow(familiaRow.deepCopy());
    }

    public void clear() {
        familiaRow.clear();
    }

    /**
     * Data de nascimento, no formato epoch time, do cidadão responsável pela família.
     * @return dataNascimentoResponsavel
     */
    public long getDataNascimentoResponsavel() {
        return familiaRow.getDataNascimentoResponsavel();
    }

    /**
     * Data de nascimento, no formato epoch time, do cidadão responsável pela família.
     * @param dataNascimentoResponsavel 
     */
    public void setDataNascimentoResponsavel(long dataNascimentoResponsavel) {
        familiaRow.setDataNascimentoResponsavel(dataNascimentoResponsavel);
    }

    public void unsetDataNascimentoResponsavel() {
        familiaRow.unsetDataNascimentoResponsavel();
    }

    /**
     * Data de nascimento, no formato epoch time, do cidadão responsável pela família.
     * @return dataNascimentoResponsavel
     */
    public boolean isSetDataNascimentoResponsavel() {
        return familiaRow.isSetDataNascimentoResponsavel();
    }

    /**
     * Data de nascimento, no formato epoch time, do cidadão responsável pela família.
     * @param value 
     */
    public void setDataNascimentoResponsavelIsSet(boolean value) {
        familiaRow.setDataNascimentoResponsavelIsSet(value);
    }

    /**
     * CNS do responsável familiar.
     * @return numeroCnsResponsavel
     */
    public String getNumeroCnsResponsavel() {
        return familiaRow.getNumeroCnsResponsavel();
    }

    /**
     * CNS do responsável familiar.
     * @param numeroCnsResponsavel 
     */
    public void setNumeroCnsResponsavel(String numeroCnsResponsavel) {
        familiaRow.setNumeroCnsResponsavel(numeroCnsResponsavel);
    }

    public void unsetNumeroCnsResponsavel() {
        familiaRow.unsetNumeroCnsResponsavel();
    }

    /**
     * CNS do responsável familiar.
     * @return numeroCnsResponsavel
     */
    public boolean isSetNumeroCnsResponsavel() {
        return familiaRow.isSetNumeroCnsResponsavel();
    }

    /**
     * CNS do responsável familiar.
     * @param value 
     */
    public void setNumeroCnsResponsavelIsSet(boolean value) {
        familiaRow.setNumeroCnsResponsavelIsSet(value);
    }

    /**
     * Quantidade de membros do núcleo familiar.
     * @return numeroMembrosFamilia 
     */
    public int getNumeroMembrosFamilia() {
        return familiaRow.getNumeroMembrosFamilia();
    }

    /**
     * Quantidade de membros do núcleo familiar.
     * @param numeroMembrosFamilia 
     */
    public void setNumeroMembrosFamilia(int numeroMembrosFamilia) {
        familiaRow.setNumeroMembrosFamilia(numeroMembrosFamilia);
    }

    public void unsetNumeroMembrosFamilia() {
        familiaRow.unsetNumeroMembrosFamilia();
    }

    /**
     * Quantidade de membros do núcleo familiar.
     * @return numeroMembrosFamilia 
     */
    public boolean isSetNumeroMembrosFamilia() {
        return familiaRow.isSetNumeroMembrosFamilia();
    }

    /**
     * Quantidade de membros do núcleo familiar.
     * @param value 
     */
    public void setNumeroMembrosFamiliaIsSet(boolean value) {
        familiaRow.setNumeroMembrosFamiliaIsSet(value);
    }

    /**
     * Código do prontuário familiar na UBS.
     * @return numeroProntuario
     */
    public String getNumeroProntuario() {
        return familiaRow.getNumeroProntuario();
    }

    /**
     * Código do prontuário familiar na UBS.
     * @param numeroProntuario 
     */
    public void setNumeroProntuario(String numeroProntuario) {
        familiaRow.setNumeroProntuario(numeroProntuario);
    }

    public void unsetNumeroProntuario() {
        familiaRow.unsetNumeroProntuario();
    }

    /**
     * Código do prontuário familiar na UBS.
     * @return numeroProntuario
     */
    public boolean isSetNumeroProntuario() {
        return familiaRow.isSetNumeroProntuario();
    }

    /**
     * Código do prontuário familiar na UBS.
     * @param value 
     */
    public void setNumeroProntuarioIsSet(boolean value) {
        familiaRow.setNumeroProntuarioIsSet(value);
    }

    /**
     * Código da renda familiar em salários mínimos
     * @return rendaFamiliar 
     */
    public long getRendaFamiliar() {
        return familiaRow.getRendaFamiliar();
    }

    /**
     * Código da renda familiar em salários mínimos.
     * @param rendaFamiliar 
     */
    public void setRendaFamiliar(long rendaFamiliar) {
        familiaRow.setRendaFamiliar(rendaFamiliar);
    }

    public void unsetRendaFamiliar() {
        familiaRow.unsetRendaFamiliar();
    }

    /**
     * Código da renda familiar em salários mínimos.
     * @return rendaFamiliar 
     */
    public boolean isSetRendaFamiliar() {
        return familiaRow.isSetRendaFamiliar();
    }

    /**
     * Código da renda familiar em salários mínimos.
     * @param value 
     */
    public void setRendaFamiliarIsSet(boolean value) {
        familiaRow.setRendaFamiliarIsSet(value);
    }

    /**
     * Mês e ano que a família começou a residir no domicílio, no formato epoch time.
     * @return resideDesde 
     */
    public long getResideDesde() {
        return familiaRow.getResideDesde();
    }

    /**
     * Mês e ano que a família começou a residir no domicílio, no formato epoch time.
     * @param resideDesde 
     */
    public void setResideDesde(long resideDesde) {
        familiaRow.setResideDesde(resideDesde);
    }

    public void unsetResideDesde() {
        familiaRow.unsetResideDesde();
    }

    /**
     * Mês e ano que a família começou a residir no domicílio, no formato epoch time.
     * @return resideDesde
     */
    public boolean isSetResideDesde() {
        return familiaRow.isSetResideDesde();
    }

    /**
     * Mês e ano que a família começou a residir no domicílio, no formato epoch time.
     * @param value 
     */
    public void setResideDesdeIsSet(boolean value) {
        familiaRow.setResideDesdeIsSet(value);
    }

    /**
     * Marcador que indica se a familia mudou-se.
     * @return stMudanca
     */
    public boolean isStMudanca() {
        return familiaRow.isStMudanca();
    }

    /**
     * Marcador que indica se a familia mudou-se.
     * @param stMudanca 
     */
    public void setStMudanca(boolean stMudanca) {
        familiaRow.setStMudanca(stMudanca);
    }

    
    public void unsetStMudanca() {
        familiaRow.unsetStMudanca();
    }

    /**
     * Marcador que indica se a familia mudou-se.
     * @return stMudanca
     */
    public boolean isSetStMudanca() {
        return familiaRow.isSetStMudanca();
    }

    /**
     * Marcador que indica se a familia mudou-se.
     * @param value 
     */
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

        /**
     * Metodo validade cria os metodos que fazem as validações
     * Chama todos os metodos que fazem validações
     * @return Todos os metodos de validação
     */
    public boolean validates(){
        return validaDataNascimentoResponsavel() &&
                validaNumeroCNSResponsavel() &&
                validaNumeroMembrosFamilia() &&
                validaNumeroProntuario() &&
                validaRendaFamiliar() &&
                validaResideDesde() &&
                validaStMudanca();
    }
    
    /**
     * Data de nascimento, no formato epoch time, do cidadão responsável pela família. 
     * @return dataNascimentoResponsavel
     * Não é Obrigatório
     */
    public boolean validaDataNascimentoResponsavel(){
      
        long dataResponsavel = familiaRow.getDataNascimentoResponsavel();
        long anoEpoch = 60*60*24*365;
        long dataNascimentoResponsavel = anoEpoch*dataResponsavel;
        
        return dataNascimentoResponsavel !=0;
    }
    
    /**
     * CNS do responsável familiar.
     * @return numeroCnsResponsavel
     * É Obrigatório, do tipo String
     * Tamanho máximo e mínimo devem ser = 15
     */
    public boolean validaNumeroCNSResponsavel(){
        
        String numeroCnsResponsavel = familiaRow.getNumeroCnsResponsavel();
        return numeroCnsResponsavel.length() == 15;
        
    }
    
    /**
     * Quantidade de membros do núcleo familiar.
     * @return numeroMembrosFamilia
     * Não é Obrigatório
     */
    public boolean validaNumeroMembrosFamilia(){
        return familiaRow.getNumeroMembrosFamilia() <=0 &&
                familiaRow.getNumeroMembrosFamilia() <=2;
    }
    
    /**
     * Código do prontuário familiar na UBS.
     * @return numeroProntuario
     * Não é obrigatório
     *  Apenas letras e números.
     */
    public boolean validaNumeroProntuario(){
        String numeroProntuario = familiaRow.getNumeroProntuario();
        
        return numeroProntuario.length() >=0 &&
                numeroProntuario.length() <=30;
    }
    
    /**
     * Código da renda familiar em salários mínimos.
     * @return rendaFamiliar
     * Não é Obrigatório
     */
    public boolean validaRendaFamiliar(){
        long rendaFamiliar = familiaRow.getRendaFamiliar();
        return rendaFamiliar !=0;
    }
    
    /**
     * Mês e ano que a família começou a residir no domicílio, no formato epoch time.
     * @return resideDesde
     * Não é Obrigatório
     */
    public boolean validaResideDesde(){
        
        long reside = familiaRow.getResideDesde();
        long anoEpoch = 60*60*24*365;
        long resideDesde = anoEpoch * reside;
        
        return resideDesde !=0;
    }
    
    /**
     * Marcador que indica se a familia mudou-se.
     * @return StMudanca 
     */
    public boolean validaStMudanca(){
        return familiaRow.isSetStMudanca();
    }
}