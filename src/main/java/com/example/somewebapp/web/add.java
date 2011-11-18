package com.example.somewebapp.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.somewebapp.service.PersonManager;
import com.example.somewebapp.service.PersonManagerInMermory;
import com.example.somewebapp.domain.Person;

/**
 * Servlet implementation class add
 */
@WebServlet("/add")
public class add extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public add() {
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
		
		try{
			Person person = new Person();
			person.setName(request.getParameter("name"));
			person.setYob(Integer.parseInt(request.getParameter("yob")));		
			PersonManager pm = new PersonManagerInMermory();		
			pm.addPerson(person);
			request.setAttribute("info", "dodano");
		}catch(NumberFormatException e){			
			request.setAttribute("info", "blad");			
		}
				
		request.getRequestDispatcher("all.jsp").forward(request, response);
		
	}

}
