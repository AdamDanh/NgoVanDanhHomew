package Personcode4;

import java.util.ArrayList;

public class PersonList {
    private ArrayList<Person> personList = new ArrayList<>();

    // Thêm một người
    public void addPerson(Person person) {
        personList.add(person);
        System.out.println("Added successfully!");
    }

    // Cập nhật theo ID
    public boolean updatePersonById(String id) {
        for (Person p : personList) {
            if (p.getId().equals(id)) {
                return p.updateperson(); // gọi hàm updateperson() của đối tượng
            }
        }
        return false;
    }

    // Xoá theo ID
    public boolean deletePersonById(String id) {
        for (Person p : personList) {
            if (p.getId().equals(id)) {
                personList.remove(p);
                return true;
            }
        }
        return false;
    }

    // Tìm theo ID
    public Person findPersonById(String id) {
        for (Person p : personList) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    // Hiển thị tất cả
    public void displayAll() {
        if (personList.isEmpty()) {
            System.out.println("No data!");
            return;
        }
        for (Person p : personList) {
            p.displaydetails();
        }
    }

    // Tìm top 3 sinh viên có GPA cao nhất
    public ArrayList<Student> findTop3Students() {
        ArrayList<Student> students = new ArrayList<>();
        for (Person p : personList) {
            if (p instanceof Student) {
                students.add((Student) p);
            }
        }

        students.sort((s1, s2) -> Double.compare(s2.getGpa(), s1.getGpa())); // sắp xếp giảm dần theo GPA

        ArrayList<Student> top3 = new ArrayList<>();
        for (int i = 0; i < Math.min(3, students.size()); i++) {
            top3.add(students.get(i));
        }
        return top3;
    }

    // Tìm giáo viên có thu nhập cao nhất
    public Teacher findTeacherWithHighestIncome() {
    Teacher best = null;
    double maxIncome = 0;

    for (Person p : personList) {
        if (p instanceof Teacher) {
            Teacher t = (Teacher) p;
            double income = t.calculateincome(); // gọi đúng tên
            if (best == null || income > maxIncome) {
                best = t;
                maxIncome = income;
            }
        }
    }
    return best;
}


    // Tìm danh sách sinh viên có học bổng (gpa > 3.5)
    public ArrayList<Student> findStudentsWithScholarships() {
        ArrayList<Student> scholarshipStudents = new ArrayList<>();
        for (Person p : personList) {
            if (p instanceof Student) {
                Student s = (Student) p;
                if (s.getGpa() > 3.5) {
                    scholarshipStudents.add(s);
                }
            }
        }
        return scholarshipStudents;
    }
}
