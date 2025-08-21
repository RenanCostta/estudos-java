package ExArray;

public class exemploArray {
    public static void main(String[] args) {

        declaracaoArray();
        percorrendoArray();
    }



    private static void declaracaoArray() {

        System.out.println("****** declaração de Array ******");

        // [] São inseridos em uma variável que referencia um array
        int[] a = new int[4];

        //OUTRA MANEIRA DE FAZER UMA DECLARAÇÃO
        int[] b;
        b = new int[6];

        //DECLARANDO VÁRIOS ARRAYS
        int[] r = new int[44], x = new int[23];

        //{} INICIALIZAR VALORES EM UM ARRAY SUA DECLARAÇÃO
        int[] iniciarValores = {12, 32, 54, 6, 8, 89, 64, 64, 6};

        // DECLARA UM ARRAY DE INTEIROS
        int[] meuArray;

        //ALOCA MEMÓRIA PARA 10 INTEIROS
        meuArray = new int[10];

        //INICIALIZA O PRIMEIRO ELEMENTO

        meuArray[0] = 100;
        meuArray[1] = 85;
        meuArray[2] = 88;
        meuArray[3] = 93;
        meuArray[4] = 123;
        meuArray[5] = 952;
        meuArray[6] = 344;
        meuArray[7] = 233;
        meuArray[8] = 622;
        meuArray[9] = 8552;

        System.out.println(meuArray[9]);
        System.out.println(meuArray[2]);
        System.out.println(meuArray.length);

        int y = meuArray.length;
        if (y > 8){
            System.out.println("Tamanhao do array: - maior que 8!");
        }
        else {
            System.out.println("Tamanhao do array: - menor que 8!");
        }
        System.out.println("Tamanhao do array: " + meuArray.length);
    }


    private static void percorrendoArray() {

        System.out.println("******* Percorrendo Array ******");

        int[] arraynum = {87, 68, 52, 49, 83, 45, 12, 64};
        for (int i = 0; i < arraynum.length; i++) {
            System.out.print(arraynum[i] + " ");
        }

        System.out.println();
        int total = 0;
        for (int i = 0; i < arraynum.length; i++) {
            total += arraynum[i];
        }
        System.out.println("todos os elementos do array somados: " + total);

    }
}
