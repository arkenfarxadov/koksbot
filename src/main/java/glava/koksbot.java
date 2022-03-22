package glava;

import lombok.NonNull;
import lombok.SneakyThrows;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendDocument;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.DeleteMessage;
import org.telegram.telegrambots.meta.api.objects.*;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import osnova.*;
import java.util.Scanner;
public class koksbot extends TelegramLongPollingBot {
    public final Scanner li=new Scanner(System.in);
    @Override
    public String getBotToken() {
        return "5083343051:AAEtgsGApH8Ye85POE-70_tcEfiOkBWCAqo";
    }

    @Override
    public String getBotUsername() {
        return"k0ksbot";
    }

    @SneakyThrows
    @Override
    public void onUpdateReceived(Update update) {
        SendMessage sendMessage = new SendMessage();
        SendMessage sendMessage1 = new SendMessage();
        if (update.hasMessage()) {
            Message message = update.getMessage();
            if (message.hasText()) {
                String text = message.getText();
                long chatid = update.getMessage().getChatId();
                String user_first_name = update.getMessage().getChat().getFirstName();
                String user_last_name = update.getMessage().getChat().getLastName();
                String user_username = update.getMessage().getChat().getUserName();
                String bot_username= getBotUsername();
                String user_id = update.getMessage().getChat().getId().toString();

                log(user_first_name,user_last_name,user_id,text);
                sendMessage.setChatId(String.valueOf(chatid));
                if (text.equals("/start")) {
                    number number = new number();
                    number.number();
                    sendMessage.setText("\uD83D\uDD8DОтправьте свой номер\n\uD83D\uDD8DSend number");
                    sendMessage.setReplyMarkup(number.replyKeyboardMarkup);
                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
                if (text.equals("\uD83D\uDEABСлив пасспортных данных")) {
                    File file = new File("d:\\Programming\\IdeaProjects\\bot\\src\\main\\java\\sliv\\" + (int) (Math.random() * (50 - 1 + 1) + 1) + ".jpg");
                    SendDocument sendDocument = new SendDocument();
                    sendDocument.setChatId(String.valueOf(update.getMessage().getChatId()));
                    @lombok.NonNull InputFile inputFile = new InputFile(file);
                    sendDocument.setDocument(inputFile);
                    sendMessage.setText("секундочку.......");
                    DeleteMessage deleteMessage=new DeleteMessage();
                    deleteMessage.setChatId(String.valueOf(message.getChatId()));
                    deleteMessage.setMessageId(message.getMessageId()+1);
                    try {
                        execute(sendMessage);
                        Thread.sleep(3000);
                        execute(deleteMessage);
                        execute(sendDocument);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
                if (text.equals("\uD83D\uDEABDraining passport data")) {
                    File file = new File("d:\\arken\\Dev\\IdeaProjects\\bot\\src\\main\\java\\sliv\\" + (int) (Math.random() * (50 - 1 + 1) + 1) + ".jpg");
                    SendDocument sendDocument = new SendDocument();
                    sendDocument.setChatId(String.valueOf(update.getMessage().getChatId()));
                    @lombok.NonNull InputFile inputFile = new InputFile(file);
                    sendDocument.setDocument(inputFile);
                    sendMessage.setText("second.....");
                    DeleteMessage deleteMessage =new DeleteMessage();
                    deleteMessage.setChatId(String.valueOf(message.getChatId()));
                    deleteMessage.setMessageId(message.getMessageId()+1);
                    try {
                        execute(sendMessage);
                        Thread.sleep(3000);
                        execute(deleteMessage);
                        execute(sendDocument);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
                if(text.equals("⏳Дата и время (Часовой пояс (UTC - (+05:00))")){
                    sendMessage.setChatId(String.valueOf(message.getChatId()));
                    sendMessage1.setChatId(String.valueOf(message.getChatId()));
                    sendMessage1.setText("Если ты забыл дату подожди 5 сек по братский");
                    Date date =new Date();
                    SimpleDateFormat fors=new SimpleDateFormat("yyyy.MM.dd E 'и время' HH:mm:ss a");
                    String s = fors.format(date);
                    sendMessage.setText(s);
                    try {
                        execute(sendMessage1);
                        Thread.sleep(5000);
                        execute(sendMessage);
                    }
                    catch (TelegramApiException | InterruptedException e){
                        e.printStackTrace();
                    }
                }
              if(text.equals("⏳Date and time (Time zone (UTC - (+05: 00))")){
                  sendMessage.setChatId(String.valueOf(message.getChatId()));
                  sendMessage1.setChatId(String.valueOf(message.getChatId()));
                  sendMessage1.setText("If you forgot the date, wait 5 seconds in brotherly");
                  Date date =new Date();
                  SimpleDateFormat fors=new SimpleDateFormat("yyyy.MM.dd 'and time' HH:mm:ss a");
                  String s = fors.format(date);
                  sendMessage.setText(s);
                  try {
                      execute(sendMessage1);
                      Thread.sleep(5000);
                      execute(sendMessage);
                  }
                  catch (TelegramApiException | InterruptedException e){
                      e.printStackTrace();
                  }
              }
              if(text.equals("🎁Флудер")||text.equals("\uD83C\uDF81Fluder")){
                  sendMessage.setChatId(String.valueOf(message.getChatId()));
                  flud flud=new flud();
                  for(int i=0;i<=100;i++){
                      sendMessage.setText(flud.s);
                      try {
                          execute(sendMessage);
                      } catch (TelegramApiException e) {
                          e.printStackTrace();
                      }}
              }
              if(text.equals("✅Мой профиль")){
                  sendMessage.setText("Имя : "+user_first_name+"\n"+
                          "Фамилия : "+user_last_name+"\n"+
                          "Имя пользователя : "+"@"+user_username+"\n"+
                          "ID:"+user_id+"\n\n\n\n\n"+"\uD83E\uDD16 @"+(bot_username)+"\n\uD83D\uDD12creator: @arkenfx");
                  try{
                      execute(sendMessage);
                  }catch (TelegramApiException e){
                      e.printStackTrace();
                  }
              }
              if(text.equals("✅My profile")){
                  sendMessage.setText("Name : "+user_first_name+"\n"+
                          "Surname : "+user_last_name+"\n"+
                          "Username : "+"@"+user_username+"\n"+
                          "ID : "+user_id+"\n\n\n\n\n"+"\uD83E\uDD16 @"+(bot_username)+"\n\uD83D\uDD12creator: @arkenfx");
                  try{
                      execute(sendMessage);
                  }catch (TelegramApiException e){
                      e.printStackTrace();
                  }
              }
              if(text.equals("/chat")){
                      String s = li.nextLine();
                      sendMessage.setText(s);
                      try {
                          execute(sendMessage);
                      }
                      catch (TelegramApiException e){
                          e.printStackTrace();
                      }

              }
            } else if (message.hasContact()) {
                sendMessage.setText("\uD83C\uDDF7\uD83C\uDDFAВыберите язык\n\uD83C\uDDFA\uD83C\uDDF8Choose language");
                language language = new language();
                language.lang();
                sendMessage.setReplyMarkup(language.inlineKeyboardMarkup);
                sendMessage.setChatId(String.valueOf(message.getChatId()));
                try {
                    execute(sendMessage);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
        }else if (update.hasCallbackQuery()) {
                CallbackQuery callbackQuery = update.getCallbackQuery();
                Message callmessage = callbackQuery.getMessage();
                String date = callbackQuery.getData();
                DeleteMessage deleteMessage = new DeleteMessage();
                deleteMessage.setChatId(String.valueOf(callmessage.getChatId()));
                deleteMessage.setMessageId(callmessage.getMessageId());
                switch (date) {
                    case "rus":
                        sendMessage.setText("Выбран русский язык");
                        rus rus=new rus();
                        rus.rus();
                        sendMessage.setReplyMarkup(rus.replyKeyboardMarkup);
                        sendMessage.setChatId(String.valueOf(callmessage.getChatId()));
                        try {
                            execute(sendMessage);
                            execute(deleteMessage);
                        } catch (TelegramApiException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "eng":
                        sendMessage.setText("English language selected");
                        eng eng =new eng();
                        eng.eng();
                        sendMessage.setReplyMarkup(eng.replyKeyboardMarkup);
                        sendMessage.setChatId(String.valueOf(callmessage.getChatId()));
                        try {
                            execute(sendMessage);
                            execute(deleteMessage);
                        } catch (TelegramApiException e) {
                            e.printStackTrace();
                        }
                        break;
                }
            }

        }
        private void log(String first_name,String last_name,String user_id,String txt){
            System.out.println("\n ----------------------------");
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            System.out.println(dateFormat.format(date));
            System.out.println("Message from " + first_name + " " + last_name + ". (id = " + user_id + ") \n Text - " + txt);
        }

    }