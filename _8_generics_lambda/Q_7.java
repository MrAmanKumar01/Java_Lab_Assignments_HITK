/*
7. The Ceasar cipher is a basic encryption technique used by Julius Ceasar to securely communicate with
his generals. Each letter is replaced by another letter N position down the English alphabet. For
example, for a rotation of 5, the letter 'c' would be replaced by an 'h'. In case of a 'z', the alphabet rotates
and it is transformed into a 'd'.Write a methods that return a lambda expression implement a decoder for
the Ceasar cipher where N = 5.
*/

package _8_generics_lambda;
import java.io.*;
interface Caesar
{
	String getCaesar(String plain,int n);
}
class Convert
{
	public String getCipher(Caesar c,String plain,int n)
	{
		return c.getCaesar(plain,n);
	}
	String cipher="";
	char ch;
	int i;
	Caesar decode()
	{
		
		return(plain,n)->{
			for(i=0;i<plain.length();i++)
			{
				ch=plain.charAt(i);
				if(ch>='a'&&ch<='z')
				{
					ch=(char)(ch+n);
					if(ch>'z')
						ch=(char)(ch+'a'-'z'-1);
					cipher=cipher+ch;
				}
				else if(ch>='A'&&ch<='Z')
				{
					ch=(char)(ch+n);
					if(ch>'Z')
						ch=(char)(ch+'A'-'Z'-1);
					cipher=cipher+ch;
				}
				else
					cipher=cipher+ch;
			}
			return cipher;
		};
		
	}
}
public class Q_7 
{
	public static void main(String[] args)throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter plain text : ");
		String plaintext=br.readLine();
		System.out.println("Enter number of characters to be shifted : ");
		int n=Integer.parseInt(br.readLine());
		Convert con=new Convert();
		Caesar cs;
		cs=con.decode();
		String ciphertext=con.getCipher(cs, plaintext, n);
		System.out.println("Cipher text is "+ciphertext);
	}
}
/*
OUTPUT:
--------
Enter plain text : 
AMAN
Enter number of characters to be shifted :
4
Cipher text is EQER
*/
