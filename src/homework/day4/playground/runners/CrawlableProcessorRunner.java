package homework.day4.playground.runners;

import homework.day4.playground.essence.creatures.*;
import homework.day4.playground.processors.CrawlableProcessor;

public class CrawlableProcessorRunner {
    public static void main(String[] args) {
        CrawlableProcessor crawlable = new CrawlableProcessor();

        Crawlable crawlableCrocodile = new Crocodile(1723, "Neel Crawlable");
        Crawlable crawlableBeetle = new Beetle(43, "Christmas Crawlable");
        Vertebrata vertebrataCrocodile = new Crocodile(1723, "Neel Vertebrata");
        Insect insectBeetle = new Beetle(43, "Christmas Insect");
        Crocodile aCrocodile = new Crocodile(1723, "Neel Crocodile");
        Beetle aBeetle = new Beetle(43, "Christmas Beetle");
        Crawlable anonymousCrawlable = new Crawlable() {
            String name = "Anonymous";
            @Override
            public void crawl(String direction, int distance) {
                System.out.printf("I am %s, my name is %s and I am crawling to %s for %d units%n",
                        this.getClass().getSimpleName(), name, direction, distance);
            }
        };

        crawlable.runCrawlable(crawlableCrocodile);
        crawlable.runCrawlable(crawlableBeetle);
        //crawlable.runCrawlable(vertebrataCrocodile);  не применен интерфейс Сrawlable
        //crawlable.runCrawlable(insectBeetle);  не применен интерфейс Сrawlable
        crawlable.runCrawlable(aCrocodile);
        crawlable.runCrawlable(aBeetle);
        crawlable.runCrawlable(anonymousCrawlable);

        crawlable.runCrawlable(crawlableCrocodile, "никуда");
        crawlable.runCrawlable(crawlableBeetle, "налево");

        crawlable.runCrawlable(aBeetle,"назад", 37);

        crawlable.runCrawlable(new Crawlable() {
            @Override
            public void crawl(String direction, int distance) {
                Crawlable.super.crawl(direction, distance);
            }
        }, "вниз", 37);
    }
}
