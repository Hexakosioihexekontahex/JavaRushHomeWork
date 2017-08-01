package com.javarush.test.level26.lesson15.big01.command;

import com.javarush.test.level26.lesson15.big01.ConsoleHelper;
import com.javarush.test.level26.lesson15.big01.CurrencyManipulator;
import com.javarush.test.level26.lesson15.big01.CurrencyManipulatorFactory;
import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;
import com.javarush.test.level26.lesson15.big01.exception.NotEnoughMoneyException;

class WithdrawCommand implements Command {
    @Override
    public void execute() throws InterruptOperationException {
        System.out.println("enter currency code");
        String currencyCode = ConsoleHelper.askCurrencyCode();
        CurrencyManipulator currencyManipulator = CurrencyManipulatorFactory.getManipulatorByCurrencyCode(currencyCode);
        int sum;
        while(true){
            ConsoleHelper.writeMessage("Withdrawing...");
            String s = ConsoleHelper.readString();
            try{
                sum = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                ConsoleHelper.writeMessage("Please specify integer amount for withdrawing.");
                continue;
            }
            if(sum <= 0){
                ConsoleHelper.writeMessage("Please specify valid positive integer amount for withdrawing.");
                continue;
            }
            if(!currencyManipulator.isAmountAvailable(sum)){
                ConsoleHelper.writeMessage("Not enough money");
                continue;
            }
            try{
                currencyManipulator.withdrawAmount(sum);
            } catch (NotEnoughMoneyException e){
                ConsoleHelper.writeMessage("Exact amount is not available");
                continue;
            }
            ConsoleHelper.writeMessage(String.format("%d %s was withdrawn successfully", sum, currencyCode));
            break;
        }
    }
}
