package q12;

public class NotificacaoService {
    public void enviarNotificacao(TipoNotificacao tipo) {
        tipo.enviar();
    }
}
