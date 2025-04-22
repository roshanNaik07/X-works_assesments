package com.xworkz.external;

import com.xworkz.internal.NewsApp;

public class NewsViewer {
    NewsApp newsApp;

    public NewsViewer(NewsApp newsApp) {
        this.newsApp = newsApp;
        System.out.println("Running NewsApp param const in NewsViewer");
    }

    public void getNews() {
        System.out.println("Running getNews in NewsViewer");
        this.newsApp.readNews();
    }
}
