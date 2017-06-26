package com.github.Eddyosos.integracao20171.esus.cds.cadastrodomiciliar;

import br.gov.saude.esus.cds.transport.generated.thrift.cadastrodomiciliar.CondicaoMoradiaThrift;
import com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.cadastrodomiciliar.ICondicaoMoradia;
import org.apache.thrift.TException;

public class CondicaoMoradia implements ICondicaoMoradia {
    /**
     * Instancia para encapsulamento do Thrift
     */
    private CondicaoMoradiaThrift condicaoMoradia; 
    
    public CondicaoMoradia(){
        condicaoMoradia = new CondicaoMoradiaThrift();
    }
    
    /**
     * Encapsulamento do Thrift
     * @param condicaoMoradiaThrift 
     */
    protected CondicaoMoradia(CondicaoMoradiaThrift condicaoMoradiaThrift){
        this.condicaoMoradia = condicaoMoradiaThrift;
    }

    @Override
    public void clear() {
        condicaoMoradia.clear();
    }

    /**
     * Código do tipo de abastecimento de água.
     * @return abastecimentoAgua
     */
    @Override
    public long getAbastecimentoAgua() {
        return condicaoMoradia.getAbastecimentoAgua();
    }

    /**
     * Código do tipo de abastecimento de água.
     * @param abastecimentoAgua 
     */
    @Override
    public void setAbastecimentoAgua(long abastecimentoAgua) {
        condicaoMoradia.setAbastecimentoAgua(abastecimentoAgua);
    }

    @Override
    public void unsetAbastecimentoAgua() {
        condicaoMoradia.unsetAbastecimentoAgua();
    }

    /**
     * Código do tipo de abastecimento de água.
     * @return abastecimentoAgua 
     */
    @Override
    public boolean isSetAbastecimentoAgua() {
        return condicaoMoradia.isSetAbastecimentoAgua();
    }

    /**
     * Código do tipo de abastecimento de água.
     * @param value 
     */
    @Override
    public void setAbastecimentoAguaIsSet(boolean value) {
        condicaoMoradia.setAbastecimentoAguaIsSet(value);
    }

    /**
     * Código da condição de posse e uso da terra.
     * @return areaProducaoRural
     */
    @Override
    public long getAreaProducaoRural() {
        return condicaoMoradia.getAreaProducaoRural();
    }

    /**
     * Código da condição de posse e uso da terra.
     * @param areaProducaoRural 
     */
    @Override
    public void setAreaProducaoRural(long areaProducaoRural) {
        condicaoMoradia.setAreaProducaoRural(areaProducaoRural);
    }

    @Override
    public void unsetAreaProducaoRural() {
        condicaoMoradia.unsetAreaProducaoRural();
    }

    /**
     * Código da condição de posse e uso da terra.
     * @return areaProducaoRural
     */
    @Override
    public boolean isSetAreaProducaoRural() {
        return condicaoMoradia.isSetAreaProducaoRural();
    }

    /**
     * Código da condição de posse e uso da terra.
     * @param value 
     */
    @Override
    public void setAreaProducaoRuralIsSet(boolean value) {
        condicaoMoradia.setAreaProducaoRuralIsSet(value);
    }

    /**
     * Código do destino do lixo
     * @return destinoLixo
     */
    @Override
    public long getDestinoLixo() {
        return condicaoMoradia.getDestinoLixo();
    }

    /**
     * Código do destino do lixo
     * @param destinoLixo 
     */
    @Override
    public void setDestinoLixo(long destinoLixo) {
        condicaoMoradia.setDestinoLixo(destinoLixo);
    }

    
    @Override
    public void unsetDestinoLixo() {
        condicaoMoradia.unsetDestinoLixo();
    }

    /**
     * Código do destino do lixo
     * @return destinoLixo 
     */
    @Override
    public boolean isSetDestinoLixo() {
        return condicaoMoradia.isSetDestinoLixo();
    }

    /**
     * Código do destino do lixo
     * @param value 
     */
    @Override
    public void setDestinoLixoIsSet(boolean value) {
        condicaoMoradia.setDestinoLixoIsSet(value);
    }

    /**
     * Código da forma de escoamento do banheiro ou sanitário
     * @return formaEscoamentoBanheiro
     */
    @Override
    public long getFormaEscoamentoBanheiro() {
        return condicaoMoradia.getFormaEscoamentoBanheiro();
    }

    /**
     * Código da forma de escoamento do banheiro ou sanitário
     * @param formaEscoamentoBanheiro 
     */
    @Override
    public void setFormaEscoamentoBanheiro(long formaEscoamentoBanheiro) {
        condicaoMoradia.setFormaEscoamentoBanheiro(formaEscoamentoBanheiro);
    }

    @Override
    public void unsetFormaEscoamentoBanheiro() {
        condicaoMoradia.unsetFormaEscoamentoBanheiro();
    }

    /**
     * Código da forma de escoamento do banheiro ou sanitário
     * @return formaEscoamentoBanheiro
     */
    @Override
    public boolean isSetFormaEscoamentoBanheiro() {
        return condicaoMoradia.isSetFormaEscoamentoBanheiro();
    }

    /**
     * Código da forma de escoamento do banheiro ou sanitário
     * @param value 
     */
    @Override
    public void setFormaEscoamentoBanheiroIsSet(boolean value) {
        condicaoMoradia.setFormaEscoamentoBanheiroIsSet(value);
    }

    /**
     * Código do localização do domicílio
     * @return localizacao
     */
    @Override
    public long getLocalizacao() {
        return condicaoMoradia.getLocalizacao();
    }

    /**
     * Código do localização do domicílio
     * @param localizacao 
     */
    @Override
    public void setLocalizacao(long localizacao) {
        condicaoMoradia.setLocalizacao(localizacao);
    }

    @Override
    public void unsetLocalizacao() {
        condicaoMoradia.unsetLocalizacao();
    }

    /**
     * Código do localização do domicílio
     * @return localizacao
     */
    @Override
    public boolean isSetLocalizacao() {
        return condicaoMoradia.isSetLocalizacao();
    }

    /**
     * Código do localização do domicílio
     * @param value 
     */
    @Override
    public void setLocalizacaoIsSet(boolean value) {
        condicaoMoradia.setLocalizacaoIsSet(value);
    }

    /**
     * Código do tipo de material predominante nas paredes externas do domicílio.
     * @return materialPredominanteParedesExtDomicilio
     */
    @Override
    public long getMaterialPredominanteParedesExtDomicilio() {
        return condicaoMoradia.getMaterialPredominanteParedesExtDomicilio();
    }

    /**
     * Código do tipo de material predominante nas paredes externas do domicílio.
     * @param materialPredominanteParedesExtDomicilio 
     */
    @Override
    public void setMaterialPredominanteParedesExtDomicilio(long materialPredominanteParedesExtDomicilio) {
        condicaoMoradia.setMaterialPredominanteParedesExtDomicilio(materialPredominanteParedesExtDomicilio);
    }

    @Override
    public void unsetMaterialPredominanteParedesExtDomicilio() {
        condicaoMoradia.unsetMaterialPredominanteParedesExtDomicilio();
    }

    /**
     * Código do tipo de material predominante nas paredes externas do domicílio.
     * @return materialPredominanteParedesExtDomicilio
     */
    @Override
    public boolean isSetMaterialPredominanteParedesExtDomicilio() {
        return condicaoMoradia.isSetMaterialPredominanteParedesExtDomicilio();
    }

    /**
     * Código do tipo de material predominante nas paredes externas do domicílio.
     * @param value 
     */
    @Override
    public void setMaterialPredominanteParedesExtDomicilioIsSet(boolean value) {
        condicaoMoradia.setMaterialPredominanteParedesExtDomicilioIsSet(value);
    }

    /**
     * Número de cômodos do domicílio
     * @return nuComodos
     */
    @Override
    public String getNuComodos() {
        return condicaoMoradia.getNuComodos();
    }

    /**
     * Número de cômodos do domicílio
     * @param nuComodos 
     */
    @Override
    public void setNuComodos(String nuComodos) {
        condicaoMoradia.setNuComodos(nuComodos);
    }

    @Override
    public void unsetNuComodos() {
        condicaoMoradia.unsetNuComodos();
    }

    /**
     * Número de cômodos do domicílio
     * @return nuComodos
     */
    @Override
    public boolean isSetNuComodos() {
        return condicaoMoradia.isSetNuComodos();
    }

    /**
     * Número de cômodos do domicílio
     * @param value 
     */
    @Override
    public void setNuComodosIsSet(boolean value) {
        condicaoMoradia.setNuComodosIsSet(value);
    }

    /**
     * Número de moradores do domicílio.
     * @return nuMoradores
     */
    @Override
    public String getNuMoradores() {
        return condicaoMoradia.getNuMoradores();
    }

    /**
     * Número de moradores do domicílio.
     * @param nuMoradores 
     */
    @Override
    public void setNuMoradores(String nuMoradores) {
        condicaoMoradia.setNuMoradores(nuMoradores);
    }

    @Override
    public void unsetNuMoradores() {
        condicaoMoradia.unsetNuMoradores();
    }

    /**
     * Número de moradores do domicílio.
     * @return nuMoradores
     */
    @Override
    public boolean isSetNuMoradores() {
        return condicaoMoradia.isSetNuMoradores();
    }

    /**
     * Número de moradores do domicílio.
     * @param value 
     */
    @Override
    public void setNuMoradoresIsSet(boolean value) {
        condicaoMoradia.setNuMoradoresIsSet(value);
    }

    /**
     * Código da situação de moradia ou de posse da terra
     * @return situacaoMoradiaPosseTerra
     */
    @Override
    public long getSituacaoMoradiaPosseTerra() {
        return condicaoMoradia.getSituacaoMoradiaPosseTerra();
    }

    /**
     * Código da situação de moradia ou de posse da terra
     * @param situacaoMoradiaPosseTerra 
     */
    @Override
    public void setSituacaoMoradiaPosseTerra(long situacaoMoradiaPosseTerra) {
        condicaoMoradia.setSituacaoMoradiaPosseTerra(situacaoMoradiaPosseTerra);
    }

    @Override
    public void unsetSituacaoMoradiaPosseTerra() {
        condicaoMoradia.unsetSituacaoMoradiaPosseTerra();
    }

    /**
     * Código da situação de moradia ou de posse da terra
     * @return situacaoMoradiaPosseTerra
     */
    @Override
    public boolean isSetSituacaoMoradiaPosseTerra() {
        return condicaoMoradia.isSetSituacaoMoradiaPosseTerra();
    }

    /**
     * Código da situação de moradia ou de posse da terra
     * @param value 
     */
    @Override
    public void setSituacaoMoradiaPosseTerraIsSet(boolean value) {
        condicaoMoradia.setSituacaoMoradiaPosseTerraIsSet(value);
    }

    /**
     * Marcador que indica se existe disponibilidade de energia elétrica.
     * @return stDiponibilidadeEnergiaeletrica
     */
    @Override
    public boolean isStDiponibilidadeEnergiaeletrica() {
        return condicaoMoradia.isStDiponibilidadeEnergiaeletrica();
    }

    /**
     * Marcador que indica se existe disponibilidade de energia elétrica
     * @param stDiponibilidadeEnergiaeletrica 
     */
    @Override
    public void setStDiponibilidadeEnergiaeletrica(boolean stDiponibilidadeEnergiaeletrica) {
        condicaoMoradia.setStDiponibilidadeEnergiaeletrica(stDiponibilidadeEnergiaeletrica);
    }

    @Override
    public void unsetStDiponibilidadeEnergiaeletrica() {
        condicaoMoradia.unsetStDiponibilidadeEnergiaeletrica();
    }

    /**
     * Marcador que indica se existe disponibilidade de energia elétrica
     * @return stDiponibilidadeEnergiaeletrica
     */
    @Override
    public boolean isSetStDiponibilidadeEnergiaeletrica() {
        return condicaoMoradia.isSetStDiponibilidadeEnergiaeletrica();
    }

    /**
     * Marcador que indica se existe disponibilidade de energia elétrica
     * @param value 
     */
    @Override
    public void setStDiponibilidadeEnergiaeletricaIsSet(boolean value) {
        condicaoMoradia.setStDiponibilidadeEnergiaeletricaIsSet(value);
    }

    /**
     * Código do tipo de acesso ao domicílio.
     * @return tipoAcessoDomicilio 
     */
    @Override
    public long getTipoAcessoDomicilio() {
        return condicaoMoradia.getTipoAcessoDomicilio();
    }

    /**
     * Código do tipo de acesso ao domicílio.
     * @param tipoAcessoDomicilio 
     */
    @Override
    public void setTipoAcessoDomicilio(long tipoAcessoDomicilio) {
        condicaoMoradia.setTipoAcessoDomicilio(tipoAcessoDomicilio);
    }

    @Override
    public void unsetTipoAcessoDomicilio() {
        condicaoMoradia.unsetTipoAcessoDomicilio();
    }

    /**
     * Código do tipo de acesso ao domicílio.
     * @return tipoAcessoDomicilio 
     */
    @Override
    public boolean isSetTipoAcessoDomicilio() {
        return condicaoMoradia.isSetTipoAcessoDomicilio();
    }

    /**
     * Código do tipo de acesso ao domicílio.
     * @param value 
     */
    @Override
    public void setTipoAcessoDomicilioIsSet(boolean value) {
        condicaoMoradia.setTipoAcessoDomicilioIsSet(value);
    }

    /**
     * Código do tipo de domicílio
     * @return tipoDomicilio
     */
    @Override
    public long getTipoDomicilio() {
        return condicaoMoradia.getTipoDomicilio();
    }

    /**
     * Código do tipo de domicílio
     * @param tipoDomicilio 
     */
    @Override
    public void setTipoDomicilio(long tipoDomicilio) {
        condicaoMoradia.setTipoDomicilio(tipoDomicilio);
    }

    @Override
    public void unsetTipoDomicilio() {
        condicaoMoradia.unsetTipoDomicilio();
    }

    /**
     * Código do tipo de domicílio
     * @return tipoDomicilio
     */
    @Override
    public boolean isSetTipoDomicilio() {
        return condicaoMoradia.isSetTipoDomicilio();
    }

    /**
     * Código do tipo de domicílio
     * @param value 
     */
    @Override
    public void setTipoDomicilioIsSet(boolean value) {
        condicaoMoradia.setTipoDomicilioIsSet(value);
    }

    /**
     * Código do tipo do tratamento de água do domicílio.
     * @return tratamentoAguaDomicilio 
     */
    @Override
    public long getTratamentoAguaDomicilio() {
        return condicaoMoradia.getTratamentoAguaDomicilio();
    }

    /**
     * Código do tipo do tratamento de água do domicílio.
     * @param tratamentoAguaDomicilio 
     */
    @Override
    public void setTratamentoAguaDomicilio(long tratamentoAguaDomicilio) {
        condicaoMoradia.setTratamentoAguaDomicilio(tratamentoAguaDomicilio);
    }

    @Override
    public void unsetTratamentoAguaDomicilio() {
        condicaoMoradia.unsetTratamentoAguaDomicilio();
    }

    /**
     * Código do tipo do tratamento de água do domicílio.
     * @return tratamentoAguaDomicilio 
     */
    @Override
    public boolean isSetTratamentoAguaDomicilio() {
        return condicaoMoradia.isSetTratamentoAguaDomicilio();
    }

    /**
     * Código do tipo do tratamento de água do domicílio.
     * @param value 
     */
    @Override
    public void setTratamentoAguaDomicilioIsSet(boolean value) {
        condicaoMoradia.setTratamentoAguaDomicilioIsSet(value);
    }

    @Override
    public void validate() throws TException {
        condicaoMoradia.validate();
    }
    
    @Override
    public CondicaoMoradiaThrift getInstence(){
        return condicaoMoradia;
    }
    
    /**
     * Metodo validade cria os metodos que fazem as validações
     * Chama todos os metodos que fazem validações
     * @return Todos os metodos de validação
     */
    @Override
    public boolean validates(){
        return validaAbastecimentoAgua() &&
                validaAreaProducaoRural() &&
                validaDestinoLixo() && 
                validaFormaEscoamentoBanheiro() &&
                validaLocalizacao() &&
                validaMaterialPredominanteParedesExtDomicilio() &&
                validaNuComodos() &&
                validaNuMoradores() &&
                validaSituacaoMoradiaPosseTerra() &&
                validaStDisponibilidadeEnergiaeletrica() &&
                validaTipoAcessoDomicilio() &&
                validatipoDomicilio() &&
                validatratamentoAguaDomicilio();
    }
    
    /**
     * Código do tipo de abastecimento de água.
     * @return abastecimentoAgua
     * Não é Obrigatório
     */
    @Override
    public boolean validaAbastecimentoAgua(){
        long abastecimentoAgua = condicaoMoradia.getAbastecimentoAgua();
        return abastecimentoAgua !=0;
    }
    
    /**
     * Código da condição de posse e uso da terra
     * @return areaProducaoRural
     */
    @Override
    public boolean validaAreaProducaoRural(){
        long areaProducaoRural = condicaoMoradia.getAreaProducaoRural();
        return areaProducaoRural !=0;
    }
    
    /**
     * Código do destino do lixo.
     * @return destinoLixo 
     */
    @Override
    public boolean validaDestinoLixo(){
       long destinoLixo = condicaoMoradia.getDestinoLixo();
       return destinoLixo !=0;
    }
    
    /**
     * Código da forma de escoamento do banheiro ou sanitário.
     * @return formaEscoamentoBanheiro
     */
    @Override
    public boolean validaFormaEscoamentoBanheiro(){
        long formaEscoamentoBanheiro = condicaoMoradia.getFormaEscoamentoBanheiro();
        return formaEscoamentoBanheiro !=0;
    }
    
    /**
     * Código do localização do domicílio.
     * @return localizacao
     */
    @Override
    public boolean validaLocalizacao(){
        long localizacao = condicaoMoradia.getLocalizacao();
        return localizacao !=0;
    }
    
    /**
     * Código do tipo de material predominante nas paredes externas do domicílio.
     * @return materialPredominanteParedesExtDomicilio
     */
    @Override
    public boolean validaMaterialPredominanteParedesExtDomicilio(){
        long materialPredominanteParedesExtDomicilio = condicaoMoradia.getMaterialPredominanteParedesExtDomicilio();
        return materialPredominanteParedesExtDomicilio !=0;
    }
    
    /**
     * Número de cômodos do domicílio
     * @return nuComodos
     */
    @Override
    public boolean validaNuComodos(){
        String nuComodos = condicaoMoradia.getNuComodos();
        return nuComodos.length() >=0 &&
                nuComodos.length() <=2;
    }  
    
    /**
     * Número de moradores do domicílio.
     * @return nuMoradores
     */
    @Override
    public boolean validaNuMoradores(){
        String nuMoradores = condicaoMoradia.getNuMoradores();
        return nuMoradores.length() <=0 &&
                nuMoradores.length() >=2;           
    }
    
    /**
     * Código da situação de moradia ou de posse da terra
     * @return situacaoMoradiaPosseTerra
     */
    @Override
    public boolean validaSituacaoMoradiaPosseTerra(){
        long situacaoMoradiaPosseTerra = condicaoMoradia.getSituacaoMoradiaPosseTerra();
        return situacaoMoradiaPosseTerra !=0;
    }
    
    /**
     * Marcador que indica se existe disponibilidade de energia elétrica.
     * @return stDiponibilidadeEnergiaeletrica
     */
    @Override
    public boolean validaStDisponibilidadeEnergiaeletrica(){
        return condicaoMoradia.isSetStDiponibilidadeEnergiaeletrica();
    }
    /**
     * Código do tipo de acesso ao domicílio.
     * @return tipoAcessoDomicilio
     */
    @Override
    public boolean validaTipoAcessoDomicilio(){
       long tipoAcessoDomicilio = condicaoMoradia.getTipoDomicilio();
       return tipoAcessoDomicilio !=0;
    }
    
    /**
     * Código do tipo de domicílio.
     * @return tipoDomicilio
     */
    @Override
    public boolean validatipoDomicilio(){
        long tipoDomicilio = condicaoMoradia.getTipoDomicilio();
        return tipoDomicilio !=0;
    }
    
    /**
     * Código do tipo do tratamento de água do domicílio.
     * @return tratamentoAguaDomicilio
     */
    @Override
    public boolean validatratamentoAguaDomicilio(){
        long tratamentoAguaDomicilio = condicaoMoradia.getTratamentoAguaDomicilio();
        return tratamentoAguaDomicilio !=0;
    }  
}