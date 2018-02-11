//package com.javarush.test.level28.lesson15.big01.model;
//
//import com.javarush.test.level28.lesson15.big01.vo.Vacancy;
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
//
//import kotlin.io.IOException;
//import kotlin.util.ArrayList;
//import kotlin.util.List;
//
///**
// * Created by ion on 10.08.2016.
// */
//public class HHStrategy implements Strategy {
//    private static final String URL_FORMAT = "http://hh.ua/search/vacancy?text=java+%s&page=%d";
//    //private static final String URL_FORMAT = "http://javarush.ru/testdata/big28data.html/search/vacancy?text=java+%s&page=%d";
//    private static final String referrer = "http://hh.ua/search/vacancy?text=java+%D0%BA%D0%B8%D0%B5%D0%B2";
//    private static final String userAgent = "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.85 Safari/537.36";
//    private static final int timeout = 5 * 1000;
//
//
//    @Override
//    public List<Vacancy> getVacancies(String searchString) {
//        List<Vacancy> vacancies = new ArrayList<>();
//        int nom = 0;
//        Document doc = null;
//        try{
//            while (true){
//                doc = getDocument(searchString, nom++);
//                if (doc == null){
//                    break;
//                }
//                Elements elements = (Elements) doc.select("[data-qa=vacancy-serp__vacancy");
//                if(elements.size()==0){
//                    break;
//                }
//                for(Element element : elements){
//                    //title
//                    Element titleElement = element.select("[data-qa=vacancy-serp__vacancy-title").first();
//                    String title = titleElement.text();
//                    //salary
//                    Element salaryElement = element.select("[data-qa=vacancy-serp__vacancy-compensation").first();
//                    String salary = "";
//                    if(salaryElement != null){
//                        salary = salaryElement.text();
//                    }
//                    //city
//                    String city = element.select("[data-qa=vacancy-serp__vacancy-address").first().text();
//                    //company
//                    String company = element.select("[data-qa=vacancy-serp__vacancy-employer").first().text();
//                    //site
//                    String siteName = "http://hh.ua/";
//                    //url
//                    String url = titleElement.attr("href");
//                    //add vacancy
//                    Vacancy vacancy = new Vacancy();
//                    vacancy.setTitle(title);
//                    vacancy.setSalary(salary);
//                    vacancy.setCity(city);
//                    vacancy.setCompanyName(company);
//                    vacancy.setSiteName(siteName);
//                    vacancy.setUrl(url);
//                    vacancies.add(vacancy);
//                }
//            }
//        } catch (IOException e){
//            e.printStackTrace();
//        }
//        return vacancies;
//    }
//
//
//    protected Document getDocument(String searchString, int page) throws IOException{
//        String url = String.format(URL_FORMAT, searchString, page);
//        try {
//            Document document = Jsoup.connect(url).userAgent(userAgent).referrer(referrer).timeout(timeout).get();
//            return document;
//        } catch (IOException e){
//            e.printStackTrace();
//            return null;
//        }
//
//    }
//}
