package Rest;
import Controller.Controller;


import javax.enterprise.context.RequestScoped;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.util.logging.Level.SEVERE;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@RequestScoped
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
@Path("users")
public class UserService {
    private static final Logger LOGGER = Logger.getLogger(UserService.class.getName());

    private Controller db = new Controller();

    @GET
    public Response getAllStudents() {
        try {
            return Response.ok().
                    entity(db.getAllUsers()).
                    build();
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, e.getMessage(), e);
            return Response.serverError().
                    entity(e.getClass() + ": " + e.getMessage()).
                    build();
        }
    }

    @GET
    @Path("id/{id}")
    public Response getSpecificStudentByID(@PathParam("id") int id){
        try {
            return Response.ok().
                    entity(db.getSpecificUserByID(id)).
                    build();
        } catch (Exception e) {
            LOGGER.log(SEVERE, e.getMessage(), e);
            return Response.serverError().
                    entity(e.getClass() + ": " + e.getMessage()).
                    build();
        }
    }

    @GET
    @Path("email/{email}")
    public Response getSpecificStudentByEmail(@PathParam("email") String email){
        try {
            return Response.ok().
                    entity(db.getSpecificUserByEmail(email)).
                    build();
        } catch (Exception e) {
            LOGGER.log(SEVERE, e.getMessage(), e);
            return Response.serverError().
                    entity(e.getClass() + ": " + e.getMessage()).
                    build();
        }
    }

    @GET
    @Path("address/{address}")
    public Response getSpecificStudentByAddress(@PathParam("address") String address){
        try {
            return Response.ok().
                    entity(db.getSpecificUserByAddress(address)).
                    build();
        } catch (Exception e) {
            LOGGER.log(SEVERE, e.getMessage(), e);
            return Response.serverError().
                    entity(e.getClass() + ": " + e.getMessage()).
                    build();
        }
    }
    @GET
    @Path("name/{name}")
    public Response getSpecificStudentByName(@PathParam("name") String name){
        try {
            return Response.ok().
                    entity(db.getSpecificUserByName(name)).
                    build();
        } catch (Exception e) {
            LOGGER.log(SEVERE, e.getMessage(), e);
            return Response.serverError().
                    entity(e.getClass() + ": " + e.getMessage()).
                    build();
        }
    }

    @GET
    @Path("delete/{id}")
    public Response deleteSpecificUser(@PathParam("id") int id){
        try {
            db.deleteUser(id);
            return Response.ok().
                    entity("Deleted").
                    build();
        } catch (Exception e) {
            LOGGER.log(SEVERE, e.getMessage(), e);
            return Response.serverError().
                    entity(e.getClass() + ": " + e.getMessage()).
                    build();
        }
    }
    @GET
    @Path("update/{id}")
    public Response updateUser(@PathParam("id") int id,@QueryParam("name") String name,@QueryParam("address") String address,@QueryParam("email") String email){
        try {
            db.updateUser(id,name,address,email);
            return Response.ok().
                    entity("Updated").
                    build();
        } catch (Exception e) {
            LOGGER.log(SEVERE, e.getMessage(), e);
            return Response.serverError().
                    entity(e.getClass() + ": " + e.getMessage()).
                    build();
        }
    }
    @GET
    @Path("search")
    public Response search(@QueryParam("email") String email){
        try {

            return Response.ok().
                    entity(db.search(email)).
                    build();
        } catch (Exception e) {
            LOGGER.log(SEVERE, e.getMessage(), e);
            return Response.serverError().
                    entity(e.getClass() + ": " + e.getMessage()).
                    build();
        }
    }
}