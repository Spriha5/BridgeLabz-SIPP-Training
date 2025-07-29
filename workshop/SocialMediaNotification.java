package workshop;

import java.util.LinkedList;

abstract class Notification {
    String message;

    public Notification(String message) {
        this.message = message;
    }

    public abstract void display();
}

class LikeNotification extends Notification {
    String likedBy;

    public LikeNotification(String likedBy) {
        super(likedBy + " liked your post.");
        this.likedBy = likedBy;
    }

    @Override
    public void display() {
        System.out.println("[Like] " + message);
    }
}


class CommentNotification extends Notification {
    String commentedBy;
    String comment;

    public CommentNotification(String commentedBy, String comment) {
        super(commentedBy + " commented: " + comment);
        this.commentedBy = commentedBy;
        this.comment = comment;
    }

    @Override
    public void display() {
        System.out.println("[Comment] " + message);
    }
}


class UserFeed {
    private LinkedList<Notification> feed = new LinkedList<>();

    public void addNotification(Notification n) {
        feed.addFirst(n);
    }

    public void displayFeed() {
        if (feed.isEmpty()) {
            System.out.println("No notifications.");
            return;
        }

        System.out.println("User Notification Feed:");
        feed.forEach(Notification::display); 
    }
}


public class SocialMediaNotification {
    public static void main(String[] args) {
        UserFeed userFeed = new UserFeed();

        userFeed.addNotification(new LikeNotification("A"));
        userFeed.addNotification(new CommentNotification("B", "Nice pic!"));
        userFeed.addNotification(new LikeNotification("C"));

        userFeed.displayFeed();
    }
}
