public class ManagerApp {

    public static void main(String[] args) {
        
        Manager manager = new Manager("nakyn", "Google");
        manager.name = "nakyn";
        manager.company = "Google";
        manager.sayHello("user");
        System.out.println("salary "+manager.getSalary());
        System.out.println(manager.toString());
        
        VicePresident vp = new VicePresident("dzaka", "Google", "Maroko");
        vp.sayHello("user");
        vp.sayParentHello("user");
        System.out.println("salary "+vp.getSalary());
        System.out.println("parent salary "+vp.getParentSalary());
        System.out.println("my address is "+vp.getaddress());
    }
    
}
 