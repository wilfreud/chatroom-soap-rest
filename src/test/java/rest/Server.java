package rest;

import com.sun.net.httpserver.HttpServer;
// import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;
import java.net.URI;

public class Server {
    public static void main(String[] args) {
        ResourceConfig config = new ResourceConfig(ChatResource.class);
        URI uri = URI.create("http://localhost:8081/");
        // HttpServer server = JdkHttpServerFactory.createHttpServer(uri, config);
        System.out.println("REST Server running at " + uri);
    }
}