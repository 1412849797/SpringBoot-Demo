package com.czy.Controller;

import com.czy.Bean.User;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @Author 蔡梓阳
 * @Date 2022/1/17 15:23
 */
@RestController
@RequestMapping(value = "/users")
public class UserController {
    static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());

    /**
     *  处理"/users/"的GET请求，用来获取用户列表
     * @return
     */
    @GetMapping("/")
    public List<User> getUserList(){

        List<User> r = new ArrayList<>(users.values());
        return r;
    }

    @PostMapping("/")
    public String postUser(@RequestBody User user){
        //@RequestBody 获取请求中的json数据并解析赋值给user,json中的key要跟user的属性一样才能赋值
        users.put(user.getId(),user);
        return "success";
    }
    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id){
        return  users.get(id);
    }
}
