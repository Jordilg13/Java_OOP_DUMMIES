package OOP.framework.Modules.Cinema.dummies.CRUD;

import javax.swing.JOptionPane;

import OOP.framework.Modules.Cinema.Classes.*;
import OOP.framework.Modules.Cinema.dummies.functions_find_dummies;
import OOP.framework.Tools.menu_constants;
import OOP.framework.Tools.languages.SingletonLang;

public class fDelete {

	public static void delete(int chosen) {
		switch (chosen) {
		case menu_constants.FILM:
			deleteFilm();
			break;

		case menu_constants.DOCUMENTARY_FILM:
			deleteDFilm();
			break;

		case menu_constants.FOOTBALL_MATCH:
			deleteFMatch();
			break;

		default:
			break;
		}
		
	}
	
	public static void deleteFilm() {
		
		int location = -1;
		Film a1 = new Film();
		
		if(Singleton.FilmArray.isEmpty())
			JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("emptyarray"));
		else{
			location = -1;
			
			//per a testejar i no fer un remove(0), primer agafe el objecte de la posicio 0, obting el id i despres el busca, est fet aixi perque la generacio del id es aleatoria i no el puc saber d'altra forma
			a1 = Singleton.FilmArray.get(0);
			location = functions_find_dummies.findFilm(a1);
			if (location != -1)		
				if (JOptionPane.showConfirmDialog(null, "DO you really want to delete it?") == JOptionPane.YES_OPTION) {
					Singleton.FilmArray.remove(location);
				}	
			else 
				JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("0results"));		
		}
	}
	
	public static void deleteDFilm() {
		
		int location = -1;
		DocumentaryFilm a1 = new DocumentaryFilm();
		
		if(Singleton.DFilmArray.isEmpty())
			JOptionPane.showMessageDialog(null, "Empty array");
		else{
			location = -1;
			a1 = Singleton.DFilmArray.get(0);
			location = functions_find_dummies.findDFilm(a1);
			if (location != -1) 
				if (JOptionPane.showConfirmDialog(null, "DO you really want to delete it?") == JOptionPane.YES_OPTION) {
					Singleton.DFilmArray.remove(location);
				}
			else 
				JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("0results"));		
		}
	}

	public static void deleteFMatch() {
	
		int location = -1;
		FootballMatch a1 = new FootballMatch();
		
		if(Singleton.FMatchArray.isEmpty())
			JOptionPane.showMessageDialog(null, "Empty array");
		else{
			location = -1;
			a1 = Singleton.FMatchArray.get(0);
			location = functions_find_dummies.findFMatch(a1);
			if (location != -1) 
				if (JOptionPane.showConfirmDialog(null, "DO you really want to delete it?") == JOptionPane.YES_OPTION) {
					Singleton.FMatchArray.remove(location);
				}
			else 
				JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("0results"));		
		}
	}

	
}