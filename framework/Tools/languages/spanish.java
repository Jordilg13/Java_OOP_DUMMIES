package OOP.framework.Tools.languages;

import java.util.HashMap;
import java.util.Map;

public class spanish {
		
		public static Map<String, String> set() {
			Map<String, String> dicc = new HashMap<String, String>();
			
			//date
			dicc.put("day", "Dia");
			dicc.put("month", "Mes");
			dicc.put("year", "Anyo");
			
			//settings
			dicc.put("lang", "Idioma");
			dicc.put("dec", "Decimal");
			dicc.put("currency", "Moneda");
			dicc.put("date", "Fecha");
			
			//film,documentaryfilm,fmatch
			dicc.put("issdays", "Dias de emision");
			dicc.put("sche", "Horario");
			dicc.put("prem", "Estreno");
			dicc.put("lemi", "Ultima emision");
			dicc.put("price", "Precio");
			
			//fmatch
			dicc.put("hour", "Hora");
			dicc.put("mtype", "Tipo de partido");
			
			//showing
			dicc.put("showID", "ID de proyeccion");
			dicc.put("roomnum", "Numero de sala");
			dicc.put("name", "Nombre");
			
			//functions
			dicc.put("Falreadye", "La pelicula no existe.");
			dicc.put("DFalreadye", "El documental no existe.");
			dicc.put("FMalreadye", "El partido no existe.");
			dicc.put("emptyarray", "El array esta vacio.");
			dicc.put("0results", "No se encuentra en el array.");
			dicc.put("ob", "Ordenar por");
			dicc.put("order", "Orden");
			dicc.put("roomnumdisplayed", "Introducce el numero de la sala donde se va a proyectar el video.");
			dicc.put("inputname", "Introoducce el nombre");
			
			dicc.put("inputdaysfilm", "Introducce los dias en que se va a emitir la pelicula.\nEj: 'lunes,martes,sabado'");
			dicc.put("addsessionfilm", "Quieres a�adir otra session para la pelicula?");
			
			dicc.put("inputdaysdfilm", "Introducce los dias en que se va a emitir el documental.\\nEj: 'lunes,martes,sabado'");
			dicc.put("addsessiondfilm", "Quieres a�adir otra session para el documental?");
			
			dicc.put("inputdayfmatch", "Introducce el dia del partido. Ej: 'lunes'");
			dicc.put("fmaddhour", "Introducce la hora a la que se juega el partido");
			
			dicc.put("fatt", "Atributos de la pelicula");
			dicc.put("att", "Atributos");
			dicc.put("dfatt", "Atributos del documental");
			dicc.put("fmatt", "Atributos del partido");
			dicc.put("inputhour", "Introducce la hora.\nFormato: HH:mm");
			dicc.put("invalidhour", "Hora invalida");
			dicc.put("inputID", "Itroducce el codigo ID.\nFormato: Axxxx -> A=letra maysucula  x=num(0-9)");
			dicc.put("invalidID", "Codigo ID invalido");
			dicc.put("champions", "Champions");
			dicc.put("league", "Liga");
			dicc.put("selecttypematch", "Selecciona el tipo de partido.");
			dicc.put("matchtype", "Tipo de partido");
			dicc.put("inputinitialdate", "Introduce la fecha inicial");
			dicc.put("initialdate", "Fecha Inicial");
			dicc.put("inputlastemi", "Introducce el ultimo dia de emision.");
			dicc.put("30daysprem", "La pelicula solo puede ser emitida durante 30 dias desde el estreno.");
			dicc.put("decimalnum", "Cuantos decimales debe usar la aplicacion?");
			dicc.put("invalidnumber", "Numero invalido");
			dicc.put("closing", "Cerrando...");
			dicc.put("inputvalidnum", "Introducce un numero valido");
			dicc.put("invalidfloat", "Float invalido");
			dicc.put("inputvalidfloat", "Introducce un float valido");
			dicc.put("invalidchar", "Caracter invalido");
			dicc.put("inputvalidchar", "Introduce un caracter valido");
			dicc.put("inputvalidstr", "Introduce una cadena valida");
			dicc.put("emptyfield", "Campo vacio");
			dicc.put("incompleteop", "Operacion incompleta.");
			dicc.put("stillupd","Actualizar otro atributo?");
			dicc.put("askactualdate","Que dia es hoy? (Dia de la venta)");
			dicc.put("back", "Volver");
			dicc.put("childclass", "Con que classe quieres trabajar?");
			dicc.put("notemitoday", "Esta pelicula no se emite hoy.");
			dicc.put("order","Orden");

			
			//menus
			dicc.put("all", "Todos");
			dicc.put("one", "Uno");
			
			dicc.put("choseone", "Elige uno");
			dicc.put("read", "Leer");
			//main
			dicc.put("film", "Pelicula");
			dicc.put("dfilm", "Documental");
			dicc.put("fmatch", "Partido de futbol");
			dicc.put("sett", "Ajustes");
			dicc.put("exit", "Salir");
			
			dicc.put("create", "Crear");
			dicc.put("update", "Actualizar");
			dicc.put("delete", "Borrar");
		
		return dicc;
	}
}
