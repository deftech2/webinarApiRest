package sn.ucad.webinar.controllers;

import io.swagger.models.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sn.ucad.webinar.entities.Personne;
import sn.ucad.webinar.repositories.PersonneRepo;

/**
 * @author KEBA DEME
 * @created 23-04-2022 -22:58
 * @project webinar
 */
@RestController
@RequiredArgsConstructor
public class PersonneController {


    private final PersonneRepo personneRepo;

    @PostMapping("/personnes")
    public ResponseEntity<?> savePersonne(@RequestBody Personne personne){
       Personne saved =  personneRepo.save(personne);
       return new ResponseEntity<>(saved, HttpStatus.OK);

    }

    @GetMapping("/personnes")
    public ResponseEntity<?> getAllPersonne(@RequestParam(name = "page",defaultValue = "0") int page,@RequestParam(name = "size",defaultValue="5") int size){
        Page<Personne> data = personneRepo.findAll(PageRequest.of(page,size));
        return new ResponseEntity<>(data.getContent(),HttpStatus.OK);
    }

}
