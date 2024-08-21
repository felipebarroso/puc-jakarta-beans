package br.puc.teste.stateful;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/carrinhoStateful")
public class ServletStateful extends HttpServlet {
	
	@EJB
	private ServiceStatefulBean serviceStatefulBean;
	
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=UTF-8");
		try(PrintWriter out = response.getWriter()){
			out.println("<html><body>");
			out.println("<h1>Itens:</h1>");
			for(String item : serviceStatefulBean.getItens()) {
				out.println("<p>" + item + "</p>");
			}
			out.println("</body></html>");
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		serviceStatefulBean.addItem(req.getParameter("item"));
	}

}
