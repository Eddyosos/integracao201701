package com.github.Eddyosos.integracao20171.esus.cds.visitadomiciliar;

import br.gov.saude.esus.cds.transport.generated.thrift.visitadomiciliar.FichaVisitaDomiciliarChildThrift;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FichaVisitaDomiciliarChild {

    FichaVisitaDomiciliarChildThrift instance = new FichaVisitaDomiciliarChildThrift();

    protected FichaVisitaDomiciliarChild(FichaVisitaDomiciliarChildThrift thrift) {
        this.instance = thrift;
    }
    /**
     * Devolve um field turno
     * @return turno
     */

    public long getTurno() {
        return instance.getTurno();
    }
    /**
     * Altera o valor de turno
     * @param turno 
     */
    public void setTurno(long turno) {
        instance.setTurno(turno);
    }
    /**
     * Apaga o valor do field turno(null)
     */

    public void unsetTurno() {
        instance.unsetTurno();
    }
    /**
     * Verifica se turno esta setado
     * @return true caso esteja setado
     * false caso nao esteja
     */

    public boolean isSetTurno() {
        return instance.isSetTurno();
    }
    /**
     * Seta o valor booleano de isSetTurno
     * @param value boolean
     */

    public void setTurnoIsSet(boolean value) {
        instance.setTurnoIsSet(value);
    }
    /**
     * Retorna o numero de prontuario
     * @return numProntuario String
     */

    public String getNumProntuario() {
        return instance.getNumProntuario();
    }
    /**
     * Muda o valor do numero de prontuario
     * @param numProntuario String
     */

    public void setNumProntuario(String numProntuario) {
        instance.setNumProntuario(numProntuario);
    }
    /**
     * Apaga o valor do field numProntuario
     */
    public void unsetNumProntuario() {
        instance.unsetNumProntuario();
    }
    /**
     * Verifica se o field numProntuario está setado
     * @return true caso o valor esteja setado
     * false caso não esteja setado
     */

    public boolean isSetNumProntuario() {
        return instance.isSetNumProntuario();
    }
    /**
     * Altera o valor do isSet do field numProntuario
     * @param value boolean 
     */

    public void setNumProntuarioIsSet(boolean value) {
        instance.setNumProntuarioIsSet(value);
    }
    /**
     * Retorna o numero de cartão do SuS
     * @return numCartaoSus String
     */
    
    public String getNumCartaoSus() {
        return instance.getNumCartaoSus();
    }
    /**
     * Muda o valor do numero do cartao Sus
     * @param numCartaoSus String
     */
    public void setNumCartaoSus(String numCartaoSus) {
        instance.setNumCartaoSus(numCartaoSus);
    }
    /**
     * Apaga o valor do field numCartaoSus
     */

    public void unsetNumCartaoSus() {
        instance.unsetNumCartaoSus();
    }
    /**
     * Verifica se o field numCartaoSus está setado
     * @return true caso o valor esteja setado false caso não esteja setado
     */
    public boolean isSetNumCartaoSus() {
        return instance.isSetNumCartaoSus();
    }
    /**
     * Altera o valor do isSet do field numCartaoSus
     * @param value boolean 
     */

    public void setNumCartaoSusIsSet(boolean value) {
        instance.setNumCartaoSusIsSet(value);
    }
    /**
     * Retorna a data de Nascimento
     * @return dtNascimento Long
     */

    public long getDtNascimento() {
        return instance.getDtNascimento();
    }
     /**
     * Muda o valor do numero de dtNascimento
     * @param dtNascimento String
     */

    public void setDtNascimento(long dtNascimento) {
        instance.setDtNascimento(dtNascimento);
    }
    /**
     * Apaga o valor do field dtNascimento
     */
    public void unsetDtNascimento() {
        instance.unsetDtNascimento();
    }
    /**
     * Verifica se o field dtNascimento está setado
     * @return true caso o valor esteja setado
     * false caso não esteja setado
     */

    public boolean isSetDtNascimento() {
        return instance.isSetDtNascimento();
    }
    /**
     * Altera o valor do isSet do field dtNascimento
     * @param value boolean 
     */

    public void setDtNascimentoIsSet(boolean value) {
        instance.setDtNascimentoIsSet(value);
    }
    /**
     * Retorna o valor de sexo
     * @return sexo long
     */

    public long getSexo() {
        return instance.getSexo();
    }
    /**
     * Muda o valor do field sexo
     * @param sexo String
     */

    public void setSexo(long sexo) {
        instance.setSexo(sexo);
    }
    /**
     * Apaga o valor do field sexo
     */
    public void unsetSexo() {
        instance.unsetSexo();
    }
    /**
     * Verifica se o field sexo está setado
     * @return true caso o valor esteja setado
     * false caso não esteja setado
     */

    public boolean isSetSexo() {
        return instance.isSetSexo();
    }
    /**
     * Altera o valor do isSet do field sexo
     * @param value boolean 
     */

    public void setSexoIsSet(boolean value) {
        instance.setSexoIsSet(value);
    }
    /**
     * Retorna se a visita foi compartilhada com outro profissional
     * @return true caso sim, false caso nao.
     */

    public boolean isStatusVisitaCompartilhadaOutroProfissional() {
        return instance.isStatusVisitaCompartilhadaOutroProfissional();
    }
    /**
     * Altera o valor se a visita foi compartilhada ou nao
     * @param statusVisitaCompartilhadaOutroProfissional boolean
     */

    public void setStatusVisitaCompartilhadaOutroProfissional(boolean statusVisitaCompartilhadaOutroProfissional) {
        instance.setStatusVisitaCompartilhadaOutroProfissional(statusVisitaCompartilhadaOutroProfissional);
    }
    /**
     * Apaga o valor do field statusVisitaCompartilhadaOutroProfissional
     */

    public void unsetStatusVisitaCompartilhadaOutroProfissional() {
        instance.unsetStatusVisitaCompartilhadaOutroProfissional();
    }
    /**
     * Verifica se o field statusVisitaCompartilhadaOutroProfissional está setado
     * @return true caso o valor esteja setado
     * false caso não esteja setado
     */

    public boolean isSetStatusVisitaCompartilhadaOutroProfissional() {
        return instance.isSetStatusVisitaCompartilhadaOutroProfissional();
    }
    /**
     * Altera o valor do isSet do field statusVisitaCompartilhadaOutroProfissional
     * @param value boolean 
     */

    public void setStatusVisitaCompartilhadaOutroProfissionalIsSet(boolean value) {
        instance.setStatusVisitaCompartilhadaOutroProfissionalIsSet(value);
    }
    /**
     * Retorna o  tamanho de motivos de visita
     * @return motivosVisitaSize int
     */

    public int getMotivosVisitaSize() {
        return instance.getMotivosVisitaSize();
    }
    /**
     * Retorna o iterator de MotivosVisita
     * @return motivosVisitaIterator
     */

    public Iterator<Long> getMotivosVisitaIterator() {
        return instance.getMotivosVisitaIterator();
    }
    /**
     * Adiciona um novo elemento a lista motivosVisista
     * @param elem 
     */

    public void addToMotivosVisita(long elem) {
        instance.addToMotivosVisita(elem);
    }
    /**
     * Retorna a lista motivosVisista
     * @return MotivosVisita List
     */
    
    public List<Long> getMotivosVisita() {
        return instance.getMotivosVisita();
    }
    /**
     * Muda o valor do MotivosVisita
     * @param motivosVisita List
     */

    public void setMotivosVisita(List<Long> motivosVisita) {
        instance.setMotivosVisita(motivosVisita);
    }
    /**
     * Apaga o valor do field MotivosVisita
     */

    public void unsetMotivosVisita() {
        instance.unsetMotivosVisita();
    }
    /**
     * Verifica se o field MotivosVisita está setado
     * @return true caso o valor esteja setado
     * false caso não esteja setado
     */

    public boolean isSetMotivosVisita() {
        return instance.isSetMotivosVisita();
    }
    /**
     * Altera o valor do isSet do field MotivosVisita
     * @param value boolean 
     */

    public void setMotivosVisitaIsSet(boolean value) {
        instance.setMotivosVisitaIsSet(value);
    }
    /**
     * Retorna o valor de desfecho
     * @return desfecho long
     */

    public long getDesfecho() {
        return instance.getDesfecho();
    }
    /**
     * Muda o valor de desfecho
     * @param desfecho String
     */

    public void setDesfecho(long desfecho) {
        instance.setDesfecho(desfecho);
    }
    /**
     * Apaga o valor do field desfecho
     */

    public void unsetDesfecho() {
        instance.unsetDesfecho();
    }
    /**
     * Verifica se o field desfecho está setado
     * @return true caso o valor esteja setado
     * false caso não esteja setado
     */

    public boolean isSetDesfecho() {
        return instance.isSetDesfecho();
    }
    /**
     * Altera o valor do isSet do field desfecho
     * @param value boolean 
     */

    public void setDesfechoIsSet(boolean value) {
        instance.setDesfechoIsSet(value);
    }
    /**
     * Verifica se a instancia atual é igual ao objeto passado como parametro
     * @param that
     * @return true caso seja iguais
     * false caso nao
     */

    @Override
    public boolean equals(Object that) {
        return instance.equals(that);
    }
    /**
     * Verifica se a instancia atual é igual ao FichaVisitaDomiciliarChild passado como parametro
     * @param that
     * @return true caso seja iguais
     * false caso nao
     */

    public boolean equals(FichaVisitaDomiciliarChild that) {
        return instance.equals(that.getInstance());
    }
    /**
     * Retorna uma instance de FichaVisitaDomiciliarchild
     * @return instance FichaVisitaDomiciliarChild
     */
    protected FichaVisitaDomiciliarChildThrift getInstance() {
        return instance;

    }

    /**
     * Valida o field TURNO
     * @return true caso nenhuma valor esteja setado, pois nao é um campo obrigatorio
     * true caso o valor de turno esteja setado e seja igual a 1, 2 ou 3
     * false caso o valor de turno esteja setado e seja diferente de 1,2 ou 3.
     */
    public boolean validaTurno() {
        if (getInstance().isSetTurno()) {
            return getInstance().getTurno() == 1 | getInstance().getTurno() == 2 | getInstance().getTurno() == 3;
        } else {
            return true;
        }
    }

    /**
     * Valida o Field NUM_PRONTUARIO.
     * @return True - Caso não tenha nada setado dentro do field NUM_PRONTUARIO.
     * True - Caso tenha setado um valor em NUM_PRONTUARIO e este valor de String seja menor ou igual a 30 caracteres e contenha apenas letras e numeros
     * False - Caso tenha um setado valor me NUM_PRONTUARIO e este valor de String seja maior que 30 caracteres ou contenha caracteres especiais
     */
    public boolean validaNumProntuario() {
        Pattern PATTERN = Pattern.compile("([a-z A-Z 0-9])+");
        Matcher matcher = PATTERN.matcher(getInstance().getNumProntuario());

        if (getInstance().isSetNumProntuario()) {
            if (getInstance().getNumProntuario().length() <= 30) {
                return matcher.matches();
            } else {
                return false;
            }
        } else {
            return true;
        }
    }

    /**
     * Verifica se o número do cartão Sus é válido
     * @return true - Caso o Field não esteja setado
     * true- caso o numero inicial seja 1 ou 2 ou 7 ou 8 ou 9 e atenda aos padrões do cartao SUS
     * false - caso o número esteja setado e nao atenda aos padrões do cartão SUS.
     */
    public boolean validaNumCartaoSus() {

        String cns = getInstance().getNumCartaoSus();
        if (getInstance().isSetNumCartaoSus()) {
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
        }

        return true;

    }
    /**
    * Valida o field SEXO
    * @return true caso o valor esteja setado e seja igual a 0 ou 1
    * false caso nenhum valor esteja setado
    * false caso o valor esteja setado e seja diferente de 0 ou 1
     */
    public boolean validaSexo() {
        if (getInstance().isSetSexo()) {
            return getInstance().getSexo() == 0 | getInstance().getSexo() == 1;
        } else {
            return false;
        }
    }

    /**
     * valida o field STATUS_VISITA_COMPARTILHADA_OUTRO_PROFISSIONAL
     * @return true caso os valores estejam setados e sejam iguais a true ou false
     * true caso nenhum valor esteja setado
     * false caso os valores estejam setados e não sejam iguais a true ou false
    
     */
    public boolean validaStatusVisitaCompartilhada() {
        if (getInstance().isSetStatusVisitaCompartilhadaOutroProfissional()) {
            return getInstance().isStatusVisitaCompartilhadaOutroProfissional()== true | getInstance().isStatusVisitaCompartilhadaOutroProfissional()== false;
        } else {
            return true;
        }

    }

    /**
     * Valida o field MOTIVOS_VISITA
     * @return true caso o field DESFECHO seja igual a 1 e MOTIVOS_VISITA tenha o valor de 1 - 33.
     * true caso o field DESFECHO seja igual a 1 e MOTIVOS_VISITA nao tenha valor setado
     * true caso o field DESFECHO seja diferente de 1 e MOTIVOS_VISITA nao tenha sido setado
     * false caso o field DESFECHO seja igual a 1 e MOTIVOS_VISITA tenha valor diferente da faixa de 1 - 33
     * false caso o field DESFECHO seja diferente de 1 e MOTIVOS_VISISTA tenha sido setado
     */

    public boolean validaMotivosVisita() {
        if (getInstance().getDesfecho()== 1) {
            if (getInstance().isSetMotivosVisita()) {
               for(int i =0;i<getInstance().getMotivosVisitaSize();i++){
                   if(getInstance().getMotivosVisita().get(i)< 1 || getInstance().getMotivosVisita().get(i)>33){
                       return false;
                   }
               }
               return true;
            } else {
                return true;
            }
        } else {
            return !getInstance().isSetMotivosVisita();
        }
    }

    /**
     * Valida o field DESFECHO
     * @return true caso o valor de DESFECHO esteja setado e esteja entre os valores de 1 a 3
     * false caso o valor de DESFECHO esteja setado e diferente dos valores de 1 a 3
     * false caso o valor de DESFECHO não esteja setado
     */
    public boolean validaDesfecho() {
        if (getInstance().isSetDesfecho()) {
            return getInstance().getDesfecho() >= 1 && getInstance().getDesfecho() <= 3;
        } else {
            return false;
        }
    }
    
     /**
     * Valida todos os Fields
     * @return true caso todos os fieds estejam nos padrões aceitos
     * false, caso um atributo nao esteja nos padrões aceitos
     */
    
    public boolean validates(){
        return validaDesfecho() && validaMotivosVisita() && validaStatusVisitaCompartilhada() && validaSexo() &&validaNumCartaoSus() && validaNumProntuario() && validaTurno();
    }

}
