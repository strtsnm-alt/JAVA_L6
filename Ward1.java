public class Ward1 extends Ward{
    int wardno = 1;
    static String location = "Near Canteen";
    Doctor doctorInCharge; 

    Ward1(Doctor d){
        this.doctorInCharge = d;
    }
    int getWardNo(){
        return this.wardno;
    }
}
