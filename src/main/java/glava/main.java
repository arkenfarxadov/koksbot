package glava;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.generics.LongPollingBot;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
public class main {
    public static void main(String[] args) throws TelegramApiException {
        TelegramBotsApi koksbot=new TelegramBotsApi(DefaultBotSession.class);
        koksbot.registerBot(new koksbot());
    }
}
