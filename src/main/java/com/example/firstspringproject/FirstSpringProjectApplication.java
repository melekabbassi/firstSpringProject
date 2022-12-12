package com.example.firstspringproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.entities.*;
import com.metier.Gestion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com.metier")
@SpringBootApplication
public class FirstSpringProjectApplication implements CommandLineRunner {
    @Autowired
    Gestion imetier;
    public static void main(String[] args) {
        SpringApplication.run(FirstSpringProjectApplication.class, args);}
    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        imetier.insertEtudiant(new Etudiant("Melek"));
        List<Etudiant> l;
        l = imetier.Listing();
        for (Etudiant e : l) {
            System.out.println(e.getNom());
        }
    }
}
