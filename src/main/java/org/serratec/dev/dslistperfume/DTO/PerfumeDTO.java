package org.serratec.dev.dslistperfume.DTO;

import org.serratec.dev.dslistperfume.entities.Perfume;
import org.springframework.beans.BeanUtils;

public class PerfumeDTO {
    private Long id;
    private String title;
    private Double score;
    private Integer releaseYear;
    private String genre;
    private String fraganceNotes;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public PerfumeDTO() {
    }

    /**
     * Copia todos os atributos
     * da classe informada
     * no caso a Perfume
     */

    public PerfumeDTO(Perfume entity) {
        BeanUtils.copyProperties(entity, this);
    }

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

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
}
