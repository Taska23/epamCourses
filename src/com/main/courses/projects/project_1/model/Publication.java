package courses.projects.project_1.model;

import java.io.Serializable;

public class Publication implements Serializable {
    private String title;
    private String author;
    private String publisher;
    private int publishYear;
    private int pagesNumber;
    private Publication subPublications;
    private String tags;
    private int id;

    public Publication() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public int getPublishYear() {
        return publishYear;
    }
    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }
    public int getPagesNumber() {
        return pagesNumber;
    }
    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }
    public Publication getSubPublications() {
        return subPublications;
    }
    public void setSubPublications(Publication subPublications) {
        this.subPublications = subPublications;
    }
    public String getTags() {
        return tags;
    }
    public void setTags(String tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Publication{");
        sb.append("title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", publisher='").append(publisher).append('\'');
        sb.append(", publishYear=").append(publishYear);
        sb.append(", pagesNumber=").append(pagesNumber);
        if (subPublications != null){
            sb.append(", subPublications=").append(subPublications.getId());
        }
        sb.append(", tags='").append(tags).append('\'');
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
