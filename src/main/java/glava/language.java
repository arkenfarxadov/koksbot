package glava;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;

public class language {
    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
    List<List<InlineKeyboardButton>> list = new ArrayList<>();
    List<InlineKeyboardButton> buttomlist = new ArrayList<>();
    List<InlineKeyboardButton> buttomlist2 = new ArrayList<>();
    public void lang(){
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();

        inlineKeyboardButton1.setText("\uD83C\uDDF7\uD83C\uDDFA");
        inlineKeyboardButton1.setCallbackData("rus");
        inlineKeyboardButton2.setText("\uD83C\uDDFA\uD83C\uDDF8");
        inlineKeyboardButton2.setCallbackData("eng");

        buttomlist.add(inlineKeyboardButton1);
        buttomlist2.add(inlineKeyboardButton2);
        list.add(buttomlist);
        list.add(buttomlist2);
        inlineKeyboardMarkup.setKeyboard(list);
    }



}
