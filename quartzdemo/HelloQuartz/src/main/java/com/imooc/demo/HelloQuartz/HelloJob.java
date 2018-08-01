package com.imooc.demo.HelloQuartz;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.alibaba.fastjson.JSONObject;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class HelloJob implements Job {

    public void execute(JobExecutionContext context) {
        //try {
        //Thread.sleep(5000L);
        //} catch (InterruptedException e) {
        // TODO Auto-generated catch block
        //  e.printStackTrace();
        //}
        JSONObject obj = new JSONObject();
        obj.put("name", "shicong.zhang");
        if (obj.containsKey("name")) {
            //处理业务逻辑
        }

        // 打印当前的执行时间，格式为2017-01-01 00:00:00
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Current Exec Time Is : " + sf.format(date));
        System.out.println("任务正在执行，请稍后！！！");
    }

}
