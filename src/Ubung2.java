public class Ubung2 {
    int  [] array =new int [] {4,8,3,10,17};

    public int maxim( int [] array){
        int max=0;
        for(int i=0;i< array.length;i++)
            if(max<array[i])
                max=array[i];

        return max;


    }
    public int minim( int [] array){
        int min=10000000;
        for(int i=0;i< array.length;i++)
            if(min>array[i])
                min=array[i];

        return min;


    }
    public int maxSumme(int [] array)
    {   int sum=0;
        int min=minim(array); //in min vom acea cea mai mica valoare din array, vom face suma fara acest element
        for(int i=0;i< array.length;i++)
            if(min!=array[i])
                sum+=array[i];

        return sum;

    }

    public int minSumme(int [] array)
    {   int sum=0;
        int max=maxim(array);//in max vom acea cea mai mare valoare din array, vom face suma fara acest element
        for(int i=0;i< array.length;i++)
            if(max!=array[i])
                sum+=array[i];

        return sum;

    }
}
