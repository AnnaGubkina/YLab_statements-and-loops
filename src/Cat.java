public class Cat {

//Задачи на видимость переменных

    private String name;
    private static int catsCount = 0;
    private String fullName;


    //1
    public void setName(String name) {
        this.name = name;
    }

    //2
    public static void addNewCat()
    {
        Cat.catsCount++;
    }

    //3
    public void setName1(String firstName, String lastName){
        String fullName = firstName + lastName;
        this.fullName = fullName;
    };

    //4
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Cat.catsCount++;
        Cat cat2 = new Cat();
        Cat.catsCount++;
        System.out.println("Cats count is " + Cat.catsCount);
    }

}
