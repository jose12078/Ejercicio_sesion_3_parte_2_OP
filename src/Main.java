public class Main {
    public static void main(String[] args) {
        coche miCoche = new  coche();
        miCoche.IncrementarPuertas();
        System.out.println(miCoche.puertas);

    }
}
class coche{
    public int puertas=3;
    public void IncrementarPuertas(){
        this.puertas++;
    }

}