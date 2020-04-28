package uni.hcmiu.tri;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hobby")
public class Hobby extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("header","Hobbies");
        request.setAttribute("header_text","Since I have 2 (plural) hobbies, I can say I have many hobbies. One of them is reading manga, the other is playing Cytus II.");
        
        String hobbies = "<h2>Manga</h2>" +
                "<a href='https://en.wikipedia.org/wiki/Doraemon'>" +
                "<img class='gallery_img' src='./assets/doraemon.jpg'>" +
                "</a>" +
                "<a href='https://en.wikipedia.org/wiki/Toradora!'>" +
                "<img class='gallery_img' src='./assets/toradora.webp'>" +
                "</a>" +
                " <h2>Game</h2>" +
                "<a href='https://www.youtube.com/watch?v=IAS52XC2pto'>" +
                "<img class='gallery_img' src=./assets/cytus.jpg>" +
                "</a>";
        request.setAttribute("content",hobbies);

        RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/standard_template.jsp");
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}