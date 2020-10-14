public class Ubung1 {
    int  [] Noten =new int [] {30,58,45,23,78,86,98,45,23,67,46,38};

    public int [] nichtAusreichendeNoten(int [] Noten)
    { //parcurg array-ul Noten, iar in cazul in care gasesc un element mai mic decat 40, il voi adauga in noul array nichtAusreichendeNoten
        //pe care la sfarsit il voi returna
       int  [] nichtAusreichend=new int [5] ;
        int j=0;
        for(int i=0;i<Noten.length;i++)
            if(Noten[i]<40)
                nichtAusreichend[j++]=Noten[i];

        return nichtAusreichend;
    }

    public float durchschnittswert(int [] Noten)
    { //vom face suma tuturor elementelor din array-ul Noten, apoi vom imparti suma la nr de elemente
        float sum=0;
        for(int i=0;i<Noten.length;i++)
            sum+=Noten[i];

        return sum/Noten.length;

    }

    public int [] abgerundetenNoten(int [] Noten)
    { // array-ul aberundeten va contine toate notele, in cazul in care acestea se pot rotunji, vor fi adaugate rotunjite
        int  [] abgerundeten=new int [Noten.length] ;
        int multiplu=0;
        for(int i=0;i<Noten.length;i++)
            if(Noten[i]>38) {               //in cazul in care nota este mai mica de 38, nu mai are rost sa fie rotunjita, nota fiind insuficienta
                multiplu=Noten[i];
                while(multiplu%5!=0)        //multiplu va deveni elementul curent, adica nota, in cazul in care nu este multiplu de 5,
                    multiplu++;             // variabila multiplu va creste pana va indeplini conditia
                if(multiplu-Noten[i]<3)     //daca a crescut cu mai putin de 3 unitati, nota va lua valoarea multiplului, in caz contrar ea va ramane aceeasi
                abgerundeten[i] = multiplu;
                else
                    abgerundeten[i]=Noten[i];
            }
        else
            abgerundeten[i]=Noten[i];
        return abgerundeten;
    }

    public int maxAbgerundet(int [] Noten)
    { //vom afla nota maxima care a fost rotunjita
        int max=0;
        int [] abgerundetenNoten=abgerundetenNoten(Noten); //avem array-ul cu toate notele printre care si cele rotunjite
        for(int i=0;i< Noten.length;i++)
            if(abgerundetenNoten[i]!=Noten[i]&&abgerundetenNoten[i]>max)//
                max=abgerundetenNoten[i];

        return max;
    }
}
