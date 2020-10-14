public class Ubung3 {
    // int  [] a =new int [] {1,3,0,0,0,0,0,0,0};
    //int  [] b =new int [] {8,7,0,0,0,0,0,0,0};
    int  [] a =new int [] {7,3,0,0,0,0,0,0,0};
   int  [] b =new int [] {1,4,0,0,0,0,0,0,0};

    public int [] summe(int [] a, int [] b){
        int [] sum= new int[a.length+1];
        int retin=0;
        //vom incepe cu sfarsitul array-ului, in cazul in care suma celor  2 cifre(elemente) ale array-ului, de pe pozitia i este  >=10,
        //  suma[i-1]+=cifra zecilor, iar sum[i] va primi cifra unitatilor
        //parcurgerea se va face de la ultimul element pana la penultimul
        //ultima adunare (i=0) facandu-se cu ajutorul variabilei retin care retine cifra zecilor in cazul in care  adunarea precedenta >=10
        for(int i=a.length-1;i>0;i--) {
            if (a[i] + b[i] >= 10) {
                sum[i - 1] += (a[i] + b[i]) / 10;
                retin = (a[i] + b[i]) / 10;
                sum[i] += (a[i] + b[i]) % 10;
            } else {
                sum[i] += a[i] + b[i];
                retin=0;
            }
            if(i==1)
                sum[0]=a[0]+b[0]+retin;
        }

        return sum;

    }
    public int [] differenz (int [] a, int [] b){
        //vom incepe cu sfarsitul array-ului, in cazul in care  descazutul (copie[i] ) este mai mic decat scazatorul b(i), ne vom imprumuta de la copie[i-1] cu 1
        // array-ul copie va primi elementele din a, pentru nu a modifica array-ul a
        int [] diff= new int [a.length];
        int [] copie=a;
            for(int i=copie.length-1;i>=0;i--) {
                if (copie[i] < b[i]) {
                    diff[i] = copie[i] + 10 - b[i];
                    copie[i - 1]--;

                }
                else
                    diff[i]=copie[i]-b[i];
            }

        return diff;
    }

    public int [] multiplikation(int [] a , int nr){
        //vom incepe cu sfarsitul array-ului, in cazul in care produsul celor  2 cifre(elemente si numar)  este  >=10,
        // mul[i-1]+=cifra zecilor, iar mul[i] va primi cifra unitatilor
        //parcurgerea se va face de la ultimul element pana la penultimul
        //ultima inmultire (i=0) facandu-se cu ajutorul variabilei retin care retine cifra zecilor in cazul in care  inmultirea precedenta >=10
        int []mul = new int [a.length+1];
        int retin=0;
        for(int i=a.length-1;i>0;i--) {
            if (a[i] *nr >= 10) {
                mul[i - 1] += (a[i]*nr) / 10;
                retin = (a[i]*nr) / 10;
                mul[i] += (a[i]*nr) % 10;
            } else {
                mul[i] += a[i] *nr;
                retin=0;
            }
            if(i==1)
                mul[0]=a[0]*nr+retin;
        }

        return mul;


    }
}
