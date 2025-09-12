package org.serratec.dev.dslistperfume.services;
import org.serratec.dev.dslistperfume.DTO.PerfumeListDTO;
import org.serratec.dev.dslistperfume.entities.PerfumeList;
import org.serratec.dev.dslistperfume.projections.PerfumeMinProjection;
import org.serratec.dev.dslistperfume.repositories.PerfumeListRepository;
import org.serratec.dev.dslistperfume.repositories.PerfumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class PerfumeListService {

    @Autowired
    private PerfumeRepository perfumeRepository;

    @Autowired
    private PerfumeListRepository perfumeListRepository;

    @Transactional(readOnly = true)
    public List<PerfumeListDTO> findAll() {
        List<PerfumeList> result = perfumeListRepository.findAll();
        return result.stream().map(x->new PerfumeListDTO(x)).toList();
    }

    public void move(Long listId, int sourceIndex, int targetIndex) {
        List<PerfumeMinProjection> list = perfumeRepository.searchByList(listId);
    }
}
