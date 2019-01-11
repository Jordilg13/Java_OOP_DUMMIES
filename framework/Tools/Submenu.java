package OOP.framework.Tools;

import javax.swing.JOptionPane;

import OOP.framework.Tools.languages.SingletonLang;

public class Submenu {
	// combo
	public static String combobox(String text, String title, String[] options) {
		String selection = (String) JOptionPane.showInputDialog(
				   null,
				   text,
				   title,
				   JOptionPane.QUESTION_MESSAGE,
				   null,  // null para icono defecto
				   options,
				   options[0]);
				 
		if(selection==null)
			JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("incompleteop"), SingletonLang.dicc.get("closing"),JOptionPane.INFORMATION_MESSAGE);
//			else
//				JOptionPane.showMessageDialog(null,"The user chosed "+seleccion,"Closeing ...",JOptionPane.INFORMATION_MESSAGE);
		return (selection.toString());
	}//combo
	// botons
	public static int buttonsbox(String text, String title, String[] options) {
			int selection  =  JOptionPane.showOptionDialog(
					null,
					text,
					title,
					0,
					JOptionPane.QUESTION_MESSAGE,
					null,
					options, 
					options[0]);
			
			return (selection);
		}//buttonsbox

}
