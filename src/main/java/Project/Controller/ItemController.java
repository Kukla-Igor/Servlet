package Project.Controller;

import Project.Item;
import Project.Service.ItemService;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;



@WebServlet(urlPatterns = "/test")
public class ItemController extends HttpServlet {
    ItemService itemService = new ItemService();

    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().println(req.getParameter("param"));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Item item;

        try (BufferedReader br = req.getReader()) {
            item = toJavaObject(br);
            itemService.doPost(item);
        }
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
    }

//    private static Item toJavaObject(BufferedReader br) {
//
//        Gson gson = new Gson();
//
//        return gson.fromJson(br, Item.class);
//    }

    public static Item toJavaObject(BufferedReader br) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(br, Item.class);
    }
}