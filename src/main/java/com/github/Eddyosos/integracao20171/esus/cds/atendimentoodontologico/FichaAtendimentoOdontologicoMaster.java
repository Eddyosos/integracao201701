package com.github.Eddyosos.integracao20171.esus.cds.atendimentoodontologico;

import br.gov.saude.esus.cds.transport.generated.thrift.atendimentoodontologico.FichaAtendimentoOdontologicoChildThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.atendimentoodontologico.FichaAtendimentoOdontologicoMasterThrift;
import com.github.Eddyosos.integracao20171.esus.cds.common.VariasLotacoesHeader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.thrift.TException;

public class FichaAtendimentoOdontologicoMaster {
    FichaAtendimentoOdontologicoMasterThrift instancia = new FichaAtendimentoOdontologicoMasterThrift();
    
    protected FichaAtendimentoOdontologicoMaster(FichaAtendimentoOdontologicoMasterThrift fichaAtendimentoOdontologicoMasterThrift){
        this.instancia = fichaAtendimentoOdontologicoMasterThrift;
    }

    /**
     * Realiza uma copia da ficha.
     * @return copia da ficha.
     */
    public FichaAtendimentoOdontologicoMaster deepCopy() {
        return new FichaAtendimentoOdontologicoMaster(instancia.deepCopy());
    }

    /**
     * Remove todos os dados da ficha.
     */
    public void clear() {
        instancia.clear();
    }

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * 
     * @return Código uuid.
     */
    public String getUuidFicha() {
        return instancia.getUuidFicha();
    }

    /**
     * Define o código uuid da ficha.
     * 
     * Presenca obrigatória.
     * Tamanho mínimo: 36
     * Tamanho maximo: 44
     * Regras: É recomendado concatenar o CNES na frente do UUID,
     * de modo que os 7 digitos (CNES) + 1 de hífen somados aos 36 (32 caracteres + 4 hífen)
     * do UUID são a limitação de 44 bytes do campo. Formato canônico.
     * 
     * @param uuidFicha Código uuid da ficha.
     */
    public void setUuidFicha(String uuidFicha) {
        instancia.setUuidFicha(uuidFicha);
    }

    /**
     * Remove o código uuid da ficha.
     */
    public void unsetUuidFicha() {
        instancia.unsetUuidFicha();
    }

     /**
     * Verifica se o código uuid da ficha foi declarado.
     * @return True caso o código uuid da ficha tenha sido declarado.
     */
    public boolean isSetUuidFicha() {
        return instancia.isSetUuidFicha();
    }

     /**
     * Declara o estado do código uuid da ficha.
     * @param value True caso o código uuid da ficha tenha sido inserido.
     */
    public void setUuidFichaIsSet(boolean value) {
        instancia.setUuidFichaIsSet(value);
    }

    /**
     * Profissional que realizou a visita.
     * @return Profissional que realizou a visita.
     */
    public VariasLotacoesHeader getHeaderTransport() {
        return new VariasLotacoesHeader(instancia.getHeaderTransport());
    }

    /**
     * Define o profissional que realizou a visita.
     * 
     * Presença obrigatória.
     * 
     * @param headerTransport Profissional que realizou a visita.
     */
    public void setHeaderTransport(VariasLotacoesHeader headerTransport) {
        instancia.setHeaderTransport(headerTransport.getInstance());
    }

    /**
     * Remove o profissional que realizou a visita.
     */
    public void unsetHeaderTransport() {
        instancia.unsetHeaderTransport();
    }

    /**
     * Verifica se o profissional que realizou a visita foi declarado.
     * @return True caso o profissional que realizou a visita tenha sido inserido.
     */
    public boolean isSetHeaderTransport() {
        return instancia.isSetHeaderTransport();
    }

    /**
     * Define se o profissional que realizou a visita doi inserido.
     * @param value True caso profissional que realizou a visita tenha sido inserido.
     */
    public void setHeaderTransportIsSet(boolean value) {
        instancia.setHeaderTransportIsSet(value);
    }

    /**
     * Quantidade de registros de atendimento.
     * 
     * @return Quantidade de registros de atendimento.
     */
    public int getAtendimentosOdontologicosSize() {
        return instancia.getAtendimentosOdontologicosSize();
    }

    /**
     * Registro dos atendimentos.
     * 
     * @return Registro dos atendimentos.
     */
    public Iterator<FichaAtendimentoOdontologicoChild> getAtendimentosOdontologicosIterator() {
        List<FichaAtendimentoOdontologicoChild> listaFichaAtendimentoOdontologicoChild = new LinkedList<>();
        
        instancia.getAtendimentosOdontologicosIterator().forEachRemaining((elemento) -> {
            listaFichaAtendimentoOdontologicoChild.add(new FichaAtendimentoOdontologicoChild(elemento));
        });
        
        return listaFichaAtendimentoOdontologicoChild.iterator();
    }

    /**
     * Adiciona um atendimento a lista de registro.
     * 
     * Presença obrigatória.
     * 
     * Mínimo: 1
     * Máximo 13
     * 
     * @param elem Registro do atendimento.
     */
    public void addToAtendimentosOdontologicos(FichaAtendimentoOdontologicoChild elem) {
        instancia.addToAtendimentosOdontologicos(elem.getInstance());
    }

    /**
     * Registro dos atendimentos.
     * 
     * @return Registro dos atendimentos.
     */
    public List<FichaAtendimentoOdontologicoChild> getAtendimentosOdontologicos() {
        List<FichaAtendimentoOdontologicoChild> listaFichaAtendimentoOdontologicoChild = new LinkedList<>();
        
        instancia.getAtendimentosOdontologicos().forEach((elemento) -> {
            listaFichaAtendimentoOdontologicoChild.add(new FichaAtendimentoOdontologicoChild(elemento));
        });
        
        return listaFichaAtendimentoOdontologicoChild;
    }

    /**
     * Adiciona vários atendimentos a lista de registro.
     * 
     * Presença obrigatória.
     * 
     * Mínimo: 1
     * Máximo 13
     * 
     * @param atendimentosOdontologicos Lista de registros de atendimentos.
     */
    public void setAtendimentosOdontologicos(List<FichaAtendimentoOdontologicoChild> atendimentosOdontologicos) {
        List<FichaAtendimentoOdontologicoChildThrift> listaFichaAtendimentoOdontologicoChildThrift = new LinkedList<>();
        
        atendimentosOdontologicos.forEach((elemento) -> {
            listaFichaAtendimentoOdontologicoChildThrift.add(elemento.getInstance());
        });
        
        instancia.setAtendimentosOdontologicos(listaFichaAtendimentoOdontologicoChildThrift);
    }

    /**
     * Remove os atendimentos.
     */
    public void unsetAtendimentosOdontologicos() {
        instancia.unsetAtendimentosOdontologicos();
    }

    /**
     * Verifica se os atendimentos foram declarados.
     * @return True caso tenham sido declarados.
     */
    public boolean isSetAtendimentosOdontologicos() {
        return instancia.isSetAtendimentosOdontologicos();
    }

    /**
     * Declara que os atendimentos foram inseridos.
     * 
     * @param value True para informar que os atendimentos foram inseridos.
     */
    public void setAtendimentosOdontologicosIsSet(boolean value) {
        instancia.setAtendimentosOdontologicosIsSet(value);
    }

    /**
     * Tipo de origem dos dados do registro.
     * @return Tipo de origem dos dados do registro.
     */
    public int getTpCdsOrigem() {
        return instancia.getTpCdsOrigem();
    }

    /**
     * Define o tipo de origem dos dados do registro.
     * 
     * Presenca obrigatória.
     * Observação: Utilizar valor 3 (sistemas terceiros).
     * 
     * @param tpCdsOrigem Tipo de origem dos dados do registro.
     */
    public void setTpCdsOrigem(int tpCdsOrigem) {
        instancia.setTpCdsOrigem(tpCdsOrigem);
    }

    /**
     * Remove o tipo de origem dos dados do registro.
     */
    public void unsetTpCdsOrigem() {
        instancia.unsetTpCdsOrigem();
    }

    /**
     * Verifica se o tipo de origem dos dados do registro foi declarado.
     * @return True caso o tipo de origem dos dados do registro tenha sido inserido.
     */
    public boolean isSetTpCdsOrigem() {
        return instancia.isSetTpCdsOrigem();
    }

    /**
     * Declara se o tipo de origem dos dados do registro foi inserido.
     * @param value True caso o tipo de origem dos dados do registro tenha sido inserido.
     */
    public void setTpCdsOrigemIsSet(boolean value) {
        instancia.setTpCdsOrigemIsSet(value);
    }

    /**
     * Compara dois objetos
     * @param that Objeto a comparar
     * @return True caso sejam iguais, False caso contrario.
     */
    @Override
    public boolean equals(Object that) {
        return instancia.equals(that);
    }

    /**
     * Compara com outra ficha de atendimento odontológico.
     * @param that Ficha a se comparar
     * @return True caso sejam iguais.
     */
    public boolean equals(FichaAtendimentoOdontologicoMaster that) {
        return instancia.equals(that.getInstance());
    }

    /**
     * HashCode
     * 
     * @return HashCode
     */
    @Override
    public int hashCode() {
        return instancia.hashCode();
    }

    public int compareTo(FichaAtendimentoOdontologicoMaster other) {
        return instancia.compareTo(other.getInstance());
    }

    @Override
    public String toString() {
        return instancia.toString();
    }

    public void validate() throws TException {
        instancia.validate();
    }

    /**
     * Intancia thrift da classe.
     * 
     * @return Intancia thrift da classe.
     */
    protected FichaAtendimentoOdontologicoMasterThrift getInstance(){
        return instancia;
    }
    
    
}

