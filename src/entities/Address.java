package entities;

public class Address {

	private String correio;
	private String cel;

	public Address() {

	}

	public Address(String correio, String cel) {

		this.correio = correio;
		this.cel = cel;
	}

	public String getCorreio() {
		return correio;
	}

	public void setCorreio(String correio) {
		this.correio = correio;
	}

	public String getCel() {
		return cel;
	}

	public void setCel(String cel) {
		this.cel = cel;
	}

	@Override
	public String toString() {
		return correio;
	}

}