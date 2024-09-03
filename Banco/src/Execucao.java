
public class Execucao {
    public static void main(String[] args) {
        
        Conta conta1 = new Conta(3100, "Breno", 85, 498);
        Conta conta2 = new Conta(1234, "Ana", 645, 564);
        Conta conta3 = new Conta(9630, "Cristian", 8574, 4645);

        
        Cliente cliente = new Cliente();
        cliente.adicionarConta(conta1);
        cliente.adicionarConta(conta2);
        cliente.adicionarConta(conta3);

       
        System.out.println("Contas ordenadas por numero:");
        cliente.ordenarPorNumero();
        cliente.mostrarContas();

       
        System.out.println("\nContas ordenadas por titular:");
        cliente.ordenarPorTitular();
        cliente.mostrarContas();
    }
}
