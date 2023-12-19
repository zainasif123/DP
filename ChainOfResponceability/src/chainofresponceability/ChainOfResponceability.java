/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chainofresponceability;

/**
 *
 * @author T
 */
public class ChainOfResponceability {

   private static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger databaseLogger = new DatabaseLogger(AbstractLogger.WARNING);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        consoleLogger.setNextLogger(databaseLogger);

        return errorLogger;
    }

    private static AbstractLogger getAnotherChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger warningLogger = new ConsoleLogger(AbstractLogger.WARNING);
        AbstractLogger infoLogger = new FileLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(warningLogger);
        warningLogger.setNextLogger(infoLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();
        AbstractLogger anotherLoggerChain = getAnotherChainOfLoggers();

        // Log messages using the first chain
        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level information.");
        loggerChain.logMessage(AbstractLogger.WARNING, "This is a warning.");

        System.out.println("\n");

        // Log messages using the second chain
        anotherLoggerChain.logMessage(AbstractLogger.INFO, "This is another information.");
        anotherLoggerChain.logMessage(AbstractLogger.ERROR, "This is an error.");
        anotherLoggerChain.logMessage(AbstractLogger.WARNING, "This is another warning.");
    }
}
