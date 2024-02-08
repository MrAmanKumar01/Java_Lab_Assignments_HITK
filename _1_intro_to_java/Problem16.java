/*
ProblemNo_1.10)For a certain electrical circuit with an inductance L and resistance R, the damped natural
frequency is given by:

Frequency = √ [( 1 / L*C ) – ( R^2/4*C^2 )]

It is desired to study the variations of the frequency with C (capacitance). Write a
program to calculate the frequency of difference values of C starting 0.01 to 0.1 in steps
of 0.01.
*/

package _1_intro_to_java;

public class Problem16 {

	  public static void main(String[] args) {
	    double inductance = 1.0;
	    double resistance = 10.0;

	    double[] capacitances = new double[10];
	    double[] frequencies = new double[10];
	    for (int i = 0; i < 10; i++) {
	      capacitances[i] = 0.01 + (i * 0.01);

	      frequencies[i] = Math.sqrt(Math.abs((1 / (inductance * capacitances[i]))
	        - ((resistance * resistance) / (4 * capacitances[i] * capacitances[i]))));
	    }

	    System.out.println("Capacitance (F) | Frequency (Hz)");
	    System.out.println("----------------|----------------");
	    for (int i = 0; i < 10; i++) {
	      System.out.println(capacitances[i] + " | " + frequencies[i]);
	    }
	  }
	}

/*

OUTPUT:
---------
Capacitance (F) | Frequency (Hz)
----------------|----------------
0.01 | 499.8999899979995
0.02 | 249.899979991996
0.03 | 166.56663664865314
0.04 | 124.89995996796796
0.05 | 99.89994994993741
0.060000000000000005 | 83.23327326122514
0.06999999999999999 | 71.3285013303996
0.08 | 62.39991987174343
0.09 | 55.45546539319013
0.09999999999999999 | 49.8998997994986 

*/