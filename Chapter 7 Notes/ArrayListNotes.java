import java.util.ArrayList;

/**
 * Write a description of class ArrayListNotes here.
 *
 * @author mcallaghan
 * @version 9 Jan 2019
 */
public class ArrayListNotes
{
    
    /**
     * Creates and returns an ArrayList of the specified number of integers where each element
     *      is assigned a random value between 1 and range.
     *      
     * @param size the number of Integers to add to the list
     * @param range the range of random values to assign to each element
     * @return the newly created and initialize list
     */
    public static ArrayList<Integer> createRandomIntegerList( int size , int range )
    {
        /**
         * The ArrayList is a Java Generic
         * 
         * We have to specify the type of elements in the list in angle brackets (i.e. <>)
         *     They go after every ArrayList identifier.
         *     
         * Primitives (i.e. int, double) are not classes and cannot be specified as the type of ArrayList.
         *     Instead we use the wrapper classes (i.e. Integer, Double).
         */
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < size; i++)
        {
            int value = (int) (range * Math.random()) + 1;
            
            /**
             * The add method adds the specified object to the end of the list.
             * 
             * Autoboxing
             * 
             * Primitives are automatically converted to thier corresponding wrapper classes.  
             *    Type promotion does not occur. 
             * 
             */
            list.add( value );  // appends an element to the end of the array list
        }
        
        return list;     
        
        
    }
    
    /**
     * Removes even numbers from the specified list
     * @param list the list of numbers to potentially remove
     */
    public static void removeEvens( ArrayList<Integer> list )
    {
        int listSize = list.size();   // returns the number of elements in the list

        for ( int i = 0; i < listSize; i++ )
        {
            int value = list.get(i); // gets a given element at a specified index
            if (value % 2 == 0)
            {
                list.remove( i );  // removes an element from the array list at a given index
                                   // remaining elements in the list shift left
            }
            
            System.out.println(list);
        }
        
    }
    
        /**
     * Removes even numbers from the specified list
     * @param list the list of numbers to potentially remove
     */
    public static void removeEvens2( ArrayList<Integer> list )
    {
      
        for ( int i = 0; i < list.size(); i++ )
        {
            if (list.get(i) % 2 == 0 )
            {
                list.remove( i );
                i--;
            }
        }
        
        System.out.println( list );
    }
    
        /**
     * Removes even numbers from the specified list
     * @param list the list of numbers to potentially remove
     */
    public static void removeEvens3( ArrayList<Integer> list )
    {
      
        for ( int i = list.size() - 1; i >= 0; i-- )
        {
            if (list.get(i) % 2 == 0 )
            {
                list.remove( i );
                
            }
        }
        
        System.out.println( list );
    }
    
    
    public static void main(String[] args)
    {
        ArrayList<Integer> myList = createRandomIntegerList( 10, 20 );
        System.out.println(myList);
        removeEvens3(myList); 
        System.out.println(myList);
        
    }
}