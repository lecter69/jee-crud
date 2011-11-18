package com.example.somewebapp.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.somewebapp.domain.Person;
import com.example.somewebapp.service.PersonManager;
import com.example.somewebapp.service.PersonManagerInMermory;

/**
 * Servlet implementation class edit
 */
@WebServlet("/edit")
public class edit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public edit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		//PersonManager pm = (PersonManager) application.getAttribute("personManager");
		//Person p = new Person(request.getParameter("name"), Integer.parseInt(request.getParameter("yob")));
		//pm.updatePerson(Integer.parseInt(request.getParameter("id")), p);
		
		
		try{
			Person person = new Person();
			person.setName(request.getParameter("name"));
			person.setYob(Integer.parseInt(request.getParameter("yob")));		
			PersonManager pm = new PersonManagerInMermory();		
			pm.updatePerson(Integer.parseInt(request.getParameter("id")),person);
			request.setAttribute("info", "zaktualizowano");
		}catch(NumberFormatException e){			
			request.setAttribute("info", "blad");			
		}
				
		request.getRequestDispatcher("all.jsp").forward(request, response);
		
	}

}
