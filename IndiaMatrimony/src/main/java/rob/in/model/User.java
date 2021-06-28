package rob.in.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "user")
@Data
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "password2")
	private String password2;
	
	@Column(name = "fatherName")
	private String fatherName;

	@Column(name = "motherName")
	private String motherName;

	@Column(name = "gender")
	private String gender;

	@Column(name = "profession")
	private String profession;

	@Column(name = "salary")
	private String salary;

	@Column(name = "dob")
	private Date dob;

	@Column(name = "gotra")
	private String gotra;

	@Column(name = "foodtype")
	private String foodType;

	@Column(name = "smoker")
	private String smoker;

	@Column(name = "drinker")
	private String drinker;

	@Column(name = "religion")
	private String religion;

	@Column(name = "cast")
	private String cast;

	@Column(name = "subcast")
	private String subCast;

	@Column(name = "state")
	private String state;

	@Column(name = "city")
	private String city;

}
