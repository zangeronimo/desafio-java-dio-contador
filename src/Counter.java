public class Counter {
    public static void main(String[] args) {
        try {
            count(5, 18);
        } catch (InvalidParamException e) {
            System.out.println(e.msg);
        }
    }

    static void count(int paramOne, int paramTwo) throws InvalidParamException {
        if (paramOne > paramTwo) throw new InvalidParamException("Primeiro valor precisa ser menor que o segundo valor.");

        int counter = paramTwo - paramOne;

        for(int i = 1; i <= counter; i++) {
            System.out.println("Imprimindo o valor " + i);
        }
    }
}
