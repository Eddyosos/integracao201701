package com.github.Eddyosos.integracao20171.esus.cds.cadastroindividual;

import br.gov.saude.esus.cds.transport.generated.thrift.cadastroindividual.CondicoesDeSaudeThrift;
import java.util.Iterator;
import java.util.List;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;

public class CondicoesDeSaude {
    
    private CondicoesDeSaudeThrift instance = new CondicoesDeSaudeThrift();
    
    protected CondicoesDeSaude( CondicoesDeSaudeThrift condicoesDeSaudeTrift){
        this.instance = condicoesDeSaudeTrift;
    }

    public CondicoesDeSaude deepCopy() {
        return new CondicoesDeSaude(instance.deepCopy());
    }

    public void clear() {
        instance.clear();
    }

    public String getDescricaoCausaInternacaoEm12Meses() {
        return instance.getDescricaoCausaInternacaoEm12Meses();
    }

    public void setDescricaoCausaInternacaoEm12Meses(String descricaoCausaInternacaoEm12Meses) {
        instance.setDescricaoCausaInternacaoEm12Meses(descricaoCausaInternacaoEm12Meses);
    }

    public void unsetDescricaoCausaInternacaoEm12Meses() {
        instance.unsetDescricaoCausaInternacaoEm12Meses();
    }

    public boolean isSetDescricaoCausaInternacaoEm12Meses() {
        return instance.isSetDescricaoCausaInternacaoEm12Meses();
    }

    public void setDescricaoCausaInternacaoEm12MesesIsSet(boolean value) {
        instance.setDescricaoCausaInternacaoEm12MesesIsSet(value);
    }

    public String getDescricaoOutraCondicao1() {
        return instance.getDescricaoOutraCondicao1();
    }

    public void setDescricaoOutraCondicao1(String descricaoOutraCondicao1) {
        instance.setDescricaoOutraCondicao1(descricaoOutraCondicao1);
    }

    public void unsetDescricaoOutraCondicao1() {
        instance.unsetDescricaoOutraCondicao1();
    }

    public boolean isSetDescricaoOutraCondicao1() {
        return instance.isSetDescricaoOutraCondicao1();
    }

    public void setDescricaoOutraCondicao1IsSet(boolean value) {
        instance.setDescricaoOutraCondicao1IsSet(value);
    }

    public String getDescricaoOutraCondicao2() {
        return instance.getDescricaoOutraCondicao2();
    }

    public void setDescricaoOutraCondicao2(String descricaoOutraCondicao2) {
        instance.setDescricaoOutraCondicao2(descricaoOutraCondicao2);
    }

    public void unsetDescricaoOutraCondicao2() {
        instance.unsetDescricaoOutraCondicao2();
    }

    public boolean isSetDescricaoOutraCondicao2() {
        return instance.isSetDescricaoOutraCondicao2();
    }

    public void setDescricaoOutraCondicao2IsSet(boolean value) {
        instance.setDescricaoOutraCondicao2IsSet(value);
    }

    public String getDescricaoOutraCondicao3() {
        return instance.getDescricaoOutraCondicao3();
    }

    public void setDescricaoOutraCondicao3(String descricaoOutraCondicao3) {
        instance.setDescricaoOutraCondicao3(descricaoOutraCondicao3);
    }

    public void unsetDescricaoOutraCondicao3() {
        instance.unsetDescricaoOutraCondicao3();
    }

    public boolean isSetDescricaoOutraCondicao3() {
        return instance.isSetDescricaoOutraCondicao3();
    }

    public void setDescricaoOutraCondicao3IsSet(boolean value) {
        instance.setDescricaoOutraCondicao3IsSet(value);
    }

    public String getDescricaoPlantasMedicinaisUsadas() {
        return instance.getDescricaoPlantasMedicinaisUsadas();
    }

    public void setDescricaoPlantasMedicinaisUsadas(String descricaoPlantasMedicinaisUsadas) {
        instance.setDescricaoPlantasMedicinaisUsadas(descricaoPlantasMedicinaisUsadas);
    }

    public void unsetDescricaoPlantasMedicinaisUsadas() {
        instance.unsetDescricaoPlantasMedicinaisUsadas();
    }

    public boolean isSetDescricaoPlantasMedicinaisUsadas() {
        return instance.isSetDescricaoPlantasMedicinaisUsadas();
    }

    public void setDescricaoPlantasMedicinaisUsadasIsSet(boolean value) {
        instance.setDescricaoPlantasMedicinaisUsadasIsSet(value);
    }

    public int getDoencaCardiacaSize() {
        return instance.getDoencaCardiacaSize();
    }

    public Iterator<Long> getDoencaCardiacaIterator() {
        return instance.getDoencaCardiacaIterator();
    }

    public void addToDoencaCardiaca(long elem) {
        instance.addToDoencaCardiaca(elem);
    }

    public List<Long> getDoencaCardiaca() {
        return instance.getDoencaCardiaca();
    }

    public void setDoencaCardiaca(List<Long> doencaCardiaca) {
        instance.setDoencaCardiaca(doencaCardiaca);
    }

    public void unsetDoencaCardiaca() {
        instance.unsetDoencaCardiaca();
    }

    public boolean isSetDoencaCardiaca() {
        return instance.isSetDoencaCardiaca();
    }

    public void setDoencaCardiacaIsSet(boolean value) {
        instance.setDoencaCardiacaIsSet(value);
    }

    public int getDoencaRespiratoriaSize() {
        return instance.getDoencaRespiratoriaSize();
    }

    public Iterator<Long> getDoencaRespiratoriaIterator() {
        return instance.getDoencaRespiratoriaIterator();
    }

    public void addToDoencaRespiratoria(long elem) {
        instance.addToDoencaRespiratoria(elem);
    }

    public List<Long> getDoencaRespiratoria() {
        return instance.getDoencaRespiratoria();
    }

    public void setDoencaRespiratoria(List<Long> doencaRespiratoria) {
        instance.setDoencaRespiratoria(doencaRespiratoria);
    }

    public void unsetDoencaRespiratoria() {
        instance.unsetDoencaRespiratoria();
    }

    public boolean isSetDoencaRespiratoria() {
        return instance.isSetDoencaRespiratoria();
    }

    public void setDoencaRespiratoriaIsSet(boolean value) {
        instance.setDoencaRespiratoriaIsSet(value);
    }

    public int getDoencaRinsSize() {
        return instance.getDoencaRinsSize();
    }

    public Iterator<Long> getDoencaRinsIterator() {
        return instance.getDoencaRinsIterator();
    }

    public void addToDoencaRins(long elem) {
        instance.addToDoencaRins(elem);
    }

    public List<Long> getDoencaRins() {
        return instance.getDoencaRins();
    }

    public void setDoencaRins(List<Long> doencaRins) {
        instance.setDoencaRins(doencaRins);
    }

    public void unsetDoencaRins() {
        instance.unsetDoencaRins();
    }

    public boolean isSetDoencaRins() {
        return instance.isSetDoencaRins();
    }

    public void setDoencaRinsIsSet(boolean value) {
        instance.setDoencaRinsIsSet(value);
    }

    public String getMaternidadeDeReferencia() {
        return instance.getMaternidadeDeReferencia();
    }

    public void setMaternidadeDeReferencia(String maternidadeDeReferencia) {
        instance.setMaternidadeDeReferencia(maternidadeDeReferencia);
    }

    public void unsetMaternidadeDeReferencia() {
        instance.unsetMaternidadeDeReferencia();
    }

    public boolean isSetMaternidadeDeReferencia() {
        return instance.isSetMaternidadeDeReferencia();
    }

    public void setMaternidadeDeReferenciaIsSet(boolean value) {
        instance.setMaternidadeDeReferenciaIsSet(value);
    }

    public long getSituacaoPeso() {
        return instance.getSituacaoPeso();
    }

    public void setSituacaoPeso(long situacaoPeso) {
        instance.setSituacaoPeso(situacaoPeso);
    }

    public void unsetSituacaoPeso() {
        instance.unsetSituacaoPeso();
    }

    public boolean isSetSituacaoPeso() {
        return instance.isSetSituacaoPeso();
    }

    public void setSituacaoPesoIsSet(boolean value) {
        instance.setSituacaoPesoIsSet(value);
    }

    public boolean isStatusEhDependenteAlcool() {
        return instance.isStatusEhDependenteAlcool();
    }

    public void setStatusEhDependenteAlcool(boolean statusEhDependenteAlcool) {
        instance.setStatusEhDependenteAlcool(statusEhDependenteAlcool);
    }

    public void unsetStatusEhDependenteAlcool() {
        instance.unsetStatusEhDependenteAlcool();
    }

    public boolean isSetStatusEhDependenteAlcool() {
        return instance.isSetStatusEhDependenteAlcool();
    }

    public void setStatusEhDependenteAlcoolIsSet(boolean value) {
        instance.setStatusEhDependenteAlcoolIsSet(value);
    }

    public boolean isStatusEhDependenteOutrasDrogas() {
        return instance.isStatusEhDependenteOutrasDrogas();
    }

    public void setStatusEhDependenteOutrasDrogas(boolean statusEhDependenteOutrasDrogas) {
        instance.setStatusEhDependenteOutrasDrogas(statusEhDependenteOutrasDrogas);
    }

    public void unsetStatusEhDependenteOutrasDrogas() {
        instance.unsetStatusEhDependenteOutrasDrogas();
    }

    public boolean isSetStatusEhDependenteOutrasDrogas() {
        return instance.isSetStatusEhDependenteOutrasDrogas();
    }

    public void setStatusEhDependenteOutrasDrogasIsSet(boolean value) {
        instance.setStatusEhDependenteOutrasDrogasIsSet(value);
    }

    public boolean isStatusEhFumante() {
        return instance.isStatusEhFumante();
    }

    public void setStatusEhFumante(boolean statusEhFumante) {
        instance.setStatusEhFumante(statusEhFumante);
    }

    public void unsetStatusEhFumante() {
        instance.unsetStatusEhFumante();
    }

    public boolean isSetStatusEhFumante() {
        return instance.isSetStatusEhFumante();
    }

    public void setStatusEhFumanteIsSet(boolean value) {
        instance.setStatusEhFumanteIsSet(value);
    }

    public boolean isStatusEhGestante() {
        return instance.isStatusEhGestante();
    }

    public void setStatusEhGestante(boolean statusEhGestante) {
        instance.setStatusEhGestante(statusEhGestante);
    }

    public void unsetStatusEhGestante() {
        instance.unsetStatusEhGestante();
    }

    public boolean isSetStatusEhGestante() {
        return instance.isSetStatusEhGestante();
    }

    public void setStatusEhGestanteIsSet(boolean value) {
        instance.setStatusEhGestanteIsSet(value);
    }

    public boolean isStatusEstaAcamado() {
        return instance.isStatusEstaAcamado();
    }

    public void setStatusEstaAcamado(boolean statusEstaAcamado) {
        instance.setStatusEstaAcamado(statusEstaAcamado);
    }

    public void unsetStatusEstaAcamado() {
        instance.unsetStatusEstaAcamado();
    }

    public boolean isSetStatusEstaAcamado() {
        return instance.isSetStatusEstaAcamado();
    }

    public void setStatusEstaAcamadoIsSet(boolean value) {
        instance.setStatusEstaAcamadoIsSet(value);
    }

    public boolean isStatusEstaDomiciliado() {
        return instance.isStatusEstaDomiciliado();
    }

    public void setStatusEstaDomiciliado(boolean statusEstaDomiciliado) {
        instance.setStatusEstaDomiciliado(statusEstaDomiciliado);
    }

    public void unsetStatusEstaDomiciliado() {
        instance.unsetStatusEstaDomiciliado();
    }

    public boolean isSetStatusEstaDomiciliado() {
        return instance.isSetStatusEstaDomiciliado();
    }

    public void setStatusEstaDomiciliadoIsSet(boolean value) {
        instance.setStatusEstaDomiciliadoIsSet(value);
    }

    public boolean isStatusTemDiabetes() {
        return instance.isStatusTemDiabetes();
    }

    public void setStatusTemDiabetes(boolean statusTemDiabetes) {
        instance.setStatusTemDiabetes(statusTemDiabetes);
    }

    public void unsetStatusTemDiabetes() {
        instance.unsetStatusTemDiabetes();
    }

    public boolean isSetStatusTemDiabetes() {
        return instance.isSetStatusTemDiabetes();
    }

    public void setStatusTemDiabetesIsSet(boolean value) {
        instance.setStatusTemDiabetesIsSet(value);
    }

    public boolean isStatusTemDoencaRespiratoria() {
        return instance.isStatusTemDoencaRespiratoria();
    }

    public void setStatusTemDoencaRespiratoria(boolean statusTemDoencaRespiratoria) {
        instance.setStatusTemDoencaRespiratoria(statusTemDoencaRespiratoria);
    }

    public void unsetStatusTemDoencaRespiratoria() {
        instance.unsetStatusTemDoencaRespiratoria();
    }

    public boolean isSetStatusTemDoencaRespiratoria() {
        return instance.isSetStatusTemDoencaRespiratoria();
    }

    public void setStatusTemDoencaRespiratoriaIsSet(boolean value) {
        instance.setStatusTemDoencaRespiratoriaIsSet(value);
    }

    public boolean isStatusTemHanseniase() {
        return instance.isStatusTemHanseniase();
    }

    public void setStatusTemHanseniase(boolean statusTemHanseniase) {
        instance.setStatusTemHanseniase(statusTemHanseniase);
    }

    public void unsetStatusTemHanseniase() {
        instance.unsetStatusTemHanseniase();
    }

    public boolean isSetStatusTemHanseniase() {
        return instance.isSetStatusTemHanseniase();
    }

    public void setStatusTemHanseniaseIsSet(boolean value) {
        instance.setStatusTemHanseniaseIsSet(value);
    }

    public boolean isStatusTemHipertensaoArterial() {
        return instance.isStatusTemHipertensaoArterial();
    }

    public void setStatusTemHipertensaoArterial(boolean statusTemHipertensaoArterial) {
        instance.setStatusTemHipertensaoArterial(statusTemHipertensaoArterial);
    }

    public void unsetStatusTemHipertensaoArterial() {
        instance.unsetStatusTemHipertensaoArterial();
    }

    public boolean isSetStatusTemHipertensaoArterial() {
        return instance.isSetStatusTemHipertensaoArterial();
    }

    public void setStatusTemHipertensaoArterialIsSet(boolean value) {
        instance.setStatusTemHipertensaoArterialIsSet(value);
    }

    public boolean isStatusTemTeveCancer() {
        return instance.isStatusTemTeveCancer();
    }

    public void setStatusTemTeveCancer(boolean statusTemTeveCancer) {
        instance.setStatusTemTeveCancer(statusTemTeveCancer);
    }

    public void unsetStatusTemTeveCancer() {
        instance.unsetStatusTemTeveCancer();
    }

    public boolean isSetStatusTemTeveCancer() {
        return instance.isSetStatusTemTeveCancer();
    }

    public void setStatusTemTeveCancerIsSet(boolean value) {
        instance.setStatusTemTeveCancerIsSet(value);
    }

    public boolean isStatusTemTeveDoencasRins() {
        return instance.isStatusTemTeveDoencasRins();
    }

    public void setStatusTemTeveDoencasRins(boolean statusTemTeveDoencasRins) {
        instance.setStatusTemTeveDoencasRins(statusTemTeveDoencasRins);
    }

    public void unsetStatusTemTeveDoencasRins() {
        instance.unsetStatusTemTeveDoencasRins();
    }

    public boolean isSetStatusTemTeveDoencasRins() {
        return instance.isSetStatusTemTeveDoencasRins();
    }

    public void setStatusTemTeveDoencasRinsIsSet(boolean value) {
        instance.setStatusTemTeveDoencasRinsIsSet(value);
    }

    public boolean isStatusTemTuberculose() {
        return instance.isStatusTemTuberculose();
    }

    public void setStatusTemTuberculose(boolean statusTemTuberculose) {
        instance.setStatusTemTuberculose(statusTemTuberculose);
    }

    public void unsetStatusTemTuberculose() {
        instance.unsetStatusTemTuberculose();
    }

    public boolean isSetStatusTemTuberculose() {
        return instance.isSetStatusTemTuberculose();
    }

    public void setStatusTemTuberculoseIsSet(boolean value) {
        instance.setStatusTemTuberculoseIsSet(value);
    }

    public boolean isStatusTeveAvcDerrame() {
        return instance.isStatusTeveAvcDerrame();
    }

    public void setStatusTeveAvcDerrame(boolean statusTeveAvcDerrame) {
        instance.setStatusTeveAvcDerrame(statusTeveAvcDerrame);
    }

    public void unsetStatusTeveAvcDerrame() {
        instance.unsetStatusTeveAvcDerrame();
    }

    public boolean isSetStatusTeveAvcDerrame() {
        return instance.isSetStatusTeveAvcDerrame();
    }

    public void setStatusTeveAvcDerrameIsSet(boolean value) {
        instance.setStatusTeveAvcDerrameIsSet(value);
    }

    public boolean isStatusTeveDoencaCardiaca() {
        return instance.isStatusTeveDoencaCardiaca();
    }

    public void setStatusTeveDoencaCardiaca(boolean statusTeveDoencaCardiaca) {
        instance.setStatusTeveDoencaCardiaca(statusTeveDoencaCardiaca);
    }

    public void unsetStatusTeveDoencaCardiaca() {
        instance.unsetStatusTeveDoencaCardiaca();
    }

    public boolean isSetStatusTeveDoencaCardiaca() {
        return instance.isSetStatusTeveDoencaCardiaca();
    }

    public void setStatusTeveDoencaCardiacaIsSet(boolean value) {
        instance.setStatusTeveDoencaCardiacaIsSet(value);
    }

    public boolean isStatusTeveInfarto() {
        return instance.isStatusTeveInfarto();
    }

    public void setStatusTeveInfarto(boolean statusTeveInfarto) {
        instance.setStatusTeveInfarto(statusTeveInfarto);
    }

    public void unsetStatusTeveInfarto() {
        instance.unsetStatusTeveInfarto();
    }

    public boolean isSetStatusTeveInfarto() {
        return instance.isSetStatusTeveInfarto();
    }

    public void setStatusTeveInfartoIsSet(boolean value) {
        instance.setStatusTeveInfartoIsSet(value);
    }

    public boolean isStatusTeveInternadoEm12Meses() {
        return instance.isStatusTeveInternadoEm12Meses();
    }

    public void setStatusTeveInternadoEm12Meses(boolean statusTeveInternadoEm12Meses) {
        instance.setStatusTeveInternadoEm12Meses(statusTeveInternadoEm12Meses);
    }

    public void unsetStatusTeveInternadoEm12Meses() {
        instance.unsetStatusTeveInternadoEm12Meses();
    }

    public boolean isSetStatusTeveInternadoEm12Meses() {
        return instance.isSetStatusTeveInternadoEm12Meses();
    }

    public void setStatusTeveInternadoEm12MesesIsSet(boolean value) {
        instance.setStatusTeveInternadoEm12MesesIsSet(value);
    }

    public boolean isStatusTratamentoPsiquicoOuProblemaMental() {
        return instance.isStatusTratamentoPsiquicoOuProblemaMental();
    }

    public void setStatusTratamentoPsiquicoOuProblemaMental(boolean statusTratamentoPsiquicoOuProblemaMental) {
        instance.setStatusTratamentoPsiquicoOuProblemaMental(statusTratamentoPsiquicoOuProblemaMental);
    }

    public void unsetStatusTratamentoPsiquicoOuProblemaMental() {
        instance.unsetStatusTratamentoPsiquicoOuProblemaMental();
    }

    public boolean isSetStatusTratamentoPsiquicoOuProblemaMental() {
        return instance.isSetStatusTratamentoPsiquicoOuProblemaMental();
    }

    public void setStatusTratamentoPsiquicoOuProblemaMentalIsSet(boolean value) {
        instance.setStatusTratamentoPsiquicoOuProblemaMentalIsSet(value);
    }

    public boolean isStatusUsaOutrasPraticasIntegrativasOuComplementares() {
        return instance.isStatusUsaOutrasPraticasIntegrativasOuComplementares();
    }

    public void setStatusUsaOutrasPraticasIntegrativasOuComplementares(boolean statusUsaOutrasPraticasIntegrativasOuComplementares) {
        instance.setStatusUsaOutrasPraticasIntegrativasOuComplementares(statusUsaOutrasPraticasIntegrativasOuComplementares);
    }

    public void unsetStatusUsaOutrasPraticasIntegrativasOuComplementares() {
        instance.unsetStatusUsaOutrasPraticasIntegrativasOuComplementares();
    }

    public boolean isSetStatusUsaOutrasPraticasIntegrativasOuComplementares() {
        return instance.isSetStatusUsaOutrasPraticasIntegrativasOuComplementares();
    }

    public void setStatusUsaOutrasPraticasIntegrativasOuComplementaresIsSet(boolean value) {
        instance.setStatusUsaOutrasPraticasIntegrativasOuComplementaresIsSet(value);
    }

    public boolean isStatusUsaPlantaMedicinais() {
        return instance.isStatusUsaPlantaMedicinais();
    }

    public void setStatusUsaPlantaMedicinais(boolean statusUsaPlantaMedicinais) {
        instance.setStatusUsaPlantaMedicinais(statusUsaPlantaMedicinais);
    }

    public void unsetStatusUsaPlantaMedicinais() {
        instance.unsetStatusUsaPlantaMedicinais();
    }

    public boolean isSetStatusUsaPlantaMedicinais() {
        return instance.isSetStatusUsaPlantaMedicinais();
    }

    public void setStatusUsaPlantaMedicinaisIsSet(boolean value) {
        instance.setStatusUsaPlantaMedicinaisIsSet(value);
    }


    @Override
    public boolean equals(Object that) {
        return instance.equals(that);
    }

    public boolean equals(CondicoesDeSaude that) {
        return instance.equals(that.getInstance());
    }

    @Override
    public int hashCode() {
        return instance.hashCode();
    }

    public int compareTo(CondicoesDeSaude other) {
        return instance.compareTo(other.getInstance());
    }

    @Override
    public String toString() {
        return instance.toString();
    }
    
    protected CondicoesDeSaudeThrift getInstance(){
        return instance;
    }


    public boolean validate() {
        return true;
    }
    
    /**
     * Valida a descrição da causaInternacao
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateDescricaoCausaInternacaoEm12Meses() {
    	if (!instance.isStatusTeveInternadoEm12Meses() && !(instance.getDescricaoCausaInternacaoEm12Meses().length() > 0))
    		return true;
    	if (instance.isStatusTeveInternadoEm12Meses() && instance.getDescricaoCausaInternacaoEm12Meses().length() >= 0 && instance.getDescricaoCausaInternacaoEm12Meses().length() <= 100)
    		return true;
    	return false;
    }
    
    /**
     * Valida descricaoOutraCondicao1
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateDescricaoOutraCondicao1() {
    	if (instance.getDescricaoOutraCondicao1().length() >= 0 && instance.getDescricaoOutraCondicao1().length() <= 100)
    		return true;
    	return false;
    }
    
    /**
     * Valida descricaoOutraCondicao2
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateDescricaoOutraCondicao2() {
    	if (instance.getDescricaoOutraCondicao2().length() >= 0 && instance.getDescricaoOutraCondicao2().length() <= 100)
    		return true;
    	return false;
    }
    
    /**
     * Valida descricaoOutraCondicao3
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateDescricaoOutraCondicao3() {
    	if (instance.getDescricaoOutraCondicao3().length() >= 0 && instance.getDescricaoOutraCondicao3().length() <= 100)
    		return true;
    	return false;
    }
    
    /**
     * Valida a descrição das plantas medicinais usadas
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateDescricaoPlantasMedicinaisUsadas() {
    	if (!instance.isStatusUsaPlantaMedicinais() && !(instance.getDescricaoPlantasMedicinaisUsadas().length() > 0))
    		return true;
    	if (instance.isStatusUsaPlantaMedicinais() && instance.getDescricaoPlantasMedicinaisUsadas().length() >= 0 && instance.getDescricaoPlantasMedicinaisUsadas().length() <= 100)
    		return true;
    	return false;
    }
    
    /**
     * Valida doencaCardiaca
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateDoencaCardiaca() {
    	if (!instance.isStatusTeveDoencaCardiaca() && instance.getDoencaCardiaca().size() == 0)
    		return true;
    	if (instance.isStatusTeveDoencaCardiaca() && instance.getDoencaCardiaca().size() > 0 && instance.getDoencaCardiaca().size() <= 3)
    		return true;
    	return false;
    }
    
    /**
     * Valida doencaRespiratoria
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateDoencaRespiratoria() {
    	if (!instance.isStatusTemDoencaRespiratoria() && instance.getDoencaRespiratoria().size() == 0)
    		return true;
    	if (instance.isStatusTemDoencaRespiratoria() && instance.getDoencaRespiratoria().size() > 0 && instance.getDoencaRespiratoria().size() <= 4)
    		return true;
    	return false;
    }
    
    /**
     * Valida doencaRins
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateDoencaRins() {
    	if (!instance.isStatusTemTeveDoencasRins() && instance.getDoencaRins().size() == 0)
    		return true;
    	if (instance.isStatusTemTeveDoencasRins() && instance.getDoencaRins().size() > 0 && instance.getDoencaRins().size() <= 3)
    		return true;
    	return false;
    }
    
    /**
     * Valida situacaoPeso
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateSituacaoPeso() {
    	if (instance.isSetSituacaoPeso() && instance.getSituacaoPeso() < 21 && instance.getSituacaoPeso() > 23)
    		return false;
    	return true;
    }
    
    /**
     * Valida statusEhDependenteAlcool
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateStatusEhDependenteAlcool() {
    	return true;
    }
    
    /**
     * Valida statusEhDependenteOutrasDrogas
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateStatusEhDependenteOutrasDrogas() {
    	return true;
    }
    
    /**
     * Valida statusEhFumante
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateStatusEhFumante() {
    	return true;
    }
    
    /**
     * Valida statusEhGestante
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateStatusEhGestante() {
    	return true; //TODO #14
    }
    
    /**
     * Valida statusEstaAcamado
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateStatusEstaAcamado() {
    	return true;
    }
    
    /**
     * Valida statusEstaDomiciliado
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateStatusEstaDomiciliado() {
    	return true;
    }
    
    /**
     * Valida statusTemDiabetes
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateStatusTemDiabetes() {
    	return true;
    }
    
    /**
     * Valida statusTemDoencaRespiratoria
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateStatusTemDoencaRespiratoria() {
    	return true;
    }
    
    /**
     * Valida statusTemHanseniase
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateStatusTemHanseniase() {
    	return true;
    }
    
    /**
     * Valida statusTemTeveCancer
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateStatusTemTeveCancer() {
    	return true;
    }
    
    /**
     * Valida statusTemTeveDoencasRins
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateStatusTemTeveDoencasRins() {
    	return true;
    }
    
    /**
     * Valida statusTemTuberculose
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateStatusTemTuberculose() {
    	return true;
    }
    
    /**
     * Valida statusTeveAvcDerrame
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateStatusTeveAvcDerrame() {
    	return true;
    }
    
    /**
     * Valida statusTeveDoencaCardiaca
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateStatusTeveDoencaCardiaca() {
    	return true;
    }
    
    /**
     * Valida statusTeveInfarto
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateStatusTeveInfarto() {
    	return true;
    }
    
    /**
     * Valida statusTeveInternadoem12Meses
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateStatusTeveInternadoem12Meses() {
    	return true;
    }
    
    /**
     * Valida statusUsaOutrasPraticasIntegrativasOuComplementares
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateStatusUsaOutrasPraticasIntegrativasOuComplementares() {
    	return true;
    }
    
    /**
     * Valida statusUsaPlantasMedicinais
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateStatusUsaPlantasMedicinais() {
    	return true;
    }
    
    /**
     * Valida statusDiagnosticoMental
     * @return true se for válido
     * @return false se for inválido
     */
    public boolean validateStatusDiagnosticoMental() {
    	return true;
    }
    
}

