package Cafe;

import java.util.ArrayList;
import java.util.Scanner;

public class TestMenuList {
    public static void main(String[] args) {


        MenuList menuList = new MenuList();

        Scanner in = new Scanner(System.in);

        Menu s1 = new Menu("01", "Cafe Đá", "25.000","L");
        Menu s2 = new Menu("02", "Cafe Sữa CACAO", "35.000","L");
        Menu s3 = new Menu("03", "Cafe sữa Đá", "20.000","L");
        Menu s4 = new Menu("04", "Cafe Xỉu Đá", "15.000","L");

        menuList.addMenus(s1);
        menuList.addMenus(s2);
        menuList.addMenus(s3);
        menuList.addMenus(s4);


        int selection;
//        int n;
        double number, sum = 0;
        ArrayList<Double> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1.Thêm đồ uống");
            System.out.println("2.Sửa tên đồ uống");
            System.out.println("3.Xóa đồ uống");
            System.out.println("4.Tìm tên đồ uống");
            System.out.println("5.In ra đồ uống");
            System.out.println("6.Nhập số lượng cần mua ");
//            selection = scanner.nextInt();
//            for ( int i = 0; i < selection ; i++){
//                System.out.println("7.Nhập đồ uống thứ " + i + ":");
//                number = scanner.nextDouble();
//                arrayList.add(number);
//            }
//            for (double element : arrayList){
//                sum += element;
//            }
//            System.out.println("8.Tổng tiền đồ uống =" + sum);
            System.out.println("7.Thoát");

            selection = in.nextInt();

            switch (selection){
                case 1:menuList.addMenus();
                break;
                case 2: menuList.setMenus();
                break;
                case 3: menuList.removeMenus();
                break;
                case 4 : menuList.searchMenus();
                break;
                case 5 : menuList.getMenus() ;
                break;
            }
        }while (selection <6);

    }
//    public static  void  summenus(){
//        int n;
//        double number, sum = 0;
//        ArrayList<Double> arrayList = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        n = scanner.nextInt();
//            for ( int i = 0; i < n ; i++){
//                System.out.println("7.Nhập đồ uống thứ " + i + ":");
//                number = scanner.nextDouble();
//                arrayList.add(number);
//            }
//            for (double element : arrayList){
//                sum += element;
//            }
//            System.out.println("8.Tổng tiền đồ uống =" + sum);
//
//    }




}
