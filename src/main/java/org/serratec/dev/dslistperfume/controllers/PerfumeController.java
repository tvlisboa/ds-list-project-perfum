package org.serratec.dev.dslistperfume.controllers;


import org.serratec.dev.dslistperfume.DTO.PrfMinDTO;
import org.serratec.dev.dslistperfume.entities.Perfume;
import org.serratec.dev.dslistperfume.services.PerfumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/perfumes")
public class PerfumeController {

    @Autowired
    private PerfumeService perfumeService;


    @GetMapping
    public List<PrfMinDTO> findAll(){
        List<PrfMinDTO> result = perfumeService.findAll();
        return result;
    }
}
