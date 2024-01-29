public class Constructor{
    public static void main(String[] args){
        Human human = new Human("Rick",25,48);
        Human human2 = new Human("Morty",27,49);

       human.eat();
       human2.drink();

    }
}

class Human{

    String name;
    int age;
    double weight;
    Human(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
        System.out.println(this.name + " Constructor is executed");
    }
        void eat(){
            System.out.println(this.name + " is eating");
        }

        void drink(){
            System.out.println(this.name + " is drinking");
        }

}