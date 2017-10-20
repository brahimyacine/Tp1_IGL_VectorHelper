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
        int i = 0;
        int j = 0 ;
        Float temp ;
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


    public void Invert ()
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

    public void Multiplication ( int k)
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

