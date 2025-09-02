package org.serratec.dev.dslistperfume.DTO;

import org.serratec.dev.dslistperfume.entities.Perfume;

public class PrfMinDTO {
    private Long id;
    private String title;
    private Integer releaseYear;
    private String shortDescription;
    private String imgUrl;

    public PrfMinDTO() {
    }

    public PrfMinDTO(Perfume entity) {
        id = entity.getId();
        title = entity.getTitle();
        releaseYear = entity.getReleaseYear();
        shortDescription = entity.getShortDescription();
        imgUrl = entity.getImgUrl();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
