package com.acc.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


/**
 * 小程序后台定时更新token
 *
 */
@Component("tokenWebJob")
public class TokenWebJob {

	/**
	 * 每一个小时执行一次
	 */
	@Scheduled(cron = "0 0 0/1 * * ?")
	public void execute () {
	    try{
            System.out.println("===> 开始更新token");
            System.out.println("===> 结束更新token");
        }catch (Exception e){
            System.out.println("===> 更新token出错");
            e.printStackTrace();
        }

	}
}
