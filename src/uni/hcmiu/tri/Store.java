package uni.hcmiu.tri;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/store")
public class Store extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        UserBean u = new UserBean();
        u.setFullname(request.getParameter("fullname"));
        u.setEmail(request.getParameter("email"));
        u.setUsername(request.getParameter("username"));
        u.setPassword(request.getParameter("password"));
        
        out.println("<ul>" +
                "<li>" + u.getFullname()+ "</li>" +
                "<li>" + u.getEmail()+ "</li>" +
                "<li>" + u.getUsername()+ "</li>" +
                "<li>" + u.getPassword()+ "</li>" +
                "</ul>");
    }

}
