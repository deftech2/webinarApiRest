package sn.ucad.webinar.services.implementations;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import sn.ucad.webinar.entities.Compte;
import sn.ucad.webinar.repositories.CompteRepo;
import sn.ucad.webinar.repositories.PersonneRepo;
import sn.ucad.webinar.services.interfaces.ICompteService;

/**
 * @author KEBA DEME
 * @created 23-04-2022 -23:28
 * @project webinar
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class CompteService  implements ICompteService {
    private final CompteRepo compteRepo;

    @Override
    public ResponseEntity<?> findCompteByNumeroCompte(String numero) {
        Compte data =  compteRepo.findByNumeroCompte(numero);
        log.info("KEBA a consulté le compte {}",numero);
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> createCompte(Compte compte) {

        Compte saved = compteRepo.save(compte);
        return new ResponseEntity<>(saved,HttpStatus.OK);
    }
}
