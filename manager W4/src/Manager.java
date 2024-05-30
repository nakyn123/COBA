public class Manager{
    String name;
    String company;

    Manager(String name, String company){
        this.name = name;
        this.company = company;
    }

    Manager(String name){
        this(name, null);
    }

    // Manager(){
    //     this(null);
    // }

    void sayHello(String name){
        System.out.println("Hello "+name+" my Manager name is "+this.name);
    }
    
    int getSalary(){
        return 100000;
    }
}