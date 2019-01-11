package OOP.framework.Modules.Cinema.Tools;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import OOP.framework.Classes.Date;
import OOP.framework.Modules.Cinema.Classes.*;
import OOP.framework.Tools.Inputs;
import OOP.framework.Tools.Submenu;
import OOP.framework.Tools.languages.SingletonLang;

public class functions_showings {
	//mother attributes
	private static String[] showing_values(Showing a1) {
		String[] showingval = new String[3];
		
		showingval[0] = a1.getShowing_ID();
		showingval[1] = Integer.toString(Inputs.validaint(SingletonLang.dicc.get("roomnumdisplayed"), SingletonLang.dicc.get("roomnum")));
		showingval[2] = Inputs.validastring(SingletonLang.dicc.get("inputname"), SingletonLang.dicc.get("name"));
		
		return showingval;
	}
	
	
	
	//film
	public static Film askFilm(Film a1) {
		String issuance_days = "";
		String[] showingValues = new String[2];
		ArrayList<String> sche = new ArrayList<String>();
		Date pre,lastE = null;
		
		showingValues = showing_values(a1);
		
		issuance_days = Inputs.validastring(SingletonLang.dicc.get("inputdaysfilm"), SingletonLang.dicc.get("issdays"));
		sche = functions_club_data.scheduleHours(SingletonLang.dicc.get("addsessionfilm"));
		pre = functions_club_date.askPremiereDate();
		lastE = functions_club_date.AskLastEmision(pre);		
		
		return new Film(showingValues[0],Integer.parseInt(showingValues[1]),showingValues[2],issuance_days,sche,pre,lastE);
	}
	
	public static Film askFilmID() {
		Singleton.showing_ID = functions_club_data.IDcode();
		return new Film(Singleton.showing_ID);
	}
	
	public static void setFilmID (Showing s1){
		int pos = -1;
		Film f1 = new Film();
		
		f1 = askFilmID();
		pos = functions_find.findFilm(f1);
		if (pos != -1) {
			JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("Falreadye"));
		}else {
			s1.setShowing_ID(Singleton.showing_ID);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	//documentary film
	public static DocumentaryFilm askDFilm(DocumentaryFilm a1) {
		String issuance_days = "";
		String[] showingValues = new String[2];
		ArrayList<String> sche = new ArrayList<String>();
		Date pre,lastE = null;
		
		showingValues = showing_values(a1);
		
		issuance_days = Inputs.validastring(SingletonLang.dicc.get("inputdaysdfilm"), SingletonLang.dicc.get("issdays"));
		sche = functions_club_data.scheduleHours(SingletonLang.dicc.get("addsessiondfilm"));
		pre = functions_club_date.askPremiereDate();
		lastE = functions_club_date.AskLastEmision(pre);		
		
		return new DocumentaryFilm(showingValues[0],Integer.parseInt(showingValues[1]),showingValues[2],issuance_days,sche,pre,lastE);
	}
	public static DocumentaryFilm askDFilmID() {
		Singleton.showing_ID = functions_club_data.IDcode();
		return new DocumentaryFilm(Singleton.showing_ID);
	}
	public static void setDFilmID (Showing s1){
		int pos = -1;
		DocumentaryFilm f1 = new DocumentaryFilm();
		
		f1 = askDFilmID();
		pos = functions_find.findDFilm(f1);
		if (pos != -1) {
			JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("DFalreadye"));
		}else {
			s1.setShowing_ID(Singleton.showing_ID);
		}
	}
	
	//football match
	public static FootballMatch askFMatch(FootballMatch a1) {
		String hour = "",matchType = "";
		String issuance_days = "";
		String[] showingValues = new String[2];
		
		showingValues = showing_values(a1);
		
		issuance_days = Inputs.validastring(SingletonLang.dicc.get("inputdayfmatch"), SingletonLang.dicc.get("issdays"));	
		JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("fmaddhour"), SingletonLang.dicc.get("hour"), 1);
		hour = functions_club_data.hourMin();
		matchType = functions_club_data.MatchType();
		
		return new FootballMatch(showingValues[0],Integer.parseInt(showingValues[1]),showingValues[2],issuance_days,hour,matchType);
	}
	public static FootballMatch askFMatchID() {
		Singleton.showing_ID = functions_club_data.IDcode();
		return new FootballMatch(Singleton.showing_ID);
	}
	public static void setFMatchID (Showing s1){
		int pos = -1;
		FootballMatch f1 = new FootballMatch();
		
		f1 = askFMatchID();
		pos = functions_find.findFMatch(f1);
		if (pos != -1) {
			JOptionPane.showMessageDialog(null, SingletonLang.dicc.get("FMalreadye"));
		}else {
			s1.setShowing_ID(Singleton.showing_ID);
		}
	}
	
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
						((Film)showing1).setShowing_ID(functions_club_data.IDcode());
						break;
					case ROOM_NUMBER:
						((Film)showing1).setRoom_number(Inputs.validaint(SingletonLang.dicc.get("roomnumdisplayed"), SingletonLang.dicc.get("roomnum")));						
						break;
					case NAME:
						((Film)showing1).setName(functions_club_data.name());
						break;
					case ISSUANCE_DAYS:
						((Film)showing1).setIssuance_days(Inputs.validastring(SingletonLang.dicc.get("inputdaysfilm"), SingletonLang.dicc.get("issdays")));
						
						break;
					case SCHEDULE:
						((Film)showing1).setSchedule(functions_club_data.scheduleHours(SingletonLang.dicc.get("addsessionfilm")));
						
						break;
					case PREMIERE:
						((Film)showing1).setPremiere(functions_club_date.askPremiereDate());
						
						break;
					case LAST_EMISION:
						((Film)showing1).setLastEmision(functions_club_date.AskLastEmision(((Film)showing1).getPremiere()));
						break;
						
					default:
						break;
					}

				} else if (showing1 instanceof DocumentaryFilm) {
					switch (Submenu.buttonsbox(SingletonLang.dicc.get("dfatt"), SingletonLang.dicc.get("att"), dfilm_att)) {
					case SHOWING_ID:
						((DocumentaryFilm)showing1).setShowing_ID(functions_club_data.IDcode());
						break;
					case ROOM_NUMBER:
						((DocumentaryFilm)showing1).setRoom_number(Inputs.validaint(SingletonLang.dicc.get("roomnumdisplayed"), SingletonLang.dicc.get("roomnum")));						
						break;
					case NAME:
						((DocumentaryFilm)showing1).setName(functions_club_data.name());
						break;
					case ISSUANCE_DAYS:
						((DocumentaryFilm)showing1).setIssuance_days(Inputs.validastring(SingletonLang.dicc.get("inputdaysdfilm"), SingletonLang.dicc.get("issdays")));
						
						break;
					case SCHEDULE:
						((DocumentaryFilm)showing1).setSchedule(functions_club_data.scheduleHours(SingletonLang.dicc.get("addsessiondfilm")));
						
						break;
					case PREMIERE:
						((DocumentaryFilm)showing1).setPremiere(functions_club_date.askPremiereDate());
						
						break;
					case LAST_EMISION:
						((DocumentaryFilm)showing1).setLastEmision(functions_club_date.AskLastEmision(((Film)showing1).getPremiere()));
						break;

					default:
						break;
					}
				} else if (showing1 instanceof FootballMatch) {
					switch (Submenu.buttonsbox(SingletonLang.dicc.get("fmatt"), SingletonLang.dicc.get("att"), fm_att)) {
					case SHOWING_ID:
						((FootballMatch)showing1).setShowing_ID(functions_club_data.IDcode());
						break;
					case ROOM_NUMBER:
						((FootballMatch)showing1).setRoom_number(Inputs.validaint(SingletonLang.dicc.get("roomnumdisplayed"), SingletonLang.dicc.get("roomnum")));			
						break;
					case ISSUANCE_DAYS:
						((FootballMatch)showing1).setIssuance_days(Inputs.validastring(SingletonLang.dicc.get("inputdayfmatch"), SingletonLang.dicc.get("issdays")));
						break;
					case HOUR:
						((FootballMatch)showing1).setHour(functions_club_data.hourMin());
						break;
					case MATCH_TYPE:
						((FootballMatch)showing1).setMatchType(functions_club_data.MatchType());
						break;
					default:
						break;
					}





				}
		}
}
