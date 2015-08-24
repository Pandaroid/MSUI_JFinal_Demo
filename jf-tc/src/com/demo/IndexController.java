package com.demo;

import com.jfinal.core.Controller;

/**
 * Created by pandaroid on 15/8/23.
 */
public class IndexController extends Controller {
    public void index() {
        render("index.html");
        // renderText("这是 tomcat 下的 indexController 的 index 页面");
    }
}
