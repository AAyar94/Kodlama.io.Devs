package com.kodlamaIioDevs.Kodlama.io.Devs.business.abstracts;

import com.kodlamaIioDevs.Kodlama.io.Devs.entities.concretes.ProgramLanguage;

import java.util.List;

public interface ProgramingLanguagesService {
    void add(ProgramLanguage programLanguage);
    void update(ProgramLanguage programLanguage);
    void delete(int id);
    List<ProgramLanguage> getAll();
    ProgramLanguage getById(int id);
}
