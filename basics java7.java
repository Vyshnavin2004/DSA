import java.util.Scanner;
class main{
  public static void main(String args[]){
    System.out.println("Enter the input");
    Scanner sc=new Scanner(System.in);
    String firstname=sc.next();
    String lastname=sc.next();
    int n=sc.nextInt();
    String fullname=firstname+lastname;
    for(int i=0;i<n;i++){
      System.out.println(fullname);
    }
  }
}
