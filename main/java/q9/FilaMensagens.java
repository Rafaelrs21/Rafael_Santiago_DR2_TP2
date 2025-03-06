package q9;

import java.util.LinkedList;
import java.util.Queue;

public class FilaMensagens {
    private Queue<String> mensagens = new LinkedList<>();

    public String lerMensagem() {
        return mensagens.element();
    }

    public String deletarMensagem() {
        return mensagens.remove();
    }
}