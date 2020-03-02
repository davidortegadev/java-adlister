import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ads")
public class ShowAdsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServlet request, HttpServletResponse resp) throws ServletException{
        Ads adsDao = DaoFactory.getAdsDao();
    }
}
