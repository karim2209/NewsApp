package ca.karimmahmoud.test;

import java.util.List;

import ca.karimmahmoud.test.Models.NewsHeadlines;

public interface OnFetchDataListener<NewApiResponse> {
    void onFetchData(List<NewsHeadlines> list, String message);
    void onError(String message);
}
