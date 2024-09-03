
public class Conta implements Comparable<Conta> {
    private int numero;
    private String titular;
    private double LimiteCredito;
    private double Saldo;
        
    public Conta(int numero, String titular, double limiteCredito, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.LimiteCredito = limiteCredito;
        this.Saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getLimiteCredito() {
        return LimiteCredito;
    }

    public double getSaldo() {
        return Saldo;
    }
    public int compareTo(Conta outraConta) {
        return Integer.compare(this.numero, outraConta.numero);
    }
     public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", titular='" + titular + '\'' +
                ", limiteCredito=" + LimiteCredito +
                ", saldo=" + Saldo +
                '}';
    }
}


