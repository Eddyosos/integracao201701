package com.github.Eddyosos.integracao20171.esus.cds.cadastroindividual;

import br.gov.saude.esus.cds.transport.generated.thrift.cadastroindividual.IdentificacaoUsuarioCidadaoThrift;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;

public class IdentificacaoUsuarioCidadao {
    private IdentificacaoUsuarioCidadaoThrift identificacaoUsuarioCidadaoThrift = new IdentificacaoUsuarioCidadaoThrift();
    
    protected IdentificacaoUsuarioCidadao(IdentificacaoUsuarioCidadaoThrift identificacaoUsuarioCidadao){
        this.identificacaoUsuarioCidadaoThrift = identificacaoUsuarioCidadao;
    }

    public IdentificacaoUsuarioCidadao deepCopy() {
        return new IdentificacaoUsuarioCidadao(identificacaoUsuarioCidadaoThrift.deepCopy());
    }

    public void clear() {
        identificacaoUsuarioCidadaoThrift.clear();
    }

    public String getNomeSocialCidadao() {
        return identificacaoUsuarioCidadaoThrift.getNomeSocialCidadao();
    }

    public void setNomeSocialCidadao(String nomeSocialCidadao) {
        identificacaoUsuarioCidadaoThrift.setNomeSocialCidadao(nomeSocialCidadao);
    }

    public void unsetNomeSocialCidadao() {
        identificacaoUsuarioCidadaoThrift.unsetNomeSocialCidadao();
    }

    public boolean isSetNomeSocialCidadao() {
        return identificacaoUsuarioCidadaoThrift.isSetNomeSocialCidadao();
    }

    public void setNomeSocialCidadaoIsSet(boolean value) {
        identificacaoUsuarioCidadaoThrift.setNomeSocialCidadaoIsSet(value);
    }

    public String getCodigoIbgeMunicipioNascimento() {
        return identificacaoUsuarioCidadaoThrift.getCodigoIbgeMunicipioNascimento();
    }

    public void setCodigoIbgeMunicipioNascimento(String codigoIbgeMunicipioNascimento) {
        identificacaoUsuarioCidadaoThrift.setCodigoIbgeMunicipioNascimento(codigoIbgeMunicipioNascimento);
    }

    public void unsetCodigoIbgeMunicipioNascimento() {
        identificacaoUsuarioCidadaoThrift.unsetCodigoIbgeMunicipioNascimento();
    }

    public boolean isSetCodigoIbgeMunicipioNascimento() {
        return identificacaoUsuarioCidadaoThrift.isSetCodigoIbgeMunicipioNascimento();
    }

    public void setCodigoIbgeMunicipioNascimentoIsSet(boolean value) {
        identificacaoUsuarioCidadaoThrift.setCodigoIbgeMunicipioNascimentoIsSet(value);
    }

    public long getDataNascimentoCidadao() {
        return identificacaoUsuarioCidadaoThrift.getDataNascimentoCidadao();
    }

    public void setDataNascimentoCidadao(long dataNascimentoCidadao) {
        identificacaoUsuarioCidadaoThrift.setDataNascimentoCidadao(dataNascimentoCidadao);
    }

    public void unsetDataNascimentoCidadao() {
        identificacaoUsuarioCidadaoThrift.unsetDataNascimentoCidadao();
    }

    public boolean isSetDataNascimentoCidadao() {
        return identificacaoUsuarioCidadaoThrift.isSetDataNascimentoCidadao();
    }

    public void setDataNascimentoCidadaoIsSet(boolean value) {
        identificacaoUsuarioCidadaoThrift.setDataNascimentoCidadaoIsSet(value);
    }

    public long getDataNascimentoResponsavel() {
        return identificacaoUsuarioCidadaoThrift.getDataNascimentoResponsavel();
    }

    public void setDataNascimentoResponsavel(long dataNascimentoResponsavel) {
        identificacaoUsuarioCidadaoThrift.setDataNascimentoResponsavel(dataNascimentoResponsavel);
    }

    public void unsetDataNascimentoResponsavel() {
        identificacaoUsuarioCidadaoThrift.unsetDataNascimentoResponsavel();
    }

    public boolean isSetDataNascimentoResponsavel() {
        return identificacaoUsuarioCidadaoThrift.isSetDataNascimentoResponsavel();
    }

    public void setDataNascimentoResponsavelIsSet(boolean value) {
        identificacaoUsuarioCidadaoThrift.setDataNascimentoResponsavelIsSet(value);
    }

    public boolean isDesconheceNomeMae() {
        return identificacaoUsuarioCidadaoThrift.isDesconheceNomeMae();
    }

    public void setDesconheceNomeMae(boolean desconheceNomeMae) {
        identificacaoUsuarioCidadaoThrift.setDesconheceNomeMae(desconheceNomeMae);
    }

    public void unsetDesconheceNomeMae() {
        identificacaoUsuarioCidadaoThrift.unsetDesconheceNomeMae();
    }

    public boolean isSetDesconheceNomeMae() {
        return identificacaoUsuarioCidadaoThrift.isSetDesconheceNomeMae();
    }

    public void setDesconheceNomeMaeIsSet(boolean value) {
        identificacaoUsuarioCidadaoThrift.setDesconheceNomeMaeIsSet(value);
    }

    public String getEmailCidadao() {
        return identificacaoUsuarioCidadaoThrift.getEmailCidadao();
    }

    public void setEmailCidadao(String emailCidadao) {
        identificacaoUsuarioCidadaoThrift.setEmailCidadao(emailCidadao);
    }

    public void unsetEmailCidadao() {
        identificacaoUsuarioCidadaoThrift.unsetEmailCidadao();
    }

    public boolean isSetEmailCidadao() {
        return identificacaoUsuarioCidadaoThrift.isSetEmailCidadao();
    }

    public void setEmailCidadaoIsSet(boolean value) {
        identificacaoUsuarioCidadaoThrift.setEmailCidadaoIsSet(value);
    }

    public long getNacionalidadeCidadao() {
        return identificacaoUsuarioCidadaoThrift.getNacionalidadeCidadao();
    }

    public void setNacionalidadeCidadao(long nacionalidadeCidadao) {
        identificacaoUsuarioCidadaoThrift.setNacionalidadeCidadao(nacionalidadeCidadao);
    }

    public void unsetNacionalidadeCidadao() {
        identificacaoUsuarioCidadaoThrift.unsetNacionalidadeCidadao();
    }

    public boolean isSetNacionalidadeCidadao() {
        return identificacaoUsuarioCidadaoThrift.isSetNacionalidadeCidadao();
    }

    public void setNacionalidadeCidadaoIsSet(boolean value) {
        identificacaoUsuarioCidadaoThrift.setNacionalidadeCidadaoIsSet(value);
    }

    public String getNomeCidadao() {
        return identificacaoUsuarioCidadaoThrift.getNomeCidadao();
    }

    public void setNomeCidadao(String nomeCidadao) {
        identificacaoUsuarioCidadaoThrift.setNomeCidadao(nomeCidadao);
    }

    public void unsetNomeCidadao() {
        identificacaoUsuarioCidadaoThrift.unsetNomeCidadao();
    }

    public boolean isSetNomeCidadao() {
        return identificacaoUsuarioCidadaoThrift.isSetNomeCidadao();
    }

    public void setNomeCidadaoIsSet(boolean value) {
        identificacaoUsuarioCidadaoThrift.setNomeCidadaoIsSet(value);
    }

    public String getNomeMaeCidadao() {
        return identificacaoUsuarioCidadaoThrift.getNomeMaeCidadao();
    }

    public void setNomeMaeCidadao(String nomeMaeCidadao) {
        identificacaoUsuarioCidadaoThrift.setNomeMaeCidadao(nomeMaeCidadao);
    }

    public void unsetNomeMaeCidadao() {
        identificacaoUsuarioCidadaoThrift.unsetNomeMaeCidadao();
    }

    public boolean isSetNomeMaeCidadao() {
        return identificacaoUsuarioCidadaoThrift.isSetNomeMaeCidadao();
    }

    public void setNomeMaeCidadaoIsSet(boolean value) {
        identificacaoUsuarioCidadaoThrift.setNomeMaeCidadaoIsSet(value);
    }

    public String getNumeroCartaoSus() {
        return identificacaoUsuarioCidadaoThrift.getNumeroCartaoSus();
    }

    public void setNumeroCartaoSus(String numeroCartaoSus) {
        identificacaoUsuarioCidadaoThrift.setNumeroCartaoSus(numeroCartaoSus);
    }

    public void unsetNumeroCartaoSus() {
        identificacaoUsuarioCidadaoThrift.unsetNumeroCartaoSus();
    }

    public boolean isSetNumeroCartaoSus() {
        return identificacaoUsuarioCidadaoThrift.isSetNumeroCartaoSus();
    }

    public void setNumeroCartaoSusIsSet(boolean value) {
        identificacaoUsuarioCidadaoThrift.setNumeroCartaoSusIsSet(value);
    }

    public String getNumeroCartaoSusResponsavel() {
        return identificacaoUsuarioCidadaoThrift.getNumeroCartaoSusResponsavel();
    }

    public void setNumeroCartaoSusResponsavel(String numeroCartaoSusResponsavel) {
        identificacaoUsuarioCidadaoThrift.setNumeroCartaoSusResponsavel(numeroCartaoSusResponsavel);
    }

    public void unsetNumeroCartaoSusResponsavel() {
        identificacaoUsuarioCidadaoThrift.unsetNumeroCartaoSusResponsavel();
    }

    public boolean isSetNumeroCartaoSusResponsavel() {
        return identificacaoUsuarioCidadaoThrift.isSetNumeroCartaoSusResponsavel();
    }

    public void setNumeroCartaoSusResponsavelIsSet(boolean value) {
        identificacaoUsuarioCidadaoThrift.setNumeroCartaoSusResponsavelIsSet(value);
    }

    public String getNumeroCelularCidadao() {
        return identificacaoUsuarioCidadaoThrift.getNumeroCelularCidadao();
    }

    public void setNumeroCelularCidadao(String numeroCelularCidadao) {
        identificacaoUsuarioCidadaoThrift.setNumeroCelularCidadao(numeroCelularCidadao);
    }

    public void unsetNumeroCelularCidadao() {
        identificacaoUsuarioCidadaoThrift.unsetNumeroCelularCidadao();
    }

    public boolean isSetNumeroCelularCidadao() {
        return identificacaoUsuarioCidadaoThrift.isSetNumeroCelularCidadao();
    }

    public void setNumeroCelularCidadaoIsSet(boolean value) {
        identificacaoUsuarioCidadaoThrift.setNumeroCelularCidadaoIsSet(value);
    }

    public String getNumeroNisPisPasep() {
        return identificacaoUsuarioCidadaoThrift.getNumeroNisPisPasep();
    }

    public void setNumeroNisPisPasep(String numeroNisPisPasep) {
        identificacaoUsuarioCidadaoThrift.setNumeroNisPisPasep(numeroNisPisPasep);
    }

    public void unsetNumeroNisPisPasep() {
        identificacaoUsuarioCidadaoThrift.unsetNumeroNisPisPasep();
    }

    public boolean isSetNumeroNisPisPasep() {
        return identificacaoUsuarioCidadaoThrift.isSetNumeroNisPisPasep();
    }

    public void setNumeroNisPisPasepIsSet(boolean value) {
        identificacaoUsuarioCidadaoThrift.setNumeroNisPisPasepIsSet(value);
    }

    public long getPaisNascimento() {
        return identificacaoUsuarioCidadaoThrift.getPaisNascimento();
    }

    public void setPaisNascimento(long paisNascimento) {
        identificacaoUsuarioCidadaoThrift.setPaisNascimento(paisNascimento);
    }

    public void unsetPaisNascimento() {
        identificacaoUsuarioCidadaoThrift.unsetPaisNascimento();
    }

    public boolean isSetPaisNascimento() {
        return identificacaoUsuarioCidadaoThrift.isSetPaisNascimento();
    }

    public void setPaisNascimentoIsSet(boolean value) {
        identificacaoUsuarioCidadaoThrift.setPaisNascimentoIsSet(value);
    }

    public long getRacaCorCidadao() {
        return identificacaoUsuarioCidadaoThrift.getRacaCorCidadao();
    }

    public void setRacaCorCidadao(long racaCorCidadao) {
        identificacaoUsuarioCidadaoThrift.setRacaCorCidadao(racaCorCidadao);
    }

    public void unsetRacaCorCidadao() {
        identificacaoUsuarioCidadaoThrift.unsetRacaCorCidadao();
    }

    public boolean isSetRacaCorCidadao() {
        return identificacaoUsuarioCidadaoThrift.isSetRacaCorCidadao();
    }

    public void setRacaCorCidadaoIsSet(boolean value) {
        identificacaoUsuarioCidadaoThrift.setRacaCorCidadaoIsSet(value);
    }

    public long getSexoCidadao() {
        return identificacaoUsuarioCidadaoThrift.getSexoCidadao();
    }

    public void setSexoCidadao(long sexoCidadao) {
        identificacaoUsuarioCidadaoThrift.setSexoCidadao(sexoCidadao);
    }

    public void unsetSexoCidadao() {
        identificacaoUsuarioCidadaoThrift.unsetSexoCidadao();
    }

    public boolean isSetSexoCidadao() {
        return identificacaoUsuarioCidadaoThrift.isSetSexoCidadao();
    }

    public void setSexoCidadaoIsSet(boolean value) {
        identificacaoUsuarioCidadaoThrift.setSexoCidadaoIsSet(value);
    }

    public boolean isStatusEhResponsavel() {
        return identificacaoUsuarioCidadaoThrift.isStatusEhResponsavel();
    }

    public void setStatusEhResponsavel(boolean statusEhResponsavel) {
        identificacaoUsuarioCidadaoThrift.setStatusEhResponsavel(statusEhResponsavel);
    }

    public void unsetStatusEhResponsavel() {
        identificacaoUsuarioCidadaoThrift.unsetStatusEhResponsavel();
    }

    public boolean isSetStatusEhResponsavel() {
        return identificacaoUsuarioCidadaoThrift.isSetStatusEhResponsavel();
    }

    public void setStatusEhResponsavelIsSet(boolean value) {
        identificacaoUsuarioCidadaoThrift.setStatusEhResponsavelIsSet(value);
    }

    @Override
    public boolean equals(Object that) {
        return identificacaoUsuarioCidadaoThrift.equals(that);
    }

    public boolean equals(IdentificacaoUsuarioCidadao that) {
        return identificacaoUsuarioCidadaoThrift.equals(that.getInstance());
    }

    @Override
    public int hashCode() {
        return identificacaoUsuarioCidadaoThrift.hashCode();
    }

    public int compareTo(IdentificacaoUsuarioCidadao other) {
        return identificacaoUsuarioCidadaoThrift.compareTo(other.getInstance());
    }

    @Override
    public String toString() {
        return identificacaoUsuarioCidadaoThrift.toString();
    }

    public void validate() throws TException {
        identificacaoUsuarioCidadaoThrift.validate();
    }
    
    protected IdentificacaoUsuarioCidadaoThrift getInstance(){
        return this.identificacaoUsuarioCidadaoThrift;
    }  
    
}

