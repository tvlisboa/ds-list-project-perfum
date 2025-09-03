package org.serratec.dev.dslistperfume.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_perfume_list")
public class PerfumeList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    /**
     * Construtor vazio
     */

    public PerfumeList() {
    }

    /**
     * Construtor com os parametros
     */

    public PerfumeList(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PerfumeList that = (PerfumeList) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
