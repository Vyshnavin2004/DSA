import java.util.Scanner;
class main{
  public static void main(String args[]){
    System.out.println("Enter the input");
    Scanner sc=new Scanner(System.in);
    int grade=sc.nextInt();
    if(grade>=90){
      System.out.println("Grade A");
    }
    else if(grade>=80){
        System.out.println("Grade B");
    }
    else if(grade>=60){
       System.out.println("Grade C");
    }
    else if(grade>=35){
       System.out.println("Grade D");
    }
    else{
       System.out.println("Fail");
    }
  }
}
