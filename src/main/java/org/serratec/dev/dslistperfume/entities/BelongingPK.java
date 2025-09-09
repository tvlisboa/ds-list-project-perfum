package org.serratec.dev.dslistperfume.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

/**
 * A anotacao @Embeddable ela encapsula
 * mais de um atributo para uma classe
 */

@Embeddable
public class BelongingPK {

    @ManyToOne
    @JoinColumn(name = "perfume_id")
    private Perfume perfume;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private PerfumeList perfumeList;

    /**
     * Construtor vazio
     */

    public BelongingPK() {
    }

    /**
     * Construtor com seus atributos
     */

    public BelongingPK(Perfume perfume, PerfumeList perfumeList) {
        this.perfume = perfume;
        this.perfumeList = perfumeList;
    }

    public Perfume getPerfume() {
        return perfume;
    }

    public void setPerfume(Perfume perfume) {
        this.perfume = perfume;
    }

    public PerfumeList getPerfumeList() {
        return perfumeList;
    }

    public void setPerfumeList(PerfumeList perfumeList) {
        this.perfumeList = perfumeList;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK that = (BelongingPK) o;
        return Objects.equals(perfume, that.perfume) && Objects.equals(perfumeList, that.perfumeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(perfume, perfumeList);
    }
}
