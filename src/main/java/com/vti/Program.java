package com.vti;


import java.util.Date;

public class Program { public static void main(String[] args) {

    // Department
    Department department1 = new Department();
    department1.departmentId = 1;
    department1.departmentName = "Sale";

    // Position
    Position position1 = new Position();
    position1.positionId = 1;
    position1.positionName = "Dev";

    // Account
    Account account1 = new Account();
    account1.accountId = 1;
    account1.email = "dev1@gmail.com";
    account1.username = "dev01";
    account1.fullName = "Nguyen Van A";
    account1.departmentId = department1.departmentId;
    account1.positionId = position1.positionId;
    account1.createDate = new Date();

    // Group


    Group group1 = new Group();
    group1.groupId = 1;
    group1.groupName = "Java Fresher";
    group1.creatorId = account1.accountId;
    group1.createDate = new Date();

    //Type
    TypeQuestion type1 = new TypeQuestion();
    type1.typeId = 1;
    type1.typeName = "Essay";

    TypeQuestion type2 = new TypeQuestion();
    type2.typeId = 2;
    type2.typeName = "Multiple-Choice";

    // In thông tin
    System.out.println("Department: " + department1.departmentName);
    System.out.println("Position: " + position1.positionName);
    System.out.println("Account: " + account1.fullName);
    System.out.println("Group: " + group1.groupName);
    System.out.println("Type 1: " + type1.typeName);
    System.out.println("Type 2: " + type2.typeName);

}
}
