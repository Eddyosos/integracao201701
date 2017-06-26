package com.github.Eddyosos.integracao20171.esus.cds.atividadecoletiva;

import br.gov.saude.esus.cds.transport.generated.thrift.atividadecoletiva.ProfissionalCboRowItemThrift;
import com.github.eddyosos.e_sus_ab_factory.cds.atividadecoletiva.IProfissionalCboRowItem;


public class ProfissionalCboRowItem implements IProfissionalCboRowItem {
    private ProfissionalCboRowItemThrift profissionalCboRowItemThrift = new ProfissionalCboRowItemThrift();
    
    public ProfissionalCboRowItem(ProfissionalCboRowItemThrift profissionalCboRowItemThrift){
        this.profissionalCboRowItemThrift = profissionalCboRowItemThrift;
    }
    /**
     * Devolve o valor de cns
     * @return cns String
     */
    @Override
    public String getCns() {
        return profissionalCboRowItemThrift.getCns();
    }
    /**
     * Altera o valor de cns
     * @param cns String
     */
    @Override
    public void setCns(String cns) {
        profissionalCboRowItemThrift.setCns(cns);
    }
    /**
     * Devolve o valor de codigoCbo2002
     * @return codigoCbo2002 String
     */

    @Override
    public String getCodigoCbo2002() {
        return profissionalCboRowItemThrift.getCodigoCbo2002();
    }
    /**
     * Atlera o valor de codigoCbo2002
     * @param codigoCbo2002 String
     */
    @Override
    public void setCodigoCbo2002(String codigoCbo2002) {
        profissionalCboRowItemThrift.setCodigoCbo2002(codigoCbo2002);
    }
    /**
     * Devolve uma instancia de ProfissionalCboRowItemThrift
     * @return profissionalCboRowItemThrift
     */
    @Override
    public ProfissionalCboRowItemThrift getInstance(){
        return profissionalCboRowItemThrift;
    }
    
    
    
}

