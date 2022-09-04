package com.example.newsfeedapp;

public class News {
    /** Title of the news */
   private String nTitle;

    /** Date of the news */
    private long nDate;

    /** The section the news belongs to */
    private String nSectionName;

    /** The url of the news */
    private String nUrl;

    /**
     * Constructs a new {@link News}.
     *
     * @param newsTitle Title of the news
     * @param newsDate Date of the news
     * @param newsSection section the news belongs to
     * @param newsUrls The url of the news
     */
    public News(String newsTitle, Long newsDate, String newsSection, String newsUrls) {
        nTitle = newsTitle;
        nDate = newsDate;
        nSectionName = newsSection;
        nUrl = newsUrls;
    }

    /**
     * Returns the title of the news
     */
    public String getTitle() {
        return nTitle;
    }

    /**
     * Returns the date the article was wrtitten
     */
    public Long getDate() {
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
}
