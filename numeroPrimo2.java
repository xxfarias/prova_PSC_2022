// Numeros primos de 1 até 1000
public class quesetao1_numeroPrimo{
 

    static void prime_N(int N)
    {
        // Declaração de variavéris
        int x, y, flg;

        System.out.println(
            "Todos os números primos entre 0 e 1000 são:");
 
        for (x = 1; x <= 1000; x++) {
 
            if (x == 1 || x == 0)
                continue;
            flg = 1;
 
            for (y = 2; y <= x / 2; ++y) {
                if (x % y == 0) {
                    flg = 0;
                    break;
                }
            }
            // Se flag é 1 então x é primo
            // Se flag é 0 então x não é primo
            if (flg == 1)
                System.out.print(x + " ");
        }
    }
 
    public static void main(String[] args)
    {
        int N = 1000;
 
        prime_N(N);
    }
}
