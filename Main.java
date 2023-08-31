public class Main {
    public static void main(String[] args) {
        String variableValue = System.getenv("variableName");
        System.out.println("Mensaje con variable de entorno: " + variableValue);
        Album album1 = new Album("Midnights","13");
        System.out.println("Message with new class called: " + album1.getName() + "And environemnt variable" + variableValue);
    }
}