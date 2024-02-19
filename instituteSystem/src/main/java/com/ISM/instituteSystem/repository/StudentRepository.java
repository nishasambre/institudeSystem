package com.ISM.instituteSystem.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import com.ISM.instituteSystem.entity.Student;

@Repository
public class StudentRepository {

	@Autowired
	private SessionFactory sf;
	
	public List<Student> getAllStudent() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Student.class);
		List<Student> list = criteria.list();
		
		return list;
	}
	
	public String saveStudentDetails(Student student) {
		Session session = sf.openSession();
		Transaction tr =  session.beginTransaction();
		session.save(student);
		tr.commit();
		
		return "Data Saved Sucessfully...";
	}
	
	public String updateStudentDetails(Student student) {
		Session session = sf.openSession();
		Transaction tr =  session.beginTransaction();
		session.update(student);
		tr.commit();
		
		return "Data Updated Sucessfully....";
	}

	public String deleteStudent(Student student) {
		
		Session session = sf.openSession();
		Transaction tr =  session.beginTransaction();
		session.delete(student);
		tr.commit();
		
		return "Data Deleted Sucessfully....";
	}

	public Student getStudentById(int id) {
		Session session = sf.openSession();
		Student student = session.get(Student.class, id);
		return student;
	}

	public String deleteStudentById(int id) {
		Session session = sf.openSession();
		Transaction tr =  session.beginTransaction();
		session.delete(id);
		tr.commit();
		session.close();
		return "Data Deleted Sucessfully....";
		
	}

	public Student getByName(String name) {
		Session session = sf.openSession();
		Student student = session.get(Student.class, name);
		return student;
	}
	
	public List<Student> getByCity(String city) {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Student.class);
		criteria.add(Restrictions.eq("city", city));
		List<Student> list = criteria.list();
		return list;
	}
	

}
