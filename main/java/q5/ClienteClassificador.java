package q5;

public class ClienteClassificador {
    public String classificarCliente(int idade, double renda, int compras, String localizacao) {
        if (idade >= 60 & renda > 7000 & compras > 10) {
            return "Cliente Premium Sênior";
        }if (idade >= 18 & renda > 5000 & compras > 20){
            return "Cliente Premium Jovem";
        }else {
            return "Cliente Baixa renda";
        }
    }
}