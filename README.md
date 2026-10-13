# Instrumente pentru Stringuri Java

---

## 🇷🇴 Română

### Descriere

Acest proiect implementează o clasă utilitară Java pentru operații uzuale de prelucrare și analiză a șirurilor de caractere (`String`).

Proiectul urmărește aplicarea conceptelor fundamentale din Java prin metode statice reutilizabile, expresii regulate, manipularea șirurilor de caractere și utilizarea clasei `StringBuilder`.

### Funcționalități

| Metodă | Descriere |
|---|---|
| `normalizeaza()` | Elimină spațiile de la începutul și sfârșitul textului și reduce secvențele de spații consecutive la un singur spațiu. |
| `numaraCaracter()` | Numără aparițiile unui caracter, fără a ține cont de diferențele dintre majuscule și minuscule. |
| `inverseaza()` | Inversează ordinea caracterelor folosind `StringBuilder`. |
| `estePalindrom()` | Verifică dacă un text este palindrom, ignorând spațiile și diferențele dintre majuscule și minuscule. |
| `numaraCuvinte()` | Calculează numărul de cuvinte din textul normalizat. |

### Exemple de utilizare

#### 1. Normalizarea textului

Metoda `normalizeaza()` utilizează `trim()` și `replaceAll()` pentru a elimina spațiile de la capete și a înlocui secvențele de caractere albe cu un singur spațiu.

```java
String text = "   Java este un limbaj puternic   ";

String rezultat = InstrumenteStringuri.normalizeaza(text);

System.out.println(rezultat);
```

Rezultat:

```text
Java este un limbaj puternic
```

Metoda aruncă `IllegalArgumentException` dacă primește `null`.

#### 2. Numărarea caracterelor

Metoda `numaraCaracter()` transformă textul și caracterul căutat în litere mici înainte de comparare.

```java
String text = "Java este un limbaj";

int aparitii = InstrumenteStringuri.numaraCaracter(text, 'a');

System.out.println(aparitii);
```

Rezultat:

```text
3
```

#### 3. Inversarea unui șir

Metoda `inverseaza()` utilizează `StringBuilder.reverse()` pentru a inversa ordinea caracterelor.

```java
String text = "Java";

String rezultat = InstrumenteStringuri.inverseaza(text);

System.out.println(rezultat);
```

Rezultat:

```text
avaJ
```

#### 4. Verificarea palindroamelor

Metoda `estePalindrom()` elimină spațiile, normalizează literele la minuscule și compară textul cu forma sa inversată.

```java
System.out.println(
    InstrumenteStringuri.estePalindrom("radar")
);

System.out.println(
    InstrumenteStringuri.estePalindrom("Java")
);
```

Rezultat:

```text
true
false
```

#### 5. Numărarea cuvintelor

Metoda `numaraCuvinte()` normalizează textul înainte de a determina numărul de cuvinte.

```java
String text = "Java este un limbaj puternic";

int numar = InstrumenteStringuri.numaraCuvinte(text);

System.out.println(numar);
```

Rezultat:

```text
5
```

### Structura proiectului

```text
Instrumente-Pentru-Stringuri-Java/
├── src/
│   ├── Main.java
│   └── InstrumenteStringuri.java
└── README.md
```

- **`Main.java`** – punctul de intrare al aplicației; demonstrează utilizarea metodelor și afișează rezultatele.
- **`InstrumenteStringuri.java`** – conține metodele statice pentru manipularea și analiza textului.

### Tehnologii și concepte

- Java
- `String` și `StringBuilder`
- Metode statice
- Expresii regulate (`Regex`)
- Prelucrarea textului
- Separarea responsabilităților între clase

### Cerințe

- Java Development Kit (JDK) instalat și configurat.
- Un terminal sau un mediu de dezvoltare Java, precum IntelliJ IDEA, Eclipse ori Visual Studio Code.

### Compilare și rulare

Din directorul rădăcină al proiectului, execută:

```bash
javac src/*.java
java -cp src Main
```

### Observații tehnice

- Metodele utilitare sunt statice și pot fi apelate fără a crea o instanță a clasei `InstrumenteStringuri`.
- `String` este imuabil; operațiile de transformare produc noi șiruri de caractere.
- `StringBuilder` este utilizat pentru inversarea textului.
- Expresiile regulate sunt utilizate pentru normalizarea spațiilor și eliminarea spațiilor în verificarea palindroamelor.
- Metoda `normalizeaza()` aruncă `IllegalArgumentException` pentru un argument `null`. Celelalte metode presupun argumente valide și pot genera excepții dacă primesc `null`.
- Numărarea cuvintelor se bazează pe delimitarea prin spații după normalizare.

---

## 🇬🇧 English

### Description

This project implements a Java utility class for common string manipulation and text-processing operations.

It demonstrates fundamental Java concepts through reusable static methods, regular expressions, string manipulation, and the use of `StringBuilder`.

### Features

| Method | Description |
|---|---|
| `normalizeaza()` | Trims leading and trailing whitespace and replaces consecutive whitespace characters with a single space. |
| `numaraCaracter()` | Counts occurrences of a character, ignoring letter case. |
| `inverseaza()` | Reverses a string using `StringBuilder`. |
| `estePalindrom()` | Checks whether a string is a palindrome, ignoring whitespace and letter case. |
| `numaraCuvinte()` | Counts the words in normalized text. |

### Usage Examples

#### 1. Text normalization

The `normalizeaza()` method uses `trim()` and `replaceAll()` to remove surrounding whitespace and collapse consecutive whitespace characters.

```java
String text = "   Java este un limbaj puternic   ";

String rezultat = InstrumenteStringuri.normalizeaza(text);

System.out.println(rezultat);
```

Output:

```text
Java este un limbaj puternic
```

The method throws `IllegalArgumentException` when the input is `null`.

#### 2. Character counting

The `numaraCaracter()` method converts the text and the target character to lowercase before comparison.

```java
String text = "Java este un limbaj";

int count = InstrumenteStringuri.numaraCaracter(text, 'a');

System.out.println(count);
```

Output:

```text
3
```

#### 3. String reversal

The `inverseaza()` method uses `StringBuilder.reverse()` to reverse the character sequence.

```java
String text = "Java";

String rezultat = InstrumenteStringuri.inverseaza(text);

System.out.println(rezultat);
```

Output:

```text
avaJ
```

#### 4. Palindrome detection

The `estePalindrom()` method removes whitespace, converts the text to lowercase, and compares it with its reversed form.

```java
System.out.println(
    InstrumenteStringuri.estePalindrom("radar")
);

System.out.println(
    InstrumenteStringuri.estePalindrom("Java")
);
```

Output:

```text
true
false
```

#### 5. Word counting

The `numaraCuvinte()` method normalizes the input before calculating the number of words.

```java
String text = "Java este un limbaj puternic";

int count = InstrumenteStringuri.numaraCuvinte(text);

System.out.println(count);
```

Output:

```text
5
```

### Project Structure

```text
Instrumente-Pentru-Stringuri-Java/
├── src/
│   ├── Main.java
│   └── InstrumenteStringuri.java
└── README.md
```

- **`Main.java`** – the application entry point; demonstrates the utility methods and displays their results.
- **`InstrumenteStringuri.java`** – contains the static methods for string manipulation and text analysis.

### Technologies and Concepts

- Java
- `String` and `StringBuilder`
- Static methods
- Regular expressions
- Text processing
- Separation of responsibilities between classes

### Requirements

- Java Development Kit (JDK) installed and configured.
- A terminal or Java development environment, such as IntelliJ IDEA, Eclipse, or Visual Studio Code.

### Compilation and Execution

From the project's root directory, run:

```bash
javac src/*.java
java -cp src Main
```

### Technical Notes

- Utility methods are static and can be called without creating an instance of `InstrumenteStringuri`.
- `String` is immutable; transformation operations produce new strings.
- `StringBuilder` is used for string reversal.
- Regular expressions are used to normalize whitespace and remove whitespace during palindrome checks.
- `normalizeaza()` throws `IllegalArgumentException` when its argument is `null`. The other methods assume valid arguments and may throw exceptions when passed `null`.
- Word counting relies on splitting normalized text on spaces.

---

## 👤 Autor / Author

**IonutD**
