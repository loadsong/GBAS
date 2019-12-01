package com.service.core;

import java.io.IOException;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Date： created in 15:56 2019/11/23
 */
@Component
public class ProductExpireTask {

    @Scheduled(fixedRate = 2000)
    public void productExpire() throws IOException {

        String[] strs = {"Test随机消息 ：30.1123",
                "Test随机消息 ：32.1021",
                "Test随机消息 ：33.1774",
                "Test随机消息 ：33.2372",
                "Test随机消息 ：31.0281",
                "Test随机消息 ：30.0222",
                "Test随机消息 ：32.1322",
                "Test随机消息 ：33.3221",
                "Test随机消息 ：31.2311",
                "Test随机消息 ：32.3112"};

        ProductWebSocket.sendInfo(strs.toString());

    }

}