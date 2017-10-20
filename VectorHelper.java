import java.util.ArrayList;
import java.util.List;

/**
 * Created by Brahim on 20/10/2017.
 */
public class VectorHelper {
    private List<Flaot> vector = new ArrayList<Float>();

    public List<Flaot> getVector() {
        return vector;
    }

    public void setVector(List<Flaot> vector) {
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
}
