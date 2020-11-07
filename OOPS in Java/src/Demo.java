class Test
{
  private Test() 
  {
    System.out.println("Hello 1");
  }      
  protected Test(int x) 
  {
    System.out.println(x);
  }      
}

public class Demo extends Test 
{       
  public Demo() 
  {
    super(100);
  }      
  public static void main(String args[])
  {
     Demo d1 = new Demo();
  }
}