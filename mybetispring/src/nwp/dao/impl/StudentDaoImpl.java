package nwp.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import nwp.dao.StudentDao;
import nwp.entity.Student;

public class StudentDaoImpl extends SqlSessionDaoSupport implements StudentDao{
	/* (non-Javadoc)
	 * @see nwp.dao.StudentDao#queryStudentById(int)
	 */
	@Override
	public Student queryStudentById(int id){
		return this.getSqlSession().selectOne("student.queryStudentById", id);
	}
}
