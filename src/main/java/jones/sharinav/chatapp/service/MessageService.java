package jones.sharinav.chatapp.service;

import jones.sharinav.chatapp.model.ChatForm;
import jones.sharinav.chatapp.model.ChatMessage;
import jones.sharinav.chatapp.model.MessageType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MessageService {
    private static final List<String> BANNED_WORDS = Arrays.asList("badword", "rude", "offensive");


    private List<ChatMessage> messages = new ArrayList<>();

    public List<ChatMessage> getMessages() {
        return new ArrayList<>(messages); // Defensive Copy
    }

    public void addMessage(ChatForm form) {
        String formattedMessage = formatMessage(form.getMessageText(), form.getMessageType());

        if (!containsBannedWords(formattedMessage)) {
            messages.add(new ChatMessage(form.getUsername(), formattedMessage));
        } else {
            String filteredMessage = formatMessage("censored", form.getMessageType());
            messages.add(new ChatMessage(form.getUsername(), filteredMessage));
        }
    }

    private String formatMessage(String message, MessageType type) {
        return switch (type) {
            case SHOUT -> message.toUpperCase();
            case WHISPER -> message.toLowerCase();
            default -> message;
        };
    }

    private boolean containsBannedWords(String message) {
        return BANNED_WORDS.stream().anyMatch(message.toLowerCase()::contains);
    }
}
