package nwp.entity;

import java.util.HashSet;
import java.util.Set;

public class Cla {
	private Integer cid;
	private String cname;
	private String cmiaoshu;
	private Garde garde;
	private Set<Student> students = new HashSet<Student>();
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCmiaoshu() {
		return cmiaoshu;
	}
	public void setCmiaoshu(String cmiaoshu) {
		this.cmiaoshu = cmiaoshu;
	}
	public Garde getGarde() {
		return garde;
	}
	public void setGarde(Garde garde) {
		this.garde = garde;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	
}
