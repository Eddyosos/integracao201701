package com.github.Eddyosos.integracao20171.esus.cds.consumoalimentar;

//import br.gov.saude.esus.cds.transport.generated.thrift.common.UnicaLotacaoHeaderThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.consumoalimentar.FichaConsumoAlimentarThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.consumoalimentar.PerguntaQuestionarioCriancasComMaisDoisAnosThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.consumoalimentar.PerguntaQuestionarioCriancasDeSeisVinteTresMesesThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.consumoalimentar.PerguntaQuestionarioCriancasMenoresSeisMesesThrift;
import java.util.Iterator;
import java.util.List;

public class FichaConsumoAlimentar {
    private FichaConsumoAlimentarThrift instance;

    
    public void unsetHeaderTransport() {
        instance.unsetHeaderTransport();
    }

    public String getNumeroCartaoSus() {
        return instance.getNumeroCartaoSus();
    }

    public void unsetNumeroCartaoSus() {
        instance.unsetNumeroCartaoSus();
    }

    public boolean isSetNumeroCartaoSus() {
        return instance.isSetNumeroCartaoSus();
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

    public Iterator<PerguntaQuestionarioCriancasMenoresSeisMesesThrift> getPerguntasQuestionarioCriancasMenoresSeisMesesIterator() {
        return instance.getPerguntasQuestionarioCriancasMenoresSeisMesesIterator();
    }

    public void addToPerguntasQuestionarioCriancasMenoresSeisMeses(PerguntaQuestionarioCriancasMenoresSeisMesesThrift elem) {
        instance.addToPerguntasQuestionarioCriancasMenoresSeisMeses(elem);
    }

    public List<PerguntaQuestionarioCriancasMenoresSeisMesesThrift> getPerguntasQuestionarioCriancasMenoresSeisMeses() {
        return instance.getPerguntasQuestionarioCriancasMenoresSeisMeses();
    }

    public void setPerguntasQuestionarioCriancasMenoresSeisMeses(List<PerguntaQuestionarioCriancasMenoresSeisMesesThrift> perguntasQuestionarioCriancasMenoresSeisMeses) {
        instance.setPerguntasQuestionarioCriancasMenoresSeisMeses(perguntasQuestionarioCriancasMenoresSeisMeses);
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

    public Iterator<PerguntaQuestionarioCriancasDeSeisVinteTresMesesThrift> getPerguntasQuestionarioCriancasDeSeisVinteTresMesesIterator() {
        return instance.getPerguntasQuestionarioCriancasDeSeisVinteTresMesesIterator();
    }

    public void addToPerguntasQuestionarioCriancasDeSeisVinteTresMeses(PerguntaQuestionarioCriancasDeSeisVinteTresMesesThrift elem) {
        instance.addToPerguntasQuestionarioCriancasDeSeisVinteTresMeses(elem);
    }

    public List<PerguntaQuestionarioCriancasDeSeisVinteTresMesesThrift> getPerguntasQuestionarioCriancasDeSeisVinteTresMeses() {
        return instance.getPerguntasQuestionarioCriancasDeSeisVinteTresMeses();
    }

    public void setPerguntasQuestionarioCriancasDeSeisVinteTresMeses(List<PerguntaQuestionarioCriancasDeSeisVinteTresMesesThrift> perguntasQuestionarioCriancasDeSeisVinteTresMeses) {
        instance.setPerguntasQuestionarioCriancasDeSeisVinteTresMeses(perguntasQuestionarioCriancasDeSeisVinteTresMeses);
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

    public Iterator<PerguntaQuestionarioCriancasComMaisDoisAnosThrift> getPerguntasQuestionarioCriancasComMaisDoisAnosIterator() {
        return instance.getPerguntasQuestionarioCriancasComMaisDoisAnosIterator();
    }

    public void addToPerguntasQuestionarioCriancasComMaisDoisAnos(PerguntaQuestionarioCriancasComMaisDoisAnosThrift elem) {
        instance.addToPerguntasQuestionarioCriancasComMaisDoisAnos(elem);
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

    public boolean equals(FichaConsumoAlimentarThrift that) {
        return instance.equals(that);
    }

    public int compareTo(FichaConsumoAlimentarThrift other) {
        return instance.compareTo(other);
    }
    
    
}

