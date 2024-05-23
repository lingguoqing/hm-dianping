package com.hmdp.controller;


import com.hmdp.dto.Result;
import com.hmdp.service.IFollowService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author 虎哥
 * @since 2021-12-22
 */
@RestController
@RequestMapping("/follow")
public class FollowController {

    @Resource
    private IFollowService followService;

    @PutMapping("/{id}/{isFollow}")
    public Result follow(@PathVariable Long followUserId, @PathVariable Boolean isFollow) {
        return followService.follow(followUserId,isFollow);
    }

    /**
     * 是否被关注
     *
     * @param followUserId
     * @return
     */
    @PutMapping("/or/not/{id")
    public Result isfollow(@PathVariable Long followUserId) {
        return followService.isfollow(followUserId);
    }

    @GetMapping("/common/{id}")
    public  Result followsCommons(@PathVariable("id") Long id)
    {
        return  followService.followsCommons(id);
    }

}
