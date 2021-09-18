package com.app1;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.formatter.service.impl.DateFormatter;

/**
 * Servlet implementation class myClass
 */
@WebServlet("/apiv1")
public class apiv1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public apiv1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int n1 = Integer.parseInt(request.getParameter("a"));
		int n2 = Integer.parseInt(request.getParameter("b"));
		Utils ut = new Utils();
		Date d1;
		DateFormatter df = new DateFormatter();
		try
		{
			d1 = df.toObject("10/12/2021");
			System.out.println("Date Object:" + "\t" + d1);
		}
		catch(ParseException pe)
		{
			
		}

		
		response.getWriter().append("Served at: ").append(""+ ut.add(n1,n2));
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	

}
