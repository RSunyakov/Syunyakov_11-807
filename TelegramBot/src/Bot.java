
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


public class Bot extends TelegramLongPollingBot {

    public static void main(String[] args) {
        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(new Bot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getBotUsername() {
        return "HmelnayaZastava_Bot";
    }

    @Override
    public String getBotToken() {
        return "774297928:AAHrcLAIOJAHTWPcvzLxx4nsKEpdELFKIxU";
    }

    @Override
    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
        if (message != null && message.hasText()) {
            switch(message.getText()) {
                case "/help":
                    sendMsg(message, "Привет, я робот бара Хмельная Застава. \n Вот мои команды:" +
                            " \n /sale - Тут можно посмотреть действительные акции. " +
                            "\n /workinghours - А здесь можно увидеть время работы бара" +
                            "\n /news - Новости из бара");
                    break;
                case "/sale":
                    sendMsg(message, "Пока что нет акций :(");
                    break;
                case "/workinghours":
                    sendMsg(message, "Мы работаем с 13:00 до 1:00");
                    break;
                case "/news":
                    sendMsg(message,"Актуальные новости вы сможете увидеть в нашей группе : vk.com/bar\\_hmelnaya\\_zastava" +
                            "\n Но в ближжайшем будущем вы сможете подписаться на рассылку новостей");
                    break;
                case "/start":
                    sendMsg(message, "Для начала работы введи /help");
                    break;
            }
        }
    }

    private void sendMsg(Message message, String text) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}