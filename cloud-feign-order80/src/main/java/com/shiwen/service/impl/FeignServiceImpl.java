package com.shiwen.service.impl;

import com.shiwen.entity.CommonResult;
import com.shiwen.service.FeignService;
import org.springframework.stereotype.Component;

/**
 * @author wangjie
 * @Title: FeignServiceImpl
 * @Description: 实现类
 * @company: 西安石文软件有限公司
 * @date 2020/10/2119:08
 */
@Component
public class FeignServiceImpl  implements FeignService {
    @Override
    public CommonResult selectOne(Long id) {
        return null;
    }

    @Override
    public CommonResult timeOutMethods() {
        return new CommonResult(200,"我是一接口的形式实现兜底方法的","====================");
    }
}
