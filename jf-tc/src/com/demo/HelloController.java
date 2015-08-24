package com.demo;

import com.jfinal.core.Controller;

/**
 * Created by pandaroid on 15/8/23.
 */
public class HelloController extends Controller {
    public void index() {
        renderText("欢迎来到 Pandaroid 的世界：HelloController");
    }
}
