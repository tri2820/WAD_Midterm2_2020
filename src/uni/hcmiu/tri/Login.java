package uni.hcmiu.tri;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher view = request.getRequestDispatcher("WEB-INF/login.jsp");
        view.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String n=request.getParameter("username");
        String p=request.getParameter("password");

        if(n.equals("midterm") && p.equals("22042020")) {
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/register.jsp");
            rd.forward(request, response);
        } else {
            out.print("<p id='error'>Sorry UserName or Password Error!<p>");
            RequestDispatcher rd=request.getRequestDispatcher("WEB-INF/login.jsp");
            rd.include(request, response);

        }
    }

}