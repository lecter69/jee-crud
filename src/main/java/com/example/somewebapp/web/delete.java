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
 * Servlet implementation class delete
 */
@WebServlet("/delete")
public class delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public delete() {
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
			PersonManager pm = new PersonManagerInMermory();	
			pm.deletePerson(Integer.parseInt(request.getParameter("id")));
			request.setAttribute("info", "usunięto");
		}catch(IndexOutOfBoundsException e){			
			request.setAttribute("info", "blad");
		}
		
		request.getRequestDispatcher("all.jsp").forward(request, response);
	}

}
