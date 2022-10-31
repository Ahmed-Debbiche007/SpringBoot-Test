package tn.esprit.spring.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;
@Entity
@Table (name = "Train")
@Data
public class Train implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTrain;
    private etatTrain etat;
    @Temporal(TemporalType.DATE)
    private Date dateDepart;
    @Temporal(TemporalType.DATE )
    private Date dateArrivee;
    private double heureDepart;
    private double heureArrivee;
    private int nbPlacelibre;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="train")
    private Set<Client> clients;

    //@ManyToOne (cascade = CascadeType.ALL)
    //private Gare vient;
    @ManyToOne (cascade = CascadeType.ALL)
    private Gare vaVers;
}
