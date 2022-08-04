public class Main {
    public static void main(String[] args) {
        //parte 1
        int param1 = 12;
        int param2 = 13;
        int param3 = 14;
        suma(param1, param2, param3);

        //parte 2
        Coche miCoche = new Coche();
        miCoche.aumentarPuertas();

    }
    public static void suma(int a, int b, int c){
        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
    }
    static class Coche{
        public int numeroPuertas;
        public void aumentarPuertas(){
            this.numeroPuertas++;
        }
    }
}
