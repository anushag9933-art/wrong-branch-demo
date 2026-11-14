public class poly {

    public int add(int a , int b)
    {
        return a+b;
    }

    public int add(int a , int b , int c , int d )

    {
        return a + b+ c + d;
    }
     
  public static void main(String[] args) {
       poly p = new poly();
       System.out.println(p.add (10, 20));
       System.out.println(p.add(10,20,30 , 40));

  }   
} 