public class Point {
    private int puntoX;
    private int puntoY;

    public Point(){
        this.puntoX=0;
        this.puntoY=0;
    }//inizializzazione delle variabili

    public Point(int puntoX, int puntoY) {
        if(puntoX>=0 && puntoX<=1000){
            this.puntoX = puntoX;
            if(puntoY>=0 && puntoY<=1000){
                this.puntoY = puntoY;
            }
        }
    }//metodo costruttore

    public void setPuntoX(int puntoX) {
        this.puntoX = puntoX;
    }

    public void setPuntoY(int puntoY) {
        this.puntoY = puntoY;
    }//vengono usati i metodi set per inizializzare i punti all origine come richiesto

    public int getPuntoX() {
        return puntoX;
    }

    public int getPuntoY() {
        return puntoY;
    }
}