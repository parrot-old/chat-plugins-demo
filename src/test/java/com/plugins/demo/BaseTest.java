package com.plugins.demo;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author songbg
 * @since 2022/9/7 11:02
 */
@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public abstract class BaseTest {

    private long timestamp = System.currentTimeMillis();

    protected long getSortTime() {
        return timestamp++;
    }
}
