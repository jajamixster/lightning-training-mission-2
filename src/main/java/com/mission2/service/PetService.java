package com.mission2.service;

import com.mission2.model.Pet;
import org.apache.tomcat.PeriodicEventListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PetService {

    private List<Pet> petList = new ArrayList<>(Arrays.asList(
            new Pet((long)1, "cat", "normal cat",false, 2000.5),
            new Pet((long)2,"dog","normal dog", false, 100000),
            new Pet((long)3,"fox","cute fox", true, 200000)
    ));

    public List<Pet> getPet() {
        return petList;
    }

    public Pet getPet(Long id) {
        return petList.stream().filter(pet -> pet.getId().equals(id)).findFirst().get();
    }

    public Pet addPet(Pet pet) {
        petList.add(pet);
        return pet;
    }

    public void updatePet(Pet pet, Long id) {
        int counter = 0;
        for (Pet petTemp : petList) {
            if (petTemp.getId().equals(id)){
                petList.set(counter, pet);
            }counter++;
        }
    }

    public void deletePet(Long id) {
        petList.removeIf(pet -> pet.getId().equals(id));
    }
}
