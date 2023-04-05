package tn.iset;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import tn.iset.dao.ArticleRepository;
import tn.iset.dao.CommandLineRepository;
import tn.iset.dao.CommandRepository;
import tn.iset.dao.PaymentRepository;
import tn.iset.dao.RoleRepository;
import tn.iset.dao.UtilisateurInformationsRepository;
import tn.iset.dao.UtilisateurRepository;
import tn.iset.entities.Article;
import tn.iset.entities.Command;
import tn.iset.entities.CommandLine;
import tn.iset.entities.CreditCardPayment;
import tn.iset.entities.PaypalPayment;
import tn.iset.entities.Role;
import tn.iset.entities.Utilisateur;
import tn.iset.entities.UtilisateurInformations;

@SpringBootApplication
public class HomeworkApplication {

	public static void main(String[] args) {
		//SpringApplication.run(HomeworkApplication.class, args);
		ApplicationContext work = SpringApplication.run(HomeworkApplication.class, args);
		
		UtilisateurRepository utilisateurRepository = work.getBean(UtilisateurRepository.class);
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setLogin("sondes");
        utilisateur.setPassword("1234");
        utilisateur.setConnectionNumber(0);
        utilisateurRepository.save(utilisateur);
        
        UtilisateurInformationsRepository utilisateurInformationsRepository = work.getBean(UtilisateurInformationsRepository.class);
        UtilisateurInformations utilisateurInformations = new UtilisateurInformations();
        utilisateurInformations.setAddress("Robbana");
        utilisateurInformations.setCity("Djerba");
        utilisateurInformations.setEmail("sondousby@gmail.com");
        utilisateurInformations.setPhoneNumber("29490688");
        utilisateurInformationsRepository.save(utilisateurInformations);

        CommandRepository commandRepository = work.getBean(CommandRepository.class);
        Command command = new Command();
        String dateS = "2023-02-18";
        SimpleDateFormat dateF = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = dateF.parse(dateS);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        command.setCommandDate(date);
        commandRepository.save(command);

        PaymentRepository paymentRepository = work.getBean(PaymentRepository.class);
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        creditCardPayment.setCardNumber("111111111");
        creditCardPayment.setExpiration("25/04");
        paymentRepository.save(creditCardPayment);
        PaypalPayment paypalPayment = new PaypalPayment();
        paypalPayment.setAccountNumber("111111111");
        paymentRepository.save(paypalPayment);
        
        RoleRepository roleRepository = work.getBean(RoleRepository.class);
        Role role = new Role();
        role.setRoleName("admin");
        roleRepository.save(role);

        ArticleRepository articleRepository = work.getBean(ArticleRepository.class);
        Article article = new Article();

        CommandLineRepository commandLineRepository = work.getBean(CommandLineRepository.class);
        CommandLine commandLine = new CommandLine();





       
	}

}
