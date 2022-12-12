package com.entities;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Etudiant implements Serializable{
    @Id
    @GeneratedValue
    private Long code;
    private String nom;
    private static final long serialVersionUID = 1L;
    public Etudiant() {super();}
    public Etudiant( String nom) {
        super();
        this.nom = nom;}
    public Long getCode() {
        return code;}
    public void setCode(Long code) {
        this.code = code;}
    public String getNom() {
        return nom;}
    public void setNom(String nom) {
        this.nom = nom;}
}