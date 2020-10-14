public class main {
    public static void main (String[] args) {
        Ubung1 objekt= new Ubung1();
        int durchgefallen[];
        int abgerundeten[];
        System.out.println("Ubung 1");
        durchgefallen=objekt.nichtAusreichendeNoten(objekt.Noten);
        System.out.print("Die nichtausreichende Noten: ");
        for(int i=0;i< durchgefallen.length;i++)
            System.out.print(durchgefallen[i]+" ");

        System.out.println();
        System.out.print("Durchschnittsnote:");
        System.out.println(objekt.durchschnittswert(objekt.Noten));

        abgerundeten= objekt.abgerundetenNoten(objekt.Noten);
        System.out.print("Die abgerundeten Noten: ");
        for(int i=0;i< abgerundeten.length;i++)
            System.out.print(abgerundeten[i]+" ");
        System.out.println();

        System.out.print("Die maximale abgerundete Note:");
        int maxAbrundung;
        maxAbrundung= objekt.maxAbgerundet(objekt.Noten);
        System.out.println(maxAbrundung);

        System.out.println();
        System.out.println("Ubung 2");
        Ubung2 objekt2=new Ubung2();
        System.out.println("Minimale Zahl der Array: " + objekt2.minim(objekt2.array));
        System.out.println("Maximale Zahl der Array: " +objekt2.maxim(objekt2.array));
        System.out.println("Minimale Summe von n-1 Zahlen: " +objekt2.minSumme(objekt2.array));
        System.out.println("Minimale Summe von n-1 Zahlen: " +objekt2.maxSumme(objekt2.array));

        System.out.println();
        System.out.println("Ubung 3");
        Ubung3 objekt3=new Ubung3();
        int sum[];
        System.out.print("Die Summe der Zahlen: ");
        sum=objekt3.summe(objekt3.a, objekt3.b);
        for(int i=0;i< sum.length;i++)
            System.out.print(sum[i]);

        System.out.println();
        int dif[];
        System.out.print("Die Differenz der Zahlen: ");
        dif=objekt3.differenz(objekt3.a, objekt3.b);
        for(int i=0;i< dif.length;i++)
            System.out.print(dif[i]);
        System.out.println();

        int mul[];
        System.out.print("Multiplikation: ");
        mul= objekt3.multiplikation(objekt3.a,2);
        for(int i=0;i< mul.length;i++)
            System.out.print(mul[i]);


    }

    }


