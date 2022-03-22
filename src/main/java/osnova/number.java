package osnova;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;


public class number {
public ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
    public void number(){
        replyKeyboardMarkup.setResizeKeyboard(true);
        List<KeyboardRow> list=new ArrayList<>();
        KeyboardRow row =new KeyboardRow();
        KeyboardButton button=new KeyboardButton();
        button.setText("\uD83D\uDCCC(Контакт / Contact)");
        button.setRequestContact(true);
        row.add(button);
        list.add(row);
        replyKeyboardMarkup.setKeyboard(list);
    }
}
