import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Index {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Long> result = new ArrayList<Long>();
        int t = in.nextInt();
        if(t>=1&&t<=10){
        	for(int a0 = 0; a0 < t; a0++){
            	long num = in.nextLong();
            	if(num>=10 && num<=((long)Math.pow(10,12))){
	                long factor = 1;
	                while(num>1){
	                	for(long i = 2 ;i <= num;i++){
	                		if(num%i==0){
	                			num/= i;
	                			if(i>=factor)
	                				factor=i;
	                			break;
	                		}
	                	}
	                }
	                result.add(factor); 
            	}
            }  
        }
        for(int i=0;i<result.size();i++)
    		System.out.println(result.get(i));
    }
}
