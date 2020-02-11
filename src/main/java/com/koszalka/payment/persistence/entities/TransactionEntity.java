package com.koszalka.payment.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "transaction", schema = "public")
public class TransactionEntity {

    @Column(name = "nsu")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "short_sequence")
    @SequenceGenerator(name = "short_sequence", sequenceName = "short_sequence", allocationSize = 1, initialValue = 1, schema = "public")
    private Long id;

    @Column(name = "value", nullable = false)
    private Long value;

    @Column(name = "card_flag", nullable = false)
    private String card_flag;

    @Column(name = "modality", nullable = false)
    private String modality;

    @Column(name = "hour", nullable = false)
    private Date hour;

    public Long getValue() { return value; }
    public void setValue(Long value) { this.value = value; }

    public String getCard_flag() { return this.card_flag; }
    public void setCard_flag(String card_flag) { this.card_flag = card_flag; }

    public String getModality() { return modality; }
    public void setModality(String modality) { this.modality = modality; }

    public Date getHour() { return hour; }
    public void setHour(Date hour) { this.hour = hour; }

}
