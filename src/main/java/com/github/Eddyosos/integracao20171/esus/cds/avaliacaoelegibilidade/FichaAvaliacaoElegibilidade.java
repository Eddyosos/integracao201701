package com.github.Eddyosos.integracao20171.esus.cds.avaliacaoelegibilidade;

import br.gov.saude.esus.cds.transport.generated.thrift.avaliacaoelegibilidade.FichaAvaliacaoElegibilidadeThrift;
import com.github.Eddyosos.integracao20171.esus.cds.common.EnderecoLocalPermanencia;
import com.github.Eddyosos.integracao20171.esus.cds.common.UnicaLotacaoHeader;
import java.util.Iterator;
import java.util.List;
import org.apache.thrift.TException;

public class FichaAvaliacaoElegibilidade{
    private FichaAvaliacaoElegibilidadeThrift instancia = new FichaAvaliacaoElegibilidadeThrift();
    
    protected FichaAvaliacaoElegibilidade(FichaAvaliacaoElegibilidadeThrift fichaAvaliacaoElegibilidade){
        this.instancia = fichaAvaliacaoElegibilidade;
    }

    public FichaAvaliacaoElegibilidade deepCopy() {
        return new FichaAvaliacaoElegibilidade(instancia.deepCopy());
    }

    public void clear() {
        instancia.clear();
    }

    public String getUuidFicha() {
        return instancia.getUuidFicha();
    }

    public void setUuidFicha(String uuidFicha) {
        instancia.setUuidFicha(uuidFicha);
    }

    public void unsetUuidFicha() {
        instancia.unsetUuidFicha();
    }

    public boolean isSetUuidFicha() {
        return instancia.isSetUuidFicha();
    }

    public void setUuidFichaIsSet(boolean value) {
        instancia.setUuidFichaIsSet(value);
    }

    public int getTpCdsOrigem() {
        return instancia.getTpCdsOrigem();
    }

    public void setTpCdsOrigem(int tpCdsOrigem) {
        instancia.setTpCdsOrigem(tpCdsOrigem);
    }

    public void unsetTpCdsOrigem() {
        instancia.unsetTpCdsOrigem();
    }

    public boolean isSetTpCdsOrigem() {
        return instancia.isSetTpCdsOrigem();
    }

    public void setTpCdsOrigemIsSet(boolean value) {
        instancia.setTpCdsOrigemIsSet(value);
    }

    public UnicaLotacaoHeader getHeaderTransport() {
        return new UnicaLotacaoHeader(instancia.getHeaderTransport());
    }

    public void setHeaderTransport(UnicaLotacaoHeader headerTransport) {
        instancia.setHeaderTransport(headerTransport.getInstance());
    }

    public void unsetHeaderTransport() {
        instancia.unsetHeaderTransport();
    }

    public boolean isSetHeaderTransport() {
        return instancia.isSetHeaderTransport();
    }

    public void setHeaderTransportIsSet(boolean value) {
        instancia.setHeaderTransportIsSet(value);
    }

    public String getNumeroCartaoSus() {
        return instancia.getNumeroCartaoSus();
    }

    public void setNumeroCartaoSus(String numeroCartaoSus) {
        instancia.setNumeroCartaoSus(numeroCartaoSus);
    }

    public void unsetNumeroCartaoSus() {
        instancia.unsetNumeroCartaoSus();
    }

    public boolean isSetNumeroCartaoSus() {
        return instancia.isSetNumeroCartaoSus();
    }

    public void setNumeroCartaoSusIsSet(boolean value) {
        instancia.setNumeroCartaoSusIsSet(value);
    }

    public String getNomeCidadao() {
        return instancia.getNomeCidadao();
    }

    public void setNomeCidadao(String nomeCidadao) {
        instancia.setNomeCidadao(nomeCidadao);
    }

    public void unsetNomeCidadao() {
        instancia.unsetNomeCidadao();
    }

    public boolean isSetNomeCidadao() {
        return instancia.isSetNomeCidadao();
    }

    public void setNomeCidadaoIsSet(boolean value) {
        instancia.setNomeCidadaoIsSet(value);
    }

    public String getNomeSocialCidadao() {
        return instancia.getNomeSocialCidadao();
    }

    public void setNomeSocialCidadao(String nomeSocialCidadao) {
        instancia.setNomeSocialCidadao(nomeSocialCidadao);
    }

    public void unsetNomeSocialCidadao() {
        instancia.unsetNomeSocialCidadao();
    }

    public boolean isSetNomeSocialCidadao() {
        return instancia.isSetNomeSocialCidadao();
    }

    public void setNomeSocialCidadaoIsSet(boolean value) {
        instancia.setNomeSocialCidadaoIsSet(value);
    }

    public long getDataNascimentoCidadao() {
        return instancia.getDataNascimentoCidadao();
    }

    public void setDataNascimentoCidadao(long dataNascimentoCidadao) {
        instancia.setDataNascimentoCidadao(dataNascimentoCidadao);
    }

    public void unsetDataNascimentoCidadao() {
        instancia.unsetDataNascimentoCidadao();
    }

    public boolean isSetDataNascimentoCidadao() {
        return instancia.isSetDataNascimentoCidadao();
    }

    public void setDataNascimentoCidadaoIsSet(boolean value) {
        instancia.setDataNascimentoCidadaoIsSet(value);
    }

    public long getSexoCidadao() {
        return instancia.getSexoCidadao();
    }

    public void setSexoCidadao(long sexoCidadao) {
        instancia.setSexoCidadao(sexoCidadao);
    }

    public void unsetSexoCidadao() {
        instancia.unsetSexoCidadao();
    }

    public boolean isSetSexoCidadao() {
        return instancia.isSetSexoCidadao();
    }

    public void setSexoCidadaoIsSet(boolean value) {
        instancia.setSexoCidadaoIsSet(value);
    }

    public long getRacaCorCidadao() {
        return instancia.getRacaCorCidadao();
    }

    public void setRacaCorCidadao(long racaCorCidadao) {
        instancia.setRacaCorCidadao(racaCorCidadao);
    }

    public void unsetRacaCorCidadao() {
        instancia.unsetRacaCorCidadao();
    }

    public boolean isSetRacaCorCidadao() {
        return instancia.isSetRacaCorCidadao();
    }

    public void setRacaCorCidadaoIsSet(boolean value) {
        instancia.setRacaCorCidadaoIsSet(value);
    }

    public String getNomeMaeCidadao() {
        return instancia.getNomeMaeCidadao();
    }

    public void setNomeMaeCidadao(String nomeMaeCidadao) {
        instancia.setNomeMaeCidadao(nomeMaeCidadao);
    }

    public void unsetNomeMaeCidadao() {
        instancia.unsetNomeMaeCidadao();
    }

    public boolean isSetNomeMaeCidadao() {
        return instancia.isSetNomeMaeCidadao();
    }

    public void setNomeMaeCidadaoIsSet(boolean value) {
        instancia.setNomeMaeCidadaoIsSet(value);
    }

    public boolean isDesconheceNomeMae() {
        return instancia.isDesconheceNomeMae();
    }

    public void setDesconheceNomeMae(boolean desconheceNomeMae) {
        instancia.setDesconheceNomeMae(desconheceNomeMae);
    }

    public void unsetDesconheceNomeMae() {
        instancia.unsetDesconheceNomeMae();
    }

    public boolean isSetDesconheceNomeMae() {
        return instancia.isSetDesconheceNomeMae();
    }

    public void setDesconheceNomeMaeIsSet(boolean value) {
        instancia.setDesconheceNomeMaeIsSet(value);
    }

    public String getCodigoIbgeMunicipioNascimento() {
        return instancia.getCodigoIbgeMunicipioNascimento();
    }

    public void setCodigoIbgeMunicipioNascimento(String codigoIbgeMunicipioNascimento) {
        instancia.setCodigoIbgeMunicipioNascimento(codigoIbgeMunicipioNascimento);
    }

    public void unsetCodigoIbgeMunicipioNascimento() {
        instancia.unsetCodigoIbgeMunicipioNascimento();
    }

    public boolean isSetCodigoIbgeMunicipioNascimento() {
        return instancia.isSetCodigoIbgeMunicipioNascimento();
    }

    public void setCodigoIbgeMunicipioNascimentoIsSet(boolean value) {
        instancia.setCodigoIbgeMunicipioNascimentoIsSet(value);
    }

    public long getCodigoNacionalidade() {
        return instancia.getCodigoNacionalidade();
    }

    public void setCodigoNacionalidade(long codigoNacionalidade) {
        instancia.setCodigoNacionalidade(codigoNacionalidade);
    }

    public void unsetCodigoNacionalidade() {
        instancia.unsetCodigoNacionalidade();
    }

    public boolean isSetCodigoNacionalidade() {
        return instancia.isSetCodigoNacionalidade();
    }

    public void setCodigoNacionalidadeIsSet(boolean value) {
        instancia.setCodigoNacionalidadeIsSet(value);
    }

    public String getEmailCidadao() {
        return instancia.getEmailCidadao();
    }

    public void setEmailCidadao(String emailCidadao) {
        instancia.setEmailCidadao(emailCidadao);
    }

    public void unsetEmailCidadao() {
        instancia.unsetEmailCidadao();
    }

    public boolean isSetEmailCidadao() {
        return instancia.isSetEmailCidadao();
    }

    public void setEmailCidadaoIsSet(boolean value) {
        instancia.setEmailCidadaoIsSet(value);
    }

    public String getNumeroNisPisPasep() {
        return instancia.getNumeroNisPisPasep();
    }

    public void setNumeroNisPisPasep(String numeroNisPisPasep) {
        instancia.setNumeroNisPisPasep(numeroNisPisPasep);
    }

    public void unsetNumeroNisPisPasep() {
        instancia.unsetNumeroNisPisPasep();
    }

    public boolean isSetNumeroNisPisPasep() {
        return instancia.isSetNumeroNisPisPasep();
    }

    public void setNumeroNisPisPasepIsSet(boolean value) {
        instancia.setNumeroNisPisPasepIsSet(value);
    }

    public EnderecoLocalPermanencia getEndereco() {
        return new EnderecoLocalPermanencia(instancia.getEndereco());
    }

    public void setEndereco(EnderecoLocalPermanencia endereco) {
        instancia.setEndereco(endereco.getInstance());
    }

    public void unsetEndereco() {
        instancia.unsetEndereco();
    }

    public boolean isSetEndereco() {
        return instancia.isSetEndereco();
    }

    public void setEnderecoIsSet(boolean value) {
        instancia.setEnderecoIsSet(value);
    }

    public long getAtencaoDomiciliarOrigem() {
        return instancia.getAtencaoDomiciliarOrigem();
    }

    public void setAtencaoDomiciliarOrigem(long atencaoDomiciliarOrigem) {
        instancia.setAtencaoDomiciliarOrigem(atencaoDomiciliarOrigem);
    }

    public void unsetAtencaoDomiciliarOrigem() {
        instancia.unsetAtencaoDomiciliarOrigem();
    }

    public boolean isSetAtencaoDomiciliarOrigem() {
        return instancia.isSetAtencaoDomiciliarOrigem();
    }

    public void setAtencaoDomiciliarOrigemIsSet(boolean value) {
        instancia.setAtencaoDomiciliarOrigemIsSet(value);
    }

    public long getAtencaoDomiciliarModalidade() {
        return instancia.getAtencaoDomiciliarModalidade();
    }

    public void setAtencaoDomiciliarModalidade(long atencaoDomiciliarModalidade) {
        instancia.setAtencaoDomiciliarModalidade(atencaoDomiciliarModalidade);
    }

    public void unsetAtencaoDomiciliarModalidade() {
        instancia.unsetAtencaoDomiciliarModalidade();
    }

    public boolean isSetAtencaoDomiciliarModalidade() {
        return instancia.isSetAtencaoDomiciliarModalidade();
    }

    public void setAtencaoDomiciliarModalidadeIsSet(boolean value) {
        instancia.setAtencaoDomiciliarModalidadeIsSet(value);
    }

    public int getSituacoesPresentesSize() {
        return instancia.getSituacoesPresentesSize();
    }

    public Iterator<Long> getSituacoesPresentesIterator() {
        return instancia.getSituacoesPresentesIterator();
    }

    public void addToSituacoesPresentes(long elem) {
        instancia.addToSituacoesPresentes(elem);
    }

    public List<Long> getSituacoesPresentes() {
        return instancia.getSituacoesPresentes();
    }

    public void setSituacoesPresentes(List<Long> situacoesPresentes) {
        instancia.setSituacoesPresentes(situacoesPresentes);
    }

    public void unsetSituacoesPresentes() {
        instancia.unsetSituacoesPresentes();
    }

    public boolean isSetSituacoesPresentes() {
        return instancia.isSetSituacoesPresentes();
    }

    public void setSituacoesPresentesIsSet(boolean value) {
        instancia.setSituacoesPresentesIsSet(value);
    }

    public String getCid10Principal() {
        return instancia.getCid10Principal();
    }

    public void setCid10Principal(String cid10Principal) {
        instancia.setCid10Principal(cid10Principal);
    }

    public void unsetCid10Principal() {
        instancia.unsetCid10Principal();
    }

    public boolean isSetCid10Principal() {
        return instancia.isSetCid10Principal();
    }

    public void setCid10PrincipalIsSet(boolean value) {
        instancia.setCid10PrincipalIsSet(value);
    }

    public String getCid10Segundo() {
        return instancia.getCid10Segundo();
    }

    public void setCid10Segundo(String cid10Segundo) {
        instancia.setCid10Segundo(cid10Segundo);
    }

    public void unsetCid10Segundo() {
        instancia.unsetCid10Segundo();
    }

    public boolean isSetCid10Segundo() {
        return instancia.isSetCid10Segundo();
    }

    public void setCid10SegundoIsSet(boolean value) {
        instancia.setCid10SegundoIsSet(value);
    }

    public String getCid10Terceiro() {
        return instancia.getCid10Terceiro();
    }

    public void setCid10Terceiro(String cid10Terceiro) {
        instancia.setCid10Terceiro(cid10Terceiro);
    }

    public void unsetCid10Terceiro() {
        instancia.unsetCid10Terceiro();
    }

    public boolean isSetCid10Terceiro() {
        return instancia.isSetCid10Terceiro();
    }

    public void setCid10TerceiroIsSet(boolean value) {
        instancia.setCid10TerceiroIsSet(value);
    }

    public long getConclusaoDestinoElegivel() {
        return instancia.getConclusaoDestinoElegivel();
    }

    public void setConclusaoDestinoElegivel(long conclusaoDestinoElegivel) {
        instancia.setConclusaoDestinoElegivel(conclusaoDestinoElegivel);
    }

    public void unsetConclusaoDestinoElegivel() {
        instancia.unsetConclusaoDestinoElegivel();
    }

    public boolean isSetConclusaoDestinoElegivel() {
        return instancia.isSetConclusaoDestinoElegivel();
    }

    public void setConclusaoDestinoElegivelIsSet(boolean value) {
        instancia.setConclusaoDestinoElegivelIsSet(value);
    }

    public int getConclusaoDestinoInelegivelSize() {
        return instancia.getConclusaoDestinoInelegivelSize();
    }

    public Iterator<Long> getConclusaoDestinoInelegivelIterator() {
        return instancia.getConclusaoDestinoInelegivelIterator();
    }

    public void addToConclusaoDestinoInelegivel(long elem) {
        instancia.addToConclusaoDestinoInelegivel(elem);
    }

    public List<Long> getConclusaoDestinoInelegivel() {
        return instancia.getConclusaoDestinoInelegivel();
    }

    public void setConclusaoDestinoInelegivel(List<Long> conclusaoDestinoInelegivel) {
        instancia.setConclusaoDestinoInelegivel(conclusaoDestinoInelegivel);
    }

    public void unsetConclusaoDestinoInelegivel() {
        instancia.unsetConclusaoDestinoInelegivel();
    }

    public boolean isSetConclusaoDestinoInelegivel() {
        return instancia.isSetConclusaoDestinoInelegivel();
    }

    public void setConclusaoDestinoInelegivelIsSet(boolean value) {
        instancia.setConclusaoDestinoInelegivelIsSet(value);
    }

    public long getCuidadorCidadao() {
        return instancia.getCuidadorCidadao();
    }

    public void setCuidadorCidadao(long cuidadorCidadao) {
        instancia.setCuidadorCidadao(cuidadorCidadao);
    }

    public void unsetCuidadorCidadao() {
        instancia.unsetCuidadorCidadao();
    }

    public boolean isSetCuidadorCidadao() {
        return instancia.isSetCuidadorCidadao();
    }

    public void setCuidadorCidadaoIsSet(boolean value) {
        instancia.setCuidadorCidadaoIsSet(value);
    }

    @Override
    public boolean equals(Object that) {
        return instancia.equals(that);
    }

    public boolean equals(FichaAvaliacaoElegibilidade that) {
        return instancia.equals(that.getInstance());
    }

    @Override
    public int hashCode() {
        return instancia.hashCode();
    }

    public int compareTo(FichaAvaliacaoElegibilidade other) {
        return instancia.compareTo(other.getInstance());
    }

    @Override
    public String toString() {
        return instancia.toString();
    }

    public void validate() throws TException {
        instancia.validate();
    }


    protected FichaAvaliacaoElegibilidadeThrift getInstance(){
        return instancia;
    }

    
}

