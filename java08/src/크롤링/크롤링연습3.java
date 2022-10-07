package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습3 {

	public static void main(String[] args) {
		// 1. 사이트에 연결해서, html문서를 다 가지고 온다.
		try {
			Document doc = Jsoup.connect("https://news.naver.com/?viewType=pc\r\n"
					+ "").get();
			Elements list = doc.select(".Nitem_link_menu");
			System.out.println(list.size());
			for (int i = 0; i < list.size(); i++) {
				Element tag = list.get(i);
				System.out.println(i + ": " + tag.text());
			}

			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
