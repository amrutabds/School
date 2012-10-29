
package learn.coreJava.seq;

import java.io.*;
import javax.swing.JOptionPane;

class fibb
{

public static void main(String[] args)throws IOException
{

int[] fib=new int[100];
fib[0]=0;
fib[1]=1;
int num;
int i;

num=Integer.parseInt(JOptionPane.showInputDialog("Enter Number:"));

if(num>1)
{

for(i=2;i<=num;i++)
{

fib[i]=fib[i-1]+fib[i-2];
}
}

String str="";
for(i=0;i<num;i++)
str=str + " " +fib[i];

JOptionPane.showMessageDialog(null, str);


}

}