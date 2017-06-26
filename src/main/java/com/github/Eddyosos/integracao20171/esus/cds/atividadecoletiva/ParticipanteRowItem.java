package com.github.Eddyosos.integracao20171.esus.cds.atividadecoletiva;

import br.gov.saude.esus.cds.transport.generated.thrift.atividadecoletiva.ParticipanteRowItemThrift;
import com.github.Eddyosos.integracao20171.utils.IDS.CNS;
import com.github.eddyosos.e_sus_ab_factory.cds.atividadecoletiva.IParticipanteRowItem;

public class ParticipanteRowItem implements IParticipanteRowItem {

    private ParticipanteRowItemThrift participanteRowItemThrift = new ParticipanteRowItemThrift();

    public ParticipanteRowItem(ParticipanteRowItemThrift participanteRowItemThrift) {
        this.participanteRowItemThrift = participanteRowItemThrift;
    }
    /**
     * Devolve um cns
     * @return cns String
     */

    @Override
    public String getCns() {
        return participanteRowItemThrift.getCns();
    }
    /**
     * Altera o valor de cns
     * @param cns string
     */

    @Override
    public void setCns(String cns) {
        participanteRowItemThrift.setCns(cns);
    }
    /**
     * Devolve uma dataNascimento
     * @return dataNascimento long
     */

    @Override
    public long getDataNascimento() {
        return participanteRowItemThrift.getDataNascimento();
    }
    /**
     * Altera o valor de dataNascimento
     * @param dataNascimento long
     */

    @Override
    public void setDataNascimento(long dataNascimento) {
        participanteRowItemThrift.setDataNascimento(dataNascimento);
    }
    /**
     * Retorna o valor de AvaliacaoAlterada
     * @return AvaliacaoAlterada boolean
     */

    @Override
    public boolean isAvaliacaoAlterada() {
        return participanteRowItemThrift.isAvaliacaoAlterada();
    }
    /**
     * Altera o valor de AvaliacaoAlterada
     * @param avaliacaoAlterada boolean
     */

    @Override
    public void setAvaliacaoAlterada(boolean avaliacaoAlterada) {
        participanteRowItemThrift.setAvaliacaoAlterada(avaliacaoAlterada);
    }
    /**
     * Devolve o valor de peso
     * @return peso double
     */

    @Override
    public double getPeso() {
        return participanteRowItemThrift.getPeso();
    }
    /**
     * Altera o valor de peso
     * @param peso double
     */

    @Override
    public void setPeso(double peso) {
        participanteRowItemThrift.setPeso(peso);
    }
    /**
     * Devolve o valor de altura
     * @return altura double
     */

    @Override
    public double getAltura() {
        return participanteRowItemThrift.getAltura();
    }
    /**
     * Altera o valor de altura
     * @param altura double
     */

    @Override
    public void setAltura(double altura) {
        participanteRowItemThrift.setAltura(altura);
    }
    /**
     * Devolve o valor de cessouHabitoFumar
     * @return cessouHabitoFumar boolean
     */
    @Override
    public boolean isCessouHabitoFumar() {
        return participanteRowItemThrift.isCessouHabitoFumar();
    }
    /**
     * Altera o valor de cessouHabitoFumar
     * @param cessouHabitoFumar boolean
     */

    @Override
    public void setCessouHabitoFumar(boolean cessouHabitoFumar) {
        participanteRowItemThrift.setCessouHabitoFumar(cessouHabitoFumar);
    }
    /**
     * Devolve o valor de abandonouGrupo
     * @return abandonouGrupo boolean
     */

    @Override
    public boolean isAbandonouGrupo() {
        return participanteRowItemThrift.isAbandonouGrupo();
    }
    
    /**
     * Altera o valor de abandonouGrupo
     * @param abandonouGrupo boolean
     */
    @Override
    public void setAbandonouGrupo(boolean abandonouGrupo) {
        participanteRowItemThrift.setAbandonouGrupo(abandonouGrupo);
    }
    
    /**
     *  Devolve uma instancia de ParticipanteRowItemThrift
     * @return participanteRowItemThrift ParticipanteRowItemThrift
     */
    @Override
    public ParticipanteRowItemThrift getInstance() {
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
    @Override
    public boolean validaCns() {
        return CNS.validateCNS(getCns());
    }

    /**
     * Valida o fields AvaliacaoAlterada
     *
     * @return True caso o mesmo seja igual a true ou false. False caso nao seja
     * igual a nenhum destes
     */
    @Override
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
    @Override
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
    @Override
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
    @Override
    public boolean validates(){
        return this.validaAvaliacaoAlterada() &&
                this.validaCns() && 
                this.validaPeso() && 
                this.validateAltura();
           
    }

}
