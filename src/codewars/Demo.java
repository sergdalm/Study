package codewars;

public class Demo {
    public static void main(String[] args) {
//        Troll t = new Troll();
//        System.out.println(t.disemvowel("This website is for losers LOL"));
//
//        System.out.println(Likes.whoLikesIt("Alish", "Sandra", "Karen", "Nick"));
//
//        System.out.println(PinCode.validatePin("4494"));
//
//        int[] arrInt = {20,10,-80,10,10,15,35};
//        System.out.println(EqualsIndex.findEvenIndex(arrInt));
        int[] array = ArrayDiff.arrayDiff(new int [] {5,4}, new int[] {5});
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
