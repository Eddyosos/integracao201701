package com.github.Eddyosos.integracao20171.esus.cds.atendimentodomiciliar;

import br.gov.saude.esus.cds.transport.generated.thrift.atendimentodomiciliar.FichaAtendimentoDomiciliarChildThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.atendimentodomiciliar.FichaAtendimentoDomiciliarMasterThrift;
import com.github.Eddyosos.integracao20171.compactor.SerializadorThrift;
import com.github.Eddyosos.integracao20171.esus.cds.common.UnicaLotacaoHeader;
import com.github.Eddyosos.integracao20171.esus.transport.DadoTransporte;
import com.github.eddyosos.e_sus_ab_factory.cds.atendimentodomiciliar.IFichaAtendimentoDOmiciliarMaster;
import com.github.eddyosos.e_sus_ab_factory.cds.atendimentodomiciliar.IFichaAtendimentoDomiciliarChild;
import com.github.eddyosos.e_sus_ab_factory.cds.common.IUnicaLotacaoHeader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.apache.thrift.TException;

public class FichaAtendimentoDomiciliarMaster implements IFichaAtendimentoDOmiciliarMaster {
    private FichaAtendimentoDomiciliarMasterThrift instancia;
    private long TIPO_DADO_SERIALIZADO_FICHA_PROCEDIMENTO = 3;
    private final static String EXTENSAO_EXPORT = ".esus13";
    private DadoTransporte dadoTransporteThrift;

    public FichaAtendimentoDomiciliarMaster(FichaAtendimentoDomiciliarMasterThrift fichaAtendimentoDomiciliarMasterThrift){
        this.instancia = fichaAtendimentoDomiciliarMasterThrift;
    }

    @Override
    public FichaAtendimentoDomiciliarMasterThrift getInstance(){
        return instancia;
    }
    
    public FichaAtendimentoDomiciliarMaster deepCopy() {
        return new FichaAtendimentoDomiciliarMaster(instancia.deepCopy());
    }

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @return uuidFicha
     */
    @Override
    public String getUuidFicha() {
        return instancia.getUuidFicha();
    }

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * Presença obrigatória
     * @param uuidFicha 
     */
    @Override
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
    @Override
    public int getTpCdsOrigem() {
        return instancia.getTpCdsOrigem();
    }

    /**
     * Tipo de origem dos dados do registro.
     * Presença obrigatória.
     * Observações: Utilizar valor 3 (sistemas terceiros).
     * @param tpCdsOrigem Tipo de origem dos dados
     */
    @Override
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
    @Override
    public UnicaLotacaoHeader getHeaderTransport() {
        return new UnicaLotacaoHeader(instancia.getHeaderTransport());
    }

    /**
     * Define o profissional que realizou a visita.
     * Presença Obrigatora.
     * @param headerTransport Profissional que realizou a visita.
     */
    @Override
    public void setHeaderTransport(IUnicaLotacaoHeader headerTransport) {
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
    @Override
    public int getAtendimentosDomiciliaresSize() {
        return instancia.getAtendimentosDomiciliaresSize();
    }

    /**
     * Lista dos atendimentos realizados pelo profissional.
     * @return uma lista contendo os atendimentos realizados pelo profissional
     */
    @Override
    public Iterator<IFichaAtendimentoDomiciliarChild> getAtendimentosDomiciliaresIterator() {
        
        List<IFichaAtendimentoDomiciliarChild> listaFichaAtendimentoDomiciliarChild = new LinkedList<>();
        
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
    @Override
    public List<IFichaAtendimentoDomiciliarChild> getAtendimentosDomiciliares() {

        List<IFichaAtendimentoDomiciliarChild> listaFichaAtendimentoDomiciliarChild = new LinkedList<>();
        
        instancia.getAtendimentosDomiciliares().forEach((t) -> {
            listaFichaAtendimentoDomiciliarChild.add(new FichaAtendimentoDomiciliarChild(t));
        });
        
        return listaFichaAtendimentoDomiciliarChild;
    }

    /**
     * Adiciona varios atendimentos a lista de atendimentos do profissional.
     * @param atendimentosDomiciliares Lista contendo os atendimentos a serem adicionados ao profissional.
     */
    @Override
    public void setAtendimentosDomiciliares(List<IFichaAtendimentoDomiciliarChild> atendimentosDomiciliares) {
        
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
        return instancia.getHeaderTransport() != null && new UnicaLotacaoHeader(instancia.getHeaderTransport()).validates();
    }
    
    /**
     * Valida todos os atendimentos docmiciliares.
     * 
     * Tamanho mínimo: 1
     * Tamanho máximo: 12
     * 
     * @return true se válido
     *          false se inválido
     */
    public boolean atendimentosDomiciliares(){
        
        if(instancia.getAtendimentosDomiciliares() == null || 
        instancia.getAtendimentosDomiciliares().size() <= 1 || 
        instancia.getAtendimentosDomiciliares().size() >= 13){
            return false;
        }
        
        return true;
    }
    
    public void setDadoTransporte(DadoTransporte originadora){
        this.dadoTransporteThrift = originadora;
    }
    public DadoTransporte getDadoTransporte(){
        return this.dadoTransporteThrift;
    }

    public void zipGenerate(){
        if(!this.validate() && this.dadoTransporteThrift != null){
            return;
        }

        byte[] fichaSerializada = SerializadorThrift.serializar(this.instancia);
        dadoTransporteThrift.setTipoDadoSerializado(TIPO_DADO_SERIALIZADO_FICHA_PROCEDIMENTO);
        dadoTransporteThrift.setDadoSerializado(fichaSerializada);

        try {
            File zipFile = new File(System.getProperty("user.home") + "/fichaAtendimentoDomiciliar.zip");
            ZipOutputStream outputStream = new ZipOutputStream(new FileOutputStream(zipFile));
            String entryName = dadoTransporteThrift.getUuidDadoSerializado() + EXTENSAO_EXPORT;
            outputStream.putNextEntry(new ZipEntry(entryName));
            byte[] dadoTransporteSerializado = SerializadorThrift.serializar(dadoTransporteThrift.getInstance());
            outputStream.write(dadoTransporteSerializado);

            outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}

