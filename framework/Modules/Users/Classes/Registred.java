package OOP.framework.Modules.Users.Classes;

import OOP.framework.Classes.Date;

public class Registred extends User {

	private String name;
	private Date registerDate;
	/**
	 * @param ID
	 * @param user
	 * @param datebirthday
	 * @param name
	 * @param registerDate
	 */
	public Registred(String ID, String user, Date datebirthday, String pass, String name, Date registerDate) {
		super(ID, user, datebirthday,pass);
		this.name = name;
		this.registerDate = registerDate;
	}
	public Registred() {}
	/**
	 * @param ID
	 */
	public Registred(String user_ID) {
		super(user_ID);
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the registerDate
	 */
	public Date getRegisterDate() {
		return registerDate;
	}
	/**
	 * @param registerDate the registerDate to set
	 */
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Registred [name=" + name + ", registerDate=" + registerDate + "]";
	}
	
	
}
