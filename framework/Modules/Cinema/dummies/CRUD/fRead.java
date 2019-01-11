package OOP.framework.Modules.Cinema.dummies.CRUD;

import javax.swing.JOptionPane;

import Examen_1.Submenu;
import OOP.framework.Modules.Cinema.Classes.DocumentaryFilm;
import OOP.framework.Modules.Cinema.Classes.Film;
import OOP.framework.Modules.Cinema.Classes.FootballMatch;
import OOP.framework.Modules.Cinema.Classes.Singleton;
import OOP.framework.Modules.Cinema.dummies.functions_find_dummies;
import OOP.framework.Tools.menu_constants;
import OOP.framework.Tools.languages.SingletonLang;

public class fRead {

	static String[] options = {SingletonLang.dicc.get("all"),SingletonLang.dicc.get("one")};
	final static int ALL = 0;
	final static int ONE = 1;

	public static void read(int chosen) {
		switch (chosen) {
		case menu_constants.FILM:
			readFilm();
			break;

		case menu_constants.DOCUMENTARY_FILM:
			readDFilm();
			break;

		case menu_constants.FOOTBALL_MATCH:
			readFMatch();
			break;

		default:
			break;
		}
	}
	
	public static void readFilm() {
		//String[] options = {SingletonLang.dicc.get("all"),SingletonLang.dicc.get("one")};
		int op = 0;
		int pos = -1;
		String str = "";
		Film a1 = null;
		
		
		
		
		if (Singleton.FilmArray.isEmpty())
			JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("emptyarray"), "Error", 0);
		else {
			op = Submenu.buttonsbox(SingletonLang.dicc.get("choseone"), SingletonLang.dicc.get("read"), options);
			switch (op) {
			case ALL:
				for (int i = 0; i <Singleton.FilmArray.size();i++){
					
					str = str + (Singleton.FilmArray.get(i).toString()) + "\n";
				}
				JOptionPane.showMessageDialog(null, str);
				break;
			case ONE:
				a1 = Singleton.FilmArray.get(0);
				pos = functions_find_dummies.findFilm(a1);
				if (pos != -1) {
					a1 = Singleton.FilmArray.get(pos);
					JOptionPane.showMessageDialog(null, a1.toString());
				}else {
					JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("Falreadye"));
				}
				break;

			default:
				break;
			}
		}
	}

	public static void readDFilm() {
		//String[] options = {"All","One"};
		int op = 0;
		int pos = -1;
		String str = "";
		DocumentaryFilm a1 = null;
		
		if (Singleton.DFilmArray.isEmpty())
			JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("emptyarray"), "Error", 0);
		else {
			op = Submenu.buttonsbox(SingletonLang.dicc.get("choseone"), SingletonLang.dicc.get("read"), options);
			switch (op) {
			case ALL:
				for (int i = 0; i <Singleton.DFilmArray.size();i++){
					
					str = str + (Singleton.DFilmArray.get(i).toString()) + "\n";
					
				}
				JOptionPane.showMessageDialog(null, str);
				break;
			case ONE:
				a1 = Singleton.DFilmArray.get(0);
				pos = functions_find_dummies.findDFilm(a1);
				if (pos != -1) {
					a1 = Singleton.DFilmArray.get(pos);
					JOptionPane.showMessageDialog(null, a1.toString());
				}else {
					JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("DFalreadye"));
				}
				break;

			default:
				break;
			}
		}
	}

	public static void readFMatch() {
		//String[] options = {"All","One"};
		int op = 0;
		int pos = -1;
		String str = "";
		FootballMatch a1 = null;
		
		final int ALL = 0;
		final int ONE = 1;
		
		
		if (Singleton.FMatchArray.isEmpty())
			JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("emptyarray"), "Error", 0);
		else {
			op = Submenu.buttonsbox(SingletonLang.dicc.get("choseone"), SingletonLang.dicc.get("read"), options);
			switch (op) {
			case ALL:
				for (int i = 0; i <Singleton.FMatchArray.size();i++){
					
					str = str + (Singleton.FMatchArray.get(i).toString()) + "\n";	
				}
				JOptionPane.showMessageDialog(null, str);
				break;
			case ONE:
				//agafa el primer perque el id es genera aleatoriament en els dummies i no puc saber que posara
				a1 = Singleton.FMatchArray.get(0);
				pos = functions_find_dummies.findFMatch(a1);
				if (pos != -1) {
					a1 = Singleton.FMatchArray.get(pos);
					JOptionPane.showMessageDialog(null, a1.toString());
				}else {
					JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("FMalreadye"));
				}
				break;

			default:
				break;
			}
		}
	}


	
}
