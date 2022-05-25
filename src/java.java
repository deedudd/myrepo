import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.exec.util.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.util.internal.StringUtil;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class java {
	public static int lengthOfLongestSubstring(String s) {

        int n = s.length();
        int l=0,m=0;
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (checkRepetition(s, i, j)) {
                    res = Math.max(res, j - i + 1);
                    l=i;m=j;
                }
            }
        }
        System.out.println(l+" "+m);
        System.out.println(s.substring(l, m+1));
 
        return res;
    }
 
    private static boolean checkRepetition(String s, int start, int end) {
        int[] chars = new int[128];
 
        for (int i = start; i <= end; i++) {
            char c = s.charAt(i);
            chars[c]++;
            if (chars[c] > 1) {
                return false;
            }
        }
        return true;
    }
   

	public static void main(String[] args) {

		 
		    
		        String s = "Hello";
		       System.out.println(lengthOfLongestSubstring(s));
		    }
	}

