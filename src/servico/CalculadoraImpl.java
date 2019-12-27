package servico;

import javax.jws.WebService;

import entidades.RetornoSoap;

@WebService(endpointInterface = "servico.Calculadora")
public class CalculadoraImpl implements Calculadora{

	@Override
	public RetornoSoap somar(double valor1, double valor2) {
		RetornoSoap retorno  = new RetornoSoap(); // Instacia o objeto da Entidade
		retorno.setCodigoRetorno(0); // 0 = C�digo de sucesso  --- 1 = C�digo de Falha (No retorno da API
		retorno.setMensagemRetorno("Sucesso"); // Retorna a mensagem de Sucesso porque na soma n�o como ter erro
		retorno.setValorRetorno(valor1+valor2);
		return retorno;
	}

	@Override
	public RetornoSoap subtrair(double valor1, double valor2) {
		RetornoSoap retorno = new RetornoSoap();
		retorno.setCodigoRetorno(0);
		retorno.setMensagemRetorno("Sucesso");
		retorno.setValorRetorno(valor1 - valor2);
		return retorno;
	}

	@Override
	public RetornoSoap multiplicar(double valor1, double valor2) {
		RetornoSoap retorno = new RetornoSoap();
		retorno.setCodigoRetorno(0);
		retorno.setMensagemRetorno("Sucesso");
		retorno.setValorRetorno(valor1 * valor2);
		return  retorno;  
	}

	@Override
	public RetornoSoap dividir(double valor1, double valor2) {
		RetornoSoap retorno = new RetornoSoap();
		retorno.setCodigoRetorno(0);
		retorno.setMensagemRetorno("Sucesso");
		
		if (valor2 == 0) {
			retorno.setCodigoRetorno(1); // C�digo de Falha
			retorno.setMensagemRetorno("FALHA: Divisor � zero !!!");
			retorno.setValorRetorno(null);
		} else {
			retorno.setValorRetorno(valor1 / valor2);
		}
		
		return retorno;
	}

}
