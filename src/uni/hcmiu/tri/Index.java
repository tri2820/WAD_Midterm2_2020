package uni.hcmiu.tri;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/index")
public class Index extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("header","Index");
        request.setAttribute("header_text",
                "This is the website of <b>Nguyen Van Tri</b>. " +
                        " I am a sophomore at International University in ComSci. " +
                        " I am most interested in psychology and model theory." +
                        " This website is built as my WebAppDevelopment midterm examination project." +
                        " The technical framework involves java servlets, java bean and so on."
                );

        request.setAttribute("content",
                "<ul>" +
                        "<li>For information about myself and contact information, see the About page</li>" +
                        "<li>For information about my university life, see Major page</li>" +
                        "<li>To see some generative coding pictures I've done in my free time, see the Artwork page</li>"+
                        "<li>To dig into my taste of Manga and Games, see the Hobby page</li>" +
                        "<li>To explore my collection of blogs, see the Blog Collection page</li>" +
                        "<li>To subscribe to the newsletter, check out the Login page</li>" +
                        "</ul>");

        RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/standard_template.jsp");
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}