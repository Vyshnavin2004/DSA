import java .util.Scanner;
class main{
  public static void main(String args[]){
    System.out.println("Enter the input");
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    String word=sc.next();
    char letter=sc.next().charAt(0);
    System.out.println(num);
    System.out.println(word);
    System.out.println(letter);
  }
}
    
