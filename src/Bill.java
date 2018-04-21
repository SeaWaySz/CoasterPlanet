
public class Bill extends Plaything {
    
    
    Bill(){
        
        super.play.add(".\tBlackhole Coaster 40 BTH.");
        super.play.add(".\tCable Car\t20 THB. ");
        super.play.add(".\tFlying Fish\t40 THB.");
        super.play.add(".\tGiant Drop\t60 THB.");
        super.play.add(".\tGiant's House\t50 THB.");
        
        super.play.add(".\tGo Cart\t\t100 THB.");
        super.play.add(".\tGrand Canyon\t100 THB.");
        super.play.add(".\tHerricane\t50 THB.");
        super.play.add(".\tLighting Bird\t40 THB.");
        super.play.add(".\tLighting Space\t40THB.");
        
        super.play.add(".\tSky Coaster\t80 THB.");
        super.play.add(".\tSnow Land\t200THB.");
        super.play.add(".\tSuper Splash\t80THB.");
        super.play.add(".\tTornado\t\t60 THB.");
        super.play.add(".\tViking\t\t40THB.");

    }
   
    
    
    int getPrice(int choice,int total){

        switch(choice){
            case 1 :  total = total + 40;       break;
            case 2 :  total = total + 20;       break;
            case 3 :  total = total + 40;       break;
            case 4 :  total = total + 60;       break;
            case 5 :  total = total + 50;       break;
            case 6 :  total = total + 100;      break;
            case 7 :  total = total + 100;      break;
            case 8 :  total = total + 50;       break;
            case 9 :  total = total + 40;       break;
            case 10 : total = total + 40;       break;
            case 11 : total = total + 80;       break;
            case 12 : total = total + 200;      break;
            case 13 : total = total + 80;       break;
            case 14 : total = total + 60;       break;
            case 15 : total = total + 70;       break;

        }
        return total;
    }
    
    void printRe(){
            System.out.println("\n\t\tAdult All Ticket\t\t800 THB.");
            System.out.println("\t\tAdult Select Ticket\t\t450 THB.");
            System.out.println("\t\tChild All Ticket\t\t650 THB.");
            System.out.println("\t\tChild Select Ticket\t\t400 THB.");
            System.out.println("\t\tChild Hight less than 130\t450 THB.");
    };
}
