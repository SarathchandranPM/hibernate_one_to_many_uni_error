package com.gl.hibernateonetomanyunioperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.gl.onetomanyuni.Course;
import com.gl.onetomanyuni.Review;
import com.gl.onetomanyuni.Teacher;
import com.gl.onetomanyuni.TeacherDetails;

public class InsertCourseAndReview {
	public static void main(String[] args) {
		SessionFactory factory= new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Teacher.class)
				.addAnnotatedClass(TeacherDetails.class)
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(Review.class)
				.buildSessionFactory();
		
		Session session= factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			
			Course c1= new Course("JAVASCRIPT");
			
			//why am I getting error here? .add method is not showing in suggestion.
			c1.addReview(new Review("Good course"));
			c1.addReview(new Review("Really loved it"));
			c1.addReview(new Review("Awsome"));
			c1.addReview(new Review("Valuable"));
		}
	}
}
