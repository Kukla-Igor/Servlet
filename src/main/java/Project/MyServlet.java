//package Project;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.BufferedReader;
//import java.io.IOException;
//
//@WebServlet (urlPatterns = "/test")
//public class MyServlet extends HttpServlet {
//    @Override
//    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        resp.getWriter().println(req.getParameter("param"));
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//       BufferedReader reader = req.getReader();
//        System.out.println(reader.readLine());
//
//        super.doPost(req, resp);
//    }
//
//    @Override
//    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPut(req, resp);
//    }
//
//    @Override
//    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doDelete(req, resp);
//    }
//}
//
