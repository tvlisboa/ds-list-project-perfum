package org.serratec.dev.dslistperfume.DTO;

import org.serratec.dev.dslistperfume.entities.Perfume;
import org.serratec.dev.dslistperfume.entities.PerfumeList;

public class PerfumeListDTO {
    private Long id;
    private String name;

    public PerfumeListDTO() {
    }

    public PerfumeListDTO(PerfumeList entity) {
       id = entity.getId();
       name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
