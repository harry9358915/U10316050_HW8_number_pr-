
import java.math.BigDecimal;
import java.util.Scanner;
 class testnumber_pr {
	BigDecimal a1 , b1;
	testnumber_pr(String a,String b){//Calculate the number 
	a1 = new BigDecimal(a);
	b1 = new BigDecimal(b);
	}
	public BigDecimal Add(){//get the result
		return a1.add(b1);
	}
	public BigDecimal Sub(){
		return a1.subtract(b1);
	}
	public BigDecimal mul(){
		return a1.multiply(b1);
	}
	public BigDecimal dev(){
		return a1.divide(b1,100,BigDecimal.ROUND_HALF_UP);
	}
}
public class number_pr{
	public static void main(String args[]){
		String a,b,c;
		int i = 0 ;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the number");
		a=scanner.nextLine();
		System.out.println("Input the number1");
		b=scanner.nextLine();
		System.out.println("1.Add? 2.Sub 3.Mul 4.Dev");
		c=scanner.nextLine();
		testnumber_pr testnumber_pr = new testnumber_pr(a,b);
		switch(c){
			case "1":
				System.out.println("result:"+testnumber_pr.Add());
				break;
			case "2":
				System.out.println("result:"+testnumber_pr.Sub());
				break;
			case "3":
				System.out.println("result:"+testnumber_pr.mul());
				break;
			case "4":
				System.out.println("result:"+testnumber_pr.dev());
				break;
		}
		
		
	}
}
