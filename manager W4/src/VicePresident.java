public class VicePresident extends Manager{ 
    private String address;
    
    VicePresident(String name, String company, String address){
        super(name, company);
        this.address = address;
    }
    
    VicePresident(String name){
        super(name, null );
    } 
    
    VicePresident(){
        super(null); 
    }

    @Override
    void sayHello(String name){
        System.out.println("Hello "+name+" my Vice President name is "+this.name);
    }
    
    void sayParentHello(String name){
        super.sayHello(name);
    }
    
    @Override
    int getSalary(){
        return 200000;
    }

    int getParentSalary(){
        return super.getSalary();
    }

    String getaddress(){
        return this.address;
    }
}
