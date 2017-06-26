package com.github.Eddyosos.integracao20171.esus.cds.consumoalimentar;

import br.gov.saude.esus.cds.transport.generated.thrift.consumoalimentar.FichaConsumoAlimentarThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.consumoalimentar.PerguntaQuestionarioCriancasComMaisDoisAnosThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.consumoalimentar.PerguntaQuestionarioCriancasDeSeisVinteTresMesesThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.consumoalimentar.PerguntaQuestionarioCriancasMenoresSeisMesesThrift;
import com.github.Eddyosos.integracao20171.esus.cds.common.UnicaLotacaoHeader;
import com.github.eddyosos.e_sus_ab_factory.cds.common.IUnicaLotacaoHeader;
import com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.consumoalimentar.IFichaConsumoAlimentar;
import com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.consumoalimentar.IPerguntaQuestionarioCriancasComMaisDoisAnos;
import com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.consumoalimentar.IPerguntaQuestionarioCriancasDeSeisVinteTresMeses;
import com.github.eddyosos.e_sus_ab_factory.cds.esus.cds.consumoalimentar.IPerguntaQuestionarioCriancasMenoresSeisMeses;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FichaConsumoAlimentar implements IFichaConsumoAlimentar {
    
    /**
     * Instancia para encapsulamento do Thrift
     */
    private FichaConsumoAlimentarThrift instance;
    
    public FichaConsumoAlimentar() {
        instance = new FichaConsumoAlimentarThrift();
    }
    
    public FichaConsumoAlimentar(FichaConsumoAlimentarThrift instance){
        this.instance = instance;
    }

    /**
     * Profissional que realizou a visita.
     * @return o profissional
     */
    @Override
    public IUnicaLotacaoHeader getHeaderTransport() {
        return new UnicaLotacaoHeader(instance.getHeaderTransport());
    }

    @Override
    public void unsetHeaderTransport() {
        instance.unsetHeaderTransport();
    }

     /**
     * Profissional que realizou a visita.
     * @return o profissional
     */
    @Override
    public boolean isSetHeaderTransport() {
        return instance.isSetHeaderTransport();
    }

    /**
     * Profissional que realizou a visita.
     * UnicaLotacaoHeader
     * @param value 
     */
    @Override
    public void setHeaderTransportIsSet(boolean value) {
        instance.setHeaderTransportIsSet(value);
    }
    
    /**
     * CNS do cidadão.
     * @return CNS
     */
    @Override
    public String getNumeroCartaoSus() {
        return instance.getNumeroCartaoSus();
    }

    /**
     * CNS do cidadão. 
     * @param numeroCartaoSus 
     * CNS válido de acordo com o algoritmo.
     */
    @Override
    public void setNumeroCartaoSus(String numeroCartaoSus) {
        instance.setNumeroCartaoSus(numeroCartaoSus);
    }

    @Override
    public void unsetNumeroCartaoSus() {
        instance.unsetNumeroCartaoSus();
    }

    @Override
    public void setNumeroCartaoSusIsSet(boolean value) {
        instance.setNumeroCartaoSusIsSet(value);
    }
    
    /**
     * Nome do cidadão
     * @return Nome do cidadão
     */
    @Override
    public String getIdentificacaoUsuario() {
        return instance.getIdentificacaoUsuario();
    }

    /**
     * Nome do cidadão
     * @param identificacaoUsuario 
     */
    @Override
    public void setIdentificacaoUsuario(String identificacaoUsuario) {
        instance.setIdentificacaoUsuario(identificacaoUsuario);
    }

    @Override
    public void unsetIdentificacaoUsuario() {
        instance.unsetIdentificacaoUsuario();
    }

    /**
     * Nome do cidadão
     * @return Nome do cidadão
     */
    @Override
    public boolean isSetIdentificacaoUsuario() {
        return instance.isSetIdentificacaoUsuario();
    }

    @Override
    public void setIdentificacaoUsuarioIsSet(boolean value) {
        instance.setIdentificacaoUsuarioIsSet(value);
    }
    
    /**
     * Data de nascimento do cidadão no formato epoch time.
     * @return Data de nascimento do cidadão
     */
    @Override
    public long getDataNascimento() {
        return instance.getDataNascimento();
    }

    /**
     * Data de nascimento do cidadão no formato epoch time
     * @param dataNascimento 
     */
    @Override
    public void setDataNascimento(long dataNascimento) {
        instance.setDataNascimento(dataNascimento);
    }

    @Override
    public void unsetDataNascimento() {
        instance.unsetDataNascimento();
    }
    
    /**
     * Data de nascimento do cidadão no formato epoch time.
     * @return Data de nascimento do cidadão
     */
    @Override
    public boolean isSetDataNascimento() {
        return instance.isSetDataNascimento();
    }

    /**
     * Data de nascimento do cidadão no formato epoch time.
     * @param value 
     */
    @Override
    public void setDataNascimentoIsSet(boolean value) {
        instance.setDataNascimentoIsSet(value);
    }
    /**
     * Código do sexo do cidadão.
     * @return Código do sexo do cidadão.
     */
    @Override
    public long getSexo() {
        return instance.getSexo();
    }

    /**
     * Código do sexo do cidadão 
     * @param sexo 
     * 0 Masculino	
     * 1 Feminino	
     */
    @Override
    public void setSexo(long sexo) {
        instance.setSexo(sexo);
    }

    @Override
    public void unsetSexo() {
        instance.unsetSexo();
    }

    /**
     * Código do sexo do cidadão 
     * @return Sexo
     */
    @Override
    public boolean isSetSexo() {
        return instance.isSetSexo();
    }

    @Override
    public void setSexoIsSet(boolean value) {
        instance.setSexoIsSet(value);
    }

    /**
     * Código do local onde o atendimento foi realizado.
     * @return Código do local de atendimento
     */
    @Override
    public long getLocalAtendimento() {
        return instance.getLocalAtendimento();
    }

    /**
     * Código do local onde o atendimento foi realizado
     * @param localAtendimento 
     */
    @Override
    public void setLocalAtendimento(long localAtendimento) {
        instance.setLocalAtendimento(localAtendimento);
    }

    @Override
    public void unsetLocalAtendimento() {
        instance.unsetLocalAtendimento();
    }

    @Override
    public boolean isSetLocalAtendimento() {
        return instance.isSetLocalAtendimento();
    }

    @Override
    public void setLocalAtendimentoIsSet(boolean value) {
        instance.setLocalAtendimentoIsSet(value);
    }

    /**
     * Marcadores referentes aos cidadãos menores de seis meses de idade
     * @return PerguntasQuestionarioCriancasMenoresSeisMesesSize
     */
    @Override
    public int getPerguntasQuestionarioCriancasMenoresSeisMesesSize() {
        return instance.getPerguntasQuestionarioCriancasMenoresSeisMesesSize();
    }

    @Override
    public void addToPerguntasQuestionarioCriancasMenoresSeisMeses(IPerguntaQuestionarioCriancasMenoresSeisMeses elem) {
        instance.addToPerguntasQuestionarioCriancasMenoresSeisMeses(elem.getInstance());
    }

    @Override
    public List<IPerguntaQuestionarioCriancasMenoresSeisMeses> getPerguntasQuestionarioCriancasMenoresSeisMeses() {
        List <IPerguntaQuestionarioCriancasMenoresSeisMeses> listaPerguntaQuestionario = new LinkedList<>();
        
        instance.getPerguntasQuestionarioCriancasMenoresSeisMeses().forEach((t)->{
            listaPerguntaQuestionario.add(new PerguntaQuestionarioCriancasMenoresSeisMeses (t));
        });
        
        return listaPerguntaQuestionario;
    }

    /**
     * Marcadores referentes aos cidadãos menores de seis meses de idade
     * @param perguntasQuestionarioCriancasMenoresSeisMeses 
     */
    @Override
    public void setPerguntasQuestionarioCriancasMenoresSeisMeses(List<IPerguntaQuestionarioCriancasMenoresSeisMeses> perguntasQuestionarioCriancasMenoresSeisMeses) {
        List<PerguntaQuestionarioCriancasMenoresSeisMesesThrift> listaQuestionario = new LinkedList<>();
        
        perguntasQuestionarioCriancasMenoresSeisMeses.forEach((elem) -> {
            listaQuestionario.add(elem.getInstance());
        });
        instance.setPerguntasQuestionarioCriancasMenoresSeisMeses(listaQuestionario);
    }

    @Override
    public void unsetPerguntasQuestionarioCriancasMenoresSeisMeses() {
        instance.unsetPerguntasQuestionarioCriancasMenoresSeisMeses();
    }

    /**
     * Marcadores referentes aos cidadãos menores de seis meses de idade
     * @return Marcadores referentes aos cidadãos menores de seis meses de idade
     */
    @Override
    public boolean isSetPerguntasQuestionarioCriancasMenoresSeisMeses() {
        return instance.isSetPerguntasQuestionarioCriancasMenoresSeisMeses();
    }

    /**
     * Marcadores referentes aos cidadãos menores de seis meses de idade
     * @param value 
     */
    @Override
    public void setPerguntasQuestionarioCriancasMenoresSeisMesesIsSet(boolean value) {
        instance.setPerguntasQuestionarioCriancasMenoresSeisMesesIsSet(value);
    }

     /**
     * Marcadores referentes aos cidadãos menores de seis meses de idade
     * @param value 
     */
    @Override
    public int getPerguntasQuestionarioCriancasDeSeisVinteTresMesesSize() {
        return instance.getPerguntasQuestionarioCriancasDeSeisVinteTresMesesSize();
    }

    /**
     * Marcadores referentes aos cidadãos que tem entre seis e vinte e três meses de idade.
     * @return Marcadores referentes aos cidadãos que tem entre seis e vinte e três meses de idade.
     */
    @Override
    public Iterator<IPerguntaQuestionarioCriancasDeSeisVinteTresMeses> getPerguntasQuestionarioCriancasDeSeisVinteTresMesesIterator() {
        
        List<IPerguntaQuestionarioCriancasDeSeisVinteTresMeses> listaPerguntaQuestionario = new LinkedList<>();
        instance.getPerguntasQuestionarioCriancasDeSeisVinteTresMesesIterator().forEachRemaining((t)->{
            listaPerguntaQuestionario.add(new PerguntaQuestionarioCriancasDeSeisVinteTresMeses (t));
        });
        
        return listaPerguntaQuestionario.iterator();
    }

    @Override
    public void addToPerguntasQuestionarioCriancasDeSeisVinteTresMeses(IPerguntaQuestionarioCriancasDeSeisVinteTresMeses elem) {
        instance.addToPerguntasQuestionarioCriancasDeSeisVinteTresMeses(elem.getInstance());
    }

    @Override
    public List<IPerguntaQuestionarioCriancasDeSeisVinteTresMeses> getPerguntasQuestionarioCriancasDeSeisVinteTresMeses() {
        List<IPerguntaQuestionarioCriancasDeSeisVinteTresMeses> listaPerguntaQuestionario = new LinkedList<>(); 
        instance.getPerguntasQuestionarioCriancasDeSeisVinteTresMeses().forEach((t)->{
            listaPerguntaQuestionario.add(new PerguntaQuestionarioCriancasDeSeisVinteTresMeses(t));
        });
        return listaPerguntaQuestionario;
    }

    /**
     * Marcadores referentes aos cidadãos que tem entre seis e vinte e três meses de idade.
     * @param perguntasQuestionarioCriancasDeSeisVinteTresMeses 
     */
    @Override
    public void setPerguntasQuestionarioCriancasDeSeisVinteTresMeses(List<IPerguntaQuestionarioCriancasDeSeisVinteTresMeses> perguntasQuestionarioCriancasDeSeisVinteTresMeses) {
       List<PerguntaQuestionarioCriancasDeSeisVinteTresMesesThrift>listaQuestionario = new LinkedList<>();
       
       perguntasQuestionarioCriancasDeSeisVinteTresMeses.forEach((elem)->{
            listaQuestionario.add(elem.getInstance());
       });
       instance.setPerguntasQuestionarioCriancasDeSeisVinteTresMeses(listaQuestionario);
    }

    @Override
    public void unsetPerguntasQuestionarioCriancasDeSeisVinteTresMeses() {
        instance.unsetPerguntasQuestionarioCriancasDeSeisVinteTresMeses();
    }

    @Override
    public boolean isSetPerguntasQuestionarioCriancasDeSeisVinteTresMeses() {
        return instance.isSetPerguntasQuestionarioCriancasDeSeisVinteTresMeses();
    }

    @Override
    public void setPerguntasQuestionarioCriancasDeSeisVinteTresMesesIsSet(boolean value) {
        instance.setPerguntasQuestionarioCriancasDeSeisVinteTresMesesIsSet(value);
    }

    
    @Override
    public int getPerguntasQuestionarioCriancasComMaisDoisAnosSize() {
        return instance.getPerguntasQuestionarioCriancasComMaisDoisAnosSize();
    }

    /**
     * Marcadores referentes aos cidadãos que tem vinte e quatro meses ou mais.
     * @return Marcadores referentes aos cidadãos que tem vinte e quatro meses ou mais.
     */
    @Override
    public Iterator<IPerguntaQuestionarioCriancasComMaisDoisAnos> getPerguntasQuestionarioCriancasComMaisDoisAnosIterator() {
        List<IPerguntaQuestionarioCriancasComMaisDoisAnos> listaPerguntaQuestionario = new LinkedList<>();
        instance.getPerguntasQuestionarioCriancasComMaisDoisAnosIterator().forEachRemaining((t)->{
            listaPerguntaQuestionario.add(new PerguntaQuestionarioCriancasComMaisDoisAnos(t));
        });
        return listaPerguntaQuestionario.iterator();
    }

    @Override
    public void addToPerguntasQuestionarioCriancasComMaisDoisAnos(IPerguntaQuestionarioCriancasComMaisDoisAnos elem) {
        instance.addToPerguntasQuestionarioCriancasComMaisDoisAnos(elem.getInstance());
    }

    /**
     * Marcadores referentes aos cidadãos que tem vinte e quatro meses ou mais.
     * @return List
     */
    @Override
    public List<IPerguntaQuestionarioCriancasComMaisDoisAnos> getPerguntasQuestionarioCriancasComMaisDoisAnos() {
        List<IPerguntaQuestionarioCriancasComMaisDoisAnos> listaPerguntaQuestionario = new LinkedList<>();
        instance.getPerguntasQuestionarioCriancasComMaisDoisAnos().forEach((t)->{
            listaPerguntaQuestionario.add(new PerguntaQuestionarioCriancasComMaisDoisAnos(t));
        });
        return listaPerguntaQuestionario;
    }

    /**
     * Marcadores referentes aos cidadãos que tem vinte e quatro meses ou mais.
     * @param perguntasQuestionarioCriancasComMaisDoisAnos 
     */
    @Override
    public void setPerguntasQuestionarioCriancasComMaisDoisAnos(List<IPerguntaQuestionarioCriancasComMaisDoisAnos> perguntasQuestionarioCriancasComMaisDoisAnos) {
        List<PerguntaQuestionarioCriancasComMaisDoisAnosThrift> listaPerguntaQuestionario = new LinkedList<>();
        
        perguntasQuestionarioCriancasComMaisDoisAnos.forEach((elem)->{
            listaPerguntaQuestionario.add(elem.getInstance());  
        });
        
        instance.setPerguntasQuestionarioCriancasComMaisDoisAnos(listaPerguntaQuestionario);
    }

    @Override
    public void unsetPerguntasQuestionarioCriancasComMaisDoisAnos() {
        instance.unsetPerguntasQuestionarioCriancasComMaisDoisAnos();
    }

    /**
     * Marcadores referentes aos cidadãos que tem vinte e quatro meses ou mais.
     * @return Marcadores referentes aos cidadãos que tem vinte e quatro meses ou mais.
     */
    @Override
    public boolean isSetPerguntasQuestionarioCriancasComMaisDoisAnos() {
        return instance.isSetPerguntasQuestionarioCriancasComMaisDoisAnos();
    }

    @Override
    public void setPerguntasQuestionarioCriancasComMaisDoisAnosIsSet(boolean value) {
        instance.setPerguntasQuestionarioCriancasComMaisDoisAnosIsSet(value);
    }

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @return Código UUID para identificar a ficha na base de dados nacional.
     */
    @Override
    public String getUuidFicha() {
        return instance.getUuidFicha();
    }

    /**
     * 
     * @param uuidFicha 
     */
    @Override
    public void setUuidFicha(String uuidFicha) {
        instance.setUuidFicha(uuidFicha);
    }

    @Override
    public void unsetUuidFicha() {
        instance.unsetUuidFicha();
    }

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @return 
     */
    @Override
    public boolean isSetUuidFicha() {
        return instance.isSetUuidFicha();
    }

    @Override
    public void setUuidFichaIsSet(boolean value) {
        instance.setUuidFichaIsSet(value);
    }

    /**
     * Tipo de origem dos dados do registro.
     * @return Tipo de origem dos dados do registro.
     */
    @Override
    public int getTpCdsOrigem() {
        return instance.getTpCdsOrigem();
    }

    @Override
    public void setTpCdsOrigem(int tpCdsOrigem) {
        instance.setTpCdsOrigem(tpCdsOrigem);
    }

    @Override
    public void unsetTpCdsOrigem() {
        instance.unsetTpCdsOrigem();
    }

    /**
     * Tipo de origem dos dados do registro.
     * @return Tipo de origem dos dados do registro.
     */
    @Override
    public boolean isSetTpCdsOrigem() {
        return instance.isSetTpCdsOrigem();
    }

    @Override
    public void setTpCdsOrigemIsSet(boolean value) {
        instance.setTpCdsOrigemIsSet(value);
    }

    /**
     * Metodo validade cria os metodos que fazem as validações
     * Chama todos os metodos que fazem validações
     * @return Todos os metodos de validação
     */
    @Override
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
    @Override
    public boolean validaHeaderTransport(){
        return instance.getHeaderTransport() != null;            
    }
    
    /**
     * Valida numero CNS do cidadão
     * @return CNS
     * Deve ter apenas 15 caracteres 
     * CNS válido de acordo com o algoritmo.
     */
    @Override
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
    @Override
    public boolean validaIdentificacaoUsuario(){
        String nomeCidadao = instance.getIdentificacaoUsuario();
        return instance.isSetIdentificacaoUsuario() &&
               nomeCidadao != null &&
               (nomeCidadao.length() >= 5 &&
               nomeCidadao.length() <=100);
    }
    
    /**
     * Valida Data de nascimento do cidadão no formato epoch time.
     * @return Data de nascimento do cidadão no formato epoch time.
     * Valida se o campo é null
     * Valida: Não pode ser posterior a dataAtendimento e anterior a 130 anos a partir da dataAtendimento.
     * Não pode ser posterior a dataAtendimento e anterior a 130 anos a partir da dataAtendimento.
     */
    @Override
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
    @Override
    public boolean validaSexo(){
        return instance.isSetSexo() &&
               instance.getSexo() >=0 &&
               instance.getSexo() <=1;
    }
    
    /**
     * Valida Código do local onde o atendimento foi realizado.
     * @return não pode ser nulo
     */
    @Override
    public boolean validaLocalAtendimento(){
        return instance.isSetLocalAtendimento();
    }
    
    /**
     * Valida Questionário de cidadãos menores de seis meses de idade
     * @return Marcadores referentes aos cidadãos menores de seis meses de idade
     * E validação de data de atendimento
     * Se dataNascimento < 6 meses a partir da dataAtendimento.
     */
    @Override
    public boolean validaPerguntasQuestionarioCriancasMenoresSeisMeses(){
        
        long dataNascimento = instance.getDataNascimento();
        long dataAtendimento = instance.getHeaderTransport().getDataAtendimento();
        long anoEpoch = 60*60*24*183;
        
        if((dataNascimento - dataAtendimento)<anoEpoch) return true &&                                                       instance.isSetPerguntasQuestionarioCriancasMenoresSeisMeses();
        else return false;
    }
    
    /**
     * Valida cidadãos que tem entre seis e vinte e três meses de idade.
     * @return Marcadores referentes aos cidadãos que tem entre seis e vinte e três meses de idade.
     * Se dataNascimento >= 6 meses e <= 23 meses a partir da dataAtendimento.
     */
    @Override
    public boolean validaPerguntasQuestionarioCriancasDeSeisVinteTresMeses(){
        
        long dataNascimento = instance.getDataNascimento();
        long dataAtendimento = instance.getHeaderTransport().getDataAtendimento();
        long anoEpoch = 60*60*24*183;
        long anoEpoch2 = 60*60*24*700;
        
        if(((dataNascimento - dataAtendimento)>= anoEpoch)&&((dataNascimento - dataAtendimento)<=anoEpoch2)) return true && 
                instance.isSetPerguntasQuestionarioCriancasDeSeisVinteTresMeses();
        else 
            return false;  
    }
    
    /**
     * Valida cidadãos que tem vinte e quatro meses ou mais.
     * @return Marcadores referentes aos cidadãos que tem vinte e quatro meses ou mais.
     * E se dataNascimento >= 24 meses a partir da dataAtendimento.
     */
    @Override
    public boolean validaPerguntasQuestionarioCriancasComMaisDoisAnos(){
        
        long dataNascimento = instance.getDataNascimento();
        long dataAtendimento = instance.getHeaderTransport().getDataAtendimento();
        long anoEpoch = 60*60*24*730;
        
        if(((dataNascimento - dataAtendimento)>= anoEpoch)) return true && 
                instance.isSetPerguntasQuestionarioCriancasComMaisDoisAnos();
        else 
            return false;
    }
    
    /**
     * Valida Código UUID para identificar a ficha na base de dados nacional.
     * @return verificação de nulo 
     * E capo com minimo de 36 e maximo de 46 caracteres
     */
    @Override
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
    @Override
    public boolean validaTpCDsOrigem(){
        int tpCdsOrigem = instance.getTpCdsOrigem();
        return instance.isSetTpCdsOrigem() &&
                (tpCdsOrigem ==1);
    }   

}