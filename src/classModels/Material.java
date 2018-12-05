package classModels;

/**
 * Created by Taqui on 4/29/2017.
 */
public class Material implements Comparable<Material>
{
    // attributes
    private String title, description;
    private int rating, id;
    // up to this

    // constructors
    public Material() { /* default constructor */ }

    public Material(String title, String description, int rating, int id) {
        this.title = title;
        this.description = description;
        this.rating = rating;
        this.id = id;
    }
    // up to this...

    // getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    // up to this

    // implementation of comparable
    @Override
    public int compareTo(Material material) {
        return this.title.compareTo(material.title);
    }
    // up to this

    // overriding toString

    @Override
    public String toString() {
        return this.title;
    }
}
