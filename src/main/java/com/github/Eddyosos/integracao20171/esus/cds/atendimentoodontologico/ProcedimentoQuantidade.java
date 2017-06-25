package com.github.Eddyosos.integracao20171.esus.cds.atendimentoodontologico;

import br.gov.saude.esus.cds.transport.generated.thrift.atendimentoodontologico.ProcedimentoQuantidadeThrift;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.thrift.TException;

public class ProcedimentoQuantidade {
    ProcedimentoQuantidadeThrift instancia = new ProcedimentoQuantidadeThrift();
    
    protected ProcedimentoQuantidade(ProcedimentoQuantidadeThrift t){
        this.instancia = t;
    }

    /**
     * Realiza uma copia da ficha.
     * @return copia da ficha.
     */
    public ProcedimentoQuantidade deepCopy() {
        return new ProcedimentoQuantidade(instancia.deepCopy());
    }

    /**
     * Remove todos os dados da ficha.
     */
    public void clear() {
        instancia.clear();
    }

    /**
     * Código do procedimento no MS.
     * 
     * @return Código do procedimento no MS.
     */
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
    public void setCoMsProcedimento(String coMsProcedimento) {
        instancia.setCoMsProcedimento(coMsProcedimento);
    }

    /**
     * Remove o código do procedimento no MS.
     */
    public void unsetCoMsProcedimento() {
        instancia.unsetCoMsProcedimento();
    }

    /**
     * Verifica se o código do procedimento no MS foi declarado.
     * 
     * @return True se tiver sido declarado, False caso não.
     */
    public boolean isSetCoMsProcedimento() {
        return instancia.isSetCoMsProcedimento();
    }

    /**
     * Declara que o código do procedimento no MS foi inserido.
     * 
     * @param value True para declarar que foi inserido, Falso para declarar que não foi.
     */
    public void setCoMsProcedimentoIsSet(boolean value) {
        instancia.setCoMsProcedimentoIsSet(value);
    }

    /**
     * Quantidade de procedimentos realizados
     * 
     * @return Quantidade de procedimentos realizados
     */
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
    public void setQuantidade(int quantidade) {
        instancia.setQuantidade(quantidade);
    }

    /**
     * Remove a quantidade de procedimentos realizados.
     */
    public void unsetQuantidade() {
        instancia.unsetQuantidade();
    }

    /**
     * Verifica se a quantidade de procedimentos realizados foi declarada.
     * 
     * @return True se tiver sido declarada, caso contrario False.
     */
    public boolean isSetQuantidade() {
        return instancia.isSetQuantidade();
    }

    /**
     * Declara que a quantidade de procedimentos realizados foi inserida.
     * 
     * @param value True para declarar que foi inserido, caso contrario False.
     */
    public void setQuantidadeIsSet(boolean value) {
        instancia.setQuantidadeIsSet(value);
    }

    @Override
    public boolean equals(Object that) {
        return instancia.equals(that);
    }

    public boolean equals(ProcedimentoQuantidade that) {
        return instancia.equals(that.getInstance());
    }

    @Override
    public int hashCode() {
        return instancia.hashCode();
    }

    public int compareTo(ProcedimentoQuantidade other) {
        return instancia.compareTo(other.getInstance());
    }

    @Override
    public String toString() {
        return instancia.toString();
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
    protected ProcedimentoQuantidadeThrift getInstance(){
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

