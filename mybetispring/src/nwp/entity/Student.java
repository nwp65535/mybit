package nwp.entity;

public class Student {
	private Integer sid;
	private String sname;
	private String smiaoshu;
	private Cla cla;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSmiaoshu() {
		return smiaoshu;
	}
	public void setSmiaoshu(String smiaoshu) {
		this.smiaoshu = smiaoshu;
	}
	public Cla getCla() {
		return cla;
	}
	public void setCla(Cla cla) {
		this.cla = cla;
	}
	
}
