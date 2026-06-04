package application;

import entities.Department;
import entities.Seller;

import java.util.Date;

public class Program {
    public static void main (String[] args) {

        Seller sl = new Seller(1, "Nome", "nome@gmail.com", new Date("10/10/1999"), 1.200, new Department(1, "books"));
        System.out.println(sl);

    }
}
