package com.czy.Bean;

import com.sun.istack.internal.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @Author 蔡梓阳
 * @Date 2022/1/17 15:22
 */
@Data
@NoArgsConstructor
public class User {


    private long id;

    @NotNull
    private String name;

    @Max(value = 100,message = "年龄最大不能超过一百")
    @Min(value = 18,message = "年龄最小18")
    private int age;
}
