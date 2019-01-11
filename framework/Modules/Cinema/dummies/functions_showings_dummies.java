package OOP.framework.Modules.Cinema.dummies;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import OOP.framework.Classes.Date;
import OOP.framework.Modules.Cinema.Classes.DocumentaryFilm;
import OOP.framework.Modules.Cinema.Classes.Film;
import OOP.framework.Modules.Cinema.Classes.FootballMatch;
import OOP.framework.Modules.Cinema.Classes.Showing;
import OOP.framework.Modules.Cinema.Classes.Singleton;
import OOP.framework.Tools.Submenu;
import OOP.framework.Tools.languages.SingletonLang;

public class functions_showings_dummies {
	//film
	public static Film askFilm(Film a1) {
		@SuppressWarnings("serial")
		ArrayList<String> sche = new ArrayList<String>() {{
			add("16:00");
			add("18:00");
		}};
		
		return new Film(a1.getShowing_ID(),13,"Room4","monday,wednesday",sche,new Date("02/12/2018"),new Date("22/12/2018"));
	}
	
	public static Film askFilmID() {
		//Singleton.showing_ID = "A"+ (int) ((Math.random() * ((9999 - 0000) + 1)) + 0000);
		Singleton.showing_ID = "A2222";
		return new Film(Singleton.showing_ID);
	}
	
	public static void setFilmID (Showing s1){
		int pos = -1;
		Film f1 = new Film();
		
		f1 = askFilmID();
		pos = functions_find_dummies.findFilm(f1);
		if (pos != -1) {
			JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("Falreadye"));
		}else {
			s1.setShowing_ID(Singleton.showing_ID);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	//documentary film
	public static DocumentaryFilm askDFilm(DocumentaryFilm a1) {
		@SuppressWarnings("serial")
		ArrayList<String> sche = new ArrayList<String>() {{
			add("16:00");
			add("18:00");
		}};				
		
		return new DocumentaryFilm(a1.getShowing_ID(),13,"Room4","monday,wednesday",sche,new Date("02/12/2018"),new Date("22/12/2018"));
	}
	public static DocumentaryFilm askDFilmID() {
		Singleton.showing_ID = "A"+ (int) ((Math.random() * ((9999 - 0000) + 1)) + 0000);
		return new DocumentaryFilm(Singleton.showing_ID);
	}
	public static void setDFilmID (Showing s1){
		int pos = -1;
		DocumentaryFilm f1 = new DocumentaryFilm();
		
		f1 = askDFilmID();
		pos = functions_find_dummies.findDFilm(f1);
		if (pos != -1) {
			JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("DFalreadye"));
		}else {
			s1.setShowing_ID(Singleton.showing_ID);
		}
	}
	
	//football match
	public static FootballMatch askFMatch(FootballMatch a1) {
		return new FootballMatch(a1.getShowing_ID(),13,"Room4","monday","20:45","Champions");
	}
	public static FootballMatch askFMatchID() {
		Singleton.showing_ID = "A"+ (int) ((Math.random() * ((9999 - 0000) + 1)) + 0000);
		return new FootballMatch(Singleton.showing_ID);
	}
	public static void setFMatchID (Showing s1){
		int pos = -1;
		FootballMatch f1 = new FootballMatch();
		
		f1 = askFMatchID();
		pos = functions_find_dummies.findFMatch(f1);
		if (pos != -1) {
			JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("FMalreadye"));
		}else {
			s1.setShowing_ID(Singleton.showing_ID);
		}
	}
	
	@SuppressWarnings("serial")
	public static void setChange(Showing showing1) {
		//options
				String[] film_att = {SingletonLang.dicc.get("showID"),SingletonLang.dicc.get("roomnum"), SingletonLang.dicc.get("name"), SingletonLang.dicc.get("issdays"), SingletonLang.dicc.get("sche"), SingletonLang.dicc.get("prem"), SingletonLang.dicc.get("lemi")};
				String[] dfilm_att = {SingletonLang.dicc.get("showID"),SingletonLang.dicc.get("roomnum"), SingletonLang.dicc.get("name"), SingletonLang.dicc.get("issdays"), SingletonLang.dicc.get("sche"), SingletonLang.dicc.get("prem"), SingletonLang.dicc.get("lemi")};
				String[] fm_att = {SingletonLang.dicc.get("showID"),SingletonLang.dicc.get("roomnum"), SingletonLang.dicc.get("name"), SingletonLang.dicc.get("issdays"), SingletonLang.dicc.get("hour"),SingletonLang.dicc.get("mtype")};
				SingletonLang.dicc.get("roomnum");
				//constants
				final int SHOWING_ID = 0;
				final int ROOM_NUMBER = 1;
				final int NAME = 2;
				final int ISSUANCE_DAYS = 3;
				final int SCHEDULE = 4;
				final int PREMIERE = 5;
				final int LAST_EMISION = 6;
				
				final int HOUR = 4;
				final int MATCH_TYPE = 5;


				if (showing1 instanceof Film) {
					//boolean ng = false;
					
					switch (Submenu.buttonsbox(SingletonLang.dicc.get("fatt"), SingletonLang.dicc.get("att"), film_att)) {
					case SHOWING_ID:
						((Film)showing1).setShowing_ID("A"+ (int) ((Math.random() * ((9999 - 0000) + 1)) + 0000));
						break;
					case ROOM_NUMBER:
						((Film)showing1).setRoom_number((int) ((Math.random() * ((0 - 10) + 1)) + 0));						
						break;
					case NAME:
						((Film)showing1).setName("Room");
						break;
					case ISSUANCE_DAYS:
						((Film)showing1).setIssuance_days("monday,friday");
						
						break;
					case SCHEDULE:
						((Film)showing1).setSchedule( new ArrayList<String>() {{
							add("16:00");
							add("18:00");
						}});
						break;
					case PREMIERE:
						((Film)showing1).setPremiere(new Date("02/12/2018"));
						
						break;
					case LAST_EMISION:
						((Film)showing1).setLastEmision(new Date("22/12/2018"));
						break;
						
					default:
						break;
					}

				} else if (showing1 instanceof DocumentaryFilm) {
					switch (Submenu.buttonsbox(SingletonLang.dicc.get("dfatt"), SingletonLang.dicc.get("att"), dfilm_att)) {
					case SHOWING_ID:
						((DocumentaryFilm)showing1).setShowing_ID("A"+ (int) ((Math.random() * ((9999 - 0000) + 1)) + 0000));
						break;
					case ROOM_NUMBER:
						((DocumentaryFilm)showing1).setRoom_number((int) ((Math.random() * ((0 - 10) + 1)) + 0));
						break;
					case NAME:
						((DocumentaryFilm)showing1).setName("Room");
						break;
					case ISSUANCE_DAYS:
						((DocumentaryFilm)showing1).setIssuance_days("monday,friday");						
						break;
					case SCHEDULE:
						((DocumentaryFilm)showing1).setSchedule( new ArrayList<String>() {{
							add("16:00");
							add("18:00");
						}});
						
						break;
					case PREMIERE:
						((DocumentaryFilm)showing1).setPremiere(new Date("02/12/2018"));
						
						break;
					case LAST_EMISION:
						((DocumentaryFilm)showing1).setLastEmision(new Date("22/12/2018"));
						break;

					default:
						break;
					}
				} else if (showing1 instanceof FootballMatch) {
					switch (Submenu.buttonsbox(SingletonLang.dicc.get("fmatt"), SingletonLang.dicc.get("att"), fm_att)) {
					case SHOWING_ID:
						((FootballMatch)showing1).setShowing_ID("A"+ (int) ((Math.random() * ((9999 - 0000) + 1)) + 0000));
						break;
					case ROOM_NUMBER:
						((FootballMatch)showing1).setRoom_number((int) ((Math.random() * ((0 - 10) + 1)) + 0));
						break;
					case ISSUANCE_DAYS:
						((FootballMatch)showing1).setIssuance_days("monday");	
						break;
					case HOUR:
						((FootballMatch)showing1).setHour("20:45");
						break;
					case MATCH_TYPE:
						((FootballMatch)showing1).setMatchType("Champions");
						break;
					default:
						break;
					}





				}
		}
}
