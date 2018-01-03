package bath.group3.model;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "ASSOCIATE_ROLE")
public class AssociateRole {
	private boolean isAllow;
	private Manager manager;
	private Role role;
	public boolean isAllow() {
		return isAllow;
	}
	public void setAllow(boolean isAllow) {
		this.isAllow = isAllow;
	}
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
}
