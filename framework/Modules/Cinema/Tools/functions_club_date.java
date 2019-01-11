package OOP.framework.Modules.Cinema.Tools;

import javax.swing.JOptionPane;

import OOP.framework.Classes.*;
import OOP.framework.Tools.*;
import OOP.framework.Tools.languages.SingletonLang;

public class functions_club_date {
	
	public static Date askPremiereDate() {
		Date iDate = null;
		String idate = "";
		boolean right = false;
		 	
		do {
			idate = Inputs.validastring(SingletonLang.dicc.get("inputinitialdate"), SingletonLang.dicc.get("initialdate"));
			right = Validata.date(idate);
			if (right) {				
				iDate = new Date(idate);
				right = iDate.checkDate();
			}
		} while (!right);
			
		return iDate;
	}
//	public static Date askFinalDate(Date initialdate) {
//		Date fDate = null;
//		String fdate = "";
//		boolean result = false;
//		
//		do {
//			fdate = Inputs.validastring("Input the final date.", "Final Date");
//			result = Validata.date(fdate);
//			if (result) {
//				fDate = new Date(fdate);
//				result = fDate.checkDate();
//				if (result) {
//					//213 
//					System.out.println(initialdate.diffDate(fDate)+" sdfs");
//					if (initialdate.diffDate(fDate) > 213) {
//						JOptionPane.showMessageDialog(null, "The season can't be longer than 7 months (305 days)");
//						result = false;
//					}
//				}
//			}
//		} while (!result);
//		
//		return fDate;
//	}
	public static Date AskLastEmision(Date prem) {
		Date le = null;
		boolean end = false;
		int days = 0;
		
		do {
			le = new Date(functions_club_data.date(SingletonLang.dicc.get("inputlastemi")));
			days = prem.diffDate(le);
			if (le.checkDate() && days < 30) 
				end = true;
			else {
				JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("30daysprem"));
			}
			
		} while (!end);
		
		
		return le;
	}
}
















