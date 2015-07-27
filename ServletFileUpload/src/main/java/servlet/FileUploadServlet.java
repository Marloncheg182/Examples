package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;

/**
 * Created by Dell on 7/27/2015.
 */
@WebServlet("/FileUploadServlet")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 10,
        maxFileSize = 1024 * 1024 * 50, maxRequestSize = 1024 * 1024 * 100)
public class FileUploadServlet extends HttpServlet {

    private static final long serialVersionUID = 205242440643911308L;

    private static final String UPLOAD_DIR = "uploads";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String applicationPath = req.getServletContext().getRealPath("");
        String uploadFilePath = applicationPath + File.separator + UPLOAD_DIR;

        File fileSaveDir = new File(uploadFilePath);
        if (!fileSaveDir.exists()) {
            fileSaveDir.mkdirs();
        }
        System.out.println("Upload File Directory=" + fileSaveDir.getAbsolutePath());
        String fileName = null;
        for (Part part : req.getParts()) {
            fileName = getFileName(part);
            part.write(uploadFilePath + File.separator + fileName);
        }
        req.setAttribute("message", fileName + "File uploaded successfully!");
        getServletContext().getRequestDispatcher("/response.jsp").forward(req, resp);
    }

    private String getFileName(Part part) {
        String countDisp = part.getHeader("content-disposition");
        System.out.println("content-disposition header=" + countDisp);
        String[] tokens = countDisp.split(";");
        for (String token : tokens) {
            if (token.trim().startsWith("filename")) {
                return token.substring(token.indexOf("=") + 2, token.length() - 1);
            }
        }
        return "";
    }
}