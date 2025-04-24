package controller;
import models.Persona;
public class PersonaController {
    public void sortByDireccionCodigo(Persona[] personas){
        int n= personas.length;
        int indiceMax;
        Persona temp;
        for(int i=0;i<n-1;i++){
            indiceMax=i;
            for (int j=i+1;j<n;j++){
                if(personas[j].getCodigoDireccion()<personas[indiceMax].getCodigoDireccion()){
                    indiceMax=j;
                }
            }
            if (indiceMax!=i){
                temp=personas[i];
                personas[i]=personas[indiceMax];
                personas[indiceMax]=temp;
            }
        }
        
    }
    public Persona findByCodigo(Persona[] personas, int codigo){
        int bajo=0;
        int alto=personas.length -1;
        while (bajo<=alto) {
            int medio = (bajo+alto)/2;
            if (personas[medio].equalsByCodigoDireccion(codigo)==true){
                return personas[medio];
            }else if(personas[medio].getCodigoDireccion()>codigo){
                alto = medio - 1;
            }else{
                bajo = medio + 1;
            }
        }return null;
    }
}
