public class Nationality {
    public String country;
    public String name;
    public String greeting;
    public void introduction(){
        System.out.println("My name is " + name + " and i am from " + country );
    }

    public void getGreeting(){}

    public void someMethodFromParent(){
        System.out.println("I live in Moscow");
    }

}