package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("===Test 1: find by Id===");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
//
//        System.out.println("\n===Test 2: findByDepartment===");
//        Department department = new Department(2, null);
//
//        List<Seller> list = sellerDao.findByDepartment(department);
//
//        for (Seller s : list) {
//            System.out.println(s);
//        }
//
//        System.out.println("\n===Test 3: findAll===");
//        list = sellerDao.findAll();
//
//        for (Seller s : list) {
//            System.out.println(s);
//        }
//
//        System.out.println("\n===Test 4: InsertSeller===");
//        Seller newSeller = new Seller(null, "Greg", "gerg@gred.com", new Date(), 4000.0, department);
//        sellerDao.insert(newSeller);
//        System.out.println("Inserted! New id: " + newSeller.getId());
//
        System.out.println("\n===Test 5: sellerUpdate===");
        seller = sellerDao.findById(1);
        seller.setName("Martha Wayne");
        sellerDao.update(seller);
        System.out.println("Update completed.");
//
//        System.out.println("\n===Test 6: DeleteById===");
//        sellerDao.deleteById(9);
//        System.out.println("Delete completed.");
    }
}