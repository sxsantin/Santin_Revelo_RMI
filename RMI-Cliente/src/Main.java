import java.rmi.Naming;

public class Main {
    public static void main(String[] args) {
        try {
            // Dirección IP del servidor RMI (reemplazar con la IP del servidor)
            String serverAddress = "//10.40.12.220/HelloService";

            // Localizar el servicio remoto
            IHelloService helloService = (IHelloService) Naming.lookup(serverAddress);

            // Invocar el método remoto
            String response = helloService.sayHello("Juan");
            System.out.println("Respuesta del servidor: " + response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}