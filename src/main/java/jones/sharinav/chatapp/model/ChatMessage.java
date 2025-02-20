package jones.sharinav.chatapp.model;

public class ChatMessage {
    private String username;
    private String messageText;

    public ChatMessage(String username, String messageText) {
        this.username = username;
        this.messageText = messageText;
    }

    public String getUsername() { return username; }
    public String getMessageText() { return messageText; }
}
