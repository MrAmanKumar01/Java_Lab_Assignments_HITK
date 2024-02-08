/*
  3. Write a Generic Method that can perform the sorting of any type of data.
*/
package _8_generics_lambda;
public class Q_3 {
	
	public static <T extends Comparable<T>> void sort(T arr[])
	{
		T min;
		int pos;
		for(int i=0;i<arr.length-1;i++)
		{
			min=arr[i];
			pos=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(min.compareTo(arr[j])>0)
				{
					min=arr[j];
					pos=j;
				}
				
			}
			if(pos!=i)
			{
				arr[pos]=arr[i];
				arr[i]=min;
				
			}
		}
	}
	public static void print(Object T[])
	{
		for(int i=0;i<T.length;i++)
		{
			System.out.println(T[i]);
		}		
	}

	public static void main(String[] args) 
	{	
		Integer[] intarray= {69,23,54,9,22,33};
		Double[] doublearray= {77.1,88.2,66.30,98.01,68.05};
		String[] stringarray= {"Meta","Apple","Amazon","Netflix","Google"};
		sort(intarray);
		System.out.println("___Sorted Integer Array___");
		print(intarray);
		sort(doublearray);
		System.out.println("___Sorted Double Array___");
		print(doublearray);
		sort(stringarray);
		System.out.println("___Sorted String Array___");
		print(stringarray);
	}
}
/*
OUTPUT:
----------
___Sorted Integer Array___
9
22
23
33
54
69
___Sorted Double Array___
66.3
68.05
77.1
88.2
98.01
___Sorted String Array___
Amazon
Apple
Google
Meta
Netflix
*/