package application;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Seller seller = new Seller(1, "jaja", "sadkjaklsj@kljfal", new Date(), 123.0, new Department(1, "green"));

        System.out.println(seller);
    }
}
