package com.github.Eddyosos.integracao20171.esus.cidadao;

import br.gov.saude.esus.thrift.definition.cidadao.CidadaoTransportThrift;
import br.gov.saude.esus.thrift.definition.cidadao.SexoThrift;
import br.gov.saude.esus.thrift.definition.cidadao.TipoSanguineoThrift;
import org.apache.thrift.TException;

public class CidadaoTransport {

    CidadaoTransportThrift instancia = new CidadaoTransportThrift();

    public CidadaoTransport(CidadaoTransportThrift instancia) {
        this.instancia = instancia;
    }

    public CidadaoTransport deepCopy() {
        return new CidadaoTransport(instancia.deepCopy()); 
    }

    public void clear() {
        instancia.clear();
    }

    public boolean isNaoPossuiCns() {
        return instancia.isNaoPossuiCns();
    }

    public void setNaoPossuiCns(boolean naoPossuiCns) {
        instancia.setNaoPossuiCns(naoPossuiCns);
    }

    public void unsetNaoPossuiCns() {
        instancia.unsetNaoPossuiCns();
    }

    public boolean isSetNaoPossuiCns() {
        return instancia.isSetNaoPossuiCns();
    }

    public void setNaoPossuiCnsIsSet(boolean value) {
        instancia.setNaoPossuiCnsIsSet(value);
    }

    public String getCns() {
        return instancia.getCns();
    }

    public void setCns(String cns) {
        instancia.setCns(cns);
    }

    public void unsetCns() {
        instancia.unsetCns();
    }

    public boolean isSetCns() {
        return instancia.isSetCns();
    }

    public void setCnsIsSet(boolean value) {
        instancia.setCnsIsSet(value);
    }

    public String getCpf() {
        return instancia.getCpf();
    }

    public void setCpf(String cpf) {
        instancia.setCpf(cpf);
    }

    public void unsetCpf() {
        instancia.unsetCpf();
    }

    public boolean isSetCpf() {
        return instancia.isSetCpf();
    }

    public void setCpfIsSet(boolean value) {
        instancia.setCpfIsSet(value);
    }

    public long getDataNascimento() {
        return instancia.getDataNascimento();
    }

    public void setDataNascimento(long dataNascimento) {
        instancia.setDataNascimento(dataNascimento);
    }

    public void unsetDataNascimento() {
        instancia.unsetDataNascimento();
    }

    public boolean isSetDataNascimento() {
        return instancia.isSetDataNascimento();
    }

    public void setDataNascimentoIsSet(boolean value) {
        instancia.setDataNascimentoIsSet(value);
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

    public String getNomeMae() {
        return instancia.getNomeMae();
    }

    public void setNomeMae(String nomeMae) {
        instancia.setNomeMae(nomeMae);
    }

    public void unsetNomeMae() {
        instancia.unsetNomeMae();
    }

    public boolean isSetNomeMae() {
        return instancia.isSetNomeMae();
    }

    public void setNomeMaeIsSet(boolean value) {
        instancia.setNomeMaeIsSet(value);
    }

    public String getEmail() {
        return instancia.getEmail();
    }

    public void setEmail(String email) {
        instancia.setEmail(email);
    }

    public void unsetEmail() {
        instancia.unsetEmail();
    }

    public boolean isSetEmail() {
        return instancia.isSetEmail();
    }

    public void setEmailIsSet(boolean value) {
        instancia.setEmailIsSet(value);
    }

    public EnderecoTransport getEndereco() {
        return new EnderecoTransport(instancia.getEndereco());
    }

    public void setEndereco(EnderecoTransport endereco) {
        new EnderecoTransport(instancia.getEndereco());
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

    public long getEscolaridadeId() {
        return instancia.getEscolaridadeId();
    }

    public void setEscolaridadeId(long escolaridadeId) {
        instancia.setEscolaridadeId(escolaridadeId);
    }

    public void unsetEscolaridadeId() {
        instancia.unsetEscolaridadeId();
    }

    public boolean isSetEscolaridadeId() {
        return instancia.isSetEscolaridadeId();
    }

    public void setEscolaridadeIdIsSet(boolean value) {
        instancia.setEscolaridadeIdIsSet(value);
    }

    public long getEstadoCivilId() {
        return instancia.getEstadoCivilId();
    }

    public void setEstadoCivilId(long estadoCivilId) {
        instancia.setEstadoCivilId(estadoCivilId);
    }

    public void unsetEstadoCivilId() {
        instancia.unsetEstadoCivilId();
    }

    public boolean isSetEstadoCivilId() {
        return instancia.isSetEstadoCivilId();
    }

    public void setEstadoCivilIdIsSet(boolean value) {
        instancia.setEstadoCivilIdIsSet(value);
    }

    public boolean isEstrangeiro() {
        return instancia.isEstrangeiro();
    }

    public void setEstrangeiro(boolean estrangeiro) {
        instancia.setEstrangeiro(estrangeiro);
    }

    public void unsetEstrangeiro() {
        instancia.unsetEstrangeiro();
    }

    public boolean isSetEstrangeiro() {
        return instancia.isSetEstrangeiro();
    }

    public void setEstrangeiroIsSet(boolean value) {
        instancia.setEstrangeiroIsSet(value);
    }

    public long getEtniaId() {
        return instancia.getEtniaId();
    }

    public void setEtniaId(long etniaId) {
        instancia.setEtniaId(etniaId);
    }

    public void unsetEtniaId() {
        instancia.unsetEtniaId();
    }

    public boolean isSetEtniaId() {
        return instancia.isSetEtniaId();
    }

    public void setEtniaIdIsSet(boolean value) {
        instancia.setEtniaIdIsSet(value);
    }

    public boolean isFaleceu() {
        return instancia.isFaleceu();
    }

    public void setFaleceu(boolean faleceu) {
        instancia.setFaleceu(faleceu);
    }

    public void unsetFaleceu() {
        instancia.unsetFaleceu();
    }

    public boolean isSetFaleceu() {
        return instancia.isSetFaleceu();
    }

    public void setFaleceuIsSet(boolean value) {
        instancia.setFaleceuIsSet(value);
    }

    public String getMunicipioNascimentoCep() {
        return instancia.getMunicipioNascimentoCep();
    }

    public void setMunicipioNascimentoCep(String municipioNascimentoCep) {
        instancia.setMunicipioNascimentoCep(municipioNascimentoCep);
    }

    public void unsetMunicipioNascimentoCep() {
        instancia.unsetMunicipioNascimentoCep();
    }

    public boolean isSetMunicipioNascimentoCep() {
        return instancia.isSetMunicipioNascimentoCep();
    }

    public void setMunicipioNascimentoCepIsSet(boolean value) {
        instancia.setMunicipioNascimentoCepIsSet(value);
    }

    public String getMunicipioNascimentoDne() {
        return instancia.getMunicipioNascimentoDne();
    }

    public void setMunicipioNascimentoDne(String municipioNascimentoDne) {
        instancia.setMunicipioNascimentoDne(municipioNascimentoDne);
    }

    public void unsetMunicipioNascimentoDne() {
        instancia.unsetMunicipioNascimentoDne();
    }

    public boolean isSetMunicipioNascimentoDne() {
        return instancia.isSetMunicipioNascimentoDne();
    }

    public void setMunicipioNascimentoDneIsSet(boolean value) {
        instancia.setMunicipioNascimentoDneIsSet(value);
    }

    public String getMunicipioNascimentoIbge() {
        return instancia.getMunicipioNascimentoIbge();
    }

    public void setMunicipioNascimentoIbge(String municipioNascimentoIbge) {
        instancia.setMunicipioNascimentoIbge(municipioNascimentoIbge);
    }

    public void unsetMunicipioNascimentoIbge() {
        instancia.unsetMunicipioNascimentoIbge();
    }

    public boolean isSetMunicipioNascimentoIbge() {
        return instancia.isSetMunicipioNascimentoIbge();
    }

    public void setMunicipioNascimentoIbgeIsSet(boolean value) {
        instancia.setMunicipioNascimentoIbgeIsSet(value);
    }

    public String getNisPisPasep() {
        return instancia.getNisPisPasep();
    }

    public void setNisPisPasep(String nisPisPasep) {
        instancia.setNisPisPasep(nisPisPasep);
    }

    public void unsetNisPisPasep() {
        instancia.unsetNisPisPasep();
    }

    public boolean isSetNisPisPasep() {
        return instancia.isSetNisPisPasep();
    }

    public void setNisPisPasepIsSet(boolean value) {
        instancia.setNisPisPasepIsSet(value);
    }

    public String getNomeCompleto() {
        return instancia.getNomeCompleto();
    }

    public void setNomeCompleto(String nomeCompleto) {
        instancia.setNomeCompleto(nomeCompleto);
    }

    public void unsetNomeCompleto() {
        instancia.unsetNomeCompleto();
    }

    public boolean isSetNomeCompleto() {
        return instancia.isSetNomeCompleto();
    }

    public void setNomeCompletoIsSet(boolean value) {
        instancia.setNomeCompletoIsSet(value);
    }

    public String getNomeSocial() {
        return instancia.getNomeSocial();
    }

    public void setNomeSocial(String nomeSocial) {
        instancia.setNomeSocial(nomeSocial);
    }

    public void unsetNomeSocial() {
        instancia.unsetNomeSocial();
    }

    public boolean isSetNomeSocial() {
        return instancia.isSetNomeSocial();
    }

    public void setNomeSocialIsSet(boolean value) {
        instancia.setNomeSocialIsSet(value);
    }

    public String getNumeroProntuario() {
        return instancia.getNumeroProntuario();
    }

    public void setNumeroProntuario(String numeroProntuario) {
        instancia.setNumeroProntuario(numeroProntuario);
    }

    public void unsetNumeroProntuario() {
        instancia.unsetNumeroProntuario();
    }

    public boolean isSetNumeroProntuario() {
        return instancia.isSetNumeroProntuario();
    }

    public void setNumeroProntuarioIsSet(boolean value) {
        instancia.setNumeroProntuarioIsSet(value);
    }

    public String getNumeroProntuarioCnes() {
        return instancia.getNumeroProntuarioCnes();
    }

    public void setNumeroProntuarioCnes(String numeroProntuarioCnes) {
        instancia.setNumeroProntuarioCnes(numeroProntuarioCnes);
    }

    public void unsetNumeroProntuarioCnes() {
        instancia.unsetNumeroProntuarioCnes();
    }

    public boolean isSetNumeroProntuarioCnes() {
        return instancia.isSetNumeroProntuarioCnes();
    }

    public void setNumeroProntuarioCnesIsSet(boolean value) {
        instancia.setNumeroProntuarioCnesIsSet(value);
    }

    public long getRacaCorId() {
        return instancia.getRacaCorId();
    }

    public void setRacaCorId(long racaCorId) {
        instancia.setRacaCorId(racaCorId);
    }

    public void unsetRacaCorId() {
        instancia.unsetRacaCorId();
    }

    public boolean isSetRacaCorId() {
        return instancia.isSetRacaCorId();
    }

    public void setRacaCorIdIsSet(boolean value) {
        instancia.setRacaCorIdIsSet(value);
    }

    public SexoThrift getSexo() {
        return instancia.getSexo();
    }

    public void setSexo(SexoThrift sexo) {
        instancia.setSexo(sexo);
    }

    public void unsetSexo() {
        instancia.unsetSexo();
    }

    public boolean isSetSexo() {
        return instancia.isSetSexo();
    }

    public void setSexoIsSet(boolean value) {
        instancia.setSexoIsSet(value);
    }

    public String getTelefoneCelular() {
        return instancia.getTelefoneCelular();
    }

    public void setTelefoneCelular(String telefoneCelular) {
        instancia.setTelefoneCelular(telefoneCelular);
    }

    public void unsetTelefoneCelular() {
        instancia.unsetTelefoneCelular();
    }

    public boolean isSetTelefoneCelular() {
        return instancia.isSetTelefoneCelular();
    }

    public void setTelefoneCelularIsSet(boolean value) {
        instancia.setTelefoneCelularIsSet(value);
    }

    public String getTelefoneContato() {
        return instancia.getTelefoneContato();
    }

    public void setTelefoneContato(String telefoneContato) {
        instancia.setTelefoneContato(telefoneContato);
    }

    public void unsetTelefoneContato() {
        instancia.unsetTelefoneContato();
    }

    public boolean isSetTelefoneContato() {
        return instancia.isSetTelefoneContato();
    }

    public void setTelefoneContatoIsSet(boolean value) {
        instancia.setTelefoneContatoIsSet(value);
    }

    public String getTelefoneResidencial() {
        return instancia.getTelefoneResidencial();
    }

    public void setTelefoneResidencial(String telefoneResidencial) {
        instancia.setTelefoneResidencial(telefoneResidencial);
    }

    public void unsetTelefoneResidencial() {
        instancia.unsetTelefoneResidencial();
    }

    public boolean isSetTelefoneResidencial() {
        return instancia.isSetTelefoneResidencial();
    }

    public void setTelefoneResidencialIsSet(boolean value) {
        instancia.setTelefoneResidencialIsSet(value);
    }

    public TipoSanguineoThrift getTipoSanguineo() {
        return instancia.getTipoSanguineo();
    }

    public void setTipoSanguineo(TipoSanguineoThrift tipoSanguineo) {
        instancia.setTipoSanguineo(tipoSanguineo);
    }

    public void unsetTipoSanguineo() {
        instancia.unsetTipoSanguineo();
    }

    public boolean isSetTipoSanguineo() {
        return instancia.isSetTipoSanguineo();
    }

    public void setTipoSanguineoIsSet(boolean value) {
        instancia.setTipoSanguineoIsSet(value);
    }

    public String getCboNumero() {
        return instancia.getCboNumero();
    }

    public void setCboNumero(String cboNumero) {
        instancia.setCboNumero(cboNumero);
    }

    public void unsetCboNumero() {
        instancia.unsetCboNumero();
    }

    public boolean isSetCboNumero() {
        return instancia.isSetCboNumero();
    }

    public void setCboNumeroIsSet(boolean value) {
        instancia.setCboNumeroIsSet(value);
    }

    @Override
    public boolean equals(Object that) {
        return instancia.equals(that);
    }

    public boolean equals(CidadaoTransport that) {
        return instancia.equals(that.getIstance());
    }

    @Override
    public int hashCode() {
        return instancia.hashCode();
    }

    public int compareTo(CidadaoTransport other) {
        return instancia.compareTo(other.getIstance());
    }

    @Override
    public String toString() {
        return instancia.toString();
    }

    public void validate() throws TException {
        instancia.validate();
    }

    protected CidadaoTransportThrift getIstance() {
        return instancia;
    }

}
