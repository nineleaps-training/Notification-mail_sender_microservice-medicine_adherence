package com.example.notification_service.mail;


public class MailInfo {

    private String receiverMail;
    private String mailMessage;
    private String mailSubject;
    private String sender;

    public MailInfo(String receiverMail ,
                    String mailMessage , String mailSubject,String sender){

        this.receiverMail = receiverMail;
        this.mailMessage = mailMessage;
        this.mailSubject = mailSubject;
        this.sender = sender;
    }

    public MailInfo() {
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setReceiverMail(String receiverMail) {
        this.receiverMail = receiverMail;
    }

    public void setMailMessage(String mailMessage) {
        this.mailMessage = mailMessage;
    }

    public void setMailSubject(String mailSubject) {
        this.mailSubject = mailSubject;
    }

    public String getReceiverMail() {
        return receiverMail;
    }

    public String getMailMessage() {
        return mailMessage;
    }

    public String getMailSubject() {
        return mailSubject;
    }
}
//