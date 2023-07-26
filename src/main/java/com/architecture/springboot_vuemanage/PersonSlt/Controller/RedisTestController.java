package com.architecture.springboot_vuemanage.PersonSlt.Controller;

import com.architecture.springboot_vuemanage.util.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author xdf
 * @version 1.0
 * @date 2022/3/24 20:47
 */
@RestController
@RequestMapping(value = "/api")
public class RedisTestController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RedisUtil redisUtil;

    @PostMapping("/redis")
    public void addDataToRedis(@RequestBody Map<String, Object> map, @RequestParam("flag") int flag) {
        if (flag == 1) {
            for (String idKey : map.keySet()) {
                redisUtil.set(idKey, map.get(idKey), 120);
            }
        } else {
            dataCalculation(map);
        }
    }

    private void dataCalculation(Map<String, Object> map) {
        // 传来一个id里面的数量集合
        for (String s : map.keySet()) {
            // 新数据
            Map<String, String> sizeNewMap = (Map<String, String>) map.get(s);
            // 老数据
            Map<String, String> sizeOldMap = (Map<String, String>) redisUtil.get(s);
            for (String oldValue : sizeOldMap.keySet()) {
                for (String newValue : sizeNewMap.keySet()) {
                    if (oldValue.equals(newValue)) {
                        int oldData = Integer.parseInt(sizeOldMap.get(oldValue));
                        int newData = Integer.parseInt(sizeNewMap.get(newValue));
                        newData += oldData;
                        sizeOldMap.put(oldValue, String.valueOf(newData));
                    }
                }
            }
            redisUtil.set(s,sizeOldMap);
        }
    }

}
