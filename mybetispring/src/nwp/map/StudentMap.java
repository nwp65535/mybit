package nwp.map;

import java.util.List;

import nwp.entity.Garde;
import nwp.entity.Student;

public interface StudentMap {
	public List<Garde> findAll();
	public List<Student> findStudentAndClass();
}
