import java.util.Scanner;
class main{
  public static void main(String args[]){
    System.out.println("Enter the input");
    Scanner sc=new Scanner(System.in);
    int angle=sc.nextInt();
    int sum=angle+angle+angle;
    if(sum==180){
      System.out.println("Triangle can be formed");
    }
    else{
        System.out.println("Triangle can't be formed");
    }
  }
}
