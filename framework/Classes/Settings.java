package OOP.framework.Classes;

import java.util.ArrayList;

import OOP.framework.Modules.Cinema.Classes.*;
import OOP.framework.Modules.Users.Classes.Admin;
import OOP.framework.Modules.Users.Classes.Registred;
import OOP.framework.Tools.languages.SingletonLang;
import OOP.framework.Tools.languages.setLanguage;

	

public class Settings {
	public static final String ENGLISH = "en"; 
	public static final String SPANISH = "es"; 
	public static final String VALENCIA = "va"; 
	
	private String language;
	private int decimal;
	private char currency;
	private String date;
	private boolean dummies;
	
	public Settings(String language, int decimal, char currency, String date, boolean dummies) {
		super();
		this.language = language;
		this.decimal = decimal;
		this.currency = currency;
		this.date = date;
		this.dummies = dummies;
		setLanguage.setLang();
	}
	
	public Settings() {
		this.language = ENGLISH;
		this.date = "dd/mm/yyyy";
		this.currency = '�';
		this.decimal = 2;
		this.dummies = false;
		Singleton.FilmArray = new ArrayList <Film>();
		Singleton.DFilmArray = new ArrayList<DocumentaryFilm>();
		Singleton.FMatchArray = new ArrayList<FootballMatch>();
		
		OOP.framework.Modules.Users.Classes.Singleton.AdminArray = new ArrayList <Admin>();
		OOP.framework.Modules.Users.Classes.Singleton.RegistredArray = new ArrayList <Registred>();
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
		setLanguage.setLang();
		//System.out.println(main_menu.settings.toString());
	}

	public int getDecimal() {
		return decimal;
	}

	public void setDecimal(int decimal) {
		this.decimal = decimal;
	}

	public char getCurrency() {
		return currency;
	}

	public void setCurrency(char currency) {
		this.currency = currency;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the dummies
	 */
	public boolean getDummies() {
		return dummies;
	}

	/**
	 * @param dummies the dummies to set
	 */
	public void setDummies(boolean dummies) {
		this.dummies = dummies;
	}

	@Override
	public String toString() {
		return "Settings \n\n"+SingletonLang.dicc.get("lang")+" = " + language + "\n"+
				SingletonLang.dicc.get("dec")+" = " + decimal + "\n"+
				SingletonLang.dicc.get("currency")+" = " + currency + "\n"+
				SingletonLang.dicc.get("date")+" = " + date+
				"\nDummies = "+dummies+"\n";
	}
	
	
	
	
}
