package com.gl.hibernateonetomanyunioperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.gl.onetomanyuni.Course;
import com.gl.onetomanyuni.Review;
import com.gl.onetomanyuni.Teacher;
import com.gl.onetomanyuni.TeacherDetails;

public class InsertCourses {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Teacher.class)
				.addAnnotatedClass(TeacherDetails.class).addAnnotatedClass(Course.class).addAnnotatedClass(Review.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			session.beginTransaction();

			int id = 1;
			Teacher t1 = session.get(Teacher.class, id);

			Course c1 = new Course("PYTHON");
			Course c2 = new Course("JAVA");
			
			//why am I getting error here? .add method is not showing in suggestion.
			t1.ad
			t1.add(c2);
			
		} finally {
			session.close();
			factory.close();
		}

	}

}
