package OOP.framework.Modules.Cinema.dummies.CRUD;

import javax.swing.JOptionPane;

import OOP.framework.Tools.menu_constants;
import OOP.framework.Modules.Cinema.Classes.*;
import OOP.framework.Modules.Cinema.dummies.functions_showings_dummies;
import OOP.framework.Modules.Cinema.dummies.functions_find_dummies;
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
		
		f1 = functions_showings_dummies.askFilmID();
		pos = functions_find_dummies.findFilm(f1);
		if (pos == -1) {
			f1 = functions_showings_dummies.askFilm(f1);
			Singleton.FilmArray.add(f1);
		} else {
			JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("Falreadye"), "Error", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	public static void createDFilm() {
		DocumentaryFilm f1 = new DocumentaryFilm();
		int pos = 0;
		
		f1 = functions_showings_dummies.askDFilmID();
		pos = functions_find_dummies.findDFilm(f1);
		if (pos == -1) {
			f1 = functions_showings_dummies.askDFilm(f1);
			Singleton.DFilmArray.add(f1);
		} else {
			JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("DFalreadye"), "Error", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	public static void createFMatch() {
		FootballMatch f1 = new FootballMatch();
		int pos = 0;
		
		f1 = functions_showings_dummies.askFMatchID();
		pos = functions_find_dummies.findFMatch(f1);
		if (pos == -1) {
			f1 = functions_showings_dummies.askFMatch(f1);
			Singleton.FMatchArray.add(f1);
		} else {
			JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("FMalreadye"), "Error", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
}
