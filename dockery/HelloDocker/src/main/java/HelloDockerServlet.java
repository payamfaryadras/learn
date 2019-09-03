import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "hellodocker",urlPatterns = "/hellodocker")
public class HelloDockerServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("************************Hello Docker**********************");
        System.out.println("************************Hello Docker**********************");
        System.out.println("************************Hello Docker**********************");
        System.out.println("************************Hello Docker**********************");
        System.out.println("************************Hello Docker**********************");
    }
}
