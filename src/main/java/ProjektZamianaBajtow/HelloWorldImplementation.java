package ProjektZamianaBajtow;

import javax.jws.WebService;
//import javax.ejb.*;

@WebService(endpointInterface = "ProjektZamianaBajtow")
public class HelloWorldImplementation implements HelloWorld {
    @Override
    public String getHelloWorld(String name) {
        return "Hello World Jax-ws" + name;
    }
}
