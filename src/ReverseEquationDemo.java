public class ReverseEquationDemo {

    public static void main(String[] args) {

        String[] equations = {
                "20-3+5*2",
                "5+2*56-2/4",
                "123+45*6",
                "100/25-7"
        };


        for (int i = 0; i < equations.length; i++) {
            String input = equations[i];
            String output = EquationReverser.reverseEquation(input);

            System.out.println("Input:  " + input);
            System.out.println("Output: " + output);
            System.out.println(); // Boşluk bırakmak için
        }
    }
}