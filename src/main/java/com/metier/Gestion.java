package com.metier;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import
        org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.dao.EtudiantRepository;
import com.entities.Etudiant;
@Service
@Transactional
@EntityScan(basePackages={"com.entities"})
@EnableJpaRepositories("com.dao")
public class Gestion{
    @Autowired
    private EtudiantRepository etudiantRepository;
    public void insertEtudiant(Etudiant etudiant)
    {etudiantRepository.save(etudiant);}
    public Etudiant consulter(Long code) {
        Etudiant etudiant = etudiantRepository.getOne(code);
        return etudiant;}
    public List<Etudiant> Listing() {
        List <Etudiant> liste=etudiantRepository.findAll();
        return liste;
    }
}