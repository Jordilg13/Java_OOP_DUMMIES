package OOP.framework.Modules.Cinema.Classes;

import OOP.framework.Tools.languages.SingletonLang;

public abstract class Showing implements Comparable<Showing> { //sala de un cine
	
	private String showing_ID;
	private int room_number;
	private String name;
	
	//const
	public Showing(String showing_ID, int room_number, String name) {
		
		this.showing_ID = showing_ID;
		this.room_number = room_number;
		this.name = name;
	}
	//primary key const
	public Showing(String showing_ID) {

		this.showing_ID = showing_ID;
	}
	//empty const
	public Showing() {};
	
	
	
	public String getShowing_ID() {
		return showing_ID;
	}
	public void setShowing_ID(String showing_ID) {
		this.showing_ID = showing_ID;
	}
	public int getRoom_number() {
		return room_number;
	}
	public void setRoom_number(int room_number) {
		this.room_number = room_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	///compareTo
	public int compareTo(Showing r1) {
		int out = 0;
		if (this.getShowing_ID().compareTo(r1.getShowing_ID()) > 0)
			return 1;
		if (this.getShowing_ID().compareTo(r1.getShowing_ID()) < 0)
			return -1;		
		return out;
	}
	
	//equals
	public boolean equals(Object r1){
		return getShowing_ID().equals(((Showing)r1).getShowing_ID());
	}
	
	@Override
	public String toString() {
		return "Showing ["+SingletonLang.dicc.get("showID")+"=" + showing_ID + ","+
				SingletonLang.dicc.get("roomnum")+"=" + room_number + ", "+
				SingletonLang.dicc.get("name")+"=" + name + "]";
	}
	
	
	
	
	
	
}
