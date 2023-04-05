package tn.iset.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.iset.entities.Utilisateur;
@Repository


public interface UtilisateurRepository extends JpaRepository <Utilisateur, Long>{

}
