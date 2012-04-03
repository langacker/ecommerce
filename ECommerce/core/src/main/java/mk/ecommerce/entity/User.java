package mk.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = User.GET_ALL, query = "SELECT u FROM User u")
public class User {
	
	public static final String GET_ALL = "getAll";
	
	@Id
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getId() {
		return id;
	}

}
