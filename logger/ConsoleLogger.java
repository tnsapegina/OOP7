package JavaIntermediateCert.logger;

public class ConsoleLogger implements Logable{
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
