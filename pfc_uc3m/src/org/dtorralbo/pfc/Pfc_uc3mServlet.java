package org.dtorralbo.pfc;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Pfc_uc3mServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
}
