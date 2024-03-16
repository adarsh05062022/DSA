package stringBuffers;
import java.util.Random;


public class RandomString {
    static String genreate(int size){
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for(int i=0;i<size;i++){
            int randomChar = random.nextInt(0,26);
            sb.append((char)(97+randomChar));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(genreate(8));
    }
}
