package Encoder_Decoder;

import java.util.Base64;

class Enc_Dec_Ex1 {
    public static void main(String[] args) {
        String pass="Monish@1234";

        //Encoder...
        byte[] encode = Base64.getEncoder().encode(pass.getBytes());
        System.out.println(encode);

        //Decoder...
        byte[] decode = Base64.getDecoder().decode(encode);
        System.out.println(new String(decode));
    }
}
