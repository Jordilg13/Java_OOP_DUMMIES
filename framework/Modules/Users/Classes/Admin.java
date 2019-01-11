package OOP.framework.Modules.Users.Classes;

import OOP.framework.Classes.Date;

public class Admin extends User {
	
	private String name;
	private Date hiringDate;
	/**
	 * @param ID
	 * @param user
	 * @param datebirthday
	 * @param name
	 * @param hiringDate
	 */
	public Admin(String dNI, String user, Date datebirthday, String pass, String name, Date hiringDate) {
		super(dNI, user, datebirthday, pass);
		this.name = name;
		this.hiringDate = hiringDate;
	}
	public Admin() {
		super();
	}
	/**
	 * @param ID
	 */
	public Admin(String user_ID) {
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
	 * @return the hiringDate
	 */
	public Date getHiringDate() {
		return hiringDate;
	}
	/**
	 * @param hiringDate the hiringDate to set
	 */
	public void setHiringDate(Date hiringDate) {
		this.hiringDate = hiringDate;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Admin [name=" + name + ", hiringDate=" + hiringDate + "]";
	}
	
	
	
}
