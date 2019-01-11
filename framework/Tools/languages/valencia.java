package OOP.framework.Tools.languages;

import java.util.HashMap;
import java.util.Map;

public class valencia {
	public static Map<String, String> set() {
		Map<String, String> dicc = new HashMap<String, String>();
		
		//date
		dicc.put("day", "Dia");
		dicc.put("month", "Mes");
		dicc.put("year", "Any");
		
		//settings
		dicc.put("lang", "Idioma");
		dicc.put("dec", "Decimal");
		dicc.put("currency", "Moneda");
		dicc.put("date", "Data");
		
		//film,documentaryfilm,fmatch
		dicc.put("issdays", "Dies de emisio");
		dicc.put("sche", "Horari");
		dicc.put("prem", "Estreno");
		dicc.put("lemi", "Ultima emisio");
		dicc.put("price", "Preu");
		
		//fmatch
		dicc.put("hour", "Hora");
		dicc.put("mtype", "Tipo de partit");
		
		//showing
		dicc.put("showID", "ID de proyeccio");
		dicc.put("roomnum", "Numero de sala");
		dicc.put("name", "Nom");
		
		//functions
		dicc.put("Falreadye", "La pelicula no existeix.");
		dicc.put("DFalreadye", "El documental no existeix.");
		dicc.put("FMalreadye", "El partit no existeix.");
		dicc.put("emptyarray", "El array esta buit.");
		dicc.put("0results", "No es troba en el array.");
		dicc.put("ob", "Ordenar per");
		dicc.put("order", "Ordre");
		dicc.put("roomnumdisplayed", "Introdueix el numero de la sala on es va a proyectar el video.");
		dicc.put("inputname", "Introduix el nom");
		
		dicc.put("inputdaysfilm", "Introdueix els dias en que es va a emitir la pelicula.\nEj: 'dilluns,dimarts,dissabte'");
		dicc.put("addsessionfilm", "Vols a�adir altra sessio per a la pelicula?");
		
		dicc.put("inputdaysdfilm", "Introdueix els dias en que es va a emitir el documental.\\nEj: 'dilluns,dimarts,dissabte'");
		dicc.put("addsessiondfilm", "Vols anyadir altra session per a el documental?");
		
		dicc.put("inputdayfmatch", "Introdueix el dia del partit. Ej: 'lunes'");
		dicc.put("fmaddhour", "Introdueix la hora a la que es juga el partit");
		
		dicc.put("fatt", "Atributs de la pelicula");
		dicc.put("att", "Atributs");
		dicc.put("dfatt", "Atributs del documental");
		dicc.put("fmatt", "Atributs del partit");
		dicc.put("inputhour", "Introdueix la hora.\nFormat: HH:mm");
		dicc.put("invalidhour", "Hora invalida");
		dicc.put("inputID", "Itroducce el Codi ID.\nFormat: Axxxx -> A=lletra maysucula  x=num(0-9)");
		dicc.put("invalidID", "Codi ID invalid");
		dicc.put("champions", "Champions");
		dicc.put("league", "Lliga");
		dicc.put("selecttypematch", "Selecciona el tipo de partit.");
		dicc.put("matchtype", "Tipo de partit");
		dicc.put("inputinitialdate", "Introdueix la fecha inicial");
		dicc.put("initialdate", "Fecha Inicial");
		dicc.put("inputlastemi", "Introdueix el ultim dia de emisio.");
		dicc.put("30daysprem", "La pelicula sols pot ser emitida durant 30 dies desde el estreno.");
		dicc.put("decimalnum", "Quants decimals deu utilitzar la aplicacio?");
		dicc.put("invalidnumber", "Nombre invalid");
		dicc.put("closing", "Tancant...");
		dicc.put("inputvalidnum", "Introdueix un nombre valid");
		dicc.put("invalidfloat", "Float invalid");
		dicc.put("inputvalidfloat", "Introdueix un float valid");
		dicc.put("invalidchar", "Caracter invalid");
		dicc.put("inputvalidchar", "Introdueix un caracter valid");
		dicc.put("inputvalidstr", "Introdueix una cadena valid");
		dicc.put("emptyfield", "Camp buit");
		dicc.put("incompleteop", "Operacio incompleta.");
		dicc.put("stillupd","Actualitzar altre atribut?");
		dicc.put("askactualdate","Que dia es hui? (dia de la venta)");
		dicc.put("back", "Tornar");
		dicc.put("childclass", "Amb quina classe vols treballar?");
		dicc.put("notemitoday", "Esta pelicula no s'emiteix hui");
		dicc.put("order","Ordre");


		//menus
		dicc.put("all", "Tots");
		dicc.put("one", "Un");
		
		dicc.put("choseone", "Elegeix un");
		dicc.put("read", "Llegir");
		
		//main
		dicc.put("film", "Pelicula");
		dicc.put("dfilm", "Documental");
		dicc.put("fmatch", "Partit de futbol");
		dicc.put("sett", "Configuracio");
		dicc.put("exit", "Ixir");
		
		dicc.put("create", "Crear");
		dicc.put("update", "Actualitzar");
		dicc.put("delete", "Borrar");
		
		
		return dicc;
	}
}
