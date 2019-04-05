public class Test{
  public static void main(String[] args){
    help(5);
    System.out.println();
    help(4);
    System.out.println();
    help(6);
    System.out.println();
    help(7);
    System.out.println();
    help(9);
    System.out.println();
    help(11);
    System.out.println();
    help(3);


  }
  public static void help(int size){
    int p = 0;
    int i = 0;
    int j = size/2;
    while(j<size){
      while(i<size){
        if(i == p){
          System.out.print("\\ ");
        }
        if(i == size-1-p){
          System.out.print("/ ");
        }
        else{
          System.out.print(" ");
        }
        i++;
      }
      p++;
      j++;
      i =0;
      System.out.println();
    }
  }
}
