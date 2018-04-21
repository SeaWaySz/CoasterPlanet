import java.util.Scanner;
public class Ch_Calculator extends Bill  {
    
    Scanner input = new Scanner(System.in);
    Listplay list = new Listplay();
    int choice;
    
    int CAllTKCal(int Amount){
        int total= 0;
        total = 650*Amount;
        return total;
    }
    
    int CSelectTKCal(int Amount){
        int total = 0;
        int totalSe = 0;
        list.printPlayAll();
        do{
            System.out.print("Enter Customer Choice : ");
            choice = input.nextInt();
            totalSe = totalSe + getPrice(choice,total);
           
        }while(choice != 0);
        total = (400*Amount) + (totalSe * Amount);
        return total;
    }
    
    int CSelectTKDontMatchCal(int Amount){
        int total = 0;
        int totalCant = 0;
        list.printPlaySome();
        do{
            System.out.print("Enter Customer Choice : ");
            choice = input.nextInt();
            switch(choice){
                case 4 : choice = 5; break;
                case 5 : choice = 6; break;
                case 6 : choice = 7; break;
                case 7 : choice = 9; break;
                case 8 : choice = 10; break;
            }
            totalCant = totalCant + getPrice(choice,total);
           
        }while(choice != 0);
        total = (200*Amount) + (totalCant * Amount);
        return total;
    }
    
    
}
