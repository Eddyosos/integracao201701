package com.github.Eddyosos.integracao20171.esus.cds.procedimento;

import br.gov.saude.esus.cds.transport.generated.thrift.common.UnicaLotacaoHeaderThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.procedimento.FichaProcedimentoChildThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.procedimento.FichaProcedimentoMasterThrift;
import br.gov.saude.esus.transport.common.api.configuracaodestino.VersaoThrift;
import br.gov.saude.esus.transport.common.generated.thrift.DadoInstalacaoThrift;
import br.gov.saude.esus.transport.common.generated.thrift.DadoTransporteThrift;
import com.github.Eddyosos.integracao20171.compactor.SerializadorThrift;
import com.github.Eddyosos.integracao20171.esus.cds.common.UnicaLotacaoHeader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FichaProcedimentoMaster  {
    private FichaProcedimentoMasterThrift fichaProcedimento = new FichaProcedimentoMasterThrift();
    DadoInstalacaoThrift originadora = new DadoInstalacaoThrift();
    DadoInstalacaoThrift remetente = new DadoInstalacaoThrift();
    private long TIPO_DADO_SERIALIZADO_FICHA_PROCEDIMENTO = 7;
    private final String EXTENSAO_EXPORT = ".esus";

    public FichaProcedimentoMasterThrift getInstance(){
        return this.fichaProcedimento;
    }
    
    public void clear() {
        fichaProcedimento.clear();
    }

    public String getUuidFicha() {
        return fichaProcedimento.getUuidFicha();
    }

    public void setUuidFicha(String uuidFicha) {
        fichaProcedimento.setUuidFicha(uuidFicha);
    }

    public void unsetUuidFicha() {
        fichaProcedimento.unsetUuidFicha();
    }

    public boolean isSetUuidFicha() {
        return fichaProcedimento.isSetUuidFicha();
    }

    public void setUuidFichaIsSet(boolean value) {
        fichaProcedimento.setUuidFichaIsSet(value);
    }

    public int getTpCdsOrigem() {
        return fichaProcedimento.getTpCdsOrigem();
    }

    public void setTpCdsOrigem(int tpCdsOrigem) {
        fichaProcedimento.setTpCdsOrigem(tpCdsOrigem);
    }

    public void unsetTpCdsOrigem() {
        fichaProcedimento.unsetTpCdsOrigem();
    }

    public boolean isSetTpCdsOrigem() {
        return fichaProcedimento.isSetTpCdsOrigem();
    }

    public void setTpCdsOrigemIsSet(boolean value) {
        fichaProcedimento.setTpCdsOrigemIsSet(value);
    }

    public UnicaLotacaoHeader getHeaderTransport() {
        return new UnicaLotacaoHeader(fichaProcedimento.getHeaderTransport());
    }

    public void setHeaderTransport(UnicaLotacaoHeader headerTransport) {
        fichaProcedimento.setHeaderTransport(headerTransport.getInstance());
    }

    public void unsetHeaderTransport() {
        fichaProcedimento.unsetHeaderTransport();
    }

    public boolean isSetHeaderTransport() {
        return fichaProcedimento.isSetHeaderTransport();
    }

    public void setHeaderTransportIsSet(boolean value) {
        fichaProcedimento.setHeaderTransportIsSet(value);
    }

    public int getAtendProcedimentosSize() {
        return fichaProcedimento.getAtendProcedimentosSize();
    }

    public Iterator<FichaProcedimentoChild> getAtendProcedimentosIterator() {
        List<FichaProcedimentoChild> list = new LinkedList<>();
        fichaProcedimento.getAtendProcedimentosIterator().forEachRemaining((item) -> {
            list.add(new FichaProcedimentoChild(item));
        });
        
        return list.iterator();
    }

    public void addToAtendProcedimentos(FichaProcedimentoChild elem) {
        fichaProcedimento.addToAtendProcedimentos(elem.getInstance());
    }

    public List<FichaProcedimentoChild> getAtendProcedimentos() {
        List<FichaProcedimentoChild> list = new LinkedList<>();
        for(FichaProcedimentoChildThrift element : fichaProcedimento.getAtendProcedimentos()){
            list.add(new FichaProcedimentoChild(element));
        }
        
        return list;
    }

    public void setAtendProcedimentos(List<FichaProcedimentoChild> atendProcedimentos) {
        List<FichaProcedimentoChildThrift> list = new LinkedList<>();
        atendProcedimentos.forEach((elem) -> {
            list.add(elem.getInstance());
        });
        
        fichaProcedimento.setAtendProcedimentos(list);
    }

    public void unsetAtendProcedimentos() {
        fichaProcedimento.unsetAtendProcedimentos();
    }

    public boolean isSetAtendProcedimentos() {
        return fichaProcedimento.isSetAtendProcedimentos();
    }

    public void setAtendProcedimentosIsSet(boolean value) {
        fichaProcedimento.setAtendProcedimentosIsSet(value);
    }

    public long getNumTotalAfericaoPa() {
        return fichaProcedimento.getNumTotalAfericaoPa();
    }

    public void setNumTotalAfericaoPa(long numTotalAfericaoPa) {
        fichaProcedimento.setNumTotalAfericaoPa(numTotalAfericaoPa);
    }

    public void unsetNumTotalAfericaoPa() {
        fichaProcedimento.unsetNumTotalAfericaoPa();
    }

    public boolean isSetNumTotalAfericaoPa() {
        return fichaProcedimento.isSetNumTotalAfericaoPa();
    }

    public void setNumTotalAfericaoPaIsSet(boolean value) {
        fichaProcedimento.setNumTotalAfericaoPaIsSet(value);
    }

    public long getNumTotalGlicemiaCapilar() {
        return fichaProcedimento.getNumTotalGlicemiaCapilar();
    }

    public void setNumTotalGlicemiaCapilar(long numTotalGlicemiaCapilar) {
        fichaProcedimento.setNumTotalGlicemiaCapilar(numTotalGlicemiaCapilar);
    }

    public void unsetNumTotalGlicemiaCapilar() {
        fichaProcedimento.unsetNumTotalGlicemiaCapilar();
    }

    public boolean isSetNumTotalGlicemiaCapilar() {
        return fichaProcedimento.isSetNumTotalGlicemiaCapilar();
    }

    public void setNumTotalGlicemiaCapilarIsSet(boolean value) {
        fichaProcedimento.setNumTotalGlicemiaCapilarIsSet(value);
    }

    public long getNumTotalAfericaoTemperatura() {
        return fichaProcedimento.getNumTotalAfericaoTemperatura();
    }

    public void setNumTotalAfericaoTemperatura(long numTotalAfericaoTemperatura) {
        fichaProcedimento.setNumTotalAfericaoTemperatura(numTotalAfericaoTemperatura);
    }

    public void unsetNumTotalAfericaoTemperatura() {
        fichaProcedimento.unsetNumTotalAfericaoTemperatura();
    }

    public boolean isSetNumTotalAfericaoTemperatura() {
        return fichaProcedimento.isSetNumTotalAfericaoTemperatura();
    }

    public void setNumTotalAfericaoTemperaturaIsSet(boolean value) {
        fichaProcedimento.setNumTotalAfericaoTemperaturaIsSet(value);
    }

    public long getNumTotalMedicaoAltura() {
        return fichaProcedimento.getNumTotalMedicaoAltura();
    }

    public void setNumTotalMedicaoAltura(long numTotalMedicaoAltura) {
        fichaProcedimento.setNumTotalMedicaoAltura(numTotalMedicaoAltura);
    }

    public void unsetNumTotalMedicaoAltura() {
        fichaProcedimento.unsetNumTotalMedicaoAltura();
    }

    public boolean isSetNumTotalMedicaoAltura() {
        return fichaProcedimento.isSetNumTotalMedicaoAltura();
    }

    public void setNumTotalMedicaoAlturaIsSet(boolean value) {
        fichaProcedimento.setNumTotalMedicaoAlturaIsSet(value);
    }

    public long getNumTotalCurativoSimples() {
        return fichaProcedimento.getNumTotalCurativoSimples();
    }

    public void setNumTotalCurativoSimples(long numTotalCurativoSimples) {
        fichaProcedimento.setNumTotalCurativoSimples(numTotalCurativoSimples);
    }

    public void unsetNumTotalCurativoSimples() {
        fichaProcedimento.unsetNumTotalCurativoSimples();
    }

    public boolean isSetNumTotalCurativoSimples() {
        return fichaProcedimento.isSetNumTotalCurativoSimples();
    }

    public void setNumTotalCurativoSimplesIsSet(boolean value) {
        fichaProcedimento.setNumTotalCurativoSimplesIsSet(value);
    }

    public long getNumTotalMedicaoPeso() {
        return fichaProcedimento.getNumTotalMedicaoPeso();
    }

    public void setNumTotalMedicaoPeso(long numTotalMedicaoPeso) {
        fichaProcedimento.setNumTotalMedicaoPeso(numTotalMedicaoPeso);
    }

    public void unsetNumTotalMedicaoPeso() {
        fichaProcedimento.unsetNumTotalMedicaoPeso();
    }

    public boolean isSetNumTotalMedicaoPeso() {
        return fichaProcedimento.isSetNumTotalMedicaoPeso();
    }

    public void setNumTotalMedicaoPesoIsSet(boolean value) {
        fichaProcedimento.setNumTotalMedicaoPesoIsSet(value);
    }

    public long getNumTotalColetaMaterialParaExameLaboratorial() {
        return fichaProcedimento.getNumTotalColetaMaterialParaExameLaboratorial();
    }

    public void setNumTotalColetaMaterialParaExameLaboratorial(long numTotalColetaMaterialParaExameLaboratorial) {
        fichaProcedimento.setNumTotalColetaMaterialParaExameLaboratorial(numTotalColetaMaterialParaExameLaboratorial);
    }

    public void unsetNumTotalColetaMaterialParaExameLaboratorial() {
        fichaProcedimento.unsetNumTotalColetaMaterialParaExameLaboratorial();
    }

    public boolean isSetNumTotalColetaMaterialParaExameLaboratorial() {
        return fichaProcedimento.isSetNumTotalColetaMaterialParaExameLaboratorial();
    }

    public void setNumTotalColetaMaterialParaExameLaboratorialIsSet(boolean value) {
        fichaProcedimento.setNumTotalColetaMaterialParaExameLaboratorialIsSet(value);
    }

    public boolean equals(Object that) {
        return fichaProcedimento.equals(that);
    }

    public boolean equals(FichaProcedimentoMaster that) {
        return fichaProcedimento.equals(that);
    }

    public int hashCode() {
        return fichaProcedimento.hashCode();
    }

    public int compareTo(FichaProcedimentoMaster other) {
        return fichaProcedimento.compareTo(other.getInstance());
    }

    public String toString() {
        return fichaProcedimento.toString();
    }
    
    public void zipGenerate(){
        if(!this.validates()){
            return;
        }
        
        DadoTransporteThrift dadoTransporteThrift = this.getDadoTransporte(this.fichaProcedimento);
        byte[] fichaSerializada = SerializadorThrift.serializar(this.fichaProcedimento);
        dadoTransporteThrift.setTipoDadoSerializado(TIPO_DADO_SERIALIZADO_FICHA_PROCEDIMENTO);
	dadoTransporteThrift.setDadoSerializado(fichaSerializada);
        
        VersaoThrift versaoThrift = new VersaoThrift(2, 0, 0);
	dadoTransporteThrift.setVersao(versaoThrift);
        
        try {
            File zipFile = new File(System.getProperty("user.home") + "/fichaProcedimento.zip");
            ZipOutputStream outputStream = new ZipOutputStream(new FileOutputStream(zipFile));
            String entryName = dadoTransporteThrift.getUuidDadoSerializado() + EXTENSAO_EXPORT;
            outputStream.putNextEntry(new ZipEntry(entryName));
            byte[] dadoTransporteSerializado = SerializadorThrift.serializar(dadoTransporteThrift);
            outputStream.write(dadoTransporteSerializado);

            outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
    
    private DadoTransporteThrift getDadoTransporte(FichaProcedimentoMasterThrift ficha) {
        DadoTransporteThrift dadoTransporteThrift = new DadoTransporteThrift();

        dadoTransporteThrift.setUuidDadoSerializado(ficha.getUuidFicha());
        dadoTransporteThrift.setIneDadoSerializado(ficha.getHeaderTransport().getIne());
        dadoTransporteThrift.setCodIbge(ficha.getHeaderTransport().getCodigoIbgeMunicipio());
        dadoTransporteThrift.setCnesDadoSerializado(ficha.getHeaderTransport().getCnes());
        dadoTransporteThrift.setOriginadora(this.originadora);
        dadoTransporteThrift.setRemetente(this.remetente);
        dadoTransporteThrift.setNumLote(0l);

        return dadoTransporteThrift;
    }
    
    /*
    Chama todos os metodos validadores para validar a consistencia do dado.
    OBS: Esse metodo e apenas um exemplo de como deve ser feito, nao esta
    completo
    */
    private boolean validates(){      
        if(!this.numTotalMedicaoPesoValidates()){
            return false;
        }
        if(!this.numTotalMedicaoAlturaValidates()){
            return false;
        }
        
        return true;
    }
    
    /*
    Validacoes de todos os campos do dado em questao. OBS: As validacoes abaixo
    sao apenas um exemplo de como as validacoes deverao ser feitas, 1 metodo por
    campo, verificando todas as regras necessarias para aquele campo neste 
    metodo
    Deverao ser validados todos os campos dos objetos: fichaProcedimento,
    originadora e remetente
    */
    private boolean numTotalMedicaoAlturaValidates(){
    if(this.fichaProcedimento.getNumTotalMedicaoAltura() <= 0){
            return false;
        }
    
        return true;
    }
    
    private boolean numTotalMedicaoPesoValidates(){
        if(this.fichaProcedimento.getNumTotalMedicaoPeso() <= 0){
            return false;
        }
        
        return true;
    }
}