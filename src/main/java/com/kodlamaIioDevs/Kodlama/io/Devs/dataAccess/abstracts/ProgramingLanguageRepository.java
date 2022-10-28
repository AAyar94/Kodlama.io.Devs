package com.kodlamaIioDevs.Kodlama.io.Devs.dataAccess.abstracts;

import com.kodlamaIioDevs.Kodlama.io.Devs.entities.concretes.ProgramLanguage;

import java.util.List;

public interface ProgramingLanguageRepository {
    void add(ProgramLanguage programLanguage);
    void delete(int id);
    void update(ProgramLanguage programLanguage);
    List<ProgramLanguage> getAll();

    ProgramLanguage getById(int id);

}
