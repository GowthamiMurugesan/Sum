import java.util.*;
public class Sum {

	public static void main(String[] args) {
Scanner in=new Scanner(System.in);
		int n;
n=in.nextInt();
int sum=0;
while(n!=0){
	int b=n%10;
	int c=b*b;
	n=n/10;
	sum=sum+c;
}
System.out.println(sum);
	}

}
