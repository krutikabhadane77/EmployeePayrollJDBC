package com.employeepayrolljdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class EmployeePayrollDB {

    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/payroll_service?useSSl=false";
        String username = "root";
        String password = "Kruti77#";
        Connection connection;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded!");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Cannot find the driver in the classpath",e);
        }
        listDrivers();
        try {
            System.out.println("connecting tothe database:" + jdbcURL);
            connection = DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("connection is successful!!!!" + connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void listDrivers() {
        Enumeration<Driver> driverList = DriverManager.getDrivers();
        while (driverList.hasMoreElements()) {
            Driver driverClass = driverList.nextElement();
            System.out.println(driverClass.getClass().getName());
        }
    }
}
