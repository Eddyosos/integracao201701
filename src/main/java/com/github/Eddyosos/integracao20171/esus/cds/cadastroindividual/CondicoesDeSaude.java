package com.github.Eddyosos.integracao20171.esus.cds.cadastroindividual;

import br.gov.saude.esus.cds.transport.generated.thrift.cadastroindividual.CondicoesDeSaudeThrift;
import java.util.Iterator;
import java.util.List;
import org.apache.thrift.TException;

public class CondicoesDeSaude {
    
    private CondicoesDeSaudeThrift condicoesDeSaudeTrift = new CondicoesDeSaudeThrift();
    
    protected CondicoesDeSaude( CondicoesDeSaudeThrift condicoesDeSaudeTrift){
        this.condicoesDeSaudeTrift = condicoesDeSaudeTrift;
    }
    
    public String getDescricaoCausaInternacaoEm12Meses() {
        return condicoesDeSaudeTrift.getDescricaoCausaInternacaoEm12Meses();
    }

    public void setDescricaoCausaInternacaoEm12Meses(String descricaoCausaInternacaoEm12Meses) {
        condicoesDeSaudeTrift.setDescricaoCausaInternacaoEm12Meses(descricaoCausaInternacaoEm12Meses);
    }

    public void unsetDescricaoCausaInternacaoEm12Meses() {
        condicoesDeSaudeTrift.unsetDescricaoCausaInternacaoEm12Meses();
    }

    public boolean isSetDescricaoCausaInternacaoEm12Meses() {
        return condicoesDeSaudeTrift.isSetDescricaoCausaInternacaoEm12Meses();
    }

    public void setDescricaoCausaInternacaoEm12MesesIsSet(boolean value) {
        condicoesDeSaudeTrift.setDescricaoCausaInternacaoEm12MesesIsSet(value);
    }

    public String getDescricaoOutraCondicao1() {
        return condicoesDeSaudeTrift.getDescricaoOutraCondicao1();
    }

    public void setDescricaoOutraCondicao1(String descricaoOutraCondicao1) {
        condicoesDeSaudeTrift.setDescricaoOutraCondicao1(descricaoOutraCondicao1);
    }

    public void unsetDescricaoOutraCondicao1() {
        condicoesDeSaudeTrift.unsetDescricaoOutraCondicao1();
    }

    public boolean isSetDescricaoOutraCondicao1() {
        return condicoesDeSaudeTrift.isSetDescricaoOutraCondicao1();
    }

    public void setDescricaoOutraCondicao1IsSet(boolean value) {
        condicoesDeSaudeTrift.setDescricaoOutraCondicao1IsSet(value);
    }

    public String getDescricaoOutraCondicao2() {
        return condicoesDeSaudeTrift.getDescricaoOutraCondicao2();
    }

    public void setDescricaoOutraCondicao2(String descricaoOutraCondicao2) {
        condicoesDeSaudeTrift.setDescricaoOutraCondicao2(descricaoOutraCondicao2);
    }

    public void unsetDescricaoOutraCondicao2() {
        condicoesDeSaudeTrift.unsetDescricaoOutraCondicao2();
    }

    public boolean isSetDescricaoOutraCondicao2() {
        return condicoesDeSaudeTrift.isSetDescricaoOutraCondicao2();
    }

    public void setDescricaoOutraCondicao2IsSet(boolean value) {
        condicoesDeSaudeTrift.setDescricaoOutraCondicao2IsSet(value);
    }

    public String getDescricaoOutraCondicao3() {
        return condicoesDeSaudeTrift.getDescricaoOutraCondicao3();
    }

    public void setDescricaoOutraCondicao3(String descricaoOutraCondicao3) {
        condicoesDeSaudeTrift.setDescricaoOutraCondicao3(descricaoOutraCondicao3);
    }

    public void unsetDescricaoOutraCondicao3() {
        condicoesDeSaudeTrift.unsetDescricaoOutraCondicao3();
    }

    public boolean isSetDescricaoOutraCondicao3() {
        return condicoesDeSaudeTrift.isSetDescricaoOutraCondicao3();
    }

    public void setDescricaoOutraCondicao3IsSet(boolean value) {
        condicoesDeSaudeTrift.setDescricaoOutraCondicao3IsSet(value);
    }

    public String getDescricaoPlantasMedicinaisUsadas() {
        return condicoesDeSaudeTrift.getDescricaoPlantasMedicinaisUsadas();
    }

    public void setDescricaoPlantasMedicinaisUsadas(String descricaoPlantasMedicinaisUsadas) {
        condicoesDeSaudeTrift.setDescricaoPlantasMedicinaisUsadas(descricaoPlantasMedicinaisUsadas);
    }

    public void unsetDescricaoPlantasMedicinaisUsadas() {
        condicoesDeSaudeTrift.unsetDescricaoPlantasMedicinaisUsadas();
    }

    public boolean isSetDescricaoPlantasMedicinaisUsadas() {
        return condicoesDeSaudeTrift.isSetDescricaoPlantasMedicinaisUsadas();
    }

    public void setDescricaoPlantasMedicinaisUsadasIsSet(boolean value) {
        condicoesDeSaudeTrift.setDescricaoPlantasMedicinaisUsadasIsSet(value);
    }

    public int getDoencaCardiacaSize() {
        return condicoesDeSaudeTrift.getDoencaCardiacaSize();
    }

    public Iterator<Long> getDoencaCardiacaIterator() {
        return condicoesDeSaudeTrift.getDoencaCardiacaIterator();
    }

    public List<Long> getDoencaCardiaca() {
        return condicoesDeSaudeTrift.getDoencaCardiaca();
    }

    public void setDoencaCardiaca(List<Long> doencaCardiaca) {
        condicoesDeSaudeTrift.setDoencaCardiaca(doencaCardiaca);
    }

    public void unsetDoencaCardiaca() {
        condicoesDeSaudeTrift.unsetDoencaCardiaca();
    }

    public boolean isSetDoencaCardiaca() {
        return condicoesDeSaudeTrift.isSetDoencaCardiaca();
    }

    public void setDoencaCardiacaIsSet(boolean value) {
        condicoesDeSaudeTrift.setDoencaCardiacaIsSet(value);
    }

    public int getDoencaRespiratoriaSize() {
        return condicoesDeSaudeTrift.getDoencaRespiratoriaSize();
    }

    public Iterator<Long> getDoencaRespiratoriaIterator() {
        return condicoesDeSaudeTrift.getDoencaRespiratoriaIterator();
    }

    public List<Long> getDoencaRespiratoria() {
        return condicoesDeSaudeTrift.getDoencaRespiratoria();
    }

    public void setDoencaRespiratoria(List<Long> doencaRespiratoria) {
        condicoesDeSaudeTrift.setDoencaRespiratoria(doencaRespiratoria);
    }

    public void unsetDoencaRespiratoria() {
        condicoesDeSaudeTrift.unsetDoencaRespiratoria();
    }

    public boolean isSetDoencaRespiratoria() {
        return condicoesDeSaudeTrift.isSetDoencaRespiratoria();
    }

    public void setDoencaRespiratoriaIsSet(boolean value) {
        condicoesDeSaudeTrift.setDoencaRespiratoriaIsSet(value);
    }

    public int getDoencaRinsSize() {
        return condicoesDeSaudeTrift.getDoencaRinsSize();
    }

    public Iterator<Long> getDoencaRinsIterator() {
        return condicoesDeSaudeTrift.getDoencaRinsIterator();
    }

    public List<Long> getDoencaRins() {
        return condicoesDeSaudeTrift.getDoencaRins();
    }

    public void setDoencaRins(List<Long> doencaRins) {
        condicoesDeSaudeTrift.setDoencaRins(doencaRins);
    }

    public void unsetDoencaRins() {
        condicoesDeSaudeTrift.unsetDoencaRins();
    }

    public boolean isSetDoencaRins() {
        return condicoesDeSaudeTrift.isSetDoencaRins();
    }

    public void setDoencaRinsIsSet(boolean value) {
        condicoesDeSaudeTrift.setDoencaRinsIsSet(value);
    }

    public String getMaternidadeDeReferencia() {
        return condicoesDeSaudeTrift.getMaternidadeDeReferencia();
    }

    public void setMaternidadeDeReferencia(String maternidadeDeReferencia) {
        condicoesDeSaudeTrift.setMaternidadeDeReferencia(maternidadeDeReferencia);
    }

    public void unsetMaternidadeDeReferencia() {
        condicoesDeSaudeTrift.unsetMaternidadeDeReferencia();
    }

    public boolean isSetMaternidadeDeReferencia() {
        return condicoesDeSaudeTrift.isSetMaternidadeDeReferencia();
    }

    public void setMaternidadeDeReferenciaIsSet(boolean value) {
        condicoesDeSaudeTrift.setMaternidadeDeReferenciaIsSet(value);
    }

    public long getSituacaoPeso() {
        return condicoesDeSaudeTrift.getSituacaoPeso();
    }

    public void setSituacaoPeso(long situacaoPeso) {
        condicoesDeSaudeTrift.setSituacaoPeso(situacaoPeso);
    }

    public void unsetSituacaoPeso() {
        condicoesDeSaudeTrift.unsetSituacaoPeso();
    }

    public boolean isSetSituacaoPeso() {
        return condicoesDeSaudeTrift.isSetSituacaoPeso();
    }

    public void setSituacaoPesoIsSet(boolean value) {
        condicoesDeSaudeTrift.setSituacaoPesoIsSet(value);
    }

    public boolean isStatusEhDependenteAlcool() {
        return condicoesDeSaudeTrift.isStatusEhDependenteAlcool();
    }

    public void setStatusEhDependenteAlcool(boolean statusEhDependenteAlcool) {
        condicoesDeSaudeTrift.setStatusEhDependenteAlcool(statusEhDependenteAlcool);
    }

    public void unsetStatusEhDependenteAlcool() {
        condicoesDeSaudeTrift.unsetStatusEhDependenteAlcool();
    }

    public boolean isSetStatusEhDependenteAlcool() {
        return condicoesDeSaudeTrift.isSetStatusEhDependenteAlcool();
    }

    public void setStatusEhDependenteAlcoolIsSet(boolean value) {
        condicoesDeSaudeTrift.setStatusEhDependenteAlcoolIsSet(value);
    }

    public boolean isStatusEhDependenteOutrasDrogas() {
        return condicoesDeSaudeTrift.isStatusEhDependenteOutrasDrogas();
    }

    public void setStatusEhDependenteOutrasDrogas(boolean statusEhDependenteOutrasDrogas) {
        condicoesDeSaudeTrift.setStatusEhDependenteOutrasDrogas(statusEhDependenteOutrasDrogas);
    }

    public void unsetStatusEhDependenteOutrasDrogas() {
        condicoesDeSaudeTrift.unsetStatusEhDependenteOutrasDrogas();
    }

    public boolean isSetStatusEhDependenteOutrasDrogas() {
        return condicoesDeSaudeTrift.isSetStatusEhDependenteOutrasDrogas();
    }

    public void setStatusEhDependenteOutrasDrogasIsSet(boolean value) {
        condicoesDeSaudeTrift.setStatusEhDependenteOutrasDrogasIsSet(value);
    }

    public boolean isStatusEhFumante() {
        return condicoesDeSaudeTrift.isStatusEhFumante();
    }

    public void setStatusEhFumante(boolean statusEhFumante) {
        condicoesDeSaudeTrift.setStatusEhFumante(statusEhFumante);
    }

    public void unsetStatusEhFumante() {
        condicoesDeSaudeTrift.unsetStatusEhFumante();
    }

    public boolean isSetStatusEhFumante() {
        return condicoesDeSaudeTrift.isSetStatusEhFumante();
    }

    public void setStatusEhFumanteIsSet(boolean value) {
        condicoesDeSaudeTrift.setStatusEhFumanteIsSet(value);
    }

    public boolean isStatusEhGestante() {
        return condicoesDeSaudeTrift.isStatusEhGestante();
    }

    public void setStatusEhGestante(boolean statusEhGestante) {
        condicoesDeSaudeTrift.setStatusEhGestante(statusEhGestante);
    }

    public void unsetStatusEhGestante() {
        condicoesDeSaudeTrift.unsetStatusEhGestante();
    }

    public boolean isSetStatusEhGestante() {
        return condicoesDeSaudeTrift.isSetStatusEhGestante();
    }

    public void setStatusEhGestanteIsSet(boolean value) {
        condicoesDeSaudeTrift.setStatusEhGestanteIsSet(value);
    }

    public boolean isStatusEstaAcamado() {
        return condicoesDeSaudeTrift.isStatusEstaAcamado();
    }

    public void setStatusEstaAcamado(boolean statusEstaAcamado) {
        condicoesDeSaudeTrift.setStatusEstaAcamado(statusEstaAcamado);
    }

    public void unsetStatusEstaAcamado() {
        condicoesDeSaudeTrift.unsetStatusEstaAcamado();
    }

    public boolean isSetStatusEstaAcamado() {
        return condicoesDeSaudeTrift.isSetStatusEstaAcamado();
    }

    public void setStatusEstaAcamadoIsSet(boolean value) {
        condicoesDeSaudeTrift.setStatusEstaAcamadoIsSet(value);
    }

    public boolean isStatusEstaDomiciliado() {
        return condicoesDeSaudeTrift.isStatusEstaDomiciliado();
    }

    public void setStatusEstaDomiciliado(boolean statusEstaDomiciliado) {
        condicoesDeSaudeTrift.setStatusEstaDomiciliado(statusEstaDomiciliado);
    }

    public void unsetStatusEstaDomiciliado() {
        condicoesDeSaudeTrift.unsetStatusEstaDomiciliado();
    }

    public boolean isSetStatusEstaDomiciliado() {
        return condicoesDeSaudeTrift.isSetStatusEstaDomiciliado();
    }

    public void setStatusEstaDomiciliadoIsSet(boolean value) {
        condicoesDeSaudeTrift.setStatusEstaDomiciliadoIsSet(value);
    }

    public boolean isStatusTemDiabetes() {
        return condicoesDeSaudeTrift.isStatusTemDiabetes();
    }

    public void setStatusTemDiabetes(boolean statusTemDiabetes) {
        condicoesDeSaudeTrift.setStatusTemDiabetes(statusTemDiabetes);
    }

    public void unsetStatusTemDiabetes() {
        condicoesDeSaudeTrift.unsetStatusTemDiabetes();
    }

    public boolean isSetStatusTemDiabetes() {
        return condicoesDeSaudeTrift.isSetStatusTemDiabetes();
    }

    public void setStatusTemDiabetesIsSet(boolean value) {
        condicoesDeSaudeTrift.setStatusTemDiabetesIsSet(value);
    }

    public boolean isStatusTemDoencaRespiratoria() {
        return condicoesDeSaudeTrift.isStatusTemDoencaRespiratoria();
    }

    public void setStatusTemDoencaRespiratoria(boolean statusTemDoencaRespiratoria) {
        condicoesDeSaudeTrift.setStatusTemDoencaRespiratoria(statusTemDoencaRespiratoria);
    }

    public void unsetStatusTemDoencaRespiratoria() {
        condicoesDeSaudeTrift.unsetStatusTemDoencaRespiratoria();
    }

    public boolean isSetStatusTemDoencaRespiratoria() {
        return condicoesDeSaudeTrift.isSetStatusTemDoencaRespiratoria();
    }

    public void setStatusTemDoencaRespiratoriaIsSet(boolean value) {
        condicoesDeSaudeTrift.setStatusTemDoencaRespiratoriaIsSet(value);
    }

    public boolean isStatusTemHanseniase() {
        return condicoesDeSaudeTrift.isStatusTemHanseniase();
    }

    public void setStatusTemHanseniase(boolean statusTemHanseniase) {
        condicoesDeSaudeTrift.setStatusTemHanseniase(statusTemHanseniase);
    }

    public void unsetStatusTemHanseniase() {
        condicoesDeSaudeTrift.unsetStatusTemHanseniase();
    }

    public boolean isSetStatusTemHanseniase() {
        return condicoesDeSaudeTrift.isSetStatusTemHanseniase();
    }

    public void setStatusTemHanseniaseIsSet(boolean value) {
        condicoesDeSaudeTrift.setStatusTemHanseniaseIsSet(value);
    }

    public boolean isStatusTemHipertensaoArterial() {
        return condicoesDeSaudeTrift.isStatusTemHipertensaoArterial();
    }

    public void setStatusTemHipertensaoArterial(boolean statusTemHipertensaoArterial) {
        condicoesDeSaudeTrift.setStatusTemHipertensaoArterial(statusTemHipertensaoArterial);
    }

    public void unsetStatusTemHipertensaoArterial() {
        condicoesDeSaudeTrift.unsetStatusTemHipertensaoArterial();
    }

    public boolean isSetStatusTemHipertensaoArterial() {
        return condicoesDeSaudeTrift.isSetStatusTemHipertensaoArterial();
    }

    public void setStatusTemHipertensaoArterialIsSet(boolean value) {
        condicoesDeSaudeTrift.setStatusTemHipertensaoArterialIsSet(value);
    }

    public boolean isStatusTemTeveCancer() {
        return condicoesDeSaudeTrift.isStatusTemTeveCancer();
    }

    public void setStatusTemTeveCancer(boolean statusTemTeveCancer) {
        condicoesDeSaudeTrift.setStatusTemTeveCancer(statusTemTeveCancer);
    }

    public void unsetStatusTemTeveCancer() {
        condicoesDeSaudeTrift.unsetStatusTemTeveCancer();
    }

    public boolean isSetStatusTemTeveCancer() {
        return condicoesDeSaudeTrift.isSetStatusTemTeveCancer();
    }

    public void setStatusTemTeveCancerIsSet(boolean value) {
        condicoesDeSaudeTrift.setStatusTemTeveCancerIsSet(value);
    }

    public boolean isStatusTemTeveDoencasRins() {
        return condicoesDeSaudeTrift.isStatusTemTeveDoencasRins();
    }

    public void setStatusTemTeveDoencasRins(boolean statusTemTeveDoencasRins) {
        condicoesDeSaudeTrift.setStatusTemTeveDoencasRins(statusTemTeveDoencasRins);
    }

    public void unsetStatusTemTeveDoencasRins() {
        condicoesDeSaudeTrift.unsetStatusTemTeveDoencasRins();
    }

    public boolean isSetStatusTemTeveDoencasRins() {
        return condicoesDeSaudeTrift.isSetStatusTemTeveDoencasRins();
    }

    public void setStatusTemTeveDoencasRinsIsSet(boolean value) {
        condicoesDeSaudeTrift.setStatusTemTeveDoencasRinsIsSet(value);
    }

    public boolean isStatusTemTuberculose() {
        return condicoesDeSaudeTrift.isStatusTemTuberculose();
    }

    public void setStatusTemTuberculose(boolean statusTemTuberculose) {
        condicoesDeSaudeTrift.setStatusTemTuberculose(statusTemTuberculose);
    }

    public void unsetStatusTemTuberculose() {
        condicoesDeSaudeTrift.unsetStatusTemTuberculose();
    }

    public boolean isSetStatusTemTuberculose() {
        return condicoesDeSaudeTrift.isSetStatusTemTuberculose();
    }

    public void setStatusTemTuberculoseIsSet(boolean value) {
        condicoesDeSaudeTrift.setStatusTemTuberculoseIsSet(value);
    }

    public boolean isStatusTeveAvcDerrame() {
        return condicoesDeSaudeTrift.isStatusTeveAvcDerrame();
    }

    public void setStatusTeveAvcDerrame(boolean statusTeveAvcDerrame) {
        condicoesDeSaudeTrift.setStatusTeveAvcDerrame(statusTeveAvcDerrame);
    }

    public void unsetStatusTeveAvcDerrame() {
        condicoesDeSaudeTrift.unsetStatusTeveAvcDerrame();
    }

    public boolean isSetStatusTeveAvcDerrame() {
        return condicoesDeSaudeTrift.isSetStatusTeveAvcDerrame();
    }

    public void setStatusTeveAvcDerrameIsSet(boolean value) {
        condicoesDeSaudeTrift.setStatusTeveAvcDerrameIsSet(value);
    }

    public boolean isStatusTeveDoencaCardiaca() {
        return condicoesDeSaudeTrift.isStatusTeveDoencaCardiaca();
    }

    public void setStatusTeveDoencaCardiaca(boolean statusTeveDoencaCardiaca) {
        condicoesDeSaudeTrift.setStatusTeveDoencaCardiaca(statusTeveDoencaCardiaca);
    }

    public void unsetStatusTeveDoencaCardiaca() {
        condicoesDeSaudeTrift.unsetStatusTeveDoencaCardiaca();
    }

    public boolean isSetStatusTeveDoencaCardiaca() {
        return condicoesDeSaudeTrift.isSetStatusTeveDoencaCardiaca();
    }

    public void setStatusTeveDoencaCardiacaIsSet(boolean value) {
        condicoesDeSaudeTrift.setStatusTeveDoencaCardiacaIsSet(value);
    }

    public boolean isStatusTeveInfarto() {
        return condicoesDeSaudeTrift.isStatusTeveInfarto();
    }

    public void setStatusTeveInfarto(boolean statusTeveInfarto) {
        condicoesDeSaudeTrift.setStatusTeveInfarto(statusTeveInfarto);
    }

    public void unsetStatusTeveInfarto() {
        condicoesDeSaudeTrift.unsetStatusTeveInfarto();
    }

    public boolean isSetStatusTeveInfarto() {
        return condicoesDeSaudeTrift.isSetStatusTeveInfarto();
    }

    public void setStatusTeveInfartoIsSet(boolean value) {
        condicoesDeSaudeTrift.setStatusTeveInfartoIsSet(value);
    }

    public boolean isStatusTeveInternadoEm12Meses() {
        return condicoesDeSaudeTrift.isStatusTeveInternadoEm12Meses();
    }

    public void setStatusTeveInternadoEm12Meses(boolean statusTeveInternadoEm12Meses) {
        condicoesDeSaudeTrift.setStatusTeveInternadoEm12Meses(statusTeveInternadoEm12Meses);
    }

    public void unsetStatusTeveInternadoEm12Meses() {
        condicoesDeSaudeTrift.unsetStatusTeveInternadoEm12Meses();
    }

    public boolean isSetStatusTeveInternadoEm12Meses() {
        return condicoesDeSaudeTrift.isSetStatusTeveInternadoEm12Meses();
    }

    public void setStatusTeveInternadoEm12MesesIsSet(boolean value) {
        condicoesDeSaudeTrift.setStatusTeveInternadoEm12MesesIsSet(value);
    }

    public boolean isStatusTratamentoPsiquicoOuProblemaMental() {
        return condicoesDeSaudeTrift.isStatusTratamentoPsiquicoOuProblemaMental();
    }

    public void setStatusTratamentoPsiquicoOuProblemaMental(boolean statusTratamentoPsiquicoOuProblemaMental) {
        condicoesDeSaudeTrift.setStatusTratamentoPsiquicoOuProblemaMental(statusTratamentoPsiquicoOuProblemaMental);
    }

    public void unsetStatusTratamentoPsiquicoOuProblemaMental() {
        condicoesDeSaudeTrift.unsetStatusTratamentoPsiquicoOuProblemaMental();
    }

    public boolean isSetStatusTratamentoPsiquicoOuProblemaMental() {
        return condicoesDeSaudeTrift.isSetStatusTratamentoPsiquicoOuProblemaMental();
    }

    public void setStatusTratamentoPsiquicoOuProblemaMentalIsSet(boolean value) {
        condicoesDeSaudeTrift.setStatusTratamentoPsiquicoOuProblemaMentalIsSet(value);
    }

    public boolean isStatusUsaOutrasPraticasIntegrativasOuComplementares() {
        return condicoesDeSaudeTrift.isStatusUsaOutrasPraticasIntegrativasOuComplementares();
    }

    public void setStatusUsaOutrasPraticasIntegrativasOuComplementares(boolean statusUsaOutrasPraticasIntegrativasOuComplementares) {
        condicoesDeSaudeTrift.setStatusUsaOutrasPraticasIntegrativasOuComplementares(statusUsaOutrasPraticasIntegrativasOuComplementares);
    }

    public void unsetStatusUsaOutrasPraticasIntegrativasOuComplementares() {
        condicoesDeSaudeTrift.unsetStatusUsaOutrasPraticasIntegrativasOuComplementares();
    }

    public boolean isSetStatusUsaOutrasPraticasIntegrativasOuComplementares() {
        return condicoesDeSaudeTrift.isSetStatusUsaOutrasPraticasIntegrativasOuComplementares();
    }

    public void setStatusUsaOutrasPraticasIntegrativasOuComplementaresIsSet(boolean value) {
        condicoesDeSaudeTrift.setStatusUsaOutrasPraticasIntegrativasOuComplementaresIsSet(value);
    }

    public boolean isStatusUsaPlantaMedicinais() {
        return condicoesDeSaudeTrift.isStatusUsaPlantaMedicinais();
    }

    public void setStatusUsaPlantaMedicinais(boolean statusUsaPlantaMedicinais) {
        condicoesDeSaudeTrift.setStatusUsaPlantaMedicinais(statusUsaPlantaMedicinais);
    }

    public void unsetStatusUsaPlantaMedicinais() {
        condicoesDeSaudeTrift.unsetStatusUsaPlantaMedicinais();
    }

    public boolean isSetStatusUsaPlantaMedicinais() {
        return condicoesDeSaudeTrift.isSetStatusUsaPlantaMedicinais();
    }

    public void setStatusUsaPlantaMedicinaisIsSet(boolean value) {
        condicoesDeSaudeTrift.setStatusUsaPlantaMedicinaisIsSet(value);
    }

    public void validate() throws TException {
        condicoesDeSaudeTrift.validate();
    }
    
    protected CondicoesDeSaudeThrift getInstance(){
        return condicoesDeSaudeTrift;
    }
    
}

