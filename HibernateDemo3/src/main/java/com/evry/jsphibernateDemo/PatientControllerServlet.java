package com.evry.jsphibernateDemo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class PatientControllerServlet
 */

@WebServlet("/PatientControllerServlet")
public class PatientControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PatientControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// read student info from form data
				String name = request.getParameter("name");
				String age = request.getParameter("age");
				String blood_group = request.getParameter("blood_group");
				String checkup = request.getParameter("checkup");
				String doctorName = request.getParameter("doctorName");
				String test_recommended = request.getParameter("test_recommended");

				// create a new student object
				Patient thePatient = new Patient();

				thePatient.setName(name);
				thePatient.setAge(age);
				thePatient.setBlood_group(blood_group);
				thePatient.setCheckup(checkup);
				thePatient.setDoctorName(doctorName);
				thePatient.setTest_recommended(test_recommended);

				SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		// create session
				Session session = factory.getCurrentSession();
				
				// start a transaction
							session.beginTransaction();
							
							// save the student object
							System.out.println("Saving the student...");
							session.save(thePatient);
							
							// commit transaction
							session.getTransaction().commit();
							
							System.out.println("Done!");

			}


}
