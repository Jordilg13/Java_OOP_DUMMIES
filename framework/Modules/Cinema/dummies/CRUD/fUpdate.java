package OOP.framework.Modules.Cinema.dummies.CRUD;

import javax.swing.JOptionPane;

import OOP.framework.Modules.Cinema.Classes.DocumentaryFilm;
import OOP.framework.Modules.Cinema.Classes.Film;
import OOP.framework.Modules.Cinema.Classes.FootballMatch;
import OOP.framework.Modules.Cinema.Classes.Singleton;
import OOP.framework.Modules.Cinema.dummies.functions_find_dummies;
import OOP.framework.Modules.Cinema.dummies.functions_showings_dummies;
import OOP.framework.Tools.menu_constants;
import OOP.framework.Tools.languages.SingletonLang;

public class fUpdate {
	public static void update(int chosen) {
		switch (chosen) {
		case menu_constants.FILM:
			updateFilm();
			break;
		case menu_constants.DOCUMENTARY_FILM:
			updateDFilm();
			break;
		case menu_constants.FOOTBALL_MATCH:
			updateFMatch();
			break;
		default:
			break;
		}
	}
	
	public static void updateFilm () {
		int location1 = -1;
		Film a1 = new Film();
		
		if(Singleton.FilmArray.isEmpty())
			JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("emptyarray"), "Error", JOptionPane.ERROR_MESSAGE);
		else{
			a1 = functions_showings_dummies.askFilmID();
			location1 = functions_find_dummies.findFilm(a1);
			if (location1 != -1) {
				a1 = Singleton.FilmArray.get(location1);
				functions_showings_dummies.setChange(a1);
				Singleton.FilmArray.set(location1, a1);
			} else {
				JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("0results"), "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	public static void updateDFilm () {
		int location1 = -1;
		DocumentaryFilm a1 = new DocumentaryFilm();
		
		if(Singleton.DFilmArray.isEmpty())
			JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("emptyarray"), "Error", JOptionPane.ERROR_MESSAGE);
		else{
			a1 = functions_showings_dummies.askDFilmID();
			location1 = functions_find_dummies.findDFilm(a1);
			if (location1 != -1) {
				a1 = Singleton.DFilmArray.get(location1);
				functions_showings_dummies.setChange(a1);
				Singleton.DFilmArray.set(location1, a1);
			} else {
				JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("0results"), "", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	public static void updateFMatch () {
		int location1 = -1;
		FootballMatch a1 = new FootballMatch();
		if(Singleton.FMatchArray.isEmpty())
			JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("emptyarray"), "Error", JOptionPane.ERROR_MESSAGE);
		else{
			a1 = functions_showings_dummies.askFMatchID();
			location1 = functions_find_dummies.findFMatch(a1);
			if (location1 != -1) {
				a1 = Singleton.FMatchArray.get(location1);
				functions_showings_dummies.setChange(a1);
				Singleton.FMatchArray.set(location1, a1);
			} else {
				JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("0results"), "", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	
	
}
