public class OwnException extends Exception{
private String message;
public OwnException(String message){
    this.message = message;
}

public String getMessage() {
    return message;
    }
}
