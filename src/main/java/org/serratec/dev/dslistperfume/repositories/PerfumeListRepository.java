package org.serratec.dev.dslistperfume.repositories;
import org.hibernate.sql.Update;
import org.serratec.dev.dslistperfume.entities.PerfumeList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfumeListRepository extends JpaRepository<PerfumeList,Long> {

    @Modifying
    @Query(nativeQuery = true, value = "UPDATE tb_belonging SET position = :newPosition " +
            "WHERE list_id = :listId AND perfume_id = :perfumeId ")
    void updateBelonging(Long listId, Long perfumeId, Integer newPosition);
}
