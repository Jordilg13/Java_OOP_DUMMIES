package OOP.framework.Tools;
import javax.swing.JOptionPane;

import OOP.framework.Tools.languages.SingletonLang;

// validaint
// validachar
// validafloat
// validastring
// combo
// botons
// validaint_0
// validaint_0_prod
// validaint_0_divi
// validanum(num)
// valida(op, num)

public class Inputs {

	// valida numero int
	public static int validaint(String text, String title) {
		int num = 0;
		String s = "";
		boolean correcto = true;

		do {
			try {
				s = JOptionPane.showInputDialog(null, text, title, JOptionPane.QUESTION_MESSAGE);
				if (s == null) {
					JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("invalidnumber"), SingletonLang.dicc.get("closing"),
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					num = Integer.parseInt(s);
					correcto = true;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("inputvalidnum"), "Error", JOptionPane.ERROR_MESSAGE);
				correcto = false;
			}
		} while (correcto == false);
		return (num);
	} //end validaint	
	//valida caracter
	public static char validachar(String text, String title) {
		char c = 0;
		String s = "";
		boolean correcto=true;

		do{
			try{
				s=JOptionPane.showInputDialog(null, text,title,JOptionPane.QUESTION_MESSAGE);
				if(s==null){
					JOptionPane.showMessageDialog(null,  SingletonLang.dicc.get("invalidchar"),  SingletonLang.dicc.get("closing"),							JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecuci�n
				}else {
					c=s.charAt(0);
					correcto=true;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null,  SingletonLang.dicc.get("inputvalidchar"), "Error",JOptionPane.ERROR_MESSAGE);
				correcto=false;
			}
		}while(correcto==false);
		//System.out.println(c);
		return (c);
	}//end validachar
	//valida num float
	public static float validafloat(String text, String title) {
		float a = 0.0f;
		String s = "";
		boolean correcto=true;

		do{
			try{
				s=JOptionPane.showInputDialog(null, text,title,JOptionPane.QUESTION_MESSAGE);
				if(s==null){
					JOptionPane.showMessageDialog(null,  SingletonLang.dicc.get("invalidfloat"), SingletonLang.dicc.get("closing"),JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecuci�n
				}else {
					a=Float.parseFloat(s);
					correcto=true;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null,  SingletonLang.dicc.get("inputinvalidfloat"), "Error",JOptionPane.ERROR_MESSAGE);
				correcto=false;
			}
		}while(correcto==false);
		return (a);
	}//validafloat
	//valida string
	public static String validastring(String text, String title) {
		String s="";
		boolean correcto=true;

		do{
			try{
				s=JOptionPane.showInputDialog(null, text,title,JOptionPane.QUESTION_MESSAGE);
				correcto=true;
				if (s==null){
					JOptionPane.showMessageDialog(null,  SingletonLang.dicc.get("closing"), SingletonLang.dicc.get("closing"),JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecuci�n
				}
				if(s.equals("")){
					JOptionPane.showMessageDialog(null,  SingletonLang.dicc.get("emptyfield"),"Error",JOptionPane.ERROR_MESSAGE);
					correcto=false;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null,  SingletonLang.dicc.get("inputvalidstr"), "Error",JOptionPane.ERROR_MESSAGE);
				correcto=false;
			}
		}while(correcto==false);
		return (s);
	}//validastring
	//	 validaint_0
	public static float valida0(String op, float num) {
		//		op: 0 = prod
		//			1 = div
		float n = 0;
		switch (op) {
		case "prod": //prod
			n = valid_for_prod(num);
			break;
		case "div": //div
			n = valid_for_div();
			break;
		default:
			System.out.println("Invalid code.");
			break;			
		}
		return n;
	}//valida0		
	// validaint_prod
	public static float valid_for_prod(float num) {
		//return 
		if(num == 0) 
			JOptionPane.showMessageDialog(null, "Any number multiplied by zero is zero.");
		return(num);
	}//validaint_prod
	// validaint_divi
	public static float valid_for_div() {
		float num = 0;
		do{
			num=validafloat("Number: ","Division");
			if(num == 0)
				JOptionPane.showMessageDialog(null, "Is not possible divide by 0.\nChoose other number");
		}while (num==0);

		return num;

	}//validadiv


}
