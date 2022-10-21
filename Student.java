import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparable <Student> {
    private String name;
    private Integer age;
    private String address;

    public Student(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
    @Override
    public int compareTo(Student student) {
        return this.getName().compareTo(student.getName());
    }
    public static class AgeComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            if (o1.getAge() > o2.getAge()) {
                return 1;
            } else if (o1.getAge() == o2.getAge()) {
                return 0;
            } else {
                return -1;

            }
        }
    }
    public static void main(String[] args) {
        Student student = new Student("Kien", 30, "HT");
        Student student1 = new Student("Nam", 26, "HN");
        Student student2 = new Student("Anh", 38, "HT" );
        Student student3 = new Student("Tung", 38, "HT" );

        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for(Student st : lists){
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists ,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(Student st : lists){
            System.out.println(st.toString());
        }
    }

}

