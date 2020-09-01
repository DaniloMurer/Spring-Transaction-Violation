package com.danilojakob.transactionviolation.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "kiste")
public class Kiste {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long kisteId;

    @Column(nullable = false, length = 256)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "regal_fk", nullable = false)
    @JsonBackReference
    private Regal regal;

    public long getKisteId() {
        return kisteId;
    }

    public void setKisteId(long id) {
        this.kisteId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Regal getRegal() {
        return regal;
    }

    public void setRegal(Regal regal) {
        this.regal = regal;
    }
}
