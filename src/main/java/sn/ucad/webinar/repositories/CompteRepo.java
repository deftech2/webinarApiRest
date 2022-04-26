package sn.ucad.webinar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ucad.webinar.entities.Compte;

/**
 * @author KEBA DEME
 * @created 23-04-2022 -22:46
 * @project webinar
 */

@Repository
public interface CompteRepo extends JpaRepository<Compte,Long> {

    Compte findByNumeroCompte(String numero);
}
