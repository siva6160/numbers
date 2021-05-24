package monday;

import java.util.Scanner;

public class loops {

	public static void main(String[] args) {
			int num;
			Scanner sc=new Scanner(System.in);
			num=sc.nextInt();
			
			
			for(int i=1;i<=20;i++){
				System.out.println(num+"X"+ i +"="+num*i);
			}
	}

}
