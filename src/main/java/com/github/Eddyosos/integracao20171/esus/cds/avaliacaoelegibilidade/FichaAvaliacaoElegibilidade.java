package com.github.Eddyosos.integracao20171.esus.cds.avaliacaoelegibilidade;

import br.gov.saude.esus.cds.transport.generated.thrift.avaliacaoelegibilidade.FichaAvaliacaoElegibilidadeThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.common.EnderecoLocalPermanenciaThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.common.UnicaLotacaoHeaderThrift;
import com.github.Eddyosos.integracao20171.esus.cds.common.EnderecoLocalPermanencia;
import com.github.Eddyosos.integracao20171.esus.cds.common.UnicaLotacaoHeader;
import java.util.Iterator;
import java.util.List;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;

public class FichaAvaliacaoElegibilidade{
    private FichaAvaliacaoElegibilidadeThrift fichaAvaliacaoElegibilidadeThrift = new FichaAvaliacaoElegibilidadeThrift();
    
    protected FichaAvaliacaoElegibilidade(FichaAvaliacaoElegibilidadeThrift fichaAvaliacaoElegibilidade){
        this.fichaAvaliacaoElegibilidadeThrift = fichaAvaliacaoElegibilidade;
    }

    public FichaAvaliacaoElegibilidade deepCopy() {
        return new FichaAvaliacaoElegibilidade(fichaAvaliacaoElegibilidadeThrift.deepCopy());
    }

    public void clear() {
        fichaAvaliacaoElegibilidadeThrift.clear();
    }

    public String getUuidFicha() {
        return fichaAvaliacaoElegibilidadeThrift.getUuidFicha();
    }

    public void setUuidFicha(String uuidFicha) {
        fichaAvaliacaoElegibilidadeThrift.setUuidFicha(uuidFicha);
    }

    public void unsetUuidFicha() {
        fichaAvaliacaoElegibilidadeThrift.unsetUuidFicha();
    }

    public boolean isSetUuidFicha() {
        return fichaAvaliacaoElegibilidadeThrift.isSetUuidFicha();
    }

    public void setUuidFichaIsSet(boolean value) {
        fichaAvaliacaoElegibilidadeThrift.setUuidFichaIsSet(value);
    }

    public int getTpCdsOrigem() {
        return fichaAvaliacaoElegibilidadeThrift.getTpCdsOrigem();
    }

    public void setTpCdsOrigem(int tpCdsOrigem) {
        fichaAvaliacaoElegibilidadeThrift.setTpCdsOrigem(tpCdsOrigem);
    }

    public void unsetTpCdsOrigem() {
        fichaAvaliacaoElegibilidadeThrift.unsetTpCdsOrigem();
    }

    public boolean isSetTpCdsOrigem() {
        return fichaAvaliacaoElegibilidadeThrift.isSetTpCdsOrigem();
    }

    public void setTpCdsOrigemIsSet(boolean value) {
        fichaAvaliacaoElegibilidadeThrift.setTpCdsOrigemIsSet(value);
    }

    public UnicaLotacaoHeader getHeaderTransport() {
        return new UnicaLotacaoHeader(fichaAvaliacaoElegibilidadeThrift.getHeaderTransport());
    }

    public void setHeaderTransport(UnicaLotacaoHeader headerTransport) {
        fichaAvaliacaoElegibilidadeThrift.setHeaderTransport(headerTransport.getInstance());
    }

    public void unsetHeaderTransport() {
        fichaAvaliacaoElegibilidadeThrift.unsetHeaderTransport();
    }

    public boolean isSetHeaderTransport() {
        return fichaAvaliacaoElegibilidadeThrift.isSetHeaderTransport();
    }

    public void setHeaderTransportIsSet(boolean value) {
        fichaAvaliacaoElegibilidadeThrift.setHeaderTransportIsSet(value);
    }

    public String getNumeroCartaoSus() {
        return fichaAvaliacaoElegibilidadeThrift.getNumeroCartaoSus();
    }

    public void setNumeroCartaoSus(String numeroCartaoSus) {
        fichaAvaliacaoElegibilidadeThrift.setNumeroCartaoSus(numeroCartaoSus);
    }

    public void unsetNumeroCartaoSus() {
        fichaAvaliacaoElegibilidadeThrift.unsetNumeroCartaoSus();
    }

    public boolean isSetNumeroCartaoSus() {
        return fichaAvaliacaoElegibilidadeThrift.isSetNumeroCartaoSus();
    }

    public void setNumeroCartaoSusIsSet(boolean value) {
        fichaAvaliacaoElegibilidadeThrift.setNumeroCartaoSusIsSet(value);
    }

    public String getNomeCidadao() {
        return fichaAvaliacaoElegibilidadeThrift.getNomeCidadao();
    }

    public void setNomeCidadao(String nomeCidadao) {
        fichaAvaliacaoElegibilidadeThrift.setNomeCidadao(nomeCidadao);
    }

    public void unsetNomeCidadao() {
        fichaAvaliacaoElegibilidadeThrift.unsetNomeCidadao();
    }

    public boolean isSetNomeCidadao() {
        return fichaAvaliacaoElegibilidadeThrift.isSetNomeCidadao();
    }

    public void setNomeCidadaoIsSet(boolean value) {
        fichaAvaliacaoElegibilidadeThrift.setNomeCidadaoIsSet(value);
    }

    public String getNomeSocialCidadao() {
        return fichaAvaliacaoElegibilidadeThrift.getNomeSocialCidadao();
    }

    public void setNomeSocialCidadao(String nomeSocialCidadao) {
        fichaAvaliacaoElegibilidadeThrift.setNomeSocialCidadao(nomeSocialCidadao);
    }

    public void unsetNomeSocialCidadao() {
        fichaAvaliacaoElegibilidadeThrift.unsetNomeSocialCidadao();
    }

    public boolean isSetNomeSocialCidadao() {
        return fichaAvaliacaoElegibilidadeThrift.isSetNomeSocialCidadao();
    }

    public void setNomeSocialCidadaoIsSet(boolean value) {
        fichaAvaliacaoElegibilidadeThrift.setNomeSocialCidadaoIsSet(value);
    }

    public long getDataNascimentoCidadao() {
        return fichaAvaliacaoElegibilidadeThrift.getDataNascimentoCidadao();
    }

    public void setDataNascimentoCidadao(long dataNascimentoCidadao) {
        fichaAvaliacaoElegibilidadeThrift.setDataNascimentoCidadao(dataNascimentoCidadao);
    }

    public void unsetDataNascimentoCidadao() {
        fichaAvaliacaoElegibilidadeThrift.unsetDataNascimentoCidadao();
    }

    public boolean isSetDataNascimentoCidadao() {
        return fichaAvaliacaoElegibilidadeThrift.isSetDataNascimentoCidadao();
    }

    public void setDataNascimentoCidadaoIsSet(boolean value) {
        fichaAvaliacaoElegibilidadeThrift.setDataNascimentoCidadaoIsSet(value);
    }

    public long getSexoCidadao() {
        return fichaAvaliacaoElegibilidadeThrift.getSexoCidadao();
    }

    public void setSexoCidadao(long sexoCidadao) {
        fichaAvaliacaoElegibilidadeThrift.setSexoCidadao(sexoCidadao);
    }

    public void unsetSexoCidadao() {
        fichaAvaliacaoElegibilidadeThrift.unsetSexoCidadao();
    }

    public boolean isSetSexoCidadao() {
        return fichaAvaliacaoElegibilidadeThrift.isSetSexoCidadao();
    }

    public void setSexoCidadaoIsSet(boolean value) {
        fichaAvaliacaoElegibilidadeThrift.setSexoCidadaoIsSet(value);
    }

    public long getRacaCorCidadao() {
        return fichaAvaliacaoElegibilidadeThrift.getRacaCorCidadao();
    }

    public void setRacaCorCidadao(long racaCorCidadao) {
        fichaAvaliacaoElegibilidadeThrift.setRacaCorCidadao(racaCorCidadao);
    }

    public void unsetRacaCorCidadao() {
        fichaAvaliacaoElegibilidadeThrift.unsetRacaCorCidadao();
    }

    public boolean isSetRacaCorCidadao() {
        return fichaAvaliacaoElegibilidadeThrift.isSetRacaCorCidadao();
    }

    public void setRacaCorCidadaoIsSet(boolean value) {
        fichaAvaliacaoElegibilidadeThrift.setRacaCorCidadaoIsSet(value);
    }

    public String getNomeMaeCidadao() {
        return fichaAvaliacaoElegibilidadeThrift.getNomeMaeCidadao();
    }

    public void setNomeMaeCidadao(String nomeMaeCidadao) {
        fichaAvaliacaoElegibilidadeThrift.setNomeMaeCidadao(nomeMaeCidadao);
    }

    public void unsetNomeMaeCidadao() {
        fichaAvaliacaoElegibilidadeThrift.unsetNomeMaeCidadao();
    }

    public boolean isSetNomeMaeCidadao() {
        return fichaAvaliacaoElegibilidadeThrift.isSetNomeMaeCidadao();
    }

    public void setNomeMaeCidadaoIsSet(boolean value) {
        fichaAvaliacaoElegibilidadeThrift.setNomeMaeCidadaoIsSet(value);
    }

    public boolean isDesconheceNomeMae() {
        return fichaAvaliacaoElegibilidadeThrift.isDesconheceNomeMae();
    }

    public void setDesconheceNomeMae(boolean desconheceNomeMae) {
        fichaAvaliacaoElegibilidadeThrift.setDesconheceNomeMae(desconheceNomeMae);
    }

    public void unsetDesconheceNomeMae() {
        fichaAvaliacaoElegibilidadeThrift.unsetDesconheceNomeMae();
    }

    public boolean isSetDesconheceNomeMae() {
        return fichaAvaliacaoElegibilidadeThrift.isSetDesconheceNomeMae();
    }

    public void setDesconheceNomeMaeIsSet(boolean value) {
        fichaAvaliacaoElegibilidadeThrift.setDesconheceNomeMaeIsSet(value);
    }

    public String getCodigoIbgeMunicipioNascimento() {
        return fichaAvaliacaoElegibilidadeThrift.getCodigoIbgeMunicipioNascimento();
    }

    public void setCodigoIbgeMunicipioNascimento(String codigoIbgeMunicipioNascimento) {
        fichaAvaliacaoElegibilidadeThrift.setCodigoIbgeMunicipioNascimento(codigoIbgeMunicipioNascimento);
    }

    public void unsetCodigoIbgeMunicipioNascimento() {
        fichaAvaliacaoElegibilidadeThrift.unsetCodigoIbgeMunicipioNascimento();
    }

    public boolean isSetCodigoIbgeMunicipioNascimento() {
        return fichaAvaliacaoElegibilidadeThrift.isSetCodigoIbgeMunicipioNascimento();
    }

    public void setCodigoIbgeMunicipioNascimentoIsSet(boolean value) {
        fichaAvaliacaoElegibilidadeThrift.setCodigoIbgeMunicipioNascimentoIsSet(value);
    }

    public long getCodigoNacionalidade() {
        return fichaAvaliacaoElegibilidadeThrift.getCodigoNacionalidade();
    }

    public void setCodigoNacionalidade(long codigoNacionalidade) {
        fichaAvaliacaoElegibilidadeThrift.setCodigoNacionalidade(codigoNacionalidade);
    }

    public void unsetCodigoNacionalidade() {
        fichaAvaliacaoElegibilidadeThrift.unsetCodigoNacionalidade();
    }

    public boolean isSetCodigoNacionalidade() {
        return fichaAvaliacaoElegibilidadeThrift.isSetCodigoNacionalidade();
    }

    public void setCodigoNacionalidadeIsSet(boolean value) {
        fichaAvaliacaoElegibilidadeThrift.setCodigoNacionalidadeIsSet(value);
    }

    public String getEmailCidadao() {
        return fichaAvaliacaoElegibilidadeThrift.getEmailCidadao();
    }

    public void setEmailCidadao(String emailCidadao) {
        fichaAvaliacaoElegibilidadeThrift.setEmailCidadao(emailCidadao);
    }

    public void unsetEmailCidadao() {
        fichaAvaliacaoElegibilidadeThrift.unsetEmailCidadao();
    }

    public boolean isSetEmailCidadao() {
        return fichaAvaliacaoElegibilidadeThrift.isSetEmailCidadao();
    }

    public void setEmailCidadaoIsSet(boolean value) {
        fichaAvaliacaoElegibilidadeThrift.setEmailCidadaoIsSet(value);
    }

    public String getNumeroNisPisPasep() {
        return fichaAvaliacaoElegibilidadeThrift.getNumeroNisPisPasep();
    }

    public void setNumeroNisPisPasep(String numeroNisPisPasep) {
        fichaAvaliacaoElegibilidadeThrift.setNumeroNisPisPasep(numeroNisPisPasep);
    }

    public void unsetNumeroNisPisPasep() {
        fichaAvaliacaoElegibilidadeThrift.unsetNumeroNisPisPasep();
    }

    public boolean isSetNumeroNisPisPasep() {
        return fichaAvaliacaoElegibilidadeThrift.isSetNumeroNisPisPasep();
    }

    public void setNumeroNisPisPasepIsSet(boolean value) {
        fichaAvaliacaoElegibilidadeThrift.setNumeroNisPisPasepIsSet(value);
    }

    public EnderecoLocalPermanencia getEndereco() {
        return new EnderecoLocalPermanencia(fichaAvaliacaoElegibilidadeThrift.getEndereco());
    }

    public void setEndereco(EnderecoLocalPermanencia endereco) {
        fichaAvaliacaoElegibilidadeThrift.setEndereco(endereco.getInstance());
    }

    public void unsetEndereco() {
        fichaAvaliacaoElegibilidadeThrift.unsetEndereco();
    }

    public boolean isSetEndereco() {
        return fichaAvaliacaoElegibilidadeThrift.isSetEndereco();
    }

    public void setEnderecoIsSet(boolean value) {
        fichaAvaliacaoElegibilidadeThrift.setEnderecoIsSet(value);
    }

    public long getAtencaoDomiciliarOrigem() {
        return fichaAvaliacaoElegibilidadeThrift.getAtencaoDomiciliarOrigem();
    }

    public void setAtencaoDomiciliarOrigem(long atencaoDomiciliarOrigem) {
        fichaAvaliacaoElegibilidadeThrift.setAtencaoDomiciliarOrigem(atencaoDomiciliarOrigem);
    }

    public void unsetAtencaoDomiciliarOrigem() {
        fichaAvaliacaoElegibilidadeThrift.unsetAtencaoDomiciliarOrigem();
    }

    public boolean isSetAtencaoDomiciliarOrigem() {
        return fichaAvaliacaoElegibilidadeThrift.isSetAtencaoDomiciliarOrigem();
    }

    public void setAtencaoDomiciliarOrigemIsSet(boolean value) {
        fichaAvaliacaoElegibilidadeThrift.setAtencaoDomiciliarOrigemIsSet(value);
    }

    public long getAtencaoDomiciliarModalidade() {
        return fichaAvaliacaoElegibilidadeThrift.getAtencaoDomiciliarModalidade();
    }

    public void setAtencaoDomiciliarModalidade(long atencaoDomiciliarModalidade) {
        fichaAvaliacaoElegibilidadeThrift.setAtencaoDomiciliarModalidade(atencaoDomiciliarModalidade);
    }

    public void unsetAtencaoDomiciliarModalidade() {
        fichaAvaliacaoElegibilidadeThrift.unsetAtencaoDomiciliarModalidade();
    }

    public boolean isSetAtencaoDomiciliarModalidade() {
        return fichaAvaliacaoElegibilidadeThrift.isSetAtencaoDomiciliarModalidade();
    }

    public void setAtencaoDomiciliarModalidadeIsSet(boolean value) {
        fichaAvaliacaoElegibilidadeThrift.setAtencaoDomiciliarModalidadeIsSet(value);
    }

    public int getSituacoesPresentesSize() {
        return fichaAvaliacaoElegibilidadeThrift.getSituacoesPresentesSize();
    }

    public Iterator<Long> getSituacoesPresentesIterator() {
        return fichaAvaliacaoElegibilidadeThrift.getSituacoesPresentesIterator();
    }

    public void addToSituacoesPresentes(long elem) {
        fichaAvaliacaoElegibilidadeThrift.addToSituacoesPresentes(elem);
    }

    public List<Long> getSituacoesPresentes() {
        return fichaAvaliacaoElegibilidadeThrift.getSituacoesPresentes();
    }

    public void setSituacoesPresentes(List<Long> situacoesPresentes) {
        fichaAvaliacaoElegibilidadeThrift.setSituacoesPresentes(situacoesPresentes);
    }

    public void unsetSituacoesPresentes() {
        fichaAvaliacaoElegibilidadeThrift.unsetSituacoesPresentes();
    }

    public boolean isSetSituacoesPresentes() {
        return fichaAvaliacaoElegibilidadeThrift.isSetSituacoesPresentes();
    }

    public void setSituacoesPresentesIsSet(boolean value) {
        fichaAvaliacaoElegibilidadeThrift.setSituacoesPresentesIsSet(value);
    }

    public String getCid10Principal() {
        return fichaAvaliacaoElegibilidadeThrift.getCid10Principal();
    }

    public void setCid10Principal(String cid10Principal) {
        fichaAvaliacaoElegibilidadeThrift.setCid10Principal(cid10Principal);
    }

    public void unsetCid10Principal() {
        fichaAvaliacaoElegibilidadeThrift.unsetCid10Principal();
    }

    public boolean isSetCid10Principal() {
        return fichaAvaliacaoElegibilidadeThrift.isSetCid10Principal();
    }

    public void setCid10PrincipalIsSet(boolean value) {
        fichaAvaliacaoElegibilidadeThrift.setCid10PrincipalIsSet(value);
    }

    public String getCid10Segundo() {
        return fichaAvaliacaoElegibilidadeThrift.getCid10Segundo();
    }

    public void setCid10Segundo(String cid10Segundo) {
        fichaAvaliacaoElegibilidadeThrift.setCid10Segundo(cid10Segundo);
    }

    public void unsetCid10Segundo() {
        fichaAvaliacaoElegibilidadeThrift.unsetCid10Segundo();
    }

    public boolean isSetCid10Segundo() {
        return fichaAvaliacaoElegibilidadeThrift.isSetCid10Segundo();
    }

    public void setCid10SegundoIsSet(boolean value) {
        fichaAvaliacaoElegibilidadeThrift.setCid10SegundoIsSet(value);
    }

    public String getCid10Terceiro() {
        return fichaAvaliacaoElegibilidadeThrift.getCid10Terceiro();
    }

    public void setCid10Terceiro(String cid10Terceiro) {
        fichaAvaliacaoElegibilidadeThrift.setCid10Terceiro(cid10Terceiro);
    }

    public void unsetCid10Terceiro() {
        fichaAvaliacaoElegibilidadeThrift.unsetCid10Terceiro();
    }

    public boolean isSetCid10Terceiro() {
        return fichaAvaliacaoElegibilidadeThrift.isSetCid10Terceiro();
    }

    public void setCid10TerceiroIsSet(boolean value) {
        fichaAvaliacaoElegibilidadeThrift.setCid10TerceiroIsSet(value);
    }

    public long getConclusaoDestinoElegivel() {
        return fichaAvaliacaoElegibilidadeThrift.getConclusaoDestinoElegivel();
    }

    public void setConclusaoDestinoElegivel(long conclusaoDestinoElegivel) {
        fichaAvaliacaoElegibilidadeThrift.setConclusaoDestinoElegivel(conclusaoDestinoElegivel);
    }

    public void unsetConclusaoDestinoElegivel() {
        fichaAvaliacaoElegibilidadeThrift.unsetConclusaoDestinoElegivel();
    }

    public boolean isSetConclusaoDestinoElegivel() {
        return fichaAvaliacaoElegibilidadeThrift.isSetConclusaoDestinoElegivel();
    }

    public void setConclusaoDestinoElegivelIsSet(boolean value) {
        fichaAvaliacaoElegibilidadeThrift.setConclusaoDestinoElegivelIsSet(value);
    }

    public int getConclusaoDestinoInelegivelSize() {
        return fichaAvaliacaoElegibilidadeThrift.getConclusaoDestinoInelegivelSize();
    }

    public Iterator<Long> getConclusaoDestinoInelegivelIterator() {
        return fichaAvaliacaoElegibilidadeThrift.getConclusaoDestinoInelegivelIterator();
    }

    public void addToConclusaoDestinoInelegivel(long elem) {
        fichaAvaliacaoElegibilidadeThrift.addToConclusaoDestinoInelegivel(elem);
    }

    public List<Long> getConclusaoDestinoInelegivel() {
        return fichaAvaliacaoElegibilidadeThrift.getConclusaoDestinoInelegivel();
    }

    public void setConclusaoDestinoInelegivel(List<Long> conclusaoDestinoInelegivel) {
        fichaAvaliacaoElegibilidadeThrift.setConclusaoDestinoInelegivel(conclusaoDestinoInelegivel);
    }

    public void unsetConclusaoDestinoInelegivel() {
        fichaAvaliacaoElegibilidadeThrift.unsetConclusaoDestinoInelegivel();
    }

    public boolean isSetConclusaoDestinoInelegivel() {
        return fichaAvaliacaoElegibilidadeThrift.isSetConclusaoDestinoInelegivel();
    }

    public void setConclusaoDestinoInelegivelIsSet(boolean value) {
        fichaAvaliacaoElegibilidadeThrift.setConclusaoDestinoInelegivelIsSet(value);
    }

    public long getCuidadorCidadao() {
        return fichaAvaliacaoElegibilidadeThrift.getCuidadorCidadao();
    }

    public void setCuidadorCidadao(long cuidadorCidadao) {
        fichaAvaliacaoElegibilidadeThrift.setCuidadorCidadao(cuidadorCidadao);
    }

    public void unsetCuidadorCidadao() {
        fichaAvaliacaoElegibilidadeThrift.unsetCuidadorCidadao();
    }

    public boolean isSetCuidadorCidadao() {
        return fichaAvaliacaoElegibilidadeThrift.isSetCuidadorCidadao();
    }

    public void setCuidadorCidadaoIsSet(boolean value) {
        fichaAvaliacaoElegibilidadeThrift.setCuidadorCidadaoIsSet(value);
    }

    @Override
    public boolean equals(Object that) {
        return fichaAvaliacaoElegibilidadeThrift.equals(that);
    }

    public boolean equals(FichaAvaliacaoElegibilidade that) {
        return fichaAvaliacaoElegibilidadeThrift.equals(that.getInstance());
    }

    @Override
    public int hashCode() {
        return fichaAvaliacaoElegibilidadeThrift.hashCode();
    }

    public int compareTo(FichaAvaliacaoElegibilidade other) {
        return fichaAvaliacaoElegibilidadeThrift.compareTo(other.getInstance());
    }

    @Override
    public String toString() {
        return fichaAvaliacaoElegibilidadeThrift.toString();
    }

    public void validate() throws TException {
        fichaAvaliacaoElegibilidadeThrift.validate();
    }


    protected FichaAvaliacaoElegibilidadeThrift getInstance(){
        return fichaAvaliacaoElegibilidadeThrift;
    }

    
}

