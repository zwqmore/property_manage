package com.zwq.ssm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zwq.ssm.constant.PropertyMsg;
import com.zwq.ssm.mapper.BsStreetMapper;
import com.zwq.ssm.pojo.BsStreet;
import com.zwq.ssm.pojo.BsStreetExample;
import com.zwq.ssm.pojo.UserExample;
import com.zwq.ssm.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * description: 街道控制层
 *
 * @author zwq
 * @date 2021/12/16 23:09
 */
@RestController
@RequestMapping("/street")
public class BsStreetController extends BaseController{

    @Autowired
    private BsStreetMapper bsStreetMapper;


    @RequestMapping(value = "/getStreetList", method = RequestMethod.GET)
    public PropertyMsg listUsersAll(HttpServletRequest request, @RequestParam String areaCode) {
        if(areaCode == null || "".equals(areaCode)) {
            return PropertyMsg.wrong("参数异常");
        }
        BsStreetExample bsStreetExample = new BsStreetExample();
        bsStreetExample.createCriteria().andAreaCodeEqualTo(areaCode);
        List<BsStreet> lists = bsStreetMapper.selectByExample(bsStreetExample);
        return PropertyMsg.ok(lists);
    }


}
