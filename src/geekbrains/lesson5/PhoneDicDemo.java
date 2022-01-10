package GeekBrains.lesson5;

public class PhoneDicDemo {
    public static void main(String[] args) {
        PhoneDic pd = new PhoneDic();
        pd.add("Mark", "16374849");
        pd.add("Stive", "674947347");
        pd.add("Mark", "95848474");

        pd.get("Mark");
    }
}
