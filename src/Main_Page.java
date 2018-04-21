
public class Main_Page {
    public static void main(String[] args){
        
        int amount;
        double total = 0;
        
        Adult A = new Adult();
        Child C = new Child();
        C.print();
        
        
        
        amount = A.getAAdult() + C.getAChild();
        Bill B = new Bill(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n:::::::::::::::::::::::::: Reciept ::::::::::::::::::::::::::\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Adult\t" + A.getAAdult() + "\tUnit");
        System.out.println("\tAdult All Ticket\t" + A.AAllTK + "\t" + A.TotalAll + "\tTHB");
        System.out.println("\tAdult Select Ticket\t" + A.ASelectTK + "\t" + A.TotalSelect + "\tTHB");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Child\t" + C.getAChild() + "\tUnit");
        System.out.println("\tChild All Ticket\t" + C.CAllTK + "\t" + C.CTotalAll + "\tTHB");
        System.out.println("\tChild Select Ticket\t" + C.CSelectTK + "\t" + (C.CTotalSelect + C.CTotalCantSelect) + "\tTHB");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        if(amount >= 10){
            System.out.println("\tDiscount 15%\t\t" + ((A.getTotal() + C.getTotal()) * 0.15) + "\tTHB");
            total = (A.getTotal() + C.getTotal()) - ((A.getTotal() + C.getTotal()) * 0.15);
        }
        else if(amount >= 7){
            System.out.println("\tDiscount 10%\t\t" + ((A.getTotal() + C.getTotal()) * 0.10) + "\tTHB");
            total = (A.getTotal() + C.getTotal()) - ((A.getTotal() + C.getTotal()) * 0.10);
        }
        else if(amount >= 5){
            System.out.println("\tDiscount 5%\t\t" + ((A.getTotal() + C.getTotal()) * 0.05) + "\tTHB");
            total = (A.getTotal() + C.getTotal()) - ((A.getTotal() + C.getTotal()) * 0.05);
        }
        else{
            total = (A.getTotal() + C.getTotal());
        }
        
            System.out.println("::::::::::::::::::: Total is \t" + total + " :::::::::::::::::::::");
            
        B.printRe();
 
        
    }
       
   
}  

