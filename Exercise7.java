public class Exercise7 {
    public static void main(String[] args) {
        System.out.println("list of narcissistic number :");
        for (int i = 0; i < 1000; i++) {
            int ones =i%10;
            int tens =(i%100)/10;
            int hundreds = i/100;
            if (hundreds==0){
                int sum = (tens*tens+ones*ones);
                      if (i==sum){
                          System.out.print(i + " ");
                      } else if (tens==0) {
                          sum = (ones);
                          if (i==sum) {
                              System.out.print(i + " ");
                          }
                      }
                  }else{
                      int sum = (hundreds*hundreds*hundreds+tens*tens*tens+ones*ones*ones);
                      if (i==sum) {
                          System.out.print(i + " ");
                      }
                  }
              }
    }
}
