package controller;

import dao.ProfileDAO;
import dao.ProfileDAOImpl;
import model.Profile;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Dell on 7/26/2015.
 */
public class LoginController extends HttpServlet {

    private static final long serialVersionUID = -4602272917509602701L;

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        String error;
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        Profile profile = new Profile();
        profile.setEmail(email); profile.setPassword(password);

        HttpSession session = request.getSession();
        ProfileDAO profileDAO = new ProfileDAOImpl();

        Profile userDB = profileDAO.loginProfile(profile);

        if (userDB.getName() == null) {
            error = "Invalid Email or password";
            session.setAttribute("error", error);
            response.sendRedirect("index.jsp");
        } else {
            session.setAttribute("user", userDB.getName());
            session.removeAttribute("error");
            response.sendRedirect("welcome.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        if ("logout".equalsIgnoreCase(request.getParameter("param"))) {
            HttpSession session = request.getSession();
            if(session != null){
                session.invalidate();
            }
            response.sendRedirect("index.jsp");
        }
    }
}