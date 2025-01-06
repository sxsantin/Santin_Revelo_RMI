package client;

import java.rmi.*;
import server.IHelloService;

public class ClientRMI {
    public static void main(String[] args) {
        try {
            // Conecta al servicio remoto registrado con el nombre "HelloService"
            IHelloService helloService = (IHelloService) Naming.lookup("rmi://localhost:1099/HelloService");

            // Invoca el método remoto
            String response = helloService.sayHello("Xavier");
            System.out.println("Respuesta del servidor: " + response);
        } catch (Exception e) {
            System.err.println("Error al conectar con el servidor RMI:");
            e.printStackTrace();
        }
    }
}
