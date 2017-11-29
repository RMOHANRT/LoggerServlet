package com.servlet.example;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PostRequestServlet extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException

	{
		res.setContentType("text/html");
		
		Writer out = res.getWriter();
		String msg = "";
		String title = "Using Post Method to Read Form Data";
		msg ="<!doctype html public \"-//w3c//dtd html 4.0 " +

				"transitional//en\">\n";

				msg = msg+"<html>\n" +

				"<head><title>" + title + "</title></head>\n" + "<body bgcolor=\"#f0f0f0\">\n" +

				"<h1 align=\"center\">" + title + "</h1>\n" + "<ul>\n" +

				"	<li><b>First Name</b>: "

				+ req.getParameter("firstname") + "\n" + " <li><b>Last Name</b>: "
				+ req.getParameter("lastname") + "\n" 

				+"</ul>\n" 

				+"</body></html>";

		out.write(msg);

	}
	/*
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

			doGet(req, res);

			}

*/
}