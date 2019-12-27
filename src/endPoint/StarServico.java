package endPoint;

import javax.xml.ws.Endpoint;

import servico.CalculadoraImpl;

public class StarServico {

	public static void main(String[] args) {
		
		Endpoint.publish(	"http://localhost:8085/GodOfJavaSOAP/Calculadora", 	new CalculadoraImpl());
		System.out.println("Serviço publicado com sucesso");
	}

}
