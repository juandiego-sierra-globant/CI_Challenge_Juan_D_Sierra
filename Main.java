public class Main {
    public static void main(String[] args) {
        String variableValue = System.getenv("variableName");
        System.out.println("Mensaje con variable de entorno: " + variableValue);
    }
}