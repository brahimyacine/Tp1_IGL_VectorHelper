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
        int i = j = 0 ;
        int temp = 0 ;
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

}
