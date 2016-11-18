package nz.co.zufang.model;

import java.util.Date;

/**
 * Created by Lillian on 2/25/2016.
 */
public class User {
	
	/** The uid. */
	private String uid;
	
	/** The username. */
	private String username;
	
	/** The email. */
	private String email;
	
	/** The password. */
	private String password;
	
	/** The created dt. */
	private Date createdDt;
	
	/** The register ip. */
	private String registerIp;
	
	/** The last login time. */
	private Date lastLoginTime;
	
	/** The last login ip. */
	private String lastLoginIp;
	
	/** The send mail time. */
	private Date sendMailTime;
	
	/** The im account. */
	private String imAccount;
	
	/** The phone. */
	private String phone;
	
	/** The address. */
	private String address;
	
	/** The map point. */
	private String mapPoint;
	
	/** The money. */
	private Double money;
	
	/** The last post time. */
	private Date lastPostTime;
	
	/** The status. */
	private String status;

	/**
	 * Instantiates a new user.
	 */
	public User() {
	}

	/**
	 * Instantiates a new user.
	 *
	 * @param userReg the user reg
	 */
	public User(BasicUserReg userReg) {
		this.username = userReg.getUsername();
		this.password = userReg.getPassword();
		this.email = userReg.getEmail();
		this.createdDt = new Date();
	}

	/**
	 * Gets the uid.
	 *
	 * @return the uid
	 */
	public String getUid() {
		return uid;
	}

	/**
	 * Sets the uid.
	 *
	 * @param uid the new uid
	 */
	public void setUid(String uid) {
		this.uid = uid;
	}

	/**
	 * Gets the username.
	 *
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Sets the username.
	 *
	 * @param username the new username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Gets the created dt.
	 *
	 * @return the created dt
	 */
	public Date getCreatedDt() {
		return createdDt;
	}

	/**
	 * Sets the created dt.
	 *
	 * @param createdDt the new created dt
	 */
	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}

	/**
	 * Gets the register ip.
	 *
	 * @return the register ip
	 */
	public String getRegisterIp() {
		return registerIp;
	}

	/**
	 * Sets the register ip.
	 *
	 * @param registerIp the new register ip
	 */
	public void setRegisterIp(String registerIp) {
		this.registerIp = registerIp;
	}

	/**
	 * Gets the last login time.
	 *
	 * @return the last login time
	 */
	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	/**
	 * Sets the last login time.
	 *
	 * @param lastLoginTime the new last login time
	 */
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	/**
	 * Gets the last login ip.
	 *
	 * @return the last login ip
	 */
	public String getLastLoginIp() {
		return lastLoginIp;
	}

	/**
	 * Sets the last login ip.
	 *
	 * @param lastLoginIp the new last login ip
	 */
	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	/**
	 * Gets the send mail time.
	 *
	 * @return the send mail time
	 */
	public Date getSendMailTime() {
		return sendMailTime;
	}

	/**
	 * Sets the send mail time.
	 *
	 * @param sendMailTime the new send mail time
	 */
	public void setSendMailTime(Date sendMailTime) {
		this.sendMailTime = sendMailTime;
	}

	/**
	 * Gets the im account.
	 *
	 * @return the im account
	 */
	public String getImAccount() {
		return imAccount;
	}

	/**
	 * Sets the im account.
	 *
	 * @param imAccount the new im account
	 */
	public void setImAccount(String imAccount) {
		this.imAccount = imAccount;
	}

	/**
	 * Gets the phone.
	 *
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * Sets the phone.
	 *
	 * @param phone the new phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the address.
	 *
	 * @param address the new address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Gets the map point.
	 *
	 * @return the map point
	 */
	public String getMapPoint() {
		return mapPoint;
	}

	/**
	 * Sets the map point.
	 *
	 * @param mapPoint the new map point
	 */
	public void setMapPoint(String mapPoint) {
		this.mapPoint = mapPoint;
	}

	/**
	 * Gets the money.
	 *
	 * @return the money
	 */
	public Double getMoney() {
		return money;
	}

	/**
	 * Sets the money.
	 *
	 * @param money the new money
	 */
	public void setMoney(Double money) {
		this.money = money;
	}

	/**
	 * Gets the last post time.
	 *
	 * @return the last post time
	 */
	public Date getLastPostTime() {
		return lastPostTime;
	}

	/**
	 * Sets the last post time.
	 *
	 * @param lastPostTime the new last post time
	 */
	public void setLastPostTime(Date lastPostTime) {
		this.lastPostTime = lastPostTime;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
