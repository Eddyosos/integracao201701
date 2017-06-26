package com.github.Eddyosos.integracao20171.esus.cds.cadastrodomiciliar;

import br.gov.saude.esus.cds.transport.generated.thrift.cadastrodomiciliar.CadastroDomiciliarThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.cadastrodomiciliar.FamiliaRowThrift;
import com.github.Eddyosos.integracao20171.compactor.SerializadorThrift;
import com.github.Eddyosos.integracao20171.esus.cds.common.EnderecoLocalPermanencia;
import com.github.Eddyosos.integracao20171.esus.cds.common.HeaderCdsCadastro;
import com.github.Eddyosos.integracao20171.esus.transport.DadoTransporte;
import com.github.eddyosos.e_sus_ab_factory.cds.common.IEnderecoLocalPermanencia;
import com.github.eddyosos.e_sus_ab_factory.cds.common.IHeaderCdsCadastro;
import com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.cadastrodomiciliar.ICadastroDomiciliar;
import com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.cadastrodomiciliar.ICondicaoMoradia;
import com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.cadastrodomiciliar.IFamiliaRow;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.apache.thrift.TException;

public class CadastroDomiciliar implements ICadastroDomiciliar {
    /**
     * Instancia para encapsulamento do Thrift
     */
    private CadastroDomiciliarThrift instancia;
    private long TIPO_DADO_SERIALIZADO_FICHA_PROCEDIMENTO = 3;
    private final static String EXTENSAO_EXPORT = ".esus13";
    private DadoTransporte dadoTransporteThrift;
    
    public CadastroDomiciliar() {
        instancia = new CadastroDomiciliarThrift();
    }

    /**
     * É protegido pois não deve estar visível para o usuário
     * @param cadastroDomiciliar 
     */
    public CadastroDomiciliar(CadastroDomiciliarThrift cadastroDomiciliar) {
        this.instancia = cadastroDomiciliar;
    }

    /**
     * Lista de código dos animais no domicílio.
     * @return value
     */
    @Override
    public int getAnimaisNoDomicilioSize() {
        return instancia.getAnimaisNoDomicilioSize();
    }

    /**
     * Lista de código dos animais no domicílio.
     * @return Iterator<Long>
     */
    @Override
    public Iterator<Long> getAnimaisNoDomicilioIterator() {
        return instancia.getAnimaisNoDomicilioIterator();
    }

    /**
     * Lista de código dos animais no domicílio.
     * @param elem 
     * Adiciona Elemento 
     */
    @Override
    public void addToAnimaisNoDomicilio(long elem) {
        instancia.addToAnimaisNoDomicilio(elem);
    }

    /**
     * Lista de código dos animais no domicílio.
     * @return List<Long>
     */
    @Override
    public List<Long> getAnimaisNoDomicilio() {
        return instancia.getAnimaisNoDomicilio();
    }

    /**
     * Lista de código dos animais no domicílio.
     * @param animaisNoDomicilio 
     */
    @Override
    public void setAnimaisNoDomicilio(List<Long> animaisNoDomicilio) {
        instancia.setAnimaisNoDomicilio(animaisNoDomicilio);
    }

    @Override
    public void unsetAnimaisNoDomicilio() {
        instancia.unsetAnimaisNoDomicilio();
    }

    /**
     * Lista de código dos animais no domicílio.
     * @return animaisNoDomicilio 
     */
    @Override
    public boolean isSetAnimaisNoDomicilio() {
        return instancia.isSetAnimaisNoDomicilio();
    }

    /**
     * Lista de código dos animais no domicílio.
     * @param value 
     */
    @Override
    public void setAnimaisNoDomicilioIsSet(boolean value) {
        instancia.setAnimaisNoDomicilioIsSet(value);
    }

    /**
     * Condições de moradia do domicílio
     * @return ondicaoMoradia
     * Não devem ser preenchidos se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true
     */
    @Override
    public ICondicaoMoradia getCondicaoMoradia() {
        return new CondicaoMoradia(instancia.getCondicaoMoradia());
    }

    /**
     * Condições de moradia do domicílio. 
     * @param condicaoMoradia 
     * Não devem ser preenchidos se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true
     */
    @Override
    public void setCondicaoMoradia(ICondicaoMoradia condicaoMoradia) {
        instancia.setCondicaoMoradia(condicaoMoradia.getInstence());
    }

    @Override
    public void unsetCondicaoMoradia() {
        instancia.unsetCondicaoMoradia();
    }

    /**
     * Condições de moradia do domicílio.
     * @return CondicaoMoradia
     */
    @Override
    public boolean isSetCondicaoMoradia() {
        return instancia.isSetCondicaoMoradia();
    }

    /**
     * Condições de moradia do domicílio.
     * @param value 
     */
    @Override
    public void setCondicaoMoradiaIsSet(boolean value) {
        instancia.setCondicaoMoradiaIsSet(value);
    }

    /**
     * Informações sobre o profissional e a data do cadastro.
     * @return value
     */
    @Override
    public IHeaderCdsCadastro getDadosGerais() {
        return new HeaderCdsCadastro(instancia.getDadosGerais());
    }

    /**
     * Informações sobre o profissional e a data do cadastro.
     * @param dadosGerais 
     */
    @Override
    public void setDadosGerais(IHeaderCdsCadastro dadosGerais) {
        instancia.setDadosGerais(dadosGerais.getInstance());
    }

    @Override
    public void unsetDadosGerais() {
        instancia.unsetDadosGerais();
    }

    /**
     * Informações sobre o profissional e a data do cadastro.
     * @return  DadosGerais
     */
    @Override
    public boolean isSetDadosGerais() {
        return instancia.isSetDadosGerais();
    }

    /**
     * Informações sobre o profissional e a data do cadastro.
     * @param value 
     */
    @Override
    public void setDadosGeraisIsSet(boolean value) {
        instancia.setDadosGeraisIsSet(value);
    }

    /**
     * Informações sobre o endereço do domicílio. 
     * @return EnderecoLocalPermanencia
     * Preenchimento obrigatório caso o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = false
     */
    @Override
    public IEnderecoLocalPermanencia getEnderecoLocalPermanencia() {
        return new EnderecoLocalPermanencia(instancia.getEnderecoLocalPermanencia());
    }

    /**
     * Informações sobre o endereço do domicílio.
     * @param enderecoLocalPermanencia 
     * Preenchimento obrigatório caso o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = false
     */
    @Override
    public void setEnderecoLocalPermanencia(IEnderecoLocalPermanencia enderecoLocalPermanencia) {
        instancia.setEnderecoLocalPermanencia(enderecoLocalPermanencia.getInstance());
    }

    @Override
    public void unsetEnderecoLocalPermanencia() {
        instancia.unsetEnderecoLocalPermanencia();
    }

    /**
     * Informações sobre o endereço do domicílio. 
     * @return EnderecoLocalPermanencia
     * Preenchimento obrigatório caso o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = false
     */
    @Override
    public boolean isSetEnderecoLocalPermanencia() {
        return instancia.isSetEnderecoLocalPermanencia();
    }

    /**
     * Informações sobre o endereço do domicílio.
     * @param value 
     */
    @Override
    public void setEnderecoLocalPermanenciaIsSet(boolean value) {
        instancia.setEnderecoLocalPermanenciaIsSet(value);
    }

    /**
     * Lista das famílias que residem no domicílio.
     * @return FamiliasSize
     * Tamanho máximo = 4
     */
    @Override
    public int getFamiliasSize() {
        return instancia.getFamiliasSize();
    }

    /**
     * Lista das famílias que residem no domicílio.
     * @return Iterator<FamiliaRow>
     */
    @Override
    public Iterator<IFamiliaRow> getFamiliasIterator() {
        List<IFamiliaRow> listaFamiliaRow = new LinkedList<>();
        
        instancia.getFamiliasIterator().forEachRemaining((elemento) -> {
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
        instancia.addToFamilias(elem.getInstance());
    }

    /**
     * Lista das famílias que residem no domicílio.
     * Tamanho máximo = 4
     * @return List<FamiliaRow>
     */
    @Override
    public List<IFamiliaRow> getFamilias() {
        List<IFamiliaRow> listaFamiliaRow = new LinkedList<>();
        
        instancia.getFamilias().forEach((elemento) -> {
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
        
        instancia.setFamilias(listaFamiliaRowThrift);
    }

    @Override
    public void unsetFamilias() {
        instancia.unsetFamilias();
    }

    /**
     * Lista das famílias que residem no domicílio.
     * @return Familias
     * Não pode ser preenchido caso o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true.
     */
    @Override
    public boolean isSetFamilias() {
        return instancia.isSetFamilias();
    }

    /**
     * Lista das famílias que residem no domicílio.
     * @param value 
     */
    @Override
    public void setFamiliasIsSet(boolean value) {
        instancia.setFamiliasIsSet(value);
    }

    /**
     * Marcador que indica se a ficha é uma atualização.
     * @return FichaAtualizada
     * Caso seja uma ficha de atualização, o campo uuidFichaOriginadora deve ser preenchido com o UUID da ficha que deu origem ao registro.
     * É COndicional e tem tamanho máximo = 2
     */
    @Override
    public boolean isFichaAtualizada() {
        return instancia.isFichaAtualizada();
    }

    /**
     * Marcador que indica se a ficha é uma atualização.
     * @param fichaAtualizada 
     */
    @Override
    public void setFichaAtualizada(boolean fichaAtualizada) {
        instancia.setFichaAtualizada(fichaAtualizada);
    }

    @Override
    public void unsetFichaAtualizada() {
        instancia.unsetFichaAtualizada();
    }

    /**
     * Marcador que indica se a ficha é uma atualização.
     * @return FichaAtualizada 
     */
    @Override
    public boolean isSetFichaAtualizada() {
        return instancia.isSetFichaAtualizada();
    }

    @Override
    public void setFichaAtualizadaIsSet(boolean value) {
        instancia.setFichaAtualizadaIsSet(value);
    }

    /**
     * Número de animais no domicílio
     * @return QuantosAnimaisNoDomicilio
     * Não pode ser preenchido se o campo stAnimaisNoDomicilio = false.
     * Não pode ser preenchido se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true.

     */
    @Override
    public String getQuantosAnimaisNoDomicilio() {
        return instancia.getQuantosAnimaisNoDomicilio();
    }

    /**
     * Número de animais no domicílio
     * @param quantosAnimaisNoDomicilio 
     * Não pode ser preenchido se o campo stAnimaisNoDomicilio = false.
     * Não pode ser preenchido se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true.
     */
    @Override
    public void setQuantosAnimaisNoDomicilio(String quantosAnimaisNoDomicilio) {
        instancia.setQuantosAnimaisNoDomicilio(quantosAnimaisNoDomicilio);
    }

    @Override
    public void unsetQuantosAnimaisNoDomicilio() {
        instancia.unsetQuantosAnimaisNoDomicilio();
    }

    /**
     * Número de animais no domicílio
     * @return quantosAnimaisNoDomicilio
     * Não pode ser preenchido se o campo stAnimaisNoDomicilio = false.
     * Não pode ser preenchido se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true.
     */
    @Override
    public boolean isSetQuantosAnimaisNoDomicilio() {
        return instancia.isSetQuantosAnimaisNoDomicilio();
    }

    /**
     * Número de animais no domicílio
     * @param value 
     */
    @Override
    public void setQuantosAnimaisNoDomicilioIsSet(boolean value) {
        instancia.setQuantosAnimaisNoDomicilioIsSet(value);
    }

    /**
     * Marcador que indica se existem animais no domicílio.
     * @return StAnimaisNoDomicilio 
     * Não pode ser preenchido se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true.
     */
    @Override
    public boolean isStAnimaisNoDomicilio() {
        return instancia.isStAnimaisNoDomicilio();
    }

    /**
     * Marcador que indica se existem animais no domicílio.
     * @param stAnimaisNoDomicilio
     * Não pode ser preenchido se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true.
     */
    @Override
    public void setStAnimaisNoDomicilio(boolean stAnimaisNoDomicilio) {
        instancia.setStAnimaisNoDomicilio(stAnimaisNoDomicilio);
    }

    @Override
    public void unsetStAnimaisNoDomicilio() {
        instancia.unsetStAnimaisNoDomicilio();
    }

    /**
     * Marcador que indica se existem animais no domicílio.
     * @return stAnimaisNoDomicilio
     * Não pode ser preenchido se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true.
     */
    @Override
    public boolean isSetStAnimaisNoDomicilio() {
        return instancia.isSetStAnimaisNoDomicilio();
    }

    /**
     * Marcador que indica se existem animais no domicílio.
     * @param value 
     */
    @Override
    public void setStAnimaisNoDomicilioIsSet(boolean value) {
        instancia.setStAnimaisNoDomicilioIsSet(value);
    }

    /**
     * Marcador que indica se o cadastro foi utilizado o termo de recusa de cadastro do domicílio.
     * @return StatusTermoRecusaCadastroDomiciliarAtencaoBasica
     */
    @Override
    public boolean isStatusTermoRecusaCadastroDomiciliarAtencaoBasica() {
        return instancia.isStatusTermoRecusaCadastroDomiciliarAtencaoBasica();
    }

    /**
     * Marcador que indica se o cadastro foi utilizado o termo de recusa de cadastro do domicílio.
     * @param statusTermoRecusaCadastroDomiciliarAtencaoBasica 
     */
    @Override
    public void setStatusTermoRecusaCadastroDomiciliarAtencaoBasica(boolean statusTermoRecusaCadastroDomiciliarAtencaoBasica) {
        instancia.setStatusTermoRecusaCadastroDomiciliarAtencaoBasica(statusTermoRecusaCadastroDomiciliarAtencaoBasica);
    }

    @Override
    public void unsetStatusTermoRecusaCadastroDomiciliarAtencaoBasica() {
        instancia.unsetStatusTermoRecusaCadastroDomiciliarAtencaoBasica();
    }

    /**
     * Marcador que indica se o cadastro foi utilizado o termo de recusa de cadastro do domicílio.
     * @return statusTermoRecusaCadastroDomiciliarAtencaoBasica
     */
    @Override
    public boolean isSetStatusTermoRecusaCadastroDomiciliarAtencaoBasica() {
        return instancia.isSetStatusTermoRecusaCadastroDomiciliarAtencaoBasica();
    }

    /**
     * Marcador que indica se o cadastro foi utilizado o termo de recusa de cadastro do domicílio.
     * @param value 
     */
    @Override
    public void setStatusTermoRecusaCadastroDomiciliarAtencaoBasicaIsSet(boolean value) {
        instancia.setStatusTermoRecusaCadastroDomiciliarAtencaoBasicaIsSet(value);
    }
    
    /**
     * Tipo de origem dos dados do registro.
     * @return tpCdsOrigem 
     * Tamanho máximo = 1
     */
    @Override
    public int getTpCdsOrigem() {
        return instancia.getTpCdsOrigem();
    }

    /**
     * Tipo de origem dos dados do registro.
     * @param tpCdsOrigem 
     * Tamanho máximo = 1
     */
    @Override
    public void setTpCdsOrigem(int tpCdsOrigem) {
        instancia.setTpCdsOrigem(tpCdsOrigem);
    }

    @Override
    public void unsetTpCdsOrigem() {
        instancia.unsetTpCdsOrigem();
    }

    /**
     * Tipo de origem dos dados do registro.
     * @return tpCdsOrigem  
     */
    @Override
    public boolean isSetTpCdsOrigem() {
        return instancia.isSetTpCdsOrigem();
    }

    /**
     * Tipo de origem dos dados do registro.
     * @param value 
     */
    @Override
    public void setTpCdsOrigemIsSet(boolean value) {
        instancia.setTpCdsOrigemIsSet(value);
    }

    /**
     * Código UUID para identificar a ficha na base de dados nacional. 
     * @return uuid
     */
    @Override
    public String getUuid() {
        return instancia.getUuid();
    }

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @param uuid 
     */
    @Override
    public void setUuid(String uuid) {
        instancia.setUuid(uuid);
    }

    @Override
    public void unsetUuid() {
        instancia.unsetUuid();
    }

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @return uuid
     */
    @Override
    public boolean isSetUuid() {
        return instancia.isSetUuid();
    }

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @param value 
     */
    @Override
    public void setUuidIsSet(boolean value) {
        instancia.setUuidIsSet(value);
    }

    /**
     * Código UUID para identificar a ficha que deu origem ao cadastro do registro.
     * @return uuidFichaOriginadora
     */
    @Override
    public String getUuidFichaOriginadora() {
        return instancia.getUuidFichaOriginadora();
    }

    /**
     * Código UUID para identificar a ficha que deu origem ao cadastro do registro
     * @param uuidFichaOriginadora 
     */
    @Override
    public void setUuidFichaOriginadora(String uuidFichaOriginadora) {
        instancia.setUuidFichaOriginadora(uuidFichaOriginadora);
    }

    @Override
    public void unsetUuidFichaOriginadora() {
        instancia.unsetUuidFichaOriginadora();
    }

    /**
     * Código UUID para identificar a ficha que deu origem ao cadastro do registro.
     * @return uuidFichaOriginadora
     */
    @Override
    public boolean isSetUuidFichaOriginadora() {
        return instancia.isSetUuidFichaOriginadora();
    }

    /**
     * Código UUID para identificar a ficha que deu origem ao cadastro do registro.
     * @param value 
     */
    @Override
    public void setUuidFichaOriginadoraIsSet(boolean value) {
        instancia.setUuidFichaOriginadoraIsSet(value);
    }

    /**
     * 
     * @throws TException 
     */
    @Override
    public void validate() throws TException {
        instancia.validate();
    }

    @Override
    public CadastroDomiciliarThrift getInstance(){
        return this.instancia;
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
        if(instancia.isSetStatusTermoRecusaCadastroDomiciliarAtencaoBasica()==true)
            return false;
        else 
            return true &&
                    instancia.isSetAnimaisNoDomicilio();
    }
    
   /**
    * Condições de moradia do domicílio.
    * @return CondicaoMoradia
    * É Condicional
    * Não devem ser preenchidos se o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = true
    */ 
    @Override
   public boolean validaCondicaoMoradia(){
        if(instancia.isSetStatusTermoRecusaCadastroDomiciliarAtencaoBasica()==true)
            return false;
        else 
            return true &&
                    instancia.isSetCondicaoMoradia();
    }
   
   /**
    * Informações sobre o profissional e a data do cadastro. 
    * @return HeaderCdsCadastro
    * É Obrigatório
    */
    @Override
   public boolean validaDadosGerais(){
       return instancia.isSetDadosGerais();
   }
   
   /**
    * Informações sobre o endereço do domicílio.
    * @return EnderecoLocalPermanencia
    * É Condicional
    * Preenchimento obrigatório caso o campo statusTermoRecusaCadastroDomiciliarAtencaoBasica = false.
    */
    @Override
   public boolean validaEnderecoLocalPermanencia(){
       if(instancia.isSetStatusTermoRecusaCadastroDomiciliarAtencaoBasica()==false)
            return true &&
                    instancia.isSetEnderecoLocalPermanencia();
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
      if(instancia.isSetStatusTermoRecusaCadastroDomiciliarAtencaoBasica()==true)
            return false;
        else 
            return true &&
                    instancia.isSetFamilias(); 
   }
   
   /**
    * Marcador que indica se a ficha é uma atualização. 
    * @return FichaAtualizada
    * É Obrigatório
    * Caso seja uma ficha de atualização, o campo uuidFichaOriginadora deve ser preenchido com o UUID da ficha que deu origem ao registro.
    */
    @Override
   public boolean validaFichaAtualizada(){
       return instancia.isSetFichaAtualizada() == true ;
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
       String quantosAnimaisNoDomicilio = instancia.getQuantosAnimaisNoDomicilio();
       
       if(instancia.isSetStAnimaisNoDomicilio()==false &&
               instancia.isSetStatusTermoRecusaCadastroDomiciliarAtencaoBasica()==true)
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
       if(instancia.isSetStatusTermoRecusaCadastroDomiciliarAtencaoBasica()==true)
            return false;
        else 
            return true &&
                    instancia.isSetStAnimaisNoDomicilio(); 
   }
   
   /**
    * Marcador que indica se o cadastro foi utilizado o termo de recusa de cadastro do domicílio.
    * @return StatusTermoRecusaCadastroDomiciliarAtencaoBasica
    * Não é Obrigatório
    */
    @Override
   public boolean validaStatusTermoRecusaCadastroDomiciliarAtencaoBasica(){
        return instancia.isSetStatusTermoRecusaCadastroDomiciliarAtencaoBasica() == true ;
   }
   
   /**
    * Tipo de origem dos dados do registro.
    * @return TpCdsOrigem
    * É obrigatório
    * Tamanho minimo e máximo igual a 1
    */
    @Override
   public boolean validaTpCdsOrigem(){
       return instancia.isSetTpCdsOrigem();
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
       String uuid = instancia.getUuid();
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
       String uuidFichaOriginadora = instancia.getUuidFichaOriginadora();
       return uuidFichaOriginadora != null &&
               uuidFichaOriginadora.length() >=3 &&
               uuidFichaOriginadora.length() <=44;    
   } 
   
   public void setDadoTransporte(DadoTransporte originadora){
        this.dadoTransporteThrift = originadora;
    }
    public DadoTransporte getDadoTransporte(){
        return this.dadoTransporteThrift;
    }

    public void zipGenerate(){
        if(!this.validates() && this.dadoTransporteThrift != null){
            return;
        }

        byte[] fichaSerializada = SerializadorThrift.serializar(this.instancia);
        dadoTransporteThrift.setTipoDadoSerializado(TIPO_DADO_SERIALIZADO_FICHA_PROCEDIMENTO);
        dadoTransporteThrift.setDadoSerializado(fichaSerializada);

        try {
            File zipFile = new File(System.getProperty("user.home") + "/fichaProcedimento.zip");
            ZipOutputStream outputStream = new ZipOutputStream(new FileOutputStream(zipFile));
            String entryName = dadoTransporteThrift.getUuidDadoSerializado() + EXTENSAO_EXPORT;
            outputStream.putNextEntry(new ZipEntry(entryName));
            byte[] dadoTransporteSerializado = SerializadorThrift.serializar(dadoTransporteThrift.getInstance());
            outputStream.write(dadoTransporteSerializado);

            outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

}