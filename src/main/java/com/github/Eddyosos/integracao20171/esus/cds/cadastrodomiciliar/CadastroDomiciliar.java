package com.github.Eddyosos.integracao20171.esus.cds.cadastrodomiciliar;

import br.gov.saude.esus.cds.transport.generated.thrift.cadastrodomiciliar.CadastroDomiciliarThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.cadastrodomiciliar.FamiliaRowThrift;
import com.github.Eddyosos.integracao20171.esus.cds.common.EnderecoLocalPermanencia;
import com.github.Eddyosos.integracao20171.esus.cds.common.HeaderCdsCadastro;
import com.github.eddyosos.e_sus_ab_factory.cds.common.IEnderecoLocalPermanencia;
import com.github.eddyosos.e_sus_ab_factory.cds.common.IHeaderCdsCadastro;
import com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.cadastrodomiciliar.ICadastroDomiciliar;
import com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.cadastrodomiciliar.ICondicaoMoradia;
import com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.cadastrodomiciliar.IFamiliaRow;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.thrift.TException;

public class CadastroDomiciliar implements ICadastroDomiciliar {
    /**
     * Instancia para encapsulamento do Thrift
     */
    private CadastroDomiciliarThrift cadastroDomiciliar;
    
    public CadastroDomiciliar() {
        cadastroDomiciliar = new CadastroDomiciliarThrift();
    }

    /**
     * É protegido pois não deve estar visível para o usuário
     * @param cadastroDomiciliar 
     */
    public CadastroDomiciliar(CadastroDomiciliarThrift cadastroDomiciliar) {
        this.cadastroDomiciliar = cadastroDomiciliar;
    }

    /**
     * Lista de código dos animais no domicílio.
     * @return value
     */
    @Override
    public int getAnimaisNoDomicilioSize() {
        return cadastroDomiciliar.getAnimaisNoDomicilioSize();
    }

    /**
     * Lista de código dos animais no domicílio.
     * @return Iterator<Long>
     */
    @Override
    public Iterator<Long> getAnimaisNoDomicilioIterator() {
        return cadastroDomiciliar.getAnimaisNoDomicilioIterator();
    }

    /**
     * Lista de código dos animais no domicílio.
     * @param elem 
     * Adiciona Elemento 
     */
    @Override
    public void addToAnimaisNoDomicilio(long elem) {
        cadastroDomiciliar.addToAnimaisNoDomicilio(elem);
    }

    /**
     * Lista de código dos animais no domicílio.
     * @return List<Long>
     */
    @Override
    public List<Long> getAnimaisNoDomicilio() {
        return cadastroDomiciliar.getAnimaisNoDomicilio();
    }

    /**
     * Lista de código dos animais no domicílio.
     * @param animaisNoDomicilio 
     */
    @Override
    public void setAnimaisNoDomicilio(List<Long> animaisNoDomicilio) {
        cadastroDomiciliar.setAnimaisNoDomicilio(animaisNoDomicilio);
    }

    @Override
    public void unsetAnimaisNoDomicilio() {
        cadastroDomiciliar.unsetAnimaisNoDomicilio();
    }

    /**
     * Lista de código dos animais no domicílio.
     * @return animaisNoDomicilio 
     */
    @Override
    public boolean isSetAnimaisNoDomicilio() {
        return cadastroDomiciliar.isSetAnimaisNoDomicilio();
    }

    /**
     * Lista de código dos animais no domicílio.
     * @param value 
     */
    @Override
    public void setAnimaisNoDomicilioIsSet(boolean value) {
        cadastroDomiciliar.setAnimaisNoDomicilioIsSet(value);
    }

    /**
     * Condições de moradia do domicílio
     * @return ondicaoMoradia
     * Não devem ser preenchidos se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true
     */
    @Override
    public ICondicaoMoradia getCondicaoMoradia() {
        return new CondicaoMoradia(cadastroDomiciliar.getCondicaoMoradia());
    }

    /**
     * Condições de moradia do domicílio. 
     * @param condicaoMoradia 
     * Não devem ser preenchidos se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true
     */
    @Override
    public void setCondicaoMoradia(ICondicaoMoradia condicaoMoradia) {
        cadastroDomiciliar.setCondicaoMoradia(condicaoMoradia.getInstence());
    }

    @Override
    public void unsetCondicaoMoradia() {
        cadastroDomiciliar.unsetCondicaoMoradia();
    }

    /**
     * Condições de moradia do domicílio.
     * @return CondicaoMoradia
     */
    @Override
    public boolean isSetCondicaoMoradia() {
        return cadastroDomiciliar.isSetCondicaoMoradia();
    }

    /**
     * Condições de moradia do domicílio.
     * @param value 
     */
    @Override
    public void setCondicaoMoradiaIsSet(boolean value) {
        cadastroDomiciliar.setCondicaoMoradiaIsSet(value);
    }

    /**
     * Informações sobre o profissional e a data do cadastro.
     * @return value
     */
    @Override
    public IHeaderCdsCadastro getDadosGerais() {
        return new HeaderCdsCadastro(cadastroDomiciliar.getDadosGerais());
    }

    /**
     * Informações sobre o profissional e a data do cadastro.
     * @param dadosGerais 
     */
    @Override
    public void setDadosGerais(IHeaderCdsCadastro dadosGerais) {
        cadastroDomiciliar.setDadosGerais(dadosGerais.getInstance());
    }

    @Override
    public void unsetDadosGerais() {
        cadastroDomiciliar.unsetDadosGerais();
    }

    /**
     * Informações sobre o profissional e a data do cadastro.
     * @return  DadosGerais
     */
    @Override
    public boolean isSetDadosGerais() {
        return cadastroDomiciliar.isSetDadosGerais();
    }

    /**
     * Informações sobre o profissional e a data do cadastro.
     * @param value 
     */
    @Override
    public void setDadosGeraisIsSet(boolean value) {
        cadastroDomiciliar.setDadosGeraisIsSet(value);
    }

    /**
     * Informações sobre o endereço do domicílio. 
     * @return EnderecoLocalPermanencia
     * Preenchimento obrigatório caso o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = false
     */
    @Override
    public IEnderecoLocalPermanencia getEnderecoLocalPermanencia() {
        return new EnderecoLocalPermanencia(cadastroDomiciliar.getEnderecoLocalPermanencia());
    }

    /**
     * Informações sobre o endereço do domicílio.
     * @param enderecoLocalPermanencia 
     * Preenchimento obrigatório caso o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = false
     */
    @Override
    public void setEnderecoLocalPermanencia(IEnderecoLocalPermanencia enderecoLocalPermanencia) {
        cadastroDomiciliar.setEnderecoLocalPermanencia(enderecoLocalPermanencia.getInstance());
    }

    @Override
    public void unsetEnderecoLocalPermanencia() {
        cadastroDomiciliar.unsetEnderecoLocalPermanencia();
    }

    /**
     * Informações sobre o endereço do domicílio. 
     * @return EnderecoLocalPermanencia
     * Preenchimento obrigatório caso o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = false
     */
    @Override
    public boolean isSetEnderecoLocalPermanencia() {
        return cadastroDomiciliar.isSetEnderecoLocalPermanencia();
    }

    /**
     * Informações sobre o endereço do domicílio.
     * @param value 
     */
    @Override
    public void setEnderecoLocalPermanenciaIsSet(boolean value) {
        cadastroDomiciliar.setEnderecoLocalPermanenciaIsSet(value);
    }

    /**
     * Lista das famílias que residem no domicílio.
     * @return FamiliasSize
     * Tamanho máximo = 4
     */
    @Override
    public int getFamiliasSize() {
        return cadastroDomiciliar.getFamiliasSize();
    }

    /**
     * Lista das famílias que residem no domicílio.
     * @return Iterator<FamiliaRow>
     */
    @Override
    public Iterator<IFamiliaRow> getFamiliasIterator() {
        List<IFamiliaRow> listaFamiliaRow = new LinkedList<>();
        
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
    @Override
    public void addToFamilias(IFamiliaRow elem) {
        cadastroDomiciliar.addToFamilias(elem.getInstance());
    }

    /**
     * Lista das famílias que residem no domicílio.
     * Tamanho máximo = 4
     * @return List<FamiliaRow>
     */
    @Override
    public List<IFamiliaRow> getFamilias() {
        List<IFamiliaRow> listaFamiliaRow = new LinkedList<>();
        
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
    @Override
    public void setFamilias(List<IFamiliaRow> familias) {
        List<FamiliaRowThrift> listaFamiliaRowThrift = new LinkedList<>();
        
        familias.forEach((elemento) -> {
            listaFamiliaRowThrift.add(elemento.getInstance());
        });
        
        cadastroDomiciliar.setFamilias(listaFamiliaRowThrift);
    }

    @Override
    public void unsetFamilias() {
        cadastroDomiciliar.unsetFamilias();
    }

    /**
     * Lista das famílias que residem no domicílio.
     * @return Familias
     * Não pode ser preenchido caso o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true.
     */
    @Override
    public boolean isSetFamilias() {
        return cadastroDomiciliar.isSetFamilias();
    }

    /**
     * Lista das famílias que residem no domicílio.
     * @param value 
     */
    @Override
    public void setFamiliasIsSet(boolean value) {
        cadastroDomiciliar.setFamiliasIsSet(value);
    }

    /**
     * Marcador que indica se a ficha é uma atualização.
     * @return FichaAtualizada
     * Caso seja uma ficha de atualização, o campo uuidFichaOriginadora deve ser preenchido com o UUID da ficha que deu origem ao registro.
     * É COndicional e tem tamanho máximo = 2
     */
    @Override
    public boolean isFichaAtualizada() {
        return cadastroDomiciliar.isFichaAtualizada();
    }

    /**
     * Marcador que indica se a ficha é uma atualização.
     * @param fichaAtualizada 
     */
    @Override
    public void setFichaAtualizada(boolean fichaAtualizada) {
        cadastroDomiciliar.setFichaAtualizada(fichaAtualizada);
    }

    @Override
    public void unsetFichaAtualizada() {
        cadastroDomiciliar.unsetFichaAtualizada();
    }

    /**
     * Marcador que indica se a ficha é uma atualização.
     * @return FichaAtualizada 
     */
    @Override
    public boolean isSetFichaAtualizada() {
        return cadastroDomiciliar.isSetFichaAtualizada();
    }

    @Override
    public void setFichaAtualizadaIsSet(boolean value) {
        cadastroDomiciliar.setFichaAtualizadaIsSet(value);
    }

    /**
     * Número de animais no domicílio
     * @return QuantosAnimaisNoDomicilio
     * Não pode ser preenchido se o campo stAnimaisNoDomicilio = false.
     * Não pode ser preenchido se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true.

     */
    @Override
    public String getQuantosAnimaisNoDomicilio() {
        return cadastroDomiciliar.getQuantosAnimaisNoDomicilio();
    }

    /**
     * Número de animais no domicílio
     * @param quantosAnimaisNoDomicilio 
     * Não pode ser preenchido se o campo stAnimaisNoDomicilio = false.
     * Não pode ser preenchido se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true.
     */
    @Override
    public void setQuantosAnimaisNoDomicilio(String quantosAnimaisNoDomicilio) {
        cadastroDomiciliar.setQuantosAnimaisNoDomicilio(quantosAnimaisNoDomicilio);
    }

    @Override
    public void unsetQuantosAnimaisNoDomicilio() {
        cadastroDomiciliar.unsetQuantosAnimaisNoDomicilio();
    }

    /**
     * Número de animais no domicílio
     * @return quantosAnimaisNoDomicilio
     * Não pode ser preenchido se o campo stAnimaisNoDomicilio = false.
     * Não pode ser preenchido se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true.
     */
    @Override
    public boolean isSetQuantosAnimaisNoDomicilio() {
        return cadastroDomiciliar.isSetQuantosAnimaisNoDomicilio();
    }

    /**
     * Número de animais no domicílio
     * @param value 
     */
    @Override
    public void setQuantosAnimaisNoDomicilioIsSet(boolean value) {
        cadastroDomiciliar.setQuantosAnimaisNoDomicilioIsSet(value);
    }

    /**
     * Marcador que indica se existem animais no domicílio.
     * @return StAnimaisNoDomicilio 
     * Não pode ser preenchido se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true.
     */
    @Override
    public boolean isStAnimaisNoDomicilio() {
        return cadastroDomiciliar.isStAnimaisNoDomicilio();
    }

    /**
     * Marcador que indica se existem animais no domicílio.
     * @param stAnimaisNoDomicilio
     * Não pode ser preenchido se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true.
     */
    @Override
    public void setStAnimaisNoDomicilio(boolean stAnimaisNoDomicilio) {
        cadastroDomiciliar.setStAnimaisNoDomicilio(stAnimaisNoDomicilio);
    }

    @Override
    public void unsetStAnimaisNoDomicilio() {
        cadastroDomiciliar.unsetStAnimaisNoDomicilio();
    }

    /**
     * Marcador que indica se existem animais no domicílio.
     * @return stAnimaisNoDomicilio
     * Não pode ser preenchido se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true.
     */
    @Override
    public boolean isSetStAnimaisNoDomicilio() {
        return cadastroDomiciliar.isSetStAnimaisNoDomicilio();
    }

    /**
     * Marcador que indica se existem animais no domicílio.
     * @param value 
     */
    @Override
    public void setStAnimaisNoDomicilioIsSet(boolean value) {
        cadastroDomiciliar.setStAnimaisNoDomicilioIsSet(value);
    }

    /**
     * Marcador que indica se o cadastro foi utilizado o termo de recusa de cadastro do domicílio.
     * @return StatusTermoRecusaCadastroDomiciliarAtencaoBasica
     */
    @Override
    public boolean isStatusTermoRecusaCadastroDomiciliarAtencaoBasica() {
        return cadastroDomiciliar.isStatusTermoRecusaCadastroDomiciliarAtencaoBasica();
    }

    /**
     * Marcador que indica se o cadastro foi utilizado o termo de recusa de cadastro do domicílio.
     * @param statusTermoRecusaCadastroDomiciliarAtencaoBasica 
     */
    @Override
    public void setStatusTermoRecusaCadastroDomiciliarAtencaoBasica(boolean statusTermoRecusaCadastroDomiciliarAtencaoBasica) {
        cadastroDomiciliar.setStatusTermoRecusaCadastroDomiciliarAtencaoBasica(statusTermoRecusaCadastroDomiciliarAtencaoBasica);
    }

    @Override
    public void unsetStatusTermoRecusaCadastroDomiciliarAtencaoBasica() {
        cadastroDomiciliar.unsetStatusTermoRecusaCadastroDomiciliarAtencaoBasica();
    }

    /**
     * Marcador que indica se o cadastro foi utilizado o termo de recusa de cadastro do domicílio.
     * @return statusTermoRecusaCadastroDomiciliarAtencaoBasica
     */
    @Override
    public boolean isSetStatusTermoRecusaCadastroDomiciliarAtencaoBasica() {
        return cadastroDomiciliar.isSetStatusTermoRecusaCadastroDomiciliarAtencaoBasica();
    }

    /**
     * Marcador que indica se o cadastro foi utilizado o termo de recusa de cadastro do domicílio.
     * @param value 
     */
    @Override
    public void setStatusTermoRecusaCadastroDomiciliarAtencaoBasicaIsSet(boolean value) {
        cadastroDomiciliar.setStatusTermoRecusaCadastroDomiciliarAtencaoBasicaIsSet(value);
    }
    
    /**
     * Tipo de origem dos dados do registro.
     * @return tpCdsOrigem 
     * Tamanho máximo = 1
     */
    @Override
    public int getTpCdsOrigem() {
        return cadastroDomiciliar.getTpCdsOrigem();
    }

    /**
     * Tipo de origem dos dados do registro.
     * @param tpCdsOrigem 
     * Tamanho máximo = 1
     */
    @Override
    public void setTpCdsOrigem(int tpCdsOrigem) {
        cadastroDomiciliar.setTpCdsOrigem(tpCdsOrigem);
    }

    @Override
    public void unsetTpCdsOrigem() {
        cadastroDomiciliar.unsetTpCdsOrigem();
    }

    /**
     * Tipo de origem dos dados do registro.
     * @return tpCdsOrigem  
     */
    @Override
    public boolean isSetTpCdsOrigem() {
        return cadastroDomiciliar.isSetTpCdsOrigem();
    }

    /**
     * Tipo de origem dos dados do registro.
     * @param value 
     */
    @Override
    public void setTpCdsOrigemIsSet(boolean value) {
        cadastroDomiciliar.setTpCdsOrigemIsSet(value);
    }

    /**
     * Código UUID para identificar a ficha na base de dados nacional. 
     * @return uuid
     */
    @Override
    public String getUuid() {
        return cadastroDomiciliar.getUuid();
    }

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @param uuid 
     */
    @Override
    public void setUuid(String uuid) {
        cadastroDomiciliar.setUuid(uuid);
    }

    @Override
    public void unsetUuid() {
        cadastroDomiciliar.unsetUuid();
    }

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @return uuid
     */
    @Override
    public boolean isSetUuid() {
        return cadastroDomiciliar.isSetUuid();
    }

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @param value 
     */
    @Override
    public void setUuidIsSet(boolean value) {
        cadastroDomiciliar.setUuidIsSet(value);
    }

    /**
     * Código UUID para identificar a ficha que deu origem ao cadastro do registro.
     * @return uuidFichaOriginadora
     */
    @Override
    public String getUuidFichaOriginadora() {
        return cadastroDomiciliar.getUuidFichaOriginadora();
    }

    /**
     * Código UUID para identificar a ficha que deu origem ao cadastro do registro
     * @param uuidFichaOriginadora 
     */
    @Override
    public void setUuidFichaOriginadora(String uuidFichaOriginadora) {
        cadastroDomiciliar.setUuidFichaOriginadora(uuidFichaOriginadora);
    }

    @Override
    public void unsetUuidFichaOriginadora() {
        cadastroDomiciliar.unsetUuidFichaOriginadora();
    }

    /**
     * Código UUID para identificar a ficha que deu origem ao cadastro do registro.
     * @return uuidFichaOriginadora
     */
    @Override
    public boolean isSetUuidFichaOriginadora() {
        return cadastroDomiciliar.isSetUuidFichaOriginadora();
    }

    /**
     * Código UUID para identificar a ficha que deu origem ao cadastro do registro.
     * @param value 
     */
    @Override
    public void setUuidFichaOriginadoraIsSet(boolean value) {
        cadastroDomiciliar.setUuidFichaOriginadoraIsSet(value);
    }

    /**
     * 
     * @throws TException 
     */
    @Override
    public void validate() throws TException {
        cadastroDomiciliar.validate();
    }

    @Override
    public CadastroDomiciliarThrift getInstance(){
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
    @Override
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
    @Override
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
    @Override
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
    @Override
   public boolean validaDadosGerais(){
       return cadastroDomiciliar.isSetDadosGerais();
   }
   
   /**
    * Informações sobre o endereço do domicílio.
    * @return EnderecoLocalPermanencia
    * É Condicional
    * Preenchimento obrigatório caso o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = false.
    */
    @Override
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
    @Override
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
    @Override
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
    @Override
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
    @Override
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
    @Override
   public boolean validaStatusTermoRecusaCadastroDomiciliarAtencaoBasica(){
        return cadastroDomiciliar.isSetStatusTermoRecusaCadastroDomiciliarAtencaoBasica() == true ;
   }
   
   /**
    * Tipo de origem dos dados do registro.
    * @return TpCdsOrigem
    * É obrigatório
    * Tamanho minimo e máximo igual a 1
    */
    @Override
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
    @Override
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
    @Override
   public boolean validaUuidFichaOriginadora(){
       String uuidFichaOriginadora = cadastroDomiciliar.getUuidFichaOriginadora();
       return uuidFichaOriginadora != null &&
               uuidFichaOriginadora.length() >=3 &&
               uuidFichaOriginadora.length() <=44;    
   } 

}