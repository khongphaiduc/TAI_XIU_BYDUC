package Main;
import ACCOUNT.Manager_Account;
import Function.*;
import java.util.Scanner;
//code by pham trung duc
public class main {

    public static void main(String[] args) {
        Scanner duc =new Scanner(System.in);
        Function obj1=new Function();
        Manager_Account obj2 =new Manager_Account();

        System.out.printf("Bạn đã có tài khoản chưa ? ( nhập 1 để tạo hoặc 0 để bỏ qua):");

        while(true){// đang ký tài khoản nếu chưa có

              String choice=duc.nextLine();
              // (NƠTE)=> khi sử dụng nhâp số cần sử lý khoảng trắng còn thừa !!!!!

              if(choice.equals("1")){
                  obj2.dangkytaikhoan();
                  break;
              } else if (choice.equals("0")) {
                  break;
              } else if (!choice.equals("1")&&!choice.equals("0")) {
                  System.out.println("Vui lòng chỉ chọn 1 hoặc 0 ");
              }

        }

        while(true){

            System.out.println("------ Đăng nhập ------");
            System.out.print("Nhập tài khoản:");
            String tk= duc.nextLine();
            System.out.print("Nhập mật khẩu:");
            String mk=duc.nextLine();

            if(obj2.SignIn(tk,mk)){


                while(true){
                    try{

                        System.out.println("------------------");
                        System.out.print("Nạp tiền(VND):");

                        if (!duc.hasNextInt()) { // hasNextInt() có nhiệm vụ là kiểm tra số chuẩn bị đọc có phải là số nguyên hay không nếu có thì
                                                 // trả về true nếu không thì false.
                            System.out.println("Số tiền không hợp lệ, vui lòng nhập số nguyên.");
                            duc.nextLine(); // Đọc bỏ đầu vào không hợp lệ
                            continue;
                        }

                        int tien=duc.nextInt();
                        duc.nextLine();
                        if(tien<5000){
                            System.out.println("Số tiền tối thiểu là 5000");
                            continue;
                        }

                        System.out.println("(Hệ thống)=>Nhạp tiền thành công,Chúc Người Anh Em may mắn ");
                        System.out.println("--------------------");
                        obj1.chon(tien);
                    }catch (Exception s){
                        System.out.println("Số tiền không hợp lệ,Vui lòng nhập lại.");
                    }
                }

            }

        }






        }


    }

