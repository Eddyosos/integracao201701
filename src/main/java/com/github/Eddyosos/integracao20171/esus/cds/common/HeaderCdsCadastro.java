package com.github.Eddyosos.integracao20171.esus.cds.common;

import br.gov.saude.esus.cds.transport.generated.thrift.common.HeaderCdsCadastroThrift;
import com.github.eddyosos.e_sus_ab_factory.cds.common.IHeaderCdsCadastro;

public class HeaderCdsCadastro implements IHeaderCdsCadastro {
    private HeaderCdsCadastroThrift instance;

    public HeaderCdsCadastro() {
        instance = new HeaderCdsCadastroThrift();
    }

    public HeaderCdsCadastro(HeaderCdsCadastroThrift instance) {
        this.instance = instance;
    }
    
    public HeaderCdsCadastroThrift getInstance() {
        return instance;
    }

    /**
     * Valida contra todas as validações da classe, caso uma falhe, esta falha
     * também
     * @return true se válido
     *         false se inválido
     */
    public boolean validates(){
        return validateCnesUnidadeSaude() &&
                validateCnsProfissional() &&
                validateCodigoIbgeMunicipio() &&
                validateDataAtendimento() &&
                validateIneEquipe() &&
                validateMicroarea();
    }
    
    /**
     * Valida CnesUnidadeSaude
     * Para ser válido, deve ter sido inserido préviamente e ter 7 caracteres.
     * @return true se válido
     *          false se inválido
     */
    public boolean validateCnesUnidadeSaude(){
        return instance.isSetCnesUnidadeSaude() &&
                instance.getCnesUnidadeSaude().length() == 7;
    }
    
    /**
     * CNES da unidade de saúde que o profissional está lotado.
     * @return CNES
     */
    @Override
    public String getCnesUnidadeSaude() {
        return instance.getCnesUnidadeSaude();
    }

    /**
     * CNES da unidade de saúde que o profissional está lotado.
     * @param cnesUnidadeSaude 
     */
    @Override
    public void setCnesUnidadeSaude(String cnesUnidadeSaude) {
        instance.setCnesUnidadeSaude(cnesUnidadeSaude);
    }

    /**
     * Valida de cns
     * Para ser válido, deve ter sido setado préviamente com uma string de 15 
     * caracteres, ainda a mesma deve passar no algoritmo descrito em:
     * http://cartaonet.datasus.gov.br/Rotina_Java.doc
     * @return true se válido
     *         false se inválido
     */
    public boolean validateCnsProfissional(){
        String value = instance.getCnsProfissional();
        if(value == null || value.length() != 15) return false;
        switch (value.charAt(0)){
            case '1':
            case '2':
                return validaCns(value);
            case '7':
            case '8':
            case '9':
                return validaCnsProv(value);
            default:
                return false;
        }
    }
    
    /**
     * Como descrito em:
     * http://cartaonet.datasus.gov.br/Rotina_Java.doc
     * @param cns
     * @return 
     */
    private boolean validaCns(String cns){
        if (cns.trim().length() != 15){
            return(false);
        }

        float soma;
        float resto, dv;
        String pis = new String("");
        String resultado = new String("");
        pis = cns.substring(0,11);

        soma = ((Integer.valueOf(pis.substring(0,1)).intValue()) * 15) +
               ((Integer.valueOf(pis.substring(1,2)).intValue()) * 14) +
               ((Integer.valueOf(pis.substring(2,3)).intValue()) * 13) +
               ((Integer.valueOf(pis.substring(3,4)).intValue()) * 12) +
               ((Integer.valueOf(pis.substring(4,5)).intValue()) * 11) +
               ((Integer.valueOf(pis.substring(5,6)).intValue()) * 10) +
               ((Integer.valueOf(pis.substring(6,7)).intValue()) * 9) +
               ((Integer.valueOf(pis.substring(7,8)).intValue()) * 8) +
               ((Integer.valueOf(pis.substring(8,9)).intValue()) * 7) +
               ((Integer.valueOf(pis.substring(9,10)).intValue()) * 6) +
               ((Integer.valueOf(pis.substring(10,11)).intValue()) * 5);

        resto = soma % 11;
        dv = 11 - resto;

        if (dv == 11){
            dv = 0;
        }

        if (dv == 10){
            soma = ((Integer.valueOf(pis.substring(0,1)).intValue()) * 15) +
                   ((Integer.valueOf(pis.substring(1,2)).intValue()) * 14) +
                   ((Integer.valueOf(pis.substring(2,3)).intValue()) * 13) +
                   ((Integer.valueOf(pis.substring(3,4)).intValue()) * 12) +
                   ((Integer.valueOf(pis.substring(4,5)).intValue()) * 11) +
                   ((Integer.valueOf(pis.substring(5,6)).intValue()) * 10) +
                   ((Integer.valueOf(pis.substring(6,7)).intValue()) * 9) +
                   ((Integer.valueOf(pis.substring(7,8)).intValue()) * 8) +
                   ((Integer.valueOf(pis.substring(8,9)).intValue()) * 7) +
                   ((Integer.valueOf(pis.substring(9,10)).intValue()) * 6) +
                   ((Integer.valueOf(pis.substring(10,11)).intValue()) * 5) + 2;

            resto = soma % 11;
            dv = 11 - resto;
            resultado = pis + "001" + String.valueOf((int)dv);
        }else {
            resultado = pis + "000" + String.valueOf((int)dv);
        }

        if (! cns.equals(resultado)){
            return(false);
        }else {
        return(true);}
    }
    
    /**
     * Como descrito em:
     * http://cartaonet.datasus.gov.br/Rotina_Java.doc
     * @param cns
     * @return 
     */
    private boolean validaCnsProv(String cns){
        if (cns.trim().length() != 15){
            return(false);
        }

        float dv;
        float resto,soma;

        soma = ((Integer.valueOf(cns.substring(0,1)).intValue()) * 15) +
               ((Integer.valueOf(cns.substring(1,2)).intValue()) * 14) +
               ((Integer.valueOf(cns.substring(2,3)).intValue()) * 13) +
               ((Integer.valueOf(cns.substring(3,4)).intValue()) * 12) +
               ((Integer.valueOf(cns.substring(4,5)).intValue()) * 11) +
               ((Integer.valueOf(cns.substring(5,6)).intValue()) * 10) +
               ((Integer.valueOf(cns.substring(6,7)).intValue()) * 9) +
               ((Integer.valueOf(cns.substring(7,8)).intValue()) * 8) +
               ((Integer.valueOf(cns.substring(8,9)).intValue()) * 7) +
               ((Integer.valueOf(cns.substring(9,10)).intValue()) * 6) +
               ((Integer.valueOf(cns.substring(10,11)).intValue()) * 5) +
               ((Integer.valueOf(cns.substring(11,12)).intValue()) * 4) +
               ((Integer.valueOf(cns.substring(12,13)).intValue()) * 3) +
               ((Integer.valueOf(cns.substring(13,14)).intValue()) * 2) +
               ((Integer.valueOf(cns.substring(14,15)).intValue()) * 1);

        resto = soma % 11;

        if (resto != 0){
            return(false);
        }else {
        return(true);}
    }
    
    /**
     * CNS do profissional
     * @return CNS
     */
    @Override
    public String getCnsProfissional() {
        return instance.getCnsProfissional();
    }

    /**
     * CNS do profissional
     * @param cnsProfissional 
     */
    @Override
    public void setCnsProfissional(String cnsProfissional) {
        instance.setCnsProfissional(cnsProfissional);
    }

    
    /**
     * Valida Código IBGE do município.
     * Para ser válido, a propriedade deve ter sido atribuida préviamente e deve
     * obedecer ao seguinte regex: "\A\d{7}\z"
     * @return true se válido
     *         false se inválido
     */
    public boolean validateCodigoIbgeMunicipio(){
        String var = instance.getCodigoIbgeMunicipio(); 
        return var != null &&
               var.matches("\\A\\d{7}\\z");
    }
    
    /**
     * Código IBGE do município.
     * @return 
     */
    @Override
    public String getCodigoIbgeMunicipio() {
        return instance.getCodigoIbgeMunicipio();
    }

    /**
     * Código IBGE do município.
     * @param codigoIbgeMunicipio 
     */
    @Override
    public void setCodigoIbgeMunicipio(String codigoIbgeMunicipio) {
        instance.setCodigoIbgeMunicipio(codigoIbgeMunicipio);
    }

    /**
     * Valida Data de atendimento
     * para ser válida, deve ter sido inserida préviamente
     * @return true se válido
     *          false se inválido
     */
    public boolean validateDataAtendimento(){
        return instance.isSetDataAtendimento();
    }
    
    /**
     * Data em que está sendo realizada a ação.
     * @return 
     */
    @Override
    public long getDataAtendimento() {
        return instance.getDataAtendimento();
    }

    /**
     * Data em que está sendo realizada a ação.
     * @param dataAtendimento 
     */
    @Override
    public void setDataAtendimento(long dataAtendimento) {
        instance.setDataAtendimento(dataAtendimento);
    }

    /**
     * Valida IneEquipe
     * Para ser válido, caso tenha sido inserido préviamente, o valor deve ser 
     * uma string de tamanho 10;
     * @return true se válido
     *          false se inválido
     */
    public boolean validateIneEquipe(){
        String value = instance.getIneEquipe();
        return value == null || value.length() == 10;
    }
    
    /**
     * Código do INE da equipe do profissional.
     * @return 
     */
    @Override
    public String getIneEquipe() {
        return instance.getIneEquipe();
    }

    /**
     * Código do INE da equipe do profissional.
     * @param ineEquipe 
     */
    @Override
    public void setIneEquipe(String ineEquipe) {
        instance.setIneEquipe(ineEquipe);
    }

    /**
     * Valida Microarea
     * Para ser válida, se foi inserido préviamente o valor, ele deve estar entre
     * 0 e 2 (inclusivo)
     * @return 
     */
    public boolean validateMicroarea(){
        return !instance.isSetMicroarea() || (
                instance.getMicroarea() >= 0 &&
                instance.getMicroarea() <= 2);
    }
    
    /**
     * Microárea onde está sendo realizada a ação.
     * @return 
     */
    @Override
    public long getMicroarea() {
        return instance.getMicroarea();
    }

    /**
     * Microárea onde está sendo realizada a ação.
     * @param microarea 
     */
    @Override
    public void setMicroarea(long microarea) {
        instance.setMicroarea(microarea);
    }
}

