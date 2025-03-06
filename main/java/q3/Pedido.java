package q3;

public class Pedido {
    private Cliente cliente;
    public Pedido(Cliente cliente) {
        if(cliente == null) throw new RuntimeException("Cliente nulo");
        this.cliente = cliente;
    }
    public String getNomeCliente() {
        return cliente.getNome();
    }
}
