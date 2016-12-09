package hand.Exam_12808_20161209_2;

import java.io.InputStream;
import java.util.Scanner;

public class CalculateTax {

	public static double test(double saraly){
		//num是纳税所得额
		double num = saraly-3500;
		
		if(num<=1500&&num>0){
			return num*0.03;
		}else if(1500<num&&num<=4500){
			return num*0.1;
		}else if(4500<num&&num<=9000){
			return num*0.2;
		}else if(9000<num&&num<=35000){
			return num*0.25;
		}else if(35000<num&&num<=55000){
			return num*0.3;
		}else if(55000<num&&num<=80000){
			return num*0.35;
		}else if(num>80000){
			return num*0.45;
		}else{
			return 0;
		}
	}
	public static void main(String[] args) {
		//阻塞循环
		while(true){
			Scanner scan = new Scanner(System.in);
			System.out.print("请输入工资：");
			double salary = scan.nextDouble();
			double num = test(salary);
			System.out.println(num);
		}
	}
	
}
