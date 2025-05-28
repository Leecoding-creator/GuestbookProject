package conteroller;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;

import javax.servlet.annotation.WebServlet;

@WebServlet("/guestbook")

public class GuestbookServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static ArrayList<String> messages = new ArrayList<>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String message = request.getParameter("message");

        messages.add(name + ": " + message);
        response.sendRedirect("guestbook");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("messages", messages);
        RequestDispatcher dispatcher = request.getRequestDispatcher("guestbook.jsp");
        dispatcher.forward(request, response);
    }
}
