package tn.esprit.spring.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table (name = "Gare")
@Data
public class Gare implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idGare;
    private String nom;
    @Enumerated (EnumType.STRING)
    private Ville localisation;


}
