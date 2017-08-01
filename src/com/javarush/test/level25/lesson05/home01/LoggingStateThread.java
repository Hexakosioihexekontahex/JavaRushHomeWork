package com.javarush.test.level25.lesson05.home01;

/* Мониторинг состояния нити
В отдельном классе создать нить LoggingStateThread,
которая будет выводить в консоль все состояния (State) переданной в конструктор нити.
Нить LoggingStateThread должна сама завершаться после остановки переданной в конструктор нити.
Метод main не участвует в тестировании.
*/
public class LoggingStateThread extends Thread {
    Thread target;

    public LoggingStateThread(Thread target) {
        this.target = target;
        setDaemon(true);
    }

    @Override
    public void run() {
        State state = this.target.getState();
        System.out.println(state);
        while (state != State.TERMINATED){
            if (state != this.target.getState()){
                state = this.target.getState();
                System.out.println(state);
            }
        }
    }
}
