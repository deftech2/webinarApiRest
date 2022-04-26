package sn.ucad.webinar.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sn.ucad.webinar.entities.Compte;
import sn.ucad.webinar.services.interfaces.ICompteService;

/**
 * @author KEBA DEME
 * @created 23-04-2022 -23:24
 * @project webinar
 */
@RestController
@RequiredArgsConstructor
public class CompteController {

    private final ICompteService iCompteService;

    @PostMapping("/compte")
    public ResponseEntity<?> createCompte(@RequestBody Compte compte){
        return  iCompteService.createCompte(compte);
    }

    @GetMapping("/comptes/{numero}")
    public ResponseEntity<?> getCompteByNumero(@PathVariable String numero){
        return iCompteService.findCompteByNumeroCompte(numero);
    }

    }



