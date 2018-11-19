package nwp.service.impl;

import java.util.List;

import nwp.dao.StudentDao;
import nwp.entity.Student;
import nwp.map.StudentMap;

public class StudentServiceImpl {
	private StudentMap studentMap;

	public StudentMap getStudentMap() {
		return studentMap;
	}

	public void setStudentMap(StudentMap studentMap) {
		this.studentMap = studentMap;
	}
	public List<Student> findStudentAndClass(){
		return studentMap.findStudentAndClass();
	}
	
}
