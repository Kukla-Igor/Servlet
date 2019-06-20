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
    Item item;

    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws IOException {
        try (BufferedReader br = req.getReader()) {
            item = toJavaObject(br);
            System.out.println(itemService.doGet(item.getId()));
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Item item;

        try (BufferedReader br = req.getReader()) {
            item = toJavaObject(br);
            System.out.println(itemService.doPost(item));
        }
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        try (BufferedReader br = req.getReader()) {
            item = toJavaObject(br);
            System.out.println(itemService.doPut(item));
        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        try (BufferedReader br = req.getReader()) {
            item = toJavaObject(br);
            itemService.doDelete(item.getId());
        }
    }


    public static Item toJavaObject(BufferedReader br) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(br, Item.class);
    }
}