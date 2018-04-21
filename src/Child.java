import java.util.Scanner;
public class Child extends Ch_Calculator implements AllTK,SelectTK {
   
   public int CAllTK,CSelectTK,CantSelect;
   public int CTotalAll,CTotalSelect,CTotalCantSelect;
   private int Total,AChild;
   Scanner input = new Scanner(System.in);
   
   void getAmountChild(){
       System.out.println("\n:::::::::::::::::::::::::: Child Ticket :::::::::::::::::::::::::::");
    do{   
       System.out.print("Enter Amount of Child : ");
       AChild = input.nextInt();
    }while(AChild < 0);   
    if(AChild > 0){
       do{
       System.out.print("How many All ticket : ");
       CAllTK = input.nextInt();
       System.out.print("How many Select ticket : ");
       CSelectTK = input.nextInt();
            if((CAllTK + CSelectTK)!= AChild){
                    System.out.println("========== Try again ==========");
            }
       }while((CAllTK + CSelectTK)!= AChild);
    }
   }
  
   public void ChildAllTK(){
       this.CTotalAll = CAllTKCal(CAllTK);
   }
   
   public void ChildSeTK(){
       
       if(this.CSelectTK > 0){
            this.CantSelect = Maturement(CSelectTK);
            this.CSelectTK = CSelectTK - CantSelect;
          if(this.CSelectTK > 0){
              
                    this.CTotalSelect = CSelectTKCal(CSelectTK);
                    
          }
          
       if(this.CantSelect > 0){
           
            this.CTotalCantSelect = CSelectTKDontMatchCal(this.CantSelect);
            
       }
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
       }while(amount2 > amount || amount2 < 0);
       return amount2;
   }
   
   
   void print(){
       getAmountChild();
       ChildAllTK();
       ChildSeTK();
       this.Total = this.CTotalAll + this.CTotalSelect + this.CTotalCantSelect;
       
   }
   
   public void setTotal(int total){
       Total = total;
   }
   public int getTotal(){
       return Total;
   }
   
   public void setAChild(int amount){
       AChild = amount;
   }
   public int getAChild(){
       return AChild;
   }
   
   
   public void AdultAllTK(){}
   public void AdultSeTK(){}
}
