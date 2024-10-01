package br.com.projeto.screenmacth.service;





public interface IConverteDados {
	 <T> T  obterDados(String json, Class<T> classe);

}
