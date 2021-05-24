package monday;

import java.util.Scanner;

public class loops {

	public static void main(String[] args) {
			int i=1;
			int num;
			Scanner sc=new Scanner(System.in);
			num=sc.nextInt();
			
			
			while(i<=20){
				System.out.println(num+"X"+ i +"="+num*i);
				i++;
			}
	}

}
