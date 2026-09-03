public class Doctor implements MedicalProfessional {

    public String name;
    Doctor(String name){
        this.name = name;
    }
    @Override
    public void printMinReq() {
        System.out.println(MedicalProfessional.minDegree + MedicalProfessional.minExperience);
    }

}
