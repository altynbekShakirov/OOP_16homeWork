public class Animal {
    private String  name;
    private  int age;

    public Animal(int age , String  name) {
        this.age = age;
        this.name= name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



        public  void  swim(){
            System.out.println("Tutle swims fast in water");

        }
    public  void attack(){
        System.out.println("A shark sttacks a fish");

    }
    public  void fly(){
        System.out.println("Eagle flies high");

    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
