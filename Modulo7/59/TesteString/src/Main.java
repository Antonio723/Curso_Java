
public class Main {

	public static void main(String[] args) {
		String mensagem = "   Teste    ";
		String lowCase = mensagem.toLowerCase();  //"   teste    "
		String uperCase = mensagem.toUpperCase();  //"   TESTE    "
		String noSpace = mensagem.trim();         //"Teste"

		System.out.println("low CASE: "+lowCase);
		System.out.println("uper CASE: "+uperCase);
		System.out.println("noSpace: "+noSpace);
		
		mensagem = "paralelepidido";
		String init = mensagem.substring(2);    //"ralelepipido"
		String range = mensagem.substring(2, 5);//"ral"
		String replaced = mensagem.replace('a','*');
		
		mensagem = "este projeto é um projeto teste";
		String replaced2 = mensagem.replace("teste", "testado");
		
		System.out.println("substring one argument : "+init);
		System.out.println("substring two arguments: "+range);
		System.out.println("trocado : "+replaced);
		System.out.println("trocando1: "+replaced2);
		
		mensagem = "teste de index desta maneira";
		int index = mensagem.indexOf("es");
		String[] lastIndex = mensagem.split(" ");
	
		System.out.println("index: "+index);
		System.out.println("LastIndex: "+lastIndex);
	}

}
