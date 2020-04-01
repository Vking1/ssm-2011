package cn.zl.ssm.pojo;

import java.util.Date;

public class User {
	private Integer id;
	private String realname;
	private String username;
	private String password;
	private Integer jobid;
	private Integer deptno;
	private String phone;
	private String email;
	private Date regTime;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer id, String realname, String username, String password, Integer jobid, Integer deptno,
			String phone, String email, Date regTime) {
		super();
		this.id = id;
		this.realname = realname;
		this.username = username;
		this.password = password;
		this.jobid = jobid;
		this.deptno = deptno;
		this.phone = phone;
		this.email = email;
		this.regTime = regTime;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getJobid() {
		return jobid;
	}
	public void setJobid(Integer jobid) {
		this.jobid = jobid;
	}
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getRegTime() {
		return regTime;
	}
	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", realname=" + realname + ", username=" + username + ", password=" + password
				+ ", jobid=" + jobid + ", deptno=" + deptno + ", phone=" + phone + ", email=" + email + ", regTime="
				+ regTime + "]";
	}
	
	
	
}
