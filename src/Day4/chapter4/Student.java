package Day4.chapter4;

//public class Student {
//
//    private int age;
//    String nom;   // package private
//    protected String sexe;
//    public String prenom;
//
//    // construct par defaults
//    public Student() {
//        this(20);
//
//        System.out.println("this");
//    }
//
//    // construct par defaults avec params age
//    public Student(int age) {
//        System.out.println("this1");
//    }
//
//    // construct par defaults avec params nom
//    public Student(String nom) {
//
//        System.out.println("this2");
//    }
//
//    // construct par defaults avec 2 params
//    public Student(String nom, int age) {
//        System.out.println("this3");
//    }
//
//    public void info() {
//        System.out.println(this);
////        System.out.println(this.nom);
////        System.out.println(this.sexe);
////        System.out.println(this.prenom);
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        if (age >= 0 && age <= 150) this.age = age;
//    }
//}

public class Student {
    static String res = "";

    {
        res += "c";
    }

    static {
        res += "u";
    }

    {
        res += "r";
    }
}
