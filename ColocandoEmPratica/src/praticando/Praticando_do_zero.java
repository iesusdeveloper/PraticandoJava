package praticando;

public class Praticando_do_zero {
	/*Variavel Global*/
	
	static String nomeAluno = "Iesus";
	static double nota1 = 8;
	static double nota2 = 6;
	static double media = (nota1 + nota2)/2;
	
	/* CRIANDO NOVO MÉTODO QUE SERÁ EXECUTADO DENTRO DO MÉTODO MAIN USANDO VARIÁVEIS GLOBAL*/
	public static void metodo1() {
		if(media >=7) {
			System.out.println("Aprovado com louvor, sua média foi " + media);
		}
	}
	/*MÉTODO PRINCIPAL QUE EXECUTARÁ TODO O CÓDIGO E O MÉTODO CRIADO A CIMA, UTILIZANDO VARIÁVEL GLOBAL E LOCAL*/
	public static void main(String[] args) {
		String nome = "Thaline";
		
		/*AQUI ESTOU APLICANDO AS CONDICIONAIS COM OPERADORES LÓGICOS && || APENAS PARA TESTAR A FUNCIONALIDADE SENDO NECESSÁRIO FAZER ALTERAÇÕES NAS VARIÁVEIS NOME PARA TESTAR O OPERADOR LÓGICO*/
		if(media >=7 && nome.equals("Thaline")|| media >=7 && nomeAluno.equals("Iesus")) {
			System.out.println("Parabéns aluno, você foi aprovado com média " + media);
		}else {
			System.out.println("Você foi reprovado, sua média foi " + media);
		}
		metodo1();
	}
	
	
	
}
