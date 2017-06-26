package com.github.Eddyosos.integracao20171.esus.cds.atividadecoletiva;

import br.gov.saude.esus.cds.transport.generated.thrift.atividadecoletiva.ProfissionalCboRowItemThrift;


public class ProfissionalCboRowItem {
    ProfissionalCboRowItemThrift profissionalCboRowItemThrift = new ProfissionalCboRowItemThrift();
    
    protected ProfissionalCboRowItem(ProfissionalCboRowItemThrift profissionalCboRowItemThrift){
        this.profissionalCboRowItemThrift = profissionalCboRowItemThrift;
    }
    /**
     * Devolve o valor de cns
     * @return cns String
     */
    public String getCns() {
        return profissionalCboRowItemThrift.getCns();
    }
    /**
     * Altera o valor de cns
     * @param cns String
     */
    public void setCns(String cns) {
        profissionalCboRowItemThrift.setCns(cns);
    }
    /**
     * Devolve o valor de codigoCbo2002
     * @return codigoCbo2002 String
     */

    public String getCodigoCbo2002() {
        return profissionalCboRowItemThrift.getCodigoCbo2002();
    }
    /**
     * Atlera o valor de codigoCbo2002
     * @param codigoCbo2002 String
     */
    public void setCodigoCbo2002(String codigoCbo2002) {
        profissionalCboRowItemThrift.setCodigoCbo2002(codigoCbo2002);
    }
    /**
     * Devolve uma instancia de ProfissionalCboRowItemThrift
     * @return profissionalCboRowItemThrift
     */
    protected ProfissionalCboRowItemThrift getInstance(){
        return profissionalCboRowItemThrift;
    }
    
    
    
}

