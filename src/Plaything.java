
import java.util.ArrayList;

abstract class Plaything extends PrintReciept {
        
        ArrayList play = new ArrayList();
        abstract void printRe();       
}



interface AllTK{
    public void ChildAllTK();
    public void AdultAllTK();
}

interface SelectTK{
    public void ChildSeTK();
    public void AdultSeTK();
}