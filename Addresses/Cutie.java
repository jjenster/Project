public class Cutie {

	private String name;
	private String uni;
	private String number;
	private String email;
	private String remark;

	public Cutie(String name, String uni, String number, String email, String remark) {
		this.name = name;
		this.uni = uni;
		this.number = number;
		this.email = email;
		this.remark = remark;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setUni(String uni) {
		this.uni = uni;
	}

	public String getUni() {
		return uni;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return remark;
	}

}
