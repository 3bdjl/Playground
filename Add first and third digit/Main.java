import java.util.Scanner;
class Main{
	public static void main (String[] args) 
    {
		Scanner in= new Scanner(System.in);
      	int n=in.nextInt();
        int n_first=n/100;
      	int n_last=n%10;
      	int sum= n_first+ n_last;
      	System.out.println(sum);
    }
}