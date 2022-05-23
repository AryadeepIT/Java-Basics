package com.aryadeep;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

//        switch (empID) {
//            case 1:
//                System.out.println("Aryadeep Chakraborty");
//                break;
//            case 2:
//                System.out.println("Sanchita Chakraborty");
//                break;
//            case 3:
//                System.out.println("Emp number 3");
//                switch (department) {
//                    case "IT":
//                        System.out.println("IT Department");
//                        break;
//                    case "Management":
//                        System.out.println("Management Department");
//                        break;
//                    default:
//                        System.out.println("No Department entered");
//                }
//                break;
//            default:
//                System.out.println("Enter correct EmpID");
//                break;

        switch (empID) {
            case 1 -> System.out.println("Aryadeep Chakraborty");
            case 2 -> System.out.println("Sanchita Chakraborty");
            case 3 -> {
                System.out.println("Emp number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No Department entered");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }
    }
}
