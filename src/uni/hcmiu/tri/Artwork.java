package uni.hcmiu.tri;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/artwork")
public class Artwork extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("header","Artworks");
        request.setAttribute("header_text","These are some generative artworks from that time I want to be a 3D Blender artist.");

        String gallery = "<img class='gallery_img' src='./assets/donut_aes.png'>" +
                "<img class='gallery_img' src='./assets/donut_brex_1.png'>" +
                "<img class='gallery_img' src='./assets/donut_cup.png'>" +
                "<img class='gallery_img' src='./assets/donut_cup_dish.png'>" +
                "<img class='gallery_img' src='./assets/double_donut.png'>";
        request.setAttribute("content",gallery);

        RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/standard_template.jsp");
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}