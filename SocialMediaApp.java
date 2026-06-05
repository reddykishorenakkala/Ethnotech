package task;

import java.util.Scanner;

class Post {
    String content;
    boolean sponsored;
    Post next;
    Post prev;

    Post(String content, boolean sponsored) {
        this.content = content;
        this.sponsored = sponsored;
        this.next = null;
        this.prev = null;
    }
}

class SocialMediaFeed {
    Post head = null;
    Post tail = null;
    Post current = null;

    public void addPost(String content, boolean sponsored) {
        Post newPost = new Post(content, sponsored);

        if (head == null) {
            head = tail = current = newPost;
        } else {
            tail.next = newPost;
            newPost.prev = tail;
            tail = newPost;
        }
    }

    public void showCurrentPost() {
        if (current == null) {
            System.out.println("No posts available.");
            return;
        }

        System.out.println("\n-------------------");
        if (current.sponsored) {
            System.out.println("[SPONSORED POST]");
        }
        System.out.println(current.content);
        System.out.println("-------------------");
    }

    public void nextPost() {
        if (current != null && current.next != null) {
            current = current.next;
            showCurrentPost();
        } else {
            System.out.println("You are at the last post.");
        }
    }

    public void previousPost() {
        if (current != null && current.prev != null) {
            current = current.prev;
            showCurrentPost();
        } else {
            System.out.println("You are at the first post.");
        }
    }

    public void showSponsoredPosts() {
        Post temp = head;
        boolean found = false;

        System.out.println("\n===== SPONSORED POSTS =====");

        while (temp != null) {
            if (temp.sponsored) {
                System.out.println(temp.content);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No sponsored posts available.");
        }
    }
}

public class SocialMediaApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SocialMediaFeed feed = new SocialMediaFeed();

        // Adding posts
        feed.addPost("Welcome to Social Media!", false);
        feed.addPost("Next post will be here.", false);
        feed.addPost("Special Offer: Buy 1 Get 1 Free!", true);
        feed.addPost("New Java Tutorial Uploaded.", false);
        feed.addPost("Sponsored: Upgrade to Premium Today!", true);

        int choice;

        do {
            System.out.println("\n===== SOCIAL MEDIA FEED =====");
            System.out.println("1. View Current Post");
            System.out.println("2. Next Post");
            System.out.println("3. Previous Post");
            System.out.println("4. View Sponsored Posts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    feed.showCurrentPost();
                    break;

                case 2:
                    feed.nextPost();
                    break;

                case 3:
                    feed.previousPost();
                    break;

                case 4:
                    feed.showSponsoredPosts();
                    break;

                case 5:
                    System.out.println("Exiting Feed...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}