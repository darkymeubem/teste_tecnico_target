package teste5;

public class Dominio {
    public String inverteString(String msg){
        char vect [] = new char[msg.length()];
        int a = 0;
        for(int i = msg.length() -1 ; i >=0 ;i--){
            vect[a] = msg.charAt(i);
            a++;
        }
        String str_invertida = new String(vect);
        return str_invertida;

    }
}
