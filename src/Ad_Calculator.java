import java.util.Scanner;
public class Ad_Calculator extends Bill {
    
    Scanner input = new Scanner(System.in);
    Listplay list = new Listplay();
    int choice,total;
    
    Ad_Calculator(){
        super();
    }
    
    Ad_Calculator(String str){
        this();
        System.out.println(str);
    }
    
    void printRec(){
       printRe();
    }
    
    int AllTKCal(int Amount){
        int total= 0;
        total = 800*Amount;
        return total;
    }
    
    int SelectTKCal(int Amount){
        int totalSe = 0;
        list.printPlayAll();
        do{
            System.out.print("Enter Customer Choice : ");
            choice = input.nextInt();
            totalSe = totalSe + getPrice(choice,total);
           
        }while(choice != 0);
        total = (450*Amount) + (totalSe * Amount);
        return total;
    }
    
}



