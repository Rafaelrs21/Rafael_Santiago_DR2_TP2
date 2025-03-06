package q10;

public class Monitoramento {
    private int contadorAcessos = 0;

    public int contadorAcessos() {
        return contadorAcessos++;
    }

    public int getContadorAcessos() {
        return contadorAcessos();
    }
}
