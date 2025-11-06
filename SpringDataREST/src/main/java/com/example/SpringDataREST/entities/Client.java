package com.example.SpringDataREST.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String email;


    @OneToMany(mappedBy = "client")
    private List<Compte> comptes;

    public Client() {
    }

    public Client(Long id, String nom, List<Compte> comptes) {
        this.id = id;
        this.nom = nom;

        this.comptes = comptes;
    }

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }

    public List<Compte> getComptes() {
        return comptes;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setComptes(List<Compte> comptes) {
        this.comptes = comptes;
    }
}