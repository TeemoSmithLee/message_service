package com.pulingle.message_service.web;

import com.pulingle.message_service.domain.dto.RespondBody;
import com.pulingle.message_service.domain.entity.Message;
import com.pulingle.message_service.service.MessageService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by @杨健 on 2018/4/1 18:00
 *
 * @Des:
 */
@RestController
@RequestMapping(value = "message")
public class MessageController {
    @Resource
    MessageService messageService;

    /**
    * @param: sendUserId,receUserId,content,type
    * @return: RespondBody
    * @Des: 发送消息接口
    */
    @RequestMapping(value = "/send",method = RequestMethod.POST)
    public RespondBody sendMessage(@RequestBody Message message){
        return messageService.sendMessage(message);
    }
}
