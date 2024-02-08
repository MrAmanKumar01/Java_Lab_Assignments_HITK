/*
4. Write a generic method that computes the Second minimum and Second maximum elements of an array
of type T and returns a pair containing the minimum and maximum value.
*/
package _8_generics_lambda;
public class Q_4
{	
	public static<T extends Comparable<T>> String minmax(T arr[])
	{
		T max,min;
		max=min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i].compareTo(max)>0)
				max=arr[i];
			else if(arr[i].compareTo(min)<0)
				min=arr[i];
		}
		String str="Minimum "+min+", Maximum "+max;
		return str;
	}
	public static void main(String[] args) 
	{
		Integer[] intarray= {77,88,69,78,86};
		String s=minmax(intarray);
		System.out.println(s);
	}
}

/*
OUTPUT:
---------
Minimum 69, Maximum 88
*/