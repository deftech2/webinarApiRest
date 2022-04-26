package sn.ucad.webinar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ucad.webinar.entities.Personne;

/**
 * @author KEBA DEME
 * @created 23-04-2022 -22:45
 * @project webinar
 */

@Repository
public interface PersonneRepo extends JpaRepository<Personne,Long> {
}
