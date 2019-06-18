package Project.Service;

import Project.DAO.ItemDAO;
import Project.Item;


public class ItemService {
    ItemDAO itemDAO = new ItemDAO();

    public void doPost(Item item) {
        itemDAO.save(item);

    }
}
