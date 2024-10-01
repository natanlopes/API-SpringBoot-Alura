package br.com.projeto.screenmacth;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.projeto.screenmacth.model.DadosSerie;
import br.com.projeto.screenmacth.service.ConsumoApi;
import br.com.projeto.screenmacth.service.ConverteDados;

@SpringBootApplication
public class ScreenmacthApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmacthApplication.class, args);
	}
	 @Override
	    public void run(String... args) throws Exception {
		 var consumoApi = new ConsumoApi();
	        var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
	        System.out.println(json);
	        ConverteDados conversor = new ConverteDados();
	        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
	        System.out.println(dados);
}
}