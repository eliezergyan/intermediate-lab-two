package designpatterns.singleton;

public class Logger {
    private static Logger instance;

    private Logger(){}

    public static Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message){
        System.out.println("Logging... " + message);
    }

    public static void main(String[] args){
        Logger logger = Logger.getInstance();
        logger.log("This is the first log message");
        logger.log("This is another log message");
    }

}
