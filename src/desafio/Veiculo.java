package desafio;

public class Veiculo {
	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float Km;
	private boolean isLigado;
	private int litrosCombustivel;
	private int velocidade;
	private Double pre�o;

	public Veiculo() {

	}

	public Veiculo(String marca, String modelo, String placa, String cor, float km, boolean isLigado,
			int litrosCombustivel, int velocidade, Double pre�o) {
		super();
		this.marca = "";
		this.modelo = "";
		this.placa = "";
		this.cor = "";
		Km = km;
		this.isLigado = isLigado;
		this.litrosCombustivel = litrosCombustivel;
		this.velocidade = velocidade;
		this.pre�o = pre�o;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getKm() {
		return Km;
	}

	public void setKm(float km) {
		Km = km;
	}

	public boolean isLigado() {
		return isLigado;
	}

	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public Double getPre�o() {
		return pre�o;
	}

	public void setPre�o(Double pre�o) {
		this.pre�o = pre�o;
	}

	public void Acelerar() {
		if (this.isLigado == true) {
			this.velocidade += 20;
			this.litrosCombustivel -= 1;
			System.out.println("O carro acelerou. Sua velocidade � de " + this.velocidade + " km por hora");
			System.out.println("O seu combustivel � de " + this.litrosCombustivel + " litros.");
		} else
			System.out.println("Voce precisa ligar o carro primeiro");
	}

	public void Abastecer(int qntdLitros) {
		if (this.litrosCombustivel >= 100) {
			System.out.println("O tamque est� cheio ");
		} else {
			if (qntdLitros >= 100) {
				System.out.println("Digite um n�mero menor que 100 litros para abastecer");

			} else {
				this.litrosCombustivel += qntdLitros;
				System.out.println("Seu combustivel � de " + qntdLitros);
			}
		}
	}

	public void Frear() {
		if (this.isLigado == true) {
			if (this.velocidade > 10)
				;
			this.velocidade -= 10;
		} else {
			if (this.velocidade <= 0) {
				System.out.println("O carro est� parado");
			} else {
				System.out.println("O carro est� desligado");
			}

		}
		System.out.println("A velocidade � de " + this.velocidade + "km por hora");
	}

	public void Pintar(String cor) {
		System.out.println("Seu carro est� com a cor " + cor);
	}

	public void Ligar() {
		if (this.isLigado == true) {
			System.out.println("O carro est� igado");
		} else {
			this.isLigado = true;
			System.out.println("Voce ligou o carro");
		}
	}

	public void Desligar() {
		if (this.isLigado == false) {
			System.out.println("O carro esta desligado");
		} else {
			this.isLigado = false;
			System.out.println("Voc� desligou o carro");
		}
	
	}
	
}
