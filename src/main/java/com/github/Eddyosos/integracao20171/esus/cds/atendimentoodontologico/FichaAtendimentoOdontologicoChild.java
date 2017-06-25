package com.github.Eddyosos.integracao20171.esus.cds.atendimentoodontologico;

import br.gov.saude.esus.cds.transport.generated.thrift.atendimentoodontologico.FichaAtendimentoOdontologicoChildThrift;
import br.gov.saude.esus.cds.transport.generated.thrift.atendimentoodontologico.ProcedimentoQuantidadeThrift;
import com.github.Eddyosos.integracao20171.utils.IDS.CNS;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.apache.thrift.TException;

public class FichaAtendimentoOdontologicoChild {
    FichaAtendimentoOdontologicoChildThrift instancia = new FichaAtendimentoOdontologicoChildThrift();
    
    protected FichaAtendimentoOdontologicoChild(FichaAtendimentoOdontologicoChildThrift fichaAtendimentoOdontologicoChildThrift){
        this.instancia = fichaAtendimentoOdontologicoChildThrift;
    }

    /**
     * Realiza uma copia da ficha.
     * @return copia da ficha.
     */
    public FichaAtendimentoOdontologicoChild deepCopy() {
        return new FichaAtendimentoOdontologicoChild(instancia.deepCopy());
    }

    /**
     * Remove todos os dados da ficha.
     */
    public void clear() {
        instancia.clear();
    }

    /**
     * Data de nascimento do cidadão.
     * 
     * @return Data de nascimento do cidadão no formato epoch time.
     */
    public long getDtNascimento() {
        return instancia.getDtNascimento();
    }

    /**
     * Define a data de nascimento do cidadão.
     * 
     * Presença obrigatória.
     * Regras: Não pode ser posterior a dataAtendimento e anterior a 130 anos a partir da dataAtendimento.
     * 
     * @param dtNascimento Data de nascimento do cidadão
     */
    public void setDtNascimento(long dtNascimento) {
        instancia.setDtNascimento(dtNascimento);
    }

    /**
     * Remove a data de nascimento do cidadão,
     */
    public void unsetDtNascimento() {
        instancia.unsetDtNascimento();
    }

    /**
     * Verifica se a data de nascimento do cidadão foi declarada.
     * @return True caso a data de nascimento do cidadão tenha sido inserida.
     */
    public boolean isSetDtNascimento() {
        return instancia.isSetDtNascimento();
    }

    /**
     * Define se a data de nascimento do cidadão foi inserida.
     * @param value True caso a data de nascimento do cidadão tenha sido inserida
     */
    public void setDtNascimentoIsSet(boolean value) {
        instancia.setDtNascimentoIsSet(value);
    }

    /**
     * CNS do cidadão.
     * @return CNS do cidadão.
     */
    public String getNumCartaoSus() {
        return instancia.getNumCartaoSus();
    }

    /**
     * CNS do cidadão.
     * 
     * Regras: CNS válido de acordo com o algoritmo.
     * Tamanho: 15 digitos.
     * 
     * @param numCartaoSus CNS do cidadão.
     */
    public void setNumCartaoSus(String numCartaoSus) {
        instancia.setNumCartaoSus(numCartaoSus);
    }

    /**
     * Remove o CNS do cidadão.
     */
    public void unsetNumCartaoSus() {
        instancia.unsetNumCartaoSus();
    }

    /**
     * Verifica se o CNS do cidadão foi declarado.
     * @return True caso o CNS do cidadão tenhe sido inserido.
     */
    public boolean isSetNumCartaoSus() {
        return instancia.isSetNumCartaoSus();
    }

    /**
     * Declara se o CNS do cidadão foi inserido.
     * @param value True caso o CNS do cidadão tenha sido inserido.
     */

    public void setNumCartaoSusIsSet(boolean value) {
        instancia.setNumCartaoSusIsSet(value);
    }

    /**
     * Número do prontuário do cidadão.
     * 
     * @return Número do prontuário do cidadão.
     */
    public String getNumProntuario() {
        return instancia.getNumProntuario();
    }

    /**
     * Define o número do prontuário do cidadão
     * 
     * Regra: Apenas letras e números são aceitos.
     * 
     * Mínimo: 0
     * Máximo: 30
     * 
     * @param numProntuario Número do prontuário do cidadão.
     */
    public void setNumProntuario(String numProntuario) {
        instancia.setNumProntuario(numProntuario);
    }

    /**
     * Remove o número do prontuário do cidadão.
     */
    public void unsetNumProntuario() {
        instancia.unsetNumProntuario();
    }

    /**
     * Verifica se o número do prontuário do cidadão foi declarado.
     * @return True caso o número do prontuário do cidadão tenha sido declarado, False caso contrario.
     */
    public boolean isSetNumProntuario() {
        return instancia.isSetNumProntuario();
    }

    /**
     * Declara que o número do prontuário do cidadão foi inserido.
     * 
     * @param value True para informar que o número do prontuário do cidadão foi inserido.
     */
    public void setNumProntuarioIsSet(boolean value) {
        instancia.setNumProntuarioIsSet(value);
    }

    /**
     * Indica se o cidadão está gestante.
     * @return True caso o cidadão está gestante.
     */
    public boolean isGestante() {
        return instancia.isGestante();
    }

    /**
     * Define o marcador que indica se o cidadão está gestante.
     * 
     * Regra: Sexo = 1 (feminino)
     * 
     * @param gestante True para informar que o cidadão está gestante.
     */
    public void setGestante(boolean gestante) {
        instancia.setGestante(gestante);
    }

    /**
     * Remove o marcador que indica se o cidadão está gestante.
     */
    public void unsetGestante() {
        instancia.unsetGestante();
    }

    /**
     * Verifica se o estado de gestante foi declarado.
     * 
     * @return True caso tenha sido declarado, False caso contrario.
     */
    public boolean isSetGestante() {
        return instancia.isSetGestante();
    }

    /**
     * Declara que o marcador que indica se o cidadão está gestante foi inserido.
     * 
     * @param value True caso o marcador que indica se o cidadão está gestante tiver sido inserido.
     */
    public void setGestanteIsSet(boolean value) {
        instancia.setGestanteIsSet(value);
    }

    /**
     * Indica se o cidadão é portador de necessidades especiais.
     * 
     * @return True se o cidadão é portador de necessidades especiais, False caso contraio.
     */
    public boolean isNecessidadesEspeciais() {
        return instancia.isNecessidadesEspeciais();
    }

    /**
     * Define se o cidadão é portador de necessidades especiais.
     * 
     * @param necessidadesEspeciais True para indicar que  o cidadão é portador de necessidades especiais, False caso contrario.
     */
    public void setNecessidadesEspeciais(boolean necessidadesEspeciais) {
        instancia.setNecessidadesEspeciais(necessidadesEspeciais);
    }

    /**
     * Remove o marcador que indica se o cidadão é portador de necessidades especiais.
     */
    public void unsetNecessidadesEspeciais() {
        instancia.unsetNecessidadesEspeciais();
    }

    /**
     * Verifica se o marcador que indica se o cidadão é portador de necessidades especiais foi declarado.
     * 
     * @return True caso o marcador indica se o cidadão é portador de necessidades especiais tenha sido declarado, False caso contrario.
     */
    public boolean isSetNecessidadesEspeciais() {
        return instancia.isSetNecessidadesEspeciais();
    }

    /**
     * Declara que o marcador que indica se o cidadão é portador de necessidades especiais foi inserido.
     * 
     * @param value True para declarar que foi inserido, false caso contrario.
     */
    public void setNecessidadesEspeciaisIsSet(boolean value) {
        instancia.setNecessidadesEspeciaisIsSet(value);
    }

    /**
     * Local onde o atendimento foi realizado
     * 
     * @return Código do local onde o atendimento foi realizado
     */
    public long getLocalAtendimento() {
        return instancia.getLocalAtendimento();
    }

    /**
     * Define o local onde o atendimento foi realizado.
     * 
     * Regras: Apenas valores de 1 a 10.
     * 
     * @param localAtendimento Código do local onde o atendimento foi realizado.
     */
    public void setLocalAtendimento(long localAtendimento) {
        instancia.setLocalAtendimento(localAtendimento);
    }

    /**
     * Remove o local onde o atendimento foi realizado
     */
    public void unsetLocalAtendimento() {
        instancia.unsetLocalAtendimento();
    }

    /**
     * Verifica se o local onde o atendimento foi realizado foi declarado.
     * 
     * @return True caso o local onde o atendimento foi realizado tenha sido declarado, False caso contrario.
     */
    public boolean isSetLocalAtendimento() {
        return instancia.isSetLocalAtendimento();
    }

    /**
     * Declara que o local onde o atendimento foi realizado foi inserido.
     * 
     * @param value True para informar que o local onde o atendimento foi realizado foi inserido, False caso contrario.
     */
    public void setLocalAtendimentoIsSet(boolean value) {
        instancia.setLocalAtendimentoIsSet(value);
    }

    /**
     * Tipo de atendimento realizado
     * 
     * @return Código do tipo de atendimento realizado.
     */
    public long getTipoAtendimento() {
        return instancia.getTipoAtendimento();
    }

    /**
     * Define o tipo de atendimento realizado.
     * 
     * Regras: Apenas valores de 2 a 6.
     * 
     * @param tipoAtendimento Código do tipo de atendimento realizado.
     */
    public void setTipoAtendimento(long tipoAtendimento) {
        instancia.setTipoAtendimento(tipoAtendimento);
    }

    /**
     * Remove o tipo de atendimento realizado.
     */
    public void unsetTipoAtendimento() {
        instancia.unsetTipoAtendimento();
    }

    /**
     * Verifica se o tipo de atendimento realizado foi declarado.
     * 
     * @return True caso o tipo de atendimento realizado tiver sido declarado, False caso contrario.
     */
    public boolean isSetTipoAtendimento() {
        return instancia.isSetTipoAtendimento();
    }

    /**
     * Declara que o tipo de atendimento realizado foi inserido.
     * 
     * @param value True caso o tipo de atendimento realizado tiver sido inserido, False caso contrario.
     */
    public void setTipoAtendimentoIsSet(boolean value) {
        instancia.setTipoAtendimentoIsSet(value);
    }

    /**
     * Quantidade de condutas adotadas e possíveis encaminhamentos.
     * 
     * @return Código das condutas adotadas e possíveis encaminhamentos.
     */
    public int getTiposEncamOdontoSize() {
        return instancia.getTiposEncamOdontoSize();
    }

    /**
     * Condutas adotadas e possíveis encaminhamentos.
     * 
     * @return Código das condutas adotadas e possíveis encaminhamentos.
     */
    public Iterator<Long> getTiposEncamOdontoIterator() {
        return instancia.getTiposEncamOdontoIterator();
    }

    /**
     * Adiciona uma conduta adotada ou possíveis encaminhamentos.
     * 
     * 
     * 
     * @param elem Código das conduta adotada ou encaminhamento.
     */
    public void addToTiposEncamOdonto(long elem) {
        instancia.addToTiposEncamOdonto(elem);
    }

    /**
     * Condutas adotadas e possíveis encaminhamentos.
     * 
     * @return Lista com código das condutas adotadas e possíveis encaminhamentos.
     */
    public List<Long> getTiposEncamOdonto() {
        return instancia.getTiposEncamOdonto();
    }

    /**
     * Define as condutas adotadas e possíveis encaminhamentos.
     * @param tiposEncamOdonto Lista com  códigos das condutas adotadas e possíveis encaminhamentos.
     */
    public void setTiposEncamOdonto(List<Long> tiposEncamOdonto) {
        instancia.setTiposEncamOdonto(tiposEncamOdonto);
    }

    /**
     * Remove as condutas adotadas e possíveis encaminhamentos.
     */
    public void unsetTiposEncamOdonto() {
        instancia.unsetTiposEncamOdonto();
    }

    /**
     * Verifica se as condutas adotadas e possíveis encaminhamentos foram declarados.
     * @return True caso as condutas adotadas e possíveis encaminhamentos tiverem sido declarados, false caso contrario.
     */
    public boolean isSetTiposEncamOdonto() {
        return instancia.isSetTiposEncamOdonto();
    }

    /**
     * Declara que as as condutas adotadas e possíveis encaminhamentos foram inseridos.
     * 
     * @param value True para declarar que foram inseridos, false caso contrario.
     */
    public void setTiposEncamOdontoIsSet(boolean value) {
        instancia.setTiposEncamOdontoIsSet(value);
    }

    /**
     * Quantidade de materiais fornecidos durante o atendimento.
     * 
     * @return quantidade de materiais fornecidos durante o atendimento.
     */
    public int getTiposFornecimOdontoSize() {
        return instancia.getTiposFornecimOdontoSize();
    }

    /**
     * Materiais fornecidos durante o atendimento.
     * 
     * @return Códigos dos materiais fornecidos durante o atendimento.
     */
    public Iterator<Long> getTiposFornecimOdontoIterator() {
        return instancia.getTiposFornecimOdontoIterator();
    }

    /**
     * Adiciona um material a lista de materiais fornecido durante o atendimento.
     * 
     * Máximo : 3
     * 
     * @param elem Código dos materiais fornecidos durante o atendimento.
     */
    public void addToTiposFornecimOdonto(long elem) {
        instancia.addToTiposFornecimOdonto(elem);
    }

    /**
     * Materiais fornecidos durante o atendimento.
     * 
     * @return Códigos dos materiais fornecidos durante o atendimento.
     */
    public List<Long> getTiposFornecimOdonto() {
        return instancia.getTiposFornecimOdonto();
    }

    /**
     * Define uma lista de materiais fornecidos durante o atendimento.
     * 
     * Máximo: 3
     * 
     * @param tiposFornecimOdonto Lista com os códigos dos materiais fornecidos durante o atendimento.
     */
    public void setTiposFornecimOdonto(List<Long> tiposFornecimOdonto) {
        instancia.setTiposFornecimOdonto(tiposFornecimOdonto);
    }

    /**
     * Remove os materiais fornecidos durante o atendimento.
     */
    public void unsetTiposFornecimOdonto() {
        instancia.unsetTiposFornecimOdonto();
    }

    /**
     * Verifica se foram declarados materiais fornecidos durante o atendimento.
     * 
     * @return True caso tenah sido declarado algum material, False caso contrario.
     */
    public boolean isSetTiposFornecimOdonto() {
        return instancia.isSetTiposFornecimOdonto();
    }

    /**
     * Declara que foram fornecidos materiais durante o atendimento.
     * 
     * @param value True para declarar que foram fornecidos materiais, False caso contrario.
     */
    public void setTiposFornecimOdontoIsSet(boolean value) {
        instancia.setTiposFornecimOdontoIsSet(value);
    }

    /**
     * Quantidade de marcadores referentes a situação de vigilância em saúde bucal.
     * 
     * @return Quantidade de marcadores referentes a situação de vigilância em saúde bucal.
     */
    public int getTiposVigilanciaSaudeBucalSize() {
        return instancia.getTiposVigilanciaSaudeBucalSize();
    }

    /**
     * Marcadores referentes a situação de vigilância em saúde bucal.
     * 
     * @return Código dos marcadores referentes a situação de vigilância em saúde bucal.
     */
    public Iterator<Long> getTiposVigilanciaSaudeBucalIterator() {
        return instancia.getTiposVigilanciaSaudeBucalIterator();
    }

    /**
     * Adiciona um marcador referente a situação de vigilância em saúde bucal.
     * 
     * Presença Obrigatória.
     * Mínimo: 1
     * Máximo: 7
     * 
     * @param elem Código dos marcadores referentes a situação de vigilância em saúde bucal.
     */
    public void addToTiposVigilanciaSaudeBucal(long elem) {
        instancia.addToTiposVigilanciaSaudeBucal(elem);
    }

    /**
     * Marcadores referentes a situação de vigilância em saúde bucal.
     * 
     * @return Código dos marcadores referentes a situação de vigilância em saúde bucal.
     */
    public List<Long> getTiposVigilanciaSaudeBucal() {
        return instancia.getTiposVigilanciaSaudeBucal();
    }

    /**
     * Adiciona uma lista de marcadores referentes a situação de vigilância em saúde bucal.
     * 
     * Presença Obrigatória.
     * Mínimo: 1
     * Máximo: 7
     * 
     * @param tiposVigilanciaSaudeBucal Códigos dos marcadores referentes a situação de vigilância em saúde bucal.
     */
    public void setTiposVigilanciaSaudeBucal(List<Long> tiposVigilanciaSaudeBucal) {
        instancia.setTiposVigilanciaSaudeBucal(tiposVigilanciaSaudeBucal);
    }

    /**
     * Remove os marcadores referentes a situação de vigilância em saúde bucal.
     */
    public void unsetTiposVigilanciaSaudeBucal() {
        instancia.unsetTiposVigilanciaSaudeBucal();
    }

    /**
     * Verifica se os marcadores referentes a situação de vigilância em saúde bucal foram declarados.
     * 
     * @return True caso os marcadores tiverem sido declarados, False caso contrario.
     */
    public boolean isSetTiposVigilanciaSaudeBucal() {
        return instancia.isSetTiposVigilanciaSaudeBucal();
    }

    /**
     * Declara que os marcadores referentes a situação de vigilância em saúde bucal foram inseridos.
     * 
     * @param value True para declarar os marcadores, False caso contrario.
     */
    public void setTiposVigilanciaSaudeBucalIsSet(boolean value) {
        instancia.setTiposVigilanciaSaudeBucalIsSet(value);
    }

    /**
     * Quantidade de tipos de consulta odontológica realizadas.
     * 
     * @return Quantidade de tipos de consulta odontológica realizadas.
     */
    public int getTiposConsultaOdontoSize() {
        return instancia.getTiposConsultaOdontoSize();
    }

    /**
     * Tipos de consulta odontológica realizadas.
     * 
     * @return Códigos dos tipos de consulta odontológica realizadas.
     */
    public Iterator<Long> getTiposConsultaOdontoIterator() {
        return instancia.getTiposConsultaOdontoIterator();
    }

    /**
     * Adiciona um tipo de consulta odontológica realizada.
     * 
     * Regra: É Requerido se o TipoDeAtendimento = 2 (consulta agendada).
     * Regra: Não pode ser preenchido se o TipoDeAtendimento = 4 (escuta inicial ou orientação).
     * Regra: Se o TipoDeAtendimento = 6 (atendimento de urgência), a opção de 2 (consulta de retorno) não pode ser marcada.
     * Regra: Se TipoDeAtendimento = 5 (consulta no dia), o campo é opcional.
     * Regra: Aceita apenas um registro.
     * 
     * @param elem Código do tipo de consulta odontológica realizada.
     */
    public void addToTiposConsultaOdonto(long elem) {
        instancia.addToTiposConsultaOdonto(elem);
    }

    /**
     * Tipos de consulta odontológica realizadas.
     * 
     * @return Códigos dos tipos de consulta odontológica realizadas.
     */
    public List<Long> getTiposConsultaOdonto() {
        return instancia.getTiposConsultaOdonto();
    }

    /**
     * Define um tipo de consulta odontológica realizada.
     * 
     * Regra: É Requerido se o TipoDeAtendimento = 2 (consulta agendada).
     * Regra: Não pode ser preenchido se o TipoDeAtendimento = 4 (escuta inicial ou orientação).
     * Regra: Se o TipoDeAtendimento = 6 (atendimento de urgência), a opção de 2 (consulta de retorno) não pode ser marcada.
     * Regra: Se TipoDeAtendimento = 5 (consulta no dia), o campo é opcional.
     * Regra: Aceita apenas um registro.
     * 
     * @param tiposConsultaOdonto Código do tipo de consulta odontológica realizada.
     */
    public void setTiposConsultaOdonto(List<Long> tiposConsultaOdonto) {
        instancia.setTiposConsultaOdonto(tiposConsultaOdonto);
    }

    /**
     * Remove o tipo de consulta odontológica realizada.
     */
    public void unsetTiposConsultaOdonto() {
        instancia.unsetTiposConsultaOdonto();
    }

    /**
     * Verifica se o tipo de consulta odontológica realizada foi declarado.
     * 
     * @return True caso o tipo de consulta odontológica realizada tenha sido declarado, False caso contrario.
     */
    public boolean isSetTiposConsultaOdonto() {
        return instancia.isSetTiposConsultaOdonto();
    }

    /**
     * Declara que o tipo de consulta odontológica realizada foi inserido.
     * 
     * @param value True para declarar que foi inserido, False caso contrario.
     */
    public void setTiposConsultaOdontoIsSet(boolean value) {
        instancia.setTiposConsultaOdontoIsSet(value);
    }

    /**
     * Quantidade de procedimentos que são apresentados na ficha.
     * 
     * @return Quantidade de procedimentos que são apresentados na ficha.
     */
    public int getProcedimentosRealizadosSize() {
        return instancia.getProcedimentosRealizadosSize();
    }

    /**
     * Procedimentos que são apresentados na ficha.
     * 
     * @return Código dos procedimentos que são apresentados na ficha.
     */
    public Iterator<ProcedimentoQuantidade> getProcedimentosRealizadosIterator() {
        List<ProcedimentoQuantidade> listaProcedimentoQuantidade = new LinkedList<>();
        
        instancia.getProcedimentosRealizadosIterator().forEachRemaining((elemento) -> {
            listaProcedimentoQuantidade.add(new ProcedimentoQuantidade(elemento));
        });
        
        return listaProcedimentoQuantidade.iterator();
    }

    /**
     * Adiciona um procedimento a lista de procedimentos realizados.
     * 
     * Mínimo: 0
     * Máximo: 27
     * 
     * @param elem Código dos procedimentos que são apresentados na ficha.
     */
    public void addToProcedimentosRealizados(ProcedimentoQuantidade elem) {
        instancia.addToProcedimentosRealizados(elem.getInstance());
    }

    /**
     * Procedimentos que são apresentados na ficha.
     * 
     * @return Código dos procedimentos que são apresentados na ficha.
     */
    public List<ProcedimentoQuantidade> getProcedimentosRealizados() {
        List<ProcedimentoQuantidade> listaProcedimentoQuantidade = new LinkedList<>();
        
        instancia.getProcedimentosRealizados().forEach((elemento) -> {
            listaProcedimentoQuantidade.add(new ProcedimentoQuantidade(elemento));
        });
        
        return listaProcedimentoQuantidade;
    }

    /**
     * Define os procedimentos realizados.
     * 
     * 
     * Regra: Não pode haver procedimentos com o mesmo código.
     * Mínimo: 0
     * Máximo: 27
     * 
     * @param procedimentosRealizados Código dos procedimentos que são apresentados na ficha.
     */
    public void setProcedimentosRealizados(List<ProcedimentoQuantidade> procedimentosRealizados) {
        List<ProcedimentoQuantidadeThrift> listaProcedimentoQuantidadeThrift = new LinkedList<>();
        
        procedimentosRealizados.forEach((elemento) -> {
            listaProcedimentoQuantidadeThrift.add(elemento.getInstance());
        });
        
        instancia.setProcedimentosRealizados(listaProcedimentoQuantidadeThrift);
    }

    /**
     * Remove os procedimentos que são apresentados na ficha.
     */
    public void unsetProcedimentosRealizados() {
        instancia.unsetProcedimentosRealizados();
    }

    /**
     * Verifica se os procedimentos que são apresentados na ficha foram declarados.
     * 
     * @return True caso tenham sido declarados, False caso contraio.
     */
    public boolean isSetProcedimentosRealizados() {
        return instancia.isSetProcedimentosRealizados();
    }

    /**
     * Declara que os procedimentos que são apresentados na ficha foram inseridos.
     * 
     * @param value True para declarar que foram inseridos, False caso contrario.
     */
    public void setProcedimentosRealizadosIsSet(boolean value) {
        instancia.setProcedimentosRealizadosIsSet(value);
    }

    /**
     * Quantidade de outros códigos de procedimentos.
     * 
     * @return Quantidade de outros códigos de procedimentos.
     */
    public int getOutrosSiaProcedimentosSize() {
        return instancia.getOutrosSiaProcedimentosSize();
    }

    /**
     * Iterator de outros códigos de procedimentos.
     * 
     * @return Iterator de outros códigos de procedimentos.
     */
    public Iterator<ProcedimentoQuantidade> getOutrosSiaProcedimentosIterator() {
        List<ProcedimentoQuantidade> listaProcedimentoQuantidade = new LinkedList<>();
        
        instancia.getOutrosSiaProcedimentosIterator().forEachRemaining((elemento) -> {
            listaProcedimentoQuantidade.add(new ProcedimentoQuantidade(elemento));
        });
        
        return listaProcedimentoQuantidade.iterator();
    }

    /**
     * Adiciona um procedimento a lista de outros procedimentos.
     * 
     * Regra: Não pode conter procedimentos da ListaProcedimentosRealizados.
     * Regra: Não pode haver procedimentos com o mesmo código.
     * 
     * Mínimo: 0
     * Máximo: 24
     * 
     * @param elem código do procedimento
     */
    public void addToOutrosSiaProcedimentos(ProcedimentoQuantidade elem) {
        instancia.addToOutrosSiaProcedimentos(elem.getInstance());
    }

    /**
     * Lista de outros códigos de procedimentos.
     * 
     * @return Lista de outros códigos de procedimentos.
     */
    public List<ProcedimentoQuantidade> getOutrosSiaProcedimentos() {
         List<ProcedimentoQuantidade> listaProcedimentoQuantidade = new LinkedList<>();
        
        instancia.getOutrosSiaProcedimentos().forEach((elemento) -> {
            listaProcedimentoQuantidade.add(new ProcedimentoQuantidade(elemento));
        });
        
        return listaProcedimentoQuantidade;
    }

    /**
     * Define a lista de outros procedimentos.
     * 
     * Regra: Não pode conter procedimentos da ListaProcedimentosRealizados.
     * Regra: Não pode haver procedimentos com o mesmo código.
     * 
     * Mínimo: 0
     * Máximo: 24
     * 
     * @param outrosSiaProcedimentos Lista de códigos dos procedimentos
     */
    public void setOutrosSiaProcedimentos(List<ProcedimentoQuantidade> outrosSiaProcedimentos) {
        List<ProcedimentoQuantidadeThrift> listaProcedimentoQuantidadeThrift = new LinkedList<>();
        
        outrosSiaProcedimentos.forEach((elemento) -> {
            listaProcedimentoQuantidadeThrift.add(elemento.getInstance());
        });
                
        instancia.setOutrosSiaProcedimentos(listaProcedimentoQuantidadeThrift);
    }

    /**
     * Remove a lista de outros procedimentos.
     */
    public void unsetOutrosSiaProcedimentos() {
        instancia.unsetOutrosSiaProcedimentos();
    }

    /**
     * Verifica se a lista de outros procedimentos foi declarada.
     * 
     * @return True caso tenha sido declarada, False case contrario.
     */
    public boolean isSetOutrosSiaProcedimentos() {
        return instancia.isSetOutrosSiaProcedimentos();
    }

    /**
     * Declara que a lista de outros procedimentos foi inserida.
     * 
     * @param value True para declarar que foi inserido, False caso contrario.
     */
    public void setOutrosSiaProcedimentosIsSet(boolean value) {
        instancia.setOutrosSiaProcedimentosIsSet(value);
    }

    /**
     * Retorna o sexo do cidadão.
     * @return Código do sexo do cidadão.
     */
    public long getSexo() {
        return instancia.getSexo();
    }

    /**
     * Define o sexo do cidadão.
     * 
     * Presença obrigatória.
     * 
     * @param sexo Código do sexo do cidadão.
     */
    public void setSexo(long sexo) {
        instancia.setSexo(sexo);
    }

    /**
     * Remove o sexo do cidadão.
     */
    public void unsetSexo() {
        instancia.unsetSexo();
    }

    /**
     * Verifica se o sexo foi definido.
     * @return True caso o sexo tenha sido definido.
     */
    public boolean isSetSexo() {
        return instancia.isSetSexo();
    }

    /**
     * Retorna se o sexo do cidadão foi definido.
     * @param value True caso o sexo tenha sido definido.
     */
    public void setSexoIsSet(boolean value) {
        instancia.setSexoIsSet(value);
    }

    /**
     * Código do turno onde aconteceu o atendimento.
     * @return O código do turno onde aconteceu o atendimento.
     */
    public long getTurno() {
        return instancia.getTurno();
    }

    /**
     * Define o turno onde aconteceu o atendimento.
     * Presença obrigatória.
     * @param turno Código do turno onde aconteceu o atendimento.
     */
    public void setTurno(long turno) {
        instancia.setTurno(turno);
    }

    /**
     * Remove o código do turno.
     */
    public void unsetTurno() {
        instancia.unsetTurno();
    }

    /**
     * Verifica se foi notificada a inserção do código do turno do atendimento
     * @return True caso tenha sido notificada a inserção do turno.
     */
    public boolean isSetTurno() {
        return instancia.isSetTurno();
    }
    /**
     * Notifica a inserção do turno do atendimento.
     * @param value True caso deseje informar a inserção do turno.
     */
    public void setTurnoIsSet(boolean value) {
        instancia.setTurnoIsSet(value);
    }

    /**
     * Compara com outro objeto
     * @param that objeto a se comparar
     * @return True se fomre iguais, False caso contrario.
     */
    @Override
    public boolean equals(Object that) {
        return instancia.equals(that);
    }

    /**
     * Compara com outra FichaAtendimentoOdontologicoChild
     * @param that Ficha a se comparar
     * @return True se forem iguais, False caso contrario.
     */
    public boolean equals(FichaAtendimentoOdontologicoChild that) {
        return instancia.equals(that.getInstance());
    }

    /**
     * HashCode da classe
     * @return HashCode
     */
    public int hashCode() {
        return instancia.hashCode();
    }

    public int compareTo(FichaAtendimentoOdontologicoChild other) {
        return instancia.compareTo(other.getInstance());
    }

    @Override
    public String toString() {
        return instancia.toString();
    }


    /**
     * Instancia thrift da classe
     * 
     * @return thrift da classe
     */
    protected FichaAtendimentoOdontologicoChildThrift getInstance(){
        return instancia;
    }
    
    /**
     * Valida a classe contra erros.
     * 
     * @return True se a classe for valida, False caso contrario.
     */
    public boolean validates() {
        try {
            instancia.validate();
        } catch (TException ex) {
            return false;
        }
        
        return validatedtNascimento() &&
                validateNumCartaoSus() &&
                validateNumeroProntuario() &&
                validadeGestante() &&
                validateLocalDeAtendimento() &&
                validateTipoAtendimento() &&
                validateTiposEncamOdonto() &&
                validateTiposFornecimOdonto() &&
                validateTiposVigilanciaSaudeBucal() &&
                validateTiposConsultaOdonto() &&
                validateProcedimentosRealizados() &&
                validateOutrosSiaProcedimentos() &&
                validateSexo() &&
                validateTurno();
    }
    
    /**
     * Valida a data de nascimento
     * 
     * Presença obrigatória.
     * 
     * @return True se estiver presente, False caso contrario.
     */
    public boolean validatedtNascimento(){
        return instancia.isSetDtNascimento();
    }
    
    /**
     * Valida o numero do cartão sus
     * @return True se não estiver presente ou se estiver presente e for válido, False caso contrario.
     */
    public boolean validateNumCartaoSus(){
        if(instancia.isSetNumCartaoSus()){
            return CNS.validateCNS(instancia.getNumCartaoSus());
        }
        return true;
    }
    
    /**
     * Valida NumeroProntuario
     * Para ser válida, caso tenha sido inserida, deve ser ter entre 0 e 30 
     * (inclusivo) caracteres alfanuméricos
     * @return True caso não esteja presente ou caso esteja presente e seja valido, False caso contrario
     */
    public boolean validateNumeroProntuario(){
        if(instancia.isSetNumProntuario()){
            String var = instancia.getNumProntuario();
            return var == null || var.matches("\\A\\w{0,30}\\z");
        }
        return true;
    }
    
    /**
     * Valida se o marcador de gestante foi inserido.
     * 
     * Regras: Sexo = 1 (feminino).
     * 
     * @return True Caso não esteja presente ou caso esteja presente e o sexo seja igual a 1, False caso contrario.
     */
    public boolean validadeGestante(){
        if(instancia.isSetGestante()){
            return instancia.getSexo() == 1;
        }
        
        return true;
    }
    
    /**
     * Valida LocalDeAtendimento.
     * Para ser válido deve:
     * 1- Préviamente inserido
     * 2- Valor entre 1 e 10 (inclusivo)
     * @return 
     */
    public boolean validateLocalDeAtendimento(){
        return instancia.isSetLocalAtendimento()&&
               instancia.getLocalAtendimento() >= 1 &&
               instancia.getLocalAtendimento() <= 10;
    }
    
    /**
     * Valida Tipo de atendimento.
     * Para ser válido deve:
     * 1- Ter sido préviamente inserido
     * 2- Ter valor entre 2 e 6 (inclusivo)
     * @return 
     */
    public boolean validateTipoAtendimento(){
        long var = instancia.getTipoAtendimento();
        return instancia.isSetTipoAtendimento() &&
                var >= 2 && var <= 6;
    }
    
    /**
     * Valida condutas adotadas e possíveis encaminhamentos.
     * Para ser válido deve:
     * 1- Ter sido préviamente inserido
     * 2- Ter valor entre 1 e 16 (inclusivo)
     * 3- Ter entre 1 e 16 elementos
     * @return True se estiver de acordo com as regras, False caso contrario.
     */
    public boolean validateTiposEncamOdonto(){

        if(instancia.isSetTiposEncamOdonto()){
            if(instancia.getTiposEncamOdontoSize() >= 1 && instancia.getTiposEncamOdontoSize() <= 16){
                for(long encaminhamento : instancia.getTiposEncamOdonto()){
                    if(encaminhamento < 1 || encaminhamento > 16){
                        return false;
                    }
                }
                
                return true;
            }
        }
        
        return false;
    }
    
        /**
     * Valida materiais fornecidos durante o atendimento.
     * Para ser válido deve:
     * 1- Ter sido préviamente inserido
     * 2- Ter valor entre 1 e 3 (inclusivo)
     * 3- Ter entre 0 e 3 elementos
     * @return True se estiver de acordo com as regras, False caso contrario.
     */
    public boolean validateTiposFornecimOdonto(){

        if(instancia.isSetTiposFornecimOdonto()){
            if(instancia.getTiposFornecimOdontoSize() <= 3){
                for(long encaminhamento : instancia.getTiposFornecimOdonto()){
                    if( encaminhamento > 3){
                        return false;
                    }
                }
                
                return true;
            }
        }
        
        return false;
    }
    
    /**
     * Valida materiais fornecidos durante o atendimento.
     * Para ser válido deve:
     * 1- Ter sido préviamente inserido
     * 2- Ter valor entre 1 e 6 (inclusivo) ou ter valor igual a 99
     * 3- Ter entre 1 e 7 elementos
     * @return True se estiver de acordo com as regras, False caso contrario.
     */
    public boolean validateTiposVigilanciaSaudeBucal(){

        if(instancia.isSetTiposVigilanciaSaudeBucal()){
            if(instancia.getTiposVigilanciaSaudeBucalSize() >= 1 && instancia.getTiposVigilanciaSaudeBucalSize() <= 7){
                for(long encaminhamento : instancia.getTiposVigilanciaSaudeBucal()){
                    if( (encaminhamento < 1 || encaminhamento > 6 ) && encaminhamento != 99){
                        return false;
                    }
                }
                
                return true;
            }
        }
        
        return false;
    }
    
    /**
     * Valida materiais fornecidos durante o atendimento.
     * Para ser válido deve:
     * 1- É Requerido se o TipoDeAtendimento = 2 (consulta agendada)
     * 2- Não pode ser preenchido se o TipoDeAtendimento = 4 (escuta inicial ou orientação)
     * 3- Se o TipoDeAtendimento = 6 (atendimento de urgência), a opção de 2 (consulta de retorno) não pode ser marcada.
     * 4- Se TipoDeAtendimento = 5 (consulta no dia), o campo é opcional.
     * 5- Aceita apenas um registro.
     * @return True se estiver de acordo com as regras, False caso contrario.
     */
    public boolean validateTiposConsultaOdonto(){

        if(instancia.isSetTiposConsultaOdonto()){
            if(instancia.getTiposConsultaOdontoSize() > 1){
                if(instancia.getTipoAtendimento() == 4){
                    return false;
                }
                if(instancia.getTipoAtendimento() == 6 && instancia.getTiposConsultaOdonto().get(0) == 2){
                    return false;
                }
                
                return instancia.getTiposConsultaOdonto().get(0) == 1 || 
                        instancia.getTiposConsultaOdonto().get(0) == 2 || 
                        instancia.getTiposConsultaOdonto().get(0) == 4;
            }else{
                return false;
            }
        }
        
        return instancia.getTipoAtendimento() == 5;
    }
    
    /**
     * Valida procedimentosRealizados.
     * Para ser válido, caso inserido, deve:
     * 1- Não pode ter procedimentos iguais
     * 2- Não pode ter mais do que 27 procedimentos
     * @return true se válido
     *          false se inválido
     */
    public boolean validateProcedimentosRealizados(){
        if(instancia.isSetProcedimentosRealizados()) {
            int size = instancia.getProcedimentosRealizadosSize();
            if(size > 27) return false;
            Set exames = new HashSet(instancia.getProcedimentosRealizados());
            if(exames.size() != size) return false;
            
            for(ProcedimentoQuantidade procedimento : this.getProcedimentosRealizados()){
                if( ! procedimento.validates()){
                    return false;
                }
            }
        }
        return true;
    }
    
     /**
     * Valida outrosSiaProcedimentos.
     * Para ser válido, caso inserido, deve:
     * 1- Não pode ter procedimentos iguais
     * 2- Não pode ter procedimentos iguais aos da lista de procedimentos realizados
     * 3- Não pode ter mais do que 24 procedimentos
     * @return true se válido
     *          false se inválido
     */
    public boolean validateOutrosSiaProcedimentos(){
        if(instancia.isSetOutrosSiaProcedimentos()) {
            int size = instancia.getOutrosSiaProcedimentosSize();
            if(size > 24) return false;
            Set exames = new HashSet(instancia.getOutrosSiaProcedimentos());
            if(exames.size() != size) return false;
            
            for(ProcedimentoQuantidade procedimento : this.getOutrosSiaProcedimentos()){
                if( ! procedimento.validates()){
                    return false;
                }
                for(ProcedimentoQuantidade procedimentoPrincipal : this.getProcedimentosRealizados()){
                    if( procedimento.equals(procedimentoPrincipal)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    /**
     * Valida Sexo
     * Para ser válido deve:
     * 1- Ter sido préviamente inserido
     * 2- Ter valor 0 ou 1
     * @return 
     */
    public boolean validateSexo(){
        long var = instancia.getSexo();
        return instancia.isSetSexo() &&
                (var == 0 || var == 1);
    }
    
    /**
     * Valida Turno
     * @return true se válido
     *          false se inválido
     */
    public boolean validateTurno(){
        long var = instancia.getTurno();
        return !instancia.isSetTurno() || 
                var == 1 ||
                var == 2 ||
                var == 3;
                
    }
    
    
}

