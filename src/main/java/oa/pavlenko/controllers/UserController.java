package oa.pavlenko.controllers;

import oa.pavlenko.dao.UserDao;
import oa.pavlenko.model.Role;
import oa.pavlenko.model.User;
import oa.pavlenko.service.GoodsService;
import oa.pavlenko.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private GoodsService goodsService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String index(ModelMap model) {
        model.put("mes", "test-mess Spring");
        return "test";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLogin(ModelMap model) {
        return "login";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String getAllUsers(ModelMap model) {

        List<User> all = userService.findAll();
        model.addAttribute("usersList", all);
        return "usersList";
    }

    @RequestMapping(value = "/adduser", method = RequestMethod.POST)
    public String addUser(@RequestParam("name") String name,
                          @RequestParam("last_name") String lastName,
                          @RequestParam("email") String email,
                          @RequestParam("password") String password,
                          @RequestParam("age") String age,
                          @RequestParam("role") String role,
                          @RequestParam("adress") String adress,
                          ModelMap model) {
        User user = new User();
        user.setName(name);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setPassword(password);
        user.setAge(Integer.valueOf(age));
        if (role == null) user.setRole(Role.ROLE_USER);
            else user.setRole(Role.valueOf(role));
        user.setAdress(adress);

        userService.create(user);
        model.addAttribute("usersList", userService.findAll());
        return "usersList";

    }

    @RequestMapping(value = "/user/id/{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public UserDao findUserById(@PathVariable("id") Long id) {
        return (UserDao) userService.findById(id);
    }

    @RequestMapping(value = "/user/update", method = RequestMethod.POST)
    public String updateUser(@RequestParam("id") String id,
                             @RequestParam("name") String name,
                             @RequestParam("last_name") String lastName,
                             @RequestParam("email") String email,
                             @RequestParam("password") String password,
                             @RequestParam("age") String age,
                             @RequestParam("role") String role,
                             @RequestParam("adress") String adress,
                             ModelMap model) {
        User user = userService.findById(Long.valueOf(id));
        if (name != null) user.setName(name);
        if (lastName != null) user.setLastName(lastName);
        if (email != null) user.setEmail(email);
        if (password != null) user.setPassword(password);
        if (age != null) user.setAge(Integer.valueOf(age));
        if (role != null) user.setRole(Role.valueOf(role));
        if (adress != null) user.setAdress(adress);
        userService.update(user);
        model.addAttribute("usersList", userService.findAll());
        return "usersList";
    }

    @RequestMapping(value = "/user/delete", method = RequestMethod.POST)
    public void deleteUser(User user) {
        userService.delete(user);

    }
}
