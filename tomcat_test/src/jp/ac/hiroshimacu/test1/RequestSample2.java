package jp.ac.hiroshimacu.test1;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestSample2
 */
@WebServlet("/RequestSample2")
public class RequestSample2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestSample2() {
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

        String tmp;

        String name = "";
        tmp = request.getParameter("name");
        if (tmp == null || tmp.length() == 0){
            name = "名前はねーよん";
        }else{
            name = decodeString(tmp);
        }

        int old;
        tmp = request.getParameter("old");
        if (tmp == null || tmp.length() == 0){
            old = -1;
        }else{
            try{
                old = Integer.parseInt(tmp);
            }catch (NumberFormatException e){
                old = -1;
            }
        }

        String tmps[] = request.getParameterValues("food");
        String food = "";
        if (tmps != null){
            for (int i = 0 ; i < tmps.length ; i++){
                food += decodeString(tmps[i]);
                food += " ";
            }
        }else{
            food = "ʅ(‾◡◝)ʃ";
        }

        StringBuffer sb = new StringBuffer();

        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>タイトル</title>");
        sb.append("</head>");
        sb.append("<body>");

        sb.append("<p>名前は、");
        sb.append(name);
        sb.append(" です。</p>");

        sb.append("<p>年は、");
        if (old == -1){
            sb.append("無いんですけど、</p>");
        }else{
            sb.append(old);
            sb.append(" ですん。</p>");
        }

        sb.append("<p>好きな食べ物は、");
        sb.append(food);
        sb.append("です。</p>");

        sb.append("</body>");
        sb.append("</html>");

        out.println(new String(sb));

        out.close();
    }

    protected String decodeString(String str){
        try {
            byte[] byteData = str.getBytes("ISO_8859_1");
            str = new String(byteData, "UTF-8");
        }catch(UnsupportedEncodingException e){
            return null;
        }

        return str;
   
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
