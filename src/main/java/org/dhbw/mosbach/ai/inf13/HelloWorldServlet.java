//TEST
package org.dhbw.mosbach.ai.inf13;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		final String parameter = req.getParameter("myparam");

		resp.getWriter().append(
				String.format(
						"<html><head><title>Servlet Hello World</title></head><body>Hello world! <br/>Param value is: %s</body></html>",
						parameter));
	}
}
