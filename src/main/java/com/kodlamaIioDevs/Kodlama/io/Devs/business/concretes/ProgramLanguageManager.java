package com.kodlamaIioDevs.Kodlama.io.Devs.business.concretes;

import com.kodlamaIioDevs.Kodlama.io.Devs.business.abstracts.ProgramingLanguagesService;
import com.kodlamaIioDevs.Kodlama.io.Devs.dataAccess.abstracts.ProgramingLanguageRepository;
import com.kodlamaIioDevs.Kodlama.io.Devs.entities.concretes.ProgramLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramLanguageManager implements ProgramingLanguagesService {
    private ProgramingLanguageRepository programingLanguageRepository;


    @Autowired
    public ProgramLanguageManager(ProgramingLanguageRepository programingLanguageRepository) {
        this.programingLanguageRepository = programingLanguageRepository;
    }

    @Override
    public void add(ProgramLanguage programLanguage) {
        if (!programLanguage.getName().isEmpty() ){
            for (ProgramLanguage programinglanguage1 : programingLanguageRepository.getAll()){
                if (programinglanguage1.getName().equalsIgnoreCase(programLanguage.getName())){
                    System.out.printf("Programa dili isimleri aynı olamaz");
                }
            }
            programingLanguageRepository.add(programLanguage);
        }else {
            System.out.println("Programlama dili ismi boş olamaz");
        }
    }

    @Override
    public void update(ProgramLanguage programLanguage) {
        programingLanguageRepository.update(programLanguage);
    }

    @Override
    public void delete(int id) {
        programingLanguageRepository.delete(id);
    }

    @Override
    public List<ProgramLanguage> getAll() {
        return programingLanguageRepository.getAll();
    }

    @Override
    public ProgramLanguage getById(int id) {
        return programingLanguageRepository.getById(id);
    }
}
