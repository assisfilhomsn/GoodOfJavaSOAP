package entidades;

public class RetornoSoap {
	private int codigoRetorno;
	private String mensagemRetorno;
	private Double valorRetorno;

	public int getCodigoRetorno() {
		return codigoRetorno;
	}

	public void setCodigoRetorno(int codigoRetorno) {
		this.codigoRetorno = codigoRetorno;
	}

	public String getMensagemRetorno() {
		return mensagemRetorno;
	}

	public void setMensagemRetorno(String mensagemRetorno) {
		this.mensagemRetorno = mensagemRetorno;
	}

	public Double getValorRetorno() {
		return valorRetorno;
	}

	public void setValorRetorno(Double valorRetorno) {
		this.valorRetorno = valorRetorno;
	}
}
