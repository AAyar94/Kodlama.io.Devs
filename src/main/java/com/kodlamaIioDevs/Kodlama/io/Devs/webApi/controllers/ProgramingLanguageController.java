package com.kodlamaIioDevs.Kodlama.io.Devs.webApi.controllers;


import com.kodlamaIioDevs.Kodlama.io.Devs.business.abstracts.ProgramingLanguagesService;
import com.kodlamaIioDevs.Kodlama.io.Devs.entities.concretes.ProgramLanguage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/programlanguages")
public class ProgramingLanguageController {
    private ProgramingLanguagesService programingLanguagesService;

    public ProgramingLanguageController(ProgramingLanguagesService programingLanguagesService) {
        this.programingLanguagesService = programingLanguagesService;
    }

    @GetMapping("/getall")
    public List<ProgramLanguage> getAll(){
        return programingLanguagesService.getAll();
    }

}
