package com.javarush.test.level30.lesson15.big01.client;

import com.javarush.test.level30.lesson15.big01.ConsoleHelper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by ion on 19.08.2016.
 */
public class BotClient extends Client {
    private static int botCounter = 0;

    public static void main(String[] args) {
        new BotClient().run();
    }

    public class BotSocketThread extends SocketThread{
        @Override
        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            sendTextMessage("Привет чатику. Я бот. Понимаю команды: дата, день, месяц, год, время, час, минуты, секунды.");
            super.clientMainLoop();
        }

        @Override
        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);
            String senderName = "";
            String senderMessageText;
            if(message.contains(": ")){
                senderName = message.substring(0, message.indexOf(": "));
                senderMessageText = message.substring(message.indexOf(": ") + 2);
            } else {
                senderMessageText = message;
            }
            SimpleDateFormat format = null;
            if("дата".equalsIgnoreCase(senderMessageText)){
                format = new SimpleDateFormat("d.MM.yyyy");
            } else if ("день".equalsIgnoreCase(senderMessageText)){
                format = new SimpleDateFormat("d");
            } else if ("месяц".equalsIgnoreCase(senderMessageText)){
                format = new SimpleDateFormat("MMMM");
            } else if ("год".equalsIgnoreCase(senderMessageText)){
                format = new SimpleDateFormat("YYYY");
            } else if ("время".equalsIgnoreCase(senderMessageText)){
                format = new SimpleDateFormat("H:mm:ss");
            } else if ("час".equalsIgnoreCase(senderMessageText)){
                format = new SimpleDateFormat("H");
            } else if ("минуты".equalsIgnoreCase(senderMessageText)){
                format = new SimpleDateFormat("m");
            } else if ("секунды".equalsIgnoreCase(senderMessageText)){
                format = new SimpleDateFormat("s");
            }
            if (format != null){
                sendTextMessage("Информация для " + senderName + ": " + format.format(Calendar.getInstance().getTime()));
            }
        }
    }

    @Override
    protected SocketThread getSocketThread() {
        return new BotSocketThread();
    }

    @Override
    protected boolean shouldSentTextFromConsole() {
        return false;
    }

    @Override
    protected String getUserName() {
        if(botCounter==99){
            botCounter = 0;
        }
        return "data_bot_" + botCounter++;
    }

}