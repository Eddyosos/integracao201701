package com.github.Eddyosos.integracao20171.esus.cds.common;

import br.gov.saude.esus.cds.transport.generated.thrift.common.EnderecoLocalPermanenciaThrift;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;

public class EnderecoLocalPermanencia {
    private EnderecoLocalPermanenciaThrift instance;

    public EnderecoLocalPermanencia() {
        instance = new EnderecoLocalPermanenciaThrift();
    }
    
    //Devia ser protected
    public EnderecoLocalPermanencia(EnderecoLocalPermanenciaThrift instance) {
        this.instance = instance;
    }


    //Devia ser protected
    public EnderecoLocalPermanenciaThrift getInstance() {
        return instance;
    }

    public void clear() {
        instance.clear();
    }

    public String getBairro() {
        return instance.getBairro();
    }

    public void setBairro(String bairro) {
        instance.setBairro(bairro);
    }

    public void unsetBairro() {
        instance.unsetBairro();
    }

    public boolean isSetBairro() {
        return instance.isSetBairro();
    }

    public void setBairroIsSet(boolean value) {
        instance.setBairroIsSet(value);
    }

    public String getCep() {
        return instance.getCep();
    }

    public void setCep(String cep) {
        instance.setCep(cep);
    }

    public void unsetCep() {
        instance.unsetCep();
    }

    public boolean isSetCep() {
        return instance.isSetCep();
    }

    public void setCepIsSet(boolean value) {
        instance.setCepIsSet(value);
    }

    public String getCodigoIbgeMunicipio() {
        return instance.getCodigoIbgeMunicipio();
    }

    public void setCodigoIbgeMunicipio(String codigoIbgeMunicipio) {
        instance.setCodigoIbgeMunicipio(codigoIbgeMunicipio);
    }

    public void unsetCodigoIbgeMunicipio() {
        instance.unsetCodigoIbgeMunicipio();
    }

    public boolean isSetCodigoIbgeMunicipio() {
        return instance.isSetCodigoIbgeMunicipio();
    }

    public void setCodigoIbgeMunicipioIsSet(boolean value) {
        instance.setCodigoIbgeMunicipioIsSet(value);
    }

    public String getComplemento() {
        return instance.getComplemento();
    }

    public void setComplemento(String complemento) {
        instance.setComplemento(complemento);
    }

    public void unsetComplemento() {
        instance.unsetComplemento();
    }

    public boolean isSetComplemento() {
        return instance.isSetComplemento();
    }

    public void setComplementoIsSet(boolean value) {
        instance.setComplementoIsSet(value);
    }

    public String getNomeLogradouro() {
        return instance.getNomeLogradouro();
    }

    public void setNomeLogradouro(String nomeLogradouro) {
        instance.setNomeLogradouro(nomeLogradouro);
    }

    public void unsetNomeLogradouro() {
        instance.unsetNomeLogradouro();
    }

    public boolean isSetNomeLogradouro() {
        return instance.isSetNomeLogradouro();
    }

    public void setNomeLogradouroIsSet(boolean value) {
        instance.setNomeLogradouroIsSet(value);
    }

    public String getNumero() {
        return instance.getNumero();
    }

    public void setNumero(String numero) {
        instance.setNumero(numero);
    }

    public void unsetNumero() {
        instance.unsetNumero();
    }

    public boolean isSetNumero() {
        return instance.isSetNumero();
    }

    public void setNumeroIsSet(boolean value) {
        instance.setNumeroIsSet(value);
    }

    public String getNumeroDneUf() {
        return instance.getNumeroDneUf();
    }

    public void setNumeroDneUf(String numeroDneUf) {
        instance.setNumeroDneUf(numeroDneUf);
    }

    public void unsetNumeroDneUf() {
        instance.unsetNumeroDneUf();
    }

    public boolean isSetNumeroDneUf() {
        return instance.isSetNumeroDneUf();
    }

    public void setNumeroDneUfIsSet(boolean value) {
        instance.setNumeroDneUfIsSet(value);
    }

    public String getTelReferencial() {
        return instance.getTelReferencial();
    }

    public void setTelReferencial(String telReferencial) {
        instance.setTelReferencial(telReferencial);
    }

    public void unsetTelReferencial() {
        instance.unsetTelReferencial();
    }

    public boolean isSetTelReferencial() {
        return instance.isSetTelReferencial();
    }

    public void setTelReferencialIsSet(boolean value) {
        instance.setTelReferencialIsSet(value);
    }

    public String getTelResidencial() {
        return instance.getTelResidencial();
    }

    public void setTelResidencial(String telResidencial) {
        instance.setTelResidencial(telResidencial);
    }

    public void unsetTelResidencial() {
        instance.unsetTelResidencial();
    }

    public boolean isSetTelResidencial() {
        return instance.isSetTelResidencial();
    }

    public void setTelResidencialIsSet(boolean value) {
        instance.setTelResidencialIsSet(value);
    }

    public String getTipoLogradouroNumeroDne() {
        return instance.getTipoLogradouroNumeroDne();
    }

    public void setTipoLogradouroNumeroDne(String tipoLogradouroNumeroDne) {
        instance.setTipoLogradouroNumeroDne(tipoLogradouroNumeroDne);
    }

    public void unsetTipoLogradouroNumeroDne() {
        instance.unsetTipoLogradouroNumeroDne();
    }

    public boolean isSetTipoLogradouroNumeroDne() {
        return instance.isSetTipoLogradouroNumeroDne();
    }

    public void setTipoLogradouroNumeroDneIsSet(boolean value) {
        instance.setTipoLogradouroNumeroDneIsSet(value);
    }

    public boolean isStSemNumero() {
        return instance.isStSemNumero();
    }

    public void setStSemNumero(boolean stSemNumero) {
        instance.setStSemNumero(stSemNumero);
    }

    public void unsetStSemNumero() {
        instance.unsetStSemNumero();
    }

    public boolean isSetStSemNumero() {
        return instance.isSetStSemNumero();
    }

    public void setStSemNumeroIsSet(boolean value) {
        instance.setStSemNumeroIsSet(value);
    }


    public boolean equals(Object that) {
        return instance.equals(that);
    }

    public boolean equals(EnderecoLocalPermanencia that) {
        return instance.equals(that.instance);
    }

    public int hashCode() {
        return instance.hashCode();
    }

    public int compareTo(EnderecoLocalPermanencia other) {
        return instance.compareTo(other.instance);
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
    
    /**
     * Metodo validade cria os metodos que fazem as validações
     * Chama todos os metodos que fazem validações
     * @return Todos os metodos de validação 
     */
    public boolean validates(){
        return validaBairro() &&
                validaCep() &&
                validaCodigoIbgeMunicipio() &&
                validaComplemento() &&
                validaNomeLogradouro() &&
                validaNumero() &&
                validaNumeroDneUF() &&
                validaTelReferencial() &&
                validaTelResidencial() &&
                validaTipoLogradouroNumeroDne() &&
                validaStSemNumero();
    }
    
    /**
     * Bairro onde está localizado o domicílio
     * @return bairro
     * É Obrigatório
     */
    public boolean validaBairro(){
        String bairro = instance.getBairro();
        return bairro !=null && 
                bairro.length() >=1 &&
                bairro.length() <=256;
    }
    
    /**
     * CEP do logradouro do domicílio.
     * @return  cep
     * é Obrigatório
     */
    public boolean validaCep(){
        String cep = instance.getCep();
        return  cep !=null && 
                cep.length()==8;
    }
    
    /**
     * Código IBGE do município.
     * @return codigoIbgeMunicipio
     * É Obrigatório
     */
    public boolean validaCodigoIbgeMunicipio(){
       String codigoIbgeMunicipio = instance.getCodigoIbgeMunicipio();
       return codigoIbgeMunicipio != null;
    }
    
    /**
     * Complemento do endereço do domicílio
     * @return complemento
     */
    public boolean validaComplemento(){
        String complemento = instance.getComplemento();
        return  complemento.length() >=1 &&
                complemento.length() <=256;
    }
    
    /**
     * Nome do logradouro.
     * @return nomeLogradouro
     * É Obrigatório
     */
    public boolean validaNomeLogradouro(){
        String nomeLogradouro = instance.getNomeLogradouro();
        return nomeLogradouro != null &&
                nomeLogradouro.length() >=1 &&
                nomeLogradouro.length() <= 256;
    }
    
    /**
     * Número do domicílio
     * @return numero
     * É Obrigatóio
     * Apenas letras e números.
     * Não pode ser preenchido caso stSemNumero = true.
     */
    public boolean validaNumero(){
        String numero = instance.getNumero();
        if(instance.isSetStSemNumero()==true) 
            return numero !=null &&
                numero.length() >=1 &&
                numero.length() <=10;
        else 
            return false;
    }
    
    /**
     * Código indexador referente a Unidade Federativa
     * @return numeroDneUf
     * é Obrigatório
     */
    public boolean validaNumeroDneUF(){
        String numeroDneUf = instance.getNumeroDneUf();
        return numeroDneUf != null;
    }
    
    /**
     * Telefone de referência
     * @return telReferencial
     * Mínimo 10 dígitos, máximo 11 (DDD + 8 ou 9)
     */
    public boolean validaTelReferencial(){
        String telReferencial = instance.getTelReferencial();
        return telReferencial.length() >=10 &&
                telReferencial.length() <=11;
    }
    
    /**
     * Telefone residencial
     * @return telResidencial
     * Mínimo 10 dígitos, máximo 11 (DDD + 8 ou 9)
     */
    public boolean validaTelResidencial(){
        String telResidencial = instance.getTelResidencial();
        return telResidencial.length() >=10 &&
                telResidencial.length() <=11;
    }
    
    /**
     * Tipo do logradouro onde está o domicílio
     * @return tipoLogradouroNumeroDne
     * É Obrigatório
     */
    public boolean validaTipoLogradouroNumeroDne(){
        String tipoLogradouroNumeroDne = instance.getTipoLogradouroNumeroDne();
        return tipoLogradouroNumeroDne !=null;
    }
    
    /**
     * Marcador que indica que o domicílio não possui número
     * @return stSemNumero
     */
    public boolean validaStSemNumero(){
        return instance.isSetStSemNumero();
    }
}