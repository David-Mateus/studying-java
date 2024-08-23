package entities.poo;

public class Student {
    public String nameStudent;
    public  double note1;
    public double note2;
    public double note3;

    public  double noteEnd(){
        return note1 + note2 + note3;
    }
    public String result(){
        if(noteEnd() < 60){
            double missing = 60 - noteEnd();
            return  "FINAL GRADE = "+noteEnd() + "\n" +"FAILED" +  "MISSING " + "\n"+missing+ "POINTS";
        }else{
            return "FINAL GRADE = "+noteEnd()+"\n"+"PASS";
        }
    }


}
