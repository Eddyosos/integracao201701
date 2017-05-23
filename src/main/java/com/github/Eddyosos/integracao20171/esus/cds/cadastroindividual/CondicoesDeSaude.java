package com.github.Eddyosos.integracao20171.esus.cds.cadastroindividual;

import br.gov.saude.esus.cds.transport.generated.thrift.cadastroindividual.CondicoesDeSaudeThrift;
import java.util.Iterator;
import java.util.List;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;

public class CondicoesDeSaude {
    
    private CondicoesDeSaudeThrift condicoesDeSaudeThrift = new CondicoesDeSaudeThrift();
    
    protected CondicoesDeSaude( CondicoesDeSaudeThrift condicoesDeSaudeTrift){
        this.condicoesDeSaudeThrift = condicoesDeSaudeTrift;
    }

    public CondicoesDeSaude deepCopy() {
        return new CondicoesDeSaude(condicoesDeSaudeThrift.deepCopy());
    }

    public void clear() {
        condicoesDeSaudeThrift.clear();
    }

    public String getDescricaoCausaInternacaoEm12Meses() {
        return condicoesDeSaudeThrift.getDescricaoCausaInternacaoEm12Meses();
    }

    public void setDescricaoCausaInternacaoEm12Meses(String descricaoCausaInternacaoEm12Meses) {
        condicoesDeSaudeThrift.setDescricaoCausaInternacaoEm12Meses(descricaoCausaInternacaoEm12Meses);
    }

    public void unsetDescricaoCausaInternacaoEm12Meses() {
        condicoesDeSaudeThrift.unsetDescricaoCausaInternacaoEm12Meses();
    }

    public boolean isSetDescricaoCausaInternacaoEm12Meses() {
        return condicoesDeSaudeThrift.isSetDescricaoCausaInternacaoEm12Meses();
    }

    public void setDescricaoCausaInternacaoEm12MesesIsSet(boolean value) {
        condicoesDeSaudeThrift.setDescricaoCausaInternacaoEm12MesesIsSet(value);
    }

    public String getDescricaoOutraCondicao1() {
        return condicoesDeSaudeThrift.getDescricaoOutraCondicao1();
    }

    public void setDescricaoOutraCondicao1(String descricaoOutraCondicao1) {
        condicoesDeSaudeThrift.setDescricaoOutraCondicao1(descricaoOutraCondicao1);
    }

    public void unsetDescricaoOutraCondicao1() {
        condicoesDeSaudeThrift.unsetDescricaoOutraCondicao1();
    }

    public boolean isSetDescricaoOutraCondicao1() {
        return condicoesDeSaudeThrift.isSetDescricaoOutraCondicao1();
    }

    public void setDescricaoOutraCondicao1IsSet(boolean value) {
        condicoesDeSaudeThrift.setDescricaoOutraCondicao1IsSet(value);
    }

    public String getDescricaoOutraCondicao2() {
        return condicoesDeSaudeThrift.getDescricaoOutraCondicao2();
    }

    public void setDescricaoOutraCondicao2(String descricaoOutraCondicao2) {
        condicoesDeSaudeThrift.setDescricaoOutraCondicao2(descricaoOutraCondicao2);
    }

    public void unsetDescricaoOutraCondicao2() {
        condicoesDeSaudeThrift.unsetDescricaoOutraCondicao2();
    }

    public boolean isSetDescricaoOutraCondicao2() {
        return condicoesDeSaudeThrift.isSetDescricaoOutraCondicao2();
    }

    public void setDescricaoOutraCondicao2IsSet(boolean value) {
        condicoesDeSaudeThrift.setDescricaoOutraCondicao2IsSet(value);
    }

    public String getDescricaoOutraCondicao3() {
        return condicoesDeSaudeThrift.getDescricaoOutraCondicao3();
    }

    public void setDescricaoOutraCondicao3(String descricaoOutraCondicao3) {
        condicoesDeSaudeThrift.setDescricaoOutraCondicao3(descricaoOutraCondicao3);
    }

    public void unsetDescricaoOutraCondicao3() {
        condicoesDeSaudeThrift.unsetDescricaoOutraCondicao3();
    }

    public boolean isSetDescricaoOutraCondicao3() {
        return condicoesDeSaudeThrift.isSetDescricaoOutraCondicao3();
    }

    public void setDescricaoOutraCondicao3IsSet(boolean value) {
        condicoesDeSaudeThrift.setDescricaoOutraCondicao3IsSet(value);
    }

    public String getDescricaoPlantasMedicinaisUsadas() {
        return condicoesDeSaudeThrift.getDescricaoPlantasMedicinaisUsadas();
    }

    public void setDescricaoPlantasMedicinaisUsadas(String descricaoPlantasMedicinaisUsadas) {
        condicoesDeSaudeThrift.setDescricaoPlantasMedicinaisUsadas(descricaoPlantasMedicinaisUsadas);
    }

    public void unsetDescricaoPlantasMedicinaisUsadas() {
        condicoesDeSaudeThrift.unsetDescricaoPlantasMedicinaisUsadas();
    }

    public boolean isSetDescricaoPlantasMedicinaisUsadas() {
        return condicoesDeSaudeThrift.isSetDescricaoPlantasMedicinaisUsadas();
    }

    public void setDescricaoPlantasMedicinaisUsadasIsSet(boolean value) {
        condicoesDeSaudeThrift.setDescricaoPlantasMedicinaisUsadasIsSet(value);
    }

    public int getDoencaCardiacaSize() {
        return condicoesDeSaudeThrift.getDoencaCardiacaSize();
    }

    public Iterator<Long> getDoencaCardiacaIterator() {
        return condicoesDeSaudeThrift.getDoencaCardiacaIterator();
    }

    public void addToDoencaCardiaca(long elem) {
        condicoesDeSaudeThrift.addToDoencaCardiaca(elem);
    }

    public List<Long> getDoencaCardiaca() {
        return condicoesDeSaudeThrift.getDoencaCardiaca();
    }

    public void setDoencaCardiaca(List<Long> doencaCardiaca) {
        condicoesDeSaudeThrift.setDoencaCardiaca(doencaCardiaca);
    }

    public void unsetDoencaCardiaca() {
        condicoesDeSaudeThrift.unsetDoencaCardiaca();
    }

    public boolean isSetDoencaCardiaca() {
        return condicoesDeSaudeThrift.isSetDoencaCardiaca();
    }

    public void setDoencaCardiacaIsSet(boolean value) {
        condicoesDeSaudeThrift.setDoencaCardiacaIsSet(value);
    }

    public int getDoencaRespiratoriaSize() {
        return condicoesDeSaudeThrift.getDoencaRespiratoriaSize();
    }

    public Iterator<Long> getDoencaRespiratoriaIterator() {
        return condicoesDeSaudeThrift.getDoencaRespiratoriaIterator();
    }

    public void addToDoencaRespiratoria(long elem) {
        condicoesDeSaudeThrift.addToDoencaRespiratoria(elem);
    }

    public List<Long> getDoencaRespiratoria() {
        return condicoesDeSaudeThrift.getDoencaRespiratoria();
    }

    public void setDoencaRespiratoria(List<Long> doencaRespiratoria) {
        condicoesDeSaudeThrift.setDoencaRespiratoria(doencaRespiratoria);
    }

    public void unsetDoencaRespiratoria() {
        condicoesDeSaudeThrift.unsetDoencaRespiratoria();
    }

    public boolean isSetDoencaRespiratoria() {
        return condicoesDeSaudeThrift.isSetDoencaRespiratoria();
    }

    public void setDoencaRespiratoriaIsSet(boolean value) {
        condicoesDeSaudeThrift.setDoencaRespiratoriaIsSet(value);
    }

    public int getDoencaRinsSize() {
        return condicoesDeSaudeThrift.getDoencaRinsSize();
    }

    public Iterator<Long> getDoencaRinsIterator() {
        return condicoesDeSaudeThrift.getDoencaRinsIterator();
    }

    public void addToDoencaRins(long elem) {
        condicoesDeSaudeThrift.addToDoencaRins(elem);
    }

    public List<Long> getDoencaRins() {
        return condicoesDeSaudeThrift.getDoencaRins();
    }

    public void setDoencaRins(List<Long> doencaRins) {
        condicoesDeSaudeThrift.setDoencaRins(doencaRins);
    }

    public void unsetDoencaRins() {
        condicoesDeSaudeThrift.unsetDoencaRins();
    }

    public boolean isSetDoencaRins() {
        return condicoesDeSaudeThrift.isSetDoencaRins();
    }

    public void setDoencaRinsIsSet(boolean value) {
        condicoesDeSaudeThrift.setDoencaRinsIsSet(value);
    }

    public String getMaternidadeDeReferencia() {
        return condicoesDeSaudeThrift.getMaternidadeDeReferencia();
    }

    public void setMaternidadeDeReferencia(String maternidadeDeReferencia) {
        condicoesDeSaudeThrift.setMaternidadeDeReferencia(maternidadeDeReferencia);
    }

    public void unsetMaternidadeDeReferencia() {
        condicoesDeSaudeThrift.unsetMaternidadeDeReferencia();
    }

    public boolean isSetMaternidadeDeReferencia() {
        return condicoesDeSaudeThrift.isSetMaternidadeDeReferencia();
    }

    public void setMaternidadeDeReferenciaIsSet(boolean value) {
        condicoesDeSaudeThrift.setMaternidadeDeReferenciaIsSet(value);
    }

    public long getSituacaoPeso() {
        return condicoesDeSaudeThrift.getSituacaoPeso();
    }

    public void setSituacaoPeso(long situacaoPeso) {
        condicoesDeSaudeThrift.setSituacaoPeso(situacaoPeso);
    }

    public void unsetSituacaoPeso() {
        condicoesDeSaudeThrift.unsetSituacaoPeso();
    }

    public boolean isSetSituacaoPeso() {
        return condicoesDeSaudeThrift.isSetSituacaoPeso();
    }

    public void setSituacaoPesoIsSet(boolean value) {
        condicoesDeSaudeThrift.setSituacaoPesoIsSet(value);
    }

    public boolean isStatusEhDependenteAlcool() {
        return condicoesDeSaudeThrift.isStatusEhDependenteAlcool();
    }

    public void setStatusEhDependenteAlcool(boolean statusEhDependenteAlcool) {
        condicoesDeSaudeThrift.setStatusEhDependenteAlcool(statusEhDependenteAlcool);
    }

    public void unsetStatusEhDependenteAlcool() {
        condicoesDeSaudeThrift.unsetStatusEhDependenteAlcool();
    }

    public boolean isSetStatusEhDependenteAlcool() {
        return condicoesDeSaudeThrift.isSetStatusEhDependenteAlcool();
    }

    public void setStatusEhDependenteAlcoolIsSet(boolean value) {
        condicoesDeSaudeThrift.setStatusEhDependenteAlcoolIsSet(value);
    }

    public boolean isStatusEhDependenteOutrasDrogas() {
        return condicoesDeSaudeThrift.isStatusEhDependenteOutrasDrogas();
    }

    public void setStatusEhDependenteOutrasDrogas(boolean statusEhDependenteOutrasDrogas) {
        condicoesDeSaudeThrift.setStatusEhDependenteOutrasDrogas(statusEhDependenteOutrasDrogas);
    }

    public void unsetStatusEhDependenteOutrasDrogas() {
        condicoesDeSaudeThrift.unsetStatusEhDependenteOutrasDrogas();
    }

    public boolean isSetStatusEhDependenteOutrasDrogas() {
        return condicoesDeSaudeThrift.isSetStatusEhDependenteOutrasDrogas();
    }

    public void setStatusEhDependenteOutrasDrogasIsSet(boolean value) {
        condicoesDeSaudeThrift.setStatusEhDependenteOutrasDrogasIsSet(value);
    }

    public boolean isStatusEhFumante() {
        return condicoesDeSaudeThrift.isStatusEhFumante();
    }

    public void setStatusEhFumante(boolean statusEhFumante) {
        condicoesDeSaudeThrift.setStatusEhFumante(statusEhFumante);
    }

    public void unsetStatusEhFumante() {
        condicoesDeSaudeThrift.unsetStatusEhFumante();
    }

    public boolean isSetStatusEhFumante() {
        return condicoesDeSaudeThrift.isSetStatusEhFumante();
    }

    public void setStatusEhFumanteIsSet(boolean value) {
        condicoesDeSaudeThrift.setStatusEhFumanteIsSet(value);
    }

    public boolean isStatusEhGestante() {
        return condicoesDeSaudeThrift.isStatusEhGestante();
    }

    public void setStatusEhGestante(boolean statusEhGestante) {
        condicoesDeSaudeThrift.setStatusEhGestante(statusEhGestante);
    }

    public void unsetStatusEhGestante() {
        condicoesDeSaudeThrift.unsetStatusEhGestante();
    }

    public boolean isSetStatusEhGestante() {
        return condicoesDeSaudeThrift.isSetStatusEhGestante();
    }

    public void setStatusEhGestanteIsSet(boolean value) {
        condicoesDeSaudeThrift.setStatusEhGestanteIsSet(value);
    }

    public boolean isStatusEstaAcamado() {
        return condicoesDeSaudeThrift.isStatusEstaAcamado();
    }

    public void setStatusEstaAcamado(boolean statusEstaAcamado) {
        condicoesDeSaudeThrift.setStatusEstaAcamado(statusEstaAcamado);
    }

    public void unsetStatusEstaAcamado() {
        condicoesDeSaudeThrift.unsetStatusEstaAcamado();
    }

    public boolean isSetStatusEstaAcamado() {
        return condicoesDeSaudeThrift.isSetStatusEstaAcamado();
    }

    public void setStatusEstaAcamadoIsSet(boolean value) {
        condicoesDeSaudeThrift.setStatusEstaAcamadoIsSet(value);
    }

    public boolean isStatusEstaDomiciliado() {
        return condicoesDeSaudeThrift.isStatusEstaDomiciliado();
    }

    public void setStatusEstaDomiciliado(boolean statusEstaDomiciliado) {
        condicoesDeSaudeThrift.setStatusEstaDomiciliado(statusEstaDomiciliado);
    }

    public void unsetStatusEstaDomiciliado() {
        condicoesDeSaudeThrift.unsetStatusEstaDomiciliado();
    }

    public boolean isSetStatusEstaDomiciliado() {
        return condicoesDeSaudeThrift.isSetStatusEstaDomiciliado();
    }

    public void setStatusEstaDomiciliadoIsSet(boolean value) {
        condicoesDeSaudeThrift.setStatusEstaDomiciliadoIsSet(value);
    }

    public boolean isStatusTemDiabetes() {
        return condicoesDeSaudeThrift.isStatusTemDiabetes();
    }

    public void setStatusTemDiabetes(boolean statusTemDiabetes) {
        condicoesDeSaudeThrift.setStatusTemDiabetes(statusTemDiabetes);
    }

    public void unsetStatusTemDiabetes() {
        condicoesDeSaudeThrift.unsetStatusTemDiabetes();
    }

    public boolean isSetStatusTemDiabetes() {
        return condicoesDeSaudeThrift.isSetStatusTemDiabetes();
    }

    public void setStatusTemDiabetesIsSet(boolean value) {
        condicoesDeSaudeThrift.setStatusTemDiabetesIsSet(value);
    }

    public boolean isStatusTemDoencaRespiratoria() {
        return condicoesDeSaudeThrift.isStatusTemDoencaRespiratoria();
    }

    public void setStatusTemDoencaRespiratoria(boolean statusTemDoencaRespiratoria) {
        condicoesDeSaudeThrift.setStatusTemDoencaRespiratoria(statusTemDoencaRespiratoria);
    }

    public void unsetStatusTemDoencaRespiratoria() {
        condicoesDeSaudeThrift.unsetStatusTemDoencaRespiratoria();
    }

    public boolean isSetStatusTemDoencaRespiratoria() {
        return condicoesDeSaudeThrift.isSetStatusTemDoencaRespiratoria();
    }

    public void setStatusTemDoencaRespiratoriaIsSet(boolean value) {
        condicoesDeSaudeThrift.setStatusTemDoencaRespiratoriaIsSet(value);
    }

    public boolean isStatusTemHanseniase() {
        return condicoesDeSaudeThrift.isStatusTemHanseniase();
    }

    public void setStatusTemHanseniase(boolean statusTemHanseniase) {
        condicoesDeSaudeThrift.setStatusTemHanseniase(statusTemHanseniase);
    }

    public void unsetStatusTemHanseniase() {
        condicoesDeSaudeThrift.unsetStatusTemHanseniase();
    }

    public boolean isSetStatusTemHanseniase() {
        return condicoesDeSaudeThrift.isSetStatusTemHanseniase();
    }

    public void setStatusTemHanseniaseIsSet(boolean value) {
        condicoesDeSaudeThrift.setStatusTemHanseniaseIsSet(value);
    }

    public boolean isStatusTemHipertensaoArterial() {
        return condicoesDeSaudeThrift.isStatusTemHipertensaoArterial();
    }

    public void setStatusTemHipertensaoArterial(boolean statusTemHipertensaoArterial) {
        condicoesDeSaudeThrift.setStatusTemHipertensaoArterial(statusTemHipertensaoArterial);
    }

    public void unsetStatusTemHipertensaoArterial() {
        condicoesDeSaudeThrift.unsetStatusTemHipertensaoArterial();
    }

    public boolean isSetStatusTemHipertensaoArterial() {
        return condicoesDeSaudeThrift.isSetStatusTemHipertensaoArterial();
    }

    public void setStatusTemHipertensaoArterialIsSet(boolean value) {
        condicoesDeSaudeThrift.setStatusTemHipertensaoArterialIsSet(value);
    }

    public boolean isStatusTemTeveCancer() {
        return condicoesDeSaudeThrift.isStatusTemTeveCancer();
    }

    public void setStatusTemTeveCancer(boolean statusTemTeveCancer) {
        condicoesDeSaudeThrift.setStatusTemTeveCancer(statusTemTeveCancer);
    }

    public void unsetStatusTemTeveCancer() {
        condicoesDeSaudeThrift.unsetStatusTemTeveCancer();
    }

    public boolean isSetStatusTemTeveCancer() {
        return condicoesDeSaudeThrift.isSetStatusTemTeveCancer();
    }

    public void setStatusTemTeveCancerIsSet(boolean value) {
        condicoesDeSaudeThrift.setStatusTemTeveCancerIsSet(value);
    }

    public boolean isStatusTemTeveDoencasRins() {
        return condicoesDeSaudeThrift.isStatusTemTeveDoencasRins();
    }

    public void setStatusTemTeveDoencasRins(boolean statusTemTeveDoencasRins) {
        condicoesDeSaudeThrift.setStatusTemTeveDoencasRins(statusTemTeveDoencasRins);
    }

    public void unsetStatusTemTeveDoencasRins() {
        condicoesDeSaudeThrift.unsetStatusTemTeveDoencasRins();
    }

    public boolean isSetStatusTemTeveDoencasRins() {
        return condicoesDeSaudeThrift.isSetStatusTemTeveDoencasRins();
    }

    public void setStatusTemTeveDoencasRinsIsSet(boolean value) {
        condicoesDeSaudeThrift.setStatusTemTeveDoencasRinsIsSet(value);
    }

    public boolean isStatusTemTuberculose() {
        return condicoesDeSaudeThrift.isStatusTemTuberculose();
    }

    public void setStatusTemTuberculose(boolean statusTemTuberculose) {
        condicoesDeSaudeThrift.setStatusTemTuberculose(statusTemTuberculose);
    }

    public void unsetStatusTemTuberculose() {
        condicoesDeSaudeThrift.unsetStatusTemTuberculose();
    }

    public boolean isSetStatusTemTuberculose() {
        return condicoesDeSaudeThrift.isSetStatusTemTuberculose();
    }

    public void setStatusTemTuberculoseIsSet(boolean value) {
        condicoesDeSaudeThrift.setStatusTemTuberculoseIsSet(value);
    }

    public boolean isStatusTeveAvcDerrame() {
        return condicoesDeSaudeThrift.isStatusTeveAvcDerrame();
    }

    public void setStatusTeveAvcDerrame(boolean statusTeveAvcDerrame) {
        condicoesDeSaudeThrift.setStatusTeveAvcDerrame(statusTeveAvcDerrame);
    }

    public void unsetStatusTeveAvcDerrame() {
        condicoesDeSaudeThrift.unsetStatusTeveAvcDerrame();
    }

    public boolean isSetStatusTeveAvcDerrame() {
        return condicoesDeSaudeThrift.isSetStatusTeveAvcDerrame();
    }

    public void setStatusTeveAvcDerrameIsSet(boolean value) {
        condicoesDeSaudeThrift.setStatusTeveAvcDerrameIsSet(value);
    }

    public boolean isStatusTeveDoencaCardiaca() {
        return condicoesDeSaudeThrift.isStatusTeveDoencaCardiaca();
    }

    public void setStatusTeveDoencaCardiaca(boolean statusTeveDoencaCardiaca) {
        condicoesDeSaudeThrift.setStatusTeveDoencaCardiaca(statusTeveDoencaCardiaca);
    }

    public void unsetStatusTeveDoencaCardiaca() {
        condicoesDeSaudeThrift.unsetStatusTeveDoencaCardiaca();
    }

    public boolean isSetStatusTeveDoencaCardiaca() {
        return condicoesDeSaudeThrift.isSetStatusTeveDoencaCardiaca();
    }

    public void setStatusTeveDoencaCardiacaIsSet(boolean value) {
        condicoesDeSaudeThrift.setStatusTeveDoencaCardiacaIsSet(value);
    }

    public boolean isStatusTeveInfarto() {
        return condicoesDeSaudeThrift.isStatusTeveInfarto();
    }

    public void setStatusTeveInfarto(boolean statusTeveInfarto) {
        condicoesDeSaudeThrift.setStatusTeveInfarto(statusTeveInfarto);
    }

    public void unsetStatusTeveInfarto() {
        condicoesDeSaudeThrift.unsetStatusTeveInfarto();
    }

    public boolean isSetStatusTeveInfarto() {
        return condicoesDeSaudeThrift.isSetStatusTeveInfarto();
    }

    public void setStatusTeveInfartoIsSet(boolean value) {
        condicoesDeSaudeThrift.setStatusTeveInfartoIsSet(value);
    }

    public boolean isStatusTeveInternadoEm12Meses() {
        return condicoesDeSaudeThrift.isStatusTeveInternadoEm12Meses();
    }

    public void setStatusTeveInternadoEm12Meses(boolean statusTeveInternadoEm12Meses) {
        condicoesDeSaudeThrift.setStatusTeveInternadoEm12Meses(statusTeveInternadoEm12Meses);
    }

    public void unsetStatusTeveInternadoEm12Meses() {
        condicoesDeSaudeThrift.unsetStatusTeveInternadoEm12Meses();
    }

    public boolean isSetStatusTeveInternadoEm12Meses() {
        return condicoesDeSaudeThrift.isSetStatusTeveInternadoEm12Meses();
    }

    public void setStatusTeveInternadoEm12MesesIsSet(boolean value) {
        condicoesDeSaudeThrift.setStatusTeveInternadoEm12MesesIsSet(value);
    }

    public boolean isStatusTratamentoPsiquicoOuProblemaMental() {
        return condicoesDeSaudeThrift.isStatusTratamentoPsiquicoOuProblemaMental();
    }

    public void setStatusTratamentoPsiquicoOuProblemaMental(boolean statusTratamentoPsiquicoOuProblemaMental) {
        condicoesDeSaudeThrift.setStatusTratamentoPsiquicoOuProblemaMental(statusTratamentoPsiquicoOuProblemaMental);
    }

    public void unsetStatusTratamentoPsiquicoOuProblemaMental() {
        condicoesDeSaudeThrift.unsetStatusTratamentoPsiquicoOuProblemaMental();
    }

    public boolean isSetStatusTratamentoPsiquicoOuProblemaMental() {
        return condicoesDeSaudeThrift.isSetStatusTratamentoPsiquicoOuProblemaMental();
    }

    public void setStatusTratamentoPsiquicoOuProblemaMentalIsSet(boolean value) {
        condicoesDeSaudeThrift.setStatusTratamentoPsiquicoOuProblemaMentalIsSet(value);
    }

    public boolean isStatusUsaOutrasPraticasIntegrativasOuComplementares() {
        return condicoesDeSaudeThrift.isStatusUsaOutrasPraticasIntegrativasOuComplementares();
    }

    public void setStatusUsaOutrasPraticasIntegrativasOuComplementares(boolean statusUsaOutrasPraticasIntegrativasOuComplementares) {
        condicoesDeSaudeThrift.setStatusUsaOutrasPraticasIntegrativasOuComplementares(statusUsaOutrasPraticasIntegrativasOuComplementares);
    }

    public void unsetStatusUsaOutrasPraticasIntegrativasOuComplementares() {
        condicoesDeSaudeThrift.unsetStatusUsaOutrasPraticasIntegrativasOuComplementares();
    }

    public boolean isSetStatusUsaOutrasPraticasIntegrativasOuComplementares() {
        return condicoesDeSaudeThrift.isSetStatusUsaOutrasPraticasIntegrativasOuComplementares();
    }

    public void setStatusUsaOutrasPraticasIntegrativasOuComplementaresIsSet(boolean value) {
        condicoesDeSaudeThrift.setStatusUsaOutrasPraticasIntegrativasOuComplementaresIsSet(value);
    }

    public boolean isStatusUsaPlantaMedicinais() {
        return condicoesDeSaudeThrift.isStatusUsaPlantaMedicinais();
    }

    public void setStatusUsaPlantaMedicinais(boolean statusUsaPlantaMedicinais) {
        condicoesDeSaudeThrift.setStatusUsaPlantaMedicinais(statusUsaPlantaMedicinais);
    }

    public void unsetStatusUsaPlantaMedicinais() {
        condicoesDeSaudeThrift.unsetStatusUsaPlantaMedicinais();
    }

    public boolean isSetStatusUsaPlantaMedicinais() {
        return condicoesDeSaudeThrift.isSetStatusUsaPlantaMedicinais();
    }

    public void setStatusUsaPlantaMedicinaisIsSet(boolean value) {
        condicoesDeSaudeThrift.setStatusUsaPlantaMedicinaisIsSet(value);
    }


    @Override
    public boolean equals(Object that) {
        return condicoesDeSaudeThrift.equals(that);
    }

    public boolean equals(CondicoesDeSaude that) {
        return condicoesDeSaudeThrift.equals(that.getInstance());
    }

    @Override
    public int hashCode() {
        return condicoesDeSaudeThrift.hashCode();
    }

    public int compareTo(CondicoesDeSaude other) {
        return condicoesDeSaudeThrift.compareTo(other.getInstance());
    }

    @Override
    public String toString() {
        return condicoesDeSaudeThrift.toString();
    }

    public void validate() throws TException {
        condicoesDeSaudeThrift.validate();
    }
    
    protected CondicoesDeSaudeThrift getInstance(){
        return condicoesDeSaudeThrift;
    }
    
    
}

