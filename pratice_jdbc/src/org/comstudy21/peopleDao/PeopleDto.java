package org.comstudy21.peopleDao;

public class PeopleDto {

	String code;
	String name;
	String id;
	String password;
	int age;

	public PeopleDto() {

	}

	public PeopleDto(String code, String name, String id, String password, int age) {
		super();
		this.code = code;
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "PeopleDto [code=" + code + ", name=" + name + ", id=" + id + ", password=" + password + ", age=" + age
				+ "]";
	}

}
