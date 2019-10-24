package shixian;

import java.io.Serializable;

public class s implements Serializable{
public String id;
public String password;
public s() {
	super();
	// TODO Auto-generated constructor stub
}
public s(String id, String password) {
	super();
	this.id = id;
	this.password = password;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "s [id=" + id + ", password=" + password + "]";
}

}
