package com.gl.hibernateonetomanyunioperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.gl.onetomanyuni.Course;
import com.gl.onetomanyuni.Review;
import com.gl.onetomanyuni.Teacher;
import com.gl.onetomanyuni.TeacherDetails;

public class InsertTeacherAndTeacherDetails {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Teacher.class)
				.addAnnotatedClass(TeacherDetails.class).addAnnotatedClass(Course.class).addAnnotatedClass(Review.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			Teacher t1 = new Teacher("Amy", "Suri", "amy@gmail.com");
			TeacherDetails d1 = new TeacherDetails("JAVA", "Mumbain", "O+");

			t1.setTeacherDetails(d1);

			session.beginTransaction();

			System.out.println("Saving the Teacher: " + t1);
			session.save(t1);
			session.getTransaction().commit();
		} finally {
			session.close();
			factory.close();
		}
	}
}
