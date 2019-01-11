package OOP.framework.Modules.Cinema.dummies.CRUD;

import java.util.Collections;

import javax.swing.JOptionPane;

import Examen_1.Submenu;
import OOP.main_menu;
import OOP.framework.Modules.Cinema.Classes.Singleton;
import OOP.framework.Modules.Cinema.Classes.order.*;
import OOP.framework.Tools.menu_constants;
import OOP.framework.Tools.languages.SingletonLang;
import OOP.framework.Tools.languages.menus;

public class functions_order_dummies {
	
	//private static String[] options = {SingletonLang.dicc.get("prem"),SingletonLang.dicc.get("name"),SingletonLang.dicc.get("roomnum")};
	private static int menu = 0;
	//const
	private static final int PREM = 0;
	private static final int NAME = 1;
	private static final int NUM = 2;
	
	
	public static void changeOrder() {
		switch (main_menu.chosen) {
		case menu_constants.FILM:
			changeOrderFilm();
			break;
		case menu_constants.DOCUMENTARY_FILM:
			changeOrderDFilm();
			break;
		case menu_constants.FOOTBALL_MATCH:
			changeOrderFMatch();
			break;

		default:
			break;
		}
	}
	
	public static void changeOrderFilm() {
		
		if (Singleton.FilmArray.isEmpty()) 
			JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("emptyarray"));
		else {
			menu = Submenu.buttonsbox(SingletonLang.dicc.get("ob"), SingletonLang.dicc.get("order"), menus.options_order());
			switch (menu) {
			case PREM:
				Collections.sort(Singleton.FilmArray,new obFilmPremiere());
				break;
			case NAME:
				Collections.sort(Singleton.FilmArray,new obName());
				break;
			case NUM:
				Collections.sort(Singleton.FilmArray,new obRoomNumber());
				break;
			default:
				Collections.sort(Singleton.FilmArray);
				break;
			}
		}
		
	}
	
	public static void changeOrderDFilm() {
		if (Singleton.DFilmArray.isEmpty()) 
			JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("emptyarray"));
		else {
			menu = Submenu.buttonsbox(SingletonLang.dicc.get("ob"), SingletonLang.dicc.get("order"), menus.options_order());
			switch (menu) {
			//commentat perque no hi ha order per a ordenar documentaryfilms ja que la que hi ha: opFilmPremiere sols serveix per a els Films i vas dir que ferem una de cada
//			case PREM:
//				Collections.sort(Singleton.DFilmArray, new obFilmPremiere());
//				break;
			case NAME:
				Collections.sort(Singleton.DFilmArray, new obName());
				break;
			case NUM:
				Collections.sort(Singleton.DFilmArray, new obRoomNumber());
				break;
			default:
				Collections.sort(Singleton.DFilmArray);
				break;
			}
		}
		
	}
	
	public static void changeOrderFMatch() {
		if (Singleton.FMatchArray.isEmpty()) 
			JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("emptyarray"));
		else {
			menu = Submenu.buttonsbox(SingletonLang.dicc.get("ob"), SingletonLang.dicc.get("order"), menus.options_order());
			switch (menu) {
			// commentat perque no hi ha classe per a ordenar documentaryfilms ja que la que hi ha opFilmPremiere sols serveix per a els Films i vas dir que ferem una de cada
//			case PREM:
//				Collections.sort(Singleton.FMatchArray, new obFilmPremiere());
//				break;
			case NAME:
				Collections.sort(Singleton.FMatchArray, new obName());
				break;
			case NUM:
				Collections.sort(Singleton.FMatchArray, new obRoomNumber());
				break;
			default:
				Collections.sort(Singleton.FMatchArray);
				break;
			}
		}
		
	}
}
