package com.github.Eddyosos.integracao20171.esus.cds.atividadeindividual;

import br.gov.saude.esus.cds.transport.generated.thrift.atividadeindividual.ProblemaCondicaoAvaliacaoAIThrift;
import java.util.Iterator;
import java.util.List;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;

public class ProblemaCondicaoAvaliacaoAI {
    private ProblemaCondicaoAvaliacaoAIThrift instance;

    public ProblemaCondicaoAvaliacaoAI() {
        instance = new ProblemaCondicaoAvaliacaoAIThrift();
    }

    ProblemaCondicaoAvaliacaoAI(ProblemaCondicaoAvaliacaoAIThrift instance) {
        this.instance = instance;
    }
    
    ProblemaCondicaoAvaliacaoAIThrift getInstance(){
        return instance;
    }

    public void clear() {
        instance.clear();
    }

    public int getCiapsSize() {
        return instance.getCiapsSize();
    }

    public Iterator<String> getCiapsIterator() {
        return instance.getCiapsIterator();
    }

    public void addToCiaps(String elem) {
        instance.addToCiaps(elem);
    }

    public List<String> getCiaps() {
        return instance.getCiaps();
    }

    public void setCiaps(List<String> ciaps) {
        instance.setCiaps(ciaps);
    }

    public void unsetCiaps() {
        instance.unsetCiaps();
    }

    public boolean isSetCiaps() {
        return instance.isSetCiaps();
    }

    public void setCiapsIsSet(boolean value) {
        instance.setCiapsIsSet(value);
    }

    public String getOutroCiap1() {
        return instance.getOutroCiap1();
    }

    public void setOutroCiap1(String outroCiap1) {
        instance.setOutroCiap1(outroCiap1);
    }

    public void unsetOutroCiap1() {
        instance.unsetOutroCiap1();
    }

    public boolean isSetOutroCiap1() {
        return instance.isSetOutroCiap1();
    }

    public void setOutroCiap1IsSet(boolean value) {
        instance.setOutroCiap1IsSet(value);
    }

    public String getOutroCiap2() {
        return instance.getOutroCiap2();
    }

    public void setOutroCiap2(String outroCiap2) {
        instance.setOutroCiap2(outroCiap2);
    }

    public void unsetOutroCiap2() {
        instance.unsetOutroCiap2();
    }

    public boolean isSetOutroCiap2() {
        return instance.isSetOutroCiap2();
    }

    public void setOutroCiap2IsSet(boolean value) {
        instance.setOutroCiap2IsSet(value);
    }

    public String getCid10() {
        return instance.getCid10();
    }

    public void setCid10(String cid10) {
        instance.setCid10(cid10);
    }

    public void unsetCid10() {
        instance.unsetCid10();
    }

    public boolean isSetCid10() {
        return instance.isSetCid10();
    }

    public void setCid10IsSet(boolean value) {
        instance.setCid10IsSet(value);
    }

    public boolean equals(Object that) {
        return instance.equals(that);
    }

    public boolean equals(ProblemaCondicaoAvaliacaoAI that) {
        return instance.equals(that.instance);
    }

    public int hashCode() {
        return instance.hashCode();
    }

    public int compareTo(ProblemaCondicaoAvaliacaoAI other) {
        return instance.compareTo(other.instance);
    }

    public void read(TProtocol iprot) throws TException {
        instance.read(iprot);
    }

    public void write(TProtocol oprot) throws TException {
        instance.write(oprot);
    }

    public String toString() {
        return instance.toString();
    }

    public void validate() throws TException {
        instance.validate();
    }
}

