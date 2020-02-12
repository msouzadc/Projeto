package Main;

import com.servicos.LeitorArquivo;

public class Main {

		public static void main(String args[]) { 
			String arquivo = "C:\\Users\\msouz\\eclipse-workspace\\arq1.txt";
			LeitorArquivo leitor = new LeitorArquivo();
			leitor.executa(arquivo);
			System.exit(0);
		}
}
