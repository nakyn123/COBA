class user {
    protected String username;
    protected String password;
    protected String phoneNumber;
    protected String email;
    protected Boolean admin = false;
    protected final String country = "Indonesia";

    user(String username, String password, String phoneNumber, Boolean admin){
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.admin = admin;
    }

    user(String username, String password, String phoneNumber){
        this(username, password,phoneNumber, false);
    }

    user(String username, String password){
        this(username, password, null);
    }

    user(String username){
        this(username, null);
    }

    user(){
        this(null);
    }

    void userMe() throws Exception {
        System.out.println("My username is "+this.username+ 
        " password "+this.password+ 
        " phone Number "+this.phoneNumber+ 
        " email "+this.email+ 
        (this.admin? " is_admin ": "")+
        " country "+this.country);
    }

    void login(String username, String password){
        if(this.username == username && this.password == password) {
            System.out.println("Success login with username "+username);
        }else{
            System.out.println("Failed login with username "+username);
        }
    }
}
