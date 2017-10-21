import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class VectorHelper {
    private List <Float> vector = new ArrayList<>();

    public List<Float> getVector() {
        return vector;
    }

    public void setVector(List<Float> vector) {
        this.vector = vector;
    }

    public void sortVerctor()
    {
        boolean bool = true ;

        int i = 0 ;
        float temp = 0 ;

        while ( bool )
        {
            bool = false ;
            while (i < vector.size()-1 )
            {
                if ( vector.get(i) > vector.get(i+1) )
                {
                    temp=vector.get(i);
                    vector.set(i , new Float(vector.get(i+1)));
                    vector.set(i+1 , new Float(temp));
                    bool  =  true ;
                }
                i++;
            }

            i=0;

        }
    }
    public float getMax()
    {
        float max  = vector.get(0) ;
        int taille = vector.size() ;
        for (int i = 1 ; i < taille ; i++ )
            if ( vector.get(i)   >  max )
                max = vector.get(i) ;
        return max;
    }
    public float getMin()
    {

        float     min     =   vector.get(0);
        int       taille  =   vector.size();
        for (int i  =   1;  i   <   taille  ;   i++ )
            if (    vector.get(i)   <  min)
                min =   vector.get(i);
        return min;

    }
    public List<Float> addVectors(List<Float> vector1)throws SizeException
    {   int size = vector.size();
        if(vector.size()!=vector1.size()) throw new SizeException();
        else
        {
            List<Float> resultVector = new ArrayList<>(vector.size());
            for (int i = 0 ; i < size; i++ )
            {
                resultVector.add(new Float(vector.get(i)+vector1.get(i)));
            }
            return resultVector;
        }
    }


    public void Invert () // to invert the victor
    {
        int j=vector.size()-1 ;
        int i=0 ;
        Float temp ;
        for (i=0;i<vector.size()/2;i++)
        {
            temp = vector.get(i);
            vector.set(i,vector.get(j));
            vector.set(j,new Float(temp));
            j--;

        }
    }

    public void Multiplication ( int k) //u chose the number
    {
        for (int i=0;i<vector.size();i++)
        {
            vector.set(i,vector.get(i)*k);
        }
    }

    public void parseText (String text)
    {
        String [] tab = text.split (" ");
        for (int i=0;i<tab.length;i++)

        {
            if ( !tab[i].equals(" ") && tab[i].length()>0){
                vector.add(Float.parseFloat(tab[i]));
            }
        }
    }
    
    public void fillVector()
    {
        Scanner sc=new Scanner(System.in);
        vector.clear();
        int taille=0;

        System.out.print("Taille ?: ");
        taille=sc.nextInt();

        for (int i=0  ; i<taille;i++)
        {
            System.out.print("Vector["+i+"]:");

            vector.add(new Float(sc.next()));
            System.out.println();
        }


    }


    }
    public void printVector()
    {
        System.out.println(vector.toString());
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        VectorHelper Vcc1 = new VectorHelper();
        VectorHelper Vcc2 = new VectorHelper();
        System.out.println("Lecture Vector 1");
        Vcc1.fillVector();
        Vcc1.printVector();
        System.out.println("Max : "+Vcc1.getMax());
        System.out.println("Min : "+Vcc1.getMin());
        System.out.println("Vector1 sorted");
        Vcc1.sortVerctor();
        Vcc1.printVector();
        System.out.println("Vector1 Inverted");
        Vcc1.Invert();
        Vcc1.printVector();

        System.out.println("Lecture Vector 2");
        Vcc2.fillVector();
        Vcc2.printVector();
        System.out.println("Max : "+Vcc2.getMax());
        System.out.println("Min : "+Vcc2.getMin());
        System.out.println("Vector2 sorted");
        Vcc2.sortVerctor();
        Vcc2.printVector();
        System.out.println("Vector2 Inverted");
        Vcc2.Invert();
        Vcc2.printVector();
    }



}

