package tn.iset.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data 
@AllArgsConstructor 
@NoArgsConstructor
public class Utilisateur implements Serializable {
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUser; 
    private String login ; 
    private String password; 
	private int connectionNumber; 
	@ManyToMany(mappedBy = "utilisateur", fetch=FetchType.LAZY)
    private Collection<Role> role;
	@OneToOne
	private UtilisateurInformations userInformations;
    @OneToMany(mappedBy="utilisateur", fetch=FetchType.LAZY)
	private Collection<Command> command;

  
}
