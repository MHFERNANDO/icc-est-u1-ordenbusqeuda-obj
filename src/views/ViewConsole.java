package views;
import models.Persona;
public class ViewConsole {
    public void printArrary(Persona[] personas){
        for (int i=0; i<personas.length; i++){
            System.out.println(personas[i].toString());
        }
    }
}
