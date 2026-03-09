import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if("admin".equals(username) && "1234".equals(password)) {
            req.setAttribute("username", username);
            req.getRequestDispatcher("welcome.jsp").forward(req,resp);
        } else{
            req.setAttribute("error Message", "Invalid username or password");
            req.getRequestDispatcher("index.jsp").forward(req,resp);
        }
    }
}
