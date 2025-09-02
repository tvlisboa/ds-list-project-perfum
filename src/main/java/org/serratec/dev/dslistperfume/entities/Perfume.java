package org.serratec.dev.dslistperfume.entities;
import jakarta.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "tb_perfumes")
public class Perfume {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Double score;
    private Integer releaseYear;
    private String genre;
    private String fraganceNotes;
    private String imgUrl;

    @Column(columnDefinition = "TEXT")
    private String shortDescription;

    @Column(columnDefinition = "TEXT")
    private String longDescription;

    /**
     * Construtor vazio
     */

    public Perfume() {
    }

    /**
     * Construtor cheio com parametros
     * e argumentos
     */

    public Perfume(Long id, String title, Double score,
                   Integer releaseYear, String genre,
                   String fraganceNotes, String imgUrl,
                   String shortDescription, String longDescription) {
        this.id = id;
        this.title = title;
        this.score = score;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.fraganceNotes = fraganceNotes;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
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

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription
            (String shortDesc) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Perfume perfume = (Perfume) o;
        return Objects.equals(id, perfume.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}


