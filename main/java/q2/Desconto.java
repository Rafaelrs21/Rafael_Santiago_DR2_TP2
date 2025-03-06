package q2;

public class Desconto {
    public double calcularDesconto(double preco) {
        if(preco == 1000 || preco < 1000){
            return preco * 0.9;
        }else{
            return preco;
        }
    }
}
