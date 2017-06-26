package com.github.Eddyosos.integracao20171.esus.cds.cadastroindividual;

import br.gov.saude.esus.cds.transport.generated.thrift.cadastroindividual.CondicoesDeSaudeThrift;
import com.github.Eddyosos.integracao20171.esus.cidadao.Sexo;
import java.util.Iterator;
import java.util.List;

public class CondicoesDeSaude {
    
    private CondicoesDeSaudeThrift instance;
            
    public CondicoesDeSaude(){
        instance = new CondicoesDeSaudeThrift();
    }
    
    public CondicoesDeSaude( CondicoesDeSaudeThrift condicoesDeSaudeTrift){
        this.instance = condicoesDeSaudeTrift;
    }

    /**
     * Descrição da causa de internação do cidadão.
     * @return 
     */
    public String getDescricaoCausaInternacaoEm12Meses() {
        return instance.getDescricaoCausaInternacaoEm12Meses();
    }

    /**
     * Descrição da causa de internação do cidadão.
     * @param descricaoCausaInternacaoEm12Meses 
     */
    public void setDescricaoCausaInternacaoEm12Meses(String descricaoCausaInternacaoEm12Meses) {
        instance.setDescricaoCausaInternacaoEm12Meses(descricaoCausaInternacaoEm12Meses);
    }

    /**
     * Condição de saúde informada pelo cidadão.
     * @return 
     */
    public String getDescricaoOutraCondicao1() {
        return instance.getDescricaoOutraCondicao1();
    }

    /**
     * Condição de saúde informada pelo cidadão.
     * @param descricaoOutraCondicao1 
     */
    public void setDescricaoOutraCondicao1(String descricaoOutraCondicao1) {
        instance.setDescricaoOutraCondicao1(descricaoOutraCondicao1);
    }

    /**
     * Condição de saúde informada pelo cidadão.
     * @return 
     */
    public String getDescricaoOutraCondicao2() {
        return instance.getDescricaoOutraCondicao2();
    }

    /**
     * Condição de saúde informada pelo cidadão.
     * @param descricaoOutraCondicao2 
     */
    public void setDescricaoOutraCondicao2(String descricaoOutraCondicao2) {
        instance.setDescricaoOutraCondicao2(descricaoOutraCondicao2);
    }

    /**
     * Condição de saúde informada pelo cidadão.
     * @return 
     */
    public String getDescricaoOutraCondicao3() {
        return instance.getDescricaoOutraCondicao3();
    }

    /**
     * Condição de saúde informada pelo cidadão.
     * @param descricaoOutraCondicao3 
     */
    public void setDescricaoOutraCondicao3(String descricaoOutraCondicao3) {
        instance.setDescricaoOutraCondicao3(descricaoOutraCondicao3);
    }

    /**
     * Descrição das plantas medicinais utilizadas.
     * @return 
     */
    public String getDescricaoPlantasMedicinaisUsadas() {
        return instance.getDescricaoPlantasMedicinaisUsadas();
    }

    /**
     * Descrição das plantas medicinais utilizadas.
     * @param descricaoPlantasMedicinaisUsadas 
     */
    public void setDescricaoPlantasMedicinaisUsadas(String descricaoPlantasMedicinaisUsadas) {
        instance.setDescricaoPlantasMedicinaisUsadas(descricaoPlantasMedicinaisUsadas);
    }

    /**
     * Código das doenças cardíacas que o cidadão informou.
     * @return 
     */
    public List<Long> getDoencaCardiaca() {
        return instance.getDoencaCardiaca();
    }

    /**
     * Código das doenças cardíacas que o cidadão informou.
     * @param doencaCardiaca 
     */
    public void setDoencaCardiaca(List<Long> doencaCardiaca) {
        instance.setDoencaCardiaca(doencaCardiaca);
    }

    /**
     * Código d as doenças respiratórias que o cidadão informou.
     * @return 
     */
    public List<Long> getDoencaRespiratoria() {
        return instance.getDoencaRespiratoria();
    }

    /**
     * Código d as doenças respiratórias que o cidadão informou.
     * @param doencaRespiratoria 
     */
    public void setDoencaRespiratoria(List<Long> doencaRespiratoria) {
        instance.setDoencaRespiratoria(doencaRespiratoria);
    }

    /**
     * Código das doenças renais que o cidadão informou.
     * @return 
     */
    public List<Long> getDoencaRins() {
        return instance.getDoencaRins();
    }

    public void setDoencaRins(List<Long> doencaRins) {
        instance.setDoencaRins(doencaRins);
    }

    /**
     * Nome da maternidade de referência.
     * @return 
     */
    public String getMaternidadeDeReferencia() {
        return instance.getMaternidadeDeReferencia();
    }

    /**
     * Nome da maternidade de referência.
     * @param maternidadeDeReferencia 
     */
    public void setMaternidadeDeReferencia(String maternidadeDeReferencia) {
        instance.setMaternidadeDeReferencia(maternidadeDeReferencia);
    }

    /**
     * Código da situação referente ao peso corporal.
     * @return 
     */
    public long getSituacaoPeso() {
        return instance.getSituacaoPeso();
    }

    /**
     * Código da situação referente ao peso corporal.
     * @param situacaoPeso 
     */
    public void setSituacaoPeso(long situacaoPeso) {
        instance.setSituacaoPeso(situacaoPeso);
    }

    /**
     * Marcador se o cidadão é dependente de álcool.
     * @return 
     */
    public boolean isStatusEhDependenteAlcool() {
        return instance.isStatusEhDependenteAlcool();
    }

    /**
     * Marcador se o cidadão é dependente de álcool.
     * @param statusEhDependenteAlcool 
     */
    public void setStatusEhDependenteAlcool(boolean statusEhDependenteAlcool) {
        instance.setStatusEhDependenteAlcool(statusEhDependenteAlcool);
    }

    /**
     * Marcador se o cidadão é dependente de outras drogas.
     * @return 
     */
    public boolean isStatusEhDependenteOutrasDrogas() {
        return instance.isStatusEhDependenteOutrasDrogas();
    }

    /**
     * Marcador se o cidadão é dependente de outras drogas.
     * @param statusEhDependenteOutrasDrogas 
     */
    public void setStatusEhDependenteOutrasDrogas(boolean statusEhDependenteOutrasDrogas) {
        instance.setStatusEhDependenteOutrasDrogas(statusEhDependenteOutrasDrogas);
    }

    /**
     * Marcador se o cidadão é fumante.
     * @return 
     */
    public boolean isStatusEhFumante() {
        return instance.isStatusEhFumante();
    }

    /**
     * Marcador se o cidadão é fumante.
     * @param statusEhFumante 
     */
    public void setStatusEhFumante(boolean statusEhFumante) {
        instance.setStatusEhFumante(statusEhFumante);
    }

    /**
     * Marcador se o cidadão está gestante.
     * @return 
     */
    public boolean isStatusEhGestante() {
        return instance.isStatusEhGestante();
    }

    /**
     * Marcador se o cidadão está gestante.
     * @param statusEhGestante 
     */
    public void setStatusEhGestante(boolean statusEhGestante) {
        instance.setStatusEhGestante(statusEhGestante);
    }

    /**
     * Marcador se o cidadão está acamado.
     * @return 
     */
    public boolean isStatusEstaAcamado() {
        return instance.isStatusEstaAcamado();
    }

    /**
     * Marcador se o cidadão está acamado.
     * @param statusEstaAcamado 
     */
    public void setStatusEstaAcamado(boolean statusEstaAcamado) {
        instance.setStatusEstaAcamado(statusEstaAcamado);
    }

    /**
     * Marcador se o cidadão está domiciliado.
     * @return 
     */
    public boolean isStatusEstaDomiciliado() {
        return instance.isStatusEstaDomiciliado();
    }

    /**
     * Marcador se o cidadão está domiciliado.
     * @param statusEstaDomiciliado 
     */
    public void setStatusEstaDomiciliado(boolean statusEstaDomiciliado) {
        instance.setStatusEstaDomiciliado(statusEstaDomiciliado);
    }

    /**
     * Marcador se o cidadão tem diabetes.
     * @return 
     */
    public boolean isStatusTemDiabetes() {
        return instance.isStatusTemDiabetes();
    }

    /**
     * Marcador se o cidadão tem diabetes.
     * @param statusTemDiabetes 
     */
    public void setStatusTemDiabetes(boolean statusTemDiabetes) {
        instance.setStatusTemDiabetes(statusTemDiabetes);
    }

    /**
     * Marcador se o cidadão tem doença respiratória.
     * @return 
     */
    public boolean isStatusTemDoencaRespiratoria() {
        return instance.isStatusTemDoencaRespiratoria();
    }

    /**
     * Marcador se o cidadão tem doença respiratória.
     * @param statusTemDoencaRespiratoria 
     */
    public void setStatusTemDoencaRespiratoria(boolean statusTemDoencaRespiratoria) {
        instance.setStatusTemDoencaRespiratoria(statusTemDoencaRespiratoria);
    }

    /**
     * Marcador se o cidadão tem hanseníase.
     * @return 
     */
    public boolean isStatusTemHanseniase() {
        return instance.isStatusTemHanseniase();
    }

    /**
     * Marcador se o cidadão tem hanseníase.
     * @param statusTemHanseniase 
     */
    public void setStatusTemHanseniase(boolean statusTemHanseniase) {
        instance.setStatusTemHanseniase(statusTemHanseniase);
    }

    /**
     * Marcador se o cidadão tem hipertensão arterial.
     * @return 
     */
    public boolean isStatusTemHipertensaoArterial() {
        return instance.isStatusTemHipertensaoArterial();
    }

    /**
     * Marcador se o cidadão tem hipertensão arterial.
     * @param statusTemHipertensaoArterial 
     */
    public void setStatusTemHipertensaoArterial(boolean statusTemHipertensaoArterial) {
        instance.setStatusTemHipertensaoArterial(statusTemHipertensaoArterial);
    }

    /**
     * Marcador se o cidadão tem hipertensão arterial.
     * @param value 
     */
    public void setStatusTemHipertensaoArterialIsSet(boolean value) {
        instance.setStatusTemHipertensaoArterialIsSet(value);
    }

    /**
     * Marcador se o cidadão tem ou teve câncer.
     * @return 
     */
    public boolean isStatusTemTeveCancer() {
        return instance.isStatusTemTeveCancer();
    }

    /**
     * Marcador se o cidadão tem ou teve câncer.
     * @param statusTemTeveCancer 
     */
    public void setStatusTemTeveCancer(boolean statusTemTeveCancer) {
        instance.setStatusTemTeveCancer(statusTemTeveCancer);
    }

    /**
     * Marcador se o cidadão tem ou teve doenças nos rins.
     * @return 
     */
    public boolean isStatusTemTeveDoencasRins() {
        return instance.isStatusTemTeveDoencasRins();
    }

    /**
     * Marcador se o cidadão tem ou teve doenças nos rins.
     * @param statusTemTeveDoencasRins 
     */
    public void setStatusTemTeveDoencasRins(boolean statusTemTeveDoencasRins) {
        instance.setStatusTemTeveDoencasRins(statusTemTeveDoencasRins);
    }

    /**
     * Marcador se o cidadão tem tuberculose.
     * @return 
     */
    public boolean isStatusTemTuberculose() {
        return instance.isStatusTemTuberculose();
    }

    /**
     * Marcador se o cidadão tem tuberculose.
     * @param statusTemTuberculose 
     */
    public void setStatusTemTuberculose(boolean statusTemTuberculose) {
        instance.setStatusTemTuberculose(statusTemTuberculose);
    }

    /**
     * Marcador se o cidadão teve AVC.
     * @return 
     */
    public boolean isStatusTeveAvcDerrame() {
        return instance.isStatusTeveAvcDerrame();
    }

    /**
     * Marcador se o cidadão teve AVC.
     * @param statusTeveAvcDerrame 
     */
    public void setStatusTeveAvcDerrame(boolean statusTeveAvcDerrame) {
        instance.setStatusTeveAvcDerrame(statusTeveAvcDerrame);
    }

    /**
     * Marcador se o cidadão teve doença cardíaca.
     * @return 
     */
    public boolean isStatusTeveDoencaCardiaca() {
        return instance.isStatusTeveDoencaCardiaca();
    }

    /**
     * Marcador se o cidadão teve doença cardíaca.
     * @param statusTeveDoencaCardiaca 
     */
    public void setStatusTeveDoencaCardiaca(boolean statusTeveDoencaCardiaca) {
        instance.setStatusTeveDoencaCardiaca(statusTeveDoencaCardiaca);
    }

    /**
     * Marcador se o cidadão teve infarto.
     * @return 
     */
    public boolean isStatusTeveInfarto() {
        return instance.isStatusTeveInfarto();
    }

    /**
     * Marcador se o cidadão teve infarto.
     * @param statusTeveInfarto 
     */
    public void setStatusTeveInfarto(boolean statusTeveInfarto) {
        instance.setStatusTeveInfarto(statusTeveInfarto);
    }

    /**
     * Marcador se o cidadão esteve internado nos últimos 12 meses.
     * @return 
     */
    public boolean isStatusTeveInternadoEm12Meses() {
        return instance.isStatusTeveInternadoEm12Meses();
    }

    /**
     * Marcador se o cidadão esteve internado nos últimos 12 meses.
     * @param statusTeveInternadoEm12Meses 
     */
    public void setStatusTeveInternadoEm12Meses(boolean statusTeveInternadoEm12Meses) {
        instance.setStatusTeveInternadoEm12Meses(statusTeveInternadoEm12Meses);
    }

    /**
     * Marcador se o cidadão está em tratamento psiquico ou tem problema mental.
     * @return 
     */
    public boolean isStatusTratamentoPsiquicoOuProblemaMental() {
        return instance.isStatusTratamentoPsiquicoOuProblemaMental();
    }

    /**
     * Marcador se o cidadão está em tratamento psiquico ou tem problema mental.
     * @param statusTratamentoPsiquicoOuProblemaMental 
     */
    public void setStatusTratamentoPsiquicoOuProblemaMental(boolean statusTratamentoPsiquicoOuProblemaMental) {
        instance.setStatusTratamentoPsiquicoOuProblemaMental(statusTratamentoPsiquicoOuProblemaMental);
    }

    /**
     * Marcador se o cidadão utiliza outras práticas integrativas complementares.
     * @return 
     */
    public boolean isStatusUsaOutrasPraticasIntegrativasOuComplementares() {
        return instance.isStatusUsaOutrasPraticasIntegrativasOuComplementares();
    }

    /**
     * Marcador se o cidadão utiliza outras práticas integrativas complementares.
     * @param statusUsaOutrasPraticasIntegrativasOuComplementares 
     */
    public void setStatusUsaOutrasPraticasIntegrativasOuComplementares(boolean statusUsaOutrasPraticasIntegrativasOuComplementares) {
        instance.setStatusUsaOutrasPraticasIntegrativasOuComplementares(statusUsaOutrasPraticasIntegrativasOuComplementares);
    }

    /**
     * Marcador se o cidadão utiliza plantas medicinais.
     * @return 
     */
    public boolean isStatusUsaPlantaMedicinais() {
        return instance.isStatusUsaPlantaMedicinais();
    }

    /**
     * Marcador se o cidadão utiliza plantas medicinais.
     * @param statusUsaPlantaMedicinais 
     */
    public void setStatusUsaPlantaMedicinais(boolean statusUsaPlantaMedicinais) {
        instance.setStatusUsaPlantaMedicinais(statusUsaPlantaMedicinais);
    }

    
    protected CondicoesDeSaudeThrift getInstance(){
        return instance;
    }


    public boolean validate() {
        return validateDescricaoCausaInternacaoEm12Meses() &&
                validateDescricaoOutraCondicao1() &&
                validateDescricaoOutraCondicao2() &&
                validateDescricaoOutraCondicao3() &&
                validateDescricaoPlantasMedicinaisUsadas() &&
                validateDoencaCardiaca() &&
                validateDoencaRespiratoria() &&
                validateDoencaRins() &&
                ValidaMaternidadeDeReferencia();
    }
    
    /**
     * Valida a descrição da causaInternacao
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateDescricaoCausaInternacaoEm12Meses() {
        return !instance.isSetDescricaoCausaInternacaoEm12Meses() ||
               !instance.isStatusTeveInternadoEm12Meses() ||
               !(instance.getDescricaoCausaInternacaoEm12Meses().length() > 100); 
        
    }
    
    /**
     * Valida descricaoOutraCondicao1
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateDescricaoOutraCondicao1() {
    	return !instance.isSetDescricaoOutraCondicao1() ||
                !(instance.getDescricaoOutraCondicao1().length() > 100);
    }
    
    /**
     * Valida descricaoOutraCondicao2
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateDescricaoOutraCondicao2() {
    	return !instance.isSetDescricaoOutraCondicao2() ||
                !(instance.getDescricaoOutraCondicao2().length() > 100);
    }
    
    /**
     * Valida descricaoOutraCondicao3
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateDescricaoOutraCondicao3() {
    	return !instance.isSetDescricaoOutraCondicao3() ||
                !(instance.getDescricaoOutraCondicao3().length() > 100);
    }
    
    /**
     * Valida a descrição das plantas medicinais usadas
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateDescricaoPlantasMedicinaisUsadas() {
    	return !instance.isSetDescricaoPlantasMedicinaisUsadas() ||
                !instance.isSetStatusUsaPlantaMedicinais() ||
                instance.isStatusUsaPlantaMedicinais();
    }
    
    /**
     * Valida doencaCardiaca
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateDoencaCardiaca() {
    	return  !instance.isSetStatusTeveDoencaCardiaca() || (
                !instance.isStatusTeveDoencaCardiaca() &&
                !instance.isSetDoencaCardiaca() ) || (
                instance.isStatusTeveDoencaCardiaca() &&
                instance.isSetDoencaCardiaca() &&
                instance.getDoencaCardiacaSize() > 0 && 
                instance.getDoencaCardiacaSize() <= 3);
    }
    
    /**
     * Valida doencaRespiratoria
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateDoencaRespiratoria() {
    	return  !instance.isSetStatusTemDoencaRespiratoria()|| (
                !instance.isStatusTemDoencaRespiratoria()&&
                !instance.isSetDoencaRespiratoria()) || (
                instance.isStatusTemDoencaRespiratoria()&&
                instance.isSetDoencaRespiratoria() &&
                instance.getDoencaRespiratoriaSize() > 0 && 
                instance.getDoencaRespiratoriaSize() <= 4);
    }
    
    /**
     * Valida doencaRins
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateDoencaRins() {
    	return  !instance.isSetStatusTemTeveDoencasRins() || (
                !instance.isStatusTemTeveDoencasRins() &&
                !instance.isSetDoencaRins() ) || (
                instance.isStatusTemTeveDoencasRins() &&
                instance.isSetDoencaRins() &&
                instance.getDoencaRinsSize() > 0 && 
                instance.getDoencaRinsSize() <= 3);
    }
    
    /**
     * Valida MaternidadeDeReferencia.
     * Para ser válido, caso inserido deve:
     * 1- Ter tamanho entre 0 e 100
     * 2- StatusEhGestante != false
     * @return true se válido
     *          false se inválido
     */
    public boolean ValidaMaternidadeDeReferencia(){
        return !instance.isSetMaternidadeDeReferencia() || (
                instance.getMaternidadeDeReferencia().length() <= 100 &&
                (!instance.isSetStatusEhGestante() ||
                instance.isStatusEhGestante()));
    }
    
    //Não á validações possiveis para statusEhGestante
}

