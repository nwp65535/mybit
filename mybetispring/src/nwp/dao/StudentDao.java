package nwp.dao;

import nwp.entity.Student;

public interface StudentDao {

	public abstract Student queryStudentById(int id);

}