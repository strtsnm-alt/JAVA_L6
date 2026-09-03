public class First {
    public static void main(String args[]) {
        Doctor d1 = new Doctor("Ramesh");
        Doctor d2 = new Doctor("Suresh");
        Ward w1 = new Ward1(d1);
        Ward w2 = new Ward2(d2);
        UninsuredPatients up1 = new UninsuredPatients("Kumar", 23, "Penuemonia", w1);
        up1.printDetails();

        Patient p1 = new Patient("James", 34, "Diabetes", w2);
        p1.printDetails(p1.age);
    }
}
