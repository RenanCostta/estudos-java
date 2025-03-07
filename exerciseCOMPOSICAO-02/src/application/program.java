package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Wow that´s awesome");
        Post p1 = new Post(
                sdf.parse("21/06/2018 13:05:44"),
                "Traveling to New Zeeland",
                "I´m going to visit this wonderful country",
                12);

        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);

        sc.close();
    }
}
