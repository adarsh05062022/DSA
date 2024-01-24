package string;

public class learningStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Anmol");
//        sb.append(" Dubey");
        sb.insert(sb.length(),"Dubey ");

        System.out.println(sb);
    }
}
