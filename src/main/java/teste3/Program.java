package teste3;



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Program {

    public static void main(String[] args) {
        // Caminho para o arquivoON
        String filePath = "data.json";

        try {
            // Ler o conteúdo do arquivo JSON
            String content = new String(Files.readAllBytes(Paths.get(filePath)));

            // Criar um JSONObject a partir do conteúdo do arquivo
            JSONObject jsonObject = new JSONObject(content);

            // Obter a lista de números do JSON
            JSONArray numbersArray = jsonObject.getJSONArray("numbers");

            // Converter os valores para inteiros e exibir
            for (int i = 0; i < numbersArray.length(); i++) {
                int number = numbersArray.getInt(i);
                System.out.println("Número " + i + ": " + number);
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro ao processar o JSON: " + e.getMessage());
        }
    }
}
