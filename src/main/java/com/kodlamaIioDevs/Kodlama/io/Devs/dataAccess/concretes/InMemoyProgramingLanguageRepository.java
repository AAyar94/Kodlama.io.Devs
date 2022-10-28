package com.kodlamaIioDevs.Kodlama.io.Devs.dataAccess.concretes;

import com.kodlamaIioDevs.Kodlama.io.Devs.dataAccess.abstracts.ProgramingLanguageRepository;
import com.kodlamaIioDevs.Kodlama.io.Devs.entities.concretes.ProgramLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InMemoyProgramingLanguageRepository implements ProgramingLanguageRepository {
    private List<ProgramLanguage> list;

    @Autowired
    public InMemoyProgramingLanguageRepository(){
        list= new ArrayList<ProgramLanguage>();
        list.add(new ProgramLanguage(1,"C#"));
        list.add(new ProgramLanguage(2,"Java"));
        list.add(new ProgramLanguage(3,"Python"));
    }

    @Override
    public void add(ProgramLanguage programLanguage) {
        list.add(programLanguage);
    }

    @Override
    public void delete(int id) {
       ProgramLanguage programLanguageWillRemove = getById(id);
       list.remove(programLanguageWillRemove);
    }

    @Override
    public void update(ProgramLanguage programLanguage) {
    ProgramLanguage programLanguage1 = getById(programLanguage.getId());
    programLanguage1.setName(programLanguage.getName());
    }

    @Override
    public List<ProgramLanguage> getAll() {
        return list;
    }

    @Override
    public ProgramLanguage getById(int id) {
        for(ProgramLanguage programLanguage : list){
            if (programLanguage.getId() == id){
                return programLanguage;
            }
        }
        return null;
    }
}
