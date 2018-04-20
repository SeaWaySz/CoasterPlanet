
public class Bill extends Plaything {
    
    
    Bill(){
        
        super.play.add("1.\tBlackhole Coaster");
        super.play.add("2.\tCable Car");
        super.play.add("3.\tFlying Fish");
        super.play.add("4.\tGiant Drop");
        super.play.add("5.\tGiant's House");
        
        super.play.add("6.\tGo Cart");
        super.play.add("7.\tGrand Canyon");
        super.play.add("8.\tHerricane");
        super.play.add("9.\tLighting Bird");
        super.play.add("10.\tLighting Space");
        
        super.play.add("11.\tSky Coaster");
        super.play.add("12.\tSnow Land");
        super.play.add("13.\tSuper Splash");
        super.play.add("14.\tTornado");
        super.play.add("15.\tViking");

    }
    Bill(String str){
        System.out.println(str);
    }
    
    int getPrice(int choice,int total){

        switch(choice){
            case 1 :  total = total + 40;   break;
            case 2 :  total = total + 20;    break;
            case 3 :  total = total + 40;    break;
            case 4 :  total = total + 60;    break;
            case 5 :  total = total + 50;    break;
            case 6 :  total = total + 100;    break;
            case 7 :  total = total + 100;    break;
            case 8 :  total = total + 50;    break;
            case 9 :  total = total + 40;    break;
            case 10 : total = total + 40;    break;
            case 11 : total = total + 80;    break;
            case 12 : total = total + 200;    break;
            case 13 : total = total + 80;    break;
            case 14 : total = total + 60;    break;
            case 15 : total = total + 70;    break;

        }
        return total;
    }
 
}
