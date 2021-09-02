package meuprograma;

public class Testes {

	public static void main(String[] args) {
		int idade = 15;
		if(idade < 18) {
			System.out.println("Não pode entrar");
		}
	
		int valor = 15;
		if (valor <= 14) {
			System.out.println("Não pode entrar");
		
		} else {
			System.out.println("pode entrar");
		} 
		
		int forma = 15;
		boolean amigoDoDono = true;
		if (forma < 18 && amigoDoDono == false) {
			System.out.println("Tá tudo errado");
		}
		else {
			System.out.println("Tá tudo certo");
		}
		int mes = 1;
		if (mes == 1) {
			System.out.println("Você devria estar de férias");
		}
		
		int livro = 1;
		while (livro < 18) {
			System.out.println(livro);
			livro = livro + 3;
		}
		
		int i = 0;
		while (i <30) {
			System.out.println(i);
			i = i + 5;
		}
		
		for(int j = 0; j < 10; j = j + 3) {
			System.out.println("Repete");
		}
		
		int z = 5;
		int x = 2;
		 System.out.println(z + x);
				
		for (int w = x; w < z; w++){
			if (w % 4 == 0) {
				System.out.println("Achei um número dicisivel por 4 entre w e z");
				break;
			}
		
		}
		
		for (int w = 10; w < 30; w++) {
			if(w > 20 && w < 60) {
				continue;
			}
			System.out.println(w);
		}
		
		@SuppressWarnings("unused")
		int fatorial = 2;
		for (int n = 1; n <= 20; n++) {
		 System.out.println(fatorial  + 5);
	}
}
}
