import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Cliente  {
    private List<Conta> contas;

    public Cliente() {
        contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void ordenarPorNumero() {
        Collections.sort(contas);
    }

    public void ordenarPorTitular() {
        Collections.sort(contas, new Comparator<Conta>() {
         
        public int compare(Conta c1, Conta c2) {
            return c1.getTitular().compareTo(c2.getTitular());
            }
        });

        
    };
    public void mostrarContas() {
        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }
    }

    

