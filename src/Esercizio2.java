public class Esercizio2 {

    /*
    Scrivete un programma che data una parola stampa a schermo il numero di vocali e
consonanti presenti.
• Modificate il programma in modo che funzioni con una frase data. (usate le
funzioni).
     */
    public static void contaVocaliConsonantiParola(String s) {
        int vocali = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vocali++;
            }
        }
        System.out.println("il numero di vocali è: " + vocali);
        System.out.println("il numero di consonanti è: " + (s.length() - vocali));
        s.
    }

}
