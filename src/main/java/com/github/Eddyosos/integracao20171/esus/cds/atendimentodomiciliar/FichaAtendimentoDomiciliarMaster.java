package com.github.Eddyosos.integracao20171.esus.cds.atendimentodomiciliar;

import br.gov.saude.esus.cds.transport.generated.thrift.atendimentodomiciliar.FichaAtendimentoDomiciliarChildThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.atendimentodomiciliar.FichaAtendimentoDomiciliarMasterThrift;
import com.github.Eddyosos.integracao20171.esus.cds.common.UnicaLotacaoHeader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.thrift.TException;

public class FichaAtendimentoDomiciliarMaster {
    FichaAtendimentoDomiciliarMasterThrift instancia = new FichaAtendimentoDomiciliarMasterThrift();
    
    protected FichaAtendimentoDomiciliarMaster(FichaAtendimentoDomiciliarMasterThrift fichaAtendimentoDomiciliarMasterThrift){
        this.instancia = fichaAtendimentoDomiciliarMasterThrift;
    }

    public FichaAtendimentoDomiciliarMaster deepCopy() {
        return new FichaAtendimentoDomiciliarMaster(instancia.deepCopy());
    }

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @return uuidFicha
     */
    public String getUuidFicha() {
        return instancia.getUuidFicha();
    }

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * Presença obrigatória
     * @param uuidFicha 
     */
    public void setUuidFicha(String uuidFicha) {
        instancia.setUuidFicha(uuidFicha);
    }

    /**
     * Remove o UuidFicha
     */
    public void unsetUuidFicha() {
        instancia.unsetUuidFicha();
    }

    /**
     * Verifica se a ficha possui um uuid
     * @return True caso possua um uuid
     */
    public boolean isSetUuidFicha() {
        return instancia.isSetUuidFicha();
    }

    /**
     * Define se o uuid da ficha foi definido.
     * @param value True caso o uuid tenha sido definido.
     */
    public void setUuidFichaIsSet(boolean value) {
        instancia.setUuidFichaIsSet(value);
    }

    /**
     * Tipo de origem dos dados do registro.
     * @return TpCdsOrigem
     */
    public int getTpCdsOrigem() {
        return instancia.getTpCdsOrigem();
    }

    /**
     * Tipo de origem dos dados do registro.
     * Presença obrigatória.
     * Observações: Utilizar valor 3 (sistemas terceiros).
     * @param tpCdsOrigem Tipo de origem dos dados
     */
    public void setTpCdsOrigem(int tpCdsOrigem) {
        instancia.setTpCdsOrigem(tpCdsOrigem);
    }

    /**
     * Remove o tipo de origem dos dados.
     */
    public void unsetTpCdsOrigem() {
        instancia.unsetTpCdsOrigem();
    }

    /**
     * Verifica se o tipo de origem dos dados do registro foi definido
     * @return True caso TpCdsOrigem tenha sido definido. 
     */
    public boolean isSetTpCdsOrigem() {
        return instancia.isSetTpCdsOrigem();
    }

    /**
     * Define se o tipo de origem dos dados do registro foram inseridos.
     * Presença obrigatoria.
     * @param value True caso deseje informar que os dados foram inseridos.
     */
    public void setTpCdsOrigemIsSet(boolean value) {
        instancia.setTpCdsOrigemIsSet(value);
    }

    /**
     * Profissional que realizou a visita.
     * @return Intancia de UnicaLotacaoHeader contendo informações sobre o profissional que realizou a visita.
     */
    public UnicaLotacaoHeader getHeaderTransport() {
        return new UnicaLotacaoHeader(instancia.getHeaderTransport());
    }

    /**
     * Define o profissional que realizou a visita.
     * Presença Obrigatora.
     * @param headerTransport Profissional que realizou a visita.
     */
    public void setHeaderTransport(UnicaLotacaoHeader headerTransport) {
        instancia.setHeaderTransport(headerTransport.getInstance());
    }

    /**
     * Desassocia o profissional que realizou a visita.
     */
    public void unsetHeaderTransport() {
        instancia.unsetHeaderTransport();
    }

    /**
     * Verifica se a visita domiciliar está atrelada a um profissional
     * @return True caso haja um profissional atrelado.
     */
    public boolean isSetHeaderTransport() {
        return instancia.isSetHeaderTransport();
    }

    /**
     * Define se um profissional foi atrelado a visita.
     * @param value True caso haja um profissional atrelado a visita.
     */
    public void setHeaderTransportIsSet(boolean value) {
        instancia.setHeaderTransportIsSet(value);
    }

    /**
     * Quantidade dos atendimentos realizados pelo profissional.
     * @return A quantidade de atendimentos realizada pelo profissional.
     */
    public int getAtendimentosDomiciliaresSize() {
        return instancia.getAtendimentosDomiciliaresSize();
    }

    /**
     * Lista dos atendimentos realizados pelo profissional.
     * @return uma lista contendo os atendimentos realizados pelo profissional
     */
    public Iterator<FichaAtendimentoDomiciliarChild> getAtendimentosDomiciliaresIterator() {
        
        List<FichaAtendimentoDomiciliarChild> listaFichaAtendimentoDomiciliarChild = new LinkedList<>();
        
        instancia.getAtendimentosDomiciliaresIterator().forEachRemaining((t) -> {
            listaFichaAtendimentoDomiciliarChild.add(new FichaAtendimentoDomiciliarChild(t));
        });
        
        return listaFichaAtendimentoDomiciliarChild.iterator();
    }

    /**
     * Adiciona um atendimento a lista de atendimentos do profissional.
     * @param elem Atendimento a ser adicionado na lista
     */
    public void addToAtendimentosDomiciliares(FichaAtendimentoDomiciliarChild elem) {
        instancia.addToAtendimentosDomiciliares(elem.getInstance());
    }

    /**
     * Todos os atendimentos realizados pelo profissional.
     * @return Uma lista contendo todos os atendimentos realizados pelo profissional
     */
    public List<FichaAtendimentoDomiciliarChild> getAtendimentosDomiciliares() {

        List<FichaAtendimentoDomiciliarChild> listaFichaAtendimentoDomiciliarChild = new LinkedList<>();
        
        instancia.getAtendimentosDomiciliares().forEach((t) -> {
            listaFichaAtendimentoDomiciliarChild.add(new FichaAtendimentoDomiciliarChild(t));
        });
        
        return listaFichaAtendimentoDomiciliarChild;
    }

    /**
     * Adiciona varios atendimentos a lista de atendimentos do profissional.
     * @param atendimentosDomiciliares Lista contendo os atendimentos a serem adicionados ao profissional.
     */
    public void setAtendimentosDomiciliares(List<FichaAtendimentoDomiciliarChild> atendimentosDomiciliares) {
        
        List<FichaAtendimentoDomiciliarChildThrift> listaFichaAtendimentoDomiciliarChild = new LinkedList<>();
        
        atendimentosDomiciliares.forEach((t) -> {
            listaFichaAtendimentoDomiciliarChild.add(t.getInstance());
        });
        
        instancia.setAtendimentosDomiciliares(listaFichaAtendimentoDomiciliarChild);
    }

    /**
     * Remove todos os atendimentos da lista de atendimentos do profissional.
     */
    public void unsetAtendimentosDomiciliares() {
        instancia.unsetAtendimentosDomiciliares();
    }

    /**
     * Verifica se foi notificado o registro de algum registro de atendimento
     * @return True caso tenha sido notificado o registro de um atendimento.
     */
    public boolean isSetAtendimentosDomiciliares() {
        return instancia.isSetAtendimentosDomiciliares();
    }

    /**
     * Notifica que o profissional possui registro de atendimentos cadastrados
     * ou não.
     * @param value True caso deseje notificar que o profissional possui atendimentos cadastrados.
     */
    public void setAtendimentosDomiciliaresIsSet(boolean value) {
        instancia.setAtendimentosDomiciliaresIsSet(value);
    }

    @Override
    public boolean equals(Object that) {
        return instancia.equals(that);
    }

    public boolean equals(FichaAtendimentoDomiciliarMaster that) {
        return instancia.equals(that.getInstance());
    }

    @Override
    public int hashCode() {
        return instancia.hashCode();
    }

    public int compareTo(FichaAtendimentoDomiciliarMaster other) {
        return instancia.compareTo(other.getInstance());
    }

    @Override
    public String toString() {
        return instancia.toString();
    }

    /**
     * Verifica se o conteudo da instancia está consistente.
     * @return True caso esteja valido.
     */
    public boolean validate() {
        try {
            instancia.validate();
        } catch (TException ex) {
            return false;
        }
        return validateUuidFicha() && validatetTpCdsOrigem() && 
                validateHeaderTransport() && atendimentosDomiciliares();
    }

    protected FichaAtendimentoDomiciliarMasterThrift getInstance(){
        return instancia;
    }
        /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * Obrigatório!
     * Regras: É recomendado concatenar o CNES na frente do UUID, de modo que os
     * 7 digitos (CNES) + 1 de hífen somados aos 36 (32 caracteres + 4 hífen) do
     * UUID são a limitação de 44 bytes do campo.
     * @return True caso valido, false caso esteja inconsistente
     */
    public boolean validateUuidFicha(){
        return  instancia.getUuidFicha() != null &&
                instancia.getUuidFicha().length() >= 36 && 
                instancia.getUuidFicha().length() <= 44;
    }
    
    public boolean validatetTpCdsOrigem(){
        return instancia.isSetTpCdsOrigem();
    }
    
    /**
     * Profissional que realizou a visita.
     * @return True caso o header transport seja valido
     */
    public boolean validateHeaderTransport(){
        return instancia.getHeaderTransport() != null && new UnicaLotacaoHeader(instancia.getHeaderTransport()).validate();
    }
    
    public boolean atendimentosDomiciliares(){
        
        if(instancia.getAtendimentosDomiciliares() == null || 
        instancia.getAtendimentosDomiciliares().size() < 1 || 
        instancia.getAtendimentosDomiciliares().size() > 13){
            return false;
        }
        
        for(FichaAtendimentoDomiciliarChild ficha : this.getAtendimentosDomiciliares()){
            if( ! ficha.validate()){
                return false;
            }
        }
        
        return true;
    }
}

