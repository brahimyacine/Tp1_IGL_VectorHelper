import java.util.ArrayList;
import java.util.List;


public class VectorHelper {
    private List<Float> vector = new ArrayList<Float>();

    public List<Float> getVector() {
        return vector;
    }

    public void setVector(List<Float> vector) {
        this.vector = vector;
    }

    public void sortVerctor()
    {
        boolean bool = true ;

        int i = 0 ,
            j = 0 ;
        float temp = 0 ;

        while ( bool )
        {
            bool = false ;
            while (i < vector.size()-1 )
            {
                if ( vector.get(i) > vector.get(i+1) )
                {
                    temp=vector.get(i);
                    vector.set(i , vector.get(i+1));
                    vector.set(i+1 , temp);
                    bool  =  true ;
                }
            }
            j++;
            i = j ;

        }
    }
     public float getMax()
    {
        int max = vector.get(0) ,
                taille = vector.size() ;
        for (int i = 1 ; i < taille ; i++ )
            if ( vector.get(i)   >  max )
                max = vector.get(i) ;
        return max;
    }
    public float getMin()
    {

        int     min =   vector.get(0),
                taille  =   vector.size();
        for (int i  =   1;  i   <   taille  ;   i++ )
            if (    vector.get(i)   >  min)
                min =   vector.get(i);
        return min;

    }
    public List<Float> addVectors(List<Float> vector1)throws SizeException
    {   int size = vector.size();
        if(vector.size()!=vector1.size()) throw SizeException;
        else
        {
            List<Integer> resultVector = new ArrayList<>(vector.size());
            for (int i = 0 ; i < size; i++ )
            {
                resultVector.set(i,vector.get(i)+vector1.get(i));
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
            vector.set(j,temp);
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



    public static void main(String[] args) {
        List<Float> vector = new ArrayList<Float>();
        float i ;
        i=4;
        vector.add(i);
        i=6;
        vector.add(i);
        i=10;
        vector.add(i);
        VectorHelper Vcc = new VectorHelper();
        Vcc.setVector(vector);
        //Vcc.Invert();
        Vcc.Multiplication(2);
        System.out.println(Vcc.getVector().toString());

    }

 

}

