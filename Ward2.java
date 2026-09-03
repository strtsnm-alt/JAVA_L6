public class Ward2 extends Ward{
    int wardno = 2;
    static String location = "Near Entrance";
    Doctor doctorInCharge; 

    Ward2(Doctor d){
        this.doctorInCharge = d;
    }
    int getWardNo(){
        return this.wardno;
    }

}
