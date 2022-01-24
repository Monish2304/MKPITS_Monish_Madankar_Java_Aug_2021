import java.util.Base64;

class Enc_Dec{
    byte[] encFun(String name){
        byte[] encode = Base64.getEncoder().encode(name.getBytes());
        return encode;
    }

    String decFun(byte[] encodeddata){
        byte[] decode = Base64.getDecoder().decode(encodeddata);
         return new String(decode);
    }
}

public class Enc_Dec_Using_Class {
    public static void main(String[] args) {
        String password ="Monish@1234";
        Enc_Dec ob=new Enc_Dec();

        byte[] encFun = ob.encFun(password);
        System.out.println(encFun);

        String decFun = ob.decFun(encFun);
        System.out.println(decFun);
    }
}
