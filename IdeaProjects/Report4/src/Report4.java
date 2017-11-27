public class Report4 {
    public static void main(String[] args) {
        String str = "3．14";
        Double value;
        try {
            value = Double.parseDouble(str);
        }catch (NullPointerException e) {
            System.out.println("NullPointerExceptionが発生しました");
            System.out.println(e.getMessage());
        }
    }
}
