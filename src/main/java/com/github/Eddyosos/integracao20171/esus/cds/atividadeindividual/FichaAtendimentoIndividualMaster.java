package com.github.Eddyosos.integracao20171.esus.cds.atividadeindividual;

import br.gov.saude.esus.cds.transport.generated.thrift.atividadeindividual.FichaAtendimentoIndividualChildThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.atividadeindividual.FichaAtendimentoIndividualMasterThrift;
import com.github.Eddyosos.integracao20171.esus.cds.common.VariasLotacoesHeader;
import com.github.eddyosos.e_sus_ab_factory.cds.atividadeindividual.IFichaAtendimentoIndividualChild;
import com.github.eddyosos.e_sus_ab_factory.cds.atividadeindividual.IFichaAtendimentoIndividualMaster;
import com.github.eddyosos.e_sus_ab_factory.cds.common.IVariasLotacoesHeader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class FichaAtendimentoIndividualMaster implements IFichaAtendimentoIndividualMaster {
    private final FichaAtendimentoIndividualMasterThrift instance;

    public FichaAtendimentoIndividualMaster() {
        instance = new FichaAtendimentoIndividualMasterThrift();
    }

    @Override
    public void clear() {
        instance.clear();
    }

    /**
     * Valida a instancia
     * @return true se válida
     *          false se inválida
     */
    @Override
    public boolean validates(){
        return validateHeaderTransport() && 
                validateAtendimentosIndividuais() &&
                validateUuidFicha() &&
                validateTpCdsOrigem();
        
    }
    
    /**
     * Valida HeaderTransport.
     * Para ser válida deve ter sido inserido préviamente.
     * @return true se válido
     *          false se inválido
     */
    @Override
    public boolean validateHeaderTransport(){
        return instance.isSetHeaderTransport();
    }
    
    /**
     * Profissionais que realizaram o atendimento
     * @return 
     */
    @Override
    public IVariasLotacoesHeader getHeaderTransport() {
        return new VariasLotacoesHeader(instance.getHeaderTransport());
    }

    /**
     * Profissionais que realizaram o atendimento
     * @param headerTransport 
     */
    @Override
    public void setHeaderTransport(IVariasLotacoesHeader headerTransport) {
        instance.setHeaderTransport(headerTransport.getInstance());
    }

    /**
     * Valida AtendimentosIndividuais.
     * Para ser válido deve:
     * 1- Ter sido préviamente inserido
     * 2- Ter entre 1 e 13 atendimentos
     * @return true se válido
     *          false se inválido
     */
    @Override
    public boolean validateAtendimentosIndividuais(){
        int var = instance.getAtendimentosIndividuaisSize();
        return instance.isSetAtendimentosIndividuais() &&
                var >= 1 && var <= 13;
    }
    
    /**
     * Registro individualizado dos atendimentos.
     * @return 
     */
    @Override
    public List<IFichaAtendimentoIndividualChild> getAtendimentosIndividuais() {
        List<IFichaAtendimentoIndividualChild> list = new ArrayList<>();
        instance.getAtendimentosIndividuaisIterator().forEachRemaining((t) -> {
            list.add(new FichaAtendimentoIndividualChild(t));
        });
        
        return list;
    }

    /**
     * Registro individualizado dos atendimentos.
     * @param atendimentosIndividuais 
     */
    @Override
    public void setAtendimentosIndividuais(List<IFichaAtendimentoIndividualChild> atendimentosIndividuais) {
        List<FichaAtendimentoIndividualChildThrift> list = new LinkedList<>();
        atendimentosIndividuais.iterator().forEachRemaining((t) -> {
            list.add(t.getInstance());
        });
        instance.setAtendimentosIndividuais(list);
    }

    /**
     * Valida UuidFicha.
     * Para ser válido deve:
     * 1- Ter sido préviamente inserido
     * 2- Ter tamanho entre 36 e 44 (inclusivo)
     * @return true se válido
     *          false se inválido
     */
    @Override
    public boolean validateUuidFicha(){
        final String var = instance.getUuidFicha();
        if(!instance.isSetUuidFicha() || 
                var.length() < 36 || 
                var.length() > 44) 
            return false;
        try {
            UUID.fromString(var.substring(0, 36));
        } catch(Exception ex){
            return false;
        }
        return true;
    }
    
    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @return 
     */
    @Override
    public String getUuidFicha() {
        return instance.getUuidFicha();
    }

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @param uuidFicha 
     */
    @Override
    public void setUuidFicha(String uuidFicha) {
        instance.setUuidFicha(uuidFicha);
    }

    /**
     * Valida TpCdsOrigem.
     * Para ser valido deve ter sido inserido préviamente
     * @return true se válido
     *          false se inválido
     */
    @Override
    public boolean validateTpCdsOrigem(){
        return instance.isSetTpCdsOrigem();
    }
    
    /**
     * Tipo de origem dos dados do registro.
     * @return 
     */
    @Override
    public int getTpCdsOrigem() {
        return instance.getTpCdsOrigem();
    }

    /**
     * Tipo de origem dos dados do registro.
     * @param tpCdsOrigem 
     */
    @Override
    public void setTpCdsOrigem(int tpCdsOrigem) {
        instance.setTpCdsOrigem(tpCdsOrigem);
    }
}

