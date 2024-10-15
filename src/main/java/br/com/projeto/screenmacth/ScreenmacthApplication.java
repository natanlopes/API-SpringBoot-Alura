package br.com.projeto.screenmacth;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.projeto.screenmacth.principal.Principal;

@SpringBootApplication
public class ScreenmacthApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmacthApplication.class, args);
	}
	 @Override
	    public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibMenu();

	    }
	}