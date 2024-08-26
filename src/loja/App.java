package loja;
public class App {
    public static void main(String[] args) throws Exception {
        // Chamando a classe "Pessoa"
        Pessoa ps = new Pessoa();
        
        // Declaração de métodos da classe "Pessoa"
        //ps.usuario();
        //ps.idade();
        //ps.seuSexo();
        //ps.statusCliente();

        Logar lg = new Logar();
        lg.criarLogin();
        lg.Codigo();
        
    }
}
