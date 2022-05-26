package springrestexample.springpost.entity;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Transactions")
public class TransactionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "referenceid")
    private String referenceid;

    @Column(name = "documenttype")
    private String documenttype;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "transactiondate")
    private Date transactiondate;

    public TransactionEntity() {
    }

    public TransactionEntity(long id, String referenceid, String documenttype, Double amount, Date transactiondate) {
        this.id = id;
        this.referenceid = referenceid;
        this.documenttype = documenttype;
        this.amount = amount;
        this.transactiondate = transactiondate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getReferenceid() {
        return referenceid;
    }

    public void setReferenceid(String referenceid) {
        this.referenceid = referenceid;
    }

    public String getDocumenttype() {
        return documenttype;
    }

    public void setDocumenttype(String documenttype) {
        this.documenttype = documenttype;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getTransactiondate() {
        return transactiondate;
    }

    public void setTransactiondate(Date transactiondate) {
        this.transactiondate = transactiondate;
    }
}

