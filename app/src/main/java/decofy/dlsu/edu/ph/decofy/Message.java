package decofy.dlsu.edu.ph.decofy;

/**
 * Created by jarre on 24/02/2018.
 */

public class Message {
    private String author;
    private String content;
    private String subject;
    private String date;
    private int id;

    public Message(){

    }

    public Message(int id, String author, String subject, String content, String date) {
        this.id = id;
        this.author = author;
        this.subject = subject;
        this.content = content;
        this.date = date;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSubject(){
        return subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }
}
