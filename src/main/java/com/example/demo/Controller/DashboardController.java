package com.example.demo.Controller;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * @author hetong.zhang
 * @version 1.0
 * @date 2021/1/17
 */
@Controller
public class DashboardController {

    @Resource
    private UserMapper userMapper;

    @GetMapping("list")
    public String toListPage(@RequestParam(required = false) String filter,
                             Model model){
        List<User> userList = userMapper.getUserAll(filter);
        model.addAttribute("userList", userList);
        return "list";
    }

    @GetMapping("userPage")
    public String toUserAddPage(){
        return "userPage";
    }

    @GetMapping("userPage/{id}")
    public String toUserEditPage(@PathVariable int id,
                                 Model model){
        User user = userMapper.getUser(id);
        model.addAttribute("user",user);
        return "userPage";
    }

    @PostMapping("user/add")
    public String addUser(User user){
        userMapper.createUser(user);
        return "redirect:/list";
    }

    @PostMapping("user/update")
    public String updateUser(User user){
        userMapper.updateUser(user);
        return "redirect:/list";
    }


    @PostMapping("/user/delete/{id}")
    public String delUser(@PathVariable int id) {
        userMapper.deleteUser(id);
        return "redirect:/list";
    }

}
