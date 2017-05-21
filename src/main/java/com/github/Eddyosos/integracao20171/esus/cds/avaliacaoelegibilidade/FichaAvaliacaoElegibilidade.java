package com.github.Eddyosos.integracao20171.esus.cds.avaliacaoelegibilidade;

import br.gov.saude.esus.cds.transport.generated.thrift.avaliacaoelegibilidade.FichaAvaliacaoElegibilidadeThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.common.EnderecoLocalPermanenciaThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.common.UnicaLotacaoHeaderThrift;
import java.util.Iterator;
import java.util.List;
import org.apache.thrift.TException;

public class FichaAvaliacaoElegibilidade{
    private FichaAvaliacaoElegibilidadeThrift fichaAvaliacaoElegibilidade = new FichaAvaliacaoElegibilidadeThrift();

    public String getUuidFicha() {
        return fichaAvaliacaoElegibilidade.getUuidFicha();
    }

    public void setUuidFicha(String uuidFicha) {
        fichaAvaliacaoElegibilidade.setUuidFicha(uuidFicha);
    }

    public void unsetUuidFicha() {
        fichaAvaliacaoElegibilidade.unsetUuidFicha();
    }

    public boolean isSetUuidFicha() {
        return fichaAvaliacaoElegibilidade.isSetUuidFicha();
    }

    public void setUuidFichaIsSet(boolean value) {
        fichaAvaliacaoElegibilidade.setUuidFichaIsSet(value);
    }

    public int getTpCdsOrigem() {
        return fichaAvaliacaoElegibilidade.getTpCdsOrigem();
    }

    public void setTpCdsOrigem(int tpCdsOrigem) {
        fichaAvaliacaoElegibilidade.setTpCdsOrigem(tpCdsOrigem);
    }

    public void unsetTpCdsOrigem() {
        fichaAvaliacaoElegibilidade.unsetTpCdsOrigem();
    }

    public boolean isSetTpCdsOrigem() {
        return fichaAvaliacaoElegibilidade.isSetTpCdsOrigem();
    }

    public void setTpCdsOrigemIsSet(boolean value) {
        fichaAvaliacaoElegibilidade.setTpCdsOrigemIsSet(value);
    }

    public UnicaLotacaoHeaderThrift getHeaderTransport() {
        return fichaAvaliacaoElegibilidade.getHeaderTransport();
    }

    public void setHeaderTransport(UnicaLotacaoHeaderThrift headerTransport) {
        fichaAvaliacaoElegibilidade.setHeaderTransport(headerTransport);
    }

    public void unsetHeaderTransport() {
        fichaAvaliacaoElegibilidade.unsetHeaderTransport();
    }

    public boolean isSetHeaderTransport() {
        return fichaAvaliacaoElegibilidade.isSetHeaderTransport();
    }

    public void setHeaderTransportIsSet(boolean value) {
        fichaAvaliacaoElegibilidade.setHeaderTransportIsSet(value);
    }

    public String getNumeroCartaoSus() {
        return fichaAvaliacaoElegibilidade.getNumeroCartaoSus();
    }

    public void setNumeroCartaoSus(String numeroCartaoSus) {
        fichaAvaliacaoElegibilidade.setNumeroCartaoSus(numeroCartaoSus);
    }

    public void unsetNumeroCartaoSus() {
        fichaAvaliacaoElegibilidade.unsetNumeroCartaoSus();
    }

    public boolean isSetNumeroCartaoSus() {
        return fichaAvaliacaoElegibilidade.isSetNumeroCartaoSus();
    }

    public void setNumeroCartaoSusIsSet(boolean value) {
        fichaAvaliacaoElegibilidade.setNumeroCartaoSusIsSet(value);
    }

    public String getNomeCidadao() {
        return fichaAvaliacaoElegibilidade.getNomeCidadao();
    }

    public void setNomeCidadao(String nomeCidadao) {
        fichaAvaliacaoElegibilidade.setNomeCidadao(nomeCidadao);
    }

    public void unsetNomeCidadao() {
        fichaAvaliacaoElegibilidade.unsetNomeCidadao();
    }

    public boolean isSetNomeCidadao() {
        return fichaAvaliacaoElegibilidade.isSetNomeCidadao();
    }

    public void setNomeCidadaoIsSet(boolean value) {
        fichaAvaliacaoElegibilidade.setNomeCidadaoIsSet(value);
    }

    public String getNomeSocialCidadao() {
        return fichaAvaliacaoElegibilidade.getNomeSocialCidadao();
    }

    public void setNomeSocialCidadao(String nomeSocialCidadao) {
        fichaAvaliacaoElegibilidade.setNomeSocialCidadao(nomeSocialCidadao);
    }

    public void unsetNomeSocialCidadao() {
        fichaAvaliacaoElegibilidade.unsetNomeSocialCidadao();
    }

    public boolean isSetNomeSocialCidadao() {
        return fichaAvaliacaoElegibilidade.isSetNomeSocialCidadao();
    }

    public void setNomeSocialCidadaoIsSet(boolean value) {
        fichaAvaliacaoElegibilidade.setNomeSocialCidadaoIsSet(value);
    }

    public long getDataNascimentoCidadao() {
        return fichaAvaliacaoElegibilidade.getDataNascimentoCidadao();
    }

    public void setDataNascimentoCidadao(long dataNascimentoCidadao) {
        fichaAvaliacaoElegibilidade.setDataNascimentoCidadao(dataNascimentoCidadao);
    }

    public void unsetDataNascimentoCidadao() {
        fichaAvaliacaoElegibilidade.unsetDataNascimentoCidadao();
    }

    public boolean isSetDataNascimentoCidadao() {
        return fichaAvaliacaoElegibilidade.isSetDataNascimentoCidadao();
    }

    public void setDataNascimentoCidadaoIsSet(boolean value) {
        fichaAvaliacaoElegibilidade.setDataNascimentoCidadaoIsSet(value);
    }

    public long getSexoCidadao() {
        return fichaAvaliacaoElegibilidade.getSexoCidadao();
    }

    public void setSexoCidadao(long sexoCidadao) {
        fichaAvaliacaoElegibilidade.setSexoCidadao(sexoCidadao);
    }

    public void unsetSexoCidadao() {
        fichaAvaliacaoElegibilidade.unsetSexoCidadao();
    }

    public boolean isSetSexoCidadao() {
        return fichaAvaliacaoElegibilidade.isSetSexoCidadao();
    }

    public void setSexoCidadaoIsSet(boolean value) {
        fichaAvaliacaoElegibilidade.setSexoCidadaoIsSet(value);
    }

    public long getRacaCorCidadao() {
        return fichaAvaliacaoElegibilidade.getRacaCorCidadao();
    }

    public void setRacaCorCidadao(long racaCorCidadao) {
        fichaAvaliacaoElegibilidade.setRacaCorCidadao(racaCorCidadao);
    }

    public void unsetRacaCorCidadao() {
        fichaAvaliacaoElegibilidade.unsetRacaCorCidadao();
    }

    public boolean isSetRacaCorCidadao() {
        return fichaAvaliacaoElegibilidade.isSetRacaCorCidadao();
    }

    public void setRacaCorCidadaoIsSet(boolean value) {
        fichaAvaliacaoElegibilidade.setRacaCorCidadaoIsSet(value);
    }

    public String getNomeMaeCidadao() {
        return fichaAvaliacaoElegibilidade.getNomeMaeCidadao();
    }

    public void setNomeMaeCidadao(String nomeMaeCidadao) {
        fichaAvaliacaoElegibilidade.setNomeMaeCidadao(nomeMaeCidadao);
    }

    public void unsetNomeMaeCidadao() {
        fichaAvaliacaoElegibilidade.unsetNomeMaeCidadao();
    }

    public boolean isSetNomeMaeCidadao() {
        return fichaAvaliacaoElegibilidade.isSetNomeMaeCidadao();
    }

    public void setNomeMaeCidadaoIsSet(boolean value) {
        fichaAvaliacaoElegibilidade.setNomeMaeCidadaoIsSet(value);
    }

    public boolean isDesconheceNomeMae() {
        return fichaAvaliacaoElegibilidade.isDesconheceNomeMae();
    }

    public void setDesconheceNomeMae(boolean desconheceNomeMae) {
        fichaAvaliacaoElegibilidade.setDesconheceNomeMae(desconheceNomeMae);
    }

    public void unsetDesconheceNomeMae() {
        fichaAvaliacaoElegibilidade.unsetDesconheceNomeMae();
    }

    public boolean isSetDesconheceNomeMae() {
        return fichaAvaliacaoElegibilidade.isSetDesconheceNomeMae();
    }

    public void setDesconheceNomeMaeIsSet(boolean value) {
        fichaAvaliacaoElegibilidade.setDesconheceNomeMaeIsSet(value);
    }

    public String getCodigoIbgeMunicipioNascimento() {
        return fichaAvaliacaoElegibilidade.getCodigoIbgeMunicipioNascimento();
    }

    public void setCodigoIbgeMunicipioNascimento(String codigoIbgeMunicipioNascimento) {
        fichaAvaliacaoElegibilidade.setCodigoIbgeMunicipioNascimento(codigoIbgeMunicipioNascimento);
    }

    public void unsetCodigoIbgeMunicipioNascimento() {
        fichaAvaliacaoElegibilidade.unsetCodigoIbgeMunicipioNascimento();
    }

    public boolean isSetCodigoIbgeMunicipioNascimento() {
        return fichaAvaliacaoElegibilidade.isSetCodigoIbgeMunicipioNascimento();
    }

    public void setCodigoIbgeMunicipioNascimentoIsSet(boolean value) {
        fichaAvaliacaoElegibilidade.setCodigoIbgeMunicipioNascimentoIsSet(value);
    }

    public long getCodigoNacionalidade() {
        return fichaAvaliacaoElegibilidade.getCodigoNacionalidade();
    }

    public void setCodigoNacionalidade(long codigoNacionalidade) {
        fichaAvaliacaoElegibilidade.setCodigoNacionalidade(codigoNacionalidade);
    }

    public void unsetCodigoNacionalidade() {
        fichaAvaliacaoElegibilidade.unsetCodigoNacionalidade();
    }

    public boolean isSetCodigoNacionalidade() {
        return fichaAvaliacaoElegibilidade.isSetCodigoNacionalidade();
    }

    public void setCodigoNacionalidadeIsSet(boolean value) {
        fichaAvaliacaoElegibilidade.setCodigoNacionalidadeIsSet(value);
    }

    public String getEmailCidadao() {
        return fichaAvaliacaoElegibilidade.getEmailCidadao();
    }

    public void setEmailCidadao(String emailCidadao) {
        fichaAvaliacaoElegibilidade.setEmailCidadao(emailCidadao);
    }

    public void unsetEmailCidadao() {
        fichaAvaliacaoElegibilidade.unsetEmailCidadao();
    }

    public boolean isSetEmailCidadao() {
        return fichaAvaliacaoElegibilidade.isSetEmailCidadao();
    }

    public void setEmailCidadaoIsSet(boolean value) {
        fichaAvaliacaoElegibilidade.setEmailCidadaoIsSet(value);
    }

    public String getNumeroNisPisPasep() {
        return fichaAvaliacaoElegibilidade.getNumeroNisPisPasep();
    }

    public void setNumeroNisPisPasep(String numeroNisPisPasep) {
        fichaAvaliacaoElegibilidade.setNumeroNisPisPasep(numeroNisPisPasep);
    }

    public void unsetNumeroNisPisPasep() {
        fichaAvaliacaoElegibilidade.unsetNumeroNisPisPasep();
    }

    public boolean isSetNumeroNisPisPasep() {
        return fichaAvaliacaoElegibilidade.isSetNumeroNisPisPasep();
    }

    public void setNumeroNisPisPasepIsSet(boolean value) {
        fichaAvaliacaoElegibilidade.setNumeroNisPisPasepIsSet(value);
    }

    public EnderecoLocalPermanenciaThrift getEndereco() {
        return fichaAvaliacaoElegibilidade.getEndereco();
    }

    public void setEndereco(EnderecoLocalPermanenciaThrift endereco) {
        fichaAvaliacaoElegibilidade.setEndereco(endereco);
    }

    public void unsetEndereco() {
        fichaAvaliacaoElegibilidade.unsetEndereco();
    }

    public boolean isSetEndereco() {
        return fichaAvaliacaoElegibilidade.isSetEndereco();
    }

    public void setEnderecoIsSet(boolean value) {
        fichaAvaliacaoElegibilidade.setEnderecoIsSet(value);
    }

    public long getAtencaoDomiciliarOrigem() {
        return fichaAvaliacaoElegibilidade.getAtencaoDomiciliarOrigem();
    }

    public void setAtencaoDomiciliarOrigem(long atencaoDomiciliarOrigem) {
        fichaAvaliacaoElegibilidade.setAtencaoDomiciliarOrigem(atencaoDomiciliarOrigem);
    }

    public void unsetAtencaoDomiciliarOrigem() {
        fichaAvaliacaoElegibilidade.unsetAtencaoDomiciliarOrigem();
    }

    public boolean isSetAtencaoDomiciliarOrigem() {
        return fichaAvaliacaoElegibilidade.isSetAtencaoDomiciliarOrigem();
    }

    public void setAtencaoDomiciliarOrigemIsSet(boolean value) {
        fichaAvaliacaoElegibilidade.setAtencaoDomiciliarOrigemIsSet(value);
    }

    public long getAtencaoDomiciliarModalidade() {
        return fichaAvaliacaoElegibilidade.getAtencaoDomiciliarModalidade();
    }

    public void setAtencaoDomiciliarModalidade(long atencaoDomiciliarModalidade) {
        fichaAvaliacaoElegibilidade.setAtencaoDomiciliarModalidade(atencaoDomiciliarModalidade);
    }

    public void unsetAtencaoDomiciliarModalidade() {
        fichaAvaliacaoElegibilidade.unsetAtencaoDomiciliarModalidade();
    }

    public boolean isSetAtencaoDomiciliarModalidade() {
        return fichaAvaliacaoElegibilidade.isSetAtencaoDomiciliarModalidade();
    }

    public void setAtencaoDomiciliarModalidadeIsSet(boolean value) {
        fichaAvaliacaoElegibilidade.setAtencaoDomiciliarModalidadeIsSet(value);
    }

    public int getSituacoesPresentesSize() {
        return fichaAvaliacaoElegibilidade.getSituacoesPresentesSize();
    }

    public Iterator<Long> getSituacoesPresentesIterator() {
        return fichaAvaliacaoElegibilidade.getSituacoesPresentesIterator();
    }

    public void addToSituacoesPresentes(long elem) {
        fichaAvaliacaoElegibilidade.addToSituacoesPresentes(elem);
    }

    public List<Long> getSituacoesPresentes() {
        return fichaAvaliacaoElegibilidade.getSituacoesPresentes();
    }

    public void setSituacoesPresentes(List<Long> situacoesPresentes) {
        fichaAvaliacaoElegibilidade.setSituacoesPresentes(situacoesPresentes);
    }

    public void unsetSituacoesPresentes() {
        fichaAvaliacaoElegibilidade.unsetSituacoesPresentes();
    }

    public boolean isSetSituacoesPresentes() {
        return fichaAvaliacaoElegibilidade.isSetSituacoesPresentes();
    }

    public void setSituacoesPresentesIsSet(boolean value) {
        fichaAvaliacaoElegibilidade.setSituacoesPresentesIsSet(value);
    }

    public String getCid10Principal() {
        return fichaAvaliacaoElegibilidade.getCid10Principal();
    }

    public void setCid10Principal(String cid10Principal) {
        fichaAvaliacaoElegibilidade.setCid10Principal(cid10Principal);
    }

    public void unsetCid10Principal() {
        fichaAvaliacaoElegibilidade.unsetCid10Principal();
    }

    public boolean isSetCid10Principal() {
        return fichaAvaliacaoElegibilidade.isSetCid10Principal();
    }

    public void setCid10PrincipalIsSet(boolean value) {
        fichaAvaliacaoElegibilidade.setCid10PrincipalIsSet(value);
    }

    public String getCid10Segundo() {
        return fichaAvaliacaoElegibilidade.getCid10Segundo();
    }

    public void setCid10Segundo(String cid10Segundo) {
        fichaAvaliacaoElegibilidade.setCid10Segundo(cid10Segundo);
    }

    public void unsetCid10Segundo() {
        fichaAvaliacaoElegibilidade.unsetCid10Segundo();
    }

    public boolean isSetCid10Segundo() {
        return fichaAvaliacaoElegibilidade.isSetCid10Segundo();
    }

    public void setCid10SegundoIsSet(boolean value) {
        fichaAvaliacaoElegibilidade.setCid10SegundoIsSet(value);
    }

    public String getCid10Terceiro() {
        return fichaAvaliacaoElegibilidade.getCid10Terceiro();
    }

    public void setCid10Terceiro(String cid10Terceiro) {
        fichaAvaliacaoElegibilidade.setCid10Terceiro(cid10Terceiro);
    }

    public void unsetCid10Terceiro() {
        fichaAvaliacaoElegibilidade.unsetCid10Terceiro();
    }

    public boolean isSetCid10Terceiro() {
        return fichaAvaliacaoElegibilidade.isSetCid10Terceiro();
    }

    public void setCid10TerceiroIsSet(boolean value) {
        fichaAvaliacaoElegibilidade.setCid10TerceiroIsSet(value);
    }

    public long getConclusaoDestinoElegivel() {
        return fichaAvaliacaoElegibilidade.getConclusaoDestinoElegivel();
    }

    public void setConclusaoDestinoElegivel(long conclusaoDestinoElegivel) {
        fichaAvaliacaoElegibilidade.setConclusaoDestinoElegivel(conclusaoDestinoElegivel);
    }

    public void unsetConclusaoDestinoElegivel() {
        fichaAvaliacaoElegibilidade.unsetConclusaoDestinoElegivel();
    }

    public boolean isSetConclusaoDestinoElegivel() {
        return fichaAvaliacaoElegibilidade.isSetConclusaoDestinoElegivel();
    }

    public void setConclusaoDestinoElegivelIsSet(boolean value) {
        fichaAvaliacaoElegibilidade.setConclusaoDestinoElegivelIsSet(value);
    }

    public int getConclusaoDestinoInelegivelSize() {
        return fichaAvaliacaoElegibilidade.getConclusaoDestinoInelegivelSize();
    }

    public Iterator<Long> getConclusaoDestinoInelegivelIterator() {
        return fichaAvaliacaoElegibilidade.getConclusaoDestinoInelegivelIterator();
    }

    public void addToConclusaoDestinoInelegivel(long elem) {
        fichaAvaliacaoElegibilidade.addToConclusaoDestinoInelegivel(elem);
    }

    public List<Long> getConclusaoDestinoInelegivel() {
        return fichaAvaliacaoElegibilidade.getConclusaoDestinoInelegivel();
    }

    public void setConclusaoDestinoInelegivel(List<Long> conclusaoDestinoInelegivel) {
        fichaAvaliacaoElegibilidade.setConclusaoDestinoInelegivel(conclusaoDestinoInelegivel);
    }

    public void unsetConclusaoDestinoInelegivel() {
        fichaAvaliacaoElegibilidade.unsetConclusaoDestinoInelegivel();
    }

    public boolean isSetConclusaoDestinoInelegivel() {
        return fichaAvaliacaoElegibilidade.isSetConclusaoDestinoInelegivel();
    }

    public void setConclusaoDestinoInelegivelIsSet(boolean value) {
        fichaAvaliacaoElegibilidade.setConclusaoDestinoInelegivelIsSet(value);
    }

    public long getCuidadorCidadao() {
        return fichaAvaliacaoElegibilidade.getCuidadorCidadao();
    }

    public void setCuidadorCidadao(long cuidadorCidadao) {
        fichaAvaliacaoElegibilidade.setCuidadorCidadao(cuidadorCidadao);
    }

    public void unsetCuidadorCidadao() {
        fichaAvaliacaoElegibilidade.unsetCuidadorCidadao();
    }

    public boolean isSetCuidadorCidadao() {
        return fichaAvaliacaoElegibilidade.isSetCuidadorCidadao();
    }

    public void setCuidadorCidadaoIsSet(boolean value) {
        fichaAvaliacaoElegibilidade.setCuidadorCidadaoIsSet(value);
    }

    public boolean equals(FichaAvaliacaoElegibilidade that) {
        return fichaAvaliacaoElegibilidade.equals(that.getInstance());
    }

    public int compareTo(FichaAvaliacaoElegibilidade other) {
        return fichaAvaliacaoElegibilidade.compareTo(other.getInstance());
    }

    public void validate() throws TException {
        fichaAvaliacaoElegibilidade.validate();
    }
    
    protected FichaAvaliacaoElegibilidadeThrift getInstance(){
        return fichaAvaliacaoElegibilidade;
    }

    
}

