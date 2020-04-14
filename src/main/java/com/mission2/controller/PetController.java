package com.mission2.controller;

import com.mission2.model.Pet;
import com.mission2.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class PetController {

    @Autowired
    private PetService petService;

    //GET all pet
    @GetMapping("/pets")
    public List<Pet> getPet() {
        return petService.getPet();
    }

    //GET specific pet by ID
    @GetMapping("/pets/{id}")
    public Pet getPet(@PathVariable Long id) {
        return petService.getPet(id);
    }

    //POST create new pet
    @PostMapping("/pets")
    public Pet addPet(@RequestBody Pet pet) {
        return petService.addPet(pet);
    }

    //PUT update pet
    @PutMapping("/pets/{id}")
    public void updatePet(@RequestBody Pet pet, @PathVariable Long id) {
        petService.updatePet(pet, id);
    }

    //DELETE remove pet
    @DeleteMapping("pets/{id}")
    public void deletePet(@PathVariable Long id) {
        petService.deletePet(id);
    }

}
