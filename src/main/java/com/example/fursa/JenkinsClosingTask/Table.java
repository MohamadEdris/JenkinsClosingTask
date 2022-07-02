package com.example.fursa.JenkinsClosingTask;


import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;
// https://docs.oracle.com/cd/B10463_01/portal.904/b10667/sampsyndclientappendix.htm for help

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Table {
    final private String url;
    private List ent;
    /**
     * @param url - link of xml website
     */
    public Table(String url){
        this.url = url;
        ent = null;
    }
    public List getTable() throws IOException {
        try {
            URL url = new URL(this.url);
            SyndFeedInput input = new SyndFeedInput();
            SyndFeed feed = input.build(new XmlReader(url));
            ent = feed.getEntries();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (FeedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return ent;
        }


    }

}