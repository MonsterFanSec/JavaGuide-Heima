/*
 * 练习：先爽一下正则表达式
 * 正则表达式可以校验字符串是否满足一定的规则，并用来校验数据格式的合法性。
 *
 * 需求：假如现在要求校验一个qq号码是否正确。
 * 规则：6位及20位之内，0不能在开头，必须全部是数字。
 *
 *
 * 后续可以利用正则表达式：
 * 	- 校验用户名是否满足规则
 * 	- 校验密码是否满足规则
 * 	- 校验身份证是否满足规则
 * 	- 校验手机是否满足规则
 */
public class RegexDemo1 {
	public static void main(String[] args) {
		String qq = "1234567890";
		// 先使用目前所学知识完成校验需求
		System.out.println(checkQQ(qq));

		// 然后体验一下正则表达式校验
		System.out.println(regCheckQQ(qq));
	}

	/*
	 * 规则:6位及20位之内，日不能在开头，必须全部是数字 。
	 * 核心思想:
	 * 	先把异常数据进行过滤
	 *  下面的就是满足要求的数据了。
	 */
	public static boolean checkQQ(String qq) {
		int len = qq.length();
		if (len < 6 || len > 20) {
			return false;
		}
		// 0不能在开头
		if (qq.startsWith("0")) {
			return false;
		}
		// 必须全部是数字
		for (int i = 0; i < qq.length(); i++) {
			char c = qq.charAt(i);
			if (c < '0' | c > '9') {
				return false;
			}
		}
		return true;
	}

	/* 正则表达式 */
	public static boolean regCheckQQ(String qq) {
		return qq.matches("[1-9]\\d{5,19}");
	}
}
