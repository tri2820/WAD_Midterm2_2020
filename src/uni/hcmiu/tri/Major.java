package uni.hcmiu.tri;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/major")
public class Major extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("header", "Major");
        request.setAttribute("header_text","I am majoring in Computer Science.");

        String content = "<p>I' going to HCMIU - HoChiMinh International University." +
                " My ID is ITITUN18051." +
                " The college is nice, and I met some really interesting friends there." +
                " This is my friends taking over the canteen's TV to play their favourite Disney movie.</p>" +
                "<video width='320' height='240' controls>" +
                "  <source src='./assets/movie.mp4' type='video/mp4'>" +
                "</video>" +
                "<p> This is one of my favourite experiment in uni. </p>" +
                "<img class='gallery_img' src='./assets/exp.jpg'>";
        request.setAttribute("content",content);

        RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/standard_template.jsp");
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}