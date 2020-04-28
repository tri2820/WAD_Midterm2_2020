package uni.hcmiu.tri;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/blog_collection")
public class Blog_collection extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("header", "Blog collection");
        request.setAttribute("header_text","I have always wanted to make a list of blogs which I find interesting." +
                " I dont really have a reason, but some people collect stamps and I'm collecting these.");

        String blogs = "<ul>" +
                "<li>" +
                "<a href='http://maximum-entropy-blog.blogspot.com/2013/11/monkeys-and-multiplicity.html'>Tom Campbell-Ricketts on statistics</a>" +
                "</li>" +
                "<li>" +
                "<a href='https://drewdevault.com/2019/02/10/Wayland-misconceptions-debunked.html'>Drew Devault on wayland engineering</a>" +
                "</li>" +
                "<li>" +
                "<a href='https://ahelwer.ca/post/2018-02-13-z3-firewall/'>Andrew Helwer on constraint solvers</a>" +
                "</li>" +
                "</ul>";
        request.setAttribute("content",blogs);

        RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/standard_template.jsp");
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}