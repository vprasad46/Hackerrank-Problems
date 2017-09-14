import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Index {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        ArrayList<Long> result = new ArrayList<Long>();
        if(t>=1&&t<=10000){
	        for(int a0 = 0; a0 < t; a0++){
	        	int n = in.nextInt();
	        	if(n>=1 && n<=1000000000){
	        		long sum = 0;
	        		for(int i =0;i<n;i++){
	        			if(i%3==0||i%5==0){
	        				sum += i; 
	        			}
	        		}
	        		result.add(sum);
	        	}
	        }
	        
	        for(int i=0;i< result.size();i++)
	        	System.out.println(result.get(i));
        }
    }
}
