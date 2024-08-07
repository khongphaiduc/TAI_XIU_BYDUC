package ACCOUNT;
// code by pham trung duc

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Manager_Account {
    Scanner duc = new Scanner(System.in);
    ArrayList<ACCOUNT>list=new ArrayList<>();
    Random random=new Random();
   public  Manager_Account(){
       ACCOUNT phamtrungduc=new ACCOUNT("phamtrungduc","111");
       list.add(phamtrungduc);
   }


   public boolean checktk(String tk){
       return tk.matches("[a-zA-Z]+");
   }
   public boolean checkmk(String mk){
       return mk.matches("[1-9a-z]+");
   }

    public void dangkytaikhoan(){
                   try{
                       while(true){
                           boolean mycheck1=false;
                           System.out.print("Nhập tên tài khoản:");
                           String name = duc.nextLine();
                           if(!checktk(name)){
                               System.out.println("(Hệ thống)=> Tên không chứa ký tự đặc biệt và  chữ số ");
                               continue;
                           } else if (name.length()<8) {
                               System.out.println("(System)=> Tên phải dài hơn 8 ký tự ");
                               continue;
                           }
                           for(int i=0;i<list.size();i++){
                               if(list.get(i).getName().equals(name)){
                                   mycheck1=true;
                               }
                           }
                           if(mycheck1){

                               System.out.println("(Hệ Thống)=>Tài khoản đã tồn tại");

                           }
                           else{
                               try{
                                   System.out.print("Nhập mật khẩu :");
                                   String pass=duc.nextLine();
                                   if(!checkmk(pass)){
                                       System.out.println("mật khẩu không hợp lệ");
                                       continue;
                                   } else if (pass.length()<8) {
                                       System.out.println("Độ dài mật khẩu phải hơn 8 ký tự");
                                       continue;
                                   }

                                   ACCOUNT admin = new ACCOUNT(name,pass);
                                   list.add(admin);
                                   int time=random.nextInt(2,50);
                                   for( int i=0;i<=time;i++){
                                       System.out.print("\r");
                                       System.out.print("Loading");
                                       for( int j=0;j<=i;j++){
                                           System.out.print(".");
                                       }
                                       Thread.sleep(500);
                                   }

                                   System.out.print("\r");
                                   System.out.print("Tạo tài khoản thành công, xin mời bạn đăng nhập.");
                                   System.out.println("\n");
                                   if(checktk(name)&&checkmk(pass)){
                                       break;
                                   }
                               }catch (InterruptedException el){
                                   System.out.println(el);
                               }


                           }
                       }
                   }catch (Exception i){
                       System.out.println(" Không hợp lệ vui lòng nhập lại ");
                   }


    }

    public boolean SignIn(String name, String password){
    ACCOUNT t1 = new ACCOUNT(name,password);
    if(list.contains(t1)){
        System.out.println(" -Đăng nhâp thành công- ");
        return  true;
    }else{
        System.out.println("Tên tài khoản hoặc mật khẩu không chính xác.");
        return false;
    }
    }




}
