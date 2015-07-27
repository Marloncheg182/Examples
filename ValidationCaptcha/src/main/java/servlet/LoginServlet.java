package servlet;

import utils.VerifyRecaptcha;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Dell on 7/26/2015.
 */
@WebServlet(description = "Login Servlet", urlPatterns = { "/LoginServlet" }, initParams = {
        @WebInitParam(name = "user", value = "Oleg"),
        @WebInitParam(name = "password", value = "oleg") })
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = -6506682026701304964L;

    public void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        // get request parameters for userID and password
        String user = request.getParameter("user");
        String pwd = request.getParameter("pwd");
        // get reCAPTCHA request param
        String gRecaptchaResponse = request
                .getParameter("g-recaptcha-response");
        System.out.println(gRecaptchaResponse);
        boolean verify = VerifyRecaptcha.verify(gRecaptchaResponse);

        // get servlet config init params
        String userID = getServletConfig().getInitParameter("user");
        String password = getServletConfig().getInitParameter("password");
        // logging example
        System.out.println("User=" + user + "::password=" + pwd + "::Captcha Verify"+verify);

        if (userID.equals(user) && password.equals(pwd) && verify) {
            response.sendRedirect("LoginSuccess.jsp");
        } else {
            RequestDispatcher rd = getServletContext().getRequestDispatcher(
                    "/login.html");
            PrintWriter out = response.getWriter();
            if (verify) {
                out.println("<font color=red>Either user name or password is wrong.</font>");
            } else {
                out.println("<font color=red>You missed the Captcha.</font>");
            }
            rd.include(request, response);
        }
    }
}