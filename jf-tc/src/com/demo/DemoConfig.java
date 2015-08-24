package com.demo;

import com.jfinal.config.*;
import com.jfinal.render.ViewType;

/**
 * Created by pandaroid on 15/8/23.
 */
public class DemoConfig extends JFinalConfig {
    @Override
    public void configConstant(Constants me) {
        me.setViewType(ViewType.JSP);
        me.setDevMode(true);
    }

    @Override
    public void configRoute(Routes me) {
        me.add("/hello", HelloController.class);
        me.add("/", IndexController.class);
        me.add("/tabs", TabsController.class);
    }

    @Override
    public void configPlugin(Plugins me) {

    }

    @Override
    public void configInterceptor(Interceptors me) {

    }

    @Override
    public void configHandler(Handlers me) {

    }
}
