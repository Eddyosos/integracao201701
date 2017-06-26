package com.github.Eddyosos.integracao20171.esus.cds.atendimentoodontologico;

import br.gov.saude.esus.cds.transport.generated.thrift.atendimentoodontologico.FichaAtendimentoOdontologicoChildThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.atendimentoodontologico.FichaAtendimentoOdontologicoMasterThrift;
import com.github.Eddyosos.integracao20171.esus.cds.common.VariasLotacoesHeader;
import com.github.eddyosos.e_sus_ab_factory.cds.atendimentoodontologico.IFichaAtendimentoOdontologicoChild;
import com.github.eddyosos.e_sus_ab_factory.cds.atendimentoodontologico.IFichaAtendimentoOdontologicoMaster;
import com.github.eddyosos.e_sus_ab_factory.cds.common.IVariasLotacoesHeader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.thrift.TException;

public class FichaAtendimentoOdontologicoMaster implements IFichaAtendimentoOdontologicoMaster {
    private FichaAtendimentoOdontologicoMasterThrift instancia = new FichaAtendimentoOdontologicoMasterThrift();
    
    public FichaAtendimentoOdontologicoMaster(FichaAtendimentoOdontologicoMasterThrift fichaAtendimentoOdontologicoMasterThrift){
        this.instancia = fichaAtendimentoOdontologicoMasterThrift;
    }

    /**
     * Remove todos os dados da ficha.
     */
    @Override
    public void clear() {
        instancia.clear();
    }

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * 
     * @return Código uuid.
     */
    @Override
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
    @Override
    public void setUuidFicha(String uuidFicha) {
        instancia.setUuidFicha(uuidFicha);
    }

    /**
     * Remove o código uuid da ficha.
     */
    @Override
    public void unsetUuidFicha() {
        instancia.unsetUuidFicha();
    }

     /**
     * Verifica se o código uuid da ficha foi declarado.
     * @return True caso o código uuid da ficha tenha sido declarado.
     */
    @Override
    public boolean isSetUuidFicha() {
        return instancia.isSetUuidFicha();
    }

     /**
     * Declara o estado do código uuid da ficha.
     * @param value True caso o código uuid da ficha tenha sido inserido.
     */
    @Override
    public void setUuidFichaIsSet(boolean value) {
        instancia.setUuidFichaIsSet(value);
    }

    /**
     * Profissional que realizou a visita.
     * @return Profissional que realizou a visita.
     */
    @Override
    public IVariasLotacoesHeader getHeaderTransport() {
        return new VariasLotacoesHeader(instancia.getHeaderTransport());
    }

    /**
     * Define o profissional que realizou a visita.
     * 
     * Presença obrigatória.
     * 
     * @param headerTransport Profissional que realizou a visita.
     */
    @Override
    public void setHeaderTransport(IVariasLotacoesHeader headerTransport) {
        instancia.setHeaderTransport(headerTransport.getInstance());
    }

    /**
     * Remove o profissional que realizou a visita.
     */
    @Override
    public void unsetHeaderTransport() {
        instancia.unsetHeaderTransport();
    }

    /**
     * Verifica se o profissional que realizou a visita foi declarado.
     * @return True caso o profissional que realizou a visita tenha sido inserido.
     */
    @Override
    public boolean isSetHeaderTransport() {
        return instancia.isSetHeaderTransport();
    }

    /**
     * Define se o profissional que realizou a visita doi inserido.
     * @param value True caso profissional que realizou a visita tenha sido inserido.
     */
    @Override
    public void setHeaderTransportIsSet(boolean value) {
        instancia.setHeaderTransportIsSet(value);
    }

    /**
     * Quantidade de registros de atendimento.
     * 
     * @return Quantidade de registros de atendimento.
     */
    @Override
    public int getAtendimentosOdontologicosSize() {
        return instancia.getAtendimentosOdontologicosSize();
    }

    /**
     * Registro dos atendimentos.
     * 
     * @return Registro dos atendimentos.
     */
    @Override
    public Iterator<IFichaAtendimentoOdontologicoChild> getAtendimentosOdontologicosIterator() {
        List<IFichaAtendimentoOdontologicoChild> listaFichaAtendimentoOdontologicoChild = new LinkedList<>();
        
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
    @Override
    public void addToAtendimentosOdontologicos(IFichaAtendimentoOdontologicoChild elem) {
        instancia.addToAtendimentosOdontologicos(elem.getInstance());
    }

    /**
     * Registro dos atendimentos.
     * 
     * @return Registro dos atendimentos.
     */
    @Override
    public List<IFichaAtendimentoOdontologicoChild> getAtendimentosOdontologicos() {
        List<IFichaAtendimentoOdontologicoChild> listaFichaAtendimentoOdontologicoChild = new LinkedList<>();
        
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
    @Override
    public void setAtendimentosOdontologicos(List<IFichaAtendimentoOdontologicoChild> atendimentosOdontologicos) {
        List<FichaAtendimentoOdontologicoChildThrift> listaFichaAtendimentoOdontologicoChildThrift = new LinkedList<>();
        
        atendimentosOdontologicos.forEach((elemento) -> {
            listaFichaAtendimentoOdontologicoChildThrift.add(elemento.getInstance());
        });
        
        instancia.setAtendimentosOdontologicos(listaFichaAtendimentoOdontologicoChildThrift);
    }

    /**
     * Remove os atendimentos.
     */
    @Override
    public void unsetAtendimentosOdontologicos() {
        instancia.unsetAtendimentosOdontologicos();
    }

    /**
     * Verifica se os atendimentos foram declarados.
     * @return True caso tenham sido declarados.
     */
    @Override
    public boolean isSetAtendimentosOdontologicos() {
        return instancia.isSetAtendimentosOdontologicos();
    }

    /**
     * Declara que os atendimentos foram inseridos.
     * 
     * @param value True para informar que os atendimentos foram inseridos.
     */
    @Override
    public void setAtendimentosOdontologicosIsSet(boolean value) {
        instancia.setAtendimentosOdontologicosIsSet(value);
    }

    /**
     * Tipo de origem dos dados do registro.
     * @return Tipo de origem dos dados do registro.
     */
    @Override
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
    @Override
    public void setTpCdsOrigem(int tpCdsOrigem) {
        instancia.setTpCdsOrigem(tpCdsOrigem);
    }

    /**
     * Remove o tipo de origem dos dados do registro.
     */
    @Override
    public void unsetTpCdsOrigem() {
        instancia.unsetTpCdsOrigem();
    }

    /**
     * Verifica se o tipo de origem dos dados do registro foi declarado.
     * @return True caso o tipo de origem dos dados do registro tenha sido inserido.
     */
    @Override
    public boolean isSetTpCdsOrigem() {
        return instancia.isSetTpCdsOrigem();
    }

    /**
     * Declara se o tipo de origem dos dados do registro foi inserido.
     * @param value True caso o tipo de origem dos dados do registro tenha sido inserido.
     */
    @Override
    public void setTpCdsOrigemIsSet(boolean value) {
        instancia.setTpCdsOrigemIsSet(value);
    }

    @Override
    public boolean validate() {
        try {
            instancia.validate();
        } catch (TException ex) {
            return false;
        }
        
        return validateUuidFicha() && validateHeaderTransport() && 
                validateAtendimentosOdontologicos() && validatetTpCdsOrigem();
    }

    /**
     * Intancia thrift da classe.
     * 
     * @return Intancia thrift da classe.
     */
    @Override
    public FichaAtendimentoOdontologicoMasterThrift getInstance(){
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
    @Override
    public boolean validateUuidFicha(){
        return  instancia.getUuidFicha() != null &&
                instancia.getUuidFicha().length() >= 36 && 
                instancia.getUuidFicha().length() <= 44;
    }
     
    /**
     * Profissional que realizou a visita.
     * 
     * @return True caso o header transport seja valido
     */
    @Override
    public boolean validateHeaderTransport(){
        return instancia.getHeaderTransport() != null && 
                instancia.isSetHeaderTransport() &&
                new VariasLotacoesHeader(instancia.getHeaderTransport()).validates();

    }
    
    /**
     * Valida os registros de atendimento.
     * 
     * Presença obrigatória.
     * Mínimo:1
     * Máximo:13
     * 
     * @return True caso sejam validos, False caso contrario.
     */
    @Override
    public boolean validateAtendimentosOdontologicos(){
        
        if(instancia.isSetAtendimentosOdontologicos()){
            if( instancia.getAtendimentosOdontologicosSize() >= 1 && 
                    instancia.getAtendimentosOdontologicosSize() <= 13){
                return true;
            }
        }
        
        return false;
    }
    
    /**
     * Valida se o tipo de origem foi declarado.
     * 
     * @return True caso o tipo de origem dos dados tenha sido declarado.
     */
    @Override
    public boolean validatetTpCdsOrigem(){
        return instancia.isSetTpCdsOrigem();
    }
    
}

