package application;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: department findById =====");
        Department department = departmentDao.findById(2);
        System.out.println(department);

        System.out.println("\n=== TEST 2: department findAll =====");
        List<Department> list = departmentDao.findAll();

        for (Department obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 3: department insert =====");
        Department newDepartment = new Department(null, "Music");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! new department: " + newDepartment.getId());

        System.out.println("\n=== TEST 4: department update =====");
        Department department2 = departmentDao.findById(6);
        department.setName("Food");
        departmentDao.update(department2);
        System.out.println("Update completed!");
        

    }
}
