public class Russian extends Nationality {

    @Override
    public void getGreeting(){ //пример полиморфизма - использование объектов с одинаковым
        //интерфейсом без информации о конкретном типе этого объекта.
        System.out.println("Privet");}

    private void RussianOwnMethod(){ //пример инкапсуляции - сокрытие реализации
        //и предоставление доступа к коду не напрямую, а через определенные методы.
        System.out.println("I'm eating blini");
    }

    public static void main(String[] args){
        Russian russian = new Russian();
        russian.name = "George";
        russian.country = "Russia";
        russian.introduction();
        russian.getGreeting();
        russian.RussianOwnMethod();
        russian.someMethodFromParent();
    }

}
