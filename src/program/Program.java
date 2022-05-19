package program;

import builder.ClientBuilder;
import model.Client;

public class Program {
	
	
	public static void main(String[] args) {
		
		Client bruna = new ClientBuilder("Bruna Rangel")
				.andPhone("21 97013-8204")
				.andHeight("1.59m")
				.andWheight("75")	
				.andAddress("Rua Meriti, 180 - Casa 77")
				.finish();
		
		System.out.println(bruna.toString());
		
	}
	
	
	
	
	
}
