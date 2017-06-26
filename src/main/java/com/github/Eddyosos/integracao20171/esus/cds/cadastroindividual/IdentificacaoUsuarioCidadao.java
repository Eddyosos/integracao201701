package com.github.Eddyosos.integracao20171.esus.cds.cadastroindividual;

import br.gov.saude.esus.cds.transport.generated.thrift.cadastroindividual.IdentificacaoUsuarioCidadaoThrift;
import com.github.Eddyosos.integracao20171.utils.IDS.CNS;
import com.github.eddyosos.e_sus_ab_factory.cds.cadastroindividual.IIdentificacaoUsuarioCidadao;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IdentificacaoUsuarioCidadao implements IIdentificacaoUsuarioCidadao {

    private IdentificacaoUsuarioCidadaoThrift identificacaoUsuarioCidadaoThrift;

    public IdentificacaoUsuarioCidadao() {
        identificacaoUsuarioCidadaoThrift = new IdentificacaoUsuarioCidadaoThrift();
    }

    public IdentificacaoUsuarioCidadao(IdentificacaoUsuarioCidadaoThrift identificacaoUsuarioCidadao) {
        this.identificacaoUsuarioCidadaoThrift = identificacaoUsuarioCidadao;
    }
    /**
     * Devolve um nomeSocialCidadao
     * @return nomeSocialCidadao String
     */
    @Override
    public String getNomeSocialCidadao() {
        return identificacaoUsuarioCidadaoThrift.getNomeSocialCidadao();
    }
    /**
     * Altera um nomeSocialCidadao
     * @param nomeSocialCidadao String
     */
    @Override
    public void setNomeSocialCidadao(String nomeSocialCidadao) {
        identificacaoUsuarioCidadaoThrift.setNomeSocialCidadao(nomeSocialCidadao);
    }
    /**
     * devolve um codigoIbgeMunicipio
     * @return codigoIbgeMunicipio String
     */

    @Override
    public String getCodigoIbgeMunicipioNascimento() {
        return identificacaoUsuarioCidadaoThrift.getCodigoIbgeMunicipioNascimento();
    }
    /**
     * Altera um codigoIbgeMunicipio
     * @param codigoIbgeMunicipioNascimento String
     */
    @Override
    public void setCodigoIbgeMunicipioNascimento(String codigoIbgeMunicipioNascimento) {
        identificacaoUsuarioCidadaoThrift.setCodigoIbgeMunicipioNascimento(codigoIbgeMunicipioNascimento);
    }
    /**
     * Devolve um dataNascimentoCidadao
     * @return dataNascimentoCidadao long
     */
    @Override
    public long getDataNascimentoCidadao() {
        return identificacaoUsuarioCidadaoThrift.getDataNascimentoCidadao();
    }
    /**
     * Altera um dataNascimentoCidadao
     * @param dataNascimentoCidadao long 
     */

    @Override
    public void setDataNascimentoCidadao(long dataNascimentoCidadao) {
        identificacaoUsuarioCidadaoThrift.setDataNascimentoCidadao(dataNascimentoCidadao);
    }
    /**
     * Devolve um dataNascimentoResponsavel
     * @return dataNascimentoResponsavel long
     */
    @Override
    public long getDataNascimentoResponsavel() {
        return identificacaoUsuarioCidadaoThrift.getDataNascimentoResponsavel();
    }
    /**
     * Altera um dataNascimentoResponsavel
     * @param dataNascimentoResponsavel long
     */

    @Override
    public void setDataNascimentoResponsavel(long dataNascimentoResponsavel) {
        identificacaoUsuarioCidadaoThrift.setDataNascimentoResponsavel(dataNascimentoResponsavel);
    }
    /**
     * Devolve um desconheceNomeMae
     * @return desconheceNomeMae boolean
     */
    @Override
    public boolean isDesconheceNomeMae() {
        return identificacaoUsuarioCidadaoThrift.isDesconheceNomeMae();
    }
    /**
     * altera o valor de desconheceNomeMae
     * @param desconheceNomeMae boolean
     */
    @Override
    public void setDesconheceNomeMae(boolean desconheceNomeMae) {
        identificacaoUsuarioCidadaoThrift.setDesconheceNomeMae(desconheceNomeMae);
    }
    /**
     * Devolve o valor de emailCidadao
     * @return emailCidadao String
     */
    @Override
    public String getEmailCidadao() {
        return identificacaoUsuarioCidadaoThrift.getEmailCidadao();
    }
    /**
     * Altera o valor de emailCidadao
     * @param emailCidadao String
     */

    @Override
    public void setEmailCidadao(String emailCidadao) {
        identificacaoUsuarioCidadaoThrift.setEmailCidadao(emailCidadao);
    }
    /**
     * Devolve o valor de nacionalidadeCidadao
     * @return nacionalidadeCidadao long
     */
    @Override
    public long getNacionalidadeCidadao() {
        return identificacaoUsuarioCidadaoThrift.getNacionalidadeCidadao();
    }
    /**
     * Altera o valor de nacionalidadeCidadao
     * @param nacionalidadeCidadao long
     */
    @Override
    public void setNacionalidadeCidadao(long nacionalidadeCidadao) {
        identificacaoUsuarioCidadaoThrift.setNacionalidadeCidadao(nacionalidadeCidadao);
    }
    /**
     * Devolve o valor de nomeCidadao
     * @return nomeCidadao String
     */
    @Override
    public String getNomeCidadao() {
        return identificacaoUsuarioCidadaoThrift.getNomeCidadao();
    }
    /**
     * Altera o valor de nomeCidadao
     * @param nomeCidadao String
     */
    @Override
    public void setNomeCidadao(String nomeCidadao) {
        identificacaoUsuarioCidadaoThrift.setNomeCidadao(nomeCidadao);
    }
    /**
     * Devolve o valor de nomeMaeCidadao
     * @return nomeMaeCidadao String
     */
    @Override
    public String getNomeMaeCidadao() {
        return identificacaoUsuarioCidadaoThrift.getNomeMaeCidadao();
    }
    /**
     * Altera o valor de nomeMaeCidadao
     * @param nomeMaeCidadao String
     */
    @Override
    public void setNomeMaeCidadao(String nomeMaeCidadao) {
        identificacaoUsuarioCidadaoThrift.setNomeMaeCidadao(nomeMaeCidadao);
    }
    /**
     * Devolve o valor de numeroCartaoSus
     * @return numeroCartaoSus String
     */
    @Override
    public String getNumeroCartaoSus() {
        return identificacaoUsuarioCidadaoThrift.getNumeroCartaoSus();
    }
    /**
     * Altera o valor de numeroCartaoSus
     * @param numeroCartaoSus String
     */
    @Override
    public void setNumeroCartaoSus(String numeroCartaoSus) {
        identificacaoUsuarioCidadaoThrift.setNumeroCartaoSus(numeroCartaoSus);
    }
    /**
     * Devolve o valor de numeroCartaoSusResponsavel
     * @return numeroCartaoSusResponsavel String
     */
    @Override
    public String getNumeroCartaoSusResponsavel() {
        return identificacaoUsuarioCidadaoThrift.getNumeroCartaoSusResponsavel();
    }
    /**
     * Altera o valor de numeroCartaoSusResponsavel
     * @param numeroCartaoSusResponsavel String
     */
    @Override
    public void setNumeroCartaoSusResponsavel(String numeroCartaoSusResponsavel) {
        identificacaoUsuarioCidadaoThrift.setNumeroCartaoSusResponsavel(numeroCartaoSusResponsavel);
    }
    /**
     * Devolve o valor de numeroCelularCidadao
     * @return numeroCelularCidadao String
     */
    @Override
    public String getNumeroCelularCidadao() {
        return identificacaoUsuarioCidadaoThrift.getNumeroCelularCidadao();
    }
    /**
     * Altera o valor de numeroCelularCidadao
     * @param numeroCelularCidadao String
     */

    @Override
    public void setNumeroCelularCidadao(String numeroCelularCidadao) {
        identificacaoUsuarioCidadaoThrift.setNumeroCelularCidadao(numeroCelularCidadao);
    }
    /**
     * Devolve o valor de numeroNisPisPasep
     * @return numeroNisPisPasep String
     */
    @Override
    public String getNumeroNisPisPasep() {
        return identificacaoUsuarioCidadaoThrift.getNumeroNisPisPasep();
    }
    /**
     * Altera o valor de numeroNisPisPasep
     * @param numeroNisPisPasep String
     */
    @Override
    public void setNumeroNisPisPasep(String numeroNisPisPasep) {
        identificacaoUsuarioCidadaoThrift.setNumeroNisPisPasep(numeroNisPisPasep);
    }
    /**
     * Devolve o valor de paisNascimento
     * @return paisNascimento long
     */
    @Override
    public long getPaisNascimento() {
        return identificacaoUsuarioCidadaoThrift.getPaisNascimento();
    }
    /**
     * Altera o valor de paisNascimento
     * @param paisNascimento Long
     */

    @Override
    public void setPaisNascimento(long paisNascimento) {
        identificacaoUsuarioCidadaoThrift.setPaisNascimento(paisNascimento);
    }
    /**
     * Devolve o valor de racaCorCidadao
     * @return racaCorCidadao long
     */
    @Override
    public long getRacaCorCidadao() {
        return identificacaoUsuarioCidadaoThrift.getRacaCorCidadao();
    }
    /**
     * Altera o valor de racaCorCidadao
     * @param racaCorCidadao long
     */
    @Override
    public void setRacaCorCidadao(long racaCorCidadao) {
        identificacaoUsuarioCidadaoThrift.setRacaCorCidadao(racaCorCidadao);
    }
    /**
     * Devolve o valor de sexoCidadao
     * @return sexoCidadao long
     */
    @Override
    public long getSexoCidadao() {
        return identificacaoUsuarioCidadaoThrift.getSexoCidadao();
    }
    /**
     * Altera o valor de sexoCidadao
     * @param sexoCidadao long
     */
    @Override
    public void setSexoCidadao(long sexoCidadao) {
        identificacaoUsuarioCidadaoThrift.setSexoCidadao(sexoCidadao);
    }
    /**
     * Devolve o valor de StatusEhResponsavel
     * @return StatusEhResponsavel boolean
     */
    @Override
    public boolean isStatusEhResponsavel() {
        return identificacaoUsuarioCidadaoThrift.isStatusEhResponsavel();
    }
    /**
     * Altera o valor de StatusEhResponsavel
     * @param statusEhResponsavel boolean
     */
    @Override
    public void setStatusEhResponsavel(boolean statusEhResponsavel) {
        identificacaoUsuarioCidadaoThrift.setStatusEhResponsavel(statusEhResponsavel);
    }
    /**
     * Devolve uma instancia de identificacaoUsuarioCidadaoThrift
     * @return identificacaoUsuarioCidadaoThrift IdentificacaoUsuarioCidadaoThrift
     */
    @Override
    public IdentificacaoUsuarioCidadaoThrift getInstance() {
        return this.identificacaoUsuarioCidadaoThrift;
    }

    /**
     * Valida nomeSocialCidadao
     *
     * @return true caso valido, false caso invalido
     */
    @Override
    public boolean validaNomeSocialCidadao() {
        if (getInstance().isSetNomeSocialCidadao()) {
            return getInstance().getNomeSocialCidadao().length() >= 0 && getInstance().getNomeSocialCidadao().length() <= 100;
        } else {
            return true;
        }
    }

    /**
     * Valida codigo IbgeMunicipioNascimento. Tem q ser preenchido caso
     * NacionalidadeCidadao seja igual à 1. Caso contrario, nao há necessidade
     * de preenchimento.
     *
     * @return true caso valido. False caso invalido
     */
    @Override
    public boolean validaCodigoIbgeMunicipioNascimento() {
        if (getInstance().getNacionalidadeCidadao() == 1) {
            if (getInstance().isSetCodigoIbgeMunicipioNascimento()) {
                String var = getInstance().getCodigoIbgeMunicipioNascimento();
                return var.matches("\\A\\d{7}\\z");
            } else {
                return false;
            }
        } else {
            return !getInstance().isSetCodigoIbgeMunicipioNascimento();
        }
    }

    /**
     * Valida o emailCidadao
     *
     * Presença não obrigatória.
     *
     * Tamanho mínimo : 6 Tamanho máximo: 100
     *
     * @return True se estiver de acordo com as regras, Caso contrario False.
     */
    @Override
    public boolean ValidaEmailCidadao() {
        if (getInstance().isSetEmailCidadao()) {
            if (getInstance().getEmailCidadao().length() >= 6
                    && getInstance().getEmailCidadao().length() <= 100) {

                Pattern VALID_EMAIL_ADDRESS_REGEX
                        = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

                Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(getInstance().getEmailCidadao());
                return matcher.find();
            } else {
                return false;
            }
        }

        return true;
    }

    /**
     * Valida nacionalidade cidadao
     *
     * @return True caso nacionalidadeCidadao seja maior ou igual a 1 ou menor
     * igual a 3 False caso este nao seja maior ou igual a 1 ou menor igual a 3
     * False caso nao esteja setado
     */
    @Override
    public boolean ValidaNaciondalidaCidade() {
        if (getInstance().isSetNacionalidadeCidadao()) {
            return getInstance().getNacionalidadeCidadao() >= 1 && getInstance().getNacionalidadeCidadao() <= 3;
        } else {
            return false;
        }
    }

    /**
     * Valida nome da mae cidadao Condicional Se desconheceMae for igual a true.
     * Não precisa ser preenchido. Caso contrário é necessário Nome da mae
     * precisa ser maior que 4 e menor que 101
     *
     * @return true caso válido, false caso invalido
     */
    @Override
    public boolean validaNomeMaeCidadao() {
        if (!getInstance().isDesconheceNomeMae()) {
            if (getInstance().isSetNomeMaeCidadao()) {
                return getInstance().getNomeMaeCidadao().length() >= 5 && getInstance().getNomeMaeCidadao().length() <= 100;
            } else {
                return false;
            }
        } else {
            return !getInstance().isSetNomeMaeCidadao();
        }
    }

    /**
     * Valida numeroCartaoSus Usa as regras definidas por um algoritimo pré
     * definido
     *
     * @return True caso valido. False caso inválido
     */
    @Override
    public boolean validaNumeroCartaoSus() {
        return CNS.validateCNS(getInstance().getNumeroCartaoSus());
    }

    /**
     * Valida NumeroCartaoSusResponsavel Usa as regras definidas por um
     * algoritimo pré definido Condicional: StatusEhResponsavel precisa ser True
     * para NumeroCartaoSusResponsavel ser preenchido.
     *
     * @return True caso valido. False caso inválido
     */
    @Override
    public boolean validaNumeroCartaoSusResponsavel() {
        if (getInstance().isStatusEhResponsavel()) {
            return CNS.validateCNS(getInstance().getNumeroCartaoSusResponsavel());
        } else {
            return !getInstance().isSetNumeroCartaoSusResponsavel();
        }
    }

    /**
     * Valida numero celular Cidadao Deve conter apenas numeros. Tamanho min de
     * 10 e max de 11
     *
     * @return true caso valido. False invalido.
     */
    @Override
    public boolean validaNumeroCelularCidadao() {
        if (getInstance().isSetNumeroCelularCidadao()) {
            return getInstance().getNumeroCelularCidadao().matches("[0-9]+")
                    && getInstance().getNumeroCelularCidadao().length() >= 10
                    && getInstance().getNumeroCelularCidadao().length() <= 11;
        } else {
            return true;
        }
    }

    /**
     * Valida numero Nis Pis Pasep Deve conter apenas 11 numeros
     *
     * @return true caso valido. False invalido.
     */
    @Override
    public boolean validaNumeroNisPisPasep() {
        if (getInstance().isSetNumeroNisPisPasep()) {
            return getInstance().getNumeroNisPisPasep().length() == 11;
        } else {
            return true;
        }
    }

    /**
     * Valida paisNascimento Condiocional: NacionalidadeCidadao deve ser
     * diferente de 1 para esta ser preenchida paisNacimento deve ser maior que
     * 0 e menor q 239
     *
     * @return true caso valido. False caso invalido
     */
    @Override
    public boolean validaPaisNacimento() {
        if (getInstance().getNacionalidadeCidadao() != 1) {
            if (getInstance().isSetPaisNascimento()) {
                return getInstance().getPaisNascimento() >= 1 && getInstance().getPaisNascimento() <= 238;
            } else {
                return false;
            }
        } else {
            return !getInstance().isSetPaisNascimento();
        }
    }

    /**
     * Valida racaCorCidadao Obrigatorio Deve ser maior que 0 e menor que 6
     *
     * @return
     */
    @Override
    public boolean validaRacaCorCidadao() {
        if (getInstance().isSetRacaCorCidadao()) {
            return getInstance().getRacaCorCidadao() >= 1 && getInstance().getRacaCorCidadao() <= 5;
        } else {
            return false;
        }
    }

    /**
     * Valida sexoCidadao Obrigatorio Deve ser igual 0 ou 1
     *
     * @return
     */
    @Override
    public boolean validaSexoCidadao() {
        if (getInstance().isSetRacaCorCidadao()) {
            return getInstance().getRacaCorCidadao() == 0 || getInstance().getRacaCorCidadao() == 1;
        } else {
            return false;
        }
    }
    /**
     * Valida todos os fields
     * @return True caso todos estejam validos. False caso algum deles nao esteja valido
     */
    @Override
    public boolean validates() {
        return this.ValidaEmailCidadao() && this.ValidaNaciondalidaCidade() && this.validaCodigoIbgeMunicipioNascimento()
                && this.validaNomeMaeCidadao() && this.validaNomeSocialCidadao() && this.validaNumeroCartaoSus()
                && this.validaNumeroCartaoSusResponsavel() && this.validaNumeroCelularCidadao() && this.validaNumeroNisPisPasep()
                && this.validaPaisNacimento() && this.validaRacaCorCidadao() && this.validaSexoCidadao();
    }

}
