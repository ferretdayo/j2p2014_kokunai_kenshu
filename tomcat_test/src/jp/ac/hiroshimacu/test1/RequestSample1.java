package jp.ac.hiroshimacu.test1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestSample1
 */
@WebServlet("/RequestSample1")
public class RequestSample1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestSample1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");

        int old;
        String tmp = request.getParameter("old");
        if (tmp == null || tmp.length() == 0){
            old = -1;
        }else{
            try{
                old = Integer.parseInt(tmp);
            }catch (NumberFormatException e){
                old = -1;
            }
        }

        String food[] = request.getParameterValues("food");

        StringBuffer sb = new StringBuffer();

        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>タイトル不明</title>");
        sb.append("</head>");
        sb.append("<body>");

        sb.append("<p>お名前は ");
        sb.append(name);
        sb.append(" ですか</p>");

        sb.append("<p>年は、 ");
        if (old == -1){
            sb.append("あうあー</p>");
        }else{
            sb.append(old);
            sb.append(" あうあー</p>");
        }

        sb.append("<p>あうあー");
        if (food != null){
            for (int i = 0 ; i < food.length ; i++){
                sb.append(food[i]);
                sb.append(" ");
            }

            sb.append("あうあー</p>");
        }else{
            sb.append("あうあー</p>");
        }

        sb.append("</body>");
        sb.append("</html>");

        out.println(new String(sb));

        out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
