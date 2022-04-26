package sn.ucad.webinar.services.interfaces;

import org.springframework.http.ResponseEntity;
import sn.ucad.webinar.entities.Compte;

/**
 * @author KEBA DEME
 * @created 23-04-2022 -23:26
 * @project webinar
 */
public interface ICompteService {

    ResponseEntity<?> findCompteByNumeroCompte(String numero);

    ResponseEntity<?> createCompte(Compte compte );
}
