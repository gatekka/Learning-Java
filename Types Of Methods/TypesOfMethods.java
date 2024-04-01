public class TypesOfMethods
{
    public static void main(String[] args)
    {
        Support s1 = new Support(); // object instantiation for "Support" class (allows us to gain access to non-static methods)

//      System.out.println(s1.findSquare(5)); // not possible as its a private method (can only be accessed by methods inside "Support" class)
        System.out.println(s1.findCube(5)); // works after an object instantiation for the class (method works because its public)
        System.out.println(Support.findReciprocal(5)); // can be accessed directly from the class without object instantiation (method works because its static)
    }
    
}

class Support
{

    private int findSquare(int x)
    {
        return x*x;
    }
    
    public int findCube(int x)
    {
        return findSquare(x)*x;
    }

    public static double findReciprocal(int x)
    {
        return 1/((double) x);
    }

}