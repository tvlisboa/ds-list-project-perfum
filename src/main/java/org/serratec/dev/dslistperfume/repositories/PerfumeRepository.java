package org.serratec.dev.dslistperfume.repositories;

import org.serratec.dev.dslistperfume.entities.Perfume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfumeRepository extends JpaRepository<Perfume,Long> {
}
