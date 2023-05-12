public class Esercizio1 {

    /*
    l quadrato di un numero N non è altro che la somma dei primi N numeri dispari.
    Per esempio 9 = 5+3+1 e 36 = 11+9+7+5+3+1
    Scrivete un programma che preso in input un numero N restituisce il quadrato di N
    utilizzando questo metodo!
     */
    public static int square(int n) {
        int result = 0;
        for (int i = 0; i <= n-1; i++) {
            result += 2*i + 1;
        }
        return result;
    }


}
