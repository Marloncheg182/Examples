package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Dell on 7/27/2015.
 */
@WebServlet("/GetUserServlet")
public class GetUserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String userName = req.getParameter("userName").trim();
        if (userName == null || "".equals(userName)){
            userName = "Guest";
        }
        String greetings = "Hello" + userName;
        resp.setContentType("text/plain");
        resp.getWriter().write(greetings);
    }
}
