
package SapXepNhieuTieuChi.newpackage;


public class Student {
    private String name;
    private int age;
    private double score;
    private String address;
    public Student(String name, int age, double score, String address) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.address = address;
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
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
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
                ", score=" + score +
                ", address='" + address + '\'' +
                '}';
    }
}