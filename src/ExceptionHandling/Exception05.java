package ExceptionHandling;
public class Exception05 {
  public static void main(String[] args){
//      try{
//          System.out.println("Herllo");
//          System.exit(0);
//      }finally{
//          System.out.println("hello");
//      }

      System.out.println("Outside");
      System.out.println(add(10));

    double j = 20/0.0;
      System.out.println(j); // infinity
      double k = 20/0.0;
      System.out.println(j-k); // NaN

  }



  static int add(int a){
      try{
          return a;
      }finally{
          return a+20;
      }
  }
}
