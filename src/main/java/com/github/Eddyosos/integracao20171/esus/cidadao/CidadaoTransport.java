package com.github.Eddyosos.integracao20171.esus.cidadao;

import br.gov.saude.esus.thrift.definition.cidadao.CidadaoTransportThrift;
import br.gov.saude.esus.thrift.definition.cidadao.SexoThrift;
import br.gov.saude.esus.thrift.definition.cidadao.TipoSanguineoThrift;
import com.github.eddyosos.e_sus_ab_factory.cidadao.ICidadaoTransport;
import com.github.eddyosos.e_sus_ab_factory.cidadao.IEnderecoTransport;

public class CidadaoTransport implements ICidadaoTransport {

    CidadaoTransportThrift instancia;
    
    public CidadaoTransport(){
        instancia = new CidadaoTransportThrift();
    }

    public CidadaoTransport(CidadaoTransportThrift instancia) {
        this.instancia = instancia;
    }

    @Override
    public void clear() {
        instancia.clear();
    }

    @Override
    public boolean isNaoPossuiCns() {
        return instancia.isNaoPossuiCns();
    }

    @Override
    public void setNaoPossuiCns(boolean naoPossuiCns) {
        instancia.setNaoPossuiCns(naoPossuiCns);
    }

    @Override
    public void unsetNaoPossuiCns() {
        instancia.unsetNaoPossuiCns();
    }

    @Override
    public boolean isSetNaoPossuiCns() {
        return instancia.isSetNaoPossuiCns();
    }

    @Override
    public void setNaoPossuiCnsIsSet(boolean value) {
        instancia.setNaoPossuiCnsIsSet(value);
    }

    @Override
    public String getCns() {
        return instancia.getCns();
    }

    @Override
    public void setCns(String cns) {
        instancia.setCns(cns);
    }

    @Override
    public void unsetCns() {
        instancia.unsetCns();
    }

    @Override
    public boolean isSetCns() {
        return instancia.isSetCns();
    }

    @Override
    public void setCnsIsSet(boolean value) {
        instancia.setCnsIsSet(value);
    }

    @Override
    public String getCpf() {
        return instancia.getCpf();
    }

    @Override
    public void setCpf(String cpf) {
        instancia.setCpf(cpf);
    }

    @Override
    public void unsetCpf() {
        instancia.unsetCpf();
    }

    @Override
    public boolean isSetCpf() {
        return instancia.isSetCpf();
    }

    @Override
    public void setCpfIsSet(boolean value) {
        instancia.setCpfIsSet(value);
    }

    @Override
    public long getDataNascimento() {
        return instancia.getDataNascimento();
    }

    @Override
    public void setDataNascimento(long dataNascimento) {
        instancia.setDataNascimento(dataNascimento);
    }

    @Override
    public void unsetDataNascimento() {
        instancia.unsetDataNascimento();
    }

    @Override
    public boolean isSetDataNascimento() {
        return instancia.isSetDataNascimento();
    }

    @Override
    public void setDataNascimentoIsSet(boolean value) {
        instancia.setDataNascimentoIsSet(value);
    }

    @Override
    public boolean isDesconheceNomeMae() {
        return instancia.isDesconheceNomeMae();
    }

    @Override
    public void setDesconheceNomeMae(boolean desconheceNomeMae) {
        instancia.setDesconheceNomeMae(desconheceNomeMae);
    }

    @Override
    public void unsetDesconheceNomeMae() {
        instancia.unsetDesconheceNomeMae();
    }

    @Override
    public boolean isSetDesconheceNomeMae() {
        return instancia.isSetDesconheceNomeMae();
    }

    @Override
    public void setDesconheceNomeMaeIsSet(boolean value) {
        instancia.setDesconheceNomeMaeIsSet(value);
    }

    @Override
    public String getNomeMae() {
        return instancia.getNomeMae();
    }

    @Override
    public void setNomeMae(String nomeMae) {
        instancia.setNomeMae(nomeMae);
    }

    @Override
    public void unsetNomeMae() {
        instancia.unsetNomeMae();
    }

    @Override
    public boolean isSetNomeMae() {
        return instancia.isSetNomeMae();
    }

    @Override
    public void setNomeMaeIsSet(boolean value) {
        instancia.setNomeMaeIsSet(value);
    }

    @Override
    public String getEmail() {
        return instancia.getEmail();
    }

    @Override
    public void setEmail(String email) {
        instancia.setEmail(email);
    }

    @Override
    public void unsetEmail() {
        instancia.unsetEmail();
    }

    @Override
    public boolean isSetEmail() {
        return instancia.isSetEmail();
    }

    @Override
    public void setEmailIsSet(boolean value) {
        instancia.setEmailIsSet(value);
    }

    @Override
    public IEnderecoTransport getEndereco() {
        return new EnderecoTransport(instancia.getEndereco());
    }

    @Override
    public void setEndereco(IEnderecoTransport endereco) {
        new EnderecoTransport(instancia.getEndereco());
    }

    @Override
    public void unsetEndereco() {
        instancia.unsetEndereco();
    }

    @Override
    public boolean isSetEndereco() {
        return instancia.isSetEndereco();
    }

    @Override
    public void setEnderecoIsSet(boolean value) {
        instancia.setEnderecoIsSet(value);
    }

    @Override
    public long getEscolaridadeId() {
        return instancia.getEscolaridadeId();
    }

    @Override
    public void setEscolaridadeId(long escolaridadeId) {
        instancia.setEscolaridadeId(escolaridadeId);
    }

    @Override
    public void unsetEscolaridadeId() {
        instancia.unsetEscolaridadeId();
    }

    @Override
    public boolean isSetEscolaridadeId() {
        return instancia.isSetEscolaridadeId();
    }

    @Override
    public void setEscolaridadeIdIsSet(boolean value) {
        instancia.setEscolaridadeIdIsSet(value);
    }

    @Override
    public long getEstadoCivilId() {
        return instancia.getEstadoCivilId();
    }

    @Override
    public void setEstadoCivilId(long estadoCivilId) {
        instancia.setEstadoCivilId(estadoCivilId);
    }

    @Override
    public void unsetEstadoCivilId() {
        instancia.unsetEstadoCivilId();
    }

    @Override
    public boolean isSetEstadoCivilId() {
        return instancia.isSetEstadoCivilId();
    }

    @Override
    public void setEstadoCivilIdIsSet(boolean value) {
        instancia.setEstadoCivilIdIsSet(value);
    }

    @Override
    public boolean isEstrangeiro() {
        return instancia.isEstrangeiro();
    }

    @Override
    public void setEstrangeiro(boolean estrangeiro) {
        instancia.setEstrangeiro(estrangeiro);
    }

    @Override
    public void unsetEstrangeiro() {
        instancia.unsetEstrangeiro();
    }

    @Override
    public boolean isSetEstrangeiro() {
        return instancia.isSetEstrangeiro();
    }

    @Override
    public void setEstrangeiroIsSet(boolean value) {
        instancia.setEstrangeiroIsSet(value);
    }

    @Override
    public long getEtniaId() {
        return instancia.getEtniaId();
    }

    @Override
    public void setEtniaId(long etniaId) {
        instancia.setEtniaId(etniaId);
    }

    @Override
    public void unsetEtniaId() {
        instancia.unsetEtniaId();
    }

    @Override
    public boolean isSetEtniaId() {
        return instancia.isSetEtniaId();
    }

    @Override
    public void setEtniaIdIsSet(boolean value) {
        instancia.setEtniaIdIsSet(value);
    }

    @Override
    public boolean isFaleceu() {
        return instancia.isFaleceu();
    }

    @Override
    public void setFaleceu(boolean faleceu) {
        instancia.setFaleceu(faleceu);
    }

    @Override
    public void unsetFaleceu() {
        instancia.unsetFaleceu();
    }

    @Override
    public boolean isSetFaleceu() {
        return instancia.isSetFaleceu();
    }

    @Override
    public void setFaleceuIsSet(boolean value) {
        instancia.setFaleceuIsSet(value);
    }

    @Override
    public String getMunicipioNascimentoCep() {
        return instancia.getMunicipioNascimentoCep();
    }

    @Override
    public void setMunicipioNascimentoCep(String municipioNascimentoCep) {
        instancia.setMunicipioNascimentoCep(municipioNascimentoCep);
    }

    @Override
    public void unsetMunicipioNascimentoCep() {
        instancia.unsetMunicipioNascimentoCep();
    }

    @Override
    public boolean isSetMunicipioNascimentoCep() {
        return instancia.isSetMunicipioNascimentoCep();
    }

    @Override
    public void setMunicipioNascimentoCepIsSet(boolean value) {
        instancia.setMunicipioNascimentoCepIsSet(value);
    }

    @Override
    public String getMunicipioNascimentoDne() {
        return instancia.getMunicipioNascimentoDne();
    }

    @Override
    public void setMunicipioNascimentoDne(String municipioNascimentoDne) {
        instancia.setMunicipioNascimentoDne(municipioNascimentoDne);
    }

    @Override
    public void unsetMunicipioNascimentoDne() {
        instancia.unsetMunicipioNascimentoDne();
    }

    @Override
    public boolean isSetMunicipioNascimentoDne() {
        return instancia.isSetMunicipioNascimentoDne();
    }

    @Override
    public void setMunicipioNascimentoDneIsSet(boolean value) {
        instancia.setMunicipioNascimentoDneIsSet(value);
    }

    @Override
    public String getMunicipioNascimentoIbge() {
        return instancia.getMunicipioNascimentoIbge();
    }

    @Override
    public void setMunicipioNascimentoIbge(String municipioNascimentoIbge) {
        instancia.setMunicipioNascimentoIbge(municipioNascimentoIbge);
    }

    @Override
    public void unsetMunicipioNascimentoIbge() {
        instancia.unsetMunicipioNascimentoIbge();
    }

    @Override
    public boolean isSetMunicipioNascimentoIbge() {
        return instancia.isSetMunicipioNascimentoIbge();
    }

    @Override
    public void setMunicipioNascimentoIbgeIsSet(boolean value) {
        instancia.setMunicipioNascimentoIbgeIsSet(value);
    }

    @Override
    public String getNisPisPasep() {
        return instancia.getNisPisPasep();
    }

    @Override
    public void setNisPisPasep(String nisPisPasep) {
        instancia.setNisPisPasep(nisPisPasep);
    }

    @Override
    public void unsetNisPisPasep() {
        instancia.unsetNisPisPasep();
    }

    @Override
    public boolean isSetNisPisPasep() {
        return instancia.isSetNisPisPasep();
    }

    @Override
    public void setNisPisPasepIsSet(boolean value) {
        instancia.setNisPisPasepIsSet(value);
    }

    @Override
    public String getNomeCompleto() {
        return instancia.getNomeCompleto();
    }

    @Override
    public void setNomeCompleto(String nomeCompleto) {
        instancia.setNomeCompleto(nomeCompleto);
    }

    @Override
    public void unsetNomeCompleto() {
        instancia.unsetNomeCompleto();
    }

    @Override
    public boolean isSetNomeCompleto() {
        return instancia.isSetNomeCompleto();
    }

    @Override
    public void setNomeCompletoIsSet(boolean value) {
        instancia.setNomeCompletoIsSet(value);
    }

    @Override
    public String getNomeSocial() {
        return instancia.getNomeSocial();
    }

    @Override
    public void setNomeSocial(String nomeSocial) {
        instancia.setNomeSocial(nomeSocial);
    }

    @Override
    public void unsetNomeSocial() {
        instancia.unsetNomeSocial();
    }

    @Override
    public boolean isSetNomeSocial() {
        return instancia.isSetNomeSocial();
    }

    @Override
    public void setNomeSocialIsSet(boolean value) {
        instancia.setNomeSocialIsSet(value);
    }

    @Override
    public String getNumeroProntuario() {
        return instancia.getNumeroProntuario();
    }

    @Override
    public void setNumeroProntuario(String numeroProntuario) {
        instancia.setNumeroProntuario(numeroProntuario);
    }

    @Override
    public void unsetNumeroProntuario() {
        instancia.unsetNumeroProntuario();
    }

    @Override
    public boolean isSetNumeroProntuario() {
        return instancia.isSetNumeroProntuario();
    }

    @Override
    public void setNumeroProntuarioIsSet(boolean value) {
        instancia.setNumeroProntuarioIsSet(value);
    }

    @Override
    public String getNumeroProntuarioCnes() {
        return instancia.getNumeroProntuarioCnes();
    }

    @Override
    public void setNumeroProntuarioCnes(String numeroProntuarioCnes) {
        instancia.setNumeroProntuarioCnes(numeroProntuarioCnes);
    }

    @Override
    public void unsetNumeroProntuarioCnes() {
        instancia.unsetNumeroProntuarioCnes();
    }

    @Override
    public boolean isSetNumeroProntuarioCnes() {
        return instancia.isSetNumeroProntuarioCnes();
    }

    @Override
    public void setNumeroProntuarioCnesIsSet(boolean value) {
        instancia.setNumeroProntuarioCnesIsSet(value);
    }

    @Override
    public long getRacaCorId() {
        return instancia.getRacaCorId();
    }

    @Override
    public void setRacaCorId(long racaCorId) {
        instancia.setRacaCorId(racaCorId);
    }

    @Override
    public void unsetRacaCorId() {
        instancia.unsetRacaCorId();
    }

    @Override
    public boolean isSetRacaCorId() {
        return instancia.isSetRacaCorId();
    }

    @Override
    public void setRacaCorIdIsSet(boolean value) {
        instancia.setRacaCorIdIsSet(value);
    }

    @Override
    public SexoThrift getSexo() {
        return instancia.getSexo();
    }

    @Override
    public void setSexo(SexoThrift sexo) {
        instancia.setSexo(sexo);
    }

    @Override
    public void unsetSexo() {
        instancia.unsetSexo();
    }

    @Override
    public boolean isSetSexo() {
        return instancia.isSetSexo();
    }

    @Override
    public void setSexoIsSet(boolean value) {
        instancia.setSexoIsSet(value);
    }

    @Override
    public String getTelefoneCelular() {
        return instancia.getTelefoneCelular();
    }

    @Override
    public void setTelefoneCelular(String telefoneCelular) {
        instancia.setTelefoneCelular(telefoneCelular);
    }

    @Override
    public void unsetTelefoneCelular() {
        instancia.unsetTelefoneCelular();
    }

    @Override
    public boolean isSetTelefoneCelular() {
        return instancia.isSetTelefoneCelular();
    }

    @Override
    public void setTelefoneCelularIsSet(boolean value) {
        instancia.setTelefoneCelularIsSet(value);
    }

    @Override
    public String getTelefoneContato() {
        return instancia.getTelefoneContato();
    }

    @Override
    public void setTelefoneContato(String telefoneContato) {
        instancia.setTelefoneContato(telefoneContato);
    }

    @Override
    public void unsetTelefoneContato() {
        instancia.unsetTelefoneContato();
    }

    @Override
    public boolean isSetTelefoneContato() {
        return instancia.isSetTelefoneContato();
    }

    @Override
    public void setTelefoneContatoIsSet(boolean value) {
        instancia.setTelefoneContatoIsSet(value);
    }

    @Override
    public String getTelefoneResidencial() {
        return instancia.getTelefoneResidencial();
    }

    @Override
    public void setTelefoneResidencial(String telefoneResidencial) {
        instancia.setTelefoneResidencial(telefoneResidencial);
    }

    @Override
    public void unsetTelefoneResidencial() {
        instancia.unsetTelefoneResidencial();
    }

    @Override
    public boolean isSetTelefoneResidencial() {
        return instancia.isSetTelefoneResidencial();
    }

    @Override
    public void setTelefoneResidencialIsSet(boolean value) {
        instancia.setTelefoneResidencialIsSet(value);
    }

    @Override
    public TipoSanguineoThrift getTipoSanguineo() {
        return instancia.getTipoSanguineo();
    }

    @Override
    public void setTipoSanguineo(TipoSanguineoThrift tipoSanguineo) {
        instancia.setTipoSanguineo(tipoSanguineo);
    }

    @Override
    public void unsetTipoSanguineo() {
        instancia.unsetTipoSanguineo();
    }

    @Override
    public boolean isSetTipoSanguineo() {
        return instancia.isSetTipoSanguineo();
    }

    @Override
    public void setTipoSanguineoIsSet(boolean value) {
        instancia.setTipoSanguineoIsSet(value);
    }

    @Override
    public String getCboNumero() {
        return instancia.getCboNumero();
    }

    @Override
    public void setCboNumero(String cboNumero) {
        instancia.setCboNumero(cboNumero);
    }

    @Override
    public void unsetCboNumero() {
        instancia.unsetCboNumero();
    }

    @Override
    public boolean isSetCboNumero() {
        return instancia.isSetCboNumero();
    }

    @Override
    public void setCboNumeroIsSet(boolean value) {
        instancia.setCboNumeroIsSet(value);
    }

    @Override
    public CidadaoTransportThrift getIstance() {
        return instancia;
    }

}
