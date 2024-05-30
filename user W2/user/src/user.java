class user {
    protected String username;
    protected String password;
    protected String phoneNumber;
    protected String email;
    protected Boolean admin = false;
    protected final String country = "Indonesia";

    user(String paramusername, String parampassword, String paramphoneNumber, Boolean paramadmin){
        this.username = paramusername;
        this.password = parampassword;
        this.phoneNumber = paramphoneNumber;
        this.admin = paramadmin;
    }

    user(String paramusername, String parampassword, Boolean paramadmin){
        this.username = paramusername;
        this.password = parampassword;
        this.admin = paramadmin;
    }

    user(String paramusername, String parampassword){
        this.username = paramusername;
        this.password = parampassword;
    }

    user(String paramusername){
        this.username = paramusername;
    }

    user(){
    }

    void userMe() throws Exception {
        System.out.println("My username is "+this.username+ 
        " password "+this.password+ 
        " phone Number "+this.phoneNumber+ 
        " email "+this.email+ 
        (this.admin? " is_admin ": "")+
        " country "+this.country);
    }

    void login(String paramusername, String parampassword){
        if(this.username == paramusername && this.password == parampassword) {
            System.out.println("Success login with username "+username);
        }else{
            System.out.println("Failed login with username "+username);
        }
    }
}
