package HelloJava;

public class Greeting {

    private String name;

    public String hello(){
        return "hello world"; 
    }
    public String hello(String name){
        return "hello " + name;
    }

    public Greeting(String name){
        this.name = name;
    }
    public Greeting(){};
}