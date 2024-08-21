package br.puc.teste.stateless;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/carrinhoStateless")
public class ServletStateless extends HttpServlet {
	
	@EJB
	private ServiceStatelessBean serviceStatelessBean;
	
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=UTF-8");
		try(PrintWriter out = response.getWriter()){
			out.println("<html><body>");
			out.println("<h1>Itens:</h1>");
			for(String item : serviceStatelessBean.getItens()) {
				out.println("<p>" + item + "</p>");
			}
			out.println("</body></html>");
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		serviceStatelessBean.addItem(req.getParameter("item"));
	}

}
