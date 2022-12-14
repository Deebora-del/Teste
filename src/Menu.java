import java.io.IOException;

public class Menu {
    public static void ExibirMenuPrincipal(){
        System.out.println("=====================MENU PRINCIPAL==============");
        System.out.println("1 - Condutor");
        System.out.println("2 - Veiculo");
        System.out.println("3 - Multa");
        System.out.println("4 - Sair");

    }

    /**
     * Limpa a tela no windows, no linux e no MacOS
     */
    public static void limparConsole(){
         
            if (System.getProperty("os.name").contains("Windows"))
                try {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                } catch (InterruptedException | IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            else
                try {
                    Runtime.getRuntime().exec("clear");
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

    }

 }   

