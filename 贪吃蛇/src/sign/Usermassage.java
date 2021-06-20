package sign;

public class Usermassage implements Userfunction {
    private  String username;
    private String password;

    public Usermassage(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public boolean userequals(Usermassage a){
        if(this.password.equals(a.Showpassword())&&this.username.equals(a.Showname()))
            return true;
        return false;
    }
    private   String Showname(){
        return username;
    }
    private  String Showpassword(){
        return password;
    }

}
