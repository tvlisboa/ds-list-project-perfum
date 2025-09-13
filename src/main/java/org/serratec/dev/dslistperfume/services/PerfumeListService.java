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

    /**
     * Metodo para fazer a reordenacao na lista
     * Rever esse conteudo, entendi nada no for.
     */


    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex) {
        List<PerfumeMinProjection> list = perfumeRepository.searchByList(listId);
        PerfumeMinProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);

        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

        for(int i=min; i<=max; i++){
            perfumeListRepository.updateBelonging(listId, list.get(i).getId(),i);
        }
    }
}
