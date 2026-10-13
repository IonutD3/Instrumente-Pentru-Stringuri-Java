/**
 * Această clasă conține metode reutilizabile pentru prelucrarea textului.
 * Toate metodele sunt statice, deci pot fi apelate fără a crea un obiect.
 */
public class InstrumenteStringuri {

    /**
     * Elimină spațiile de la începutul și sfârșitul textului
     * și înlocuiește grupurile de spații consecutive cu un singur spațiu.
     *
     * @param text textul care trebuie normalizat
     * @return textul normalizat
     * @throws IllegalArgumentException dacă textul este null
     */
    public static String normalizeaza(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Textul nu poate fi null.");
        }

        return text.trim().replaceAll("\\s+", " ");
    }

    /**
     * Numără de câte ori apare un anumit caracter în text.
     * Nu face diferența între literele mari și cele mici.
     *
     * @param text textul în care se caută caracterul
     * @param cautat caracterul căutat
     * @return numărul de apariții
     */
    public static int numaraCaracter(String text, char cautat) {
        int numar = 0;

        // Transformăm textul în litere mici pentru a ignora diferențele de majuscule.
        for (char caracter : text.toLowerCase().toCharArray()) {
            if (caracter == Character.toLowerCase(cautat)) {
                numar++;
            }
        }

        return numar;
    }

    /**
     * Inversează ordinea caracterelor dintr-un text.
     *
     * @param text textul care trebuie inversat
     * @return textul inversat
     */
    public static String inverseaza(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    /**
     * Verifică dacă un text este palindrom.
     * Ignoră spațiile și diferențele dintre literele mari și cele mici.
     *
     * @param text textul verificat
     * @return true dacă textul este palindrom, altfel false
     */
    public static boolean estePalindrom(String text) {
        // Eliminăm spațiile și transformăm toate literele în litere mici.
        String normalizat = text.replaceAll("\\s+", "").toLowerCase();

        // Comparăm textul cu forma sa inversată.
        return normalizat.equals(
            new StringBuilder(normalizat).reverse().toString()
        );
    }

    /**
     * Numără cuvintele dintr-un text.
     *
     * @param text textul analizat
     * @return numărul de cuvinte
     */
    public static int numaraCuvinte(String text) {
        // Normalizăm textul pentru a elimina spațiile inutile.
        String normalizat = normalizeaza(text);

        // Dacă textul este gol, numărul de cuvinte este zero.
        return normalizat.isEmpty() ? 0 : normalizat.split(" ").length;
    }
}
