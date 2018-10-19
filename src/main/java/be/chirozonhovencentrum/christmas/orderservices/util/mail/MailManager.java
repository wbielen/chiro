package be.chirozonhovencentrum.christmas.orderservices.util.mail;

public interface MailManager {

    void sendMail(String to, String subject, String text);
}
