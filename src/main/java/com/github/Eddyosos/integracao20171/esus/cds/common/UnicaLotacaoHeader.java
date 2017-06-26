package com.github.Eddyosos.integracao20171.esus.cds.common;

import br.gov.saude.esus.cds.transport.generated.thrift.common.UnicaLotacaoHeaderThrift;
import com.github.eddyosos.e_sus_ab_factory.cds.common.IUnicaLotacaoHeader;

public class UnicaLotacaoHeader implements IUnicaLotacaoHeader {
    private final UnicaLotacaoHeaderThrift instance;

    public UnicaLotacaoHeader() {
        instance = new UnicaLotacaoHeaderThrift();
    }

    public UnicaLotacaoHeader(UnicaLotacaoHeaderThrift instance) {
        this.instance = instance;
    }

    public UnicaLotacaoHeaderThrift getInstance() {
        return instance;
    }

    /**
     * Valida esta instancia
     * @return true se válido
     *          false se inválido
     */
    public boolean validates(){
        return validateProfissionalCNS() &&
                validateCboCodigo_2002() &&
                validateCnes() &&
                validateIne() &&
                validateDataAtendimento() &&
                validateCodigoIbgeMunicipio();
    }
    
     /**
     * Valida de cns
     * Para ser válido, deve ter sido setado préviamente com uma string de 15 
     * caracteres, ainda a mesma deve passar no algoritmo descrito em:
     * http://cartaonet.datasus.gov.br/Rotina_Java.doc
     * @return true se válido
     *         false se inválido
     */
    public boolean validateProfissionalCNS(){
        String value = instance.getProfissionalCNS();
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
     * CNS do profissional.
     * @return 
     */
    @Override
    public String getProfissionalCNS() {
        return instance.getProfissionalCNS();
    }

    /**
     * CNS do profissional.
     * @param profissionalCNS 
     */
    @Override
    public void setProfissionalCNS(String profissionalCNS) {
        instance.setProfissionalCNS(profissionalCNS);
    }

    /**
     * Valida CboCodigo_2002
     * Válido se for préviamente inserido e obedeça ao regex: \A\d{6}\z
     * @return true se válido
     *          false se inválido
     */
    public boolean validateCboCodigo_2002(){
        String value = instance.getCboCodigo_2002();
        return value != null && value.matches("\\A\\d{6}\\z");
    }
    
    /**
     * Código do CBO do profissional.
     * @return 
     */
    @Override
    public String getCboCodigo_2002() {
        return instance.getCboCodigo_2002();
    }

    /**
     * Código do CBO do profissional.
     * @param cboCodigo_2002 
     */
    @Override
    public void setCboCodigo_2002(String cboCodigo_2002) {
        instance.setCboCodigo_2002(cboCodigo_2002);
    }

    
    /**
     * Valida CnesUnidadeSaude
     * Para ser válido, deve ter sido inserido préviamente e ter 7 caracteres.
     * @return true se válido
     *          false se inválido
     */
    public boolean validateCnes(){
        return instance.isSetCnes() &&
                instance.getCnes().length() == 7;
    }
    
    /**
     * Código do CNES da unidade de saúde que o profissional está lotado.
     * @return 
     */
    @Override
    public String getCnes() {
        return instance.getCnes();
    }

    /**
     * Código do CNES da unidade de saúde que o profissional está lotado.
     * @param cnes 
     */
    @Override
    public void setCnes(String cnes) {
        instance.setCnes(cnes);
    }

    /**
     * Valida IneEquipe
     * Para ser válido, caso tenha sido inserido préviamente, o valor deve ser 
     * uma string de tamanho 10;
     * @return true se válido
     *          false se inválido
     */
    public boolean validateIne(){
        String value = instance.getIne();
        return value == null || value.length() == 10;
    }
    
    /**
     * Código INE da equipe do profissional.
     * @return 
     */
    @Override
    public String getIne() {
        return instance.getIne();
    }

    /**
     * Código INE da equipe do profissional.
     * @param ine 
     */
    @Override
    public void setIne(String ine) {
        instance.setIne(ine);
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
}

