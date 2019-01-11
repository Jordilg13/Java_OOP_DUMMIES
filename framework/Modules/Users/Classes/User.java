package OOP.framework.Modules.Users.Classes;

import java.time.LocalDate;
import java.time.Period;

import OOP.framework.Classes.Date;
import OOP.framework.Modules.Users.Tools.functions_users_data;

public class User implements Comparable<User>{

	private String ID;
	private String type;
	private Date datebirthday;
	private int age;
	private String pass;
	
	public User(String ID, String type, Date datebirthday, String pass) {
		super();
		this.ID = ID;
		this.type = type;
		this.datebirthday = datebirthday;
		calculateAge(LocalDate.of(datebirthday.getYear(),datebirthday.getMonth(),datebirthday.getDay()));
		this.pass = pass;
	}

	
	public User() {}


	public User(String user_ID) {
		this.ID = user_ID;
	}


	/**
	 * @return the iD
	 */
	public String getID() {
		return ID;
	}

	/**
	 * @param iD the iD to set
	 */
	public void setID(String iD) {
		ID = iD;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the datebirthday
	 */
	public Date getDatebirthday() {
		return datebirthday;
	}

	/**
	 * @param datebirthday the datebirthday to set
	 */
	public void setDatebirthday(Date datebirthday) {
		this.datebirthday = datebirthday;
		calculateAge(LocalDate.of(datebirthday.getYear(),datebirthday.getMonth(),datebirthday.getDay()));
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	
	/**
	 * @return the pass
	 */
	public String getPass() {
		return pass;
	}


	/**
	 * @param pass the pass to set
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}


	public int compareTo(User param) {//para ordenar los empleados por nombre
		if(this.getID().compareTo(param.getID())>0)
			return 1;
		if(this.getID().compareTo(param.getID())<0)
			return -1;
		return 0;
	  }
	
	public void  calculateAge(LocalDate birthDate) {
            this.age = Period.between(birthDate, LocalDate.now()).getYears();
    }
	public String ask4pass() {	
		return functions_users_data.passwd();
	}
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [ID=" + ID + ", type=" + type + ", datebirthday=" + datebirthday + ", age=" + age + 
				", pass=" + pass.replaceAll(".", "*") + "]";
	}

	
	
	

}
