/**
 * Clasa principală a programului.
 * Demonstrează utilizarea metodelor din clasa InstrumenteStringuri.
 */
public class Main {

    public static void main(String[] args) {

        // Declarăm un text care conține spații suplimentare.
        String text = "   Java este un limbaj puternic   ";

        // Normalizăm textul folosind metoda din clasa InstrumenteStringuri.
        String textNormalizat = InstrumenteStringuri.normalizeaza(text);

        System.out.println("=== INSTRUMENTE PENTRU STRINGURI ===");

        // Afișăm textul inițial și textul normalizat.
        System.out.println("Text inițial: \"" + text + "\"");
        System.out.println("Text normalizat: \"" + textNormalizat + "\"");

        // Afișăm lungimea textului normalizat.
        System.out.println("Lungime: " + textNormalizat.length());

        // Numărăm cuvintele din text.
        System.out.println(
            "Număr de cuvinte: "
            + InstrumenteStringuri.numaraCuvinte(textNormalizat)
        );

        // Transformăm textul în majuscule și minuscule.
        System.out.println("Majuscule: " + textNormalizat.toUpperCase());
        System.out.println("Minuscule: " + textNormalizat.toLowerCase());

        // Înlocuim un cuvânt cu altul.
        System.out.println(
            "Înlocuire Java -> Kotlin: "
            + textNormalizat.replace("Java", "Kotlin")
        );

        // Numărăm aparițiile caracterului 'a'.
        System.out.println(
            "Apariții ale caracterului 'a': "
            + InstrumenteStringuri.numaraCaracter(textNormalizat, 'a')
        );

        // Inversăm textul.
        System.out.println(
            "Text inversat: "
            + InstrumenteStringuri.inverseaza(textNormalizat)
        );

        // Verificăm dacă un cuvânt este palindrom.
        String cuvant = "radar";

        System.out.println(
            "Este \"" + cuvant + "\" palindrom? "
            + InstrumenteStringuri.estePalindrom(cuvant)
        );

        // Comparăm două șiruri de caractere, ținând cont de majuscule.
        System.out.println(
            "Comparare cu equals(): "
            + "Java".equals("Java")
        );

        // Comparăm două șiruri fără a ține cont de majuscule.
        System.out.println(
            "Comparare cu equalsIgnoreCase(): "
            + "Java".equalsIgnoreCase("java")
        );
    }
}
