package q7;

public class RelatorioService {
    public JSON gerarRelatorio(ArquivoFormato arquivoFormato) {
        switch (arquivoFormato) {
            case PDF: return new PDF(); break;
            case CSV: return new CSV(); break;
            case JSON: return new JSON(); break;
        }
        return null;
    }
}