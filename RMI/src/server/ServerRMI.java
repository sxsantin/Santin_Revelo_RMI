package server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ServerRMI {
    public static void main(String[] args) {
        try {
            //Incicia el registro RMI en el puerto 1099
            LocateRegistry.createRegistry(1099);

            //Crea e instancia el servicio
            IHelloService helloService = new HelloServiceImpl();

            //Registra el servicio en el registro RMI
            Naming.rebind("HelloService", helloService);

            System.out.println("Servidor listo y escuchando en HelloService");
        } catch (MalformedURLException | RemoteException e) {
            e.printStackTrace();
        }
    }
}