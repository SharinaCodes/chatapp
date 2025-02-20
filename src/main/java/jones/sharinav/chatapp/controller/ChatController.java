package jones.sharinav.chatapp.controller;

import jones.sharinav.chatapp.model.ChatForm;
import jones.sharinav.chatapp.service.MessageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ChatController {
    private final MessageService messageService;

    public ChatController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/chat")
    public String getChatPage(@ModelAttribute("chatForm") ChatForm chatForm, Model model) {
        model.addAttribute("messages", messageService.getMessages());
        return "chat";
    }

    @PostMapping("/chat")
    public String submitMessage(@ModelAttribute("chatForm") ChatForm chatForm, Model model) {
        messageService.addMessage(chatForm);
        return "redirect:/chat";
    }
}
