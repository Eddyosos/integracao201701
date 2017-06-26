package com.github.Eddyosos.integracao20171.esus.transport;

import br.gov.saude.esus.transport.common.generated.thrift.DadoInstalacaoThrift;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.thrift.TException;

public class DadoInstalacao {
    private DadoInstalacaoThrift instance;

    DadoInstalacaoThrift getInstance() {
        return instance;
    }

    public DadoInstalacao() {
        instance = new DadoInstalacaoThrift();
    }

    DadoInstalacao(DadoInstalacaoThrift instance) {
        this.instance = instance;
    }

    /**
     * Remove todos os dados da instância.
     */
    public void clear() {
        instance.clear();
    }

    /**
     * Identifica o software que gerou o dado (pec/cds, cdsOff ou software de terceiros).
     * @return Identificador do software que gerou o dado (pec/cds, cdsOff ou software de terceiros).
     */
    public String getContraChave() {
        return instance.getContraChave();
    }

    /**
     * Define o software que gerou o dado (pec/cds, cdsOff ou software de terceiros).
     * 
     * @param contraChave Identificador do software que gerou o dado (pec/cds, cdsOff ou software de terceiros).
     */
    public void setContraChave(String contraChave) {
        instance.setContraChave(contraChave);
    }

    /**
     * Remove o software que gerou o dado.
     */
    public void unsetContraChave() {
        instance.unsetContraChave();
    }

    /**
     * Verifica se o software que gerou o dado foi declarado.
     * 
     * @return True caso tenha sido declarado, caso contrario False.
     */
    public boolean isSetContraChave() {
        return instance.isSetContraChave();
    }

    /**
     * Declara que o software que gerou o dado foi inserido.
     * 
     * @param value True para declarar que foi inserido, caso contrario False.
     */
    public void setContraChaveIsSet(boolean value) {
        instance.setContraChaveIsSet(value);
    }

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * @return Código UUID
     */
    public String getUuidInstalacao() {
        return instance.getUuidInstalacao();
    }

    /**
     * Código UUID para identificar a ficha na base de dados nacional.
     * 
     * Presença obrigatória
     * 
     * Observações: Campo serve para a identificar a instalação que gerou / cadastrou / enviou os dados.
     * 
     * @param uuidInstalacao Código UUID
     */
    public void setUuidInstalacao(String uuidInstalacao) {
        instance.setUuidInstalacao(uuidInstalacao);
    }

    /**
     * Remove o Uuid da ficha
     */
    public void unsetUuidInstalacao() {
        instance.unsetUuidInstalacao();
    }

    /**
     * Verifica se a ficha possui um uuid
     * @return True caso possua um uuid
     */
    public boolean isSetUuidInstalacao() {
        return instance.isSetUuidInstalacao();
    }

    /**
     * Define se o uuid da ficha foi definido.
     * @param value True caso o uuid tenha sido definido.
     */
    public void setUuidInstalacaoIsSet(boolean value) {
        instance.setUuidInstalacaoIsSet(value);
    }

    /**
     * CPF do responsável ou CNPJ da empresa responsável.
     * @return CPF do responsável ou CNPJ da empresa responsável.
     */
    public String getCpfOuCnpj() {
        return instance.getCpfOuCnpj();
    }

    /**
     * Define o CPF do responsável ou CNPJ da empresa responsável.
     * 
     * Presença obrigatória.
     * 
     * Observações:
     * Apenas CPFs e CNPJs válidos. Rever validação.
     * Campo serve para a identificar a instalação que gerou / cadastrou / enviou os dados.
     * 
     * @param cpfOuCnpj CPF do responsável ou CNPJ da empresa responsável.
     */
    public void setCpfOuCnpj(String cpfOuCnpj) {
        instance.setCpfOuCnpj(cpfOuCnpj);
    }

    /**
     * Remove o CPF do responsável ou CNPJ da empresa responsável.
     */
    public void unsetCpfOuCnpj() {
        instance.unsetCpfOuCnpj();
    }

    /**
     * Verifica se o CPF do responsável ou CNPJ da empresa responsável foi declarado.
     * 
     * @return True caso tenha sido declarado, False caso contrario.
     */
    public boolean isSetCpfOuCnpj() {
        return instance.isSetCpfOuCnpj();
    }

    /**
     * Declara que o CPF do responsável ou CNPJ da empresa responsável foi inserido.
     * 
     * @param value True para declarar que foi inserido, caso contrario False.
     */
    public void setCpfOuCnpjIsSet(boolean value) {
        instance.setCpfOuCnpjIsSet(value);
    }

    /**
     * Nome do responsável ou razão social da empresa responsável.
     * @return Nome do responsável ou razão social da empresa responsável.
     */
    public String getNomeOuRazaoSocial() {
        return instance.getNomeOuRazaoSocial();
    }

    /**
     * Nome do responsável ou razão social da empresa responsável.
     * 
     * Presença obrigatória.
     * 
     * Observações: Campo serve para a identificar a instalação que gerou / cadastrou / enviou os dados.
     * 
     * @param nomeOuRazaoSocial Nome do responsável ou razão social da empresa responsável.
     */
    public void setNomeOuRazaoSocial(String nomeOuRazaoSocial) {
        instance.setNomeOuRazaoSocial(nomeOuRazaoSocial);
    }

    /**
     * Remove o nome do responsável ou razão social da empresa responsável.
     */
    public void unsetNomeOuRazaoSocial() {
        instance.unsetNomeOuRazaoSocial();
    }

    /**
     * Verifica se o ome do responsável ou razão social da empresa responsável foi declarado.
     * 
     * @return True caso tenha sido declarado, caso contrario False.
     */
    public boolean isSetNomeOuRazaoSocial() {
        return instance.isSetNomeOuRazaoSocial();
    }

    /**
     * Declara que o ome do responsável ou razão social da empresa responsável foi inserido.
     * 
     * @param value True para declarar que foi inserido, False caso o contrario.
     */
    public void setNomeOuRazaoSocialIsSet(boolean value) {
        instance.setNomeOuRazaoSocialIsSet(value);
    }

    /**
     * Telefone da pessoa ou empresa responsável.
     * 
     * @return Telefone da pessoa ou empresa responsável.
     */
    public String getFone() {
        return instance.getFone();
    }

    /**
     * Define o telefone da pessoa ou empresa responsável.
     * 
     * Presença obrigatória.
     * 
     * Tamanho mínimo 10.
     * Tamanho máximo: 11.
     * 
     * Observações: Campo serve para a identificar a instalação que gerou / cadastrou / enviou os dados.
     * 
     * @param fone Telefone da pessoa ou empresa responsável
     */
    public void setFone(String fone) {
        instance.setFone(fone);
    }

    /**
     * Remove o telefone da pessoa ou empresa responsável.
     */
    public void unsetFone() {
        instance.unsetFone();
    }

    /**
     * Verifica se o telefone da pessoa ou empresa responsável foi declarado.
     * 
     * @return True caso tenha sido declarado, False caso contrario.
     */
    public boolean isSetFone() {
        return instance.isSetFone();
    }

    /**
     * Declara que o telefone da pessoa ou empresa responsável foi inserido.
     * 
     * @param value True para declarar que foi inserido, caso contrario False.
     */
    public void setFoneIsSet(boolean value) {
        instance.setFoneIsSet(value);
    }

    /**
     * Email da pessoa ou empresa responsável.
     * 
     * @return Email da pessoa ou empresa responsável.
     */
    public String getEmail() {
        return instance.getEmail();
    }

    /**
     * Define o email da pessoa ou empresa responsável.
     * 
     * Tamanho mínimo: 6
     * Tamanho máximo: 255
     * 
     * @param email Email da pessoa ou empresa responsável.
     */
    public void setEmail(String email) {
        instance.setEmail(email);
    }

    /**
     * Remove o email da pessoa ou empresa responsável.
     */
    public void unsetEmail() {
        instance.unsetEmail();
    }

    /**
     * Verifica se o email da pessoa ou empresa responsável foi declarado.
     * 
     * @return true caso tenha sido declarado, False caso contrario.
     */
    public boolean isSetEmail() {
        return instance.isSetEmail();
    }

    /**
     * Declara que o email da pessoa ou empresa responsável foi inserido.
     * 
     * @param value True para declarar que foi inserido, caso contrario False.
     */
    public void setEmailIsSet(boolean value) {
        instance.setEmailIsSet(value);
    }

    public boolean equals(Object that) {
        return instance.equals(that);
    }

    public boolean equals(DadoInstalacao that) {
        return instance.equals(that.instance);
    }

    public int hashCode() {
        return instance.hashCode();
    }

    public int compareTo(DadoInstalacao other) {
        return instance.compareTo(other.instance);
    }

    public String toString() {
        return instance.toString();
    }

    public boolean validates()  {
        try {
            instance.validate();
        } catch (TException ex) {
            return false;
        }
        
        return validateContraChave() &&
                validateUuidInstalacao() &&
                validateCpfOuCnpj() &&
                validateNomeOuRazaoSocial() &&
                validateFone() &&
                validateEmail();
    }
    
    /**
     * Valida o identificador do software que gerou o dado (pec/cds, cdsOff ou software de terceiros).
     * 
     * Presença obrigatória.
     * 
     * @return True se estiver de acordo com as regras, Caso contrario False.
     */
    public boolean validateContraChave(){
        if( ! instance.isSetContraChave()) return false;
        if(instance.getContraChave() == null || instance.getContraChave().isEmpty()) return false;
        
        return true;
    }
    
    /**
     * Valida um identificador da instalação do software que gerou o dado. Seja ele o e-SUS ou software de terceiro. Cada e-SUS possui um UUID.
     * 
     * Presença obrigatória.
     * 
     * @return True se estiver de acordo com as regras, Caso contrario False.
     */
    public boolean validateUuidInstalacao(){
        if( ! instance.isSetUuidInstalacao()) return false;
        if(instance.getUuidInstalacao() == null || instance.getUuidInstalacao().isEmpty()) return false;
        
        return true;
    }
    
    /**
     * Valida o CPF do responsável ou CNPJ da empresa responsável.
     * 
     * Presença obrigatória.
     * 
     * Tamanho mínimo : 11
     * Tamanho máximo: 15
     * 
     * @return True se estiver de acordo com as regras, Caso contrario False.
     */
    public boolean validateCpfOuCnpj(){
        if( ! instance.isSetCpfOuCnpj()) return false;
        
        if(instance.getCpfOuCnpj() == null || 
                instance.getCpfOuCnpj().length() < 11 ||
                instance.getCpfOuCnpj().length() > 15 ) {
            
            return false;
        }
        
        return true;
    }
    
    /**
     * Valida o nome do responsável ou razão social da empresa responsável.
     * 
     * Presença obrigatória.
     * 
     * @return True se estiver de acordo com as regras, Caso contrario False.
     */
    public boolean validateNomeOuRazaoSocial(){
         if( ! instance.isSetNomeOuRazaoSocial()) return false;
        if(instance.getNomeOuRazaoSocial() == null || instance.getNomeOuRazaoSocial().isEmpty()) return false;
        
        return true;

    }
    
    /**
     * Valida o telefone da pessoa ou empresa responsável.
     * 
     * Presença obrigatória.
     * 
     * Tamanho mínimo : 10
     * Tamanho máximo: 11
     * 
     * @return True se estiver de acordo com as regras, Caso contrario False.
     */
    public boolean validateFone(){
        if(  instance.isSetFone()) {
        
            if(instance.getFone() == null || 
                    instance.getFone().length() < 10 ||
                    instance.getFone().length() > 11 ) {

                return false;
            }
        }
        
        return true;
    }
    
    /**
     * Valida o email da pessoa ou empresa responsável.
     * 
     * Presença obrigatória.
     * 
     * Tamanho mínimo : 6
     * Tamanho máximo: 255
     * 
     * @return True se estiver de acordo com as regras, Caso contrario False.
     */
    public boolean validateEmail(){
        
        if(instance.isSetEmail()){
            if(instance.getEmail().length() >=6 && 
                    instance.getEmail().length() <= 255){
                
                Pattern VALID_EMAIL_ADDRESS_REGEX = 
                Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
                
                Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(instance.getEmail());
                return matcher.find();
            }else{
                return false;
            }
        }
        
        return true; 
    }
    
    
}

