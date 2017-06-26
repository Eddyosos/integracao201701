package com.github.Eddyosos.integracao20171.esus.cds.atividadecoletiva;

import br.gov.saude.esus.cds.transport.generated.thrift.atividadecoletiva.ParticipanteRowItemThrift;

public class ParticipanteRowItem {

    ParticipanteRowItemThrift participanteRowItemThrift = new ParticipanteRowItemThrift();

    protected ParticipanteRowItem(ParticipanteRowItemThrift participanteRowItemThrift) {
        this.participanteRowItemThrift = participanteRowItemThrift;
    }
    /**
     * Devolve um cns
     * @return cns String
     */

    public String getCns() {
        return participanteRowItemThrift.getCns();
    }
    /**
     * Altera o valor de cns
     * @param cns string
     */

    public void setCns(String cns) {
        participanteRowItemThrift.setCns(cns);
    }
    /**
     * Devolve uma dataNascimento
     * @return dataNascimento long
     */

    public long getDataNascimento() {
        return participanteRowItemThrift.getDataNascimento();
    }
    /**
     * Altera o valor de dataNascimento
     * @param dataNascimento long
     */

    public void setDataNascimento(long dataNascimento) {
        participanteRowItemThrift.setDataNascimento(dataNascimento);
    }
    /**
     * Retorna o valor de AvaliacaoAlterada
     * @return AvaliacaoAlterada boolean
     */

    public boolean isAvaliacaoAlterada() {
        return participanteRowItemThrift.isAvaliacaoAlterada();
    }
    /**
     * Altera o valor de AvaliacaoAlterada
     * @param avaliacaoAlterada boolean
     */

    public void setAvaliacaoAlterada(boolean avaliacaoAlterada) {
        participanteRowItemThrift.setAvaliacaoAlterada(avaliacaoAlterada);
    }
    /**
     * Devolve o valor de peso
     * @return peso double
     */

    public double getPeso() {
        return participanteRowItemThrift.getPeso();
    }
    /**
     * Altera o valor de peso
     * @param peso double
     */

    public void setPeso(double peso) {
        participanteRowItemThrift.setPeso(peso);
    }
    /**
     * Devolve o valor de altura
     * @return altura double
     */

    public double getAltura() {
        return participanteRowItemThrift.getAltura();
    }
    /**
     * Altera o valor de altura
     * @param altura double
     */

    public void setAltura(double altura) {
        participanteRowItemThrift.setAltura(altura);
    }
    /**
     * Devolve o valor de cessouHabitoFumar
     * @return cessouHabitoFumar boolean
     */
    public boolean isCessouHabitoFumar() {
        return participanteRowItemThrift.isCessouHabitoFumar();
    }
    /**
     * Altera o valor de cessouHabitoFumar
     * @param cessouHabitoFumar boolean
     */

    public void setCessouHabitoFumar(boolean cessouHabitoFumar) {
        participanteRowItemThrift.setCessouHabitoFumar(cessouHabitoFumar);
    }
    /**
     * Devolve o valor de abandonouGrupo
     * @return abandonouGrupo boolean
     */

    public boolean isAbandonouGrupo() {
        return participanteRowItemThrift.isAbandonouGrupo();
    }
    /**
     * Altera o valor de abandonouGrupo
     * @param abandonouGrupo boolean
     */
    public void setAbandonouGrupo(boolean abandonouGrupo) {
        participanteRowItemThrift.setAbandonouGrupo(abandonouGrupo);
    }
    /**
     *  Devolve uma instancia de ParticipanteRowItemThrift
     * @return participanteRowItemThrift ParticipanteRowItemThrift
     */
    protected ParticipanteRowItemThrift getInstance() {
        return participanteRowItemThrift;
    }

    /**
     * Valida o field Cns
     *
     * @return False - Caso o Field não esteja setado. True - caso o numero
     * inicial seja 1 ou 2 ou 7 ou 8 ou 9 e atenda aos padrões do cartao SUS
     * False - caso o número esteja setado e nao atenda aos padrões do cartão
     * SUS.
     */
    public boolean validaCns() {

        String cns = getInstance().getCns();
        if (getInstance().isSetCns()) {
            if (cns.charAt(0) == '1' || cns.charAt(0) == '2') {

                if (cns.trim().length() != 15) {
                    return (false);
                }

                float soma;
                float resto, dv;
                String pis = "";
                String resultado = "";
                pis = cns.substring(0, 11);

                soma = ((Integer.parseInt(pis.substring(0, 1))) * 15)
                        + ((Integer.valueOf(pis.substring(1, 2)).intValue()) * 14)
                        + ((Integer.valueOf(pis.substring(2, 3)).intValue()) * 13)
                        + ((Integer.valueOf(pis.substring(3, 4)).intValue()) * 12)
                        + ((Integer.valueOf(pis.substring(4, 5)).intValue()) * 11)
                        + ((Integer.valueOf(pis.substring(5, 6)).intValue()) * 10)
                        + ((Integer.valueOf(pis.substring(6, 7)).intValue()) * 9)
                        + ((Integer.valueOf(pis.substring(7, 8)).intValue()) * 8)
                        + ((Integer.valueOf(pis.substring(8, 9)).intValue()) * 7)
                        + ((Integer.valueOf(pis.substring(9, 10)).intValue()) * 6)
                        + ((Integer.valueOf(pis.substring(10, 11)).intValue()) * 5);

                resto = soma % 11;
                dv = 11 - resto;

                if (dv == 11) {
                    dv = 0;
                }

                if (dv == 10) {
                    soma = ((Integer.valueOf(pis.substring(0, 1)).intValue()) * 15)
                            + ((Integer.valueOf(pis.substring(1, 2)).intValue()) * 14)
                            + ((Integer.valueOf(pis.substring(2, 3)).intValue()) * 13)
                            + ((Integer.valueOf(pis.substring(3, 4)).intValue()) * 12)
                            + ((Integer.valueOf(pis.substring(4, 5)).intValue()) * 11)
                            + ((Integer.valueOf(pis.substring(5, 6)).intValue()) * 10)
                            + ((Integer.valueOf(pis.substring(6, 7)).intValue()) * 9)
                            + ((Integer.valueOf(pis.substring(7, 8)).intValue()) * 8)
                            + ((Integer.valueOf(pis.substring(8, 9)).intValue()) * 7)
                            + ((Integer.valueOf(pis.substring(9, 10)).intValue()) * 6)
                            + ((Integer.valueOf(pis.substring(10, 11)).intValue()) * 5) + 2;

                    resto = soma % 11;
                    dv = 11 - resto;
                    resultado = pis + "001" + String.valueOf((int) dv);
                } else {
                    resultado = pis + "000" + String.valueOf((int) dv);
                }

                if (!cns.equals(resultado)) {
                    return (false);
                } else {
                    return (true);
                }
            } else if (cns.charAt(0) == '7' || cns.charAt(0) == '8' || cns.charAt(0) == '9') {
                if (cns.trim().length() != 15) {
                    return (false);
                }

                float dv;
                float resto, soma;

                soma = ((Integer.valueOf(cns.substring(0, 1)).intValue()) * 15)
                        + ((Integer.valueOf(cns.substring(1, 2)).intValue()) * 14)
                        + ((Integer.valueOf(cns.substring(2, 3)).intValue()) * 13)
                        + ((Integer.valueOf(cns.substring(3, 4)).intValue()) * 12)
                        + ((Integer.valueOf(cns.substring(4, 5)).intValue()) * 11)
                        + ((Integer.valueOf(cns.substring(5, 6)).intValue()) * 10)
                        + ((Integer.valueOf(cns.substring(6, 7)).intValue()) * 9)
                        + ((Integer.valueOf(cns.substring(7, 8)).intValue()) * 8)
                        + ((Integer.valueOf(cns.substring(8, 9)).intValue()) * 7)
                        + ((Integer.valueOf(cns.substring(9, 10)).intValue()) * 6)
                        + ((Integer.valueOf(cns.substring(10, 11)).intValue()) * 5)
                        + ((Integer.valueOf(cns.substring(11, 12)).intValue()) * 4)
                        + ((Integer.valueOf(cns.substring(12, 13)).intValue()) * 3)
                        + ((Integer.valueOf(cns.substring(13, 14)).intValue()) * 2)
                        + ((Integer.valueOf(cns.substring(14, 15)).intValue()) * 1);

                resto = soma % 11;

                if (resto != 0) {
                    return (false);
                } else {
                    return (true);
                }
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    /**
     * Valida o fields AvaliacaoAlterada
     *
     * @return True caso o mesmo seja igual a true ou false. False caso nao seja
     * igual a nenhum destes
     */
    public boolean validaAvaliacaoAlterada() {
        return getInstance().isAvaliacaoAlterada() == true || getInstance().isAvaliacaoAlterada() == false;
    }

    /**
     * Valida Peso. Para ser valido, caso tenha sido inserido, deve: 1- Máximo
     * de 3 números após a vírgula. 2- Se tiver vírgula, tamanho máximo = 7. 3-
     * Valor mínimo 0,5 e máximo 500.
     *
     * @return true se válido false se inválido
     */
    public boolean validaPeso() {
        double var = getInstance().getPeso();
        return !getInstance().isSetPeso()
                || (var * 1000 == (int) (var * 1000)
                && var < 10000
                && var >= 0.5
                && var <= 500);
    }

    /**
     * Valida Altura. Para ser válido deve: 1- Máximo
     * de 3 números após a vírgula. 2- Se tiver vírgula, tamanho máximo = 5. 3-
     * Valor mínimo 20 e máximo 250.
     *
     * @return true se válido false se inválido
     */
    public boolean validateAltura() {
        double var = getInstance().getAltura();
        return !getInstance().isSetAltura()
                || (var * 100 == (int) (var * 100)
                && var < 1000
                && var >= 20
                && var <= 250);
    }
    /**
     * Valida todos os fields
     * @return True caso todos estejam validos
     * False caso algum deles esteja invalido.
     */
    public boolean validates(){
        return this.validaAvaliacaoAlterada() && this.validaCns() && this.validaPeso() && this.validateAltura();
           
    }

}
