package logica;

public class Tablero {
    int local;
    int visitante;
    
    public Tablero(){
        this.local = 0;
        this.visitante = 0;
    }
    
    public Tablero(int local, int visitante){
        if (local < 0){
            this.local = 0;
        }
        else{
           this.local = local;
        }
        
        if (visitante < 0){
            this.visitante = 0;
        }
        else{
           this.visitante = local;
        }
        
    }

    public int getLocal() {
        return local;
    }

    public int getVisitante() {
        return visitante;
    }

    @Override
    public String toString() {
        return "Tablero{" + "local=" + local + ", visitante=" + visitante + '}';
    }
    
    public void reiniciarTablero(){
        this.visitante=0;
        this.local=0;
    }
    
    public void sumaLocal(){
        this.local++;
    }
    
    public void sumaVisita(){
        this.visitante++;
    }
    
    public void restaLocal(){
        if(this.local != 0){
            this.local--;
        }
    }
    
    public void restaVisita(){
        if(this.visitante != 0){
            this.visitante--;
        }
    }
    
    public String quienGano(){
        String resultado;
        if(this.local != this.visitante){
            if(local > visitante){
                resultado = "LOCAL GANA EL PARTIDO "+local+" A "+visitante;
            }
            else{
                resultado = "VISITANTE GANA EL PARTIDO "+visitante+" A "+local;
            }
        }
        else{
            resultado = "LOCAL Y VISITANTE EMPATAN EL PARTIDO "+local+" A "+visitante;
        }
        
        return resultado;
    }
}
