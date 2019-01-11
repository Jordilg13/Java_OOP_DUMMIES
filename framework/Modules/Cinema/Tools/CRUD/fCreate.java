package OOP.framework.Modules.Cinema.Tools.CRUD;

import javax.swing.JOptionPane;

import OOP.framework.Modules.Cinema.Classes.*;
import OOP.framework.Modules.Cinema.Tools.functions_find;
import OOP.framework.Modules.Cinema.Tools.functions_showings;
import OOP.framework.Tools.menu_constants;
import OOP.framework.Tools.languages.SingletonLang;

public class fCreate {
	public static void create(int chosen) {
		switch (chosen) {
		case menu_constants.FILM:
			createFilm();
			break;

		case menu_constants.DOCUMENTARY_FILM:
			createDFilm();
			break;

		case menu_constants.FOOTBALL_MATCH:
			createFMatch();
			break;

		default:
			break;
		}
	}
	
	public static void createFilm() {
		Film f1 = new Film();
		int pos = 0;
		
		f1 = functions_showings.askFilmID();
		pos = functions_find.findFilm(f1);
		if (pos == -1) {
			f1 = functions_showings.askFilm(f1);
			Singleton.FilmArray.add(f1);
		} else {
			JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("Falreadye"), "Error", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	public static void createDFilm() {
		DocumentaryFilm f1 = new DocumentaryFilm();
		int pos = 0;
		
		f1 = functions_showings.askDFilmID();
		pos = functions_find.findDFilm(f1);
		if (pos == -1) {
			f1 = functions_showings.askDFilm(f1);
			Singleton.DFilmArray.add(f1);
		} else {
			JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("DFalreadye"), "Error", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	public static void createFMatch() {
		FootballMatch f1 = new FootballMatch();
		int pos = 0;
		
		f1 = functions_showings.askFMatchID();
		pos = functions_find.findFMatch(f1);
		if (pos == -1) {
			f1 = functions_showings.askFMatch(f1);
			Singleton.FMatchArray.add(f1);
		} else {
			JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("FMalreadye"), "Error", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
}
