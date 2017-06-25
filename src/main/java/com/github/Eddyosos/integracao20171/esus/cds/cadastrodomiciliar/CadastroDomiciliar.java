package com.github.Eddyosos.integracao20171.esus.cds.cadastrodomiciliar;

import br.gov.saude.esus.cds.transport.generated.thrift.cadastrodomiciliar.CadastroDomiciliarThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.cadastrodomiciliar.FamiliaRowThrift;
import com.github.Eddyosos.integracao20171.esus.cds.common.EnderecoLocalPermanencia;
import com.github.Eddyosos.integracao20171.esus.cds.common.HeaderCdsCadastro;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.thrift.TException;

public class CadastroDomiciliar {
    /**
     * Instancia para encapsulamento do Thrift
     */
    private CadastroDomiciliarThrift cadastroDomiciliar = new CadastroDomiciliarThrift();

    /**
     * É protegido pois não deve estar visível para o usuário
     * @param cadastroDomiciliar 
     */
    protected CadastroDomiciliar(CadastroDomiciliarThrift cadastroDomiciliar) {
        this.cadastroDomiciliar = cadastroDomiciliar;
    }

    public CadastroDomiciliar deepCopy() {
        return new CadastroDomiciliar(cadastroDomiciliar.deepCopy());
    }

    public void clear() {
        cadastroDomiciliar.clear();
    }

    /**
     * Lista de código dos animais no domicílio.
     * @return value
     */
    public int getAnimaisNoDomicilioSize() {
        return cadastroDomiciliar.getAnimaisNoDomicilioSize();
    }

    /**
     * Lista de código dos animais no domicílio.
     * @return Iterator<Long>
     */
    public Iterator<Long> getAnimaisNoDomicilioIterator() {
        return cadastroDomiciliar.getAnimaisNoDomicilioIterator();
    }

    /**
     * Lista de código dos animais no domicílio.
     * @param elem 
     * Adiciona Elemento 
     */
    public void addToAnimaisNoDomicilio(long elem) {
        cadastroDomiciliar.addToAnimaisNoDomicilio(elem);
    }

    /**
     * Lista de código dos animais no domicílio.
     * @return List<Long>
     */
    public List<Long> getAnimaisNoDomicilio() {
        return cadastroDomiciliar.getAnimaisNoDomicilio();
    }

    /**
     * Lista de código dos animais no domicílio.
     * @param animaisNoDomicilio 
     */
    public void setAnimaisNoDomicilio(List<Long> animaisNoDomicilio) {
        cadastroDomiciliar.setAnimaisNoDomicilio(animaisNoDomicilio);
    }

    public void unsetAnimaisNoDomicilio() {
        cadastroDomiciliar.unsetAnimaisNoDomicilio();
    }

    /**
     * Lista de código dos animais no domicílio.
     * @return animaisNoDomicilio 
     */
    public boolean isSetAnimaisNoDomicilio() {
        return cadastroDomiciliar.isSetAnimaisNoDomicilio();
    }

    /**
     * Lista de código dos animais no domicílio.
     * @param value 
     */
    public void setAnimaisNoDomicilioIsSet(boolean value) {
        cadastroDomiciliar.setAnimaisNoDomicilioIsSet(value);
    }

    /**
     * Condições de moradia do domicílio
     * @return ondicaoMoradia
     * Não devem ser preenchidos se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true
     */
    public CondicaoMoradia getCondicaoMoradia() {
        return new CondicaoMoradia(cadastroDomiciliar.getCondicaoMoradia());
    }

    /**
     * Condições de moradia do domicílio. 
     * @param condicaoMoradia 
     * Não devem ser preenchidos se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true
     */
    public void setCondicaoMoradia(CondicaoMoradia condicaoMoradia) {
        cadastroDomiciliar.setCondicaoMoradia(condicaoMoradia.getInstence());
    }

    public void unsetCondicaoMoradia() {
        cadastroDomiciliar.unsetCondicaoMoradia();
    }

    /**
     * Condições de moradia do domicílio.
     * @return CondicaoMoradia
     */
    public boolean isSetCondicaoMoradia() {
        return cadastroDomiciliar.isSetCondicaoMoradia();
    }

    /**
     * Condições de moradia do domicílio.
     * @param value 
     */
    public void setCondicaoMoradiaIsSet(boolean value) {
        cadastroDomiciliar.setCondicaoMoradiaIsSet(value);
    }

    /**
     * Informações sobre o profissional e a data do cadastro.
     * @return value
     */
    public HeaderCdsCadastro getDadosGerais() {
        return new HeaderCdsCadastro(cadastroDomiciliar.getDadosGerais());
    }

    /**
     * Informações sobre o profissional e a data do cadastro.
     * @param dadosGerais 
     */
    public void setDadosGerais(HeaderCdsCadastro dadosGerais) {
        cadastroDomiciliar.setDadosGerais(dadosGerais.getInstance());
    }

    public void unsetDadosGerais() {
        cadastroDomiciliar.unsetDadosGerais();
    }

    /**
     * Informações sobre o profissional e a data do cadastro.
     * @return  DadosGerais
     */
    public boolean isSetDadosGerais() {
        return cadastroDomiciliar.isSetDadosGerais();
    }

    /**
     * Informações sobre o profissional e a data do cadastro.
     * @param value 
     */
    public void setDadosGeraisIsSet(boolean value) {
        cadastroDomiciliar.setDadosGeraisIsSet(value);
    }

    /**
     * Informações sobre o endereço do domicílio. 
     * @return EnderecoLocalPermanencia
     * Preenchimento obrigatório caso o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = false
     */
    public EnderecoLocalPermanencia getEnderecoLocalPermanencia() {
        return new EnderecoLocalPermanencia(cadastroDomiciliar.getEnderecoLocalPermanencia());
    }

    /**
     * Informações sobre o endereço do domicílio.
     * @param enderecoLocalPermanencia 
     * Preenchimento obrigatório caso o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = false
     */
    public void setEnderecoLocalPermanencia(EnderecoLocalPermanencia enderecoLocalPermanencia) {
        cadastroDomiciliar.setEnderecoLocalPermanencia(enderecoLocalPermanencia.getInstance());
    }

    public void unsetEnderecoLocalPermanencia() {
        cadastroDomiciliar.unsetEnderecoLocalPermanencia();
    }

    /**
     * Informações sobre o endereço do domicílio. 
     * @return EnderecoLocalPermanencia
     * Preenchimento obrigatório caso o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = false
     */
    public boolean isSetEnderecoLocalPermanencia() {
        return cadastroDomiciliar.isSetEnderecoLocalPermanencia();
    }

    /**
     * Informações sobre o endereço do domicílio.
     * @param value 
     */
    public void setEnderecoLocalPermanenciaIsSet(boolean value) {
        cadastroDomiciliar.setEnderecoLocalPermanenciaIsSet(value);
    }

    /**
     * Lista das famílias que residem no domicílio.
     * @return FamiliasSize
     * Tamanho máximo = 4
     */
    public int getFamiliasSize() {
        return cadastroDomiciliar.getFamiliasSize();
    }

    /**
     * Lista das famílias que residem no domicílio.
     * @return Iterator<FamiliaRow>
     */
    public Iterator<FamiliaRow> getFamiliasIterator() {
        List<FamiliaRow> listaFamiliaRow = new LinkedList<>();
        
        cadastroDomiciliar.getFamiliasIterator().forEachRemaining((elemento) -> {
            listaFamiliaRow.add(new FamiliaRow(elemento));
        });
        
        return listaFamiliaRow.iterator();
    }

    /**
     * Lista das famílias que residem no domicílio.
     * Tamanho máximo = 4
     * @param elem 
     */
    public void addToFamilias(FamiliaRow elem) {
        cadastroDomiciliar.addToFamilias(elem.getInstance());
    }

    /**
     * Lista das famílias que residem no domicílio.
     * Tamanho máximo = 4
     * @return List<FamiliaRow>
     */
    public List<FamiliaRow> getFamilias() {
        List<FamiliaRow> listaFamiliaRow = new LinkedList<>();
        
        cadastroDomiciliar.getFamilias().forEach((elemento) -> {
            listaFamiliaRow.add(new FamiliaRow(elemento));
        });
        
        return listaFamiliaRow;
    }

    /**
     * Lista das famílias que residem no domicílio.
     * Tamanho máximo = 4
     * @param familias
     * ão pode ser preenchido caso o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true.
     */
    public void setFamilias(List<FamiliaRow> familias) {
        List<FamiliaRowThrift> listaFamiliaRowThrift = new LinkedList<>();
        
        familias.forEach((elemento) -> {
            listaFamiliaRowThrift.add(elemento.getInstance());
        });
        
        cadastroDomiciliar.setFamilias(listaFamiliaRowThrift);
    }

    public void unsetFamilias() {
        cadastroDomiciliar.unsetFamilias();
    }

    /**
     * Lista das famílias que residem no domicílio.
     * @return Familias
     * Não pode ser preenchido caso o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true.
     */
    public boolean isSetFamilias() {
        return cadastroDomiciliar.isSetFamilias();
    }

    /**
     * Lista das famílias que residem no domicílio.
     * @param value 
     */
    public void setFamiliasIsSet(boolean value) {
        cadastroDomiciliar.setFamiliasIsSet(value);
    }

    /**
     * Marcador que indica se a ficha é uma atualização.
     * @return FichaAtualizada
     * Caso seja uma ficha de atualização, o campo uuidFichaOriginadora deve ser preenchido com o UUID da ficha que deu origem ao registro.
     * É COndicional e tem tamanho máximo = 2
     */
    public boolean isFichaAtualizada() {
        return cadastroDomiciliar.isFichaAtualizada();
    }

    /**
     * Marcador que indica se a ficha é uma atualização.
     * @param fichaAtualizada 
     */
    public void setFichaAtualizada(boolean fichaAtualizada) {
        cadastroDomiciliar.setFichaAtualizada(fichaAtualizada);
    }

    public void unsetFichaAtualizada() {
        cadastroDomiciliar.unsetFichaAtualizada();
    }

    /**
     * Marcador que indica se a ficha é uma atualização.
     * @return FichaAtualizada 
     */
    public boolean isSetFichaAtualizada() {
        return cadastroDomiciliar.isSetFichaAtualizada();
    }

    public void setFichaAtualizadaIsSet(boolean value) {
        cadastroDomiciliar.setFichaAtualizadaIsSet(value);
    }

    /**
     * Número de animais no domicílio
     * @return QuantosAnimaisNoDomicilio
     * Não pode ser preenchido se o campo stAnimaisNoDomicilio = false.
     * Não pode ser preenchido se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true.

     */
    public String getQuantosAnimaisNoDomicilio() {
        return cadastroDomiciliar.getQuantosAnimaisNoDomicilio();
    }

    /**
     * Número de animais no domicílio
     * @param quantosAnimaisNoDomicilio 
     * Não pode ser preenchido se o campo stAnimaisNoDomicilio = false.
     * Não pode ser preenchido se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true.
     */
    public void setQuantosAnimaisNoDomicilio(String quantosAnimaisNoDomicilio) {
        cadastroDomiciliar.setQuantosAnimaisNoDomicilio(quantosAnimaisNoDomicilio);
    }

    public void unsetQuantosAnimaisNoDomicilio() {
        cadastroDomiciliar.unsetQuantosAnimaisNoDomicilio();
    }

    /**
     * Número de animais no domicílio
     * @return quantosAnimaisNoDomicilio
     * Não pode ser preenchido se o campo stAnimaisNoDomicilio = false.
     * Não pode ser preenchido se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true.
     */
    public boolean isSetQuantosAnimaisNoDomicilio() {
        return cadastroDomiciliar.isSetQuantosAnimaisNoDomicilio();
    }

    /**
     * Número de animais no domicílio
     * @param value 
     */
    public void setQuantosAnimaisNoDomicilioIsSet(boolean value) {
        cadastroDomiciliar.setQuantosAnimaisNoDomicilioIsSet(value);
    }

    /**
     * Marcador que indica se existem animais no domicílio.
     * @return StAnimaisNoDomicilio 
     * Não pode ser preenchido se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true.
     */
    public boolean isStAnimaisNoDomicilio() {
        return cadastroDomiciliar.isStAnimaisNoDomicilio();
    }

    /**
     * Marcador que indica se existem animais no domicílio.
     * @param stAnimaisNoDomicilio
     * Não pode ser preenchido se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true.
     */
    public void setStAnimaisNoDomicilio(boolean stAnimaisNoDomicilio) {
        cadastroDomiciliar.setStAnimaisNoDomicilio(stAnimaisNoDomicilio);
    }

    public void unsetStAnimaisNoDomicilio() {
        cadastroDomiciliar.unsetStAnimaisNoDomicilio();
    }

    /**
     * Marcador que indica se existem animais no domicílio.
     * @return stAnimaisNoDomicilio
     * Não pode ser preenchido se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true.
     */
    public boolean isSetStAnimaisNoDomicilio() {
        return cadastroDomiciliar.isSetStAnimaisNoDomicilio();
    }

    /**
     * Marcador que indica se existem animais no domicílio.
     * @param value 
     */
    public void setStAnimaisNoDomicilioIsSet(boolean value) {
        cadastroDomiciliar.setStAnimaisNoDomicilioIsSet(value);
    }

    /**
     * Marcador que indica se o cadastro foi utilizado o termo de recusa de cadastro do domicílio.
     * @return StatusTermoRecusaCadastroDomiciliarAtencaoBasica
     */
    public boolean isStatusTermoRecusaCadastroDomiciliarAtencaoBasica() {
        return cadastroDomiciliar.isStatusTermoRecusaCadastroDomiciliarAtencaoBasica();
    }

    /**
     * Marcador que indica se o cadastro foi utilizado o termo de recusa de cadastro do domicílio.
     * @param statusTermoRecusaCadastroDomiciliarAtencaoBasica 
     */
    public void setStatusTermoRecusaCadastroDomiciliarAtencaoBasica(boolean statusTermoRecusaCadastroDomiciliarAtencaoBasica) {
        cadastroDomiciliar.setStatusTermoRecusaCadastroDomiciliarAtencaoBasica(statusTermoRecusaCadastroDomiciliarAtencaoBasica);
    }

    public void unsetStatusTermoRecusaCadastroDomiciliarAtencaoBasica() {
        cadastroDomiciliar.unsetStatusTermoRecusaCadastroDomiciliarAtencaoBasica();
    }

    /**
     * Marcador que indica se o cadastro foi utilizado o termo de recusa de cadastro do domicílio.
     * @return statusTermoRecusaCadastroDomiciliarAtencaoBasica
     */
    public boolean isSetStatusTermoRecusaCadastroDomiciliarAtencaoBasica() {
        return cadastroDomiciliar.isSetStatusTermoRecusaCadastroDomiciliarAtencaoBasica();
    }

    /**
     * Marcador que indica se o cadastro foi utilizado o termo de recusa de cadastro do domicílio.
     * @param value 
     */
    public void setStatusTermoRecusaCadastroDomiciliarAtencaoBasicaIsSet(boolean value) {
        cadastroDomiciliar.setStatusTermoRecusaCadastroDomiciliarAtencaoBasicaIsSet(value);
    }
    
    /**
     * Tipo de origem dos dados do registro.
     * @return tpCdsOrigem 
     * Tamanho máximo = 1
     */
    public int getTpCdsOrigem() {
        return cadastroDomiciliar.getTpCdsOrigem();
    }

    /**
     * Tipo de origem dos dados do registro.
     * @param tpCdsOrigem 
     * Tamanho máximo = 1
     */
    public void setTpCdsOrigem(int tpCdsOrigem) {
        cadastroDomiciliar.setTpCdsOrigem(tpCdsOrigem);
    }

    public void unsetTpCdsOrigem() {
        cadastroDomiciliar.unsetTpCdsOrigem();
    }

    /**
     * Tipo de origem dos dados do registro.
     * @return tpCdsOrigem  
     */
    public boolean isSetTpCdsOrigem() {
        return cadastroDomiciliar.isSetTpCdsOrigem();
    }

    /**
     * Tipo de origem dos dados do registro.
     * @param value 
     */
    public void setTpCdsOrigemIsSet(boolean value) {
        cadastroDomiciliar.setTpCdsOrigemIsSet(value);
    }

    /**
     * Código UUID para identificar a ficha na base de dados nacional. 
     * @return uuid
     */
    public String getUuid() {
        return cadastroDomiciliar.getUuid();
    }

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @param uuid 
     */
    public void setUuid(String uuid) {
        cadastroDomiciliar.setUuid(uuid);
    }

    public void unsetUuid() {
        cadastroDomiciliar.unsetUuid();
    }

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @return uuid
     */
    public boolean isSetUuid() {
        return cadastroDomiciliar.isSetUuid();
    }

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @param value 
     */
    public void setUuidIsSet(boolean value) {
        cadastroDomiciliar.setUuidIsSet(value);
    }

    /**
     * Código UUID para identificar a ficha que deu origem ao cadastro do registro.
     * @return uuidFichaOriginadora
     */
    public String getUuidFichaOriginadora() {
        return cadastroDomiciliar.getUuidFichaOriginadora();
    }

    /**
     * Código UUID para identificar a ficha que deu origem ao cadastro do registro
     * @param uuidFichaOriginadora 
     */
    public void setUuidFichaOriginadora(String uuidFichaOriginadora) {
        cadastroDomiciliar.setUuidFichaOriginadora(uuidFichaOriginadora);
    }

    public void unsetUuidFichaOriginadora() {
        cadastroDomiciliar.unsetUuidFichaOriginadora();
    }

    /**
     * Código UUID para identificar a ficha que deu origem ao cadastro do registro.
     * @return uuidFichaOriginadora
     */
    public boolean isSetUuidFichaOriginadora() {
        return cadastroDomiciliar.isSetUuidFichaOriginadora();
    }

    /**
     * Código UUID para identificar a ficha que deu origem ao cadastro do registro.
     * @param value 
     */
    public void setUuidFichaOriginadoraIsSet(boolean value) {
        cadastroDomiciliar.setUuidFichaOriginadoraIsSet(value);
    }

    /**
     * @param that
     * @return that 
     */
    @Override
    public boolean equals(Object that) {
        return cadastroDomiciliar.equals(that);
    }

    public boolean equals(CadastroDomiciliar that) {
        return cadastroDomiciliar.equals(that.getInstance());
    }

    public int hashCode() {
        return cadastroDomiciliar.hashCode();
    }

    /**
     * 
     * @param other
     * @return other 
     */
    public int compareTo(CadastroDomiciliar other) {
        return cadastroDomiciliar.compareTo(other.getInstance());
    }

    @Override
    public String toString() {
        return cadastroDomiciliar.toString();
    }

    /**
     * 
     * @throws TException 
     */
    public void validate() throws TException {
        cadastroDomiciliar.validate();
    }

    protected CadastroDomiciliarThrift getInstance(){
        return this.cadastroDomiciliar;
    }
    
    /**
     * Metodo validade cria os metodos que fazem as validações
     * Chama todos os metodos que fazem validações
     * @return Todos os metodos de validação
     *          validaAnimaisNoDomicilio() && validaCondicaoMoradia() && validaDadosGerais() &&
                validaEnderecoLocalPermanencia() && validaFamilias() && validaFichaAtualizada() && validaQuantosAnimaisNoDomicilio() &&
                validaStAnimaisNoDomicilio() && validaStatusTermoRecusaCadastroDomiciliarAtencaoBasica() && validaTpCdsOrigem() && validaUuid() && validaUuidFichaOriginadora();
     */
    public boolean validates(){
        
        return validaAnimaisNoDomicilio() &&
                validaCondicaoMoradia() &&
                validaDadosGerais() &&
                validaEnderecoLocalPermanencia() &&
                validaFamilias() &&
                validaFichaAtualizada() &&
                validaQuantosAnimaisNoDomicilio() &&
                validaStAnimaisNoDomicilio() &&
                validaStatusTermoRecusaCadastroDomiciliarAtencaoBasica() &&
                validaTpCdsOrigem() &&
                validaUuid() &&
                validaUuidFichaOriginadora();
    }
    
    /**
     * Lista de código dos animais no domicílio.
     * @return List<long> 
     * É Condicional
     * Não pode ser preenchido se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true.
     */
    public boolean validaAnimaisNoDomicilio(){
        /**
         * Ainda é necessário fazer valodação de List<Long> pode ser Condicional
         * Minimo 0 e Máximo  5
         */ 
        if(cadastroDomiciliar.isSetStatusTermoRecusaCadastroDomiciliarAtencaoBasica()==true)
            return false;
        else 
            return true &&
                    cadastroDomiciliar.isSetAnimaisNoDomicilio();
    }
    
   /**
    * Condições de moradia do domicílio.
    * @return CondicaoMoradia
    * É Condicional
    * Não devem ser preenchidos se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true
    */ 
   public boolean validaCondicaoMoradia(){
        if(cadastroDomiciliar.isSetStatusTermoRecusaCadastroDomiciliarAtencaoBasica()==true)
            return false;
        else 
            return true &&
                    cadastroDomiciliar.isSetCondicaoMoradia();
    }
   
   /**
    * Informações sobre o profissional e a data do cadastro. 
    * @return HeaderCdsCadastro
    * É Obrigatório
    */
   public boolean validaDadosGerais(){
       return cadastroDomiciliar.isSetDadosGerais();
   }
   
   /**
    * Informações sobre o endereço do domicílio.
    * @return EnderecoLocalPermanencia
    * É Condicional
    * Preenchimento obrigatório caso o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = false.
    */
   public boolean validaEnderecoLocalPermanencia(){
       if(cadastroDomiciliar.isSetStatusTermoRecusaCadastroDomiciliarAtencaoBasica()==false)
            return true &&
                    cadastroDomiciliar.isSetEnderecoLocalPermanencia();
        else 
            return false;
   }
   
   /**
    * Lista das famílias que residem no domicílio.
    * @return List<FamiliaRow>
    * É Condicional
    * Não pode ser preenchido caso o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true.
    */
   public boolean validaFamilias(){
      /**
      * Ainda é necessário fazer valodação de List<Long> pode ser Condicional
      * Minimo 0 e Máximo  4
      */  
      if(cadastroDomiciliar.isSetStatusTermoRecusaCadastroDomiciliarAtencaoBasica()==true)
            return false;
        else 
            return true &&
                    cadastroDomiciliar.isSetFamilias(); 
   }
   
   /**
    * Marcador que indica se a ficha é uma atualização. 
    * @return FichaAtualizada
    * É Obrigatório
    * Caso seja uma ficha de atualização, o campo uuidFichaOriginadora deve ser preenchido com o UUID da ficha que deu origem ao registro.
    */
   public boolean validaFichaAtualizada(){
       return cadastroDomiciliar.isSetFichaAtualizada() == true ;
   }
   
   /**
    * Número de animais no domicílio.
    * @return value
    * É Condicional
    * Não pode ser preenchido se o campo stAnimaisNoDomicilio = false.
    * Não pode ser preenchido se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true.
    */
   public boolean validaQuantosAnimaisNoDomicilio(){
       String quantosAnimaisNoDomicilio = cadastroDomiciliar.getQuantosAnimaisNoDomicilio();
       
       if(cadastroDomiciliar.isSetStAnimaisNoDomicilio()==false &&
               cadastroDomiciliar.isSetStatusTermoRecusaCadastroDomiciliarAtencaoBasica()==true)
           return false;
       else 
           return quantosAnimaisNoDomicilio.length() >=0 && 
                   quantosAnimaisNoDomicilio.length() <=2; 
   }
   
   /**
    * Marcador que indica se existem animais no domicílio.
    * @return StAnimaisNoDomicilio
    * É Condicional
    * Não pode ser preenchido se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true
    */
   public boolean validaStAnimaisNoDomicilio(){
       if(cadastroDomiciliar.isSetStatusTermoRecusaCadastroDomiciliarAtencaoBasica()==true)
            return false;
        else 
            return true &&
                    cadastroDomiciliar.isSetStAnimaisNoDomicilio(); 
   }
   
   /**
    * Marcador que indica se o cadastro foi utilizado o termo de recusa de cadastro do domicílio.
    * @return StatusTermoRecusaCadastroDomiciliarAtencaoBasica
    * Não é Obrigatório
    */
   public boolean validaStatusTermoRecusaCadastroDomiciliarAtencaoBasica(){
        return cadastroDomiciliar.isSetStatusTermoRecusaCadastroDomiciliarAtencaoBasica() == true ;
   }
   
   /**
    * Tipo de origem dos dados do registro.
    * @return TpCdsOrigem
    * É obrigatório
    * Tamanho minimo e máximo igual a 1
    */
   public boolean validaTpCdsOrigem(){
       return cadastroDomiciliar.isSetTpCdsOrigem();
   }
   
   /**
    * Código UUID para identificar a ficha na base de dados nacional.
    * @return  Uuid
    * É Obrigatório
    * tamanho mínimo = 3
    * tamanho maximo = 44
    */
   public boolean validaUuid(){
       String uuid = cadastroDomiciliar.getUuid();
       return uuid != null &&
               uuid.length() >=3 &&
               uuid.length() <=44;
   }
   
   /**
    * Código UUID para identificar a ficha que deu origem ao cadastro do registro.
    * @return UuidFichaOriginadora
    * tamanho mínimo = 3
    * tamanho maximo = 44
    */
   public boolean validaUuidFichaOriginadora(){
       String uuidFichaOriginadora = cadastroDomiciliar.getUuidFichaOriginadora();
       return uuidFichaOriginadora != null &&
               uuidFichaOriginadora.length() >=3 &&
               uuidFichaOriginadora.length() <=44;    
   } 
}