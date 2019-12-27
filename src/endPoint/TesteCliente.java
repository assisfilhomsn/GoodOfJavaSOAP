package endPoint;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import servico.Calculadora;

public class TesteCliente {

	public static void main(String[] args) {

		try {
			
			URL url = new URL("http://localhost:8085/GodOfJavaSOAP/Calculadora?wsdl");
		    QName qname = new QName("http://servico/","CalculadoraImpl");
		    Service ws = Service.create(url, qname);
		    Calculadora calc = ws.getPort(Calculadora.class);

		    System.out.println("Soma (5+1): " + calc.somar(5,1));
		    
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}



	}

}
