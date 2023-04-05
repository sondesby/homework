package tn.iset.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data 
@AllArgsConstructor 
@NoArgsConstructor
public class UtilisateurInformations implements Serializable {
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idInformations; 
    private String address;
    private String city;
    private String email;
    private String phoneNumber;
    @OneToOne
	private Utilisateur utilisateur;



  
}
