package OOP.framework.Tools;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import OOP.main_menu;

public class Format {
	public static String formatdecimal(float number, int ndec) {
		DecimalFormat nformat = null;
		switch (ndec) {
		default:
			nformat = new DecimalFormat(".0");
			break;
		case 2:
			nformat = new DecimalFormat(".00");
			break;
		case 3:
			nformat = new DecimalFormat(".000");
			break;
		}	
		return nformat.format(number);
	}
	
	public static String formatCurrency(float moneda) {
		NumberFormat coin = null;
		switch (main_menu.settings.getCurrency()) {
			case '$':
				coin = NumberFormat.getCurrencyInstance(Locale.US);// Dolar
				moneda = moneda*1.0844f;
				break;
			case '£':
				coin = NumberFormat.getCurrencyInstance(Locale.UK);	// Libra
				moneda = moneda*0.72686f;
				break;
			case '€':
				coin = NumberFormat.getCurrencyInstance(Locale.FRANCE);	// Euro
				break;
			}
		return coin.format(moneda);
	}
}
