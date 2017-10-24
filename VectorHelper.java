import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * this is a class that gives some methods to help manupulating a vector giving by the
 * user , the user need to enter a string with the numbers that he wants to be inside his
 * ARRAY then he chooses what he want to do with it
 * @author Djellal_and_Brahim
 * @version final
 */
public class VectorHelper {
    /**
     * this is the atribute vector that is filled by the user
     */
    private List <Float> vector = new ArrayList<>();

    /**
     * the constructor of the class VectorHelper
     * @param vector which is used to fill the atribute victor
     */
    public VectorHelper(List<Float> vector) {
        for(int i=0;i<vector.size();i++)

            this.vector.add(vector.get(i));

    }

    /**
     * the constructor with no arguments for the class victorHelper
     */
    public VectorHelper() {

    }

    /**
     * return the victor that will be used by the user
     * he  can manipulate it with the help  of the methodes below
     * @return the victor after filling it by the user
     */
    public List<Float> getVector() {
        return vector;
    }
    /**
     * the setter of the atribute vector
     * this methode is used if the user want to change the existing
     * Array in the atribute with another one using the parameter vector
     * @param vector ' the atribute '
     * @since the first
     */

    public void setVector(List<Float> vector) {
        this.vector = vector;
    }

    /**
     * this methode sort the victor in the atribute filed
     * it used the principle of "trie a bull "
     * so the Array will be sorted from the little to the biggest
     * @author Brahim
     * @since the first
     */
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

    /**
     *
     * @return the bigest element in the atribute victor which is a Float
     */
    public float getMax()
    {
        float max  = vector.get(0) ;
        int taille = vector.size() ;
        for (int i = 1 ; i < taille ; i++ )
            if ( vector.get(i)   >  max )
                max = vector.get(i) ;
        return max;
    }

    /**
     *
     * @return the smallest element in the atribute victor which is a Float
     */
    public float getMin()
    {

        float     min     =   vector.get(0);
        int       taille  =   vector.size();
        for (int i  =   1;  i   <   taille  ;   i++ )
            if (    vector.get(i)   <  min)
                min =   vector.get(i);
        return min;

    }

    /**
     * this methode is used to add two victors
     * @param vector1 the second victor to add because the first is the atribute
     * @return the resulting victor == the addition between the 2 victors
     * @throws SizeException if the sizes of the victors are different
     */
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


    /**
     * invert the elements of the atribute vector
     * @since the second
     * @author DJellal
     */
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

    /**
     * multiplaying all the elements of the victor by the parametere k wich is an integer
     * @param k an integer
     */
    public void Multiplication ( int k) //u chose the number
    {
        for (int i=0;i<vector.size();i++)
        {
            vector.set(i,vector.get(i)*k);
        }
    }

    /**
     * this methode is used to fill the atribute victor with Floats elements
     * the principle is to transform the numbers in the text arguments which is a string
     * to numbers and then fill the ARRAY (parsing == transforming to )
     * @param text
     */
    public void parseText (String text)
    {   vector.clear();
        String [] tab = text.split ("!");
        for (int i=0;i<tab.length;i++)

        {
            if ( !tab[i].equals(" ") && tab[i].length()>0){
                vector.add(Float.parseFloat(tab[i]));
            }
        }
    }

    private static void printMenu(int numMenu)
    {
        switch (numMenu)
        {
            case 1:
                System.out.println("1.Initialisez un tableau");
                System.out.println("2.Exit");
                break;
            case 2:
                System.out.println("1.Afficher le Tableau");
                System.out.println("2.Trier le Tableau");
                System.out.println("3.GetMin");
                System.out.println("4.GetMax");
                System.out.println("5.Invert");
                System.out.println("6.Multiplication");
                System.out.println("7.AddVector");
                System.out.println("8.Réinitialiser le tableau");
                System.out.println("9.Retour");
                break;
            case 3:
                System.out.println("1.Afficher le Tableau Résultant");
                System.out.println("2.Retour");
                break;
        }
    }

    private static void callVectorHelperMethods(int choice, VectorHelper vectorHelper)
    {
        switch (choice)
        {
            case 1:
                System.out.println("Affichage du tableau ");
                vectorHelper.printVector();break;
            case 2:
                vectorHelper.sortVerctor();break;
            case 3:
                System.out.println("La plus petite valeur est : "+ vectorHelper.getMin());break;
            case 4:
                System.out.println("La plus grande valeur est : "+ vectorHelper.getMax());break;
            case 5:
                vectorHelper.Invert();break;
            default:break;
        }
    }
    /**
     * this methode is used to print a vector which containes Floats Elements
     * into the consol log by transforming the victor to a string
     */
    public void printVector()
    {
        System.out.println(vector.toString());
    }

    /**
     * this is the main methode which is used to run the prgrm who use the class and it'smethode below
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome To VectorHelper Class !");
        int choice1 , choice2 , choice3 ;
        VectorHelper vectorHelper1=new VectorHelper();
        VectorHelper vectorHelper2=new VectorHelper();
        List<Float> resultAddVector=new ArrayList<>();
        String tableauPrincipal,tableau2;


        while(true)//Main Menu
        {
            printMenu(1);
            choice1 = sc.nextInt();
            if (choice1 == 2) break;

            System.out.println("Entrez les données de votre tableau:");

            tableauPrincipal =sc.next() ;

            vectorHelper1.parseText(tableauPrincipal);
            while (true) {
                printMenu(2);
                choice2 = sc.nextInt();
                if (choice2 == 9) break;
                if (choice2 == 7) //AddVectors
                {
                    System.out.println("Entrer le deuxieme tableau (sa taille doit etre égale à " + vectorHelper1.getVector().size());

                    tableau2 = sc.next();

                    vectorHelper2.parseText(tableau2);
                    try {
                        resultAddVector = vectorHelper1.addVectors(vectorHelper2.getVector());


                    } catch (SizeException e) {
                        e.printStackTrace();
                    }
                    finally {
                        while (true) {
                            printMenu(3);
                            choice3 = sc.nextInt();
                            if (choice3 != 1) break;
                            System.out.println(resultAddVector.toString());

                        }
                    }

                } else {
                    if (choice2 == 6)//Multiplication
                    {
                        System.out.print("Entrer un entier: ");
                        vectorHelper1.Multiplication(sc.nextInt());
                        System.out.println();
                    } else {
                        if (choice2 == 8)//réinitialiser le tableau
                        {
                            System.out.println("Entrez les données de votre tableau:");

                            tableauPrincipal = sc.next();

                            vectorHelper1.parseText(tableauPrincipal);
                        } else {
                            callVectorHelperMethods(choice2, vectorHelper1);
                        }
                    }
                }

            }


        }
    }



}

