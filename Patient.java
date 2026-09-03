public class Patient extends PatientProps {
    private static final Ward NullType = null;
    final int age;
    final String name;
    final String disease;
    final Ward ward;

    Patient(){
        this.age = 0;
        this.name = "";
        this.disease = "";
        this.ward = NullType;
    }
    Patient(String name, int age, String disease, Ward ward){
        this.age = age;
        this.name = name;
        this.disease = disease;
        this.ward = ward;
    }

    //method overloading
    void printDetails(){
        System.out.println("Name : "+name + "\nAge : " + this.age + "\nDisease : " + this.disease + "\nWard : " + this.ward.getWardNo() + "\n\n");
    }

    void printDetails(int age){
        if (age>14 && age<50)
            System.out.println("Insurance Eligible");
        printDetails();
    }
}
