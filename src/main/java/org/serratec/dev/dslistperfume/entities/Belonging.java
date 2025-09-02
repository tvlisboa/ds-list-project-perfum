package org.serratec.dev.dslistperfume.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_belonging")
public class Belonging {

    @EmbeddedId
   private BelongingPK id = new BelongingPK();
   private Integer position;

   public Belonging(){
   }

    public Belonging(Perfume perfume, PerfumeList perfumeList) {
        this.id.setPerfume(perfume);
        this.position = position;
    }
}
