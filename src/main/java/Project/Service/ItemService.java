package Project.Service;

import Project.DAO.ItemDAO;
import Project.Item;


public class ItemService {
    ItemDAO itemDAO = new ItemDAO();

    public Item doPost(Item item) {
        return itemDAO.save(item);
    }

    public Item doGet(Long id) {
        return itemDAO.findById(id);
    }

    public Item doPut(Item item) {
        return itemDAO.update(item);
    }

    public void doDelete(Long id) {
        itemDAO.delete(id);
    }
}
