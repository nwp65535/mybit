package nwp.test;

import java.util.List;

import nwp.dao.StudentDao;
import nwp.entity.Student;
import nwp.map.StudentMap;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoTest {
	private ApplicationContext applicationContext;
	@Before
	public void setUp() {
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	@Ignore
	public void dao(){
		StudentDao studentDao = (StudentDao) applicationContext.getBean("sdao");
		Student student = studentDao.queryStudentById(1);
		System.out.println(student.getSmiaoshu());
	}
	@Test
	public void map(){
		StudentMap studentMap = (StudentMap) applicationContext.getBean("studentMap");
		List<Student> list = studentMap.findStudentAndClass();
		System.out.println(list);
	}
}
