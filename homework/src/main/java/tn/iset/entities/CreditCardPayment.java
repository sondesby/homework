package tn.iset.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data 
@AllArgsConstructor 
@NoArgsConstructor
@DiscriminatorValue("CREDIT")
public class CreditCardPayment extends Payment {
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	

	private String cardNumber; 
    private String expiration;
}
