package login.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
@Table(name="Students")
public class Customer {
@Id
@Column(name="id")
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
@NotEmpty
@Column(name="name")
private String name;
@NotEmpty
@Column
private String mobile;
@NotEmpty
@Column
private String gender;
@NotEmpty
@Column
private String email;
@NotEmpty
@Column
private String password;
public int getid() {
	return id;
}
public void setid(int id) {
	this.id=id;
}
public String getname() {
	return name;
}
public void setname(String name) {
	this.name=name;
}
public String getmobile() {
	return mobile;
}
public void setmobile(String mobile) {
	this.mobile=mobile;
}
public String getgender() {
	return gender;
}
public void setgender(String gender) {
	this.gender=gender;
}

public String getemail() {
	return email;
}
public void setemail(String email) {
	this.email=email;
}
public String getpassword() {
	return password;
}
public void setpassword(String password) {
	this.password=password;
}

}
