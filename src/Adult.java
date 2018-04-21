
import java.util.Scanner;
public class Adult extends Ad_Calculator implements AllTK,SelectTK {
    
   public int AAllTK,ASelectTK;
   public int TotalAll,TotalSelect;
   private int Total,AAdult;
   Scanner input = new Scanner(System.in);
       
   Adult(){
       super("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n:::::::::::::::::::Ticket Seller System:::::::::::::::::::::\n::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
       printTop();
       print();
   }
   
   public void getAmountAdult(){
       System.out.println("\n:::::::::::::::::::::::::: Adult Ticket :::::::::::::::::::::::::::");
    do{   
       System.out.print("Enter Amount of Adult : ");
       AAdult = input.nextInt();
    }while(AAdult < 0);
    if(AAdult > 0){
       do{
                System.out.print("How many All ticket : ");
                AAllTK = input.nextInt();
                System.out.print("How many Select ticket : ");
                ASelectTK = input.nextInt();
            if((AAllTK + ASelectTK)!= AAdult){
                    System.out.println("========== Try again ==========");
            }
       }while((AAllTK + ASelectTK)!= AAdult);
    }   
   }
   
   public void AdultAllTK(){
       TotalAll = AllTKCal(AAllTK);
   }
   public void AdultSeTK(){
       if(ASelectTK > 0){
            TotalSelect = SelectTKCal(ASelectTK);
       }
   }
   
   void print(){
   
       getAmountAdult();
       AdultAllTK();
       AdultSeTK();
       Total = TotalAll + TotalSelect;
       
   }
   
   void printTop(){   
       printRec();   
   }
   
   public void setTotal(int total){
       Total = total;
   }
   public int getTotal(){
       return Total;
   }
   
   public void setAAdult(int amount){
       AAdult = amount;
   }
   public int getAAdult(){
       return AAdult;
   }
   
   public void ChildAllTK(){}
   public void ChildSeTK(){}

   
}

