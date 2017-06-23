package com.github.Eddyosos.integracao20171.esus.cds.consumoalimentar;

import br.gov.saude.esus.cds.transport.generated.thrift.consumoalimentar.FichaConsumoAlimentarThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.consumoalimentar.PerguntaQuestionarioCriancasComMaisDoisAnosThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.consumoalimentar.PerguntaQuestionarioCriancasDeSeisVinteTresMesesThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.consumoalimentar.PerguntaQuestionarioCriancasMenoresSeisMesesThrift;
import com.github.Eddyosos.integracao20171.esus.cds.common.UnicaLotacaoHeader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FichaConsumoAlimentar {
    private FichaConsumoAlimentarThrift instance = new FichaConsumoAlimentarThrift();
    
    protected FichaConsumoAlimentar(FichaConsumoAlimentarThrift instance){
        this.instance = instance;
    }

    public FichaConsumoAlimentar deepCopy() {
            return new FichaConsumoAlimentar(instance.deepCopy());
    }
    /**
     * Profissional que realizou a visita.
     * @return o profissional
     */
    public UnicaLotacaoHeader getHeaderTransport() {
        return new UnicaLotacaoHeader(instance.getHeaderTransport());
    }

    public void unsetHeaderTransport() {
        instance.unsetHeaderTransport();
    }

    public boolean isSetHeaderTransport() {
        return instance.isSetHeaderTransport();
    }

    public void setHeaderTransportIsSet(boolean value) {
        instance.setHeaderTransportIsSet(value);
    }
    /**
     * CNS do cidadão.
     * @return CNS
     */
    public String getNumeroCartaoSus() {
        return instance.getNumeroCartaoSus();
    }

    public void setNumeroCartaoSus(String numeroCartaoSus) {
        instance.setNumeroCartaoSus(numeroCartaoSus);
    }

    public void unsetNumeroCartaoSus() {
        instance.unsetNumeroCartaoSus();
    }

    public void setNumeroCartaoSusIsSet(boolean value) {
        instance.setNumeroCartaoSusIsSet(value);
    }
    
    /**
     * Nome do cidadão
     * @return Nome do cidadão
     */
    public String getIdentificacaoUsuario() {
        return instance.getIdentificacaoUsuario();
    }

    public void setIdentificacaoUsuario(String identificacaoUsuario) {
        instance.setIdentificacaoUsuario(identificacaoUsuario);
    }

    public void unsetIdentificacaoUsuario() {
        instance.unsetIdentificacaoUsuario();
    }

    public boolean isSetIdentificacaoUsuario() {
        return instance.isSetIdentificacaoUsuario();
    }

    public void setIdentificacaoUsuarioIsSet(boolean value) {
        instance.setIdentificacaoUsuarioIsSet(value);
    }
    
    /**
     * Data de nascimento do cidadão no formato epoch time.
     * @return Data de nascimento do cidadão
     */
    public long getDataNascimento() {
        return instance.getDataNascimento();
    }

    public void setDataNascimento(long dataNascimento) {
        instance.setDataNascimento(dataNascimento);
    }

    public void unsetDataNascimento() {
        instance.unsetDataNascimento();
    }
    
    /**
     * Data de nascimento do cidadão no formato epoch time.
     * @return Data de nascimento do cidadão
     */
    public boolean isSetDataNascimento() {
        return instance.isSetDataNascimento();
    }

    public void setDataNascimentoIsSet(boolean value) {
        instance.setDataNascimentoIsSet(value);
    }
    /**
     * Código do sexo do cidadão.
     * @return Código do sexo do cidadão.
     */
    public long getSexo() {
        return instance.getSexo();
    }

    public void setSexo(long sexo) {
        instance.setSexo(sexo);
    }

    public void unsetSexo() {
        instance.unsetSexo();
    }

    public boolean isSetSexo() {
        return instance.isSetSexo();
    }

    public void setSexoIsSet(boolean value) {
        instance.setSexoIsSet(value);
    }

    /**
     * Código do local onde o atendimento foi realizado.
     * @return Código do local de atendimento
     */
    public long getLocalAtendimento() {
        return instance.getLocalAtendimento();
    }

    public void setLocalAtendimento(long localAtendimento) {
        instance.setLocalAtendimento(localAtendimento);
    }

    public void unsetLocalAtendimento() {
        instance.unsetLocalAtendimento();
    }

    public boolean isSetLocalAtendimento() {
        return instance.isSetLocalAtendimento();
    }

    public void setLocalAtendimentoIsSet(boolean value) {
        instance.setLocalAtendimentoIsSet(value);
    }

    public int getPerguntasQuestionarioCriancasMenoresSeisMesesSize() {
        return instance.getPerguntasQuestionarioCriancasMenoresSeisMesesSize();
    }

    public void addToPerguntasQuestionarioCriancasMenoresSeisMeses(PerguntaQuestionarioCriancasMenoresSeisMeses elem) {
        instance.addToPerguntasQuestionarioCriancasMenoresSeisMeses(elem.getInstance());
    }

    public List<PerguntaQuestionarioCriancasMenoresSeisMeses> getPerguntasQuestionarioCriancasMenoresSeisMeses() {
        List <PerguntaQuestionarioCriancasMenoresSeisMeses> listaPerguntaQuestionario = new LinkedList<>();
        
        instance.getPerguntasQuestionarioCriancasMenoresSeisMeses().forEach((t)->{
            listaPerguntaQuestionario.add(new PerguntaQuestionarioCriancasMenoresSeisMeses (t));
        });
        
        return listaPerguntaQuestionario;
    }

    /**
     * Marcadores referentes aos cidadãos menores de seis meses de idade
     * @param perguntasQuestionarioCriancasMenoresSeisMeses 
     */
    public void setPerguntasQuestionarioCriancasMenoresSeisMeses(List<PerguntaQuestionarioCriancasMenoresSeisMeses> perguntasQuestionarioCriancasMenoresSeisMeses) {
        List<PerguntaQuestionarioCriancasMenoresSeisMesesThrift> listaQuestionario = new LinkedList<>();
        
        perguntasQuestionarioCriancasMenoresSeisMeses.forEach((elem) -> {
            listaQuestionario.add(elem.getInstance());
        });
        instance.setPerguntasQuestionarioCriancasMenoresSeisMeses(listaQuestionario);
    }

    public void unsetPerguntasQuestionarioCriancasMenoresSeisMeses() {
        instance.unsetPerguntasQuestionarioCriancasMenoresSeisMeses();
    }

    /**
     * Marcadores referentes aos cidadãos menores de seis meses de idade
     * @return Marcadores referentes aos cidadãos menores de seis meses de idade
     */
    public boolean isSetPerguntasQuestionarioCriancasMenoresSeisMeses() {
        return instance.isSetPerguntasQuestionarioCriancasMenoresSeisMeses();
    }

    /**
     * Marcadores referentes aos cidadãos menores de seis meses de idade
     * @param value 
     */
    public void setPerguntasQuestionarioCriancasMenoresSeisMesesIsSet(boolean value) {
        instance.setPerguntasQuestionarioCriancasMenoresSeisMesesIsSet(value);
    }

    public int getPerguntasQuestionarioCriancasDeSeisVinteTresMesesSize() {
        return instance.getPerguntasQuestionarioCriancasDeSeisVinteTresMesesSize();
    }

    /**
     * Marcadores referentes aos cidadãos que tem entre seis e vinte e três meses de idade.
     * @return Marcadores referentes aos cidadãos que tem entre seis e vinte e três meses de idade.
     */
    public Iterator<PerguntaQuestionarioCriancasDeSeisVinteTresMeses> getPerguntasQuestionarioCriancasDeSeisVinteTresMesesIterator() {
        
        List<PerguntaQuestionarioCriancasDeSeisVinteTresMeses> listaPerguntaQuestionario = new LinkedList<>();
        instance.getPerguntasQuestionarioCriancasDeSeisVinteTresMesesIterator().forEachRemaining((t)->{
            listaPerguntaQuestionario.add(new PerguntaQuestionarioCriancasDeSeisVinteTresMeses (t));
        });
        
        return listaPerguntaQuestionario.iterator();
    }

    public void addToPerguntasQuestionarioCriancasDeSeisVinteTresMeses(PerguntaQuestionarioCriancasDeSeisVinteTresMeses elem) {
        instance.addToPerguntasQuestionarioCriancasDeSeisVinteTresMeses(elem.getInstance());
    }

    public List<PerguntaQuestionarioCriancasDeSeisVinteTresMeses> getPerguntasQuestionarioCriancasDeSeisVinteTresMeses() {
        List<PerguntaQuestionarioCriancasDeSeisVinteTresMeses> listaPerguntaQuestionario = new LinkedList<>(); 
        instance.getPerguntasQuestionarioCriancasDeSeisVinteTresMeses().forEach((t)->{
            listaPerguntaQuestionario.add(new PerguntaQuestionarioCriancasDeSeisVinteTresMeses(t));
        });
        return listaPerguntaQuestionario;
    }

    public void setPerguntasQuestionarioCriancasDeSeisVinteTresMeses(List<PerguntaQuestionarioCriancasDeSeisVinteTresMeses> perguntasQuestionarioCriancasDeSeisVinteTresMeses) {
       List<PerguntaQuestionarioCriancasDeSeisVinteTresMesesThrift>listaQuestionario = new LinkedList<>();
       
       perguntasQuestionarioCriancasDeSeisVinteTresMeses.forEach((elem)->{
            listaQuestionario.add(elem.getInstance());
       });
       instance.setPerguntasQuestionarioCriancasDeSeisVinteTresMeses(listaQuestionario);
    }

    public void unsetPerguntasQuestionarioCriancasDeSeisVinteTresMeses() {
        instance.unsetPerguntasQuestionarioCriancasDeSeisVinteTresMeses();
    }

    public boolean isSetPerguntasQuestionarioCriancasDeSeisVinteTresMeses() {
        return instance.isSetPerguntasQuestionarioCriancasDeSeisVinteTresMeses();
    }

    public void setPerguntasQuestionarioCriancasDeSeisVinteTresMesesIsSet(boolean value) {
        instance.setPerguntasQuestionarioCriancasDeSeisVinteTresMesesIsSet(value);
    }

    public int getPerguntasQuestionarioCriancasComMaisDoisAnosSize() {
        return instance.getPerguntasQuestionarioCriancasComMaisDoisAnosSize();
    }

    /**
     * Marcadores referentes aos cidadãos que tem vinte e quatro meses ou mais.
     * @return Marcadores referentes aos cidadãos que tem vinte e quatro meses ou mais.
     */
    public Iterator<PerguntaQuestionarioCriancasComMaisDoisAnos> getPerguntasQuestionarioCriancasComMaisDoisAnosIterator() {
        List<PerguntaQuestionarioCriancasComMaisDoisAnos> listaPerguntaQuestionario = new LinkedList<>();
        instance.getPerguntasQuestionarioCriancasComMaisDoisAnosIterator().forEachRemaining((t)->{
            listaPerguntaQuestionario.add(new PerguntaQuestionarioCriancasComMaisDoisAnos(t));
        });
        return listaPerguntaQuestionario.iterator();
    }

    public void addToPerguntasQuestionarioCriancasComMaisDoisAnos(PerguntaQuestionarioCriancasComMaisDoisAnos elem) {
        instance.addToPerguntasQuestionarioCriancasComMaisDoisAnos(elem.getInstance());
    }

    public List<PerguntaQuestionarioCriancasComMaisDoisAnos> getPerguntasQuestionarioCriancasComMaisDoisAnos() {
        List<PerguntaQuestionarioCriancasComMaisDoisAnos> listaPerguntaQuestionario = new LinkedList<>();
        instance.getPerguntasQuestionarioCriancasComMaisDoisAnos().forEach((t)->{
            listaPerguntaQuestionario.add(new PerguntaQuestionarioCriancasComMaisDoisAnos(t));
        });
        return listaPerguntaQuestionario;
    }

    public void setPerguntasQuestionarioCriancasComMaisDoisAnos(List<PerguntaQuestionarioCriancasComMaisDoisAnos> perguntasQuestionarioCriancasComMaisDoisAnos) {
        List<PerguntaQuestionarioCriancasComMaisDoisAnosThrift> listaPerguntaQuestionario = new LinkedList<>();
        
        perguntasQuestionarioCriancasComMaisDoisAnos.forEach((elem)->{
            listaPerguntaQuestionario.add(elem.getInstance());  
        });
        
        instance.setPerguntasQuestionarioCriancasComMaisDoisAnos(listaPerguntaQuestionario);
    }

    public void unsetPerguntasQuestionarioCriancasComMaisDoisAnos() {
        instance.unsetPerguntasQuestionarioCriancasComMaisDoisAnos();
    }

    /**
     * Marcadores referentes aos cidadãos que tem vinte e quatro meses ou mais.
     * @return Marcadores referentes aos cidadãos que tem vinte e quatro meses ou mais.
     */
    public boolean isSetPerguntasQuestionarioCriancasComMaisDoisAnos() {
        return instance.isSetPerguntasQuestionarioCriancasComMaisDoisAnos();
    }

    public void setPerguntasQuestionarioCriancasComMaisDoisAnosIsSet(boolean value) {
        instance.setPerguntasQuestionarioCriancasComMaisDoisAnosIsSet(value);
    }

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @return Código UUID para identificar a ficha na base de dados nacional.
     */
    public String getUuidFicha() {
        return instance.getUuidFicha();
    }

    /**
     * 
     * @param uuidFicha 
     */
    public void setUuidFicha(String uuidFicha) {
        instance.setUuidFicha(uuidFicha);
    }

    public void unsetUuidFicha() {
        instance.unsetUuidFicha();
    }

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @return 
     */
    public boolean isSetUuidFicha() {
        return instance.isSetUuidFicha();
    }

    public void setUuidFichaIsSet(boolean value) {
        instance.setUuidFichaIsSet(value);
    }

    /**
     * Tipo de origem dos dados do registro.
     * @return Tipo de origem dos dados do registro.
     */
    public int getTpCdsOrigem() {
        return instance.getTpCdsOrigem();
    }

    public void setTpCdsOrigem(int tpCdsOrigem) {
        instance.setTpCdsOrigem(tpCdsOrigem);
    }

    public void unsetTpCdsOrigem() {
        instance.unsetTpCdsOrigem();
    }

    /**
     * Tipo de origem dos dados do registro.
     * @return Tipo de origem dos dados do registro.
     */
    public boolean isSetTpCdsOrigem() {
        return instance.isSetTpCdsOrigem();
    }

    public void setTpCdsOrigemIsSet(boolean value) {
        instance.setTpCdsOrigemIsSet(value);
    }

    public boolean equals(FichaConsumoAlimentar that) {
        return instance.equals(that.instance);
    }

    public int compareTo(FichaConsumoAlimentar other) {
        return instance.compareTo(other.instance);
    }   

    /**
     * Metodo validade cria os metodos que fazem as validações
     * Chama todos os metodos que fazem validações
     * @return Todos os metodos de validação
     */
    public boolean validades(){
        return validaHeaderTransport() &&
                validaNumeroCartaoSus() &&
                validaNumeroCartaoSus() &&
                validaIdentificacaoUsuario() &&
                validaDataNascimento() && 
                validaSexo() &&
                validaLocalAtendimento() &&
                validaPerguntasQuestionarioCriancasMenoresSeisMeses()&&
                validaPerguntasQuestionarioCriancasDeSeisVinteTresMeses() &&
                validaPerguntasQuestionarioCriancasComMaisDoisAnos() && 
                validaUuidFicha() &&
                validaTpCDsOrigem();
    }
    
    /**
     * Valida profisional que realizou a visita
     * @return profisional
     * Não pode ser nulo
     */
    public boolean validaHeaderTransport(){
        return instance.getHeaderTransport() != null;            
    }
    
    /**
     * Valida numero CNS do cidadão
     * @return CNS
     * Deve ter apenas 15 caracteres 
     */
    public boolean validaNumeroCartaoSus(){
        String numeroCartaoSus = instance.getNumeroCartaoSus();
        return numeroCartaoSus != null && 
               numeroCartaoSus.length() ==15;
    }
    
    /**
     * Valida Nome do cidadão
     * @return Nome do cidadão 
     * Deve ter pelo menos 5 caracteres e no maximo 100
     */
    public boolean validaIdentificacaoUsuario(){
        String nomeCidadao = instance.getIdentificacaoUsuario();
        return instance.isSetIdentificacaoUsuario() &&
               nomeCidadao != null &&
               (nomeCidadao.length() == 5 ||
               nomeCidadao.length() <=100);
    }
    
    /**
     * Valida Data de nascimento do cidadão no formato epoch time.
     * @return Data de nascimento do cidadão no formato epoch time.
     * Valida se o campo é null
     * Valida: Não pode ser posterior a dataAtendimento e anterior a 130 anos a partir da dataAtendimento.
     */
    public boolean validaDataNascimento(){
        if(!instance.isSetDataNascimento()) return false;
        long dataNascimento = instance.getDataNascimento();
        long dataAtendimento = instance.getHeaderTransport().getDataAtendimento();
        if(dataNascimento > dataAtendimento) return false;
        long idadeAoAtender = dataNascimento - dataAtendimento;
        /**
         * Transformando 1 ano em segundo
         */
        long anoEpoch = 60*60*24*365;
        /**
         * Descobrindo se a idade do cidadão no atendimento é maior que 130 anos
         */
        if(idadeAoAtender > anoEpoch*130) return false;
        return true;   
    }
    
    /**
     * Valida Código do sexo do cidadão.
     * @return sexo
     * Valida Código se for 0 ou 1 e não pode ser  nulo
     */
    public boolean validaSexo(){
        return instance.isSetSexo() &&
               instance.getSexo() >=0 &&
               instance.getSexo() <=1;
    }
    
    /**
     * Valida Código do local onde o atendimento foi realizado.
     * @return não pode ser nulo
     */
    public boolean validaLocalAtendimento(){
        return instance.isSetLocalAtendimento();
    }
    
    /**
     * Valida Questionário de cidadãos menores de seis meses de idade
     * @return Marcadores referentes aos cidadãos menores de seis meses de idade
     * E validação de data de atendimento
     * Se dataNascimento < 6 meses a partir da dataAtendimento.
     */
    public boolean validaPerguntasQuestionarioCriancasMenoresSeisMeses(){
        return instance.isSetPerguntasQuestionarioCriancasMenoresSeisMeses() &&
               validaDataNascimento();
    }
    
    /**
     * Valida cidadãos que tem entre seis e vinte e três meses de idade.
     * @return Marcadores referentes aos cidadãos que tem entre seis e vinte e três meses de idade.
     * Se dataNascimento >= 6 meses e <= 23 meses a partir da dataAtendimento.
     */
    public boolean validaPerguntasQuestionarioCriancasDeSeisVinteTresMeses(){
        return instance.isSetPerguntasQuestionarioCriancasDeSeisVinteTresMeses() &&
               validaDataNascimento();
    }
    
    /**
     * Valida cidadãos que tem vinte e quatro meses ou mais.
     * @return Marcadores referentes aos cidadãos que tem vinte e quatro meses ou mais.
     * E se dataNascimento >= 24 meses a partir da dataAtendimento.
     */
    public boolean validaPerguntasQuestionarioCriancasComMaisDoisAnos(){
        return instance.isSetPerguntasQuestionarioCriancasComMaisDoisAnos() &&
               validaDataNascimento(); 
    }
    
    /**
     * Valida Código UUID para identificar a ficha na base de dados nacional.
     * @return verificação de nulo 
     * E capo com minimo de 36 e maximo de 46 caracteres
     */
    public boolean validaUuidFicha(){
        String UUID = instance.getUuidFicha();
        return instance.isSetUuidFicha() &&
               (UUID.length() >= 36 ||
               UUID.length() <=44);
    }
    
    /**
     * Valida Tipo de origem dos dados do registro.
     * @return Tipo de origem dos dados do registro.
     */
    public boolean validaTpCDsOrigem(){
        int tpCdsOrigem = instance.getTpCdsOrigem();
        return instance.isSetTpCdsOrigem() &&
                (tpCdsOrigem ==1);
    }
    
}