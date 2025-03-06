package q12;

public class NotificacaoService {
    public void enviarNotificacao(TipoNotificacao tipo) {
        switch (tipo) {
            case ENVIADA: System.out.println("Mensagem enviada com sucesso"); break;
            default:
                throw new IllegalArgumentException("Tipo de notificação desconhecido");
        }
    }
}
