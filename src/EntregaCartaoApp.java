import br.com.dio.poo.model.Cliente;
import br.com.dio.poo.model.Endereco;

import java.util.ArrayList;

public class EntregaCartaoApp {

    public static void main(String[] args) {

        Endereco endereco = new Endereco(); //Dados dos endereços.
        endereco.cep = "000000000";
        Cliente cliente = new Cliente(); // Dados do cliente.

        try {
            cliente.adicionaEndereco(endereco);
            System.out.println("Endereço adicionado com sucesso!!!");
        } catch (Exception e) {
            System.err.println("Houve um erro a adicionar endereço: " + e.getMessage());
        }
    }
}
