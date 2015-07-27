package controller;

import dao.ProfileDAO;
import dao.ProfileDAOImpl;
import model.Profile;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Dell on 7/26/2015.
 */
public class RegistrationController extends HttpServlet {

    private static final long serialVersionUID = -4006561145676424435L;

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String address = request.getParameter("address");

        if ((name == null || "".equals(name))
                || (email == null || "".equals(email))
                || (password == null || "".equals(password))
                || (address == null || "".equals(address))) {
            String error = "Mandatory Parameters Missing";
            request.getSession().setAttribute("errorReg", error);
            response.sendRedirect("index.jsp#register");
        } else {
            Profile profile = new Profile(name, email, password, address);

            ProfileDAO profileDAO = new ProfileDAOImpl();

            int result = profileDAO.createProfile(profile);
            if (result == 1) {
                request.getSession().removeAttribute("errorReg");
                response.sendRedirect("success.jsp");
            }else{
                request.getSession().setAttribute("errorReg", "Internal Server Error, Please try again later.");
                response.sendRedirect("index.jsp#register");
            }
        }
    }
}