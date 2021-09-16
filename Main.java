package ld1_191RDB097;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;

public class Main {

	    public static void main(String[] args) {
	        int num;
	        System.out.println("Aigars Soloha   191RDB097");
	        Scanner s = new Scanner(System.in);
	        System.out.println("Ievadiet ciparu:");
	        num = s.nextInt();
	        System.out.println(divisors(num));
	        System.out.print(process(num, divisors(num)));
	    }
	    private enum State {
	        DEFICIENT, PERFECT, ABUNDANT
	    }

	    public static Set<Integer> divisors ( int num){
	        Set<Integer> divisors = new HashSet<>();
	        // fill the set with the correct values
	        for (int i = 1; i < num; i++) {
	            if (num % i == 0) {
	                divisors.add(i);
	            }
	        }
	        return divisors;
	    }

		public static State process(int num, Set<Integer> divisors) {
			// get the set of divisors, sum'em'up and compare with n, return the rellevant
			// State value
			int summa = 0;
			Iterator<Integer> it = divisors.iterator();
			while (it.hasNext()) {
				summa = summa + it.next();
			}
			System.out.println("Summa ir " + summa);
			if (summa == num) {
				return State.PERFECT;
			} else if (summa < num) {
				return  State.DEFICIENT;
			} else
				return State.ABUNDANT;
		}
	}

