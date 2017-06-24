package com.github.Eddyosos.integracao20171.esus.cds.cadastrodomiciliar;

import br.gov.saude.esus.cds.transport.generated.thrift.cadastrodomiciliar.CondicaoMoradiaThrift;
import org.apache.thrift.TException;

public class CondicaoMoradia {
    private CondicaoMoradiaThrift condicaoMoradia = new CondicaoMoradiaThrift();
    
    protected CondicaoMoradia(CondicaoMoradiaThrift condicaoMoradiaThrift){
        this.condicaoMoradia = condicaoMoradiaThrift;
    }

    public CondicaoMoradia deepCopy() {
        return new CondicaoMoradia(condicaoMoradia.deepCopy());
    }

    public void clear() {
        condicaoMoradia.clear();
    }

    public long getAbastecimentoAgua() {
        return condicaoMoradia.getAbastecimentoAgua();
    }

    public void setAbastecimentoAgua(long abastecimentoAgua) {
        condicaoMoradia.setAbastecimentoAgua(abastecimentoAgua);
    }

    public void unsetAbastecimentoAgua() {
        condicaoMoradia.unsetAbastecimentoAgua();
    }

    public boolean isSetAbastecimentoAgua() {
        return condicaoMoradia.isSetAbastecimentoAgua();
    }

    public void setAbastecimentoAguaIsSet(boolean value) {
        condicaoMoradia.setAbastecimentoAguaIsSet(value);
    }

    public long getAreaProducaoRural() {
        return condicaoMoradia.getAreaProducaoRural();
    }

    public void setAreaProducaoRural(long areaProducaoRural) {
        condicaoMoradia.setAreaProducaoRural(areaProducaoRural);
    }

    public void unsetAreaProducaoRural() {
        condicaoMoradia.unsetAreaProducaoRural();
    }

    public boolean isSetAreaProducaoRural() {
        return condicaoMoradia.isSetAreaProducaoRural();
    }

    public void setAreaProducaoRuralIsSet(boolean value) {
        condicaoMoradia.setAreaProducaoRuralIsSet(value);
    }

    public long getDestinoLixo() {
        return condicaoMoradia.getDestinoLixo();
    }

    public void setDestinoLixo(long destinoLixo) {
        condicaoMoradia.setDestinoLixo(destinoLixo);
    }

    public void unsetDestinoLixo() {
        condicaoMoradia.unsetDestinoLixo();
    }

    public boolean isSetDestinoLixo() {
        return condicaoMoradia.isSetDestinoLixo();
    }

    public void setDestinoLixoIsSet(boolean value) {
        condicaoMoradia.setDestinoLixoIsSet(value);
    }

    public long getFormaEscoamentoBanheiro() {
        return condicaoMoradia.getFormaEscoamentoBanheiro();
    }

    public void setFormaEscoamentoBanheiro(long formaEscoamentoBanheiro) {
        condicaoMoradia.setFormaEscoamentoBanheiro(formaEscoamentoBanheiro);
    }

    public void unsetFormaEscoamentoBanheiro() {
        condicaoMoradia.unsetFormaEscoamentoBanheiro();
    }

    public boolean isSetFormaEscoamentoBanheiro() {
        return condicaoMoradia.isSetFormaEscoamentoBanheiro();
    }

    public void setFormaEscoamentoBanheiroIsSet(boolean value) {
        condicaoMoradia.setFormaEscoamentoBanheiroIsSet(value);
    }

    public long getLocalizacao() {
        return condicaoMoradia.getLocalizacao();
    }

    public void setLocalizacao(long localizacao) {
        condicaoMoradia.setLocalizacao(localizacao);
    }

    public void unsetLocalizacao() {
        condicaoMoradia.unsetLocalizacao();
    }

    public boolean isSetLocalizacao() {
        return condicaoMoradia.isSetLocalizacao();
    }

    public void setLocalizacaoIsSet(boolean value) {
        condicaoMoradia.setLocalizacaoIsSet(value);
    }

    public long getMaterialPredominanteParedesExtDomicilio() {
        return condicaoMoradia.getMaterialPredominanteParedesExtDomicilio();
    }

    public void setMaterialPredominanteParedesExtDomicilio(long materialPredominanteParedesExtDomicilio) {
        condicaoMoradia.setMaterialPredominanteParedesExtDomicilio(materialPredominanteParedesExtDomicilio);
    }

    public void unsetMaterialPredominanteParedesExtDomicilio() {
        condicaoMoradia.unsetMaterialPredominanteParedesExtDomicilio();
    }

    public boolean isSetMaterialPredominanteParedesExtDomicilio() {
        return condicaoMoradia.isSetMaterialPredominanteParedesExtDomicilio();
    }

    public void setMaterialPredominanteParedesExtDomicilioIsSet(boolean value) {
        condicaoMoradia.setMaterialPredominanteParedesExtDomicilioIsSet(value);
    }

    public String getNuComodos() {
        return condicaoMoradia.getNuComodos();
    }

    public void setNuComodos(String nuComodos) {
        condicaoMoradia.setNuComodos(nuComodos);
    }

    public void unsetNuComodos() {
        condicaoMoradia.unsetNuComodos();
    }

    public boolean isSetNuComodos() {
        return condicaoMoradia.isSetNuComodos();
    }

    public void setNuComodosIsSet(boolean value) {
        condicaoMoradia.setNuComodosIsSet(value);
    }

    public String getNuMoradores() {
        return condicaoMoradia.getNuMoradores();
    }

    public void setNuMoradores(String nuMoradores) {
        condicaoMoradia.setNuMoradores(nuMoradores);
    }

    public void unsetNuMoradores() {
        condicaoMoradia.unsetNuMoradores();
    }

    public boolean isSetNuMoradores() {
        return condicaoMoradia.isSetNuMoradores();
    }

    public void setNuMoradoresIsSet(boolean value) {
        condicaoMoradia.setNuMoradoresIsSet(value);
    }

    public long getSituacaoMoradiaPosseTerra() {
        return condicaoMoradia.getSituacaoMoradiaPosseTerra();
    }

    public void setSituacaoMoradiaPosseTerra(long situacaoMoradiaPosseTerra) {
        condicaoMoradia.setSituacaoMoradiaPosseTerra(situacaoMoradiaPosseTerra);
    }

    public void unsetSituacaoMoradiaPosseTerra() {
        condicaoMoradia.unsetSituacaoMoradiaPosseTerra();
    }

    public boolean isSetSituacaoMoradiaPosseTerra() {
        return condicaoMoradia.isSetSituacaoMoradiaPosseTerra();
    }

    public void setSituacaoMoradiaPosseTerraIsSet(boolean value) {
        condicaoMoradia.setSituacaoMoradiaPosseTerraIsSet(value);
    }

    public boolean isStDiponibilidadeEnergiaeletrica() {
        return condicaoMoradia.isStDiponibilidadeEnergiaeletrica();
    }

    public void setStDiponibilidadeEnergiaeletrica(boolean stDiponibilidadeEnergiaeletrica) {
        condicaoMoradia.setStDiponibilidadeEnergiaeletrica(stDiponibilidadeEnergiaeletrica);
    }

    public void unsetStDiponibilidadeEnergiaeletrica() {
        condicaoMoradia.unsetStDiponibilidadeEnergiaeletrica();
    }

    public boolean isSetStDiponibilidadeEnergiaeletrica() {
        return condicaoMoradia.isSetStDiponibilidadeEnergiaeletrica();
    }

    public void setStDiponibilidadeEnergiaeletricaIsSet(boolean value) {
        condicaoMoradia.setStDiponibilidadeEnergiaeletricaIsSet(value);
    }

    public long getTipoAcessoDomicilio() {
        return condicaoMoradia.getTipoAcessoDomicilio();
    }

    public void setTipoAcessoDomicilio(long tipoAcessoDomicilio) {
        condicaoMoradia.setTipoAcessoDomicilio(tipoAcessoDomicilio);
    }

    public void unsetTipoAcessoDomicilio() {
        condicaoMoradia.unsetTipoAcessoDomicilio();
    }

    public boolean isSetTipoAcessoDomicilio() {
        return condicaoMoradia.isSetTipoAcessoDomicilio();
    }

    public void setTipoAcessoDomicilioIsSet(boolean value) {
        condicaoMoradia.setTipoAcessoDomicilioIsSet(value);
    }

    public long getTipoDomicilio() {
        return condicaoMoradia.getTipoDomicilio();
    }

    public void setTipoDomicilio(long tipoDomicilio) {
        condicaoMoradia.setTipoDomicilio(tipoDomicilio);
    }

    public void unsetTipoDomicilio() {
        condicaoMoradia.unsetTipoDomicilio();
    }

    public boolean isSetTipoDomicilio() {
        return condicaoMoradia.isSetTipoDomicilio();
    }

    public void setTipoDomicilioIsSet(boolean value) {
        condicaoMoradia.setTipoDomicilioIsSet(value);
    }

    public long getTratamentoAguaDomicilio() {
        return condicaoMoradia.getTratamentoAguaDomicilio();
    }

    public void setTratamentoAguaDomicilio(long tratamentoAguaDomicilio) {
        condicaoMoradia.setTratamentoAguaDomicilio(tratamentoAguaDomicilio);
    }

    public void unsetTratamentoAguaDomicilio() {
        condicaoMoradia.unsetTratamentoAguaDomicilio();
    }

    public boolean isSetTratamentoAguaDomicilio() {
        return condicaoMoradia.isSetTratamentoAguaDomicilio();
    }

    public void setTratamentoAguaDomicilioIsSet(boolean value) {
        condicaoMoradia.setTratamentoAguaDomicilioIsSet(value);
    }

    @Override
    public boolean equals(Object that) {
        return condicaoMoradia.equals(that);
    }

    public boolean equals(CondicaoMoradia that) {
        return condicaoMoradia.equals(that.getInstence());
    }

    @Override
    public int hashCode() {
        return condicaoMoradia.hashCode();
    }

    public int compareTo(CondicaoMoradia other) {
        return condicaoMoradia.compareTo(other.getInstence());
    }

    @Override
    public String toString() {
        return condicaoMoradia.toString();
    }

    public void validate() throws TException {
        condicaoMoradia.validate();
    }
    
    protected CondicaoMoradiaThrift getInstence(){
        return condicaoMoradia;
    }
    
        /**
     * Metodo validade cria os metodos que fazem as validações
     * Chama todos os metodos que fazem validações
     * @return Todos os metodos de validação
     */
    public boolean validates(){
        
        return false;
    }
    
}

