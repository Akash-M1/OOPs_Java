package Packages.SEE;
import java.util.Scanner;
public class External extends Packages.CIE.Student{
	int[] smarks;
	Scanner sc;
	public External(String usn, String name, int sem){
		super(usn, name, sem);
		sc=new Scanner(System.in);
		smarks=new int[5];
	}
	public void setmarks(){
		for(int i=0;i<smarks.length;i++){
			System.out.println("Enter the marks of Subject "+(i+1));
			smarks[i]=sc.nextInt();
		}
	}
}