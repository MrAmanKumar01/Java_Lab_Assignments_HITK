package _6_exception_handling;

//import java.util.HashSet;
import java.util.Hashtable;

//class NoMatchFoundException extends Exception{
//	NoMatchFoundException(String s){
//		super(s);
//	}
//}

public class Capital {

    public static void main(String[] args) throws NoMatchFoundException {
        Hashtable<String, String> h = new Hashtable<String,String>();
        h.put("India", "Delhi");
        h.put("Russia", "Moscow");
        h.put("Israel", "Jerusalam");
        h.put("Palestine", "Jerusalam");
        h.put("China", "Bezing");
        h.put("Argentina", "Buenos");
        h.put("Bangladesh", "Dhaka");

        for(String country : args) {
            String s = h.get(country);
            try {
                if(s == null)
                    throw new NoMatchFoundException("Country not found");
                else
                    System.out.println(s);
            }catch(NoMatchFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
/*
Delhi
Buenos
Jerusalam
Exception in thread "main" exception.NoMatchFoundException: Country not found
	at javaClassAs/exception.Capital.main(Capital.java:27)
*/
