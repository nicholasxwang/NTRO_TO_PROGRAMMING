public class pi {
    public static void main(String[] args){
        //π/4 = 1 - 1/3 + 1/5 - 1/7 +1/9 + ...
        boolean add = true;
        double pi = 0;
        int number = 1;
        for (int i = 0; i<100; i++){
            if (add)
//                pi+= (1 / number);
                pi+= (1.0000000 / number);
            else
//                pi-=(1/number);
                pi-= (1.0000000 / number);
            add = !add;
            number += 2;
            System.out.println(pi);

        }
    }
}
