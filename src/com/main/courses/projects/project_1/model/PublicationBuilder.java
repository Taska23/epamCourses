package courses.projects.project_1.model;

import courses.projects.project_1.model.Publication;
import courses.projects.project_1.model.PublicationBuilder;

public class PublicationBuilder {
    private String Title;
    private String author;
    private String publisher;
    private int publishYear;
    private int pagesNumber;
    private Publication subPublications;
    private String tags;
    private int id;

    public PublicationBuilder withName(String name) {
        this.Title = name;
        return this;
    }

    public PublicationBuilder withAuthor(String author) {
        this.author = author;
        return this;
    }

    public PublicationBuilder withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    public PublicationBuilder withPublishYear(int publishYear) {
        this.publishYear = publishYear;
        return this;
    }

    public PublicationBuilder withPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
        return this;
    }

    public PublicationBuilder withSubPublications(Publication subPublications) {
       // this.subPublications = subPublications;
        return this;
    }

    public PublicationBuilder withTags(String tags) {
        this.tags = tags;
        return this;
    }

    public PublicationBuilder withId(int id) {
        this.id = id;
        return this;
    }

    public Publication build() {
        Publication publication = new Publication();
        publication.setTitle(Title);
        publication.setAuthor(author);
        publication.setPublisher(publisher);
        publication.setPublishYear(publishYear);
        publication.setPagesNumber(pagesNumber);
        publication.setTags(tags);
        publication.setId(id);
        return publication;
    }
}


