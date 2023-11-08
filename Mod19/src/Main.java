public class Main {
    public static void main(String[] args) {
        // Obtém a classe do Cliente
        Class<Cliente> clienteClass = Cliente.class;

        // Obtém a anotação Tabela na classe
        Tabela tabelaAnnotation = clienteClass.getAnnotation(Tabela.class);

        // Verifica se a anotação existe
        if (tabelaAnnotation != null) {
            // Obtém o valor da anotação
            String nomeTabela = tabelaAnnotation.value();

            // Imprime o nome da tabela
            System.out.println("Nome da tabela: " + nomeTabela);
        }
    }
}