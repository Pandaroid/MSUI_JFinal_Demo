package com.demo;

import com.jfinal.core.Controller;

/**
 * Created by Pandaroid on 2015/8/26.
 */
public class TrainerController extends Controller {
    public void trainerList() {
        render("trainerList.html");
    }

    public void get_list() {
        // www.baidu.com\/img\/bd_logo1.png","name":"\u738b\u73b2","title":"\u767d\u83dc\u600e\u4e48\u505a\u7684","description":"\u5f88\u4e0d\u9519\u7684\u8425\u517b\u5e08","ctime":"0","originprice":"5","currentprice":"10","appoint_time":{"09-02":{"info":[{"id":"7","trainer_id":"1","date":"2015-09-02","starttime":"1441155600","endtime":"1441159200","isappoint":0}],"isappoint":0}}}],"code":0,"desc":"\u64cd\u4f5c\u6210\u529f","token":"DNkrQv2fXMr5h5THpDO4w91CYSuYmEdDlw9Dqo9hBMlPkR4g-XkItzKcoPCuAJ4rh3Wi6NvJNvfbNDQ_-5n0Ig%3D%3D
        String jList = "{\"data\":[{\"id\":\"1\",\"avatar\":\"http://www.baidu.com/img/bd_logo1.png\",\"name\":\"\\u738b\\u73b2\",\"title\":\"\\u767d\\u83dc\\u600e\\u4e48\\u505a\\u7684\",\"description\":\"\\u5f88\\u4e0d\\u9519\\u7684\\u8425\\u517b\\u5e08\",\"ctime\":\"0\",\"originprice\":\"5\",\"currentprice\":\"10\",\"appoint_time\":{\"09-02\":{\"info\":[{\"id\":\"7\",\"trainer_id\":\"1\",\"date\":\"2015-09-02\",\"starttime\":\"1441155600\",\"endtime\":\"1441159200\",\"isappoint\":0}],\"isappoint\":0}}},{\"id\":\"1\",\"avatar\":\"http://www.baidu.com/img/bd_logo1.png\",\"name\":\"\\u738b\\u73b2\\u73b2\",\"title\":\"\\u767d\\u83dc\\u600e\\u4e48\\u505a\\u7684\",\"description\":\"\\u5f88\\u4e0d\\u9519\\u7684\\u8425\\u517b\\u5e08\",\"ctime\":\"0\",\"originprice\":\"5\",\"currentprice\":\"10\",\"appoint_time\":{\"09-02\":{\"info\":[{\"id\":\"7\",\"trainer_id\":\"1\",\"date\":\"2015-09-02\",\"starttime\":\"1441155600\",\"endtime\":\"1441159200\",\"isappoint\":0}],\"isappoint\":0}}}],\"code\":0,\"desc\":\"\\u64cd\\u4f5c\\u6210\\u529f\",\"token\":\"DNkrQv2fXMr5h5THpDO4w91CYSuYmEdDlw9Dqo9hBMlPkR4g-XkItzKcoPCuAJ4rh3Wi6NvJNvfbNDQ_-5n0Ig%3D%3D\"}";
        renderJson(jList);
    }
}
