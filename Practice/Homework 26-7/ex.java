public class ex {

    int coin(int[] array, int money) {
        int count = 0;
        int i = array.length - 1;  

        while (money > 0) {
            if (array[i] <= money) {
                money = money - array[i];
                count++;
            } else {
                i--;  
            }
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        ex obj = new ex();
        int array[] = { 1, 2, 5, 10, 50, 100 };
        int money = 101;
        obj.coin(array, money);
    }
}
