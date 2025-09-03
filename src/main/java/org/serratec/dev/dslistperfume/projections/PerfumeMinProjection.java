package org.serratec.dev.dslistperfume.projections;

public interface PerfumeMinProjection {
    Long getId();
    String getTitle();
    Integer getReleaseYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
}
