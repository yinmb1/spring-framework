package com.luban;


import com.luban.service.*;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@ComponentScan("com.luban")
@EnableAspectJAutoProxy
public class AppConfig extends LubanParent implements LubanInterface {


}
