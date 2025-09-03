package org.serratec.dev.dslistperfume.repositories;
import org.serratec.dev.dslistperfume.entities.PerfumeList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfumeListRepository extends JpaRepository<PerfumeList,Long> {
}
