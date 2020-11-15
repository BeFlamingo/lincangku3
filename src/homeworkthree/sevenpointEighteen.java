package homeworkthree;
import java.util.Scanner;
public class sevenpointEighteen {

	public static void sort(double[] n) {
	int i,j;
        //第一个for循环表示第几次循环
		for(i=1;i<n.length;i++) {
        //第二个for循环表示该次循环进行几次比较
			for(j=0;j<n.length-i;j++) {
				if(n[j]>n[j+1]) {
					double temp = n[j];
					n[j] = n[j+1];
					n[j+1] = temp;
			}
		}
		System.out.print(n[j] + " ");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double[] n = new double[10];
		int i;
		for(i=0;i<10;i++)
		{
			n[i] = input.nextDouble();
		}
		sort(n);
	}

}
