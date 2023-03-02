package edu.pedro.soluções;

public class Solucao4 {
	/*
	 * 4 - Dois veículos (um carro e um caminhão) saem respectivamente de cidades
	 * opostas pela mesma rodovia. O carro de Ribeirão Preto em direção a Franca, a
	 * uma velocidade constante de 110 km/h e o caminhão de Franca em direção a
	 * Ribeirão Preto a uma velocidade constante de 80 km/h. Quando eles se cruzarem
	 * na rodovia, qual estará mais próximo a cidade de Ribeirão Preto?
	 * 
	 * 
	 * 
	 * IMPORTANTE:
	 * 
	 * a) Considerar a distância de 100km entre a cidade de Ribeirão Preto <->
	 * Franca.
	 * 
	 * b) Considerar 2 pedágios como obstáculo e que o caminhão leva 5 minutos a
	 * mais para passar em cada um deles e o carro possui tag de pedágio (Sem Parar)
	 * 
	 * c) Explique como chegou no resultado.
	 */
	public static void main(String[] args) {
		int distancia = 50; // distância entre Ribeirão Preto e Franca em km
		int velocidadeCarro = 110; // velocidade do carro em km/h
		int velocidadeCaminhao = 80; // velocidade do caminhão em km/h
		int tempoPedagio = 5; // tempo adicional do caminhão em cada pedágio em minutos

		// tempo que o carro leva para percorrer a distância até o encontro
		double tempoCarro = (double) distancia / velocidadeCarro;

		// tempo que o caminhão leva para percorrer a distância até o encontro, com
		// tempo adicional dos pedágios
		double tempoCaminhao = (double) distancia / velocidadeCaminhao + 2 * tempoPedagio / 60.0;

		// distância que o carro e o caminhão percorrem até o encontro
		double distanciaEncontro = tempoCarro * velocidadeCarro;

		// verifica qual veículo está mais próximo de Ribeirão Preto quando ocorre o
		// encontro
		String veiculoProximo = distanciaEncontro < distancia / 2 ? "carro" : "caminhão";

		// exibe o resultado
		System.out.println(
				"O " + veiculoProximo + " está mais próximo da cidade de Ribeirão Preto quando ocorre o encontro.");
		/*
		 * O programa utiliza as variáveis distancia, velocidadeCarro,
		 * velocidadeCaminhao e tempoPedagio para armazenar os valores das informações
		 * dadas no problema. Em seguida, calcula o tempo que o carro e o caminhão levam
		 * para percorrer a distância até o encontro e a distância que percorrem até se
		 * encontrarem. Por fim, verifica qual veículo está mais próximo de Ribeirão
		 * Preto quando ocorre o encontro e exibe a mensagem correspondente.
		 */
	}

}
