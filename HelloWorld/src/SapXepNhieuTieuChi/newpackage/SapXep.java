package SapXepNhieuTieuChi.newpackage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class SapXep {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("b", 18, 5.5, "DN"));
        students.add(new Student("a", 20, 9.5, "BF"));
        students.add(new Student("b", 15, 7.5, "HF"));
        students.add(new Student("c", 21, 3.5, "SF"));
//        students.sort(Comparator.comparing(o -> ((Student)o).getName())
//                .thenComparing(o -> ((Student)o).getScore()));
//        // Collections sort
//        Collections.sort(students, Comparator.comparing(o -> ((Student)o).getName())
//                .thenComparing(o -> ((Student)o).getScore()));
//        students.forEach(s -> System.out.println(s.toString()));
// Collections sort
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        students.forEach(s -> System.out.println(s));
    }
//     @Override
//    public void f3(List<Car> t) {
//        t.sort((o1, o2) -> {
//            if (o1.getMaker().compareTo(o2.getMaker()) < 0) {
//                return -1;
//            } else {
//                return -(o1.getRate() - o2.getRate());
//            }
//
//        });
//
//    }

}