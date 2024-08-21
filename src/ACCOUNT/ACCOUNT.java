package ACCOUNT;
// code by pham trung duc
public class ACCOUNT {
    private String name;
    private String password;

    public ACCOUNT(){

    }

    public ACCOUNT(String name , String password){
        this.name=name;
        this.password=password;

    }

    public String getName(){
        return name;
    }


    public String getPassword(){
        return password;

    }

    public String toString(){
        System.out.println("____________________________");
        return "Tài khoản:"+name+" "+" Mật khẩu:"+password;

    }

    @Override // override sẽ ghi đè lên phương thức equals mặc định của Class
    public boolean equals(Object other) {
        if (this == other) return true;  // Kiểm tra đối tượng hiện tại(this) xem có trùng với obj không
        if (other == null || getClass() != other.getClass()) return false;  // Kiểm tra nếu đối tượng khác loại
        ACCOUNT account = (ACCOUNT) other; // vì muốn so sánh kiểu Account thì phải ép obj về Account
        // để cùng kiểu mới có thể so sánh cách thuộc tính
        return this.name.equals(account.name)&&this.password.equals(account.password);  // So sánh thuộc tính
    }

    @Override
    public int hashCode() {
        // Combine name and password to generate hash code
        return 31 * name.hashCode() + password.hashCode();
    }

}
