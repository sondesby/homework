package tn.iset.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.iset.entities.Role;
@Repository


public interface RoleRepository extends JpaRepository <Role, Long>{

}
