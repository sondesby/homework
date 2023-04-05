package tn.iset.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.iset.entities.UtilisateurInformations;
@Repository


public interface UtilisateurInformationsRepository extends JpaRepository <UtilisateurInformations, Long>{

}
