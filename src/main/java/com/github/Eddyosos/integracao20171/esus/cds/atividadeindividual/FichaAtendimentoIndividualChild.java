package com.github.Eddyosos.integracao20171.esus.cds.atividadeindividual;

import br.gov.saude.esus.cds.transport.generated.thrift.atividadeindividual.FichaAtendimentoIndividualChildThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.atividadeindividual.OutrosSiaThrift;
import com.github.Eddyosos.integracao20171.utils.IDS.CNS;
import com.github.eddyosos.e_sus_ab_factory.cds.atividadeindividual.IFichaAtendimentoIndividualChild;
import com.github.eddyosos.e_sus_ab_factory.cds.atividadeindividual.IOutrosSia;
import com.github.eddyosos.e_sus_ab_factory.cds.atividadeindividual.IProblemaCondicaoAvaliacaoAI;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class FichaAtendimentoIndividualChild implements IFichaAtendimentoIndividualChild {
    private final FichaAtendimentoIndividualChildThrift instance;

    public FichaAtendimentoIndividualChild() {
        instance = new FichaAtendimentoIndividualChildThrift();
    }

    public FichaAtendimentoIndividualChild(FichaAtendimentoIndividualChildThrift thrift) {
        instance = thrift;
    }

    @Override
    public FichaAtendimentoIndividualChildThrift getInstance(){
        return instance;
    }
    
    /**
     * Valida essa instancia
     * @return true se válido
     *          false se inválido
     */
    @Override
    public boolean validates(){
        return validateNumeroProntuario() &&
                validateCns() &&
                validateDataNascimento() &&
                validateLocalDeAtendimento() &&
                validateSexo() && 
                validateTurno() &&
                validateTipoAtendimento() &&
                validatePesoAcompanhamentoNutricional() &&
                validateAlturaAcompanhamentoNutricional() &&
                validateAleitamentoMaterno() &&
                validateDumDaGestante() &&
                validateIdadeGestacional() &&
                validateAtencaoDomiciliarModalidade() &&
                validateProblemaCondicaoAvaliada() &&
                validateExamesSolicitados() &&
                validateExamesAvaliados() &&
                validateOutrosSia() &&
                validatePic() &&
                validateNasfs() &&
                validateCondutas() &&
                validateStGravidezPlanejada() &&
                validateNuGestasPrevias();
    }
    
    /**
     * Valida NumeroProntuario
     * Para ser válida, caso tenha sido inserida, deve ser ter entre 0 e 30 
     * (inclusivo) caracteres alfanuméricos
     * @return 
     */
    @Override
    public boolean validateNumeroProntuario(){
        String var = instance.getNumeroProntuario();
        return var == null || var.matches("\\A\\w{0,30}\\z");
    }
    
    /**
     * Número do prontuário
     * @return 
     */
    @Override
    public String getNumeroProntuario() {
        return instance.getNumeroProntuario();
    }

    /**
     * Número do prontuário
     * @param numeroProntuario 
     */
    @Override
    public void setNumeroProntuario(String numeroProntuario) {
        instance.setNumeroProntuario(numeroProntuario);
    }

    /**
     * Valida CNS
     * De acordo com com.github.Eddyosos.intregracao20171.utils.IDS.CNS
     * @return 
     */
    @Override
    public boolean validateCns(){
        return CNS.validateCNS(instance.getCns());
    }
    
    /**
     * CNS do cidadão.
     * @return 
     */
    @Override
    public String getCns() {
        return instance.getCns();
    }

    /**
     * CNS do cidadão.
     * @param cns 
     */
    @Override
    public void setCns(String cns) {
        instance.setCns(cns);
    }

    /**
     * Valida DataNascimento.
     * Para ser válido deve:
     * 1- Ter sido préviamente inserido
     * 2- Ter menos de 130 anos ao ser atendido(dataAtendimento) (Não implementado)
     * @return true se válido
     *          false se inválido
     */
    @Override
    public boolean validateDataNascimento() {
        return instance.isSetDataNascimento();
    }
    
    /**
     * Data de nascimento do cidadão.
     * @return 
     */
    @Override
    public long getDataNascimento() {
        return instance.getDataNascimento();
    }
    
    /**
     * Data de nascimento do cidadão.
     * @param dataNascimento 
     */
    @Override
    public void setDataNascimento(long dataNascimento) {
        instance.setDataNascimento(dataNascimento);
    }

    /**
     * Valida LocalDeAtendimento.
     * Para ser válido deve:
     * 1- Préviamente inserido
     * 2- Valor entre 1 e 10 (inclusivo)
     * @return 
     */
    @Override
    public boolean validateLocalDeAtendimento(){
        return instance.isSetLocalDeAtendimento() &&
               instance.getLocalDeAtendimento() >= 1 &&
               instance.getLocalDeAtendimento() <= 10;
    }
    
    /**
     * Código do local onde o atendimento foi realizado.
     * @return 
     */
    @Override
    public long getLocalDeAtendimento() {
        return instance.getLocalDeAtendimento();
    }

    /**
     * Código do local onde o atendimento foi realizado.
     * @param localDeAtendimento 
     */
    @Override
    public void setLocalDeAtendimento(long localDeAtendimento) {
        instance.setLocalDeAtendimento(localDeAtendimento);
    }

    /**
     * Valida Sexo
     * Para ser válido deve:
     * 1- Ter sido préviamente inserido
     * 2- Ter valor 0 ou 1
     * @return 
     */
    @Override
    public boolean validateSexo(){
        long var = instance.getSexo();
        return instance.isSetSexo() &&
                (var == 0 || var == 1);
    }
    
    /**
     * Código do sexo do cidadão.
     * @return 
     */
    @Override
    public long getSexo() {
        return instance.getSexo();
    }

    /**
     * Código do sexo do cidadão.
     * @param sexo 
     */
    @Override
    public void setSexo(long sexo) {
        instance.setSexo(sexo);
    }

    /**
     * Valida Turno
     * @return true se válido
     *          false se inválido
     */
    @Override
    public boolean validateTurno(){
        long var = instance.getTurno();
        return !instance.isSetTurno() || 
                var == 1 ||
                var == 2 ||
                var == 3;
                
    }
    
    /**
     * Código do turno em que o atendimento foi realizado.
     * @return 
     */
    @Override
    public long getTurno() {
        return instance.getTurno();
    }

    /**
     * Código do turno em que o atendimento foi realizado.
     * @param turno 
     */
    @Override
    public void setTurno(long turno) {
        instance.setTurno(turno);
    }

    /**
     * Valida Tipo de atendimento.
     * Para ser válido deve:
     * 1- Ter sido préviamente inserido
     * 2- Ter valor entre 1 e 6 (inclusivo)
     * @return 
     */
    @Override
    public boolean validateTipoAtendimento(){
        long var = instance.getTipoAtendimento();
        return instance.isSetTipoAtendimento() &&
                var >= 1 && var <= 6;
    }
    
    /**
     * Código do tipo de atendimento realizado.
     * @return 
     */
    @Override
    public long getTipoAtendimento() {
        return instance.getTipoAtendimento();
    }

    /**
     * Código do tipo de atendimento realizado.
     * @param tipoAtendimento 
     */
    @Override
    public void setTipoAtendimento(long tipoAtendimento) {
        instance.setTipoAtendimento(tipoAtendimento);
    }
    
    /**
     * Valida PesoAcompanhamentoNutricional.
     * Para ser valido, caso tenha sido inserido, deve:
     * 1- Máximo de 2 números após a vírgula.
     * 2- Se tiver vírgula, tamanho máximo = 7.
     * 3- Valor mínimo 0,5 e máximo 500.
     * @return true se válido
     *         false se inválido
     */
    @Override
    public boolean validatePesoAcompanhamentoNutricional(){
        double var = instance.getPesoAcompanhamentoNutricional();
        return !instance.isSetPesoAcompanhamentoNutricional() || 
                (var * 100 == (int) (var * 100) && 
                 var < 10000 &&
                 var >= 0.5 &&
                 var <= 500);
    }

    /**
     * Peso do cidadão em Kilogramas.
     * @return 
     */
    @Override
    public double getPesoAcompanhamentoNutricional() {
        return instance.getPesoAcompanhamentoNutricional();
    }

    /**
     * Peso do cidadão em Kilogramas.
     * @param pesoAcompanhamentoNutricional 
     */
    @Override
    public void setPesoAcompanhamentoNutricional(double pesoAcompanhamentoNutricional) {
        instance.setPesoAcompanhamentoNutricional(pesoAcompanhamentoNutricional);
    }

    /**
     * Valida AlturaAcompanhamentoNutricional.
     * Para ser válido deve:
     * 1- Máximo de 2 números após a vírgula.
     * 2- Se tiver vírgula, tamanho máximo = 5.
     * 3- Valor mínimo 20 e máximo 250.
     * @return true se válido
     *         false se inválido
     */
    @Override
    public boolean validateAlturaAcompanhamentoNutricional(){
        double var = instance.getAlturaAcompanhamentoNutricional();
        return !instance.isSetAlturaAcompanhamentoNutricional()|| 
                (var * 100 == (int) (var * 100) && 
                 var < 1000 &&
                 var >= 20 &&
                 var <= 250);
    }
    
    /**
     * Altura do cidadão em centímetros.
     * @return 
     */
    @Override
    public double getAlturaAcompanhamentoNutricional() {
        return instance.getAlturaAcompanhamentoNutricional();
    }

    /**
     * Altura do cidadão em centímetros.
     * @param alturaAcompanhamentoNutricional 
     */
    @Override
    public void setAlturaAcompanhamentoNutricional(double alturaAcompanhamentoNutricional) {
        instance.setAlturaAcompanhamentoNutricional(alturaAcompanhamentoNutricional);
    }

    /**
     * Valida AleitamentoMaterno
     * Para ser válido, caso tenha sido inserido deve:
     * Ter valor entre 1 e 4 (inclusivo)
     * @return 
     */
    @Override
    public boolean validateAleitamentoMaterno(){
        long var = instance.getAleitamentoMaterno();
        return !instance.isSetAleitamentoMaterno() || 
                (var >= 1 && var <= 4);
    }
    
    /**
     * Código do marcador referente ao aleitamento materno.
     * @return 
     */
    @Override
    public long getAleitamentoMaterno() {
        return instance.getAleitamentoMaterno();
    }

    /**
     * Código do marcador referente ao aleitamento materno.
     * @param aleitamentoMaterno 
     */
    @Override
    public void setAleitamentoMaterno(long aleitamentoMaterno) {
        instance.setAleitamentoMaterno(aleitamentoMaterno);
    }

    /**
     * Valida DumDaGestante.
     * Para ser válido, caso tenha sido inserido, deve:
     * 1- Não pode ser superior a dataAtendimento (não implementado), 
     * nem inferior a data de nascimento.
     * 2- Não pode ser preenchido quando Sexo = 0 (masculino).
     * @return true se válido
     *          false se inválido
     */
    @Override
    public boolean validateDumDaGestante(){
        return !instance.isSetDumDaGestante() || 
                (instance.getSexo() != 0 && 
                 instance.getDataNascimento() < instance.getDumDaGestante());
    }
    
    /**
     * Data da última menstruação da gestante.
     * @return 
     */
    @Override
    public long getDumDaGestante() {
        return instance.getDumDaGestante();
    }

    /**
     * Data da última menstruação da gestante.
     * @param dumDaGestante 
     */
    @Override
    public void setDumDaGestante(long dumDaGestante) {
        instance.setDumDaGestante(dumDaGestante);
    }

    /**
     * Valida IdadeGestacional.
     * Para ser válido, caso tenha sido inserido, deve:
     * 1- Valor mínimo 1 e máximo 42.
     * 2- Não pode ser preenchido quando Sexo = 0 (masculino).
     * @return true se válido
     *          false se inválido
     */
    @Override
    public boolean validateIdadeGestacional(){
        int var = instance.getIdadeGestacional();
        return !instance.isSetIdadeGestacional() ||
                (var >= 1 && var <= 42 &&
                 instance.getSexo() != 0);
    }
    
    /**
     * Idade gestacional em semanas.
     * @return 
     */
    @Override
    public int getIdadeGestacional() {
        return instance.getIdadeGestacional();
    }

    /**
     * Idade gestacional em semanas.
     * @param idadeGestacional 
     */
    @Override
    public void setIdadeGestacional(int idadeGestacional) {
        instance.setIdadeGestacional(idadeGestacional);
    }

    /**
     * Valida AtencaoDomiciliarModalidade
     * Para ser válido, caso tenha sido inserido, deve:
     * 1- Ter valor 1 a 3
     * @return true se válido
     *          false se inválido
     */
    @Override
    public boolean validateAtencaoDomiciliarModalidade(){
        long var = instance.getAtencaoDomiciliarModalidade();
        return !instance.isSetAtencaoDomiciliarModalidade() || 
                (var >= 1 && var <= 3);
    }
    
    /**
     * Código do modalidade AD do cidadão atendido.
     * @return 
     */
    @Override
    public long getAtencaoDomiciliarModalidade() {
        return instance.getAtencaoDomiciliarModalidade();
    }

    /**
     * Código do modalidade AD do cidadão atendido.
     * @param atencaoDomiciliarModalidade 
     */
    @Override
    public void setAtencaoDomiciliarModalidade(long atencaoDomiciliarModalidade) {
        instance.setAtencaoDomiciliarModalidade(atencaoDomiciliarModalidade);
    }

    /**
     * Valida ProblemaCondicaoAvaliada
     * Para ser valido deve ter sido préviamente inserido
     * @return true se válido
     *          false se inválido
     */
    @Override
    public boolean validateProblemaCondicaoAvaliada(){
        return instance.isSetProblemaCondicaoAvaliada();
    }
    
    /**
     * Situações de saúde avaliadas no atendimento.
     * @return 
     */
    @Override
    public IProblemaCondicaoAvaliacaoAI getProblemaCondicaoAvaliada() {
        return new ProblemaCondicaoAvaliacaoAI(instance.getProblemaCondicaoAvaliada());
    }

    /**
     * Situações de saúde avaliadas no atendimento.
     * @param problemaCondicaoAvaliada 
     */
    @Override
    public void setProblemaCondicaoAvaliada(IProblemaCondicaoAvaliacaoAI problemaCondicaoAvaliada) {
        instance.setProblemaCondicaoAvaliada(problemaCondicaoAvaliada.getInstance());
    }

    /**
     * Valida ExamesSolicitados.
     * Para ser válido, caso inserido, deve:
     * 1- Não pode ter exames iguais
     * 2- Não pode ter mais do que 23 exames
     * @return true se válido
     *          false se inválido
     */
    @Override
    public boolean validateExamesSolicitados(){
        if(instance.isSetExamesSolicitados()) {
            int size = instance.getExamesSolicitadosSize();
            if(size > 23) return false;
            Set exames = new HashSet(instance.getExamesSolicitados());
            if(exames.size() != size) return false;
        }
        return true;
    }
    
    /**
     * Lista de exames solicitados que são apresentados na ficha.
     * @return 
     */
    @Override
    public List<String> getExamesSolicitados() {
        return instance.getExamesSolicitados();
    }

    /**
     * Lista de exames solicitados que são apresentados na ficha.
     * @param examesSolicitados 
     */
    @Override
    public void setExamesSolicitados(List<String> examesSolicitados) {
        instance.setExamesSolicitados(examesSolicitados);
    }
    
    /**
     * Valida ExamesAvaliados.
     * Para ser válido, caso inserido, deve:
     * 1- Não pode ter exames iguais
     * 2- Não pode ter mais do que 23 exames
     * @return true se válido
     *          false se inválido
     */
    @Override
    public boolean validateExamesAvaliados(){
        if(instance.isSetExamesAvaliados()) {
            int size = instance.getExamesAvaliadosSize();
            if(size > 23) return false;
            Set exames = new HashSet(instance.getExamesAvaliados());
            if(exames.size() != size) return false;
        }
        return true;
    }
    
    /**
     * Lista de exames avaliados que são apresentados na ficha.
     * @return 
     */
    @Override
    public List<String> getExamesAvaliados() {
        return instance.getExamesAvaliados();
    }

    /**
     * Lista de exames avaliados que são apresentados na ficha.
     * @param examesAvaliados 
     */
    @Override
    public void setExamesAvaliados(List<String> examesAvaliados) {
        instance.setExamesAvaliados(examesAvaliados);
    }

    /**
     * Valida OutrosSia
     * Para ser válido, caso inserido, deve ter no máximo 3 itens
     * @return 
     */
    @Override
    public boolean validateOutrosSia(){
        return !instance.isSetOutrosSia() || instance.getOutrosSiaSize() < 3;
    }
    
    /**
     * Lista de outros exames.
     * @return 
     */
    @Override
    public List<IOutrosSia> getOutrosSia() {
        List<IOutrosSia> list = new LinkedList<>();
        instance.getOutrosSia().iterator().forEachRemaining((item) -> {
            list.add(new OutrosSia(item));
        });
        return list;
    }

    /**
     * Lista de outros exames.
     * @param outrosSia 
     */
    @Override
    public void setOutrosSia(List<IOutrosSia> outrosSia) {
        List<OutrosSiaThrift> list = new LinkedList<>();
        outrosSia.iterator().forEachRemaining((t) -> {
            list.add(t.getInstance());
        });
        instance.setOutrosSia(list);
    }

    // Não existem validações para VacinaEmDia
    
    /**
     * Marcador referente a vacinação em dia do cidadão.
     * @return 
     */
    @Override
    public boolean isVacinaEmDia() {
        return instance.isVacinaEmDia();
    }

    /**
     * Marcador referente a vacinação em dia do cidadão.
     * @param vacinaEmDia 
     */
    @Override
    public void setVacinaEmDia(boolean vacinaEmDia) {
        instance.setVacinaEmDia(vacinaEmDia);
    }

    /**
     * Valida Pic
     * Para ser válido, caso inserido, deve ter valor de 1 a 8
     * @return true se válido
     *          false se inválido
     */
    @Override
    public boolean validatePic(){
        long var = instance.getPic();
        return !instance.isSetPic() || 
                (var >= 1 && var <= 8);
    } 
    
    /**
     * Código das Práticas Integrativas e Complementares.
     * @return 
     */
    @Override
    public long getPic() {
        return instance.getPic();
    }

    /**
     * Código das Práticas Integrativas e Complementares.
     * @param pic 
     */
    @Override
    public void setPic(long pic) {
        instance.setPic(pic);
    }

    // Não á validações para FicouEmObservação
    
    /**
     * Marcador referente se o cidadão ficou em observação no atendimento.
     * @return 
     */
    @Override
    public boolean isFicouEmObservacao() {
        return instance.isFicouEmObservacao();
    }

    /**
     * Marcador referente se o cidadão ficou em observação no atendimento.
     * @param ficouEmObservacao 
     */
    @Override
    public void setFicouEmObservacao(boolean ficouEmObservacao) {
        instance.setFicouEmObservacao(ficouEmObservacao);
    }

    /**
     * Valida Nasfs
     * Para ser válido, caso inserido, deve ter no máximo 3 itens
     * @return true se válido
     *          false se inválido
     */
    @Override
    public boolean validateNasfs(){
        return !instance.isSetNasfs() ||
                instance.getNasfsSize() <= 3;
    }
    
    /**
     * Código das ações realizadas pelo Núcleo de Atenção a Saúde da Família
     * @return 
     */
    @Override
    public List<Long> getNasfs() {
        return instance.getNasfs();
    }

    /**
     * Código das ações realizadas pelo Núcleo de Atenção a Saúde da Família
     * @param nasfs 
     */
    @Override
    public void setNasfs(List<Long> nasfs) {
        instance.setNasfs(nasfs);
    }

    /**
     * Valida Condutas
     * Para ser válido, deve:
     * 1- Ter sido setado préviamente
     * 2- Ter entre 1 e 12 itens
     * 3- Cada valor deve ser entre 1 e 12
     * @return 
     */
    @Override
    public boolean validateCondutas(){
        if(!instance.isSetCondutas()) return false;
        
        int size = instance.getCondutasSize();
        if(size < 1 || size > 12) return false;
        
        boolean[] condutasUsadas = new boolean[13];
        for(int i = 0; i < condutasUsadas.length; i++) 
            condutasUsadas[i] = false;
        
        for(long conduta:instance.getCondutas())
            if(conduta > 12 || conduta < 1 || condutasUsadas[(int)conduta]) 
                return false;            
        
        return true;
    }
    
    /**
     * Código das condutas adotadas no atendimento.
     * @return 
     */
    @Override
    public List<Long> getCondutas() {
        return instance.getCondutas();
    }

    /**
     * Código das condutas adotadas no atendimento.
     * @param condutas 
     */
    @Override
    public void setCondutas(List<Long> condutas) {
        instance.setCondutas(condutas);
    }

    /**
     * Valida StGravidezPlanejada
     * Para ser válido, não pode ser preenchido quando Sexo = 0 (masculino)
     * @return true se válido
     *          false se inválido
     */
    @Override
    public boolean validateStGravidezPlanejada(){
        return !instance.isSetStGravidezPlanejada() || 
                instance.getSexo() != 0;
    }
    
    /**
     * Marcador que indica se a gravidez é planejada.
     * @return 
     */
    @Override
    public boolean isStGravidezPlanejada() {
        return instance.isStGravidezPlanejada();
    }

    /**
     * Marcador que indica se a gravidez é planejada.
     * @param stGravidezPlanejada 
     */
    @Override
    public void setStGravidezPlanejada(boolean stGravidezPlanejada) {
        instance.setStGravidezPlanejada(stGravidezPlanejada);
    }

    /**
     * Valida NuGestasPrevias
     * Para ser válido, caso inserido, deve:
     * 1- Não ter sexo = 0 (masculino)
     * 2- Valor entre 0 e 2
     * @return true se válido
     *          False se inválido
     */
    @Override
    public boolean validateNuGestasPrevias(){
        final int var = instance.getNuGestasPrevias();
        
        return !instance.isSetNuGestasPrevias() || (
                instance.getSexo() != 0 &&
                var >= 0 && var <= 2);
    }
    
    /**
     * Número de gestações prévias.
     * @return 
     */
    @Override
    public int getNuGestasPrevias() {
        return instance.getNuGestasPrevias();
    }

    /**
     * Número de gestações prévias.
     * @param nuGestasPrevias 
     */
    @Override
    public void setNuGestasPrevias(int nuGestasPrevias) {
        instance.setNuGestasPrevias(nuGestasPrevias);
    }
    
    /**
     * Valida NuPartos
     * Para ser válido, caso inserido, deve:
     * 1- Não ter sexo = 0 (masculino)
     * 2- Valor entre 0 e 2
     * @return true se válido
     *          False se inválido
     */
    @Override
    public boolean validateNuPartos(){
        final int var = instance.getNuPartos();
        
        return !instance.isSetNuPartos() || (
                instance.getSexo() != 0 &&
                var >= 0 && var <= 2);
    }

    /**
     * Número de partos que a mulher já teve.
     * @return 
     */
    @Override
    public int getNuPartos() {
        return instance.getNuPartos();
    }

    /**
     * Número de partos que a mulher já teve.
     * @param nuPartos 
     */
    @Override
    public void setNuPartos(int nuPartos) {
        instance.setNuPartos(nuPartos);
    }
}

