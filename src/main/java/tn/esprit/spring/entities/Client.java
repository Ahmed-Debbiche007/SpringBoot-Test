package tn.esprit.spring.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "Client")
@Data
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idClient;
    private String nomClient;

    @ManyToOne (cascade = CascadeType.ALL)
    private Train train;
}
