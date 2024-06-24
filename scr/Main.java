public class Main {

    public static void main(String[] args) {
        Banco bancoInicial = new Banco(); //instancia novo banco

        bancoInicial.setNome("First Bank"); //insere nome do banco

        Cliente ricardo = new Cliente("Ricardo", bancoInicial);  //criado novo cliente ricardo
        ricardo.setNome("Ricardo Cuba"); //insere o nome do cliente

        Conta ccorrente = new ContaCorrente(ricardo); //instanciada nova conta corrente

        ccorrente.depositar(100); //criado um deposito em conta corrente

        Cliente alisson = new Cliente("Alisson", bancoInicial);  //instancia novo cliente
        Conta cpoupanca = new ContaPoupanca(alisson);  //instanciada nova conta poupanca

        ccorrente.imprimirExtrato();  //imprime extrato de ccorrente ricardo
        cpoupanca.imprimirExtrato();  //imprime estrato de cpoupanca alisson

        ccorrente.transferir(48, cpoupanca);  //faz tranferencia de ccorrente ricardo pra cpoupanca alisson

        ccorrente.imprimirExtrato(); //imprime extrato atualizado de ccorrente ricardo
        cpoupanca.imprimirExtrato(); //imprime extrato atualizado de cpoupanca alisson
        bancoInicial.mostrarClientes(); //mostra lista de clientes

        Cliente carolina = new Cliente("Carolina", bancoInicial);  //instancia novo cliente carolina
        Conta ccorrente2 = new ContaCorrente(carolina); //instancia nova ccorrente2 de carolina
        ccorrente2.imprimirExtrato();  //imprime  ccorrente2 de carolina
        bancoInicial.mostrarClientes(); //mostra lista atualizada de clientes do banco
    }

}

