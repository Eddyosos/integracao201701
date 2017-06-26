package com.github.Eddyosos.integracao20171.esus.cds.common;

import br.gov.saude.esus.cds.transport.generated.thrift.common.EnderecoLocalPermanenciaThrift;

/**
 * Endereço de local de permanencia,
 * Representa local de permanencia, encapsula no padrão delegate 
 * a classe EnderecoLocalPermanenciaThrift
 */
public class EnderecoLocalPermanencia {
    /**
     * Instancia thrift sendo encapsulada (padrão delegate)
     */
    private final EnderecoLocalPermanenciaThrift instance;

    /**
     * Construtor 
     * Cria um objeto Thrift que será encapsulado
     */
    public EnderecoLocalPermanencia() {
        instance = new EnderecoLocalPermanenciaThrift();
    }
    
    /**
     * Construtor
     * Encapsula o objeto thrift instance
     * @param instance a ser incapsulado
     */
    public EnderecoLocalPermanencia(EnderecoLocalPermanenciaThrift instance) {
        this.instance = instance;
    }

    /**
     * Retorna o objeto incapsulado thrift
     * @return 
     */
    public EnderecoLocalPermanenciaThrift getInstance() {
        return instance;
    }
    
    /**
     * Valida a classe inteira
     * Chama todos os métodos validates, e se todos estiverem válidos, 
     * este também retorna válido
     * @return true se em estado válido
     *         false se em estado inválido
     */
    public boolean validates(){
        return validateBairro() &&
                validateCEP() && 
                validateCodigoIbgeMunicipio() && 
                validateComplemento() &&
                validateNomeLogradouro() &&
                validateNumero() &&
                validateNumeroDneUf() &&
                validateTelReferencial() &&
                validateTelResidencial() && 
                validateTipoLogradouroNumeroDne();
    }
    
    /**
     * Valida bairro
     * Para ser válido ele deve ter sido atribuido anteriormente para um texto de
     * 1 a 256 (inclusivo) caracteres.
     * @return true se bairro for válido
     *         false se bairro for inválido
     */
    public boolean validateBairro() {
        String var = instance.getBairro();
        return  var != null && 
                var.length() >= 1 && 
                var.length() <= 256;
    }
    
    /**
     * Bairro onde está localizado o domicílio
     * @return nome do bairro
     */
    public String getBairro() {
        return instance.getBairro();
    }

    /**
     * Insere o nome do bairro
     * @param bairro nome do bairro
     */
    public void setBairro(String bairro) {
        instance.setBairro(bairro);
    }

    /**
     * Valida o CEP.
     * Para ser válido, o CEP deve ter sido atribuido anteriormente e deve obedecer
     * ao seguinte regex: \A\d{8}\z (8 números)
     * @return true se CEP for valido
     *         false se CEP for inválido
     */
    public boolean validateCEP(){
        String var = instance.getCep();
        return var != null && var.matches("\\A\\d{8}\\z");
    }
    /**
     * CEP do logradouro do domicílio.
     * @return Cep em string
     */
    public String getCep() {
        return instance.getCep();
    }

    /**
     * CEP do logradouro do domicílio.
     * @param cep 
     */
    public void setCep(String cep) {
        instance.setCep(cep);
    }

    /**
     * Valida Código IBGE do município.
     * Para ser válido, a propriedade deve ter sido atribuida préviamente e deve
     * obedecer ao seguinte regex: "\A\d{7}\z"
     * @return true se válido
     *         false se inválido
     */
    public boolean validateCodigoIbgeMunicipio(){
        String var = instance.getCodigoIbgeMunicipio(); 
        return var != null &&
               var.matches("\\A\\d{7}\\z");
    }
    
    /**
     * Código IBGE do município.
     * @return código
     */
    public String getCodigoIbgeMunicipio() {
        return instance.getCodigoIbgeMunicipio();
    }

    /**
     * Código IBGE do município
     * @param codigoIbgeMunicipio o código 
     */
    public void setCodigoIbgeMunicipio(String codigoIbgeMunicipio) {
        instance.setCodigoIbgeMunicipio(codigoIbgeMunicipio);
    }

    /**
     * Valida o complemento.
     * Para ser válido, se tiver sido préviamente atribuido, deve ter comprimento
     * entre 1 e 256 caracteres (inclusivo)
     * @return true se válido
     *         false se inválido
     */
    public boolean validateComplemento(){
        String var = instance.getComplemento();
        return var == null ||
                (var.length() >= 1 && var.length() <= 256);
    }
    
    /**
     * Complemento do endereço do domicílio.
     * @return o complemento
     */
    public String getComplemento() {
        return instance.getComplemento();
    }

    /**
     * Complemento do endereço do domicílio.
     * @param complemento
     * 
     */
    public void setComplemento(String complemento) {
        instance.setComplemento(complemento);
    }
    
    /**
     * Válido o Nome do logradouro
     * para ser válido, o nome deve ter sido inserido préviamente e deve conter
     * entre 1 e 256 caracteres (inclusivo)
     * @return true se válido
     *         false se inválido
     */
    public boolean validateNomeLogradouro(){
        String var = instance.getNomeLogradouro();
        return var != null &&
               var.length() >= 1 && var.length() <= 256;
    }
    
    /**
     * Nome do logradouro.
     * @return nome
     */
    public String getNomeLogradouro() {
        return instance.getNomeLogradouro();
    }

    /**
     * Nome do logradouro.
     * @param nomeLogradouro Nome do logradouro
     */
    public void setNomeLogradouro(String nomeLogradouro) {
        instance.setNomeLogradouro(nomeLogradouro);
    }
    
    /**
     * Número do domicílio.
     * Para ser válido, deve ter sido inserida previamente (a não ser que,
     * stSemNumero = true) e obedecer ao regex: \A\d{1,10}\z
     * 
     * @return true se válido
     *         false se inválido
     */
    public boolean validateNumero(){
        String var = instance.getNumero();
        return (instance.isStSemNumero() == (var == null)) && 
               (instance.isStSemNumero() || var.matches("\\A\\d{1,10}\\z"));
    }

    /**
     * Número do domicílio.
     * @return número
     */
    public String getNumero() {
        return instance.getNumero();
    }

    /**
     * Número do domicílio.
     * @param numero 
     */
    public void setNumero(String numero) {
        instance.setNumero(numero);
    }

    /**
     * Valida NumeroDneUf
     * Para ser válido deve ter sido préviamente inserido e corresponder ao
     * regex: "\A\d{2}\z"
     * @return true se válido
     *         false se inválido
     */
    public boolean validateNumeroDneUf() {
        String var = instance.getNumeroDneUf();
        return var != null && var.matches("\\A\\d{2}\\z");
    }
    
    /**
     * Código indexador referente a Unidade Federativa.
     * @return código
     */
    public String getNumeroDneUf() {
        return instance.getNumeroDneUf();
    }

    /**
     * Código indexador referente a Unidade Federativa.
     * @param numeroDneUf 
     */
    public void setNumeroDneUf(String numeroDneUf) {
        instance.setNumeroDneUf(numeroDneUf);
    }
    
    /**
     * Valida TelReferencial
     * Para ser válido deve, não ter sido inserido, ou, atender ao regex: 
     * "\A\d{10,11}\z"
     * @return 
     */
    public boolean validateTelReferencial(){
        String var = instance.getTelReferencial();
        return var == null || var.matches("\\A\\d{10,11}\\z");
    }
    
    /**
     * Telefone de referência.
     * @return telefone
     */
    public String getTelReferencial() {
        return instance.getTelReferencial();
    }

    /**
     * Telefone de referência.
     * @param telReferencial 
     */
    public void setTelReferencial(String telReferencial) {
        instance.setTelReferencial(telReferencial);
    }

    /**
     * Valida TelResidencial
     * Para ser válido deve, não ter sido inserido, ou, atender ao regex: 
     * "\A\d{10,11}\z"
     * @return 
     */
    public boolean validateTelResidencial(){
        String var = instance.getTelResidencial();
        return var == null || var.matches("\\A\\d{10,11}\\z");
    }
    
    /**
     * Telefone residencial.
     * @return 
     */
    public String getTelResidencial() {
        return instance.getTelResidencial();
    }

    /**
     * Telefone residencial.
     * @param telResidencial 
     */
    public void setTelResidencial(String telResidencial) {
        instance.setTelResidencial(telResidencial);
    }
    
    /**
     * Valida TipoLogradouroNumeroDne
     * Para ser válido, deve ter sido setado préviamente
     * @return 
     */
    public boolean validateTipoLogradouroNumeroDne(){
        String var = instance.getTipoLogradouroNumeroDne();
        return var != null && var.matches("\\A\\d{3}\\z") && 
                instance.getNumeroDneUf() != null;
    } 
    
    /**
     * Tipo do logradouro onde está o domicílio.
     * @return 
     */
    public String getTipoLogradouroNumeroDne() {
        return instance.getTipoLogradouroNumeroDne();
    }

    /**
     * Tipo do logradouro onde está o domicílio.
     * @param tipoLogradouroNumeroDne
     */
    public void setTipoLogradouroNumeroDne(String tipoLogradouroNumeroDne) {
        instance.setTipoLogradouroNumeroDne(tipoLogradouroNumeroDne);
    }

    // Não á regras para validate isStSemNumero, por isso método não foi criado
    
    /**
     * Marcador que indica que o domicílio não possui número.
     * @return 
     */
    public boolean isStSemNumero() {
        return instance.isStSemNumero();
    }

    /**
     * Marcador que indica que o domicílio não possui número.
     * @param stSemNumero 
     */
    public void setStSemNumero(boolean stSemNumero) {
        instance.setStSemNumero(stSemNumero);
    }

    /**
     * Marcador que indica que o domicílio não possui número.
     * @param value 
     */
    public void setStSemNumeroIsSet(boolean value) {
        instance.setStSemNumeroIsSet(value);
    }
}

