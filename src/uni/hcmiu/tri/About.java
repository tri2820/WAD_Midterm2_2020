package uni.hcmiu.tri;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/about")
public class About extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("header","About");
        request.setAttribute("header_text", "My name is <b>Nguyen Van Tri</b>");
        request.setAttribute("content","<p>My age is 20." +
                " I was born in Danang, Vietnam and currently living in HoChiMinh city, striving the Computer Science Bachelor degree at HCMIU." +
                " I started coding since 15." +
                ", hopping from learning algorithms for competitive programming to indie software engineering to Unity game developing and now settle at the academic AI domain." +
                " I am young so I'm trying to BFS my way in this career - basically learning spirally, level up each time I complete a cycle." +
                "I still have not yet find that one-single goal to pursue, but meh, I think I'm doing well.</p>" +
                "<p>You can contact me via my email tri020800@gmail.com.</p>" +
                "<p>You should also checkout my <a href='https://github.com/tri2820'>github profile</a> sometimes.</p>" +
                "<img class='gallery_img' src='./assets/me.jpg'>");
        RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/standard_template.jsp");
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}