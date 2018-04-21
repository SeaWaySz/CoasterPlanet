
public class Bill extends Plaything {
    
    
    Bill(){
        
        super.play.add(".\tBlackhole Coaster");
        super.play.add(".\tCable Car");
        super.play.add(".\tFlying Fish");
        super.play.add(".\tGiant Drop");
        super.play.add(".\tGiant's House");
        
        super.play.add(".\tGo Cart");
        super.play.add(".\tGrand Canyon");
        super.play.add(".\tHerricane");
        super.play.add(".\tLighting Bird");
        super.play.add(".\tLighting Space");
        
        super.play.add(".\tSky Coaster");
        super.play.add(".\tSnow Land");
        super.play.add(".\tSuper Splash");
        super.play.add(".\tTornado");
        super.play.add(".\tViking");

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
