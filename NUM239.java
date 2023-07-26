/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i =0;i<t ;i++ ){
            int l = sc.nextInt();
            int r = sc.nextInt();
            int count = 0;
            for(int j=l;j<=r;j++){
                 if(j%10==2){
                count++;
            }
            else if (j%10==3) {
                count++;
            }
            else if(j%10==9){
                count++;
            }
            
        }
        System.out.println(count);
    
	}
}
}