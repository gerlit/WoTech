package com.datorium.Datorium.API.DTOs;

public class Message {
    public String text;
}

package com.datorium.Datorium.API.Services;

import com.datorium.Datorium.API.DTOs.Message;

public class MessageService {
    public String add(Message message){
        return "This is a message.";
    }
}

package com.datorium.Datorium.API.Controllers;
import com.datorium.Datorium.API.DTOs.*;
import com.datorium.Datorium.API.Services.MessageService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class MessageController {

    private MessageService messageService;
    public MessageController(){
        messageService = new MessageService();
    }
    @PostMapping("/add")
    public String add(@RequestBody Message message){
        return messageService.add(message);
    }
}

http://localhost:8080/message/add
{
    "text": "Hi"
}
