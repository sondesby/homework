package tn.iset.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.iset.entities.Payment;
@Repository


public interface PaymentRepository extends JpaRepository <Payment, Long>{

}
