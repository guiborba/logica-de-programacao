/*
Escreva um algoritmo e depois o converta para um programa na linguagem Java que a partir 
da quantidade comercializada de um produto e de seu preço de venda, mostre o total do item.

Exemplo:
Quantidade vendida do produto: 8
Preço de venda: R$ 15,00
Total do item: 8 x 15 => 120

*/

public class Main {
    
	public static void main(String [] arg) {

    System.out.println("=== TOTAL DE VENDAS ===");

	int qtdVendida = 10;
	System.out.println("A quantidade vendida foi de " 
	+ qtdVendida + " unidades.");

	int valorUnit = 5;
	System.out.println ("O valor da cada unidade é de "
	+ valorUnit + " reais.");

	int totalVendas = qtdVendida * valorUnit;
	System.out.println ("O total de vendas foi de "
	+ totalVendas + " reais.");
    

	}

}