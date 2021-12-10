package Packages.CIE;
import java.util.Scanner;
public class Internals{
	int[] imarks;
	Scanner sc;
	public Internals(){
		sc = new Scanner(System.in);
		imarks = new int[5];
	}
	public void setmarks(){
		for(int i=0;i<imarks.length;i++){
			System.out.println("Enter the marks of Subject "+(i+1));
			imarks[i]=sc.nextInt();
		}
	}
}