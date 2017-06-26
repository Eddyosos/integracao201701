package com.github.Eddyosos.integracao20171.esus.cds.avaliacaoelegibilidade;

import br.gov.saude.esus.cds.transport.generated.thrift.avaliacaoelegibilidade.FichaAvaliacaoElegibilidadeThrift;
import com.github.Eddyosos.integracao20171.compactor.SerializadorThrift;
import com.github.Eddyosos.integracao20171.esus.cds.common.EnderecoLocalPermanencia;
import com.github.Eddyosos.integracao20171.esus.cds.common.UnicaLotacaoHeader;
import com.github.Eddyosos.integracao20171.esus.transport.DadoTransporte;
import com.github.Eddyosos.integracao20171.utils.IDS.CNS;
import com.github.eddyosos.e_sus_ab_factory.cds.common.IEnderecoLocalPermanencia;
import com.github.eddyosos.e_sus_ab_factory.cds.common.IUnicaLotacaoHeader;
import com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.avaliacaoelegibilidade.IFichaAvaliacaoElegibilidade;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;


public class FichaAvaliacaoElegibilidade implements IFichaAvaliacaoElegibilidade {
    private FichaAvaliacaoElegibilidadeThrift instancia = new FichaAvaliacaoElegibilidadeThrift();
    private long TIPO_DADO_SERIALIZADO_FICHA_PROCEDIMENTO = 11;
    private final static String EXTENSAO_EXPORT = ".esus13";
    private DadoTransporte dadoTransporteThrift;
    
    public FichaAvaliacaoElegibilidade(FichaAvaliacaoElegibilidadeThrift fichaAvaliacaoElegibilidade){
        this.instancia = fichaAvaliacaoElegibilidade;
    }

    /**
     * Remove todos os dados da ficha.
     */
    @Override
    public void clear() {
        instancia.clear();
    }

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * 
     * Presenca obrigatória.
     * Tamanho mínimo: 36
     * Tamanho maximo: 44
     * Regras: É recomendado concatenar o CNES na frente do UUID,
     * de modo que os 7 digitos (CNES) + 1 de hífen somados aos 36 (32 caracteres + 4 hífen)
     * do UUID são a limitação de 44 bytes do campo. Formato canônico.
     * 
     * @return Código uuid.
     */
    @Override
    public String getUuidFicha() {
        return instancia.getUuidFicha();
    }

    /**
     * Define o código uuid da ficha.
     * @param uuidFicha Código uuid da ficha.
     */
    @Override
    public void setUuidFicha(String uuidFicha) {
        instancia.setUuidFicha(uuidFicha);
    }

    /**
     * Remove o código uuid da ficha.
     */
    @Override
    public void unsetUuidFicha() {
        instancia.unsetUuidFicha();
    }

    /**
     * Verifica se o código uuid da ficha foi declarado.
     * @return True caso o código uuid da ficha tenha sido declarado.
     */
    @Override
    public boolean isSetUuidFicha() {
        return instancia.isSetUuidFicha();
    }

    /**
     * Declara o estado do código uuid da ficha.
     * @param value True caso o código uuid da ficha tenha sido inserido.
     */
    @Override
    public void setUuidFichaIsSet(boolean value) {
        instancia.setUuidFichaIsSet(value);
    }

    /**
     * Tipo de origem dos dados do registro.
     * @return Tipo de origem dos dados do registro.
     */
    @Override
    public int getTpCdsOrigem() {
        return instancia.getTpCdsOrigem();
    }

    /**
     * Define o tipo de origem dos dados do registro.
     * 
     * Presenca obrigatória.
     * Observação: Utilizar valor 3 (sistemas terceiros).
     * 
     * @param tpCdsOrigem Tipo de origem dos dados do registro.
     */
    @Override
    public void setTpCdsOrigem(int tpCdsOrigem) {
        instancia.setTpCdsOrigem(tpCdsOrigem);
    }

    /**
     * Remove o tipo de origem dos dados do registro.
     */
    @Override
    public void unsetTpCdsOrigem() {
        instancia.unsetTpCdsOrigem();
    }

    /**
     * Verifica se o tipo de origem dos dados do registro foi declarado.
     * @return True caso o tipo de origem dos dados do registro tenha sido inserido.
     */
    @Override
    public boolean isSetTpCdsOrigem() {
        return instancia.isSetTpCdsOrigem();
    }

    /**
     * Declara se o tipo de origem dos dados do registro foi inserido.
     * @param value True caso o tipo de origem dos dados do registro tenha sido inserido.
     */
    @Override
    public void setTpCdsOrigemIsSet(boolean value) {
        instancia.setTpCdsOrigemIsSet(value);
    }

    /**
     * Profissional que realizou a visita.
     * @return Profissional que realizou a visita.
     */
    @Override
    public IUnicaLotacaoHeader getHeaderTransport() {
        return new UnicaLotacaoHeader(instancia.getHeaderTransport());
    }

    /**
     * Define o profissional que realizou a visita.
     * 
     * Presenca obrigatória.
     * 
     * @param headerTransport Profissional que realizou a visita.
     */
    @Override
    public void setHeaderTransport(IUnicaLotacaoHeader headerTransport) {
        instancia.setHeaderTransport(headerTransport.getInstance());
    }

    /**
     * Remove o profissional que realizou a visita.
     */
    @Override
    public void unsetHeaderTransport() {
        instancia.unsetHeaderTransport();
    }

    /**
     * Verifica se o profissional que realizou a visita foi declarado.
     * @return True caso o profissional que realizou a visita tenha sido inserido.
     */
    @Override
    public boolean isSetHeaderTransport() {
        return instancia.isSetHeaderTransport();
    }

    /**
     * Define se o profissional que realizou a visita doi inserido.
     * @param value True caso profissional que realizou a visita tenha sido inserido.
     */
    @Override
    public void setHeaderTransportIsSet(boolean value) {
        instancia.setHeaderTransportIsSet(value);
    }

    /**
     * CNS do cidadão.
     * @return CNS do cidadão.
     */
    @Override
    public String getNumeroCartaoSus() {
        return instancia.getNumeroCartaoSus();
    }

    /**
     * CNS do cidadão.
     * 
     * Presenca obrigatória.
     * Regras: CNS válido de acordo com o algoritmo.
     * Tamanho: 15 digitos.
     * 
     * @param numeroCartaoSus 
     */
    @Override
    public void setNumeroCartaoSus(String numeroCartaoSus) {
        instancia.setNumeroCartaoSus(numeroCartaoSus);
    }

    /**
     * Remove o CNS do cidadão.
     */
    @Override
    public void unsetNumeroCartaoSus() {
        instancia.unsetNumeroCartaoSus();
    }

    /**
     * Verifica se o CNS do cidadão foi declarado.
     * @return True caso o CNS do cidadão tenhe sido inserido.
     */
    @Override
    public boolean isSetNumeroCartaoSus() {
        return instancia.isSetNumeroCartaoSus();
    }

    /**
     * Declara se o CNS do cidadão foi inserido.
     * @param value True caso o CNS do cidadão dtenha sido inserido.
     */
    @Override
    public void setNumeroCartaoSusIsSet(boolean value) {
        instancia.setNumeroCartaoSusIsSet(value);
    }

    /**
     * Nome do cidadão.
     * @return Nome do cidadão
     */
    @Override
    public String getNomeCidadao() {
        return instancia.getNomeCidadao();
    }

    /**
     * Define o nome do cidadão.
     * 
     * Regra:Ter ao menos duas palavras.
     * Regra: Somente texto e apóstrofo (').
     * Regra:Opcional caso conclusaoDestinoElegivel for diferente de 1 (admissão própria emad).
     * Tamanho mínimo: 5
     * Tamanho máximo: 100;
     * 
     * @param nomeCidadao Nome do cidadão.
     */
    @Override
    public void setNomeCidadao(String nomeCidadao) {
        instancia.setNomeCidadao(nomeCidadao);
    }

    /**
     * Remove o nome do cidadão.
     */
    @Override
    public void unsetNomeCidadao() {
        instancia.unsetNomeCidadao();
    }

    /**
     * Verifica se o nome do cidadão foi declarado.
     * @return True caso o nome do cidadão tenha sido inserido.
     */
    @Override
    public boolean isSetNomeCidadao() {
        return instancia.isSetNomeCidadao();
    }

    /**
     * Declase se o nome do cidadão foi inserido.
     * @param value True caso o nome do cidadão tenha sido inserido.
     */
    @Override
    public void setNomeCidadaoIsSet(boolean value) {
        instancia.setNomeCidadaoIsSet(value);
    }

    /**
     * Nome social do cidadão.
     * @return Nome social do cidadão.
     */
    @Override
    public String getNomeSocialCidadao() {
        return instancia.getNomeSocialCidadao();
    }

    /**
     * Define o nome social do cidadão.
     * 
     * Regra: Somente texto e apóstrofo (').
     * Tamanho minimo: 0
     * Tamanho máximo: 100
     * 
     * @param nomeSocialCidadao Nome social do cidadão.
     */
    @Override
    public void setNomeSocialCidadao(String nomeSocialCidadao) {
        instancia.setNomeSocialCidadao(nomeSocialCidadao);
    }

    /**
     * Remove o nome social do cidadão.
     */
    @Override
    public void unsetNomeSocialCidadao() {
        instancia.unsetNomeSocialCidadao();
    }

    /**
     * Verifica se o nome social do cidadão foi declarado.
     * @return 
     */
    @Override
    public boolean isSetNomeSocialCidadao() {
        return instancia.isSetNomeSocialCidadao();
    }

    /**
     * Declara se o cidadão possui um nome social.
     * @param value True caso o cidadão possua um nome social.
     */
    @Override
    public void setNomeSocialCidadaoIsSet(boolean value) {
        instancia.setNomeSocialCidadaoIsSet(value);
    }

    /**
     * Data de nascimento do cidadão.
     * 
     * Presença obrigatória.
     * Regras: Não pode ser posterior a dataAtendimento e anterior a 130 anos a partir da dataAtendimento.
     * 
     * @return Data de nascimento do cidadão no formato epoch time.
     */
    @Override
    public long getDataNascimentoCidadao() {
        return instancia.getDataNascimentoCidadao();
    }

    /**
     * Define a data de nascimento do cidadão.
     * @param dataNascimentoCidadao Data de nascimento do cidadão
     */
    @Override
    public void setDataNascimentoCidadao(long dataNascimentoCidadao) {
        instancia.setDataNascimentoCidadao(dataNascimentoCidadao);
    }

    /**
     * Remove a data de nascimento do cidadão,
     */
    @Override
    public void unsetDataNascimentoCidadao() {
        instancia.unsetDataNascimentoCidadao();
    }

    /**
     * Verifica se a data de nascimento do cidadão foi declarada.
     * @return True caso a data de nascimento do cidadão tenha sido inserida.
     */
    @Override
    public boolean isSetDataNascimentoCidadao() {
        return instancia.isSetDataNascimentoCidadao();
    }

    /**
     * Define se a data de nascimento do cidadão foi inserida.
     * @param value True caso a data de nascimento do cidadão tenha sido inserida
     */
    @Override
    public void setDataNascimentoCidadaoIsSet(boolean value) {
        instancia.setDataNascimentoCidadaoIsSet(value);
    }

    /**
     * sexo do cidadão.
     * @return Código do sexo do cidadão.
     */
    @Override
    public long getSexoCidadao() {
        return instancia.getSexoCidadao();
    }

    /**
     * Define o sexo do cidadão.
     * 
     * Presença obrigatória.
     * 
     * @param sexoCidadao Código do sexo do cidadão.
     */
    @Override
    public void setSexoCidadao(long sexoCidadao) {
        instancia.setSexoCidadao(sexoCidadao);
    }
    
    /**
     * Remove o sexo do cidadão.
     */
    @Override
    public void unsetSexoCidadao() {
        instancia.unsetSexoCidadao();
    }

    /**
     * Verifica se o sexo foi definido.
     * @return True caso o sexo tenha sido definido.
     */
    @Override
    public boolean isSetSexoCidadao() {
        return instancia.isSetSexoCidadao();
    }

    /**
     * Retorna se o sexo do cidadão foi definido.
     * @param value True caso o sexo tenha sido definido.
     */
    @Override
    public void setSexoCidadaoIsSet(boolean value) {
        instancia.setSexoCidadaoIsSet(value);
    }

    /**
     * Raça / cor do cidadão.
     * 
     * @return Código da raça / cor do cidadão.
     */
    @Override
    public long getRacaCorCidadao() {
        return instancia.getRacaCorCidadao();
    }

    /**
     * Raça / cor do cidadão.
     * 
     * Regra: Opcional caso conclusaoDestinoElegivel for diferente de 1 (admissão própria emad).
     * 
     * @param racaCorCidadao Código da raça / cor do cidadão.
     */
    @Override
    public void setRacaCorCidadao(long racaCorCidadao) {
        instancia.setRacaCorCidadao(racaCorCidadao);
    }

    /**
     * Remove a raça / cor do cidadão.
     */
    @Override
    public void unsetRacaCorCidadao() {
        instancia.unsetRacaCorCidadao();
    }

    /**
     *  Verifica se a raça / cor do cidadão foi declarada.
     * @return True Caso a raça / cor do cidadão tenha sido inserida.
     */
    @Override
    public boolean isSetRacaCorCidadao() {
        return instancia.isSetRacaCorCidadao();
    }

    /**
     * Declara se a raça / cor do cidadão foi inserida
     * 
     * @param value True caso a raça / cor do cidadão tenha sido inserido.
     */
    @Override
    public void setRacaCorCidadaoIsSet(boolean value) {
        instancia.setRacaCorCidadaoIsSet(value);
    }

    /**
     * Nome da mãe do cidadão.
     * 
     * @return Nome da mãe do cidadão.
     */
    @Override
    public String getNomeMaeCidadao() {
        return instancia.getNomeMaeCidadao();
    }

    /**
     * Define o Nome da mãe do cidadão.
     * 
     * Regra: Ter ao menos duas palavras.
     * Regra: Somente texto e apóstrofo (').
     * Regra: Não pode ser preenchido se o campo desconheceNomeMae = true.
     * 
     * @param nomeMaeCidadao Nome da mãe do cidadão.
     */
    @Override
    public void setNomeMaeCidadao(String nomeMaeCidadao) {
        instancia.setNomeMaeCidadao(nomeMaeCidadao);
    }

    /**
     * Remove o nome da mãe do cidadão
     */
    @Override
    public void unsetNomeMaeCidadao() {
        instancia.unsetNomeMaeCidadao();
    }

    /**
     * Verifica se o nome da mãe do cidadão foi declarado.
     * 
     * @return True caso o nome da mãe do cidadão tenha sido declarado.
     */
    @Override
    public boolean isSetNomeMaeCidadao() {
        return instancia.isSetNomeMaeCidadao();
    }

    /**
     * Declara se o nome da mãe do cidadão foi inserido.
     * 
     * @param value True caso o nome da mãe tenha sido inserido.
     */
    @Override
    public void setNomeMaeCidadaoIsSet(boolean value) {
        instancia.setNomeMaeCidadaoIsSet(value);
    }

    /**
     * Verifica se o cidadão conhece o nome da mãe.
     * 
     * @return True caso o cidadão não conheça o nome da mãe.
     */
    @Override
    public boolean isDesconheceNomeMae() {
        return instancia.isDesconheceNomeMae();
    }

    /**
     * Define se o cidadão não conhece sua mãe.
     * 
     * @param desconheceNomeMae True caso o cidadão não conheça o nome de sua mãe.
     */
    @Override
    public void setDesconheceNomeMae(boolean desconheceNomeMae) {
        instancia.setDesconheceNomeMae(desconheceNomeMae);
    }

    /**
     * Remove o estado de nome da mãe desconhecido.
     */
    @Override
    public void unsetDesconheceNomeMae() {
        instancia.unsetDesconheceNomeMae();
    }

    /**
     * Verifica se o cidadão informou desconhecer o nome da mãe.
     * 
     * @return True caso desconhecer o nome da mãe tenha sido declarado.
     */
    @Override
    public boolean isSetDesconheceNomeMae() {
        return instancia.isSetDesconheceNomeMae();
    }

    /**
     * Declara se o campo desconhece nome da mãe foi inserido.
     * @param value True Caso desconhece nome da mãe tenha sido inserido.
     */
    @Override
    public void setDesconheceNomeMaeIsSet(boolean value) {
        instancia.setDesconheceNomeMaeIsSet(value);
    }

    /**
     * Município de nascimento do cidadão..
     * 
     * @return Código IBGE do município
     */
    @Override
    public String getCodigoIbgeMunicipioNascimento() {
        return instancia.getCodigoIbgeMunicipioNascimento();
    }

    /**
     * Define o município de nascimento do cidadão
     * 
     * Regras: Não pode ser preenchido se codigoNacionalidade for diferente de 1 (brasileiro).
     * 
     * @param codigoIbgeMunicipioNascimento Código IBGE do município.
     */
    @Override
    public void setCodigoIbgeMunicipioNascimento(String codigoIbgeMunicipioNascimento) {
        instancia.setCodigoIbgeMunicipioNascimento(codigoIbgeMunicipioNascimento);
    }

    /**
     * Remove o município de nascimento do cidadão.
     */
    @Override
    public void unsetCodigoIbgeMunicipioNascimento() {
        instancia.unsetCodigoIbgeMunicipioNascimento();
    }

    /**
     * Verifica se o município de nascimento do cidadão foi declarado.
     * 
     * @return True Caso o município tenha sido inserido
     * @return False caso o município não tenha sido inserido.
     */
    @Override
    public boolean isSetCodigoIbgeMunicipioNascimento() {
        return instancia.isSetCodigoIbgeMunicipioNascimento();
    }

    /**
     * Declara se o município de nascimento foi inserido.
     * 
     * @param value True caso deseje informar que o município foi inserido.
     */
    @Override
    public void setCodigoIbgeMunicipioNascimentoIsSet(boolean value) {
        instancia.setCodigoIbgeMunicipioNascimentoIsSet(value);
    }

    /**
     * Indica se o cidadão é brasileiro, naturalizado ou estrangeiro.
     * 
     * @return Código do marcador que indica se o cidadão é brasileiro, naturalizado ou estrangeiro.
     */
    @Override
    public long getCodigoNacionalidade() {
        return instancia.getCodigoNacionalidade();
    }

    /**
     * Define se o cidadão é brasileiro, naturalizado ou estrangeiro.
     * 
     * Regra: Opcional caso conclusaoDestinoElegivel for diferente de 1 (admissão própria emad).
     * 
     * @param codigoNacionalidade Código do marcador que indica se o cidadão é brasileiro, naturalizado ou estrangeiro.
     */
    @Override
    public void setCodigoNacionalidade(long codigoNacionalidade) {
        instancia.setCodigoNacionalidade(codigoNacionalidade);
    }

    /**
     * Remove a nacionalidade do cidadão.
     */
    @Override
    public void unsetCodigoNacionalidade() {
        instancia.unsetCodigoNacionalidade();
    }

    /**
     * Verifica se o código de nacionalidade foi declarado.
     * 
     * @return True Caso o cidadão possua um código de nacionalidade ou False caso o código de nacionalidade não tenha sido informado.
     */
    @Override
    public boolean isSetCodigoNacionalidade() {
        return instancia.isSetCodigoNacionalidade();
    }

    /**
     * Declara que a nacionalidade do cidadão foi inserido.
     * 
     * @param value True caso deseje informar que a nacionalidade foi inserida. Falso caso ela não tenha sido inserida.
     */
    @Override
    public void setCodigoNacionalidadeIsSet(boolean value) {
        instancia.setCodigoNacionalidadeIsSet(value);
    }

    /**
     * Email do cidadão.
     * 
     * @return Email do cidadão.
     */
    @Override
    public String getEmailCidadao() {
        return instancia.getEmailCidadao();
    }

    /**
     * Define o email do cidadão.
     * 
     * Regras: Requerido seguir o padrão endereco@domínio.extensão.
     * Tamanho mínimo: 6
     * Tamanho máximo: 255
     * 
     * @param emailCidadao Email do cidadão.
     */
    @Override
    public void setEmailCidadao(String emailCidadao) {
        instancia.setEmailCidadao(emailCidadao);
    }

    /**
     * Remove o email do cidadão.
     */
    @Override
    public void unsetEmailCidadao() {
        instancia.unsetEmailCidadao();
    }

    /**
     * Verifica se o email do cidadão foi declarado.
     * 
     * @return True caso o email do cidadão tenha sido declarado, False caso o email não tenha sido declarado.
     */
    @Override
    public boolean isSetEmailCidadao() {
        return instancia.isSetEmailCidadao();
    }

    /**
     * Declara se o email do cidadão foi inserido.
     * 
     * @param value True caso deseje informar que o email foi inserido, False caso deseje declarar que o cidadão não possui email.
     */
    @Override
    public void setEmailCidadaoIsSet(boolean value) {
        instancia.setEmailCidadaoIsSet(value);
    }

    /**
     * Número do PIS/PASEP do cidadão.
     * 
     * @return Número do PIS/PASEP do cidadão.
     */
    @Override
    public String getNumeroNisPisPasep() {
        return instancia.getNumeroNisPisPasep();
    }

    /**
     * Define o número do PIS/PASEP do cidadão
     * 
     * Regra: Apenas números.
     * Tamanho: 11 dígitos
     *
     * @param numeroNisPisPasep Número do PIS/PASEP do cidadão.
     */
    @Override
    public void setNumeroNisPisPasep(String numeroNisPisPasep) {
        instancia.setNumeroNisPisPasep(numeroNisPisPasep);
    }

    /**
     * Remove o número do PIS/PASEP do cidadão.
     */
    @Override
    public void unsetNumeroNisPisPasep() {
        instancia.unsetNumeroNisPisPasep();
    }

    /**
     * Verifica se o número do PIS/PASEP do cidadão foi declarado.
     * 
     * @return True caso o número do PIS/PASEP do cidadão tenha sido declarado, False caso o número não tenha sido declarado.
     */
    @Override
    public boolean isSetNumeroNisPisPasep() {
        return instancia.isSetNumeroNisPisPasep();
    }

    /**
     * Declara que o número do PIS/PASEP do cidadão foi inserido.
     * 
     * @param value True caso deseje informar que o número do PIS/PASEP do cidadão foi inserido, False caso não tenha.
     */
    @Override
    public void setNumeroNisPisPasepIsSet(boolean value) {
        instancia.setNumeroNisPisPasepIsSet(value);
    }

    /**
     * Informações sobre o endereço do domicílio
     * 
     * @return Informações sobre o endereço do domicílio
     */
    @Override
    public IEnderecoLocalPermanencia getEndereco() {
        return new EnderecoLocalPermanencia(instancia.getEndereco());
    }

    /**
     * Define as informações sobre o endereço do domicílio.
     * 
     * Regra: Opcional caso conclusaoDestinoElegivel for diferente de 1 (admissão própria emad).
     * 
     * @param endereco Informações sobre o endereço do domicílio.
     */
    @Override
    public void setEndereco(IEnderecoLocalPermanencia endereco) {
        instancia.setEndereco(endereco.getInstance());
    }

    /**
     * Remove as informações sobre o endereço do domicílio.
     */
    @Override
    public void unsetEndereco() {
        instancia.unsetEndereco();
    }

    /**
     * Verifica se as I
     * informações sobre o endereço do domicílio foram declaradas.
     * 
     * @return True caso as informações sobre o endereço do domicílio tenham sido declaradas, False caso não tenham.
     */
    @Override
    public boolean isSetEndereco() {
        return instancia.isSetEndereco();
    }

    /**
     * Declara que as informações sobre o endereço do domicílio foram inseridas.
     * 
     * @param value True caso deseje informar que informações sobre o endereço do domicílio foram inseridas, False caso contrario.
     */
    @Override
    public void setEnderecoIsSet(boolean value) {
        instancia.setEnderecoIsSet(value);
    }

    /**
     * Local de atendimento de origem do cidadão
     * 
     * @return Código do local de atendimento de origem do cidadão.
     */
    @Override
    public long getAtencaoDomiciliarOrigem() {
        return instancia.getAtencaoDomiciliarOrigem();
    }

    /**
     * Define o local de atendimento de origem do cidadão.
     * 
     * Presença obrigatória.
     * 
     * @param atencaoDomiciliarOrigem Código do local de atendimento de origem do cidadão.
     */
    @Override
    public void setAtencaoDomiciliarOrigem(long atencaoDomiciliarOrigem) {
        instancia.setAtencaoDomiciliarOrigem(atencaoDomiciliarOrigem);
    }

    /**
     * Remove o local de atendimento de origem do cidadão
     */
    @Override
    public void unsetAtencaoDomiciliarOrigem() {
        instancia.unsetAtencaoDomiciliarOrigem();
    }

    /**
     * Verifica se o local de atendimento de origem do cidadão foi declarado.
     * 
     * @return True caso o local de atendimento de origem do cidadão tenha sido declarado, False caso não tenha sido declarado.
     */
    @Override
    public boolean isSetAtencaoDomiciliarOrigem() {
        return instancia.isSetAtencaoDomiciliarOrigem();
    }

    /**
     * Declara que o local de atendimento de origem do cidadão foi inserido.
     * 
     * @param value True caso deseje informar que o local de atendimento de origem do cidadão foi inserido, False caso contrario.
     */
    @Override
    public void setAtencaoDomiciliarOrigemIsSet(boolean value) {
        instancia.setAtencaoDomiciliarOrigemIsSet(value);
    }

    /**
     * Opções de modalidade, indica se o cidadão é elegível ou inelegível.
     * 
     * @return Código das opções de modalidade.
     */
    @Override
    public long getAtencaoDomiciliarModalidade() {
        return instancia.getAtencaoDomiciliarModalidade();
    }

    /**
     * Define a modalidade.
     * 
     * Presença obrigatória.
     * 
     * @param atencaoDomiciliarModalidade Código das opções de modalidade, indica se o cidadão é elegível ou inelegível
     */
    @Override
    public void setAtencaoDomiciliarModalidade(long atencaoDomiciliarModalidade) {
        instancia.setAtencaoDomiciliarModalidade(atencaoDomiciliarModalidade);
    }

    /**
     * Remove a modalidade.
     */
    @Override
    public void unsetAtencaoDomiciliarModalidade() {
        instancia.unsetAtencaoDomiciliarModalidade();
    }

    /**
     * Verifica se a modalidade foi declarada.
     * 
     * @return True caso a modalidade tenha sido declarada, False caso não tenha sido declarada.
     */
    @Override
    public boolean isSetAtencaoDomiciliarModalidade() {
        return instancia.isSetAtencaoDomiciliarModalidade();
    }

    /**
     * Declara que a modalidade foi inserida.
     * 
     * @param value True caso deseje declarar a modalidade, False caso contrario.
     */
    @Override
    public void setAtencaoDomiciliarModalidadeIsSet(boolean value) {
        instancia.setAtencaoDomiciliarModalidadeIsSet(value);
    }

    /**
     * Quantidade de situações presentes.
     * 
     * @return Quantidade de situações presentes.
     */
    @Override
    public int getSituacoesPresentesSize() {
        return instancia.getSituacoesPresentesSize();
    }

    /**
     * Situações presentes.
     * @return Marcadores de situações presentes.
     */
    @Override
    public Iterator<Long> getSituacoesPresentesIterator() {
        return instancia.getSituacoesPresentesIterator();
    }

    /**
     * Adiciona uma situação presente a lista de situações presentes.
     * 
     * Máximo: 24
     * 
     * @param elem 
     */
    @Override
    public void addToSituacoesPresentes(long elem) {
        instancia.addToSituacoesPresentes(elem);
    }

    /**
     * Marcadores de situações presentes.
     * @return Lista com marcadores de situações presentes.
     */
    @Override
    public List<Long> getSituacoesPresentes() {
        return instancia.getSituacoesPresentes();
    }

    /**
     * Define um conjunto de marcadores de situações presentes.
     * 
     * Tamanho mínimo: 1
     * Tamanho máximo: 24
     * 
     * @param situacoesPresentes 
     */
    @Override
    public void setSituacoesPresentes(List<Long> situacoesPresentes) {
        instancia.setSituacoesPresentes(situacoesPresentes);
    }

    /**
     * Remove as situações presentes.
     */
    @Override
    public void unsetSituacoesPresentes() {
        instancia.unsetSituacoesPresentes();
    }

    /**
     * Verifica se foi declarada alguma situação presente.
     * @return True Caso situações presentes tenham sido declaradas, False caso contrario.
     */
    @Override
    public boolean isSetSituacoesPresentes() {
        return instancia.isSetSituacoesPresentes();
    }

    /**
     * Declara que situações presentes foram inseridas.
     * @param value True caso deseje informar que a fiha possui situações presentes, False caso contrario.
     */
    @Override
    public void setSituacoesPresentesIsSet(boolean value) {
        instancia.setSituacoesPresentesIsSet(value);
    }

    /**
     * Código do CID10 registrado na avaliação
     * @return Código do CID10 registrado na avaliação
     */
    @Override
    public String getCid10Principal() {
        return instancia.getCid10Principal();
    }

    /**
     * Define o código do CID10 registrado da avaliação.
     * 
     * Regra: Não pode ser igual ao CID10Segundo nem CID10Terceiro.
     * 
     * @param cid10Principal Código do CID10 registrado da avaliação.
     */
    @Override
    public void setCid10Principal(String cid10Principal) {
        instancia.setCid10Principal(cid10Principal);
    }

    /**
     * Remove o código do CID10 principal.
     */
    @Override
    public void unsetCid10Principal() {
        instancia.unsetCid10Principal();
    }

    /**
     * Verifica se o código do CID10 principal foi declarado.
     * 
     * @return True caso o código do CID10 principal tenha sido declarado, False caso contrario.
     */
    @Override
    public boolean isSetCid10Principal() {
        return instancia.isSetCid10Principal();
    }

    /**
     * Declara que o código do CID10 principal foi inserido.
     * 
     * @param value True caso deseje declarar o código do CID10 principal, false caso contrario.
     */
    @Override
    public void setCid10PrincipalIsSet(boolean value) {
        instancia.setCid10PrincipalIsSet(value);
    }

    /**
     * Código do CID10 secundário.
     * 
     * @return Código do CID10 secundário.
     */
    @Override
    public String getCid10Segundo() {
        return instancia.getCid10Segundo();
    }

    /**
     * Define o código do CID10 secundário.
     * 
     * Regra: Não pode ser igual ao CID10Principal nem CID10Terceiro.
     * 
     * @param cid10Segundo Código do CID10 secundário
     */
    @Override
    public void setCid10Segundo(String cid10Segundo) {
        instancia.setCid10Segundo(cid10Segundo);
    }

    /**
     * Remove o código do CID10 secundário.
     */
    @Override
    public void unsetCid10Segundo() {
        instancia.unsetCid10Segundo();
    }

    /**
     * Verifica se o código do CID10 secundário foi declarado.
     * 
     * @return True caso o código do CID10 secundário tenha sido declarado, False caso contrario.
     */
    @Override
    public boolean isSetCid10Segundo() {
        return instancia.isSetCid10Segundo();
    }

    /**
     * Delcara que o código do CID10 secundário foi inserido.
     * 
     * @param value True caso o código do CID10 secundário tenha sido inserido, False caso contrario.
     */
    @Override
    public void setCid10SegundoIsSet(boolean value) {
        instancia.setCid10SegundoIsSet(value);
    }

    /**
     * Código do CID10 terciário.
     * @return código do CID10 terciário.
     */
    @Override
    public String getCid10Terceiro() {
        return instancia.getCid10Terceiro();
    }

    /**
     * Define o código do CID10 terciário.
     * 
     * Regra: Não pode ser igual ao CID10Principal nem CID10Segundo.
     * 
     * @param cid10Terceiro Código do CID10 terciário.
     */
    @Override
    public void setCid10Terceiro(String cid10Terceiro) {
        instancia.setCid10Terceiro(cid10Terceiro);
    }

    /**
     * Remove o código do CID10 terciário.
     */
    @Override
    public void unsetCid10Terceiro() {
        instancia.unsetCid10Terceiro();
    }

    /**
     * Verifica se o código do CID10 terciário foi declarado.
     * 
     * @return True caso o código do CID10 terciário tenha sido declarado, False caso contrario.
     */
    @Override
    public boolean isSetCid10Terceiro() {
        return instancia.isSetCid10Terceiro();
    }

    /**
     * Declara que o código do CID10 terciário foi inserido.
     * 
     * @param value True caso  código do CID10 terciário tenha sido inserido, False caso contrario.
     */
    @Override
    public void setCid10TerceiroIsSet(boolean value) {
        instancia.setCid10TerceiroIsSet(value);
    }

    /**
     * Código da conduta adotada caso cidadão seja Elegível.
     * 
     * @return Código da conduta adotada caso cidadão seja Elegível.
     */
    @Override
    public long getConclusaoDestinoElegivel() {
        return instancia.getConclusaoDestinoElegivel();
    }

    /**
     * Define o código da conduta adotada caso cidadão seja Elegível.
     * 
     * Regra: Só pode ser preenchido se atencaoDomiciliarModalidade for diferente de 4 (inelegível).
     * 
     * @param conclusaoDestinoElegivel Código da conduta adotada caso cidadão seja Elegível.
     */
    @Override
    public void setConclusaoDestinoElegivel(long conclusaoDestinoElegivel) {
        instancia.setConclusaoDestinoElegivel(conclusaoDestinoElegivel);
    }

    /**
     * Remove o código da conduta adotada caso cidadão seja Elegível.
     */
    @Override
    public void unsetConclusaoDestinoElegivel() {
        instancia.unsetConclusaoDestinoElegivel();
    }

    /**
     * Verifica se o código da conduta adotada caso cidadão seja Elegível foi declarado.
     * 
     * @return True caso o código da conduta adotada caso cidadão seja Elegível tenha sido declarado, False caso contrario.
     */
    @Override
    public boolean isSetConclusaoDestinoElegivel() {
        return instancia.isSetConclusaoDestinoElegivel();
    }

    /**
     * Declara que o código da conduta adotada caso cidadão seja Elegível foi inserido.
     * 
     * @param value True caso o código da conduta adotada caso cidadão seja Elegível tenha sido inserido, False caso contrario.
     */
    @Override
    public void setConclusaoDestinoElegivelIsSet(boolean value) {
        instancia.setConclusaoDestinoElegivelIsSet(value);
    }

    /**
     * Quantidade de códigos da conduta adotada caso cidadão seja Inelegível.
     * 
     * @return Código da conduta adotada caso cidadão seja Inelegível.
     */
    @Override
    public int getConclusaoDestinoInelegivelSize() {
        return instancia.getConclusaoDestinoInelegivelSize();
    }

    /**
     * Código da conduta adotada caso cidadão seja Inelegível.
     * 
     * @return Código da conduta adotada caso cidadão seja Inelegível.
     */
    @Override
    public Iterator<Long> getConclusaoDestinoInelegivelIterator() {
        return instancia.getConclusaoDestinoInelegivelIterator();
    }

    /**
     * Adiciona um código da conduta adotada caso cidadão seja Inelegível.
     * 
     * @param elem Código da conduta adotada caso cidadão seja Inelegível.,
     */
    @Override
    public void addToConclusaoDestinoInelegivel(long elem) {
        instancia.addToConclusaoDestinoInelegivel(elem);
    }

    /**
     * Código da conduta adotada caso cidadão seja Inelegível.
     * 
     * @return Código da conduta adotada caso cidadão seja Inelegível.
     */
    @Override
    public List<Long> getConclusaoDestinoInelegivel() {
        return instancia.getConclusaoDestinoInelegivel();
    }

    /**
     * Define Código da conduta adotada caso cidadão seja Inelegível
     * 
     * Regra: Só pode ser preenchido se atencaoDomiciliarModalidade for igual a de 4 (inelegível)
     * máximo: 5
     * 
     * @param conclusaoDestinoInelegivel 
     */
    @Override
    public void setConclusaoDestinoInelegivel(List<Long> conclusaoDestinoInelegivel) {
        instancia.setConclusaoDestinoInelegivel(conclusaoDestinoInelegivel);
    }

    /**
     * remove o código da conduta adotada caso cidadão seja Inelegível
     */
    @Override
    public void unsetConclusaoDestinoInelegivel() {
        instancia.unsetConclusaoDestinoInelegivel();
    }

    /**
     * Verifica se o Código da conduta adotada caso cidadão seja Inelegível foi declarado.
     * 
     * @return True caso o Código da conduta adotada caso cidadão seja Inelegível tenha sido declarado, False caso contrario.
     */
    @Override
    public boolean isSetConclusaoDestinoInelegivel() {
        return instancia.isSetConclusaoDestinoInelegivel();
    }

    /**
     * Declara que o código da conduta adotada caso cidadão seja Inelegível foi inserido.
     * 
     * @param value True caso o código da conduta adotada caso cidadão seja Inelegível tenha sido inserido.
     */
    @Override
    public void setConclusaoDestinoInelegivelIsSet(boolean value) {
        instancia.setConclusaoDestinoInelegivelIsSet(value);
    }

    /**
     * Relação de parentesco do cuidador com o cidadão em atenção domiciliar.
     * 
     * @return Código da relação de parentesco do cuidador com o cidadão em atenção domiciliar.
     */
    @Override
    public long getCuidadorCidadao() {
        return instancia.getCuidadorCidadao();
    }

    /**
     * Define a relação de parentesco do cuidador com o cidadão em atenção domiciliar.
     * 
     * @param cuidadorCidadao Código da relação de parentesco do cuidador com o cidadão em atenção domiciliar.
     */
    @Override
    public void setCuidadorCidadao(long cuidadorCidadao) {
        instancia.setCuidadorCidadao(cuidadorCidadao);
    }

    /**
     * Remove a relação de parentesco do cuidador com o cidadão em atenção domiciliar.
     */
    @Override
    public void unsetCuidadorCidadao() {
        instancia.unsetCuidadorCidadao();
    }

    /**
     * Verifica se a relação de parentesco do cuidador com o cidadão em atenção domiciliar foi declarada.
     * 
     * @return True caso a relação de parentesco do cuidador com o cidadão em atenção domiciliar tenha sido declarada, False caso contrario.
     */
    @Override
    public boolean isSetCuidadorCidadao() {
        return instancia.isSetCuidadorCidadao();
    }

    /**
     * Declara que a relação de parentesco do cuidador com o cidadão em atenção domiciliar foi inserida.
     * @param value True caso a relação de parentesco do cuidador com o cidadão em atenção domiciliar tenha sido inserida, false caso contrario.
     */
    @Override
    public void setCuidadorCidadaoIsSet(boolean value) {
        instancia.setCuidadorCidadaoIsSet(value);
    }

    /**
     * Valida se o conteudo da instancia está consistente.
     * @return True caso as informações sejam validas.
     */
    @Override
    public boolean validate() {
        return validateUuidFicha() && validatetTpCdsOrigem() && 
                validateHeaderTransport() && validateNumeroCartaoSus() && 
                validateNome() && validateNomeSocial() && 
                validaDataNascimentoCidadao() && validateRacaCorCidadao() && 
                validateNomeMae() && validateNacionalidade() && validateEmail() &&
                validateNumeroNisPisPasep() && validateEndereco() && 
                validateAtencaoDomiciliarOrigem() && 
                validateAtencaoDomiciliarModalidade() && 
                validateSituacoesPresentes() && validateCid10Principal() &&
                validateCid10Segundo() && validateCid10Terceiro() && 
                validateConclusaoDestinoElegivel() && validateConclusaoDestinoInelegivel();
    }

    /**
     * Retorna uma copia da instancia thrift.
     * @return Instancia thrift da classe.
     */
    @Override
    public FichaAvaliacaoElegibilidadeThrift getInstance(){
        return instancia;
    }

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * Obrigatório!
     * Regras: É recomendado concatenar o CNES na frente do UUID, de modo que os
     * 7 digitos (CNES) + 1 de hífen somados aos 36 (32 caracteres + 4 hífen) do
     * UUID são a limitação de 44 bytes do campo.
     * @return True caso valido, false caso esteja inconsistente
     */
    @Override
    public boolean validateUuidFicha(){
        return  instancia.getUuidFicha() != null &&
                instancia.getUuidFicha().length() >= 36 && 
                instancia.getUuidFicha().length() <= 44;
    }
    
    /**
     * Valida se o tipo de origem foi declarado.
     * 
     * @return True caso o tipo de origem dos dados tenha sido declarado.
     */
    @Override
    public boolean validatetTpCdsOrigem(){
        return instancia.isSetTpCdsOrigem();
    }
    
    /**
     * Profissional que realizou a visita.
     * 
     * @return True caso o header transport seja valido
     */
    @Override
    public boolean validateHeaderTransport(){
        return instancia.getHeaderTransport() != null && 
                instancia.isSetHeaderTransport() &&
                new UnicaLotacaoHeader(instancia.getHeaderTransport()).validates();

    }
    
    /**
     * CNS do cidadão que participou da atividade.
     * @return True Caso não tenha sido informado e caso tenha sido informado corretamente.
     */
    @Override
    public boolean validateNumeroCartaoSus(){
        if(this.isSetNumeroCartaoSus()){
            
             return CNS.validateCNS(instancia.getNumeroCartaoSus());
        }
        
        return true;
    }
    
    /**
     * Valida o nome do cidadão.
     * 
     * Regras:
     * Ter ao menos duas palavras.
     * Somente texto e apóstrofo (').
     * Opcional caso conclusaoDestinoElegivel for diferente de 1 (admissão própria emad).
     * 
     * Tamanho mínimo: 5
     * Tamanho máximo: 100
     * 
     * @return True caso seja um nome valido ou caso não possua nome e conclusaoDestinoElegivel seja diferente de 1, False caso contrario.
     */
    @Override
    public boolean validateNome(){
        
        if(this.isSetNomeCidadao()){
            return this.getNomeCidadao().length() >= 5 &&
                    this.getNomeCidadao().length() <= 100;
        }else {
            return this.getConclusaoDestinoElegivel() != 1;
        }    
    }
    
    /**
     * Valida o nome social do cidadão.
     * 
     * Regras:
     * Somente texto e apóstrofo (').
     * 
     * Tamanho mínimo: 0
     * Tamanho máximo: 100
     * 
     * @return True caso seja um nome valido ou caso não possua nome e conclusaoDestinoElegivel seja diferente de 1, False caso contrario.
     */
    @Override
    public boolean validateNomeSocial(){
        
        if(this.isSetNomeSocialCidadao()){
            return this.getNomeSocialCidadao().length() >= 0 &&
                    this.getNomeSocialCidadao().length() <= 100;
        }else {
            return true;
        }
    }
    
    /**
     * Valida Data de nascimento do cidadão no formato epoch time.
     * @return Data de nascimento do cidadão no formato epoch time.
     * Valida se o campo é null
     * Valida: Não pode ser posterior a dataAtendimento e anterior a 130 anos a partir da dataAtendimento.
     * Não pode ser posterior a dataAtendimento e anterior a 130 anos a partir da dataAtendimento.
     */
    @Override
    public boolean validaDataNascimentoCidadao(){
        
        if(!instancia.isSetDataNascimentoCidadao()) return false;
        
        long dataNascimento = instancia.getDataNascimentoCidadao();
        long dataAtendimento = instancia.getHeaderTransport().getDataAtendimento();
        if(dataNascimento > dataAtendimento) return false;
        long idadeAoAtender = dataNascimento - dataAtendimento;
        /**
         * Transformando 1 ano em segundo
         */
        long anoEpoch = 60*60*24*365;
        /**
         * Descobrindo se a idade do cidadão no atendimento é maior que 130 anos
         */
        if(idadeAoAtender > anoEpoch*130) return false;
        return true;   
    } 
    
    /**
     * Valida a raça/cor do cidadão.
     * 
     * regra: Opcional caso conclusaoDestinoElegivel for diferente de 1 (admissão própria emad)
     * 
     * @return True caso esteje presente ou caso conclusaoDestinoElegivel for diferente de 1, False caso contrario.
     */
    @Override
    public boolean validateRacaCorCidadao(){
        if(instancia.isSetRacaCorCidadao()){
            return true;
        }else{
            return instancia.getConclusaoDestinoElegivel() != 1;
        }
    }
    
        /**
     * Valida o nome da mãe do cidadão.
     * 
     * Regras:
     * Ter ao menos duas palavras.
     * Somente texto e apóstrofo (').
     * Não pode ser preenchido se o campo desconheceNomeMae = true.
     * 
     * Tamanho mínimo: 5
     * Tamanho máximo: 100
     * 
     * @return True caso seja um nome valido ou caso não possua nome e conclusaoDestinoElegivel seja diferente de 1, False caso contrario.
     */
    @Override
    public boolean validateNomeMae(){
        
        if(this.isSetNomeMaeCidadao() && ! instancia.isDesconheceNomeMae()){
            
                return this.getNomeCidadao().length() >= 5 &&
                    this.getNomeCidadao().length() <= 100;
            
        }else{
            return instancia.isDesconheceNomeMae();
        } 

    }
    
    /**
     * Valida a nacionalidade do cidadão.
     * 
     * Regra: Opcional caso conclusaoDestinoElegivel for diferente de 1 (admissão própria emad)
     * 
     * @return True caso esteja presente ou caso conclusaoDestinoElegivel for diferente de 1, False caso contrario.
     */
    @Override
    public boolean validateNacionalidade(){
        
        if(instancia.isSetCodigoNacionalidade()){
            return true;
        }else{
            return instancia.getConclusaoDestinoElegivel() != 1;
        }
    }
    
    /**
     * Valida o email do cidadão.
     * 
     * regra: Requerido seguir o padrão endereco@domínio.extensão.
     * 
     * Tamanho mínimo:6
     * Tamanho máximo:255
     * 
     * @return True caso esteja de acordo com a regra ou caso não tenha sido declarado, False caso contrario.
     */
    @Override
    public boolean validateEmail(){

        
        if(instancia.isSetEmailCidadao()){
            if(instancia.getEmailCidadao().length() >=6 && 
                    instancia.getEmailCidadao().length() <= 255){
                
                Pattern VALID_EMAIL_ADDRESS_REGEX = 
                Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
                
                Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(instancia.getEmailCidadao());
                return matcher.find();
            }else{
                return false;
            }
        }
        
        return true; 
    }
    
    /**
     * Valida o número do PIS/PASEP do cidadão.
     * 
     * Regras: Apenas números.
     * 
     * Tamanho: 11
     * 
     * @return True caso seja valido ou caso não seja declarado, False caso contrario.
     */
    @Override
    public boolean validateNumeroNisPisPasep(){
        
        if(instancia.isSetNumeroNisPisPasep()){
            if(instancia.getNumeroNisPisPasep().matches("[0-9]+") && 
                    instancia.getNumeroNisPisPasep().length() == 11){
                
                return true;
                
            }else{
                
                return false;
                
            }
        }
        
        return true;
    }
    
    /**
     * Valida as informações sobre o endereço do domicílio.
     * 
     * Regra: Opcional caso conclusaoDestinoElegivel for diferente de 1 (admissão própria emad)
     * 
     * @return True caso seja valido ou caso conclusaoDestinoElegivel for diferente de 1, False caso contrario.
     */
    @Override
    public boolean validateEndereco(){
        
        if(instancia.isSetEndereco()){
            
            return new EnderecoLocalPermanencia(instancia.getEndereco()).validates();

        }else{
            return instancia.getConclusaoDestinoElegivel() != 1;
        }
        
    }
    
    /**
     * Valida o local de atendimento de origem do cidadão.
     * 
     * @return True caso esteja presente, falso caso contrario.
     */
    @Override
    public boolean validateAtencaoDomiciliarOrigem(){
        
        return instancia.isSetAtencaoDomiciliarOrigem();
    }
    
    /**
     * Valida as opções de modalidade, indica se o cidadão é elegível ou inelegível.
     * 
     * @return True caso esteja presente, falso caso contrario.
     */
    @Override
    public boolean validateAtencaoDomiciliarModalidade(){
        
        return instancia.isSetAtencaoDomiciliarModalidade();
    }
    
    /**
     * Valida os marcadores de situações presentes.
     * 
     * Mínimo: 1
     * Máximo: 24
     * 
     * @return True caso atendam as regras ou caso não seja declarado, False caso contrario.
     */
    @Override
    public boolean validateSituacoesPresentes(){
        
        if(instancia.isSetSituacoesPresentes()){
            
            return instancia.getSituacoesPresentesSize() >= 1 &&
                    instancia.getSituacoesPresentesSize() <= 24;
        }
        
        return true;   
    }
    
    /**
     * Valida o código do CID10 principal registrado na avaliação.
     * 
     * Regra: Não pode ser igual ao CID10Segundo nem CID10Terceiro.
     * 
     * @return True caso esteja de acordo com as regras, False caso contrario.
     */
    @Override
    public boolean validateCid10Principal(){
        
        if(instancia.isSetCid10Principal()){
            return ( ! instancia.getCid10Principal().equalsIgnoreCase(instancia.getCid10Segundo()) &&
                    ! instancia.getCid10Principal().equalsIgnoreCase(instancia.getCid10Terceiro()));
        }
        
        return false;
    }
    
    /**
     * Valida o código do CID10 registrado na avaliação.
     * 
     * Regras: Não pode ser igual ao CID10Principal nem CID10Terceiro.
     * 
     * @return True caso esteja de acordo com a regra ou não seja declarado, False caso contrario.
     */
    @Override
    public boolean validateCid10Segundo(){
        
        if(instancia.isSetCid10Segundo()){
            return ( ! instancia.getCid10Segundo().equalsIgnoreCase(instancia.getCid10Principal()) &&
                    ! instancia.getCid10Segundo().equalsIgnoreCase(instancia.getCid10Terceiro()));
        }
        
        return true;
    }
    
        /**
     * Valida o código do CID10 registrado na avaliação.
     * 
     * Regras: Não pode ser igual ao CID10Principal nem CID10Segundo.
     * 
     * @return True caso esteja de acordo com a regra ou não seja declarado, False caso contrario.
     */
    @Override
    public boolean validateCid10Terceiro(){
        
        if(instancia.isSetCid10Segundo()){
            return ( ! instancia.getCid10Terceiro().equalsIgnoreCase(instancia.getCid10Principal()) &&
                    ! instancia.getCid10Terceiro().equalsIgnoreCase(instancia.getCid10Segundo()));
        }
        
        return true;
    }
    
    /**
     * Valida conduta adotada caso cidadão seja Elegível.
     * 
     * Regra: Só pode ser preenchido se atencaoDomiciliarModalidade for diferente de 4 (inelegível).
     * Regra: só pode ser existir se conclusaoDestinoInelegivel não existir.
     * 
     * @return True caso atenda as regras, False caso contrario.
     */
    @Override
    public boolean validateConclusaoDestinoElegivel(){
        
        if(instancia.isSetConclusaoDestinoElegivel()){
            return !(instancia.getAtencaoDomiciliarModalidade() == 4 && instancia.isSetConclusaoDestinoInelegivel());
        }
        
        return instancia.isSetConclusaoDestinoInelegivel();
    }
    
    /**
     * Valida conduta adotada caso cidadão seja Inelegível.
     * 
     * Regra: Só pode ser preenchido se atencaoDomiciliarModalidade for igual a de 4 (inelegível).
     * Regra: só pode ser existir se conclusaoDestinoElegivel não existir.
     * 
     * Máximo: 5
     * 
     * @return True caso atenda as regras, False caso contrario.
     */
    @Override
    public boolean validateConclusaoDestinoInelegivel(){
        
        if(instancia.isSetConclusaoDestinoInelegivel()){
            if( ! instancia.isSetConclusaoDestinoElegivel() && instancia.getConclusaoDestinoInelegivelSize() < 5){
                   
                return instancia.getAtencaoDomiciliarModalidade() == 4 ;
                           
             }
                    
        }
        
        return instancia.isSetConclusaoDestinoElegivel();
    }
    
    /**
     * necessário para gerar o zip
     * @param dadoTransporteThrift 
     */
    public void setDadoTransporte(DadoTransporte dadoTransporteThrift){
        this.dadoTransporteThrift = dadoTransporteThrift;
    }
    public DadoTransporte getDadoTransporte(){
        return this.dadoTransporteThrift;
    }

    public void zipGenerate(){
        if(!this.validate() && this.dadoTransporteThrift != null){
            return;
        }

        byte[] fichaSerializada = SerializadorThrift.serializar(this.instancia);
        dadoTransporteThrift.setTipoDadoSerializado(TIPO_DADO_SERIALIZADO_FICHA_PROCEDIMENTO);
        dadoTransporteThrift.setDadoSerializado(fichaSerializada);

        try {
            File zipFile = new File(System.getProperty("user.home") + "/fichaAvaliacaoElegibilidade.zip");
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

