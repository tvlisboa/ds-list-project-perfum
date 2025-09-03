package org.serratec.dev.dslistperfume.controllers;
import org.serratec.dev.dslistperfume.DTO.PerfumeListDTO;
import org.serratec.dev.dslistperfume.services.PerfumeListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class PerfumeListController {

    @Autowired
    private PerfumeListService perfumeListService;

    @GetMapping
    public List<PerfumeListDTO> findAll(){
        List<PerfumeListDTO> result = perfumeListService.findAll();
        return result;
    }

}
