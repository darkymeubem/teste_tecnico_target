package teste3;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        try (InputStream inputStream = Program.class.getClassLoader().getResourceAsStream("numbers.json");
             Scanner scanner = new Scanner(new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {
            Locale.setDefault(new Locale("en", "US"));
            // Lê o conteúdo do arquivo JSON
            String jsonText = scanner.useDelimiter("\\A").next();

            // Cria um JSONArray a partir do texto JSON
            JSONArray jsonArray = new JSONArray(jsonText);


            int dia [] = new int[30];
            double valor[] = new double[30];
            int dias_uteis = 0;
            double MAIOR_FATURAMENTO = 0;
            double MENOR_FATURAMENTO = 1000000;
            double MEDIA_FATURAMENTO = 0;
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                dia[i] = jsonObject.getInt("dia");
                valor[i] = jsonObject.getDouble("valor");
                if(valor[i] != 0) {
                    MEDIA_FATURAMENTO += valor[i];
                    dias_uteis++;
                }
                if(MAIOR_FATURAMENTO < valor[i]){
                    MAIOR_FATURAMENTO = valor[i];
                }
                if(MENOR_FATURAMENTO > valor[i]){
                    MENOR_FATURAMENTO = valor[i];
                }
            }
            int a = 0;
            MEDIA_FATURAMENTO = MEDIA_FATURAMENTO/dias_uteis;
            for (int i = 0; i < jsonArray.length(); i++) {
                if(valor[i] > MEDIA_FATURAMENTO){
                    a++;
                }
            }

            System.out.printf("A média do faturamento mensal foi de R$%.2f, a quantidade de dias maiores que a média  foi de %d no total.\nO maior faturamento foi de R$%.2f e o menor faturamento foi de R$%.2f",MEDIA_FATURAMENTO,a,MAIOR_FATURAMENTO,MENOR_FATURAMENTO);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
