package integrator;

import br.gov.saude.esus.cds.transport.generated.thrift.procedimento.FichaProcedimentoMasterThrift;
import br.gov.saude.esus.transport.common.api.configuracaodestino.VersaoThrift;
import br.gov.saude.esus.transport.common.generated.thrift.DadoInstalacaoThrift;
import br.gov.saude.esus.transport.common.generated.thrift.DadoTransporteThrift;
import compactor.SerializadorThrift;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FichaCadastroIndividual  {
    private FichaProcedimentoMasterThrift fichaProcedimento = new FichaProcedimentoMasterThrift();
    DadoInstalacaoThrift originadora = new DadoInstalacaoThrift();
    DadoInstalacaoThrift remetente = new DadoInstalacaoThrift();
    private long TIPO_DADO_SERIALIZADO_FICHA_PROCEDIMENTO = 7;
    private final String EXTENSAO_EXPORT = ".esus";
    
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
