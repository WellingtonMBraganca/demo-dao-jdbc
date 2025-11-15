package application;

import db.DB;
import db.DbException;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Program2 {
    static void main() {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        List<Department> list = new ArrayList<>();

        System.out.println("===Test 1: find by Id===");
        Department department = departmentDao.findById(12);
/*
        System.out.println("\n===Test 2: InsertDepartment===");
        Department newDepartment = new Department(null, "DepartmentOfTruth");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id: " + newDepartment.getId());


        System.out.println(department);

        System.out.println("\n===Test 3: findAll===");
        list = departmentDao.findAll();

        for (Department d: list) {
            System.out.println(d);
        }



        System.out.println("\n===Test 5: sellerUpdate===");
        department = departmentDao.findById(1);
        department.setName("Department of love");
        departmentDao.update(department);
        System.out.println("Update completed.");
*/

        System.out.println("\n===Test 6: DeleteById===");
        departmentDao.deleteById(11);
        System.out.println("Delete completed.");


    }
}

