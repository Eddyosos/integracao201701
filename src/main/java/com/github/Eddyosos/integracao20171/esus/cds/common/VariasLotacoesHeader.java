package com.github.Eddyosos.integracao20171.esus.cds.common;

import br.gov.saude.esus.cds.transport.generated.thrift.common.VariasLotacoesHeaderThrift;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;

public class VariasLotacoesHeader {
    private final VariasLotacoesHeaderThrift instance;

    public VariasLotacoesHeader() {
        instance = new VariasLotacoesHeaderThrift();
    }

    public VariasLotacoesHeader(VariasLotacoesHeaderThrift headerTransport) {
        instance = headerTransport;
    }
    public VariasLotacoesHeaderThrift getInstance() {
        return instance;
    }

    /**
     * Valida esta instancia
     * @return true se válido
     *          false se inválido
     */
    public boolean validates(){
        return validateLotacaoForm() &&
                validateProfissionalCNS1() &&
                validateCboCodigo_2002_1();
    }
    
    public boolean validateLotacaoForm(){
        return instance.isSetLotacaoForm();
    }
    
    /**
     * Profissional responsável pela ação.
     * @return 
     */
    public UnicaLotacaoHeader getLotacaoForm() {
        return new UnicaLotacaoHeader(instance.getLotacaoForm());
    }

    /**
     * Profissional responsável pela ação.
     * @param lotacaoForm 
     */
    public void setLotacaoForm(UnicaLotacaoHeader lotacaoForm) {
        instance.setLotacaoForm(lotacaoForm.getInstance());
    }

     /**
     * Valida de cns
     * Para ser válido, deve ter sido setado préviamente com uma string de 15 
     * caracteres, ainda a mesma deve passar no algoritmo descrito em:
     * http://cartaonet.datasus.gov.br/Rotina_Java.doc
     * @return true se válido
     *         false se inválido
     */
    public boolean validateProfissionalCNS(String cns){
        if(cns == null || cns.length() != 15) return false;
        switch (cns.charAt(0)){
            case '1':
            case '2':
                return validaCns(cns);
            case '7':
            case '8':
            case '9':
                return validaCnsProv(cns);
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
     * Valida ProfissionalCNS1
     * De acordo com validateProfissionalCNS
     * @return true para válido
     *          false para inválido
     */
    public boolean validateProfissionalCNS1(){
        return validateProfissionalCNS(instance.getProfissionalCNS1());
    }
    
    /**
     * CNS do profissional1.
     * @return 
     */
    public String getProfissionalCNS1() {
        return instance.getProfissionalCNS1();
    }

    /**
     * CNS do profissional1.
     * @param profissionalCNS1 
     */
    public void setProfissionalCNS1(String profissionalCNS1) {
        instance.setProfissionalCNS1(profissionalCNS1);
    }

    /**
     * Valida CboCodigo_2002
     * Válido se for préviamente inserido e obedeça ao regex: \A\d{6}\z
     * @return true se válido
     *          false se inválido
     */
    public boolean validateCboCodigo_2002(String cbo){
        return cbo != null && cbo.matches("\\A\\d{6}\\z");
    }
    
    /**
     * Valida CboCodigo_2002_1
     * De acordo com validateCboCodigo_2002
     * @return 
     */
    public boolean validateCboCodigo_2002_1(){
        return validateCboCodigo_2002(instance.getCboCodigo_2002_1());
    }
    
    /**
     * Código do CBO do profissional1.
     * @return 
     */
    public String getCboCodigo_2002_1() {
        return instance.getCboCodigo_2002_1();
    }

    /**
     * Código do CBO do profissional1.
     * @param cboCodigo_2002_1 
     */
    public void setCboCodigo_2002_1(String cboCodigo_2002_1) {
        instance.setCboCodigo_2002_1(cboCodigo_2002_1);
    }

    /**
     * Valida ProfissionalCNS2
     * De acordo com validateProfissionalCNS
     * @return true para válido
     *          false para inválido
     */
    public boolean validateProfissionalCNS2(){
        return validateProfissionalCNS(instance.getProfissionalCNS2());
    }
    
    /**
     * CNS do profissional2.
     * @return 
     */
    public String getProfissionalCNS2() {
        return instance.getProfissionalCNS2();
    }

    /**
     * CNS do profissional2.
     * @param profissionalCNS2 
     */
    public void setProfissionalCNS2(String profissionalCNS2) {
        instance.setProfissionalCNS2(profissionalCNS2);
    }

    /**
     * Valida CboCodigo_2002_1
     * De acordo com validateCboCodigo_2002
     * @return 
     */
    public boolean validateCboCodigo_2002_2(){
        return validateCboCodigo_2002(instance.getCboCodigo_2002_2());
    }
    
    /**
     * Código do CBO do profissional2.
     * @return 
     */
    public String getCboCodigo_2002_2() {
        return instance.getCboCodigo_2002_2();
    }

    /**
     * Código do CBO do profissional2.
     * @param cboCodigo_2002_2 
     */
    public void setCboCodigo_2002_2(String cboCodigo_2002_2) {
        instance.setCboCodigo_2002_2(cboCodigo_2002_2);
    }
    
}

