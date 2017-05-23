package com.github.Eddyosos.integracao20171.esus.cds.consumoalimentar;

import br.gov.saude.esus.cds.transport.generated.thrift.common.UnicaLotacaoHeaderThrift;
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

    public long getDataNascimento() {
        return instance.getDataNascimento();
    }

    public void setDataNascimento(long dataNascimento) {
        instance.setDataNascimento(dataNascimento);
    }

    public void unsetDataNascimento() {
        instance.unsetDataNascimento();
    }

    public boolean isSetDataNascimento() {
        return instance.isSetDataNascimento();
    }

    public void setDataNascimentoIsSet(boolean value) {
        instance.setDataNascimentoIsSet(value);
    }

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

    public boolean isSetPerguntasQuestionarioCriancasMenoresSeisMeses() {
        return instance.isSetPerguntasQuestionarioCriancasMenoresSeisMeses();
    }

    public void setPerguntasQuestionarioCriancasMenoresSeisMesesIsSet(boolean value) {
        instance.setPerguntasQuestionarioCriancasMenoresSeisMesesIsSet(value);
    }

    public int getPerguntasQuestionarioCriancasDeSeisVinteTresMesesSize() {
        return instance.getPerguntasQuestionarioCriancasDeSeisVinteTresMesesSize();
    }

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

    public List<PerguntaQuestionarioCriancasComMaisDoisAnosThrift> getPerguntasQuestionarioCriancasComMaisDoisAnos() {
        return instance.getPerguntasQuestionarioCriancasComMaisDoisAnos();
    }

    public void setPerguntasQuestionarioCriancasComMaisDoisAnos(List<PerguntaQuestionarioCriancasComMaisDoisAnosThrift> perguntasQuestionarioCriancasComMaisDoisAnos) {
        instance.setPerguntasQuestionarioCriancasComMaisDoisAnos(perguntasQuestionarioCriancasComMaisDoisAnos);
    }

    public void unsetPerguntasQuestionarioCriancasComMaisDoisAnos() {
        instance.unsetPerguntasQuestionarioCriancasComMaisDoisAnos();
    }

    public boolean isSetPerguntasQuestionarioCriancasComMaisDoisAnos() {
        return instance.isSetPerguntasQuestionarioCriancasComMaisDoisAnos();
    }

    public void setPerguntasQuestionarioCriancasComMaisDoisAnosIsSet(boolean value) {
        instance.setPerguntasQuestionarioCriancasComMaisDoisAnosIsSet(value);
    }

    public String getUuidFicha() {
        return instance.getUuidFicha();
    }

    public void setUuidFicha(String uuidFicha) {
        instance.setUuidFicha(uuidFicha);
    }

    public void unsetUuidFicha() {
        instance.unsetUuidFicha();
    }

    public boolean isSetUuidFicha() {
        return instance.isSetUuidFicha();
    }

    public void setUuidFichaIsSet(boolean value) {
        instance.setUuidFichaIsSet(value);
    }

    public int getTpCdsOrigem() {
        return instance.getTpCdsOrigem();
    }

    public void setTpCdsOrigem(int tpCdsOrigem) {
        instance.setTpCdsOrigem(tpCdsOrigem);
    }

    public void unsetTpCdsOrigem() {
        instance.unsetTpCdsOrigem();
    }

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

    
    
    
    
}

