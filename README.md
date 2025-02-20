# Chat Room Application 🗨️

This is a simple **chat application** built using **Spring Boot, Thymeleaf, and Bootstrap**. Users can submit messages along with their username, and those messages will be displayed in a chat room. Additionally, users can select a **message type** (Say, Shout, or Whisper), which determines how the message is displayed.

## 🚀 Features
- **User Messages**: Users can submit messages and see a list of all messages sent.  
- **Message Formatting**: 
  - **Say** → Displays message as written  
  - **Shout** → Converts message to UPPERCASE  
  - **Whisper** → Converts message to lowercase  
- **Thymeleaf Integration**: Dynamically renders the chat history.  
- **Message Filtering**: Replaces messages containing banned words with `"censored"`.  
- **Bootstrap Styling**: Enhances UI with better form and message formatting.  

## 🛠️ Technologies Used
- **Java 17+**
- **Spring Boot**
- **Thymeleaf**
- **Bootstrap 5**
- **Maven**

---

## 🏗️ Installation & Setup

### **1️⃣ Clone the Repository**
```bash
git clone https://github.com/your-username/chat-app.git
cd chat-app
```

### **2️⃣ Build the Project**
Make sure you have **Maven** installed, then run:
```bash
mvn clean install
```

### **3️⃣ Run the Application**
Start the Spring Boot application with:
```bash
mvn spring-boot:run
```

### **4️⃣ Access the Chat Room**
Once the app is running, open your browser and visit:
```
http://localhost:8080/chat
```

---

## 📂 Project Structure
```
chat-app/
│── src/
│   ├── main/java/jones/sharinav/chatapp/
│   │   ├── controller/
│   │   │   ├── ChatController.java
│   │   ├── model/
│   │   │   ├── ChatMessage.java
│   │   │   ├── ChatForm.java
│   │   │   ├── MessageType.java
│   │   ├── service/
│   │   │   ├── MessageService.java
│   │   ├── ChatAppApplication.java
│   ├── main/resources/templates/
│   │   ├── chat.html
│   ├── main/resources/static/
│   │   ├── styles.css
│── pom.xml
│── README.md
```

---

## 📝 Usage Guide

### **Sending Messages**
1. Enter your **username** in the input field.  
2. Type your **message** in the text box.  
3. Select a **message type**:
   - **Say** (default) → Normal text
   - **Shout** → Converts message to uppercase
   - **Whisper** → Converts message to lowercase  
4. Click **Send Message** to submit your message.

### **Message Filtering**
- If a message **contains a banned word**, it will be **replaced entirely** with `"censored"`.  
- The censored message will still be displayed in the chat, but inappropriate words will be hidden.  
- The message formatting (Say, Shout, Whisper) **still applies to the censored message**.  

Example:
| User Input | Message Type | Displayed Message |
|------------|-------------|-------------------|
| `"Hey, how are you?"` | Say | `"Hey, how are you?"` |
| `"This is a badword!"` | Say | `"censored"` |
| `"rude people!"` | Whisper | `"censored"` |
| `"SHOUT rude words!"` | Shout | `"CENSORED"` |

---

## 🔧 Configuration

### **Modify Banned Words**
You can modify the list of **banned words** inside `MessageService.java`:

```java
private static final List<String> BANNED_WORDS = Arrays.asList("badword", "rude", "offensive");
```

---

## 🛠️ Additional Enhancements (Future Work)
- ✅ **Add WebSockets** for real-time chat updates  
- ✅ **User authentication** with Spring Security  
- ✅ **Store messages in a database** instead of memory  
- ✅ **Improve UI with more Bootstrap styling**  

---

## 🤝 Contributing
Feel free to **fork this project**, make improvements, and submit a **pull request**!

---

## 📜 License
This project is licensed under the **MIT License**.

---
🎉 **Enjoy chatting!** 🚀
