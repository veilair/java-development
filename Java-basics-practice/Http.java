import org.apache.http.*;
import org.apache.http.client.*;
import org.apache.http.client.fluent.*;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;

import javax.imageio.ImageIO;

public class Http{
        public static HttpClientDemo(String url){
                String str = Request.Get(url).execute().returnContent().asString();
                System.out.println(str);
        }

        public static HttpClientStock(String stockCode, String output){
                String str = Request.Get("http://hq.sinajs.cn/list="+stockCode).execute().returnContent().asString();
                System.out.println(str);

                String chartType = "min"; //daily, weekly, monthly
                String imageURL = "http://image.sinajs.cn/newchart/" + chartType + "/n/" + stockCode + ".gif";

                BufferedImage img = ImageIO.read(new URL(imageURL));
                ImageIO.write(img, "gif", new File(output));
        }


}
