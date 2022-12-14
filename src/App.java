import java.util.Scanner;

public class App {

//Condutor(nroCnh, dataEmissao, orgaoEmissor, pontuacao, Veiculo)
//Veiculo (placa, ano, modelo, marca, Condutor, List<Multa> multas))
//Multa(codigoMulta, valor, pontuacao, Veiculo)

    /**
    * @param args
    */
   public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
          int resposta;  
          boolean sair  = false;

          while(!sair){
              Menu.limparConsole();
              Menu.ExibirMenuPrincipal();

            System.out.println("\nDigite a opção desejada: ");

            resposta = teclado.nextInt();

            switch (resposta) {
                case 1:
                   //procedimento para abrir o menu  do condutor
                   break;
                case 2: 
                   break; 
                case 3: 
                   break;
                case 4: 
                   sair = true; 
                   break;        
                default:
                   System.out.println("Opção inválida, digite uma das opções do menu!");
                   break;

            }


          }

    }
}