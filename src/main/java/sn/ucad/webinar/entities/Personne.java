package sn.ucad.webinar.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * @author KEBA DEME
 * @created 23-04-2022 -22:31
 * @project webinar
 */

@Entity
@Table(name = "web_personne")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Personne {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "per_nom",length = 20)
    private String nom;

    @Column(name = "per_prenom",length = 50)
    private String prenom;

    @Column(name = "per_adresse",length = 20)
    private String adresse;

    @Column(name = "per_telephone",length = 10)
    private String telephone;

    @JsonIgnore
    @OneToMany
    private List<Compte> comptes;
}
