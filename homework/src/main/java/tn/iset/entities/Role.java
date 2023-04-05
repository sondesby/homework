package tn.iset.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data 
@AllArgsConstructor 
@NoArgsConstructor
public class Role implements Serializable {
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRole; 
    private String RoleName;
    @ManyToMany
    private Collection<Utilisateur> utilisateur;

  
}
