package Controller;

import com.sumerge.program.Model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Controller {
    public static List<User> users =  Arrays.asList(new User("Hatem",1,"Cairo","a@g.com"),
            new User("Ahmed",2,"Cairo","a@g.com"),
            new User("Maged",3,"Cairo","a@g.com"),
            new User("Mohamed",4,"Cairo","a@g.com"));;

    public List<User> getAllUsers(){
        return users;
    }

    public User getSpecificUserByID(int ID){
        return users.stream().filter(user -> user.getID()==ID).collect(Collectors.toList()).get(0);
    }

    public User getSpecificUserByName(String name){
        return users.stream().filter(user -> user.getName().equals(name)).collect(Collectors.toList()).get(0);
    }

    public User getSpecificUserByEmail(String email){
        return users.stream().filter(user -> user.getEmail().equals(email)).collect(Collectors.toList()).get(0);
    }

    public User getSpecificUserByAddress(String address){
        return users.stream().filter(user -> user.getAddress().equals(address)).collect(Collectors.toList()).get(0);
    }

    public void deleteUser(int ID){
        users = (users.stream().filter(user -> user.getID()!=ID).collect(Collectors.toList()));
    }

    public void updateUser(int ID,String name, String address, String email){
        users =  users.stream().map(user -> {
            if(user.getID()==ID){
                user.setAddress(address);
                user.setEmail(email);
                user.setName(name);
                }
            return user;}).collect(Collectors.toList());
    }
    public List<User> search(String email){
        return users.stream().filter(user -> user.getEmail().contains(email)).collect(Collectors.toList());
    }
}
