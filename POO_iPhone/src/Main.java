import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int option;
        int suboption;
        iPhone iPhone = new iPhone();

        while (true){
            System.out.println("Bem-vindo ao seu iPhone. Escolha uma açao pra executar:");
            System.out.println("1 - Reprodutor musical");
            System.out.println("2 - Aparalho Telefónico");
            System.out.println("3 - Navegador na Internet");
            System.out.println("4 - Sair e desligar o iPhone");
            option = scanner.nextInt();
            if(option == 1){
                System.out.println("Reprodutor musical escolhido, escolha uma açao pra executar:");
                System.out.println("1 - Tocar música");
                System.out.println("2 - Pausar música");
                System.out.println("3 - Selecionar música");
                suboption = scanner.nextInt();
                if (suboption == 1){
                    iPhone.tocar();
                }else if(suboption == 2){
                    iPhone.pausar();
                }else if(suboption == 3){
                    System.out.println("Digite o nome de uma música:");
                    var musica = scanner.next();
                    iPhone.selecionarMusica(musica);
                }else{
                    System.out.println("Opçao incorreta");
                    continue;
                }
            } else if(option == 2){
                System.out.println("Aparalho Telefónico escolhido, escolha uma açao pra executar:");
                System.out.println("1 - Ligar");
                System.out.println("2 - Atender");
                System.out.println("3 - Iniciar Correio Voz");
                suboption = scanner.nextInt();
                if (suboption == 1){
                    System.out.println("Digite o número pra fazer uma ligaçao:");
                    var numero = scanner.next();
                    iPhone.ligar(numero);
                }else if(suboption == 2){
                    iPhone.atender();
                }else if(suboption == 3){
                    iPhone.iniciarCorreioVoz();
                }else{
                    System.out.println("Opçao incorreta");
                    continue;
                }
            }else if(option == 3){
                System.out.println("Navegador na Internet, escolha uma açao pra executar:");
                System.out.println("1 - Exibir página");
                System.out.println("2 - Adicionar uma aba");
                System.out.println("3 - Atualizar página");
                suboption = scanner.nextInt();
                if (suboption == 1){
                    System.out.println("Digite a url da página a ser exibida:");
                    var url = scanner.next();
                    iPhone.exibirPagina(url);
                }else if(suboption == 2){
                    iPhone.adicionarNovaAba();
                }else if(suboption == 3){
                    iPhone.atualizarPagina();
                }else{
                    System.out.println("Opçao incorreta");
                    continue;
                }
            }else if(option == 4){
                break;
            }else {
                System.out.println("Opçao incorreta");
                continue;
            }

        }

    }

}