package com.example.newsfeedapp;

public class News {
    /** Title of the news */
   private String nTitle;

    /** Date of the news */
    private String nDate;

    /** The section the news belongs to */
    private String nSectionName;

    /** The url of the news */
    private String nUrl;

    /** The author of the news */
    private String nAuthor;


    /**
     * Constructs a new {@link News}.
     *
     * @param newsTitle Title of the news
     * @param newsDate Date of the news
     * @param newsSection section the news belongs to
     * @param newsUrls The url of the news
     * @param newsAuthor The author of the news
     */
    public News(String newsTitle, String newsDate, String newsSection, String newsUrls, String newsAuthor) {
        nTitle = newsTitle;
        nDate = newsDate;
        nSectionName = newsSection;
        nUrl = newsUrls;
        nAuthor = newsAuthor;
    }

    /**
     * Returns the title of the news
     */
    public String getTitle() {
        return nTitle;
    }

    /**
     * Returns the date the article was wrtitten
     * @return
     */
    public String getDate() {
        return nDate;
    }

    /**
     * Returns the section name of the article
     */
    public String getSectionName() {
        return nSectionName;
    }

    /**
     * Returns the website URL to find more information about the news.
     */
    public String getUrl() {
        return nUrl;
    }

    /**
     * Returns the article's author.
     */
    public String getAuthor() {
        return nAuthor;
    }
}
