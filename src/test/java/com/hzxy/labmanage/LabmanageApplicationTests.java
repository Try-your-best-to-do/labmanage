package com.hzxy.labmanage;


import com.hzxy.labmanage.dao.UserMapper;
import com.hzxy.labmanage.model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


@SpringBootTest
class LabmanageApplicationTests {

    Logger logger = LogManager.getLogger(this.getClass());

    @Resource
    UserMapper userMapper;

    @Test
    void contextLoads() {
    }

    @Test
    public void test(){
        logger.info(userMapper.selectByUsername("大地").getUname());
    }

}
