package vn.pt.simple.task.views;

import vn.pt.simple.task.model.Role;
import vn.pt.simple.task.model.User;
import vn.pt.simple.task.utils.ValidateUtils;

import java.util.Scanner;

public class UserView {
    private static final Scanner scanner = new Scanner(System.in);


    public static void run() {
        int option = -1;
        do {
            show();
            System.out.println("\nChọn chức năng ");
            System.out.print(" ⭆ ");
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    addUser();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Chọn chức năng không đúng! Vui lòng chọn lại");
                    break;
            }

        } while (option != 0);
    }

    private static void addUser() {
        System.out.println("Nhập thông tin người dùng");
        long id = System.currentTimeMillis() / 1000;
        String fullName = getFullName();
        String email = getEmail(1);
        String phone = getPhone(1);
        User newUser = new User(id, fullName, phone, email);
        System.out.println("Đã thêm thành công!\uD83C\uDF8A");
    }


    public static String getFullName() {
        System.out.println("Nhập Ho va ten");
        System.out.print(" ⭆ ");
        return scanner.nextLine();
    }

    //flag danh dang goi ham tu addUser hay UpdateUser;
    private static String getEmail(int flag) {
        if (flag == 1)
            System.out.println("Nhập email (vd: thuan@gmail.com)");
        else
            System.out.println("Nhập email mà bạn muốn đổi (vd: thuan@gmail.com)");
        System.out.print(" ⭆ ");
        String email = scanner.nextLine();
        while (!ValidateUtils.isEmailValid(email)) {
            System.out.println("Email" + email + "của bạn không đúng định dạng! Vui lòng kiểm tra và nhập lại ");
            System.out.println("Nhập email (vd: thuan@gmail.com)");
            System.out.print(" ⭆ ");
            email = scanner.nextLine();
        }
        return email;
    }

    private static String getPhone(int flag) {
        if (flag == 1)
            System.out.println("Nhập số điện thoại (vd: 0345129876): ");
        else
            System.out.println("Nhập số điện thoại mà bạn muốn đổi (vd: 0345129876):");
        System.out.print(" ⭆ ");
        String phone = scanner.nextLine();
        while (!ValidateUtils.isPhoneValid(phone)) {
            System.out.println("Số " + phone + " của bạn không đúng. Vui lòng nhập lại! " + "(Số điện thoại bao gồm 10 số và bắt đầu là số 0)");
            System.out.println("Nhập số điện thoại (vd: 0345129876)");
            System.out.print(" ⭆ ");
            phone = scanner.nextLine();
        }
        return phone;
    }

    public static void show() {
        System.out.println("⚪ ⚪ ⚪ ⚪ ⚪  USERS MANAGER  ⚪ ⚪ ⚪ ⚪ ⚪");
        System.out.println("⚪                                      ⚪");
        System.out.println("⚪     1. Thêm người dùng               ⚪");
        System.out.println("⚪     2. Sửa thông tin người dùng      ⚪");
        System.out.println("⚪     3. Hiện danh sách người dùng     ⚪");
        System.out.println("⚪                                      ⚪");
        System.out.println("⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪");
    }


}
