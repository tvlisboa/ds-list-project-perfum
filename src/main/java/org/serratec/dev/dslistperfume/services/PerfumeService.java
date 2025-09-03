package org.serratec.dev.dslistperfume.services;
import org.serratec.dev.dslistperfume.DTO.PerfumeDTO;
import org.serratec.dev.dslistperfume.DTO.PrfMinDTO;
import org.serratec.dev.dslistperfume.entities.Perfume;
import org.serratec.dev.dslistperfume.repositories.PerfumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PerfumeService {


    @Autowired
    private PerfumeRepository perfumeRepository;

    @Transactional(readOnly = true)
    public List<PrfMinDTO> findAll(){
        List<Perfume> result = perfumeRepository.findAll();
        List<PrfMinDTO> dto = result.stream().map(x -> new PrfMinDTO(x)).toList();
        return dto;
    }

    @Transactional(readOnly = true)
    public PerfumeDTO findById(long perfumeid){
        Perfume result = perfumeRepository.findById(perfumeid).get();
        PerfumeDTO dto = new PerfumeDTO(result);
        return dto;
    }
}
