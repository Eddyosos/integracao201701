package com.github.Eddyosos.integracao20171.esus.cds.atendimentoodontologico;

import br.gov.saude.esus.cds.transport.generated.thrift.atendimentoodontologico.ProcedimentoQuantidadeThrift;
import com.github.eddyosos.e_sus_ab_factory.cds.atendimentoodontologico.IProcedimentoQuantidade;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.thrift.TException;

public class ProcedimentoQuantidade implements IProcedimentoQuantidade {
    private ProcedimentoQuantidadeThrift instancia = new ProcedimentoQuantidadeThrift();
    
    public ProcedimentoQuantidade(ProcedimentoQuantidadeThrift t){
        this.instancia = t;
    }

    /**
     * Código do procedimento no MS.
     * 
     * @return Código do procedimento no MS.
     */
    @Override
    public String getCoMsProcedimento() {
        return instancia.getCoMsProcedimento();
    }

    /**
     * Define o código do procedimento no MS.
     * 
     * Presença obrigatória.
     * 
     * @param coMsProcedimento Código do procedimento no MS.
     */
    @Override
    public void setCoMsProcedimento(String coMsProcedimento) {
        instancia.setCoMsProcedimento(coMsProcedimento);
    }


    /**
     * Quantidade de procedimentos realizados
     * 
     * @return Quantidade de procedimentos realizados
     */
    @Override
    public int getQuantidade() {
        return instancia.getQuantidade();
    }

    /**
     * Define a quantidade de procedimentos realizados.
     * 
     * Regra: valor máximo 99.
     * 
     * @param quantidade Quantidade de procedimentos realizados.
     */
    @Override
    public void setQuantidade(int quantidade) {
        instancia.setQuantidade(quantidade);
    }

    /**
     * Valida os elementos da classe
     * 
     * @return True se a classe for valida, caso contrario False.
     */
    public boolean validates(){
        try {
            instancia.validate();
        } catch (TException ex) {
            Logger.getLogger(ProcedimentoQuantidade.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return true;
    }

    /**
     * Retorna a instância thrift da classe.
     * 
     * @return Instância thrift
     */
    @Override
    public ProcedimentoQuantidadeThrift getInstance(){
        return instancia;
    }
    
    /**
     * Valida coMsProcedimento
     * 
     * presença obrigatória.
     * 
     * @return True se estiver presente, caso contrario False.
     */
    public boolean validateCoMsProcedimento(){
        return instancia.isSetCoMsProcedimento();
    }
    
    public boolean validateQuantidade(){
        
        if( ! instancia.isSetQuantidade()) return false;
        
        return ! (instancia.getQuantidade() < 0 || instancia.getQuantidade() > 100);
    }
    
}

