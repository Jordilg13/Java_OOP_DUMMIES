package OOP.framework.Tools.languages;

import java.util.HashMap;
import java.util.Map;

public class english {

	public static Map<String, String> set() {
		Map<String, String> dicc = new HashMap<String, String>();
		
		//System.out.println("Start");
		//date
		dicc.put("day", "Day");
		dicc.put("month", "Month");
		dicc.put("year", "Year");
		
		//settings
		dicc.put("lang", "Language");
		dicc.put("dec", "Decimal");
		dicc.put("currency", "Currency");
		dicc.put("date", "Date");
		
		//film,documentaryfilm,fmatch
		dicc.put("issdays", "Issuance Days");
		dicc.put("sche", "Schedule");
		dicc.put("prem", "Premiere");
		dicc.put("lemi", "Last Emision");
		dicc.put("price", "Price");
		
		//fmatch
		dicc.put("hour", "Hour");
		dicc.put("mtype", "Match Type");
		
		//showing
		dicc.put("showID", "Showing ID");
		dicc.put("roomnum", "Room Number");
		dicc.put("name", "Name");
		
		//functions
		dicc.put("Falreadye", "The film doesn't exists.");
		dicc.put("DFalreadye", "The documentary film doesn't exists.");
		dicc.put("FMalreadye", "The football match doesn't exists.");
		dicc.put("emptyarray", "The array is empty.");
		dicc.put("0results", "It's not in the array.");
		dicc.put("ob", "Order by");
		dicc.put("order", "Order");
		dicc.put("roomnumdisplayed", "Input the number of the room where the video will be displayed.");
		dicc.put("inputname", "Input the name");
		
		dicc.put("inputdaysfilm", "Input the days when the film will de displayed.\nExample: 'monday,wednesday,friday'");
		dicc.put("addsessionfilm", "Do you want to add another session for the film?");
		
		dicc.put("inputdaysdfilm", "Input the days when the documentary film will de displayed.\nExample: 'monday,wednesday,friday'");
		dicc.put("addsessiondfilm", "Do you want to add another session for the documentary film?");
		
		dicc.put("inputdayfmatch", "Input the day when de football match will de displayed.\nExample: monday");
		dicc.put("fmaddhour", "Specify a hour for the sessions of the football match.");
		
		dicc.put("fatt", "Film atributes");
		dicc.put("att", "Atributes");
		dicc.put("dfatt", "Documentary Film atributes");
		dicc.put("fmatt", "Football Match atributes");
		dicc.put("date", "Date");
		dicc.put("inputhour", "Input the hour.\nFormat: HH:mm");
		dicc.put("invalidhour", "Invalid hour");
		dicc.put("inputID", "Input the ID code.\nFormat: Axxxx -> A=capital letter  x=num(0-9)");
		dicc.put("invalidID", "Invalid ID code");
		dicc.put("champions", "Champions");
		dicc.put("league", "League");
		dicc.put("selecttypematch", "Select the type of match.");
		dicc.put("matchtype", "Match Type");
		dicc.put("inputinitialdate", "Input the initial date");
		dicc.put("initialdate", "Initial Date");
		dicc.put("inputlastemi", "Input the last emision of the film.");
		dicc.put("30daysprem", "The film only can be emitted for 30 days after the premiere.");
		dicc.put("decimalnum", "What number of decimals should the application works in?");
		dicc.put("invalidnumber", "Invalid number");
		dicc.put("closing", "closing...");
		dicc.put("inputvalidnum", "Input a valid number");
		dicc.put("invalidfloat", "Invalid float");
		dicc.put("inputvalidfloat", "Input a valid float");
		dicc.put("invalidchar", "Invalid char");
		dicc.put("inputvalidchar", "Input a valid char");
		dicc.put("inputvalidstr", "Input a valid string");
		dicc.put("emptyfield", "Empty Field");
		dicc.put("incompleteop", "Incomplete operation");
		dicc.put("stillupd","Update any other att?");
		dicc.put("askactualdate","What day is today?(sale day)");
		dicc.put("back", "Back");
		dicc.put("childclass", "What class you want to work in?");
		dicc.put("notemitoday", "This film is not emitted today");
		dicc.put("order","Order");
	
		//menus
		dicc.put("all", "All");
		dicc.put("one", "One");
		
		dicc.put("choseone", "Choose one");
		dicc.put("read", "Read");
			//main
		dicc.put("film", "Film");
		dicc.put("dfilm", "Documentary Film");
		dicc.put("fmatch", "Football Match");
		dicc.put("sett", "Settings");
		dicc.put("exit", "Exit");
		
		dicc.put("create", "Create");
		dicc.put("update", "Update");
		dicc.put("delete", "Delete");
				
		
		//System.out.println("End"); // per a comprovar quan tardava en asignar tots els valors, es instantani
		
		return dicc;
	}
	
}
