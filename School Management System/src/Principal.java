public class Principal extends Person {


    public Principal(String name, Integer id, String email, Integer age) {
        super(name, id, email, age);
    }

    public Principal() {
        super();

    }

    public void expel(Student student){
        if(student.getFight()){
            System.out.println(student.getName() + " " + "is expelled");
        }else {
            System.out.println();
        }

    }
}
