package praticando;

public class Praticando_do_zero {
	/*Variavel Global*/
	
	static String nomeAluno = "Iesus";
	static double nota1 = 8;
	static double nota2 = 6;
	static double media = (nota1 + nota2)/2;
	
	/* CRIANDO NOVO M�TODO QUE SER� EXECUTADO DENTRO DO M�TODO MAIN USANDO VARI�VEIS GLOBAL*/
	public static void metodo1() {
		if(media >=7) {
			System.out.println("Aprovado com louvor, sua m�dia foi " + media);
		}
	}
	/*M�TODO PRINCIPAL QUE EXECUTAR� TODO O C�DIGO E O M�TODO CRIADO A CIMA, UTILIZANDO VARI�VEL GLOBAL E LOCAL*/
	public static void main(String[] args) {
		String nome = "Thaline";
		
		/*AQUI ESTOU APLICANDO AS CONDICIONAIS COM OPERADORES L�GICOS && || APENAS PARA TESTAR A FUNCIONALIDADE SENDO NECESS�RIO FAZER ALTERA��ES NAS VARI�VEIS NOME PARA TESTAR O OPERADOR L�GICO*/
		if(media >=7 && nome.equals("Thaline")|| media >=7 && nomeAluno.equals("Iesus")) {
			System.out.println("Parab�ns aluno, voc� foi aprovado com m�dia " + media);
		}else {
			System.out.println("Voc� foi reprovado, sua m�dia foi " + media);
		}
		metodo1();
	}
	
	
	
}
