package com.github.Eddyosos.integracao20171.esus.cds.atividadeindividual;

import br.gov.saude.esus.cds.transport.generated.thrift.atividadeindividual.OutrosSiaThrift;
import com.github.eddyosos.e_sus_ab_factory.cds.atividadeindividual.IOutrosSia;
import java.util.List;

public class OutrosSia implements IOutrosSia {

    private final OutrosSiaThrift instance;

    public OutrosSia() {
        instance = new OutrosSiaThrift();
    }
    
    public OutrosSia(OutrosSiaThrift thrift) {
        instance = thrift;
    }

    @Override
    public OutrosSiaThrift getInstance() {
        return instance;
    }
    
    /**
     * Valida a instancia
     * @return true se válido
     *          false se inválido
     */
    @Override
    public boolean validates(){
        return validateCodigoExame() &&
                validateSolicitadoAvaliado();
    }

    /**
     * Valida CodigoExame.
     * Para ser válido deve:
     * 1- Ter sido inserido préviamente
     * 2- Atender ao regex: \A\d{10}\z
     * @return 
     */
    @Override
    public boolean validateCodigoExame(){
        return instance.isSetCodigoExame() &&
                instance.getCodigoExame().matches("\\A\\d{10}\\z");
    }
    
    /**
     * Código do exame solicitado ou avaliado.
     * @return 
     */
    @Override
    public String getCodigoExame() {
        return instance.getCodigoExame();
    }

    /**
     * Código do exame solicitado ou avaliado.
     * @param codigoExame 
     */
    @Override
    public void setCodigoExame(String codigoExame) {
        instance.setCodigoExame(codigoExame);
    }

    /**
     * Valida SolicitadoAvaliado.
     * Para ser válido deve ter sido inserido préviamente.
     * @return true se válido
     *          false se inválido
     */
    @Override
    public boolean validateSolicitadoAvaliado(){
        return instance.isSetSolicitadoAvaliado();
    }
    
    /**
     * Código do indicador se o exame foi Solicitado e / ou Avaliado.
     * @return
     */
    @Override
    public List<String> getSolicitadoAvaliado() {
        return instance.getSolicitadoAvaliado();
    }

    /**
     * Código do indicador se o exame foi Solicitado e / ou Avaliado.
     * @param solicitadoAvaliado 
     */
    @Override
    public void setSolicitadoAvaliado(List<String> solicitadoAvaliado) {
        instance.setSolicitadoAvaliado(solicitadoAvaliado);
    }
}

