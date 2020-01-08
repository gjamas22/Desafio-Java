import desafio.Veiculo;

public class Main {

	public static void main(String[] args) {
		
		Veiculo v1 = new Veiculo();
		
		v1.Ligar();
		v1.setMarca("Jeep");
		System.out.println("A marca do carro é "+v1.getMarca());
		v1.setModelo("Jeep renegade");
		System.out.println("O modelo do carro é " +v1.getModelo());
		v1.setPlaca("123-1234");
		System.out.println("A placa do carro é " + v1.getPlaca());
		v1.Pintar("branco");
		v1.Abastecer(50);
		v1.Acelerar();
		v1.Acelerar();
		v1.Frear();
		v1.Frear();
		v1.Frear();
		v1.Frear();
		v1.Desligar();
		
	}
	
}