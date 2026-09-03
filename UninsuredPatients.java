public class UninsuredPatients extends Patient{
    final int age;
    final String name;
    final String disease;
    final Ward ward;

    UninsuredPatients(String name, int age, String disease, Ward ward){
        this.age = age;
        this.name = name;
        this.disease = disease;
        this.ward = ward;
    }
    void printDetails(){
        System.out.println("Insurance Ineligible");
        System.out.println("Name : "+this.name + "\nAge : " + this.age + "\nDisease : " + this.disease + "\nWard : " + this.ward.getWardNo() + "\n\n");
    }
}
