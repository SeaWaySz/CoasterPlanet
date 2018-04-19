import java.util.Scanner;
public class Child extends Ch_Calculator implements AllTK,SelectTK {
   
   int CAllTK,CSelectTK,CantSelect;
   int CTotalAll,CTotalSelect,CTotalCantSelect;
   private int Total,AChild;
   Scanner input = new Scanner(System.in);
   
   void getAmountChild(){
       
       System.out.print("Enter Amount of Child : ");
       AChild = input.nextInt();
       do{
       System.out.print("How many All ticket : ");
       CAllTK = input.nextInt();
       System.out.print("How many Select ticket : ");
       CSelectTK = input.nextInt();
            if((CAllTK + CSelectTK)!= AChild){
                    System.out.println("======== Try again ========");
            }
       }while((CAllTK + CSelectTK)!= AChild);
       
   }
  
   public void ChildAllTK(){
       CTotalAll = CAllTKCal(CAllTK);
   }
   
   public void ChildSeTK(){
       if(CSelectTK > 0){
       CantSelect = Maturement(CSelectTK);
       CSelectTK = CSelectTK - CantSelect;
       CTotalSelect = CSelectTKCal(CSelectTK);
       CTotalCantSelect = CSelectTKDontMatchCal(CantSelect);
       }
   }
   
   int Maturement(int amount){
       int amount2 = 0;
       System.out.println("====== High Maturement Pls wait ======");
       for(int i = 1 ; i <= amount ; i++){
           System.out.println("======================================");
       }
       do{
       System.out.print("How many child who can't select all plaything : ");
       amount2 = input.nextInt();
       }while(amount2 > amount && amount2 < 0);
       return amount2;
   }
   
   
   void print(){
       getAmountChild();
       ChildAllTK();
       ChildSeTK();
       this.Total = CTotalAll + CTotalSelect + CTotalCantSelect;
       System.out.println("Total is : " + this.Total);
   }
   
   public void setTotal(int total){
       Total = total;
   }
   public int getTotal(){
       return Total;
   }
   
   public void setAAdult(int amount){
       AChild = amount;
   }
   public int getAAdult(){
       return AChild;
   }
   
   
   public void AdultAllTK(){}
   public void AdultSeTK(){}
}
