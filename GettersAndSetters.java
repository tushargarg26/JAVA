class Account{
    private String password;

    //getters and setters

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass){
        this.password=pass;
    }
}

public class GettersAndSetters {
    public static void main(String[] args) {
        Account a1 = new Account();
        System.out.println("Password before setting-");
        System.out.println(a1.getPassword());

        System.out.println("Password After setting-");
        a1.setPassword("abcd");
        System.out.println(a1.getPassword());
        
    }
}