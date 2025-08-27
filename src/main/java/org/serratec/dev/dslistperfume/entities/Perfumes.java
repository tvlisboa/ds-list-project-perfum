package org.serratec.dev.dslistperfume.entities;
import jakarta.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "tb_perfumes")
public class Perfumes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Double score;
    private Integer releaseYear;
    private String genre;
    private String fraganceNotes;
    private String imgUrl;
    private String shortDesc;
    private String longDesc;

    /**
     * Construtor vazio
     */

    public Perfumes() {
    }

    /**
     * Construtor cheio com parametros
     * e argumentos
     */

    public Perfumes(Long id, String title, Double score,
                   Integer releaseYear, String genre,
                   String fraganceNotes, String imgUrl,
                   String shortDesc, String longDesc) {
        this.id = id;
        this.title = title;
        this.score = score;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.fraganceNotes = fraganceNotes;
        this.imgUrl = imgUrl;
        this.shortDesc = shortDesc;
        this.longDesc = longDesc;
    }

    /**
     * Metodos acessores
     * Utilizando os getters e setters
     */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getFraganceNotes() {
        return fraganceNotes;
    }

    public void setFraganceNotes(String fraganceNotes) {
        this.fraganceNotes = fraganceNotes;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public String getLongDesc() {
        return longDesc;
    }

    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Perfumes perfumes = (Perfumes) o;
        return Objects.equals(id, perfumes.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}


