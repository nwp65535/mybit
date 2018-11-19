package nwp.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Garde implements Serializable{
	private Integer gid;
	private String gname;
	private String gmiaoshu;
	private Set<Cla> clas = new HashSet<Cla>();
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getGmiaoshu() {
		return gmiaoshu;
	}
	public void setGmiaoshu(String gmiaoshu) {
		this.gmiaoshu = gmiaoshu;
	}
	public Set<Cla> getClas() {
		return clas;
	}
	public void setClas(Set<Cla> clas) {
		this.clas = clas;
	}
	
	
}
