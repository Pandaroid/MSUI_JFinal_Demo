package com.demo;

import com.jfinal.core.Controller;

/**
 * Created by Pandaroid on 2015/8/26.
 */
public class TrainerController extends Controller {
    public void trainerList() {
        render("trainerList.html");
    }
}
