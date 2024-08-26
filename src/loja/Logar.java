package loja;
import java.util.Random;
import java.util.Scanner;

public class Logar {
    
    // Atributos de login
    String senha;
    String senhaLogin;
    String login;
    String Email;
    int codigoV = 0;

    Scanner sc = new Scanner(System.in);

    // Método de criar o login e a Senha
    protected void criarLogin() {
        System.out.println("\nDigite o seu login:");
        login = sc.nextLine();
        Email = login;
        System.out.println("Seu login: " + Email + "@gmail.com");


        System.out.println("Digite sua senha:");
        senhaLogin = sc.nextLine();
        senha = senhaLogin;
        System.out.println("Sua senha: " + senha);
    }

    protected void Codigo() {
        Random aleatorio = new Random();
        System.out.println("Digite o codigo de verificação que aparecerá logo abaixo:");
        System.out.println(aleatorio.nextInt(12345, 99999));
        codigoV = sc.nextInt();
        
        
        if () {
            System.out.println("Código feito com sucesso!");

        } else {
            System.out.println("Sapoha ta errada");
        }
    }
    
}
