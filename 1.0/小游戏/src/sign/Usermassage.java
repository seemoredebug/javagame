package sign;

public class Usermassage {
    private  String username;
    private String password;

    public Usermassage(String username, String password) {
        this.username = username;
        this.password = password;
    }
    boolean userequals(Usermassage a){
        if(this.password.equals(a.Showpassword())&&this.username.equals(a.Showname()))
            return true;
        return false;
    }
    public  String Showname(){
        return username;
    }
    public  String Showpassword(){
        return password;
    }
}
