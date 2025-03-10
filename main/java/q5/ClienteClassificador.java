package q5;

public class ClienteClassificador {
    public String classificarCliente(int idade, double renda, int compras, String localizacao) {
        if (idade > 60) {
            return classificarClienteSenior(renda, compras);
        } else {
            return classificarClienteJovem(renda, compras);
        }
    }

    private String classificarClienteSenior(double renda, int compras) {
        if (renda > 5000) {
            return (compras > 10) ? "Cliente Premium Sênior" : "Cliente Regular Sênior";
        }
        return "Cliente Sênior Baixa Renda";
    }

    private String classificarClienteJovem(double renda, int compras) {
        if (renda > 7000) {
            return (compras > 20) ? "Cliente Premium Jovem" : "Cliente Regular Jovem";
        }
        return "Cliente Jovem Baixa Renda";
    }
}