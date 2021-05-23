public class StatUtil {
    public static int countNegative(Value[] v) {
        int count = 0;
        for (Value item: v) {
            if(item.getValue() < 0)
                count = count + 1;
        }
        return count;
    }
}
