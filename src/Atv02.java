import java.util.Scanner;

public class Atv02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senha;
        do {
            System.out.print("Digite a senha: ");
            senha = scanner.nextLine();
            if (!senha.equals("123")) {
                System.out.println("Senha incorreta!");
            }
        }while (!senha.equals("123"));
        System.out.println("Senha correta!");
        }
    }

