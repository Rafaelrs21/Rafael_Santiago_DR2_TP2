package q6;

public class NationalityFactory {
    public static FlagColorFactory getFactory(Nationality nationality) {
        switch (nationality) {
            case DUTCH: return new DUTCH();
            case GERMAN: return new GERMAN();
            case BELGIAN: return new BELGIAN();
            case FRENCH: return new FRENCH();
            case ITALIAN: return new ITALIAN();
        }
        return null;
    }
}