package org.serratec.dev.dslistperfume.repositories;

import org.serratec.dev.dslistperfume.entities.Perfume;
import org.serratec.dev.dslistperfume.projections.PerfumeMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PerfumeRepository extends JpaRepository<Perfume,Long> {
    @Query(nativeQuery = true, value = """
        SELECT tb_perfumes.id, 
               tb_perfumes.title, 
               tb_perfumes.release_year AS releaseYear, 
               tb_perfumes.img_url AS imgUrl,
               tb_perfumes.short_description AS shortDescription, 
               tb_belonging.position
        FROM tb_perfumes
        INNER JOIN tb_belonging ON tb_perfumes.id = tb_belonging.perfume_id
        WHERE tb_belonging.list_id = :listId
        ORDER BY tb_belonging.position
        """)
    List<PerfumeMinProjection> searchByList(@Param("listId") Long listId);
}

