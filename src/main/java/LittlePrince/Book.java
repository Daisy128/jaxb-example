package LittlePrince;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@Data
public class Book {

    private String name;

    private String language;
    private String author;
    private URL url;
    private URL coverURL;

    private List<Price> price;

    private List<Delivery> delivery;

    @XmlElementWrapper(name = "Ratings")
    @XmlElement(name = "Rating")
    private ArrayList<Rating> ratings;

    @XmlElementWrapper(name = "Descriptions")
   private Set<String> description;

    private String forAges;
    private String format;

    @XmlList
    private Set<String> dimensions;

    private String publicationDate;
    private String publisher;
    private String imprint;

    private List<Publication> publication;

    private String illustrations;
    @XmlElement(name = "ISBN10")
    private String isbn10;
    @XmlElement(name = "ISBN13")
    private String isbn13;
    private int bestsellersRank;
}
