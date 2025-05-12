package rest;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/chat")
public class ChatResource {
    private static final List<String> messages = new ArrayList<>();

    @POST
    @Path("/send")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public void sendMessage(@FormParam("username") String username, @FormParam("message") String message) {
        messages.add(username + ": " + message);
    }

    @GET
    @Path("/messages")
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> getMessages() {
        return new ArrayList<>(messages);
    }
}