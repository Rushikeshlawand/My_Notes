import java.util.Scanner;

public class Candidate {    
        int RNo;
        String Name;
        float Score;
        String Remark;

        void AssignRem(float score){

            if(score >= 50){
                Remark = "Selected";
            }else if (score <50) {
                Remark = "Not Selected";
            }
        }

        void Enter(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Roll Number");
            RNo = sc.nextInt();
            System.out.println("name");
            Name = sc.next();
            System.out.println("Score");
            Score = sc.nextFloat();
            AssignRem(Score);
        }

        void Dispay(){
            System.out.println(RNo);
            System.out.println(Name);
            System.out.println(Score);
            System.out.println(Remark);
        }


        public static void main(String[] args) {
            
            Candidate obj = new Candidate();
            obj.Enter();
            obj.Dispay();
        }
    
}
