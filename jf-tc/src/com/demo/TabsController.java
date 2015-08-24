package com.demo;

import com.jfinal.core.Controller;

/**
 * Created by pandaroid on 15/8/23.
 */
public class TabsController extends Controller {
    public void trainer() {
        render("trainer.html");
        // renderText("这是 tomcat 下的 indexController 的 index 页面");
    }
}
