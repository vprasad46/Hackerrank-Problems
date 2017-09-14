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
        long cons= (long)(4*Math.pow(10,16));
        if(t>=1&&t<=10000){
        	for(int a0 = 0; a0 < t; a0++){
                long n = in.nextLong();
                if(n>=10&&n<=cons){
                	long  second = 2,sum = 0;
                	for(long i=1;i<n;){
                		if(i%2 ==0)
                			sum+=i;
                		long temp = i;
                		i = second;
                		second+=temp; 
                	}
                	result.add(sum);
                }
            }
        	for(int i=0;i<result.size();i++)
        		System.out.println(result.get(i));
        }
    }
}
