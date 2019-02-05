package br.edu.devmedia.jackson;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTestes {
	
	public static void main(String[] args) {
		
		new JacksonTestes().javaToJson();
		new JacksonTestes().jsonToJava();
	}
	
	private void javaToJson(){
		ObjectMapper mapper = new ObjectMapper();
		
		Pessoa pessoa = mockPessoa();
		try {
			mapper.
			writerWithDefaultPrettyPrinter(). //Editar formato do json
			writeValue(new File("C:\\pessoas.json"), pessoa); //Converter objeto pra Json em um arquivo

			String json = mapper.writeValueAsString(pessoa); //Converte objeto pra uma String
			System.out.println(json);
			
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void jsonToJava(){
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			//Ler json arquivo
			Pessoa pessoa = mapper.readValue(new File("C:\\pessoas.json"), Pessoa.class);
			
			System.out.println(pessoa);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private Pessoa mockPessoa(){
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Julio");
		pessoa.setIdade(34);
		pessoa.setEndereco("Rua Teste");
		pessoa.setSalario(new BigDecimal(1000));
		pessoa.setMusicas(Arrays.asList(new String[]{"Musica 1", "Musica 2", "Musica 3"}));
		return pessoa;
	}

}
