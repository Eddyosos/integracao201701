/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.Eddyosos.integracao20171.esus.cds.avaliacaoelegibilidade;

import br.gov.saude.esus.cds.transport.generated.thrift.avaliacaoelegibilidade.FichaAvaliacaoElegibilidadeThrift;
import com.github.eddyosos.e_sus_ab_factory.cds.common.IEnderecoLocalPermanencia;
import com.github.eddyosos.e_sus_ab_factory.cds.common.IUnicaLotacaoHeader;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author eddyosos
 */
public interface IFichaAvaliacaoElegibilidade {

    /**
     * Adiciona um código da conduta adotada caso cidadão seja Inelegível.
     *
     * @param elem Código da conduta adotada caso cidadão seja Inelegível.,
     */
    void addToConclusaoDestinoInelegivel(long elem);

    /**
     * Adiciona uma situação presente a lista de situações presentes.
     *
     * Máximo: 24
     *
     * @param elem
     */
    void addToSituacoesPresentes(long elem);

    /**
     * Remove todos os dados da ficha.
     */
    void clear();

    /**
     * Opções de modalidade, indica se o cidadão é elegível ou inelegível.
     *
     * @return Código das opções de modalidade.
     */
    long getAtencaoDomiciliarModalidade();

    /**
     * Local de atendimento de origem do cidadão
     *
     * @return Código do local de atendimento de origem do cidadão.
     */
    long getAtencaoDomiciliarOrigem();

    /**
     * Código do CID10 registrado na avaliação
     * @return Código do CID10 registrado na avaliação
     */
    String getCid10Principal();

    /**
     * Código do CID10 secundário.
     *
     * @return Código do CID10 secundário.
     */
    String getCid10Segundo();

    /**
     * Código do CID10 terciário.
     * @return código do CID10 terciário.
     */
    String getCid10Terceiro();

    /**
     * Município de nascimento do cidadão..
     *
     * @return Código IBGE do município
     */
    String getCodigoIbgeMunicipioNascimento();

    /**
     * Indica se o cidadão é brasileiro, naturalizado ou estrangeiro.
     *
     * @return Código do marcador que indica se o cidadão é brasileiro, naturalizado ou estrangeiro.
     */
    long getCodigoNacionalidade();

    /**
     * Código da conduta adotada caso cidadão seja Elegível.
     *
     * @return Código da conduta adotada caso cidadão seja Elegível.
     */
    long getConclusaoDestinoElegivel();

    /**
     * Código da conduta adotada caso cidadão seja Inelegível.
     *
     * @return Código da conduta adotada caso cidadão seja Inelegível.
     */
    List<Long> getConclusaoDestinoInelegivel();

    /**
     * Código da conduta adotada caso cidadão seja Inelegível.
     *
     * @return Código da conduta adotada caso cidadão seja Inelegível.
     */
    Iterator<Long> getConclusaoDestinoInelegivelIterator();

    /**
     * Quantidade de códigos da conduta adotada caso cidadão seja Inelegível.
     *
     * @return Código da conduta adotada caso cidadão seja Inelegível.
     */
    int getConclusaoDestinoInelegivelSize();

    /**
     * Relação de parentesco do cuidador com o cidadão em atenção domiciliar.
     *
     * @return Código da relação de parentesco do cuidador com o cidadão em atenção domiciliar.
     */
    long getCuidadorCidadao();

    /**
     * Data de nascimento do cidadão.
     *
     * Presença obrigatória.
     * Regras: Não pode ser posterior a dataAtendimento e anterior a 130 anos a partir da dataAtendimento.
     *
     * @return Data de nascimento do cidadão no formato epoch time.
     */
    long getDataNascimentoCidadao();

    /**
     * Email do cidadão.
     *
     * @return Email do cidadão.
     */
    String getEmailCidadao();

    /**
     * Informações sobre o endereço do domicílio
     *
     * @return Informações sobre o endereço do domicílio
     */
    IEnderecoLocalPermanencia getEndereco();

    /**
     * Profissional que realizou a visita.
     * @return Profissional que realizou a visita.
     */
    IUnicaLotacaoHeader getHeaderTransport();

    /**
     * Retorna uma copia da instancia thrift.
     * @return Instancia thrift da classe.
     */
    FichaAvaliacaoElegibilidadeThrift getInstance();

    /**
     * Nome do cidadão.
     * @return Nome do cidadão
     */
    String getNomeCidadao();

    /**
     * Nome da mãe do cidadão.
     *
     * @return Nome da mãe do cidadão.
     */
    String getNomeMaeCidadao();

    /**
     * Nome social do cidadão.
     * @return Nome social do cidadão.
     */
    String getNomeSocialCidadao();

    /**
     * CNS do cidadão.
     * @return CNS do cidadão.
     */
    String getNumeroCartaoSus();

    /**
     * Número do PIS/PASEP do cidadão.
     *
     * @return Número do PIS/PASEP do cidadão.
     */
    String getNumeroNisPisPasep();

    /**
     * Raça / cor do cidadão.
     *
     * @return Código da raça / cor do cidadão.
     */
    long getRacaCorCidadao();

    /**
     * sexo do cidadão.
     * @return Código do sexo do cidadão.
     */
    long getSexoCidadao();

    /**
     * Marcadores de situações presentes.
     * @return Lista com marcadores de situações presentes.
     */
    List<Long> getSituacoesPresentes();

    /**
     * Situações presentes.
     * @return Marcadores de situações presentes.
     */
    Iterator<Long> getSituacoesPresentesIterator();

    /**
     * Quantidade de situações presentes.
     *
     * @return Quantidade de situações presentes.
     */
    int getSituacoesPresentesSize();

    /**
     * Tipo de origem dos dados do registro.
     * @return Tipo de origem dos dados do registro.
     */
    int getTpCdsOrigem();

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
    String getUuidFicha();

    /**
     * Verifica se o cidadão conhece o nome da mãe.
     *
     * @return True caso o cidadão não conheça o nome da mãe.
     */
    boolean isDesconheceNomeMae();

    /**
     * Verifica se a modalidade foi declarada.
     *
     * @return True caso a modalidade tenha sido declarada, False caso não tenha sido declarada.
     */
    boolean isSetAtencaoDomiciliarModalidade();

    /**
     * Verifica se o local de atendimento de origem do cidadão foi declarado.
     *
     * @return True caso o local de atendimento de origem do cidadão tenha sido declarado, False caso não tenha sido declarado.
     */
    boolean isSetAtencaoDomiciliarOrigem();

    /**
     * Verifica se o código do CID10 principal foi declarado.
     *
     * @return True caso o código do CID10 principal tenha sido declarado, False caso contrario.
     */
    boolean isSetCid10Principal();

    /**
     * Verifica se o código do CID10 secundário foi declarado.
     *
     * @return True caso o código do CID10 secundário tenha sido declarado, False caso contrario.
     */
    boolean isSetCid10Segundo();

    /**
     * Verifica se o código do CID10 terciário foi declarado.
     *
     * @return True caso o código do CID10 terciário tenha sido declarado, False caso contrario.
     */
    boolean isSetCid10Terceiro();

    /**
     * Verifica se o município de nascimento do cidadão foi declarado.
     *
     * @return True Caso o município tenha sido inserido
     * @return False caso o município não tenha sido inserido.
     */
    boolean isSetCodigoIbgeMunicipioNascimento();

    /**
     * Verifica se o código de nacionalidade foi declarado.
     *
     * @return True Caso o cidadão possua um código de nacionalidade ou False caso o código de nacionalidade não tenha sido informado.
     */
    boolean isSetCodigoNacionalidade();

    /**
     * Verifica se o código da conduta adotada caso cidadão seja Elegível foi declarado.
     *
     * @return True caso o código da conduta adotada caso cidadão seja Elegível tenha sido declarado, False caso contrario.
     */
    boolean isSetConclusaoDestinoElegivel();

    /**
     * Verifica se o Código da conduta adotada caso cidadão seja Inelegível foi declarado.
     *
     * @return True caso o Código da conduta adotada caso cidadão seja Inelegível tenha sido declarado, False caso contrario.
     */
    boolean isSetConclusaoDestinoInelegivel();

    /**
     * Verifica se a relação de parentesco do cuidador com o cidadão em atenção domiciliar foi declarada.
     *
     * @return True caso a relação de parentesco do cuidador com o cidadão em atenção domiciliar tenha sido declarada, False caso contrario.
     */
    boolean isSetCuidadorCidadao();

    /**
     * Verifica se a data de nascimento do cidadão foi declarada.
     * @return True caso a data de nascimento do cidadão tenha sido inserida.
     */
    boolean isSetDataNascimentoCidadao();

    /**
     * Verifica se o cidadão informou desconhecer o nome da mãe.
     *
     * @return True caso desconhecer o nome da mãe tenha sido declarado.
     */
    boolean isSetDesconheceNomeMae();

    /**
     * Verifica se o email do cidadão foi declarado.
     *
     * @return True caso o email do cidadão tenha sido declarado, False caso o email não tenha sido declarado.
     */
    boolean isSetEmailCidadao();

    /**
     * Verifica se as I
     * informações sobre o endereço do domicílio foram declaradas.
     *
     * @return True caso as informações sobre o endereço do domicílio tenham sido declaradas, False caso não tenham.
     */
    boolean isSetEndereco();

    /**
     * Verifica se o profissional que realizou a visita foi declarado.
     * @return True caso o profissional que realizou a visita tenha sido inserido.
     */
    boolean isSetHeaderTransport();

    /**
     * Verifica se o nome do cidadão foi declarado.
     * @return True caso o nome do cidadão tenha sido inserido.
     */
    boolean isSetNomeCidadao();

    /**
     * Verifica se o nome da mãe do cidadão foi declarado.
     *
     * @return True caso o nome da mãe do cidadão tenha sido declarado.
     */
    boolean isSetNomeMaeCidadao();

    /**
     * Verifica se o nome social do cidadão foi declarado.
     * @return
     */
    boolean isSetNomeSocialCidadao();

    /**
     * Verifica se o CNS do cidadão foi declarado.
     * @return True caso o CNS do cidadão tenhe sido inserido.
     */
    boolean isSetNumeroCartaoSus();

    /**
     * Verifica se o número do PIS/PASEP do cidadão foi declarado.
     *
     * @return True caso o número do PIS/PASEP do cidadão tenha sido declarado, False caso o número não tenha sido declarado.
     */
    boolean isSetNumeroNisPisPasep();

    /**
     *  Verifica se a raça / cor do cidadão foi declarada.
     * @return True Caso a raça / cor do cidadão tenha sido inserida.
     */
    boolean isSetRacaCorCidadao();

    /**
     * Verifica se o sexo foi definido.
     * @return True caso o sexo tenha sido definido.
     */
    boolean isSetSexoCidadao();

    /**
     * Verifica se foi declarada alguma situação presente.
     * @return True Caso situações presentes tenham sido declaradas, False caso contrario.
     */
    boolean isSetSituacoesPresentes();

    /**
     * Verifica se o tipo de origem dos dados do registro foi declarado.
     * @return True caso o tipo de origem dos dados do registro tenha sido inserido.
     */
    boolean isSetTpCdsOrigem();

    /**
     * Verifica se o código uuid da ficha foi declarado.
     * @return True caso o código uuid da ficha tenha sido declarado.
     */
    boolean isSetUuidFicha();

    /**
     * Define a modalidade.
     *
     * Presença obrigatória.
     *
     * @param atencaoDomiciliarModalidade Código das opções de modalidade, indica se o cidadão é elegível ou inelegível
     */
    void setAtencaoDomiciliarModalidade(long atencaoDomiciliarModalidade);

    /**
     * Declara que a modalidade foi inserida.
     *
     * @param value True caso deseje declarar a modalidade, False caso contrario.
     */
    void setAtencaoDomiciliarModalidadeIsSet(boolean value);

    /**
     * Define o local de atendimento de origem do cidadão.
     *
     * Presença obrigatória.
     *
     * @param atencaoDomiciliarOrigem Código do local de atendimento de origem do cidadão.
     */
    void setAtencaoDomiciliarOrigem(long atencaoDomiciliarOrigem);

    /**
     * Declara que o local de atendimento de origem do cidadão foi inserido.
     *
     * @param value True caso deseje informar que o local de atendimento de origem do cidadão foi inserido, False caso contrario.
     */
    void setAtencaoDomiciliarOrigemIsSet(boolean value);

    /**
     * Define o código do CID10 registrado da avaliação.
     *
     * Regra: Não pode ser igual ao CID10Segundo nem CID10Terceiro.
     *
     * @param cid10Principal Código do CID10 registrado da avaliação.
     */
    void setCid10Principal(String cid10Principal);

    /**
     * Declara que o código do CID10 principal foi inserido.
     *
     * @param value True caso deseje declarar o código do CID10 principal, false caso contrario.
     */
    void setCid10PrincipalIsSet(boolean value);

    /**
     * Define o código do CID10 secundário.
     *
     * Regra: Não pode ser igual ao CID10Principal nem CID10Terceiro.
     *
     * @param cid10Segundo Código do CID10 secundário
     */
    void setCid10Segundo(String cid10Segundo);

    /**
     * Delcara que o código do CID10 secundário foi inserido.
     *
     * @param value True caso o código do CID10 secundário tenha sido inserido, False caso contrario.
     */
    void setCid10SegundoIsSet(boolean value);

    /**
     * Define o código do CID10 terciário.
     *
     * Regra: Não pode ser igual ao CID10Principal nem CID10Segundo.
     *
     * @param cid10Terceiro Código do CID10 terciário.
     */
    void setCid10Terceiro(String cid10Terceiro);

    /**
     * Declara que o código do CID10 terciário foi inserido.
     *
     * @param value True caso  código do CID10 terciário tenha sido inserido, False caso contrario.
     */
    void setCid10TerceiroIsSet(boolean value);

    /**
     * Define o município de nascimento do cidadão
     *
     * Regras: Não pode ser preenchido se codigoNacionalidade for diferente de 1 (brasileiro).
     *
     * @param codigoIbgeMunicipioNascimento Código IBGE do município.
     */
    void setCodigoIbgeMunicipioNascimento(String codigoIbgeMunicipioNascimento);

    /**
     * Declara se o município de nascimento foi inserido.
     *
     * @param value True caso deseje informar que o município foi inserido.
     */
    void setCodigoIbgeMunicipioNascimentoIsSet(boolean value);

    /**
     * Define se o cidadão é brasileiro, naturalizado ou estrangeiro.
     *
     * Regra: Opcional caso conclusaoDestinoElegivel for diferente de 1 (admissão própria emad).
     *
     * @param codigoNacionalidade Código do marcador que indica se o cidadão é brasileiro, naturalizado ou estrangeiro.
     */
    void setCodigoNacionalidade(long codigoNacionalidade);

    /**
     * Declara que a nacionalidade do cidadão foi inserido.
     *
     * @param value True caso deseje informar que a nacionalidade foi inserida. Falso caso ela não tenha sido inserida.
     */
    void setCodigoNacionalidadeIsSet(boolean value);

    /**
     * Define o código da conduta adotada caso cidadão seja Elegível.
     *
     * Regra: Só pode ser preenchido se atencaoDomiciliarModalidade for diferente de 4 (inelegível).
     *
     * @param conclusaoDestinoElegivel Código da conduta adotada caso cidadão seja Elegível.
     */
    void setConclusaoDestinoElegivel(long conclusaoDestinoElegivel);

    /**
     * Declara que o código da conduta adotada caso cidadão seja Elegível foi inserido.
     *
     * @param value True caso o código da conduta adotada caso cidadão seja Elegível tenha sido inserido, False caso contrario.
     */
    void setConclusaoDestinoElegivelIsSet(boolean value);

    /**
     * Define Código da conduta adotada caso cidadão seja Inelegível
     *
     * Regra: Só pode ser preenchido se atencaoDomiciliarModalidade for igual a de 4 (inelegível)
     * máximo: 5
     *
     * @param conclusaoDestinoInelegivel
     */
    void setConclusaoDestinoInelegivel(List<Long> conclusaoDestinoInelegivel);

    /**
     * Declara que o código da conduta adotada caso cidadão seja Inelegível foi inserido.
     *
     * @param value True caso o código da conduta adotada caso cidadão seja Inelegível tenha sido inserido.
     */
    void setConclusaoDestinoInelegivelIsSet(boolean value);

    /**
     * Define a relação de parentesco do cuidador com o cidadão em atenção domiciliar.
     *
     * @param cuidadorCidadao Código da relação de parentesco do cuidador com o cidadão em atenção domiciliar.
     */
    void setCuidadorCidadao(long cuidadorCidadao);

    /**
     * Declara que a relação de parentesco do cuidador com o cidadão em atenção domiciliar foi inserida.
     * @param value True caso a relação de parentesco do cuidador com o cidadão em atenção domiciliar tenha sido inserida, false caso contrario.
     */
    void setCuidadorCidadaoIsSet(boolean value);

    /**
     * Define a data de nascimento do cidadão.
     * @param dataNascimentoCidadao Data de nascimento do cidadão
     */
    void setDataNascimentoCidadao(long dataNascimentoCidadao);

    /**
     * Define se a data de nascimento do cidadão foi inserida.
     * @param value True caso a data de nascimento do cidadão tenha sido inserida
     */
    void setDataNascimentoCidadaoIsSet(boolean value);

    /**
     * Define se o cidadão não conhece sua mãe.
     *
     * @param desconheceNomeMae True caso o cidadão não conheça o nome de sua mãe.
     */
    void setDesconheceNomeMae(boolean desconheceNomeMae);

    /**
     * Declara se o campo desconhece nome da mãe foi inserido.
     * @param value True Caso desconhece nome da mãe tenha sido inserido.
     */
    void setDesconheceNomeMaeIsSet(boolean value);

    /**
     * Define o email do cidadão.
     *
     * Regras: Requerido seguir o padrão endereco@domínio.extensão.
     * Tamanho mínimo: 6
     * Tamanho máximo: 255
     *
     * @param emailCidadao Email do cidadão.
     */
    void setEmailCidadao(String emailCidadao);

    /**
     * Declara se o email do cidadão foi inserido.
     *
     * @param value True caso deseje informar que o email foi inserido, False caso deseje declarar que o cidadão não possui email.
     */
    void setEmailCidadaoIsSet(boolean value);

    /**
     * Define as informações sobre o endereço do domicílio.
     *
     * Regra: Opcional caso conclusaoDestinoElegivel for diferente de 1 (admissão própria emad).
     *
     * @param endereco Informações sobre o endereço do domicílio.
     */
    void setEndereco(IEnderecoLocalPermanencia endereco);

    /**
     * Declara que as informações sobre o endereço do domicílio foram inseridas.
     *
     * @param value True caso deseje informar que informações sobre o endereço do domicílio foram inseridas, False caso contrario.
     */
    void setEnderecoIsSet(boolean value);

    /**
     * Define o profissional que realizou a visita.
     *
     * Presenca obrigatória.
     *
     * @param headerTransport Profissional que realizou a visita.
     */
    void setHeaderTransport(IUnicaLotacaoHeader headerTransport);

    /**
     * Define se o profissional que realizou a visita doi inserido.
     * @param value True caso profissional que realizou a visita tenha sido inserido.
     */
    void setHeaderTransportIsSet(boolean value);

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
    void setNomeCidadao(String nomeCidadao);

    /**
     * Declase se o nome do cidadão foi inserido.
     * @param value True caso o nome do cidadão tenha sido inserido.
     */
    void setNomeCidadaoIsSet(boolean value);

    /**
     * Define o Nome da mãe do cidadão.
     *
     * Regra: Ter ao menos duas palavras.
     * Regra: Somente texto e apóstrofo (').
     * Regra: Não pode ser preenchido se o campo desconheceNomeMae = true.
     *
     * @param nomeMaeCidadao Nome da mãe do cidadão.
     */
    void setNomeMaeCidadao(String nomeMaeCidadao);

    /**
     * Declara se o nome da mãe do cidadão foi inserido.
     *
     * @param value True caso o nome da mãe tenha sido inserido.
     */
    void setNomeMaeCidadaoIsSet(boolean value);

    /**
     * Define o nome social do cidadão.
     *
     * Regra: Somente texto e apóstrofo (').
     * Tamanho minimo: 0
     * Tamanho máximo: 100
     *
     * @param nomeSocialCidadao Nome social do cidadão.
     */
    void setNomeSocialCidadao(String nomeSocialCidadao);

    /**
     * Declara se o cidadão possui um nome social.
     * @param value True caso o cidadão possua um nome social.
     */
    void setNomeSocialCidadaoIsSet(boolean value);

    /**
     * CNS do cidadão.
     *
     * Presenca obrigatória.
     * Regras: CNS válido de acordo com o algoritmo.
     * Tamanho: 15 digitos.
     *
     * @param numeroCartaoSus
     */
    void setNumeroCartaoSus(String numeroCartaoSus);

    /**
     * Declara se o CNS do cidadão foi inserido.
     * @param value True caso o CNS do cidadão dtenha sido inserido.
     */
    void setNumeroCartaoSusIsSet(boolean value);

    /**
     * Define o número do PIS/PASEP do cidadão
     *
     * Regra: Apenas números.
     * Tamanho: 11 dígitos
     *
     * @param numeroNisPisPasep Número do PIS/PASEP do cidadão.
     */
    void setNumeroNisPisPasep(String numeroNisPisPasep);

    /**
     * Declara que o número do PIS/PASEP do cidadão foi inserido.
     *
     * @param value True caso deseje informar que o número do PIS/PASEP do cidadão foi inserido, False caso não tenha.
     */
    void setNumeroNisPisPasepIsSet(boolean value);

    /**
     * Raça / cor do cidadão.
     *
     * Regra: Opcional caso conclusaoDestinoElegivel for diferente de 1 (admissão própria emad).
     *
     * @param racaCorCidadao Código da raça / cor do cidadão.
     */
    void setRacaCorCidadao(long racaCorCidadao);

    /**
     * Declara se a raça / cor do cidadão foi inserida
     *
     * @param value True caso a raça / cor do cidadão tenha sido inserido.
     */
    void setRacaCorCidadaoIsSet(boolean value);

    /**
     * Define o sexo do cidadão.
     *
     * Presença obrigatória.
     *
     * @param sexoCidadao Código do sexo do cidadão.
     */
    void setSexoCidadao(long sexoCidadao);

    /**
     * Retorna se o sexo do cidadão foi definido.
     * @param value True caso o sexo tenha sido definido.
     */
    void setSexoCidadaoIsSet(boolean value);

    /**
     * Define um conjunto de marcadores de situações presentes.
     *
     * Tamanho mínimo: 1
     * Tamanho máximo: 24
     *
     * @param situacoesPresentes
     */
    void setSituacoesPresentes(List<Long> situacoesPresentes);

    /**
     * Declara que situações presentes foram inseridas.
     * @param value True caso deseje informar que a fiha possui situações presentes, False caso contrario.
     */
    void setSituacoesPresentesIsSet(boolean value);

    /**
     * Define o tipo de origem dos dados do registro.
     *
     * Presenca obrigatória.
     * Observação: Utilizar valor 3 (sistemas terceiros).
     *
     * @param tpCdsOrigem Tipo de origem dos dados do registro.
     */
    void setTpCdsOrigem(int tpCdsOrigem);

    /**
     * Declara se o tipo de origem dos dados do registro foi inserido.
     * @param value True caso o tipo de origem dos dados do registro tenha sido inserido.
     */
    void setTpCdsOrigemIsSet(boolean value);

    /**
     * Define o código uuid da ficha.
     * @param uuidFicha Código uuid da ficha.
     */
    void setUuidFicha(String uuidFicha);

    /**
     * Declara o estado do código uuid da ficha.
     * @param value True caso o código uuid da ficha tenha sido inserido.
     */
    void setUuidFichaIsSet(boolean value);

    /**
     * Remove a modalidade.
     */
    void unsetAtencaoDomiciliarModalidade();

    /**
     * Remove o local de atendimento de origem do cidadão
     */
    void unsetAtencaoDomiciliarOrigem();

    /**
     * Remove o código do CID10 principal.
     */
    void unsetCid10Principal();

    /**
     * Remove o código do CID10 secundário.
     */
    void unsetCid10Segundo();

    /**
     * Remove o código do CID10 terciário.
     */
    void unsetCid10Terceiro();

    /**
     * Remove o município de nascimento do cidadão.
     */
    void unsetCodigoIbgeMunicipioNascimento();

    /**
     * Remove a nacionalidade do cidadão.
     */
    void unsetCodigoNacionalidade();

    /**
     * Remove o código da conduta adotada caso cidadão seja Elegível.
     */
    void unsetConclusaoDestinoElegivel();

    /**
     * remove o código da conduta adotada caso cidadão seja Inelegível
     */
    void unsetConclusaoDestinoInelegivel();

    /**
     * Remove a relação de parentesco do cuidador com o cidadão em atenção domiciliar.
     */
    void unsetCuidadorCidadao();

    /**
     * Remove a data de nascimento do cidadão,
     */
    void unsetDataNascimentoCidadao();

    /**
     * Remove o estado de nome da mãe desconhecido.
     */
    void unsetDesconheceNomeMae();

    /**
     * Remove o email do cidadão.
     */
    void unsetEmailCidadao();

    /**
     * Remove as informações sobre o endereço do domicílio.
     */
    void unsetEndereco();

    /**
     * Remove o profissional que realizou a visita.
     */
    void unsetHeaderTransport();

    /**
     * Remove o nome do cidadão.
     */
    void unsetNomeCidadao();

    /**
     * Remove o nome da mãe do cidadão
     */
    void unsetNomeMaeCidadao();

    /**
     * Remove o nome social do cidadão.
     */
    void unsetNomeSocialCidadao();

    /**
     * Remove o CNS do cidadão.
     */
    void unsetNumeroCartaoSus();

    /**
     * Remove o número do PIS/PASEP do cidadão.
     */
    void unsetNumeroNisPisPasep();

    /**
     * Remove a raça / cor do cidadão.
     */
    void unsetRacaCorCidadao();

    /**
     * Remove o sexo do cidadão.
     */
    void unsetSexoCidadao();

    /**
     * Remove as situações presentes.
     */
    void unsetSituacoesPresentes();

    /**
     * Remove o tipo de origem dos dados do registro.
     */
    void unsetTpCdsOrigem();

    /**
     * Remove o código uuid da ficha.
     */
    void unsetUuidFicha();

    /**
     * Valida Data de nascimento do cidadão no formato epoch time.
     * @return Data de nascimento do cidadão no formato epoch time.
     * Valida se o campo é null
     * Valida: Não pode ser posterior a dataAtendimento e anterior a 130 anos a partir da dataAtendimento.
     * Não pode ser posterior a dataAtendimento e anterior a 130 anos a partir da dataAtendimento.
     */
    boolean validaDataNascimentoCidadao();

    /**
     * Valida se o conteudo da instancia está consistente.
     * @return True caso as informações sejam validas.
     */
    boolean validate();

    /**
     * Valida as opções de modalidade, indica se o cidadão é elegível ou inelegível.
     *
     * @return True caso esteja presente, falso caso contrario.
     */
    boolean validateAtencaoDomiciliarModalidade();

    /**
     * Valida o local de atendimento de origem do cidadão.
     *
     * @return True caso esteja presente, falso caso contrario.
     */
    boolean validateAtencaoDomiciliarOrigem();

    /**
     * Valida o código do CID10 principal registrado na avaliação.
     *
     * Regra: Não pode ser igual ao CID10Segundo nem CID10Terceiro.
     *
     * @return True caso esteja de acordo com as regras, False caso contrario.
     */
    boolean validateCid10Principal();

    /**
     * Valida o código do CID10 registrado na avaliação.
     *
     * Regras: Não pode ser igual ao CID10Principal nem CID10Terceiro.
     *
     * @return True caso esteja de acordo com a regra ou não seja declarado, False caso contrario.
     */
    boolean validateCid10Segundo();

    /**
     * Valida o código do CID10 registrado na avaliação.
     *
     * Regras: Não pode ser igual ao CID10Principal nem CID10Segundo.
     *
     * @return True caso esteja de acordo com a regra ou não seja declarado, False caso contrario.
     */
    boolean validateCid10Terceiro();

    /**
     * Valida conduta adotada caso cidadão seja Elegível.
     *
     * Regra: Só pode ser preenchido se atencaoDomiciliarModalidade for diferente de 4 (inelegível).
     * Regra: só pode ser existir se conclusaoDestinoInelegivel não existir.
     *
     * @return True caso atenda as regras, False caso contrario.
     */
    boolean validateConclusaoDestinoElegivel();

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
    boolean validateConclusaoDestinoInelegivel();

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
    boolean validateEmail();

    /**
     * Valida as informações sobre o endereço do domicílio.
     *
     * Regra: Opcional caso conclusaoDestinoElegivel for diferente de 1 (admissão própria emad)
     *
     * @return True caso seja valido ou caso conclusaoDestinoElegivel for diferente de 1, False caso contrario.
     */
    boolean validateEndereco();

    /**
     * Profissional que realizou a visita.
     *
     * @return True caso o header transport seja valido
     */
    boolean validateHeaderTransport();

    /**
     * Valida a nacionalidade do cidadão.
     *
     * Regra: Opcional caso conclusaoDestinoElegivel for diferente de 1 (admissão própria emad)
     *
     * @return True caso esteja presente ou caso conclusaoDestinoElegivel for diferente de 1, False caso contrario.
     */
    boolean validateNacionalidade();

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
    boolean validateNome();

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
    boolean validateNomeMae();

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
    boolean validateNomeSocial();

    /**
     * CNS do cidadão que participou da atividade.
     * @return True Caso não tenha sido informado e caso tenha sido informado corretamente.
     */
    boolean validateNumeroCartaoSus();

    /**
     * Valida o número do PIS/PASEP do cidadão.
     *
     * Regras: Apenas números.
     *
     * Tamanho: 11
     *
     * @return True caso seja valido ou caso não seja declarado, False caso contrario.
     */
    boolean validateNumeroNisPisPasep();

    /**
     * Valida a raça/cor do cidadão.
     *
     * regra: Opcional caso conclusaoDestinoElegivel for diferente de 1 (admissão própria emad)
     *
     * @return True caso esteje presente ou caso conclusaoDestinoElegivel for diferente de 1, False caso contrario.
     */
    boolean validateRacaCorCidadao();

    /**
     * Valida os marcadores de situações presentes.
     *
     * Mínimo: 1
     * Máximo: 24
     *
     * @return True caso atendam as regras ou caso não seja declarado, False caso contrario.
     */
    boolean validateSituacoesPresentes();

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * Obrigatório!
     * Regras: É recomendado concatenar o CNES na frente do UUID, de modo que os
     * 7 digitos (CNES) + 1 de hífen somados aos 36 (32 caracteres + 4 hífen) do
     * UUID são a limitação de 44 bytes do campo.
     * @return True caso valido, false caso esteja inconsistente
     */
    boolean validateUuidFicha();

    /**
     * Valida se o tipo de origem foi declarado.
     *
     * @return True caso o tipo de origem dos dados tenha sido declarado.
     */
    boolean validatetTpCdsOrigem();
    
}
