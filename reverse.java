import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter the input");
        Scanner sc=new Scanner(System.in);
        int rev=0;
        int n=sc.nextInt();
        while(n>0){
            int d=n%10;
            rev=rev*10+(d);
            n=n/10;
        }
    System.out.println(rev);
    }
}
