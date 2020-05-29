package org.jeecg.modules.demo;

import org.jeecg.common.api.vo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
/**
 * 测试新的module
 * @author chengtg
 *
 */
@Slf4j
@Api(tags="新建module--jm")
@RestController
@RequestMapping("/hello2")
public class Hello2Controller  {
    @ApiOperation("测试hello方法2")
    @GetMapping(value="/")
    public Result<String> hello(){
        Result<String> result = new Result<String>();
        result.setResult("hello word!");
        result.setSuccess(true);
        return result;
    }
}
