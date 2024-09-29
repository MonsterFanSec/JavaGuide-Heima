import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 有如下文本，请按照要求爬取数据。
 *
 * Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，
 * 因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台
 * 要求:找出里面所有的JavaXX
 */
public class RegexDemo6 {
	public static void main(String[] args) {
		String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，" +
				"因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

		// 1.获取正则表达式的对象
		Pattern p = Pattern.compile("Java\\d{0,2}");

		// 2.获取文本匹配器的对象，拿着m去读取str，找符合p规则的子串
		Matcher m = p.matcher(str);

		// 3.利用循环获取
		while (m.find()) {        // 如果为true，表示当前读取到了符合规则的小串，方法底层还会把小串的索引进行记录
			String s = m.group();    // 按照索引进行截取
			System.out.println(s);    // 截取完之后，把小串打印出来
		}
	}

	// 抽取方法快捷键：command + option + m
	private static void method1(String str) {
		/*
		 * Pattern:表示正则表达式，获取出来的对象则是正则表达式的对象
		 * Matcher: 文本匹配器，作用按照正则表达式的规则去读取字符串，从头开始读取。
		 * 			在大串中去找符合匹配规则的子串。
		 */
		// 获取正则表达式的对象
		Pattern p = Pattern.compile("Java\\d{0,2}");
		/*
		 * 获取文本匹配器的对象
		 * 	m:文本匹配器的对象
		 * 	str:大串
		 * 	p:规则
		 * 	m要在str中找符合p规则的小串
		 */
		Matcher m = p.matcher(str);

		/*
		 * 拿着文本匹配器从头开始读取，寻找是否有满足规则的子串
		 * 	如果没有，方法返回false
		 * 	如果有，返回true。在底层记录子串的起始索引和结束索引+1
		 *
		 * 如，第一次执行m.find()，会匹配到Java，记录索引(0,4)
		 */
		boolean b = m.find();

		/*
		 * 方法底层会根据find方法记录的索引进行字符串的截取
		 * 	substring(起始索引，结束索引);包头不包尾
		 * 	(0,4)但是不包含4索引
		 * 	会把截取的小串进行返回。
		 */
		String s1 = m.group();
		System.out.println(s1);


		/*
		 * 第二次在调用find的时候，会继续读取后面的内容
		 * 读取到第二个满足要求的子串，方法会继续返回true
		 * 并把第二个子串的起始索引和结束索引+1，进行记录
		 */
		b = m.find();

		// 第二次调用group方法的时候，会根据find方法记录的索引再次截取子串
		String s2 = m.group();
		System.out.println(s2);
	}
}
