package Function;
import java.util.Random;
import java.util.Scanner;
//code by pham trung duc
public class Function {
Scanner duc = new Scanner(System.in);


    public void chon(int sodu){
        System.out.println("Số dư của bạn là: "+sodu+" VND");
        boolean mychcek=true;

        while(mychcek){
            System.out.println("------- Nhà Cái Hàng Đầu Ninh Bình -------");
            System.out.print("Xin mời đặt được (TAI,XIU):");
            String choice= duc.nextLine();
            if(!choice.equals("xiu")&&!choice.equals("tai")){
                System.out.println("(Hệ thống)=>lựa chọn của bạn không hơp lệ");
               continue; // khi câu lệnh được gọi trong vòng lặp thì tất cả các câu lệnh sau continue đề bị bỏ qua là bắt đầu vòng lặp mới.
            }
            System.out.println("Số dư của bạn là :"+sodu+"VND");
            System.out.println("Bạn chọn :"+choice);
            System.out.print("Nhập số tiền muốn cược:");
            int sotiendat=duc.nextInt();
            if(sodu<1000){
                System.out.println("Số dư không khả dụng,Vui lòng nhạp thêm tiền.");
                break;
            }
            duc.nextLine();
            int ketqua=0;
            Random random= new Random();

            int a=random.nextInt(1,6);
            int b=random.nextInt(1,6);
            int c=random.nextInt(1,6);

            int result=a+b+c;

            if(result>10){
                try{
                    System.out.println("Xúc xắc (1):=>"+a);
                    Thread.sleep(1000);
                    System.out.println("Xúc xắc (2):=>"+b);
                    Thread.sleep(1000);
                    System.out.println("Xúc xắc (3):=>"+c);
                    Thread.sleep(1000);
                    System.out.print("Tổng số nut:"+result);
                    System.out.println(" TAI");

                    if(choice.equals("tai")){

                        ketqua  =sotiendat*2;
                        System.out.println("Chúc mừng bạn đã thắng."+"+"+ketqua);
                        sodu=sodu+(ketqua-sotiendat);
                        System.out.println("số dư của bạn là:"+sodu+"VND");
                    }else{


                        ketqua=sotiendat;
                        System.out.println("Bạn thua."+"-"+ketqua);
                        sodu=(sodu-sotiendat);
                        System.out.println("số dư của bạn là:"+sodu+"VND");
                    }


                }catch (InterruptedException e){
                    System.out.println(e);
                }

            }
            else{
                try{

                    System.out.println("Xúc xắc (1):=>"+a);
                    Thread.sleep(1000);
                    System.out.println("Xúc xắc (2):=>"+b);
                    Thread.sleep(1000);
                    System.out.println("Xúc xắc (3):=>"+c);
                    Thread.sleep(1000);
                    System.out.print("Tổng số nut:"+result);
                    System.out.println(" Xiu");

                    if(choice.equals("xiu")){

                        ketqua  =sotiendat*2;
                        System.out.println("Chúc mừng bạn đã thắng."+"+"+ketqua);
                        sodu=sodu+(ketqua-sotiendat);
                        System.out.println("số du của bạn là:"+sodu+"VND");

                    }else{
                        ketqua=sotiendat;
                        System.out.println("Bạn thua."+"-"+ketqua);
                        sodu=(sodu-sotiendat);
                        System.out.println("số du của bạn là:"+sodu+"VND");
                    }

                }catch (InterruptedException f){
                    System.out.println(f); }



            }
        }



}
}