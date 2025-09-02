package org.serratec.dev.dslistperfume.services;

import org.serratec.dev.dslistperfume.DTO.PrfMinDTO;
import org.serratec.dev.dslistperfume.entities.Perfume;
import org.serratec.dev.dslistperfume.repositories.PerfumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfumeService {


    @Autowired
    private PerfumeRepository perfumeRepository;

    public List<PrfMinDTO> findAll(){
        List<Perfume> result = perfumeRepository.findAll();
        List<PrfMinDTO> dto = result.stream().map(x -> new PrfMinDTO(x)).toList();
        return dto;
    }
}
