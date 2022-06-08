package imagem;
import java.util.Scanner;
public class imagem {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		//Declarando variáveis inteiras e declarando matriz 16x16
		int i,j = 0,m[][]=new int [16][16];
		//Repita ate 16 vezes os seguintes comandos
		for (i=0;i<16;i++) {
			//Informando menu de cores
			System.out.printf("Menu:\nBRANCO, ZERO (0);\n PRETO,  UM (1);\n VERMELHO, DOIS (2)\n E BEGE, TRES (3)");
			//Pedindo para informar número
			System.out.printf("Informe os elementos %da. linha\n", (i+1));
			//Repita ate 16 vezes os seguintes comandos
			for(j=0;j<16;j++) {
				//Informando numeros digitados
				System.out.printf("m[%d][%d] =", i,j);
				//Lendo numeros digitados pelo usuario
				m[i][j]=ler.nextInt();}
			//Pulando linha para ficar facil a compreensao do usuario
			System.out.printf("\n");
			}
		//Repita ate 16 vezes os seguintes comandos para formar a matriz
		for (i=0;i<16;i++) {
			//Repita ate 16 vezes os seguintes comandos para formar a matriz
			for(j=0;j<16;j++) {
				//Informando matriz com os numeros digitados
				System.out.printf("%d", m[i][j]);}
			//Pulando de linha por ter acabado as colunas
			System.out.printf("\n");
			}
	}	

	}				
		
		
		        
		        
			
			
	


