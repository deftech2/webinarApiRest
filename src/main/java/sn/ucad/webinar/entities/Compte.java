package sn.ucad.webinar.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author KEBA DEME
 * @created 23-04-2022 -22:41
 * @project webinar
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "web_compte")
public class Compte {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "com_numero_compte",length=20)
    private String numeroCompte;

    @Column(name = "com_solde")
    private BigDecimal solde;

    @ManyToOne
    private Personne personne;
}
