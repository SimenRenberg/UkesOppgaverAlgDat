package Uke1;

public class Metoder {
    /**
     * Seksjon 1.1.2, oppgave 1,2,3
     */
        /*
        1.	Anta at vi har en min-metode, dvs. en metode som finner (og returnerer) posisjonen til den minste verdien i en tabell. Hva ville metodekallet min(a)
        returnere med hvis a er tabellen i Figur 1.1.2? */
            //metoden min(a) ville returnert 6, fordi tallet 1, som er det minste, ligger i indeks 6.
        /*
        2.	Lag en min-metode på samme måte som maks-metoden i Programkode 1.1.2,
        dvs. en metode som finner (og returnerer) posisjonen til den minste verdien i en tabell.
        */
        static int min(int[] a){
            int min = a[0];
            for (int i = 1; i<a.length; i++){
                if(a[i] < a[min]) min = i;
            }
            return min;
        }
	    /*
        3.	Hvis den største verdien forekommer flere ganger, vil maks-metoden returnere posisjonen til den første av dem.
        Hva må endres for at den skal returnere posisjonen til den siste?
        */

	    //Nåverende metode:
        static int maxFirst(int[] a){
            int max = a[0];
            for (int i = 1; i<a.length; i++){
                if(a[i] > a[max]) max = i;
            }
            return max;
        }

        //Gir posisjonen til den siste:
        static int maxLast(int[] a){
            int max = a[0];
            for (int i = 1; i<a.length; i++){
                if(a[i] >= a[max]) max = i;
            }
            return max;
        }

    /**
     * Seksjon 1.1.3, Oppgave 5, 6
     */


}
