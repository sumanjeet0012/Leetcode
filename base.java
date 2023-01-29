import java.io.*;
import java.util.*;

public class base
{
	public static int solution(int arr[]){
		int n=arr.length;
		for(int i =0;i<n;i++){
			System.out.print(arr[i]);
		}
		return n;
	}

	public static void main(String[] args)
	{
    	Scanner sc = new Scanner(System.in);
    	int length=sc.nextInt();
    	int arr[] = new int[length];
    	for(int i=0;i<length;i++){
    		arr[i]=sc.nextInt();
    	}
    	int x=solution(arr);
    	sc.close();
	}
}