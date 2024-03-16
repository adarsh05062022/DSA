package stringBuffers;

public class buffers {
    public static void main(String[] args) {

        //constructor 1

        StringBuffer buffer  = new StringBuffer();
        buffer.append("I am anmol");
        buffer.insert(0,"Hello, ");


        buffer.replace(0,5,"RAM RAM");

        buffer.delete(0,4);
//        buffer.reverse();


        String str = buffer.toString();
        System.out.println(str);




    }
}
