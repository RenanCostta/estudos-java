public class Main {
    public static void main(String[] args) {

        // Casting Explicito
        double valorf = 1.5;
        int valorInt = (int) valorf;
        System.out.println(valorInt);


        // Casting implicito
        int meuInt = 10;
        double myDouble = meuInt;
        System.out.println(meuInt);


        //casting implicito de String para numeros (double, int)
        String myString = "150.55";
        double doubleInt = Double.parseDouble(myString);
        System.out.println(doubleInt);


    }
}