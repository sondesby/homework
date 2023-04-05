package tn.iset.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data 
@AllArgsConstructor 
@NoArgsConstructor
public class Command implements Serializable {
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCommand; 
    private Date CommandDate;
    @ManyToOne
    private Utilisateur utilisateur;
    @OneToOne
	private Payment payment;
    @OneToMany(mappedBy="command", fetch=FetchType.LAZY)
   	private Collection<CommandLine> comandLine;

     

  
}
