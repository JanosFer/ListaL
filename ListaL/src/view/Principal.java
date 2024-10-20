package view;

import model.ListaEncadeada;

public class Principal {
	 public static void main(String[] args) {
		 ListaEncadeada<Integer> l = new ListaEncadeada<Integer>();
		int[] vet = {3, 5, 8, 12, 9, 7, 6, 2, 3, 7, 16};
		int tamanho = vet.length;
		
		for(int i = 0; i < tamanho; i++) {
			try {
				l.addLast(vet[i]);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		
		int ponteiro = 0, maior = 0, segMaior = 0;
		while(ponteiro < tamanho) {
			int valor = 0;
			try {
				valor = l.get(ponteiro);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
			
			if(valor > maior) {
				segMaior = maior;
				maior = valor;
			}
			ponteiro++;
		}
		
		System.out.println("1° Maior valor: " + maior + "\n2° Maior valor: " +segMaior);
	}
}
