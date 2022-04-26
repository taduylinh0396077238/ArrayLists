package Cafe;

import Task2.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuList {
    private List<Menu> Menus;
    private static Scanner in = new Scanner(System.in);


    public MenuList(){
        this.Menus = new ArrayList<>();
    }

    public void getMenus(){
        for (Menu mnu : Menus){
            System.out.println("("+ mnu.getCode()+")" + mnu.getName());
        }
    }
    public void addMenus(Menu menu){
        Menus.add(menu);
    }

    public void addMenus(){
        String code;
        String name;
        String price;
        String size;

        System.out.println("Mời bạn chọn mã số  đồ uống");
//        System.out.println("Mời bạn Nhập tên đồ uống ");
//        System.out.println("Gía tiền đồ uống ");
//        System.out.println("Chọn Size ");
        code = in.next();


        if (Menus.stream().allMatch(menu -> !menu.getCode().equals(code))){
            System.out.println("Nhập Tên Đồ Uống ");
            name = in.next();
            System.out.println("Giá đồ uống ");
            price = in.next();
            System.out.println("Mời bạn chọn Size");
            size = in.next();
            Menu mnu = new Menu(code,name,price,size);
            Menus.add(mnu);
            System.out.println("Thêm thành công");
        }else {
            System.out.println("Bạn nhập sai đồ uống có sẵn trong cửa hàng");
        }
    }
    public void sortMenus(){
        Menus.sort((mnu1,mnu2)-> mnu1.getCode().compareTo(mnu2.getName()));
    }
    public void setMenus(){
        System.out.println("Nhập mã đồ uống cần thay đổi ");
        String id = in.next();
        boolean check = false;
        Menu mnu = null;
        for (Menu menu : Menus){
            if (menu.getCode().equals(id)){
                check = true;
                mnu = menu;
                break;
            }
        }
        if (check){
            System.out.println("Nhập mã đồ uống cần thay đổi");
            System.out.println("1.Thay đổi tên đồ uống ");
            System.out.println("2.Thay đổi giá đồ uống");
            System.out.println("3.Thay đổi size");
            int selection = in.nextInt();

            switch (selection){
                case 1:
                    System.out.println("Nhập Thay đổi ");
                    String code = in.next();
                    for (Menu menu: Menus) {
                        if (menu.equals(mnu)){
                          menu.setCode(code);
                        }
                    }
                case 2:
                    System.out.println("Nhập Thay đổi ");
                    String name = in.next();
                    for (Menu menu: Menus) {
                        if (menu.equals(mnu)){
                            menu.setName(name);
                        }
                    }
                case 3:
                    System.out.println("Nhập Thay đổi ");
                    String price = in.next();
                    for (Menu menu: Menus) {
                        if (menu.equals(mnu)){
                            menu.setPrice(price);
                        }
                    }
                case 4:
                    System.out.println("Nhập Thay đổi ");
                    String size = in.next();
                    for (Menu menu: Menus) {
                        if (menu.equals(mnu)){
                            menu.setName(size);
                        }
                    }

                    break;
                default:
                    System.out.println("Nhập thay đổi sai");
            }
        }else {
            System.out.println("mã của bạn ko tồn tại");
        }

    }
    public void removeMenus(){
        System.out.println("Nhập mã đồ uống có sẵn");
        String code = in.next();
        if (Menus.stream().anyMatch(menu -> menu.getCode().equals(code))){
            for (Menu menu : Menus){
                if (menu.getCode().equals(code)){
                    Menus.remove(menu);
                    System.out.println("Đã xóa thành công");
                    break;
                }
            }
        }else {
            System.out.println("Không tồn tại mã đồ uống");
        }
    }

    public void searchMenus(){
        System.out.println("Chọn đồ sẵn tại cửa hàng");
        System.out.println("1.Code");
        System.out.println("2.Name");
        System.out.println("3.Price");
        System.out.println("4.Size");

        int selection = in.nextInt();

        System.out.println("Nhập  đồ cần tìm ");
        String key = in.next();
        switch (selection){
            case 1:
                if (Menus.stream().anyMatch(menu -> menu.getCode().contains(key))){
                    for (Menu menu : Menus){
                        if (menu.getCode().contains(key)){
                            System.out.println("("+ menu.getCode()+")"+ menu.getName() + menu.getPrice() + menu.getSize());
                        }
                    }
                }
            case 2:
                if (Menus.stream().anyMatch(menu -> menu.getName().contains(key))){
                    for (Menu menu : Menus){
                        if (menu.getCode().contains(key)){
                            System.out.println("("+ menu.getCode()+")"+ menu.getName() + menu.getPrice() + menu.getSize());
                        }
                    }
                }
            case 3:
                if (Menus.stream().anyMatch(menu -> menu.getPrice().contains(key))){
                    for (Menu menu : Menus){
                        if (menu.getCode().contains(key)){
                            System.out.println("("+ menu.getCode()+")"+ menu.getName() + menu.getPrice() + menu.getSize());
                        }
                    }
                }
            case 4:
                if (Menus.stream().anyMatch(menu -> menu.getSize().contains(key))){
                    for (Menu menu : Menus){
                        if (menu.getCode().contains(key)){
                            System.out.println("("+ menu.getCode()+")"+ menu.getName() + menu.getPrice() + menu.getSize());
                        }
                    }
                }
        }
    }
    public void sumMenus(){

    }
//    public void sumMenus(){
//        System.out.println("Nhập số Lượng đồ Uống ");
//        String n = in.next();
//        n = scan
//        for (int i = 0 ; i < n ; i ++)
//    }

}
