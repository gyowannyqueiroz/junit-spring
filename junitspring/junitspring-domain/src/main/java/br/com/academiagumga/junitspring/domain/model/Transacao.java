/*
* Gerado automaticamente por GUMGAGenerator em 18/02/2016 14:30:02
*/


package br.com.academiagumga.junitspring.domain.model;

import gumga.framework.domain.GumgaModel;
import gumga.framework.domain.GumgaMultitenancy;
import java.util.*;
import javax.persistence.*;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.envers.Audited;

@GumgaMultitenancy
@SequenceGenerator(name = GumgaModel.SEQ_NAME, sequenceName = "SEQ_TRANSACAO")
@Indexed
@Audited
@Entity
public class Transacao extends GumgaModel<Long> {

    @Version
    private Integer version;
    //@Field //Descomente para ser utilizado na busca multientidades
    private Date data = new Date();
    //@Field //Descomente para ser utilizado na busca multientidades
    private double valor;
    //@Field //Descomente para ser utilizado na busca multientidades
    private String descricao;
    //@Field //Descomente para ser utilizado na busca multientidades
    @ManyToOne
    private ContaCorrente transacaoConta;

    public Transacao(){
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ContaCorrente getTransacaoConta() {
        return transacaoConta;
    }

    public void setTransacaoConta(ContaCorrente transacaoConta) {
        this.transacaoConta = transacaoConta;
    }

}
