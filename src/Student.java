public class Student {
    private String  id ;
    private String name ;
    private int age ;

    Student(String id, String name, int age){
        this.id = id ;
        this.name = name ;
        this.age = age ;
    }

    String speak(String conversation){
        return conversation ;
    }
    void  learning(String course){
        //......
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return  " Name : " + name + " ID : " + id + " Age : " + age ;
    }

}
