@Tabela("clientes")
public class Cliente {
    private final int id;
    private final String nome;
    private final String email;

    // Construtor da classe
    public Cliente(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }


    // Método para exibir informações do cliente
    public void mostrarCliente() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
    }

}