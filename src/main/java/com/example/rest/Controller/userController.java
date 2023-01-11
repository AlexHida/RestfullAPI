package com.example.rest.Controller;

import com.example.rest.Model.Usuario;
import com.example.rest.Repository.userInterfaz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class userController {
    @Autowired
    private userInterfaz userInter;

    @GetMapping(value = "/getUser")
    public List<Usuario> getUser(){
        return userInter.findAll();
    }

    @PostMapping(value = "/postUser")
    public String postUser(@RequestBody Usuario user){
        userInter.save(user);
        return "Saved User";
    }

    @PutMapping(value = "/putUser/{id}")
    public String putUser(@PathVariable long id, @RequestBody Usuario user){
        Usuario updatedUser = userInter.findById(id).get();
        updatedUser.setNombre(user.getNombre());
        updatedUser.setDescripcion(user.getDescripcion());
        userInter.save(updatedUser);
        return "Update User";
    }

    @DeleteMapping(value = "/deleteUser/{id}")
    public String deleteUser(@PathVariable long id){
        Usuario deletedUser = userInter.findById(id).get();
        userInter.delete(deletedUser);
        return "Deleted User";
    }
}