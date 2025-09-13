package org.serratec.dev.dslistperfume.controllers;
import org.serratec.dev.dslistperfume.DTO.PerfumeListDTO;
import org.serratec.dev.dslistperfume.DTO.PrfMinDTO;
import org.serratec.dev.dslistperfume.DTO.ReplacementDTO;
import org.serratec.dev.dslistperfume.services.PerfumeListService;
import org.serratec.dev.dslistperfume.services.PerfumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class PerfumeListController {

    @Autowired
    private PerfumeListService perfumeListService;

    @Autowired
    private PerfumeService perfumeService;

    @GetMapping
    public List<PerfumeListDTO> findAll(){
        List<PerfumeListDTO> result = perfumeListService.findAll();
        return result;
    }


    @GetMapping(value = "/{listId}/perfumes")
    public List<PrfMinDTO> findByList(@PathVariable Long listId){
        List<PrfMinDTO> result = perfumeService.findByList(listId);
        return result;
    }

    @PostMapping(value = "/{listId}/replacement")
    public void move(Long listId, @RequestBody ReplacementDTO body){
        perfumeListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
    }

}
