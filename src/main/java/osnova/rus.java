package osnova;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class rus{
  public   ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
    List<KeyboardRow> list=new ArrayList<>();

    KeyboardRow row1=new KeyboardRow();
    KeyboardRow row2=new KeyboardRow();

    KeyboardButton button1row1=new KeyboardButton();
    KeyboardButton button2row1=new KeyboardButton();
    KeyboardButton button1row2=new KeyboardButton();
    KeyboardButton button2row2=new KeyboardButton();
  public void rus(){
        replyKeyboardMarkup.setResizeKeyboard(true);

        button1row1.setText("\uD83D\uDEABСлив пасспортных данных");
        button2row1.setText("⏳Дата и время (Часовой пояс (UTC - (+05:00))");
        button1row2.setText("\uD83C\uDF81Флудер");
        button2row2.setText("✅Мой профиль");
        row1.add(button1row1);
        row1.add(button2row1);
        row2.add(button1row2);
        row2.add(button2row2);

        list.add(row1);
        list.add(row2);

        replyKeyboardMarkup.setKeyboard(list);

    }
}
