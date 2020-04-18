package LittlePrince;

import jaxb.JAXBHelper;

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception{

        Book book = new Book();

        book.setName("Little Prince");

        ArrayList<Rating> ratings = new ArrayList<Rating>();
        ratings.add(new Rating(5,0.56,646444));
        ratings.add(new Rating(4,0.26,303172));
        ratings.add(new Rating(3,0.13,147965));
        ratings.add(new Rating(2,0.04,43175));
        ratings.add(new Rating(1,0.02, 20594));
        book.setRatings(ratings);

        book.setLanguage("English");
        book.setAuthor("Antoine Saint-Exupery");

        List<Price> price = new ArrayList<>();
        price.add(new Price("377Ft","3488Ft"));
        book.setPrice(price);

        List<Delivery> delivery = new ArrayList<>();
        delivery.add(new Delivery(true,"Free WorldWide"));
        book.setDelivery(delivery);


        Set description = new HashSet();
        description.add("A PBS Great American Read Top 100 Pick");
        description.add("Few stories are as widely read and as universally cherished by children and adults alike as The Little Prince. Richard Howard's translation of the beloved classic beautifully reflects Saint-Exupery's unique and gifted style. Howard, an acclaimed poet and one of the preeminent translators of our time, has excelled in bringing the English text as close as possible to the French, in language, style, and most important, spirit. The artwork in this edition has been restored to match in detail and in color Saint-Exupery's original artwork. Combining Richard Howard's translation with restored original art, this definitive English-language edition of The Little Prince will capture the hearts of readers of all ages.");
        description.add("This title has been selected as a Common Core Text Exemplar (Grades 4-5, Stories).");
        book.setDescription(description);

        book.setForAges("12-17");
        book.setFormat("Paperback:96 pages");

        Set dimension=new HashSet<>();
        dimension.add("135.89*206.25*6.6mm");
        dimension.add("181.44g");
        book.setDimensions(dimension);

        book.setPublicationDate("01 May 2016");
        book.setPublisher("Cengage Learning,Inc");
        book.setImprint("Wadsworth Publishing Co Inc");

        List<Publication> publication = new ArrayList<>();
        publication.add(new Publication("Belmont,CA","United States"));
        book.setPublication(publication);

        book.setIllustrations("Unspecified Illustrations");
        book.setIsbn10("0156012197");
        book.setIsbn13("9780156012195");
        book.setBestsellersRank(8201);

        JAXBHelper.toXML(book,System.out);




    }


}
