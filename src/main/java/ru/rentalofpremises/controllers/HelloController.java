package ru.rentalofpremises.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.rentalofpremises.models.Apartment;
import ru.rentalofpremises.repositories.ApartmentRepository;

import java.util.List;

@RestController
public class HelloController {
    private final ApartmentRepository apartmentRepository;
    public HelloController(ApartmentRepository apartmentRepository){
        this.apartmentRepository = apartmentRepository;
    }
    @GetMapping("/hello")
    public List<Apartment> hello(){
        return apartmentRepository.findAll();
    }

}
