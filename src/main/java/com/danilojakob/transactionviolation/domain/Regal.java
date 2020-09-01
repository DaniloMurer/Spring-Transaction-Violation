package com.danilojakob.transactionviolation.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "regal")
public class Regal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long lagerId;

    @Column(nullable = false)
    private int space;

    @OneToMany(mappedBy = "regal", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Kiste> kiste;

    public Set<Kiste> getKiste() {
        return kiste;
    }

    public void setKiste(Set<Kiste> kiste) {
        this.kiste = kiste;
    }

    public long getLagerId() {
        return lagerId;
    }

    public void setLagerId(long id) {
        this.lagerId = id;
    }

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }
}
