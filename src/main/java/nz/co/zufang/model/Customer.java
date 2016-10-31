package nz.co.zufang.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Lillian.
 */
@Entity
@Table(name = "TBL_CUSTOMER")
public class Customer {

	@Id
    @Column(name = "USERNAME")
    private String username;
    
    @Column(name = "ADDRESS")
    private String address;
    
    @Column(name = "TELEPHONENUMBER")
    private String telephoneNumber;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
    
}
