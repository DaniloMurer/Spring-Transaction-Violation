package com.danilojakob.transactionviolation.domain;

import javax.persistence.*;

@Entity
@Table(name = "regal")
public class Regal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int lagerId;

    @Column(nullable = false)
    private int space;

    public int getLagerId() {
        return lagerId;
    }

    public void setLagerId(int id) {
        this.lagerId = id;
    }

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }
}
