package OOP.framework.Tools;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Utils {
	// return the length of an array
	public static int digitsLength(int num) {
		int cont = 0;

		while (num > 0) {
			num = num / 10;
			cont++;
		}
		return cont;
	}

	// digits
	public static ArrayList<Integer> getDigits(int num) {
		int len, rest = 0;
		ArrayList<Integer> digits2 = new ArrayList<Integer>();

		len = Utils.digitsLength(num);
		int[] digits = new int[len]; //array normal per a poder anar restant len i ordenar-ho, i que el numero no ixca al reves

		while (num > 0) {
			rest = (num % 10);
			num = num / 10;
			digits[(len - 1)] = rest;
			len--;
		}
		//pase el int[] a arraylist per a posterior tratament
		for (int i : digits)
		{
			digits2.add(i);
		}
		return digits2;
	}
	public static ArrayList<Integer> getDigits(int num,String type) {
		ArrayList<Integer> digits = new ArrayList<Integer>();

		digits = Utils.getDigits(num);
		ArrayList<Integer> new_digits = new ArrayList<Integer>();

		new_digits = Utils.array_filter(digits, type);

		return new_digits;
	}

	// still doing the operation
	public static boolean keep(String text) {
		int still = JOptionPane.showConfirmDialog(null, text);

		if (still == JOptionPane.OK_OPTION)
			return (true);
		else
			return (false);
	}// still


	// divisors

	public static ArrayList<Integer> getDividers(int num) {

		ArrayList<Integer> dividers = new ArrayList<Integer>();

		for (int i = 0; i < num; i++) {
			if (num%(i+1) == 0) {
				//System.out.println((i+1));
				dividers.add((i+1));
			}
		}

		return dividers;
	}
	public static int getDividers(int num, String op){
		int result = 0;
		ArrayList<Integer> dividers = new ArrayList<Integer>();
		dividers = Utils.getDividers(num);		
		result = Utils.op_with_array(dividers, op);

		return result;

	}

	//operations with arrays
	public static int op_with_array(ArrayList<Integer> arrayy, String op) {	
		int result = 0;

		switch (op) {
		case "sum":
			for (int i = 0; i < arrayy.size(); i++) {
				result += arrayy.get(i);
			}
			break;
		case "prod":
			if (arrayy.size() > 0) {
				result = 1;				
			}

			for (int i = 0; i < arrayy.size(); i++) {
				result *= arrayy.get(i);
			}
			break;
		case "avr":
			result = Utils.op_with_array(arrayy, "sum")/arrayy.size();
			break;

		default:
			break;
		}

		return result;
	}
	public static ArrayList<Integer> array_filter(ArrayList<Integer> arrayy, String filter){
		ArrayList<Integer> result = new ArrayList<Integer>();

		switch (filter) {
		case "pair":
			for (int i = 0; i < arrayy.size(); i++) {
				if (arrayy.get(i)%2 == 0) {
					result.add(arrayy.get(i));
				}
			}
			break;
		case "odd":
			for (int i = 0; i < arrayy.size(); i++) {
				if (arrayy.get(i)%2 != 0) {
					result.add(arrayy.get(i));
				}
			}
			break;
		default:
			break;
		}
		//System.out.println(result);
		return result;		
	}

	public static int[] DateStringToInt(String date) {
		int sdate2[] = new int[3];
		
		sdate2[0] = Integer.parseInt(date.split("/")[0]);
		sdate2[1] = Integer.parseInt(date.split("/")[1]);
		sdate2[2] = Integer.parseInt(date.split("/")[2]);
			
		return sdate2;
	}
}
