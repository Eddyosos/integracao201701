package com.github.Eddyosos.integracao20171.esus.cds.cadastrodomiciliar;

import br.gov.saude.esus.cds.transport.generated.thrift.cadastrodomiciliar.CondicaoMoradiaThrift;
import org.apache.thrift.TException;

public class CondicaoMoradia {
    private CondicaoMoradiaThrift condicaoMoradiaThrift = new CondicaoMoradiaThrift();
    
    protected CondicaoMoradia(CondicaoMoradiaThrift condicaoMoradiaThrift){
        this.condicaoMoradiaThrift = condicaoMoradiaThrift;
    }

    public long getAbastecimentoAgua() {
        return condicaoMoradiaThrift.getAbastecimentoAgua();
    }

    public void setAbastecimentoAgua(long abastecimentoAgua) {
        condicaoMoradiaThrift.setAbastecimentoAgua(abastecimentoAgua);
    }

    public void unsetAbastecimentoAgua() {
        condicaoMoradiaThrift.unsetAbastecimentoAgua();
    }

    public boolean isSetAbastecimentoAgua() {
        return condicaoMoradiaThrift.isSetAbastecimentoAgua();
    }

    public void setAbastecimentoAguaIsSet(boolean value) {
        condicaoMoradiaThrift.setAbastecimentoAguaIsSet(value);
    }

    public long getAreaProducaoRural() {
        return condicaoMoradiaThrift.getAreaProducaoRural();
    }

    public void setAreaProducaoRural(long areaProducaoRural) {
        condicaoMoradiaThrift.setAreaProducaoRural(areaProducaoRural);
    }

    public void unsetAreaProducaoRural() {
        condicaoMoradiaThrift.unsetAreaProducaoRural();
    }

    public boolean isSetAreaProducaoRural() {
        return condicaoMoradiaThrift.isSetAreaProducaoRural();
    }

    public void setAreaProducaoRuralIsSet(boolean value) {
        condicaoMoradiaThrift.setAreaProducaoRuralIsSet(value);
    }

    public long getDestinoLixo() {
        return condicaoMoradiaThrift.getDestinoLixo();
    }

    public void setDestinoLixo(long destinoLixo) {
        condicaoMoradiaThrift.setDestinoLixo(destinoLixo);
    }

    public void unsetDestinoLixo() {
        condicaoMoradiaThrift.unsetDestinoLixo();
    }

    public boolean isSetDestinoLixo() {
        return condicaoMoradiaThrift.isSetDestinoLixo();
    }

    public void setDestinoLixoIsSet(boolean value) {
        condicaoMoradiaThrift.setDestinoLixoIsSet(value);
    }

    public long getFormaEscoamentoBanheiro() {
        return condicaoMoradiaThrift.getFormaEscoamentoBanheiro();
    }

    public void setFormaEscoamentoBanheiro(long formaEscoamentoBanheiro) {
        condicaoMoradiaThrift.setFormaEscoamentoBanheiro(formaEscoamentoBanheiro);
    }

    public void unsetFormaEscoamentoBanheiro() {
        condicaoMoradiaThrift.unsetFormaEscoamentoBanheiro();
    }

    public boolean isSetFormaEscoamentoBanheiro() {
        return condicaoMoradiaThrift.isSetFormaEscoamentoBanheiro();
    }

    public void setFormaEscoamentoBanheiroIsSet(boolean value) {
        condicaoMoradiaThrift.setFormaEscoamentoBanheiroIsSet(value);
    }

    public long getLocalizacao() {
        return condicaoMoradiaThrift.getLocalizacao();
    }

    public void setLocalizacao(long localizacao) {
        condicaoMoradiaThrift.setLocalizacao(localizacao);
    }

    public void unsetLocalizacao() {
        condicaoMoradiaThrift.unsetLocalizacao();
    }

    public boolean isSetLocalizacao() {
        return condicaoMoradiaThrift.isSetLocalizacao();
    }

    public void setLocalizacaoIsSet(boolean value) {
        condicaoMoradiaThrift.setLocalizacaoIsSet(value);
    }

    public long getMaterialPredominanteParedesExtDomicilio() {
        return condicaoMoradiaThrift.getMaterialPredominanteParedesExtDomicilio();
    }

    public void setMaterialPredominanteParedesExtDomicilio(long materialPredominanteParedesExtDomicilio) {
        condicaoMoradiaThrift.setMaterialPredominanteParedesExtDomicilio(materialPredominanteParedesExtDomicilio);
    }

    public void unsetMaterialPredominanteParedesExtDomicilio() {
        condicaoMoradiaThrift.unsetMaterialPredominanteParedesExtDomicilio();
    }

    public boolean isSetMaterialPredominanteParedesExtDomicilio() {
        return condicaoMoradiaThrift.isSetMaterialPredominanteParedesExtDomicilio();
    }

    public void setMaterialPredominanteParedesExtDomicilioIsSet(boolean value) {
        condicaoMoradiaThrift.setMaterialPredominanteParedesExtDomicilioIsSet(value);
    }

    public String getNuComodos() {
        return condicaoMoradiaThrift.getNuComodos();
    }

    public void setNuComodos(String nuComodos) {
        condicaoMoradiaThrift.setNuComodos(nuComodos);
    }

    public void unsetNuComodos() {
        condicaoMoradiaThrift.unsetNuComodos();
    }

    public boolean isSetNuComodos() {
        return condicaoMoradiaThrift.isSetNuComodos();
    }

    public void setNuComodosIsSet(boolean value) {
        condicaoMoradiaThrift.setNuComodosIsSet(value);
    }

    public String getNuMoradores() {
        return condicaoMoradiaThrift.getNuMoradores();
    }

    public void setNuMoradores(String nuMoradores) {
        condicaoMoradiaThrift.setNuMoradores(nuMoradores);
    }

    public void unsetNuMoradores() {
        condicaoMoradiaThrift.unsetNuMoradores();
    }

    public boolean isSetNuMoradores() {
        return condicaoMoradiaThrift.isSetNuMoradores();
    }

    public void setNuMoradoresIsSet(boolean value) {
        condicaoMoradiaThrift.setNuMoradoresIsSet(value);
    }

    public long getSituacaoMoradiaPosseTerra() {
        return condicaoMoradiaThrift.getSituacaoMoradiaPosseTerra();
    }

    public void setSituacaoMoradiaPosseTerra(long situacaoMoradiaPosseTerra) {
        condicaoMoradiaThrift.setSituacaoMoradiaPosseTerra(situacaoMoradiaPosseTerra);
    }

    public void unsetSituacaoMoradiaPosseTerra() {
        condicaoMoradiaThrift.unsetSituacaoMoradiaPosseTerra();
    }

    public boolean isSetSituacaoMoradiaPosseTerra() {
        return condicaoMoradiaThrift.isSetSituacaoMoradiaPosseTerra();
    }

    public void setSituacaoMoradiaPosseTerraIsSet(boolean value) {
        condicaoMoradiaThrift.setSituacaoMoradiaPosseTerraIsSet(value);
    }

    public boolean isStDiponibilidadeEnergiaeletrica() {
        return condicaoMoradiaThrift.isStDiponibilidadeEnergiaeletrica();
    }

    public void setStDiponibilidadeEnergiaeletrica(boolean stDiponibilidadeEnergiaeletrica) {
        condicaoMoradiaThrift.setStDiponibilidadeEnergiaeletrica(stDiponibilidadeEnergiaeletrica);
    }

    public void unsetStDiponibilidadeEnergiaeletrica() {
        condicaoMoradiaThrift.unsetStDiponibilidadeEnergiaeletrica();
    }

    public boolean isSetStDiponibilidadeEnergiaeletrica() {
        return condicaoMoradiaThrift.isSetStDiponibilidadeEnergiaeletrica();
    }

    public void setStDiponibilidadeEnergiaeletricaIsSet(boolean value) {
        condicaoMoradiaThrift.setStDiponibilidadeEnergiaeletricaIsSet(value);
    }

    public long getTipoAcessoDomicilio() {
        return condicaoMoradiaThrift.getTipoAcessoDomicilio();
    }

    public void setTipoAcessoDomicilio(long tipoAcessoDomicilio) {
        condicaoMoradiaThrift.setTipoAcessoDomicilio(tipoAcessoDomicilio);
    }

    public void unsetTipoAcessoDomicilio() {
        condicaoMoradiaThrift.unsetTipoAcessoDomicilio();
    }

    public boolean isSetTipoAcessoDomicilio() {
        return condicaoMoradiaThrift.isSetTipoAcessoDomicilio();
    }

    public void setTipoAcessoDomicilioIsSet(boolean value) {
        condicaoMoradiaThrift.setTipoAcessoDomicilioIsSet(value);
    }

    public long getTipoDomicilio() {
        return condicaoMoradiaThrift.getTipoDomicilio();
    }

    public void setTipoDomicilio(long tipoDomicilio) {
        condicaoMoradiaThrift.setTipoDomicilio(tipoDomicilio);
    }

    public void unsetTipoDomicilio() {
        condicaoMoradiaThrift.unsetTipoDomicilio();
    }

    public boolean isSetTipoDomicilio() {
        return condicaoMoradiaThrift.isSetTipoDomicilio();
    }

    public void setTipoDomicilioIsSet(boolean value) {
        condicaoMoradiaThrift.setTipoDomicilioIsSet(value);
    }

    public long getTratamentoAguaDomicilio() {
        return condicaoMoradiaThrift.getTratamentoAguaDomicilio();
    }

    public void setTratamentoAguaDomicilio(long tratamentoAguaDomicilio) {
        condicaoMoradiaThrift.setTratamentoAguaDomicilio(tratamentoAguaDomicilio);
    }

    public void unsetTratamentoAguaDomicilio() {
        condicaoMoradiaThrift.unsetTratamentoAguaDomicilio();
    }

    public boolean isSetTratamentoAguaDomicilio() {
        return condicaoMoradiaThrift.isSetTratamentoAguaDomicilio();
    }

    public void setTratamentoAguaDomicilioIsSet(boolean value) {
        condicaoMoradiaThrift.setTratamentoAguaDomicilioIsSet(value);
    }

    public int compareTo(CondicaoMoradiaThrift other) {
        return condicaoMoradiaThrift.compareTo(other);
    }

    public void validate() throws TException {
        condicaoMoradiaThrift.validate();
    }
    
    protected CondicaoMoradiaThrift getInstence(){
        return condicaoMoradiaThrift;
    }
}

